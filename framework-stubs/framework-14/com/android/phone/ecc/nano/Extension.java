package com.android.phone.ecc.nano;

public class Extension<M extends com.android.phone.ecc.nano.ExtendableMessageNano<M>, T extends java.lang.Object> {
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_UINT64 = 4;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    protected final int type = 0;
    protected final java.lang.Class<T> clazz = null;
    public final int tag = 0;
    protected final boolean repeated = false;
    @java.lang.Deprecated
    public static <M extends com.android.phone.ecc.nano.ExtendableMessageNano<M>, T extends com.android.phone.ecc.nano.MessageNano> com.android.phone.ecc.nano.Extension<M, T> createMessageTyped(int p0, java.lang.Class<T> p1, int p2) { return null; }
    public static <M extends com.android.phone.ecc.nano.ExtendableMessageNano<M>, T extends com.android.phone.ecc.nano.MessageNano> com.android.phone.ecc.nano.Extension<M, T> createMessageTyped(int p0, java.lang.Class<T> p1, long p2) { return null; }
    public static <M extends com.android.phone.ecc.nano.ExtendableMessageNano<M>, T extends com.android.phone.ecc.nano.MessageNano> com.android.phone.ecc.nano.Extension<M, T[]> createRepeatedMessageTyped(int p0, java.lang.Class<T[]> p1, long p2) { return null; }
    public static <M extends com.android.phone.ecc.nano.ExtendableMessageNano<M>, T extends java.lang.Object> com.android.phone.ecc.nano.Extension<M, T> createPrimitiveTyped(int p0, java.lang.Class<T> p1, long p2) { return null; }
    public static <M extends com.android.phone.ecc.nano.ExtendableMessageNano<M>, T extends java.lang.Object> com.android.phone.ecc.nano.Extension<M, T> createRepeatedPrimitiveTyped(int p0, java.lang.Class<T> p1, long p2, long p3, long p4) { return null; }
    final T getValueFrom(java.util.List<com.android.phone.ecc.nano.UnknownFieldData> p0) { return null; }
    protected java.lang.Object readData(com.android.phone.ecc.nano.CodedInputByteBufferNano p0) { return null; }
    protected void readDataInto(com.android.phone.ecc.nano.UnknownFieldData p0, java.util.List<java.lang.Object> p1) {}
    void writeTo(java.lang.Object p0, com.android.phone.ecc.nano.CodedOutputByteBufferNano p1) throws java.io.IOException {}
    protected void writeSingularData(java.lang.Object p0, com.android.phone.ecc.nano.CodedOutputByteBufferNano p1) {}
    protected void writeRepeatedData(java.lang.Object p0, com.android.phone.ecc.nano.CodedOutputByteBufferNano p1) {}
    int computeSerializedSize(java.lang.Object p0) { return 0; }
    protected int computeRepeatedSerializedSize(java.lang.Object p0) { return 0; }
    protected int computeSingularSerializedSize(java.lang.Object p0) { return 0; }

    private static class PrimitiveExtension<M extends com.android.phone.ecc.nano.ExtendableMessageNano<M>, T extends java.lang.Object> extends com.android.phone.ecc.nano.Extension<M, T> {
        public PrimitiveExtension(int p0, java.lang.Class<T> p1, int p2, boolean p3, int p4, int p5) { super(); }
        protected java.lang.Object readData(com.android.phone.ecc.nano.CodedInputByteBufferNano p0) { return null; }
        protected void readDataInto(com.android.phone.ecc.nano.UnknownFieldData p0, java.util.List<java.lang.Object> p1) {}
        protected final void writeSingularData(java.lang.Object p0, com.android.phone.ecc.nano.CodedOutputByteBufferNano p1) {}
        protected void writeRepeatedData(java.lang.Object p0, com.android.phone.ecc.nano.CodedOutputByteBufferNano p1) {}
        protected int computeRepeatedSerializedSize(java.lang.Object p0) { return 0; }
        protected final int computeSingularSerializedSize(java.lang.Object p0) { return 0; }
    }
}
