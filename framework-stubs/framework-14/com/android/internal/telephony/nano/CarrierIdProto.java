package com.android.internal.telephony.nano;

public interface CarrierIdProto {

    public static final class CarrierAttribute extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.CarrierIdProto.CarrierAttribute> {
        public java.lang.String[] mccmncTuple;
        public java.lang.String[] imsiPrefixXpattern;
        public java.lang.String[] spn;
        public java.lang.String[] plmn;
        public java.lang.String[] gid1;
        public java.lang.String[] gid2;
        public java.lang.String[] preferredApn;
        public java.lang.String[] iccidPrefix;
        public java.lang.String[] privilegeAccessRule;
        public static com.android.internal.telephony.nano.CarrierIdProto.CarrierAttribute[] emptyArray() { return null; }
        public CarrierAttribute() { super(); }
        public com.android.internal.telephony.nano.CarrierIdProto.CarrierAttribute clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.CarrierIdProto.CarrierAttribute mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.CarrierIdProto.CarrierAttribute parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.CarrierIdProto.CarrierAttribute parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class CarrierId extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.CarrierIdProto.CarrierId> {
        public int canonicalId;
        public java.lang.String carrierName;
        public com.android.internal.telephony.nano.CarrierIdProto.CarrierAttribute[] carrierAttribute;
        public int parentCanonicalId;
        public static com.android.internal.telephony.nano.CarrierIdProto.CarrierId[] emptyArray() { return null; }
        public CarrierId() { super(); }
        public com.android.internal.telephony.nano.CarrierIdProto.CarrierId clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.CarrierIdProto.CarrierId mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.CarrierIdProto.CarrierId parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.CarrierIdProto.CarrierId parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class CarrierList extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.CarrierIdProto.CarrierList> {
        public com.android.internal.telephony.nano.CarrierIdProto.CarrierId[] carrierId;
        public int version;
        public static com.android.internal.telephony.nano.CarrierIdProto.CarrierList[] emptyArray() { return null; }
        public CarrierList() { super(); }
        public com.android.internal.telephony.nano.CarrierIdProto.CarrierList clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.CarrierIdProto.CarrierList mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.CarrierIdProto.CarrierList parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.CarrierIdProto.CarrierList parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }
}
