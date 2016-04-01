package com.google.cloud.bigtable.client;

import com.google.bigtable.v1.MutateRowRequest;
import com.google.bigtable.v1.MutateRowRequest.Builder;
import com.google.bigtable.v1.Mutation.DeleteFromRow;
import com.google.protobuf.ByteString;

/**
 * Created by garyelliott on 4/1/16.
 */
public class Mutation {
  private final ByteString rowKey;
  private final MutateRowRequest.Builder builder;
  private final long currentTimestampMicros;

  public Mutation(ByteString rowKey) {
    this.rowKey = rowKey;
    this.builder = MutateRowRequest.newBuilder().setRowKey(rowKey);
    this.currentTimestampMicros = System.currentTimeMillis() * 1000;
  }

  public MutateRowRequest toProto() {
    return builder.build();
  }

  public class FamilyMutation {
    private final String familyName;

    public FamilyMutation(String familyName) {
      this.familyName = familyName;
    }

    public FamilyMutation set(ByteString col, ByteString value) {
      com.google.bigtable.v1.Mutation.Builder mutBuilder = builder.addMutationsBuilder();
      mutBuilder.getSetCellBuilder()
          .setFamilyName(familyName)
          .setColumnQualifier(col)
          .setTimestampMicros(currentTimestampMicros)
          .setValue(value);
      return this;
    }

    public FamilyMutation deleteCellsInColumn(ByteString col) {
      com.google.bigtable.v1.Mutation.Builder mutBuilder = builder.addMutationsBuilder();
      mutBuilder.getDeleteFromColumnBuilder().setFamilyName(familyName).setColumnQualifier(col);

      return this;
    }

    public void deleteRow() {
      com.google.bigtable.v1.Mutation.Builder mutBuilder = builder.addMutationsBuilder();
      mutBuilder.setDeleteFromRow(DeleteFromRow.getDefaultInstance());
    }
  }


}
