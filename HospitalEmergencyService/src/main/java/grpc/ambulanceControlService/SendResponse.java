// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ambulanceControlService.proto

package grpc.ambulanceControlService;

/**
 * Protobuf type {@code AmbulanceControlService.SendResponse}
 */
public  final class SendResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AmbulanceControlService.SendResponse)
    SendResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendResponse.newBuilder() to construct.
  private SendResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendResponse() {
    finalMessage_ = "";
    ambulanceNumber_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            finalMessage_ = s;
            break;
          }
          case 16: {

            ambulanceNumber_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.ambulanceControlService.ambulanceControlServiceImpl.internal_static_AmbulanceControlService_SendResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.ambulanceControlService.ambulanceControlServiceImpl.internal_static_AmbulanceControlService_SendResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.ambulanceControlService.SendResponse.class, grpc.ambulanceControlService.SendResponse.Builder.class);
  }

  public static final int FINALMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object finalMessage_;
  /**
   * <pre>
   *status
   * </pre>
   *
   * <code>string finalMessage = 1;</code>
   */
  public java.lang.String getFinalMessage() {
    java.lang.Object ref = finalMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      finalMessage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *status
   * </pre>
   *
   * <code>string finalMessage = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFinalMessageBytes() {
    java.lang.Object ref = finalMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      finalMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMBULANCENUMBER_FIELD_NUMBER = 2;
  private int ambulanceNumber_;
  /**
   * <pre>
   *ambulance no.
   * </pre>
   *
   * <code>int32 ambulanceNumber = 2;</code>
   */
  public int getAmbulanceNumber() {
    return ambulanceNumber_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFinalMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, finalMessage_);
    }
    if (ambulanceNumber_ != 0) {
      output.writeInt32(2, ambulanceNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFinalMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, finalMessage_);
    }
    if (ambulanceNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ambulanceNumber_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.ambulanceControlService.SendResponse)) {
      return super.equals(obj);
    }
    grpc.ambulanceControlService.SendResponse other = (grpc.ambulanceControlService.SendResponse) obj;

    boolean result = true;
    result = result && getFinalMessage()
        .equals(other.getFinalMessage());
    result = result && (getAmbulanceNumber()
        == other.getAmbulanceNumber());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FINALMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getFinalMessage().hashCode();
    hash = (37 * hash) + AMBULANCENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getAmbulanceNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.ambulanceControlService.SendResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ambulanceControlService.SendResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ambulanceControlService.SendResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ambulanceControlService.SendResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ambulanceControlService.SendResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ambulanceControlService.SendResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ambulanceControlService.SendResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.ambulanceControlService.SendResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.ambulanceControlService.SendResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.ambulanceControlService.SendResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.ambulanceControlService.SendResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.ambulanceControlService.SendResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.ambulanceControlService.SendResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code AmbulanceControlService.SendResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AmbulanceControlService.SendResponse)
      grpc.ambulanceControlService.SendResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.ambulanceControlService.ambulanceControlServiceImpl.internal_static_AmbulanceControlService_SendResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.ambulanceControlService.ambulanceControlServiceImpl.internal_static_AmbulanceControlService_SendResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.ambulanceControlService.SendResponse.class, grpc.ambulanceControlService.SendResponse.Builder.class);
    }

    // Construct using grpc.ambulanceControlService.SendResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      finalMessage_ = "";

      ambulanceNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.ambulanceControlService.ambulanceControlServiceImpl.internal_static_AmbulanceControlService_SendResponse_descriptor;
    }

    @java.lang.Override
    public grpc.ambulanceControlService.SendResponse getDefaultInstanceForType() {
      return grpc.ambulanceControlService.SendResponse.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.ambulanceControlService.SendResponse build() {
      grpc.ambulanceControlService.SendResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.ambulanceControlService.SendResponse buildPartial() {
      grpc.ambulanceControlService.SendResponse result = new grpc.ambulanceControlService.SendResponse(this);
      result.finalMessage_ = finalMessage_;
      result.ambulanceNumber_ = ambulanceNumber_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.ambulanceControlService.SendResponse) {
        return mergeFrom((grpc.ambulanceControlService.SendResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.ambulanceControlService.SendResponse other) {
      if (other == grpc.ambulanceControlService.SendResponse.getDefaultInstance()) return this;
      if (!other.getFinalMessage().isEmpty()) {
        finalMessage_ = other.finalMessage_;
        onChanged();
      }
      if (other.getAmbulanceNumber() != 0) {
        setAmbulanceNumber(other.getAmbulanceNumber());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.ambulanceControlService.SendResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.ambulanceControlService.SendResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object finalMessage_ = "";
    /**
     * <pre>
     *status
     * </pre>
     *
     * <code>string finalMessage = 1;</code>
     */
    public java.lang.String getFinalMessage() {
      java.lang.Object ref = finalMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        finalMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *status
     * </pre>
     *
     * <code>string finalMessage = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFinalMessageBytes() {
      java.lang.Object ref = finalMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        finalMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *status
     * </pre>
     *
     * <code>string finalMessage = 1;</code>
     */
    public Builder setFinalMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      finalMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *status
     * </pre>
     *
     * <code>string finalMessage = 1;</code>
     */
    public Builder clearFinalMessage() {
      
      finalMessage_ = getDefaultInstance().getFinalMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *status
     * </pre>
     *
     * <code>string finalMessage = 1;</code>
     */
    public Builder setFinalMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      finalMessage_ = value;
      onChanged();
      return this;
    }

    private int ambulanceNumber_ ;
    /**
     * <pre>
     *ambulance no.
     * </pre>
     *
     * <code>int32 ambulanceNumber = 2;</code>
     */
    public int getAmbulanceNumber() {
      return ambulanceNumber_;
    }
    /**
     * <pre>
     *ambulance no.
     * </pre>
     *
     * <code>int32 ambulanceNumber = 2;</code>
     */
    public Builder setAmbulanceNumber(int value) {
      
      ambulanceNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ambulance no.
     * </pre>
     *
     * <code>int32 ambulanceNumber = 2;</code>
     */
    public Builder clearAmbulanceNumber() {
      
      ambulanceNumber_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AmbulanceControlService.SendResponse)
  }

  // @@protoc_insertion_point(class_scope:AmbulanceControlService.SendResponse)
  private static final grpc.ambulanceControlService.SendResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.ambulanceControlService.SendResponse();
  }

  public static grpc.ambulanceControlService.SendResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendResponse>
      PARSER = new com.google.protobuf.AbstractParser<SendResponse>() {
    @java.lang.Override
    public SendResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.ambulanceControlService.SendResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
