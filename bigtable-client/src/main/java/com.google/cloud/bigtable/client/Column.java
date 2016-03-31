package com.google.cloud.bigtable.client;

import com.google.protobuf.ByteString;

/**
 * Created by garyelliott on 3/31/16.
 */
public class Column {
  private final com.google.bigtable.v1.Column protoColumn;

  public Column(com.google.bigtable.v1.Column protoColumn) {
    this.protoColumn = protoColumn;
  }

  public ByteString getLatestValue() {
    return protoColumn.getCells(0).getValue();
  }

  public Cell getLatestCell() {
    return new Cell(protoColumn.getCells(0));
  }
}
