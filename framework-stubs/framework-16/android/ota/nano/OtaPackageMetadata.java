package android.ota.nano;

public interface OtaPackageMetadata {

    public static final class ApexInfo extends com.android.framework.protobuf.nano.MessageNano {
        public java.lang.String packageName;
        public long version;
        public boolean isCompressed;
        public long decompressedSize;
        public long sourceVersion;
        public static android.ota.nano.OtaPackageMetadata.ApexInfo[] emptyArray() { return null; }
        public ApexInfo() { super(); }
        public android.ota.nano.OtaPackageMetadata.ApexInfo clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.ota.nano.OtaPackageMetadata.ApexInfo mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.ota.nano.OtaPackageMetadata.ApexInfo parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.ota.nano.OtaPackageMetadata.ApexInfo parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ApexMetadata extends com.android.framework.protobuf.nano.MessageNano {
        public android.ota.nano.OtaPackageMetadata.ApexInfo[] apexInfo;
        public static android.ota.nano.OtaPackageMetadata.ApexMetadata[] emptyArray() { return null; }
        public ApexMetadata() { super(); }
        public android.ota.nano.OtaPackageMetadata.ApexMetadata clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.ota.nano.OtaPackageMetadata.ApexMetadata mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.ota.nano.OtaPackageMetadata.ApexMetadata parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.ota.nano.OtaPackageMetadata.ApexMetadata parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class DeviceState extends com.android.framework.protobuf.nano.MessageNano {
        public java.lang.String[] device;
        public java.lang.String[] build;
        public java.lang.String buildIncremental;
        public long timestamp;
        public java.lang.String sdkLevel;
        public java.lang.String securityPatchLevel;
        public android.ota.nano.OtaPackageMetadata.PartitionState[] partitionState;
        public static android.ota.nano.OtaPackageMetadata.DeviceState[] emptyArray() { return null; }
        public DeviceState() { super(); }
        public android.ota.nano.OtaPackageMetadata.DeviceState clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.ota.nano.OtaPackageMetadata.DeviceState mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.ota.nano.OtaPackageMetadata.DeviceState parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.ota.nano.OtaPackageMetadata.DeviceState parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class OtaMetadata extends com.android.framework.protobuf.nano.MessageNano {
        public static final int UNKNOWN = 0;
        public static final int AB = 1;
        public static final int BLOCK = 2;
        public static final int BRICK = 3;
        public int type;
        public boolean wipe;
        public boolean downgrade;
        public java.util.Map<java.lang.String, java.lang.String> propertyFiles;
        public android.ota.nano.OtaPackageMetadata.DeviceState precondition;
        public android.ota.nano.OtaPackageMetadata.DeviceState postcondition;
        public long requiredCache;
        public boolean splDowngrade;
        public static android.ota.nano.OtaPackageMetadata.OtaMetadata[] emptyArray() { return null; }
        public OtaMetadata() { super(); }
        public android.ota.nano.OtaPackageMetadata.OtaMetadata clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.ota.nano.OtaPackageMetadata.OtaMetadata mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.ota.nano.OtaPackageMetadata.OtaMetadata parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.ota.nano.OtaPackageMetadata.OtaMetadata parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class PartitionState extends com.android.framework.protobuf.nano.MessageNano {
        public java.lang.String partitionName;
        public java.lang.String[] device;
        public java.lang.String[] build;
        public java.lang.String version;
        public static android.ota.nano.OtaPackageMetadata.PartitionState[] emptyArray() { return null; }
        public PartitionState() { super(); }
        public android.ota.nano.OtaPackageMetadata.PartitionState clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public android.ota.nano.OtaPackageMetadata.PartitionState mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.ota.nano.OtaPackageMetadata.PartitionState parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static android.ota.nano.OtaPackageMetadata.PartitionState parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }
}
