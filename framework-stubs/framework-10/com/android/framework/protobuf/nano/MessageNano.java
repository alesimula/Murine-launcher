package com.android.framework.protobuf.nano;

public abstract class MessageNano {
    protected volatile int cachedSize;
    public MessageNano() {}
    public int getCachedSize() { return 0; }
    public int getSerializedSize() { return 0; }
    protected int computeSerializedSize() { return 0; }
    public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    public abstract com.android.framework.protobuf.nano.MessageNano mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException;
    public static final byte[] toByteArray(com.android.framework.protobuf.nano.MessageNano p0) { return null; }
    public static final void toByteArray(com.android.framework.protobuf.nano.MessageNano p0, byte[] p1, int p2, int p3) {}
    public static final <T extends com.android.framework.protobuf.nano.MessageNano> T mergeFrom(T p0, byte[] p1) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
    public static final <T extends com.android.framework.protobuf.nano.MessageNano> T mergeFrom(T p0, byte[] p1, int p2, int p3) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
    public static final boolean messageNanoEquals(com.android.framework.protobuf.nano.MessageNano p0, com.android.framework.protobuf.nano.MessageNano p1) { return false; }
    public java.lang.String toString() { return null; }
    public com.android.framework.protobuf.nano.MessageNano clone() throws java.lang.CloneNotSupportedException { return null; }
}
