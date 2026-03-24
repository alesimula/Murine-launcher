package com.android.framework.protobuf;

public final class CodedInputStream {
    private final byte[] buffer = null;
    private final boolean bufferIsImmutable = false;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferPos;
    private final java.io.InputStream input = null;
    private int lastTag;
    private boolean enableAliasing;
    private int totalBytesRetired;
    private int currentLimit;
    private int recursionDepth;
    private int recursionLimit;
    private int sizeLimit;
    private static final int DEFAULT_RECURSION_LIMIT = 100;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private static final int BUFFER_SIZE = 4096;
    private com.android.framework.protobuf.CodedInputStream.RefillCallback refillCallback;
    public static com.android.framework.protobuf.CodedInputStream newInstance(java.io.InputStream p0) { return null; }
    static com.android.framework.protobuf.CodedInputStream newInstance(java.io.InputStream p0, int p1) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(byte[] p0) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(byte[] p0, int p1, int p2) { return null; }
    static com.android.framework.protobuf.CodedInputStream newInstance(byte[] p0, int p1, int p2, boolean p3) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer p0) { return null; }
    public int readTag() throws java.io.IOException { return 0; }
    public void checkLastTagWas(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException {}
    public int getLastTag() { return 0; }
    public boolean skipField(int p0) throws java.io.IOException { return false; }
    public boolean skipField(int p0, com.android.framework.protobuf.CodedOutputStream p1) throws java.io.IOException { return false; }
    public void skipMessage() throws java.io.IOException {}
    public void skipMessage(com.android.framework.protobuf.CodedOutputStream p0) throws java.io.IOException {}
    public double readDouble() throws java.io.IOException { return 0.0; }
    public float readFloat() throws java.io.IOException { return 0.0f; }
    public long readUInt64() throws java.io.IOException { return 0L; }
    public long readInt64() throws java.io.IOException { return 0L; }
    public int readInt32() throws java.io.IOException { return 0; }
    public long readFixed64() throws java.io.IOException { return 0L; }
    public int readFixed32() throws java.io.IOException { return 0; }
    public boolean readBool() throws java.io.IOException { return false; }
    public java.lang.String readString() throws java.io.IOException { return null; }
    public java.lang.String readStringRequireUtf8() throws java.io.IOException { return null; }
    public void readGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
    public <T extends com.android.framework.protobuf.MessageLite> T readGroup(int p0, com.android.framework.protobuf.Parser<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public void readUnknownGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1) throws java.io.IOException {}
    public void readMessage(com.android.framework.protobuf.MessageLite.Builder p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {}
    public <T extends com.android.framework.protobuf.MessageLite> T readMessage(com.android.framework.protobuf.Parser<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
    public com.android.framework.protobuf.ByteString readBytes() throws java.io.IOException { return null; }
    public byte[] readByteArray() throws java.io.IOException { return null; }
    public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException { return null; }
    public int readUInt32() throws java.io.IOException { return 0; }
    public int readEnum() throws java.io.IOException { return 0; }
    public int readSFixed32() throws java.io.IOException { return 0; }
    public long readSFixed64() throws java.io.IOException { return 0L; }
    public int readSInt32() throws java.io.IOException { return 0; }
    public long readSInt64() throws java.io.IOException { return 0L; }
    public int readRawVarint32() throws java.io.IOException { return 0; }
    private void skipRawVarint() throws java.io.IOException {}
    private void skipRawVarintSlowPath() throws java.io.IOException {}
    static int readRawVarint32(java.io.InputStream p0) throws java.io.IOException { return 0; }
    public static int readRawVarint32(int p0, java.io.InputStream p1) throws java.io.IOException { return 0; }
    public long readRawVarint64() throws java.io.IOException { return 0L; }
    long readRawVarint64SlowPath() throws java.io.IOException { return 0L; }
    public int readRawLittleEndian32() throws java.io.IOException { return 0; }
    public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
    public static int decodeZigZag32(int p0) { return 0; }
    public static long decodeZigZag64(long p0) { return 0L; }
    private CodedInputStream(byte[] p0, int p1, int p2, boolean p3) {}
    private CodedInputStream(java.io.InputStream p0, int p1) {}
    public void enableAliasing(boolean p0) {}
    public int setRecursionLimit(int p0) { return 0; }
    public int setSizeLimit(int p0) { return 0; }
    public void resetSizeCounter() {}
    public int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return 0; }
    private void recomputeBufferSizeAfterLimit() {}
    public void popLimit(int p0) {}
    public int getBytesUntilLimit() { return 0; }
    public boolean isAtEnd() throws java.io.IOException { return false; }
    public int getTotalBytesRead() { return 0; }
    private void refillBuffer(int p0) throws java.io.IOException {}
    private boolean tryRefillBuffer(int p0) throws java.io.IOException { return false; }
    public byte readRawByte() throws java.io.IOException { return 0; }
    public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
    private byte[] readRawBytesSlowPath(int p0) throws java.io.IOException { return null; }
    public void skipRawBytes(int p0) throws java.io.IOException {}
    private void skipRawBytesSlowPath(int p0) throws java.io.IOException {}

    private class SkippedDataSink implements com.android.framework.protobuf.CodedInputStream.RefillCallback {
        private int lastPos;
        private java.io.ByteArrayOutputStream byteArrayStream;
        private SkippedDataSink(com.android.framework.protobuf.CodedInputStream p0) {}
        public void onRefill() {}
        java.nio.ByteBuffer getSkippedData() { return null; }
    }

    private static interface RefillCallback {
        public void onRefill();
    }
}
