// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: complex_types.proto

package org.example.grpc.complex_types;

/**
 * Protobuf type {@code complex_types.Cars}
 */
public final class Cars extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:complex_types.Cars)
    CarsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Cars.newBuilder() to construct.
  private Cars(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Cars() {
    cars_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Cars();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.grpc.complex_types.ComplexTypes.internal_static_complex_types_Cars_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.grpc.complex_types.ComplexTypes.internal_static_complex_types_Cars_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.grpc.complex_types.Cars.class, org.example.grpc.complex_types.Cars.Builder.class);
  }

  public static final int CARS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.example.grpc.complex_types.Car> cars_;
  /**
   * <code>repeated .complex_types.Car cars = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.example.grpc.complex_types.Car> getCarsList() {
    return cars_;
  }
  /**
   * <code>repeated .complex_types.Car cars = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.example.grpc.complex_types.CarOrBuilder> 
      getCarsOrBuilderList() {
    return cars_;
  }
  /**
   * <code>repeated .complex_types.Car cars = 1;</code>
   */
  @java.lang.Override
  public int getCarsCount() {
    return cars_.size();
  }
  /**
   * <code>repeated .complex_types.Car cars = 1;</code>
   */
  @java.lang.Override
  public org.example.grpc.complex_types.Car getCars(int index) {
    return cars_.get(index);
  }
  /**
   * <code>repeated .complex_types.Car cars = 1;</code>
   */
  @java.lang.Override
  public org.example.grpc.complex_types.CarOrBuilder getCarsOrBuilder(
      int index) {
    return cars_.get(index);
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
    for (int i = 0; i < cars_.size(); i++) {
      output.writeMessage(1, cars_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cars_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cars_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.example.grpc.complex_types.Cars)) {
      return super.equals(obj);
    }
    org.example.grpc.complex_types.Cars other = (org.example.grpc.complex_types.Cars) obj;

    if (!getCarsList()
        .equals(other.getCarsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCarsCount() > 0) {
      hash = (37 * hash) + CARS_FIELD_NUMBER;
      hash = (53 * hash) + getCarsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.grpc.complex_types.Cars parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.grpc.complex_types.Cars parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.grpc.complex_types.Cars parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.grpc.complex_types.Cars parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.grpc.complex_types.Cars parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.grpc.complex_types.Cars parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.grpc.complex_types.Cars parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.grpc.complex_types.Cars parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.example.grpc.complex_types.Cars parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.example.grpc.complex_types.Cars parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.grpc.complex_types.Cars parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.grpc.complex_types.Cars parseFrom(
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
  public static Builder newBuilder(org.example.grpc.complex_types.Cars prototype) {
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
   * Protobuf type {@code complex_types.Cars}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:complex_types.Cars)
      org.example.grpc.complex_types.CarsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.grpc.complex_types.ComplexTypes.internal_static_complex_types_Cars_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.grpc.complex_types.ComplexTypes.internal_static_complex_types_Cars_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.grpc.complex_types.Cars.class, org.example.grpc.complex_types.Cars.Builder.class);
    }

    // Construct using org.example.grpc.complex_types.Cars.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (carsBuilder_ == null) {
        cars_ = java.util.Collections.emptyList();
      } else {
        cars_ = null;
        carsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.grpc.complex_types.ComplexTypes.internal_static_complex_types_Cars_descriptor;
    }

    @java.lang.Override
    public org.example.grpc.complex_types.Cars getDefaultInstanceForType() {
      return org.example.grpc.complex_types.Cars.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.grpc.complex_types.Cars build() {
      org.example.grpc.complex_types.Cars result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.grpc.complex_types.Cars buildPartial() {
      org.example.grpc.complex_types.Cars result = new org.example.grpc.complex_types.Cars(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.example.grpc.complex_types.Cars result) {
      if (carsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cars_ = java.util.Collections.unmodifiableList(cars_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cars_ = cars_;
      } else {
        result.cars_ = carsBuilder_.build();
      }
    }

    private void buildPartial0(org.example.grpc.complex_types.Cars result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.grpc.complex_types.Cars) {
        return mergeFrom((org.example.grpc.complex_types.Cars)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.grpc.complex_types.Cars other) {
      if (other == org.example.grpc.complex_types.Cars.getDefaultInstance()) return this;
      if (carsBuilder_ == null) {
        if (!other.cars_.isEmpty()) {
          if (cars_.isEmpty()) {
            cars_ = other.cars_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCarsIsMutable();
            cars_.addAll(other.cars_);
          }
          onChanged();
        }
      } else {
        if (!other.cars_.isEmpty()) {
          if (carsBuilder_.isEmpty()) {
            carsBuilder_.dispose();
            carsBuilder_ = null;
            cars_ = other.cars_;
            bitField0_ = (bitField0_ & ~0x00000001);
            carsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCarsFieldBuilder() : null;
          } else {
            carsBuilder_.addAllMessages(other.cars_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              org.example.grpc.complex_types.Car m =
                  input.readMessage(
                      org.example.grpc.complex_types.Car.parser(),
                      extensionRegistry);
              if (carsBuilder_ == null) {
                ensureCarsIsMutable();
                cars_.add(m);
              } else {
                carsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<org.example.grpc.complex_types.Car> cars_ =
      java.util.Collections.emptyList();
    private void ensureCarsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cars_ = new java.util.ArrayList<org.example.grpc.complex_types.Car>(cars_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.grpc.complex_types.Car, org.example.grpc.complex_types.Car.Builder, org.example.grpc.complex_types.CarOrBuilder> carsBuilder_;

    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public java.util.List<org.example.grpc.complex_types.Car> getCarsList() {
      if (carsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cars_);
      } else {
        return carsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public int getCarsCount() {
      if (carsBuilder_ == null) {
        return cars_.size();
      } else {
        return carsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public org.example.grpc.complex_types.Car getCars(int index) {
      if (carsBuilder_ == null) {
        return cars_.get(index);
      } else {
        return carsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public Builder setCars(
        int index, org.example.grpc.complex_types.Car value) {
      if (carsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarsIsMutable();
        cars_.set(index, value);
        onChanged();
      } else {
        carsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public Builder setCars(
        int index, org.example.grpc.complex_types.Car.Builder builderForValue) {
      if (carsBuilder_ == null) {
        ensureCarsIsMutable();
        cars_.set(index, builderForValue.build());
        onChanged();
      } else {
        carsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public Builder addCars(org.example.grpc.complex_types.Car value) {
      if (carsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarsIsMutable();
        cars_.add(value);
        onChanged();
      } else {
        carsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public Builder addCars(
        int index, org.example.grpc.complex_types.Car value) {
      if (carsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarsIsMutable();
        cars_.add(index, value);
        onChanged();
      } else {
        carsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public Builder addCars(
        org.example.grpc.complex_types.Car.Builder builderForValue) {
      if (carsBuilder_ == null) {
        ensureCarsIsMutable();
        cars_.add(builderForValue.build());
        onChanged();
      } else {
        carsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public Builder addCars(
        int index, org.example.grpc.complex_types.Car.Builder builderForValue) {
      if (carsBuilder_ == null) {
        ensureCarsIsMutable();
        cars_.add(index, builderForValue.build());
        onChanged();
      } else {
        carsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public Builder addAllCars(
        java.lang.Iterable<? extends org.example.grpc.complex_types.Car> values) {
      if (carsBuilder_ == null) {
        ensureCarsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cars_);
        onChanged();
      } else {
        carsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public Builder clearCars() {
      if (carsBuilder_ == null) {
        cars_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        carsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public Builder removeCars(int index) {
      if (carsBuilder_ == null) {
        ensureCarsIsMutable();
        cars_.remove(index);
        onChanged();
      } else {
        carsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public org.example.grpc.complex_types.Car.Builder getCarsBuilder(
        int index) {
      return getCarsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public org.example.grpc.complex_types.CarOrBuilder getCarsOrBuilder(
        int index) {
      if (carsBuilder_ == null) {
        return cars_.get(index);  } else {
        return carsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public java.util.List<? extends org.example.grpc.complex_types.CarOrBuilder> 
         getCarsOrBuilderList() {
      if (carsBuilder_ != null) {
        return carsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cars_);
      }
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public org.example.grpc.complex_types.Car.Builder addCarsBuilder() {
      return getCarsFieldBuilder().addBuilder(
          org.example.grpc.complex_types.Car.getDefaultInstance());
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public org.example.grpc.complex_types.Car.Builder addCarsBuilder(
        int index) {
      return getCarsFieldBuilder().addBuilder(
          index, org.example.grpc.complex_types.Car.getDefaultInstance());
    }
    /**
     * <code>repeated .complex_types.Car cars = 1;</code>
     */
    public java.util.List<org.example.grpc.complex_types.Car.Builder> 
         getCarsBuilderList() {
      return getCarsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.grpc.complex_types.Car, org.example.grpc.complex_types.Car.Builder, org.example.grpc.complex_types.CarOrBuilder> 
        getCarsFieldBuilder() {
      if (carsBuilder_ == null) {
        carsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.example.grpc.complex_types.Car, org.example.grpc.complex_types.Car.Builder, org.example.grpc.complex_types.CarOrBuilder>(
                cars_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cars_ = null;
      }
      return carsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:complex_types.Cars)
  }

  // @@protoc_insertion_point(class_scope:complex_types.Cars)
  private static final org.example.grpc.complex_types.Cars DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.grpc.complex_types.Cars();
  }

  public static org.example.grpc.complex_types.Cars getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Cars>
      PARSER = new com.google.protobuf.AbstractParser<Cars>() {
    @java.lang.Override
    public Cars parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Cars> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Cars> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.grpc.complex_types.Cars getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

