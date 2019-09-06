// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: connect.proto

package bcosServer;

/**
 * <pre>
 *学分查询
 * </pre>
 *
 * Protobuf type {@code AllCreditQueryInput}
 */
public  final class AllCreditQueryInput extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:AllCreditQueryInput)
    AllCreditQueryInputOrBuilder {
  // Use AllCreditQueryInput.newBuilder() to construct.
  private AllCreditQueryInput(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AllCreditQueryInput() {
    stuID_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AllCreditQueryInput(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
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
          case 8: {

            stuID_ = input.readUInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return bcosServer.Connect.internal_static_AllCreditQueryInput_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bcosServer.Connect.internal_static_AllCreditQueryInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bcosServer.AllCreditQueryInput.class, bcosServer.AllCreditQueryInput.Builder.class);
  }

  public static final int STUID_FIELD_NUMBER = 1;
  private long stuID_;
  /**
   * <code>optional uint64 StuID = 1;</code>
   */
  public long getStuID() {
    return stuID_;
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
    if (stuID_ != 0L) {
      output.writeUInt64(1, stuID_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stuID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, stuID_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof bcosServer.AllCreditQueryInput)) {
      return super.equals(obj);
    }
    bcosServer.AllCreditQueryInput other = (bcosServer.AllCreditQueryInput) obj;

    boolean result = true;
    result = result && (getStuID()
        == other.getStuID());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + STUID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStuID());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bcosServer.AllCreditQueryInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bcosServer.AllCreditQueryInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bcosServer.AllCreditQueryInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bcosServer.AllCreditQueryInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bcosServer.AllCreditQueryInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static bcosServer.AllCreditQueryInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bcosServer.AllCreditQueryInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bcosServer.AllCreditQueryInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bcosServer.AllCreditQueryInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static bcosServer.AllCreditQueryInput parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(bcosServer.AllCreditQueryInput prototype) {
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
   * <pre>
   *学分查询
   * </pre>
   *
   * Protobuf type {@code AllCreditQueryInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AllCreditQueryInput)
      bcosServer.AllCreditQueryInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bcosServer.Connect.internal_static_AllCreditQueryInput_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bcosServer.Connect.internal_static_AllCreditQueryInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bcosServer.AllCreditQueryInput.class, bcosServer.AllCreditQueryInput.Builder.class);
    }

    // Construct using bcosServer.AllCreditQueryInput.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      stuID_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bcosServer.Connect.internal_static_AllCreditQueryInput_descriptor;
    }

    public bcosServer.AllCreditQueryInput getDefaultInstanceForType() {
      return bcosServer.AllCreditQueryInput.getDefaultInstance();
    }

    public bcosServer.AllCreditQueryInput build() {
      bcosServer.AllCreditQueryInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public bcosServer.AllCreditQueryInput buildPartial() {
      bcosServer.AllCreditQueryInput result = new bcosServer.AllCreditQueryInput(this);
      result.stuID_ = stuID_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof bcosServer.AllCreditQueryInput) {
        return mergeFrom((bcosServer.AllCreditQueryInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bcosServer.AllCreditQueryInput other) {
      if (other == bcosServer.AllCreditQueryInput.getDefaultInstance()) return this;
      if (other.getStuID() != 0L) {
        setStuID(other.getStuID());
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
      bcosServer.AllCreditQueryInput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (bcosServer.AllCreditQueryInput) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long stuID_ ;
    /**
     * <code>optional uint64 StuID = 1;</code>
     */
    public long getStuID() {
      return stuID_;
    }
    /**
     * <code>optional uint64 StuID = 1;</code>
     */
    public Builder setStuID(long value) {
      
      stuID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 StuID = 1;</code>
     */
    public Builder clearStuID() {
      
      stuID_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:AllCreditQueryInput)
  }

  // @@protoc_insertion_point(class_scope:AllCreditQueryInput)
  private static final bcosServer.AllCreditQueryInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bcosServer.AllCreditQueryInput();
  }

  public static bcosServer.AllCreditQueryInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllCreditQueryInput>
      PARSER = new com.google.protobuf.AbstractParser<AllCreditQueryInput>() {
    public AllCreditQueryInput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AllCreditQueryInput(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllCreditQueryInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllCreditQueryInput> getParserForType() {
    return PARSER;
  }

  public bcosServer.AllCreditQueryInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
