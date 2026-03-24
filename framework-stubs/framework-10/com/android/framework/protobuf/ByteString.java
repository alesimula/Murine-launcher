package com.android.framework.protobuf;

public abstract class ByteString implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    public static final com.android.framework.protobuf.ByteString EMPTY = null;
    private static final com.android.framework.protobuf.ByteString.ByteArrayCopier byteArrayCopier = null;
    private int hash;
    ByteString() {}
    public abstract byte byteAt(int p0);
    public final com.android.framework.protobuf.ByteString.ByteIterator iterator() { return null; }
    public abstract int size();
    public final boolean isEmpty() { return false; }
    public final com.android.framework.protobuf.ByteString substring(int p0) { return null; }
    public abstract com.android.framework.protobuf.ByteString substring(int p0, int p1);
    public final boolean startsWith(com.android.framework.protobuf.ByteString p0) { return false; }
    public final boolean endsWith(com.android.framework.protobuf.ByteString p0) { return false; }
    public static com.android.framework.protobuf.ByteString copyFrom(byte[] p0, int p1, int p2) { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(byte[] p0) { return null; }
    static com.android.framework.protobuf.ByteString wrap(byte[] p0) { return null; }
    static com.android.framework.protobuf.ByteString wrap(byte[] p0, int p1, int p2) { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(java.nio.ByteBuffer p0, int p1) { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(java.nio.ByteBuffer p0) { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(java.lang.String p0, java.lang.String p1) throws java.io.UnsupportedEncodingException { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(java.lang.String p0, java.nio.charset.Charset p1) { return null; }
    public static com.android.framework.protobuf.ByteString copyFromUtf8(java.lang.String p0) { return null; }
    public static com.android.framework.protobuf.ByteString readFrom(java.io.InputStream p0) throws java.io.IOException { return null; }
    public static com.android.framework.protobuf.ByteString readFrom(java.io.InputStream p0, int p1) throws java.io.IOException { return null; }
    public static com.android.framework.protobuf.ByteString readFrom(java.io.InputStream p0, int p1, int p2) throws java.io.IOException { return null; }
    private static com.android.framework.protobuf.ByteString readChunk(java.io.InputStream p0, int p1) throws java.io.IOException { return null; }
    public final com.android.framework.protobuf.ByteString concat(com.android.framework.protobuf.ByteString p0) { return null; }
    public static com.android.framework.protobuf.ByteString copyFrom(java.lang.Iterable<com.android.framework.protobuf.ByteString> p0) { return null; }
    private static com.android.framework.protobuf.ByteString balancedConcat(java.util.Iterator<com.android.framework.protobuf.ByteString> p0, int p1) { return null; }
    public void copyTo(byte[] p0, int p1) {}
    public final void copyTo(byte[] p0, int p1, int p2, int p3) {}
    protected abstract void copyToInternal(byte[] p0, int p1, int p2, int p3);
    public abstract void copyTo(java.nio.ByteBuffer p0);
    public final byte[] toByteArray() { return null; }
    public abstract void writeTo(java.io.OutputStream p0) throws java.io.IOException;
    final void writeTo(java.io.OutputStream p0, int p1, int p2) throws java.io.IOException {}
    abstract void writeToInternal(java.io.OutputStream p0, int p1, int p2) throws java.io.IOException;
    abstract void writeTo(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException;
    public abstract java.nio.ByteBuffer asReadOnlyByteBuffer();
    public abstract java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList();
    public final java.lang.String toString(java.lang.String p0) throws java.io.UnsupportedEncodingException { return null; }
    public final java.lang.String toString(java.nio.charset.Charset p0) { return null; }
    protected abstract java.lang.String toStringInternal(java.nio.charset.Charset p0);
    public final java.lang.String toStringUtf8() { return null; }
    public abstract boolean isValidUtf8();
    protected abstract int partialIsValidUtf8(int p0, int p1, int p2);
    public abstract boolean equals(java.lang.Object p0);
    public final int hashCode() { return 0; }
    public abstract java.io.InputStream newInput();
    public abstract com.android.framework.protobuf.CodedInputStream newCodedInput();
    public static com.android.framework.protobuf.ByteString.Output newOutput(int p0) { return null; }
    public static com.android.framework.protobuf.ByteString.Output newOutput() { return null; }
    static com.android.framework.protobuf.ByteString.CodedBuilder newCodedBuilder(int p0) { return null; }
    protected abstract int getTreeDepth();
    protected abstract boolean isBalanced();
    protected final int peekCachedHashCode() { return 0; }
    protected abstract int partialHash(int p0, int p1, int p2);
    static void checkIndex(int p0, int p1) {}
    static int checkRange(int p0, int p1, int p2) { return 0; }
    public final java.lang.String toString() { return null; }

    private static final class SystemByteArrayCopier implements com.android.framework.protobuf.ByteString.ByteArrayCopier {
        private SystemByteArrayCopier() {}
        public byte[] copyFrom(byte[] p0, int p1, int p2) { return null; }
    }

    public static final class Output extends java.io.OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = null;
        private final int initialCapacity = 0;
        private final java.util.ArrayList<com.android.framework.protobuf.ByteString> flushedBuffers = null;
        private int flushedBuffersTotalBytes;
        private byte[] buffer;
        private int bufferPos;
        Output(int p0) { super(); }
        public synchronized void write(int p0) {}
        public synchronized void write(byte[] p0, int p1, int p2) {}
        public synchronized com.android.framework.protobuf.ByteString toByteString() { return null; }
        private byte[] copyArray(byte[] p0, int p1) { return null; }
        public void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
        public synchronized int size() { return 0; }
        public synchronized void reset() {}
        public java.lang.String toString() { return null; }
        private void flushFullBuffer(int p0) {}
        private void flushLastBuffer() {}
    }

    private static class LiteralByteString extends com.android.framework.protobuf.ByteString.LeafByteString {
        private static final long serialVersionUID = 1L;
        protected final byte[] bytes = null;
        LiteralByteString(byte[] p0) { super(); }
        public byte byteAt(int p0) { return 0; }
        public int size() { return 0; }
        public final com.android.framework.protobuf.ByteString substring(int p0, int p1) { return null; }
        protected void copyToInternal(byte[] p0, int p1, int p2, int p3) {}
        public final void copyTo(java.nio.ByteBuffer p0) {}
        public final java.nio.ByteBuffer asReadOnlyByteBuffer() { return null; }
        public final java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() { return null; }
        public final void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
        final void writeToInternal(java.io.OutputStream p0, int p1, int p2) throws java.io.IOException {}
        final void writeTo(com.android.framework.protobuf.ByteOutput p0) throws java.io.IOException {}
        protected final java.lang.String toStringInternal(java.nio.charset.Charset p0) { return null; }
        public final boolean isValidUtf8() { return false; }
        protected final int partialIsValidUtf8(int p0, int p1, int p2) { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        final boolean equalsRange(com.android.framework.protobuf.ByteString p0, int p1, int p2) { return false; }
        protected final int partialHash(int p0, int p1, int p2) { return 0; }
        public final java.io.InputStream newInput() { return null; }
        public final com.android.framework.protobuf.CodedInputStream newCodedInput() { return null; }
        protected int getOffsetIntoBytes() { return 0; }
    }

    static abstract class LeafByteString extends com.android.framework.protobuf.ByteString {
        LeafByteString() { super(); }
        protected final int getTreeDepth() { return 0; }
        protected final boolean isBalanced() { return false; }
        abstract boolean equalsRange(com.android.framework.protobuf.ByteString p0, int p1, int p2);
    }

    static final class CodedBuilder {
        private final com.android.framework.protobuf.CodedOutputStream output = null;
        private final byte[] buffer = null;
        private CodedBuilder(int p0) {}
        public com.android.framework.protobuf.ByteString build() { return null; }
        public com.android.framework.protobuf.CodedOutputStream getCodedOutput() { return null; }
    }

    public static interface ByteIterator extends java.util.Iterator<java.lang.Byte> {
        public byte nextByte();
    }

    private static interface ByteArrayCopier {
        public byte[] copyFrom(byte[] p0, int p1, int p2);
    }

    private static final class BoundedByteString extends com.android.framework.protobuf.ByteString.LiteralByteString {
        private final int bytesOffset = 0;
        private final int bytesLength = 0;
        private static final long serialVersionUID = 1L;
        BoundedByteString(byte[] p0, int p1, int p2) { super(null); }
        public byte byteAt(int p0) { return 0; }
        public int size() { return 0; }
        protected int getOffsetIntoBytes() { return 0; }
        protected void copyToInternal(byte[] p0, int p1, int p2, int p3) {}
        java.lang.Object writeReplace() { return null; }
        private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException {}
    }

    private static final class ArraysByteArrayCopier implements com.android.framework.protobuf.ByteString.ByteArrayCopier {
        private ArraysByteArrayCopier() {}
        public byte[] copyFrom(byte[] p0, int p1, int p2) { return null; }
    }
}
