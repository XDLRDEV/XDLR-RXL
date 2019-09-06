// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: connect.proto

package bcosServer;

/**
 * <pre>
 *学生活动查询
 * </pre>
 *
 * Protobuf type {@code StuActQueryInput}
 */
public  final class StuActQueryInput extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:StuActQueryInput)
    StuActQueryInputOrBuilder {
  // Use StuActQueryInput.newBuilder() to construct.
  private StuActQueryInput(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StuActQueryInput() {
    stuID_ = 0L;
    actID_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StuActQueryInput(
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
          case 16: {

            actID_ = input.readUInt32();
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
    return bcosServer.Connect.internal_static_StuActQueryInput_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return bcosServer.Connect.internal_static_StuActQueryInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            bcosServer.StuActQueryInput.class, bcosServer.StuActQueryInput.Builder.class);
  }

  public static final int STUID_FIELD_NUMBER = 1;
  private long stuID_;
  /**
   * <code>optional uint64 StuID = 1;</code>
   */
  public long getStuID() {
    return stuID_;
  }

  public static final int ACTID_FIELD_NUMBER = 2;
  private int actID_;
  /**
   * <code>optional uint32 ActID = 2;</code>
   */
  public int getActID() {
    return actID_;
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
    if (actID_ != 0) {
      output.writeUInt32(2, actID_);
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
    if (actID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, actID_);
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
    if (!(obj instanceof bcosServer.StuActQueryInput)) {
      return super.equals(obj);
    }
    bcosServer.StuActQueryInput other = (bcosServer.StuActQueryInput) obj;

    boolean result = true;
    result = result && (getStuID()
        == other.getStuID());
    result = result && (getActID()
        == other.getActID());
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
    hash = (37 * hash) + ACTID_FIELD_NUMBER;
    hash = (53 * hash) + getActID();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static bcosServer.StuActQueryInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bcosServer.StuActQueryInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bcosServer.StuActQueryInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static bcosServer.StuActQueryInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static bcosServer.StuActQueryInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static bcosServer.StuActQueryInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static bcosServer.StuActQueryInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static bcosServer.StuActQueryInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static bcosServer.StuActQueryInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static bcosServer.StuActQueryInput parseFrom(
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
  public static Builder newBuilder(bcosServer.StuActQueryInput prototype) {
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
   *学生活动查询
   * </pre>
   *
   * Protobuf type {@code StuActQueryInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:StuActQueryInput)
      bcosServer.StuActQueryInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bcosServer.Connect.internal_static_StuActQueryInput_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bcosServer.Connect.internal_static_StuActQueryInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bcosServer.StuActQueryInput.class, bcosServer.StuActQueryInput.Builder.class);
    }

    // Construct using bcosServer.StuActQueryInput.newBuilder()
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

      actID_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return bcosServer.Connect.internal_static_StuActQueryInput_descriptor;
    }

    public bcosServer.StuActQueryInput getDefaultInstanceForType() {
      return bcosServer.StuActQueryInput.getDefaultInstance();
    }

    public bcosServer.StuActQueryInput build() {
      bcosServer.StuActQueryInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public bcosServer.StuActQueryInput buildPartial() {
      bcosServer.StuActQueryInput result = new bcosServer.StuActQueryInput(this);
      result.stuID_ = stuID_;
      result.actID_ = actID_;
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
      if (other instanceof bcosServer.StuActQueryInput) {
        return mergeFrom((bcosServer.StuActQueryInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(bcosServer.StuActQueryInput other) {
      if (other == bcosServer.StuActQueryInput.getDefaultInstance()) return this;
      if (other.getStuID() != 0L) {
        setStuID(other.getStuID());
      }
      if (other.getActID() != 0) {
        setActID(other.getActID());
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
      bcosServer.StuActQueryInput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (bcosServer.StuActQueryInput) e.getUnfinishedMessage();
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

    private int actID_ ;
    /**
     * <code>optional uint32 ActID = 2;</code>
     */
    public int getActID() {
      return actID_;
    }
    /**
     * <code>optional uint32 ActID = 2;</code>
     */
    public Builder setActID(int value) {
      
      actID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 ActID = 2;</code>
     */
    public Builder clearActID() {
      
      actID_ = 0;
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


    // @@protoc_insertion_point(builder_scope:StuActQueryInput)
  }

  // @@protoc_insertion_point(class_scope:StuActQueryInput)
  private static final bcosServer.StuActQueryInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new bcosServer.StuActQueryInput();
  }

  public static bcosServer.StuActQueryInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StuActQueryInput>
      PARSER = new com.google.protobuf.AbstractParser<StuActQueryInput>() {
    public StuActQueryInput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StuActQueryInput(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StuActQueryInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StuActQueryInput> getParserForType() {
    return PARSER;
  }

  public bcosServer.StuActQueryInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
