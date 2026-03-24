package com.android.framework.protobuf;

final class RopeByteString extends com.android.framework.protobuf.ByteString {
    static final int[] minLengthByDepth = null;
    static com.android.framework.protobuf.ByteString concatenate(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { return null; }
    static com.android.framework.protobuf.RopeByteString newInstanceForTest(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { return null; }
    static int minLength(int p0) { return 0; }
    public byte byteAt(int p0) { return 0; }
    byte internalByteAt(int p0) { return 0; }
    public int size() { return 0; }
    public com.android.framework.protobuf.ByteString.ByteIterator iterator() { return null; }
    protected int getTreeDepth() { return 0; }
    protected boolean isBalanced() { return false; }
    public com.android.framework.protobuf.ByteString substring(int p0, int p1) { return null; }
    protected void copyToInternal(byte[] p0, int p1, int p2, int p3) {}
    public void copyTo(java.nio.ByteBuffer p0) {}
    public java.nio.ByteBuffer asReadOnlyByteBuffer() { return null; }
    public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() { return null; }
    public void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
    void writeToInternal(java.io.OutputStream p0, int p1, int p2) throws java.io.IOException {}
    void writeTo(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException {}
    void writeToReverse(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException {}
    protected java.lang.String toStringInternal(java.nio.charset.Charset p0) { return null; }
    public boolean isValidUtf8() { return false; }
    protected int partialIsValidUtf8(int p0, int p1, int p2) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    protected int partialHash(int p0, int p1, int p2) { return 0; }
    public com.android.framework.protobuf.CodedInputStream newCodedInput() { return null; }
    public java.io.InputStream newInput() { return null; }
    java.lang.Object writeReplace() { return null; }

    private static class Balancer {
    }

    private static final class PieceIterator implements java.util.Iterator<com.android.framework.protobuf.ByteString.LeafByteString> {
        public boolean hasNext() { return false; }
        public com.android.framework.protobuf.ByteString.LeafByteString next() { return null; }
        public void remove() {}
    }

    private class RopeInputStream extends java.io.InputStream {
        public RopeInputStream(com.android.framework.protobuf.RopeByteString p0) { super(); }
        public int read(byte[] p0, int p1, int p2) { return 0; }
        public long skip(long p0) { return 0L; }
        public int read() throws java.io.IOException { return 0; }
        public int available() throws java.io.IOException { return 0; }
        public boolean markSupported() { return false; }
        public void mark(int p0) {}
        public synchronized void reset() {}
    }
}
