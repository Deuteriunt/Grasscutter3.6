// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaLampContributeItemRsp.proto

package emu.grasscutter.net.proto;

public final class SeaLampContributeItemRspOuterClass {
  private SeaLampContributeItemRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeaLampContributeItemRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeaLampContributeItemRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 addProgress = 4;</code>
     * @return The addProgress.
     */
    int getAddProgress();

    /**
     * <code>uint32 Unk3300_AIINHBHNHOI = 9;</code>
     * @return The unk3300AIINHBHNHOI.
     */
    int getUnk3300AIINHBHNHOI();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 Unk3300_LPHALOGLGAL = 2;</code>
     * @return The unk3300LPHALOGLGAL.
     */
    int getUnk3300LPHALOGLGAL();
  }
  /**
   * Protobuf type {@code SeaLampContributeItemRsp}
   */
  public static final class SeaLampContributeItemRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeaLampContributeItemRsp)
      SeaLampContributeItemRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeaLampContributeItemRsp.newBuilder() to construct.
    private SeaLampContributeItemRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeaLampContributeItemRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeaLampContributeItemRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SeaLampContributeItemRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 16: {

              unk3300LPHALOGLGAL_ = input.readUInt32();
              break;
            }
            case 32: {

              addProgress_ = input.readUInt32();
              break;
            }
            case 72: {

              unk3300AIINHBHNHOI_ = input.readUInt32();
              break;
            }
            case 96: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.internal_static_SeaLampContributeItemRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.internal_static_SeaLampContributeItemRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.class, emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code SeaLampContributeItemRsp.EDBJBDCJHCL}
     */
    public enum EDBJBDCJHCL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 2166;</code>
       */
      PEPPOHPHJOJ(1, 2166),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final EDBJBDCJHCL DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 2166;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 2166;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static EDBJBDCJHCL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static EDBJBDCJHCL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 2166: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<EDBJBDCJHCL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          EDBJBDCJHCL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<EDBJBDCJHCL>() {
              public EDBJBDCJHCL findValueByNumber(int number) {
                return EDBJBDCJHCL.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final EDBJBDCJHCL[] VALUES = getStaticValuesArray();
      private static EDBJBDCJHCL[] getStaticValuesArray() {
        return new EDBJBDCJHCL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static EDBJBDCJHCL valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private EDBJBDCJHCL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SeaLampContributeItemRsp.EDBJBDCJHCL)
    }

    public static final int ADDPROGRESS_FIELD_NUMBER = 4;
    private int addProgress_;
    /**
     * <code>uint32 addProgress = 4;</code>
     * @return The addProgress.
     */
    @java.lang.Override
    public int getAddProgress() {
      return addProgress_;
    }

    public static final int UNK3300_AIINHBHNHOI_FIELD_NUMBER = 9;
    private int unk3300AIINHBHNHOI_;
    /**
     * <code>uint32 Unk3300_AIINHBHNHOI = 9;</code>
     * @return The unk3300AIINHBHNHOI.
     */
    @java.lang.Override
    public int getUnk3300AIINHBHNHOI() {
      return unk3300AIINHBHNHOI_;
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK3300_LPHALOGLGAL_FIELD_NUMBER = 2;
    private int unk3300LPHALOGLGAL_;
    /**
     * <code>uint32 Unk3300_LPHALOGLGAL = 2;</code>
     * @return The unk3300LPHALOGLGAL.
     */
    @java.lang.Override
    public int getUnk3300LPHALOGLGAL() {
      return unk3300LPHALOGLGAL_;
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
      if (unk3300LPHALOGLGAL_ != 0) {
        output.writeUInt32(2, unk3300LPHALOGLGAL_);
      }
      if (addProgress_ != 0) {
        output.writeUInt32(4, addProgress_);
      }
      if (unk3300AIINHBHNHOI_ != 0) {
        output.writeUInt32(9, unk3300AIINHBHNHOI_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300LPHALOGLGAL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3300LPHALOGLGAL_);
      }
      if (addProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, addProgress_);
      }
      if (unk3300AIINHBHNHOI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk3300AIINHBHNHOI_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp other = (emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp) obj;

      if (getAddProgress()
          != other.getAddProgress()) return false;
      if (getUnk3300AIINHBHNHOI()
          != other.getUnk3300AIINHBHNHOI()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getUnk3300LPHALOGLGAL()
          != other.getUnk3300LPHALOGLGAL()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ADDPROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddProgress();
      hash = (37 * hash) + UNK3300_AIINHBHNHOI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300AIINHBHNHOI();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UNK3300_LPHALOGLGAL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300LPHALOGLGAL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp prototype) {
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
     * Protobuf type {@code SeaLampContributeItemRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeaLampContributeItemRsp)
        emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.internal_static_SeaLampContributeItemRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.internal_static_SeaLampContributeItemRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.class, emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.newBuilder()
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
        addProgress_ = 0;

        unk3300AIINHBHNHOI_ = 0;

        retcode_ = 0;

        unk3300LPHALOGLGAL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.internal_static_SeaLampContributeItemRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp build() {
        emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp buildPartial() {
        emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp result = new emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp(this);
        result.addProgress_ = addProgress_;
        result.unk3300AIINHBHNHOI_ = unk3300AIINHBHNHOI_;
        result.retcode_ = retcode_;
        result.unk3300LPHALOGLGAL_ = unk3300LPHALOGLGAL_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp other) {
        if (other == emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.getDefaultInstance()) return this;
        if (other.getAddProgress() != 0) {
          setAddProgress(other.getAddProgress());
        }
        if (other.getUnk3300AIINHBHNHOI() != 0) {
          setUnk3300AIINHBHNHOI(other.getUnk3300AIINHBHNHOI());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getUnk3300LPHALOGLGAL() != 0) {
          setUnk3300LPHALOGLGAL(other.getUnk3300LPHALOGLGAL());
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
        emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int addProgress_ ;
      /**
       * <code>uint32 addProgress = 4;</code>
       * @return The addProgress.
       */
      @java.lang.Override
      public int getAddProgress() {
        return addProgress_;
      }
      /**
       * <code>uint32 addProgress = 4;</code>
       * @param value The addProgress to set.
       * @return This builder for chaining.
       */
      public Builder setAddProgress(int value) {
        
        addProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 addProgress = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddProgress() {
        
        addProgress_ = 0;
        onChanged();
        return this;
      }

      private int unk3300AIINHBHNHOI_ ;
      /**
       * <code>uint32 Unk3300_AIINHBHNHOI = 9;</code>
       * @return The unk3300AIINHBHNHOI.
       */
      @java.lang.Override
      public int getUnk3300AIINHBHNHOI() {
        return unk3300AIINHBHNHOI_;
      }
      /**
       * <code>uint32 Unk3300_AIINHBHNHOI = 9;</code>
       * @param value The unk3300AIINHBHNHOI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AIINHBHNHOI(int value) {
        
        unk3300AIINHBHNHOI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_AIINHBHNHOI = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300AIINHBHNHOI() {
        
        unk3300AIINHBHNHOI_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int unk3300LPHALOGLGAL_ ;
      /**
       * <code>uint32 Unk3300_LPHALOGLGAL = 2;</code>
       * @return The unk3300LPHALOGLGAL.
       */
      @java.lang.Override
      public int getUnk3300LPHALOGLGAL() {
        return unk3300LPHALOGLGAL_;
      }
      /**
       * <code>uint32 Unk3300_LPHALOGLGAL = 2;</code>
       * @param value The unk3300LPHALOGLGAL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LPHALOGLGAL(int value) {
        
        unk3300LPHALOGLGAL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_LPHALOGLGAL = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LPHALOGLGAL() {
        
        unk3300LPHALOGLGAL_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:SeaLampContributeItemRsp)
    }

    // @@protoc_insertion_point(class_scope:SeaLampContributeItemRsp)
    private static final emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp();
    }

    public static emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeaLampContributeItemRsp>
        PARSER = new com.google.protobuf.AbstractParser<SeaLampContributeItemRsp>() {
      @java.lang.Override
      public SeaLampContributeItemRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SeaLampContributeItemRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SeaLampContributeItemRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeaLampContributeItemRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeaLampContributeItemRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeaLampContributeItemRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SeaLampContributeItemRsp.proto\"\313\001\n\030Sea" +
      "LampContributeItemRsp\022\023\n\013addProgress\030\004 \001" +
      "(\r\022\033\n\023Unk3300_AIINHBHNHOI\030\t \001(\r\022\017\n\007retco" +
      "de\030\014 \001(\005\022\033\n\023Unk3300_LPHALOGLGAL\030\002 \001(\r\"O\n" +
      "\013EDBJBDCJHCL\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\366\020" +
      "\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SeaLampContributeItemRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeaLampContributeItemRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeaLampContributeItemRsp_descriptor,
        new java.lang.String[] { "AddProgress", "Unk3300AIINHBHNHOI", "Retcode", "Unk3300LPHALOGLGAL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}