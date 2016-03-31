package com.google.cloud.bigtable.client;

import com.google.bigtable.v1.ReadRowsRequest;
import com.google.bigtable.v1.ReadRowsRequest.Builder;
import com.google.bigtable.v1.RowSet;
import com.google.cloud.bigtable.grpc.BigtableDataClient;
import com.google.cloud.bigtable.grpc.scanner.ResultScanner;
import com.google.protobuf.ByteString;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by garyelliott on 3/31/16.
 */
public class Table {

  private final String name;
  private final BigtableDataClient dataClient;

  public Table(String name, BigtableDataClient client) {
    this.name = name;
    this.dataClient = client;
  }

  public String getName() {
    return name;
  }

  public Row readRow(ByteString rowKey, ReadOptions readOptions) throws IOException {
    Builder builder = ReadRowsRequest.newBuilder().setRowKey(rowKey);
    ResultScanner<com.google.bigtable.v1.Row> scanner = dataClient.readRows(builder.build());
    com.google.bigtable.v1.Row row = scanner.next();
    return row != null ? new Row(row) : null;
  }

  public List<Row> readRows(List<ByteString> rowKeys, ReadOptions readOptions) throws IOException {
    RowSet.Builder rowSetBuilder = RowSet.newBuilder().addAllRowKeys(rowKeys);
    Builder builder = ReadRowsRequest.newBuilder().setRowSet(rowSetBuilder);

    List<Row> results = new ArrayList<>(rowKeys.size());
    ResultScanner<com.google.bigtable.v1.Row> scanner = dataClient.readRows(builder.build());
    com.google.bigtable.v1.Row row;
    while ((row = scanner.next()) != null) {
      results.add(new Row(row));
    }

    return results;
  }

  public


}
