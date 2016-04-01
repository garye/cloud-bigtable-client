package com.google.cloud.bigtable.client;

import com.google.protobuf.ByteString;

/**
 * Created by garyelliott on 4/1/16.
 */
public class RowRange {
  private final ByteString startKey;
  private final ByteString endKey;

  public RowRange(ByteString startKey, ByteString endKey) {
    this.startKey = startKey;
    this.endKey = endKey;
  }

  public static RowRange infinite(ByteString startKey) {
    return new RowRange(startKey, null);
  }

  public com.google.bigtable.v1.RowRange toProto() {
    return com.google.bigtable.v1.RowRange.newBuilder()
        .setStartKey(startKey)
        .setEndKey(endKey)
        .build();
  }
}
