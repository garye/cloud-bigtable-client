package com.google.cloud.bigtable.client;

import com.google.cloud.bigtable.grpc.scanner.ResultScanner;
import com.google.common.collect.AbstractIterator;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by garyelliott on 3/31/16.
 */
public class RowScanner implements Iterable<Row> {

  private final ResultScanner<com.google.bigtable.v1.Row> resultScanner;

  public RowScanner(ResultScanner<com.google.bigtable.v1.Row> resultScanner) {
    this.resultScanner = resultScanner;
  }

  @Override
  public Iterator<Row> iterator() {
    return new AbstractIterator<Row>() {
      @Override
      protected Row computeNext() {
        try {
          com.google.bigtable.v1.Row next = resultScanner.next();
          if (next == null) {
            return endOfData();
          } else {
            return new Row(next);
          }
        } catch (IOException e) {
          throw new RuntimeException("Exception during row scanning", e);
        }
      }
    };
  }
}
