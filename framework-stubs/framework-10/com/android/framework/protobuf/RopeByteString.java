package com.android.framework.protobuf;

final class RopeByteString extends com.android.framework.protobuf.ByteString {
    private static final int[] minLengthByDepth = null;
    private final int totalLength = 0;
    private final com.android.framework.protobuf.ByteString left = null;
    private final com.android.framework.protobuf.ByteString right = null;
    private final int leftLength = 0;
    private final int treeDepth = 0;
    private static final long serialVersionUID = 1L;
    private RopeByteString(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { super(); }
    static com.android.framework.protobuf.ByteString concatenate(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { return null; }
    private static com.android.framework.protobuf.ByteString concatenateBytes(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { return null; }
    static com.android.framework.protobuf.RopeByteString newInstanceForTest(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { return null; }
    public byte byteAt(int p0) { return 0; }
    public int size() { return 0; }
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
    protected java.lang.String toStringInternal(java.nio.charset.Charset p0) { return null; }
    public boolean isValidUtf8() { return false; }
    protected int partialIsValidUtf8(int p0, int p1, int p2) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    private boolean equalsFragments(com.android.framework.protobuf.ByteString p0) { return false; }
    protected int partialHash(int p0, int p1, int p2) { return 0; }
    public com.android.framework.protobuf.CodedInputStream newCodedInput() { return null; }
    public java.io.InputStream newInput() { return null; }
    java.lang.Object writeReplace() { return null; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException {}

    private class RopeInputStream extends java.io.InputStream {
        private com.android.framework.protobuf.RopeByteString.PieceIterator pieceIterator;
        private com.android.framework.protobuf.ByteString.LeafByteString currentPiece;
        private int currentPieceSize;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int mark;
        public RopeInputStream(com.android.framework.protobuf.RopeByteString p0) { super(); }
        public int read(byte[] p0, int p1, int p2) { return 0; }
        public long skip(long p0) { return 0L; }
        private int readSkipInternal(byte[] p0, int p1, int p2) { return 0; }
        public int read() throws java.io.IOException { return 0; }
        public int available() throws java.io.IOException { return 0; }
        public boolean markSupported() { return false; }
        public void mark(int p0) {}
        public synchronized void reset() {}
        private void initialize() {}
        private void advanceIfCurrentPieceFullyRead() {}
    }

    private static class PieceIterator implements java.util.Iterator<com.android.framework.protobuf.ByteString.LeafByteString> {
        private final java.util.Stack<com.android.framework.protobuf.RopeByteString> breadCrumbs = null;
        private com.android.framework.protobuf.ByteString.LeafByteString next;
        private PieceIterator(com.android.framework.protobuf.ByteString p0) {}
        private com.android.framework.protobuf.ByteString.LeafByteString getLeafByLeft(com.android.framework.protobuf.ByteString p0) { return null; }
        private com.android.framework.protobuf.ByteString.LeafByteString getNextNonEmptyLeaf() { return null; }
        public boolean hasNext() { return false; }
        public com.android.framework.protobuf.ByteString.LeafByteString next() { return null; }
        public void remove() {}
    }

    private static class Balancer {
        private final java.util.Stack<com.android.framework.protobuf.ByteString> prefixesStack = null;
        private Balancer() {}
        private com.android.framework.protobuf.ByteString balance(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ByteString p1) { return null; }
        private void doBalance(com.android.framework.protobuf.ByteString p0) {}
        private void insert(com.android.framework.protobuf.ByteString p0) {}
        private int getDepthBinForLength(int p0) { return 0; }
    }
}
