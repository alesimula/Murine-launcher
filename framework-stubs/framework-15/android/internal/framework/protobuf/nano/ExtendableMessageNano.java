package android.internal.framework.protobuf.nano;

public abstract class ExtendableMessageNano<M extends android.internal.framework.protobuf.nano.ExtendableMessageNano<M>> extends android.internal.framework.protobuf.nano.MessageNano {
    protected android.internal.framework.protobuf.nano.FieldArray unknownFieldData;
    public ExtendableMessageNano() { super(); }
    protected int computeSerializedSize() { return 0; }
    public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    public final boolean hasExtension(android.internal.framework.protobuf.nano.Extension<M, ?> p0) { return false; }
    public final <T extends java.lang.Object> T getExtension(android.internal.framework.protobuf.nano.Extension<M, T> p0) { return null; }
    public final <T extends java.lang.Object> M setExtension(android.internal.framework.protobuf.nano.Extension<M, T> p0, T p1) { return null; }
    protected final boolean storeUnknownField(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0, int p1) throws java.io.IOException { return false; }
    public M clone() throws java.lang.CloneNotSupportedException { return null; }
}
