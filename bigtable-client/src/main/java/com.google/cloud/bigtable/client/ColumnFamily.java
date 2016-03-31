package com.google.cloud.bigtable.client;

import com.google.protobuf.ByteString;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by garyelliott on 3/31/16.
 */
public class ColumnFamily {
  private final com.google.bigtable.v1.Family family;

  // TEMP
  private Map<ByteString, Column> columnMap = new HashMap<>();

  public ColumnFamily(com.google.bigtable.v1.Family family) {
    this.family = family;

    // Temp
    for (com.google.bigtable.v1.Column col : family.getColumnsList()) {
      columnMap.put(col.getQualifier(), new Column(col));
    }
  }

  public String getName() {
    return family.getName();
  }

  public ByteString getLatestValue(ByteString columnQualifier) {
    Column col = columnMap.get(columnQualifier);
    if (col == null) {
      return null;
    }

    return col.getLatestValue();
  }
}
