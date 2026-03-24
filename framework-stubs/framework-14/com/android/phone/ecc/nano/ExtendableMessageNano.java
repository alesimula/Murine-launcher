package com.android.phone.ecc.nano;

public abstract class ExtendableMessageNano<M extends com.android.phone.ecc.nano.ExtendableMessageNano<M>> extends com.android.phone.ecc.nano.MessageNano {
    protected com.android.phone.ecc.nano.FieldArray unknownFieldData;
    public ExtendableMessageNano() { super(); }
    protected int computeSerializedSize() { return 0; }
    public void writeTo(com.android.phone.ecc.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    public final boolean hasExtension(com.android.phone.ecc.nano.Extension<M, ?> p0) { return false; }
    public final <T extends java.lang.Object> T getExtension(com.android.phone.ecc.nano.Extension<M, T> p0) { return null; }
    public final <T extends java.lang.Object> M setExtension(com.android.phone.ecc.nano.Extension<M, T> p0, T p1) { return null; }
    protected final boolean storeUnknownField(com.android.phone.ecc.nano.CodedInputByteBufferNano p0, int p1) throws java.io.IOException { return false; }
    public M clone() throws java.lang.CloneNotSupportedException { return null; }
}
