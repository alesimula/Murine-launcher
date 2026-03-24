package com.android.framework.protobuf.nano;

public abstract class ExtendableMessageNano<M extends com.android.framework.protobuf.nano.ExtendableMessageNano<M>> extends com.android.framework.protobuf.nano.MessageNano {
    protected com.android.framework.protobuf.nano.FieldArray unknownFieldData;
    public ExtendableMessageNano() { super(); }
    protected int computeSerializedSize() { return 0; }
    public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    public final boolean hasExtension(com.android.framework.protobuf.nano.Extension<M, ?> p0) { return false; }
    public final <T extends java.lang.Object> T getExtension(com.android.framework.protobuf.nano.Extension<M, T> p0) { return null; }
    public final <T extends java.lang.Object> M setExtension(com.android.framework.protobuf.nano.Extension<M, T> p0, T p1) { return null; }
    protected final boolean storeUnknownField(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0, int p1) throws java.io.IOException { return false; }
    public M clone() throws java.lang.CloneNotSupportedException { return null; }
}
