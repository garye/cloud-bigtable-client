package com.google.cloud.bigtable.client;

import com.google.cloud.bigtable.config.BigtableOptions;
import com.google.cloud.bigtable.grpc.BigtableDataClient;

/**
 * Created by garyelliott on 3/31/16.
 */
public class Client {
  private final BigtableDataClient dataClient;
  private final BigtableOptions options;

  public Client(BigtableDataClient dataClient, BigtableOptions options) {
    this.dataClient = dataClient;
    this.options = options;
  }

  public Table openTable(String tableName) {
    return new Table(tableName, dataClient);
  }


}
