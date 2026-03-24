package com.android.internal.telephony.nano;

public interface StoredPinProto {

    public static final class EncryptedPin extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.StoredPinProto.EncryptedPin> {
        public byte[] encryptedStoredPin;
        public byte[] iv;
        public static com.android.internal.telephony.nano.StoredPinProto.EncryptedPin[] emptyArray() { return null; }
        public EncryptedPin() { super(); }
        public com.android.internal.telephony.nano.StoredPinProto.EncryptedPin clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.StoredPinProto.EncryptedPin mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.StoredPinProto.EncryptedPin parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.StoredPinProto.EncryptedPin parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class StoredPin extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.StoredPinProto.StoredPin> {
        public java.lang.String iccid;
        public java.lang.String pin;
        public int slotId;
        public int status;
        public int bootCount;
        public static com.android.internal.telephony.nano.StoredPinProto.StoredPin[] emptyArray() { return null; }
        public StoredPin() { super(); }
        public com.android.internal.telephony.nano.StoredPinProto.StoredPin clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.StoredPinProto.StoredPin mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.StoredPinProto.StoredPin parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.StoredPinProto.StoredPin parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static interface PinStatus {
            public static final int AVAILABLE = 1;
            public static final int REBOOT_READY = 2;
            public static final int VERIFICATION_READY = 3;
        }
    }
}
