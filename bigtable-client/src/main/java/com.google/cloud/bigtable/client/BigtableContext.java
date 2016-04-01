package com.google.cloud.bigtable.client;

import com.google.cloud.bigtable.config.BigtableOptions;
import com.google.cloud.bigtable.grpc.BigtableSession;
import com.google.cloud.bigtable.grpc.BigtableSessionSharedThreadPools;
import com.google.cloud.bigtable.grpc.async.AsyncExecutor;
import com.google.cloud.bigtable.grpc.async.BulkMutation;
import com.google.cloud.bigtable.grpc.async.ResourceLimiter;
import com.google.cloud.bigtable.grpc.async.RpcThrottler;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by garyelliott on 3/31/16.
 */
public class BigtableContext implements Closeable {

  private static ResourceLimiter resourceLimiter;

  private final BigtableOptions options;
  private final BigtableSession session;

  private final Client client;
  private final TableAdminClient tableAdminClient;

  public BigtableContext(BigtableOptions options) throws IOException {
    initResourceLimiter();

    this.options = options;
    this.session = new BigtableSession(options);

    this.client = new Client(session.getDataClient(), resourceLimiter, options);
    this.tableAdminClient = new TableAdminClient(session.getTableAdminClient(), options);


  }

  protected static synchronized void initResourceLimiter() {
    if (resourceLimiter == null) {
      // TODO Get the actual config
      resourceLimiter = new ResourceLimiter(
          AsyncExecutor.ASYNC_MUTATOR_MAX_MEMORY_DEFAULT,
          AsyncExecutor.MAX_INFLIGHT_RPCS_DEFAULT);
    }
  }

  BulkMutation newBulkMutation(String tableName) {
    return new BulkMutation(
        tableName,
        new AsyncExecutor(session.getDataClient(), new RpcThrottler(resourceLimiter)),
        options.getRetryOptions(),
        BigtableSessionSharedThreadPools.getInstance().getRetryExecutor(),
        options.getBulkMaxRowKeyCount(),
        options.getBulkMaxRequestSize());
  }

  @Override
  public void close() throws IOException {
    session.close();
  }
}
