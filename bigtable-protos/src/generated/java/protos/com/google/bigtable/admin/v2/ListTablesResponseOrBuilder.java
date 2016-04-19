// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

public interface ListTablesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ListTablesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.bigtable.admin.v2.Table tables = 1;</code>
   *
   * <pre>
   * The tables present in the requested cluster.
   * </pre>
   */
  java.util.List<com.google.bigtable.admin.v2.Table> 
      getTablesList();
  /**
   * <code>repeated .google.bigtable.admin.v2.Table tables = 1;</code>
   *
   * <pre>
   * The tables present in the requested cluster.
   * </pre>
   */
  com.google.bigtable.admin.v2.Table getTables(int index);
  /**
   * <code>repeated .google.bigtable.admin.v2.Table tables = 1;</code>
   *
   * <pre>
   * The tables present in the requested cluster.
   * </pre>
   */
  int getTablesCount();
  /**
   * <code>repeated .google.bigtable.admin.v2.Table tables = 1;</code>
   *
   * <pre>
   * The tables present in the requested cluster.
   * </pre>
   */
  java.util.List<? extends com.google.bigtable.admin.v2.TableOrBuilder> 
      getTablesOrBuilderList();
  /**
   * <code>repeated .google.bigtable.admin.v2.Table tables = 1;</code>
   *
   * <pre>
   * The tables present in the requested cluster.
   * </pre>
   */
  com.google.bigtable.admin.v2.TableOrBuilder getTablesOrBuilder(
      int index);

  /**
   * <code>optional string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>optional string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
