package com.google.cloud.bigtable.client;

import com.google.cloud.bigtable.config.BigtableOptions;
import com.google.cloud.bigtable.grpc.BigtableSession;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by garyelliott on 3/31/16.
 */
public class BigtableContext implements Closeable {

  private final BigtableOptions options;
  private final BigtableSession session;

  private final Client client;
  private final TableAdminClient tableAdminClient;

  public BigtableContext(BigtableOptions options) throws IOException {
    this.options = options;
    this.session = new BigtableSession(options);

    this.client = new Client(session.getDataClient(), options);
    this.tableAdminClient = new TableAdminClient(session.getTableAdminClient(), options);
  }

  @Override
  public void close() throws IOException {
    session.close();
  }
}
