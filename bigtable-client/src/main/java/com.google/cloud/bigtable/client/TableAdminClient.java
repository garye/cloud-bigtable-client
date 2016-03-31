package com.google.cloud.bigtable.client;

import com.google.cloud.bigtable.config.BigtableOptions;
import com.google.cloud.bigtable.grpc.BigtableTableAdminClient;

/**
 * Created by garyelliott on 3/31/16.
 */
public class TableAdminClient {
  private final BigtableTableAdminClient client;
  private final BigtableOptions options;

  public TableAdminClient(BigtableTableAdminClient client, BigtableOptions options) {
    this.client = client;
    this.options = options;
  }
}
