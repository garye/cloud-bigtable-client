package com.google.cloud.bigtable.client;

/**
 * Created by garyelliott on 3/31/16.
 */
public class ReadOptions {
  private final int rowLimit;

  public ReadOptions(int rowLimit) {
    this.rowLimit = rowLimit;
  }
}
