package com.google.cloud.bigtable.client;

/**
 * Created by garyelliott on 4/1/16.
 */
public class BatchMutator {
  private final String tableName;

  BatchMutator(String tableName) {
    this.tableName = tableName;
  }
}
