package com.android.internal.telephony.protobuf.nano;

public final class CodedInputByteBufferNano {
    public static com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano newInstance(byte[] p0) { return null; }
    public static com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano newInstance(byte[] p0, int p1, int p2) { return null; }
    public int readTag() throws java.io.IOException { return 0; }
    public void checkLastTagWas(int p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException {}
    public boolean skipField(int p0) throws java.io.IOException { return false; }
    public void skipMessage() throws java.io.IOException {}
    public double readDouble() throws java.io.IOException { return 0.0; }
    public float readFloat() throws java.io.IOException { return 0.0f; }
    public long readUInt64() throws java.io.IOException { return 0L; }
    public long readInt64() throws java.io.IOException { return 0L; }
    public int readInt32() throws java.io.IOException { return 0; }
    public long readFixed64() throws java.io.IOException { return 0L; }
    public int readFixed32() throws java.io.IOException { return 0; }
    public boolean readBool() throws java.io.IOException { return false; }
    public java.lang.String readString() throws java.io.IOException { return null; }
    public void readGroup(com.android.internal.telephony.protobuf.nano.MessageNano p0, int p1) throws java.io.IOException {}
    public void readMessage(com.android.internal.telephony.protobuf.nano.MessageNano p0) throws java.io.IOException {}
    public byte[] readBytes() throws java.io.IOException { return null; }
    public int readUInt32() throws java.io.IOException { return 0; }
    public int readEnum() throws java.io.IOException { return 0; }
    public int readSFixed32() throws java.io.IOException { return 0; }
    public long readSFixed64() throws java.io.IOException { return 0L; }
    public int readSInt32() throws java.io.IOException { return 0; }
    public long readSInt64() throws java.io.IOException { return 0L; }
    public int readRawVarint32() throws java.io.IOException { return 0; }
    public long readRawVarint64() throws java.io.IOException { return 0L; }
    public int readRawLittleEndian32() throws java.io.IOException { return 0; }
    public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
    public static int decodeZigZag32(int p0) { return 0; }
    public static long decodeZigZag64(long p0) { return 0L; }
    public int setRecursionLimit(int p0) { return 0; }
    public int setSizeLimit(int p0) { return 0; }
    public void resetSizeCounter() {}
    public int pushLimit(int p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return 0; }
    public void popLimit(int p0) {}
    public int getBytesUntilLimit() { return 0; }
    public boolean isAtEnd() { return false; }
    public int getPosition() { return 0; }
    public byte[] getData(int p0, int p1) { return null; }
    public void rewindToPosition(int p0) {}
    public byte readRawByte() throws java.io.IOException { return 0; }
    public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
    public void skipRawBytes(int p0) throws java.io.IOException {}
    java.lang.Object readPrimitiveField(int p0) throws java.io.IOException { return null; }
}
