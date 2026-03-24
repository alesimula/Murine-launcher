package com.android.phone.ecc.nano;

public interface ProtobufEccData {

    public static final class AllInfo extends com.android.phone.ecc.nano.ExtendableMessageNano<com.android.phone.ecc.nano.ProtobufEccData.AllInfo> {
        public int revision;
        public com.android.phone.ecc.nano.ProtobufEccData.CountryInfo[] countries;
        public static com.android.phone.ecc.nano.ProtobufEccData.AllInfo[] emptyArray() { return null; }
        public AllInfo() { super(); }
        public com.android.phone.ecc.nano.ProtobufEccData.AllInfo clear() { return null; }
        public void writeTo(com.android.phone.ecc.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.phone.ecc.nano.ProtobufEccData.AllInfo mergeFrom(com.android.phone.ecc.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.phone.ecc.nano.ProtobufEccData.AllInfo parseFrom(byte[] p0) throws com.android.phone.ecc.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.phone.ecc.nano.ProtobufEccData.AllInfo parseFrom(com.android.phone.ecc.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class CountryInfo extends com.android.phone.ecc.nano.ExtendableMessageNano<com.android.phone.ecc.nano.ProtobufEccData.CountryInfo> {
        public java.lang.String isoCode;
        public com.android.phone.ecc.nano.ProtobufEccData.EccInfo[] eccs;
        public java.lang.String eccFallback;
        public boolean ignoreModemConfig;
        public static com.android.phone.ecc.nano.ProtobufEccData.CountryInfo[] emptyArray() { return null; }
        public CountryInfo() { super(); }
        public com.android.phone.ecc.nano.ProtobufEccData.CountryInfo clear() { return null; }
        public void writeTo(com.android.phone.ecc.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.phone.ecc.nano.ProtobufEccData.CountryInfo mergeFrom(com.android.phone.ecc.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.phone.ecc.nano.ProtobufEccData.CountryInfo parseFrom(byte[] p0) throws com.android.phone.ecc.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.phone.ecc.nano.ProtobufEccData.CountryInfo parseFrom(com.android.phone.ecc.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class EccInfo extends com.android.phone.ecc.nano.ExtendableMessageNano<com.android.phone.ecc.nano.ProtobufEccData.EccInfo> {
        public java.lang.String phoneNumber;
        public int[] types;
        public int routing;
        public java.lang.String[] normalRoutingMncs;
        public static com.android.phone.ecc.nano.ProtobufEccData.EccInfo[] emptyArray() { return null; }
        public EccInfo() { super(); }
        public com.android.phone.ecc.nano.ProtobufEccData.EccInfo clear() { return null; }
        public void writeTo(com.android.phone.ecc.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.phone.ecc.nano.ProtobufEccData.EccInfo mergeFrom(com.android.phone.ecc.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.phone.ecc.nano.ProtobufEccData.EccInfo parseFrom(byte[] p0) throws com.android.phone.ecc.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.phone.ecc.nano.ProtobufEccData.EccInfo parseFrom(com.android.phone.ecc.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static interface Routing {
            public static final int UNKNOWN = 0;
            public static final int EMERGENCY = 1;
            public static final int NORMAL = 2;
        }

        public static interface Type {
            public static final int TYPE_UNSPECIFIED = 0;
            public static final int POLICE = 1;
            public static final int AMBULANCE = 2;
            public static final int FIRE = 3;
            public static final int MARINE_GUARD = 4;
            public static final int MOUNTAIN_RESCUE = 5;
            public static final int MIEC = 6;
            public static final int AIEC = 7;
        }
    }
}
