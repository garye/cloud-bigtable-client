package com.google.cloud.bigtable.client;

import com.google.common.collect.ImmutableList;
import com.google.protobuf.ByteString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by garyelliott on 3/31/16.
 * Note: not thread safe
 */
public class Row {
  private final com.google.bigtable.v1.Row protoRow;
  private Map<String, ColumnFamily> columnFamilyMap;

  public Row(com.google.bigtable.v1.Row protoRow) {
    this.protoRow = protoRow;
  }

  public List<ColumnFamily> getColumnFamilies() {
    return ImmutableList.copyOf(columnFamilyMap.values());
  }

  public ByteString getValue(String familyname, ByteString columnQualifier) {
    ColumnFamily columnFamily = getColumnFamily(familyname);
    if (columnFamily == null) {
      return null;
    }

    return columnFamily.getLatestValue(columnQualifier);
  }

  private ColumnFamily getColumnFamily(String name) {
    createFamilyMap();
    return columnFamilyMap.get(name);
  }

  private void createFamilyMap() {
    if (columnFamilyMap == null) {
      // TODO Would storing these in an array and doing a binary
      // search be better? Certainly less garbage...
      columnFamilyMap = new HashMap<>(protoRow.getFamiliesCount());
      for (int i = 0; i < protoRow.getFamiliesCount(); i++) {
        ColumnFamily columnFamily = new ColumnFamily(protoRow.getFamilies(i));
        columnFamilyMap.put(columnFamily.getName(), columnFamily);
      }
    }
  }

}
