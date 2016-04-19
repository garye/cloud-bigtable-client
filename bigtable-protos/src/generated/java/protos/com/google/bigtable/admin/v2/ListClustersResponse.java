// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

/**
 * Protobuf type {@code google.bigtable.admin.v2.ListClustersResponse}
 *
 * <pre>
 * Response message for BigtableInstanceAdmin.ListClusters.
 * </pre>
 */
public  final class ListClustersResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.ListClustersResponse)
    ListClustersResponseOrBuilder {
  // Use ListClustersResponse.newBuilder() to construct.
  private ListClustersResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListClustersResponse() {
    clusters_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListClustersResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              clusters_ = new java.util.ArrayList<com.google.bigtable.admin.v2.Cluster>();
              mutable_bitField0_ |= 0x00000001;
            }
            clusters_.add(input.readMessage(com.google.bigtable.admin.v2.Cluster.parser(), extensionRegistry));
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        clusters_ = java.util.Collections.unmodifiableList(clusters_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_ListClustersResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_ListClustersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.ListClustersResponse.class, com.google.bigtable.admin.v2.ListClustersResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CLUSTERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.bigtable.admin.v2.Cluster> clusters_;
  /**
   * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
   */
  public java.util.List<com.google.bigtable.admin.v2.Cluster> getClustersList() {
    return clusters_;
  }
  /**
   * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
   */
  public java.util.List<? extends com.google.bigtable.admin.v2.ClusterOrBuilder> 
      getClustersOrBuilderList() {
    return clusters_;
  }
  /**
   * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
   */
  public int getClustersCount() {
    return clusters_.size();
  }
  /**
   * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
   */
  public com.google.bigtable.admin.v2.Cluster getClusters(int index) {
    return clusters_.get(index);
  }
  /**
   * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
   */
  public com.google.bigtable.admin.v2.ClusterOrBuilder getClustersOrBuilder(
      int index) {
    return clusters_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>optional string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>optional string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < clusters_.size(); i++) {
      output.writeMessage(1, clusters_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, nextPageToken_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < clusters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, clusters_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nextPageToken_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.admin.v2.ListClustersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.ListClustersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.ListClustersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.ListClustersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.ListClustersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.v2.ListClustersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.ListClustersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.bigtable.admin.v2.ListClustersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.ListClustersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.v2.ListClustersResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.admin.v2.ListClustersResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.bigtable.admin.v2.ListClustersResponse}
   *
   * <pre>
   * Response message for BigtableInstanceAdmin.ListClusters.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.ListClustersResponse)
      com.google.bigtable.admin.v2.ListClustersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_ListClustersResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_ListClustersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.ListClustersResponse.class, com.google.bigtable.admin.v2.ListClustersResponse.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.ListClustersResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getClustersFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (clustersBuilder_ == null) {
        clusters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        clustersBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_ListClustersResponse_descriptor;
    }

    public com.google.bigtable.admin.v2.ListClustersResponse getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.ListClustersResponse.getDefaultInstance();
    }

    public com.google.bigtable.admin.v2.ListClustersResponse build() {
      com.google.bigtable.admin.v2.ListClustersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.v2.ListClustersResponse buildPartial() {
      com.google.bigtable.admin.v2.ListClustersResponse result = new com.google.bigtable.admin.v2.ListClustersResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (clustersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          clusters_ = java.util.Collections.unmodifiableList(clusters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.clusters_ = clusters_;
      } else {
        result.clusters_ = clustersBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.ListClustersResponse) {
        return mergeFrom((com.google.bigtable.admin.v2.ListClustersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.ListClustersResponse other) {
      if (other == com.google.bigtable.admin.v2.ListClustersResponse.getDefaultInstance()) return this;
      if (clustersBuilder_ == null) {
        if (!other.clusters_.isEmpty()) {
          if (clusters_.isEmpty()) {
            clusters_ = other.clusters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClustersIsMutable();
            clusters_.addAll(other.clusters_);
          }
          onChanged();
        }
      } else {
        if (!other.clusters_.isEmpty()) {
          if (clustersBuilder_.isEmpty()) {
            clustersBuilder_.dispose();
            clustersBuilder_ = null;
            clusters_ = other.clusters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            clustersBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getClustersFieldBuilder() : null;
          } else {
            clustersBuilder_.addAllMessages(other.clusters_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.v2.ListClustersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.v2.ListClustersResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.bigtable.admin.v2.Cluster> clusters_ =
      java.util.Collections.emptyList();
    private void ensureClustersIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        clusters_ = new java.util.ArrayList<com.google.bigtable.admin.v2.Cluster>(clusters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.bigtable.admin.v2.Cluster, com.google.bigtable.admin.v2.Cluster.Builder, com.google.bigtable.admin.v2.ClusterOrBuilder> clustersBuilder_;

    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public java.util.List<com.google.bigtable.admin.v2.Cluster> getClustersList() {
      if (clustersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(clusters_);
      } else {
        return clustersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public int getClustersCount() {
      if (clustersBuilder_ == null) {
        return clusters_.size();
      } else {
        return clustersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public com.google.bigtable.admin.v2.Cluster getClusters(int index) {
      if (clustersBuilder_ == null) {
        return clusters_.get(index);
      } else {
        return clustersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public Builder setClusters(
        int index, com.google.bigtable.admin.v2.Cluster value) {
      if (clustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClustersIsMutable();
        clusters_.set(index, value);
        onChanged();
      } else {
        clustersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public Builder setClusters(
        int index, com.google.bigtable.admin.v2.Cluster.Builder builderForValue) {
      if (clustersBuilder_ == null) {
        ensureClustersIsMutable();
        clusters_.set(index, builderForValue.build());
        onChanged();
      } else {
        clustersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public Builder addClusters(com.google.bigtable.admin.v2.Cluster value) {
      if (clustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClustersIsMutable();
        clusters_.add(value);
        onChanged();
      } else {
        clustersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public Builder addClusters(
        int index, com.google.bigtable.admin.v2.Cluster value) {
      if (clustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClustersIsMutable();
        clusters_.add(index, value);
        onChanged();
      } else {
        clustersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public Builder addClusters(
        com.google.bigtable.admin.v2.Cluster.Builder builderForValue) {
      if (clustersBuilder_ == null) {
        ensureClustersIsMutable();
        clusters_.add(builderForValue.build());
        onChanged();
      } else {
        clustersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public Builder addClusters(
        int index, com.google.bigtable.admin.v2.Cluster.Builder builderForValue) {
      if (clustersBuilder_ == null) {
        ensureClustersIsMutable();
        clusters_.add(index, builderForValue.build());
        onChanged();
      } else {
        clustersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public Builder addAllClusters(
        java.lang.Iterable<? extends com.google.bigtable.admin.v2.Cluster> values) {
      if (clustersBuilder_ == null) {
        ensureClustersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, clusters_);
        onChanged();
      } else {
        clustersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public Builder clearClusters() {
      if (clustersBuilder_ == null) {
        clusters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        clustersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public Builder removeClusters(int index) {
      if (clustersBuilder_ == null) {
        ensureClustersIsMutable();
        clusters_.remove(index);
        onChanged();
      } else {
        clustersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public com.google.bigtable.admin.v2.Cluster.Builder getClustersBuilder(
        int index) {
      return getClustersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public com.google.bigtable.admin.v2.ClusterOrBuilder getClustersOrBuilder(
        int index) {
      if (clustersBuilder_ == null) {
        return clusters_.get(index);  } else {
        return clustersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public java.util.List<? extends com.google.bigtable.admin.v2.ClusterOrBuilder> 
         getClustersOrBuilderList() {
      if (clustersBuilder_ != null) {
        return clustersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(clusters_);
      }
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public com.google.bigtable.admin.v2.Cluster.Builder addClustersBuilder() {
      return getClustersFieldBuilder().addBuilder(
          com.google.bigtable.admin.v2.Cluster.getDefaultInstance());
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public com.google.bigtable.admin.v2.Cluster.Builder addClustersBuilder(
        int index) {
      return getClustersFieldBuilder().addBuilder(
          index, com.google.bigtable.admin.v2.Cluster.getDefaultInstance());
    }
    /**
     * <code>repeated .google.bigtable.admin.v2.Cluster clusters = 1;</code>
     */
    public java.util.List<com.google.bigtable.admin.v2.Cluster.Builder> 
         getClustersBuilderList() {
      return getClustersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.bigtable.admin.v2.Cluster, com.google.bigtable.admin.v2.Cluster.Builder, com.google.bigtable.admin.v2.ClusterOrBuilder> 
        getClustersFieldBuilder() {
      if (clustersBuilder_ == null) {
        clustersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.bigtable.admin.v2.Cluster, com.google.bigtable.admin.v2.Cluster.Builder, com.google.bigtable.admin.v2.ClusterOrBuilder>(
                clusters_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        clusters_ = null;
      }
      return clustersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>optional string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.ListClustersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.ListClustersResponse)
  private static final com.google.bigtable.admin.v2.ListClustersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.ListClustersResponse();
  }

  public static com.google.bigtable.admin.v2.ListClustersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListClustersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListClustersResponse>() {
    public ListClustersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ListClustersResponse(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<ListClustersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListClustersResponse> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.admin.v2.ListClustersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

