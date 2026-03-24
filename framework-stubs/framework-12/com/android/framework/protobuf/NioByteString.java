package com.android.framework.protobuf;

final class NioByteString extends com.android.framework.protobuf.ByteString.LeafByteString {
    private final java.nio.ByteBuffer buffer = null;
    NioByteString(java.nio.ByteBuffer p0) { super(); }
    private java.lang.Object writeReplace() { return null; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException {}
    public byte byteAt(int p0) { return 0; }
    public byte internalByteAt(int p0) { return 0; }
    public int size() { return 0; }
    public com.android.framework.protobuf.ByteString substring(int p0, int p1) { return null; }
    protected void copyToInternal(byte[] p0, int p1, int p2, int p3) {}
    public void copyTo(java.nio.ByteBuffer p0) {}
    public void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
    boolean equalsRange(com.android.framework.protobuf.ByteString p0, int p1, int p2) { return false; }
    void writeToInternal(java.io.OutputStream p0, int p1, int p2) throws java.io.IOException {}
    void writeTo(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException {}
    public java.nio.ByteBuffer asReadOnlyByteBuffer() { return null; }
    public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() { return null; }
    protected java.lang.String toStringInternal(java.nio.charset.Charset p0) { return null; }
    public boolean isValidUtf8() { return false; }
    protected int partialIsValidUtf8(int p0, int p1, int p2) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    protected int partialHash(int p0, int p1, int p2) { return 0; }
    public java.io.InputStream newInput() { return null; }
    public com.android.framework.protobuf.CodedInputStream newCodedInput() { return null; }
    private java.nio.ByteBuffer slice(int p0, int p1) { return null; }
}
