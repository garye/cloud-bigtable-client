package com.google.cloud.bigtable.client;

import com.google.protobuf.ByteString;

/**
 * Created by garyelliott on 3/31/16.
 */
public class Cell {
  private final com.google.bigtable.v1.Cell protoCell;

  public Cell(com.google.bigtable.v1.Cell protoCell) {
    this.protoCell = protoCell;
  }

  public ByteString getValue() {
    return protoCell.getValue();
  }

  public long getTimestampMicros() {
    return protoCell.getTimestampMicros();
  }
}
