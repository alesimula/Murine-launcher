package com.android.framework.protobuf;

public abstract class CodedInputStream {
    int recursionDepth;
    int recursionLimit;
    int sizeLimit;
    com.android.framework.protobuf.CodedInputStreamReader wrapper;
    public static com.android.framework.protobuf.CodedInputStream newInstance(java.io.InputStream p0) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(java.io.InputStream p0, int p1) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> p0) { return null; }
    static com.android.framework.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> p0, boolean p1) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(byte[] p0) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(byte[] p0, int p1, int p2) { return null; }
    static com.android.framework.protobuf.CodedInputStream newInstance(byte[] p0, int p1, int p2, boolean p3) { return null; }
    public static com.android.framework.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer p0) { return null; }
    static com.android.framework.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer p0, boolean p1) { return null; }
    public void checkRecursionLimit() throws com.android.framework.protobuf.InvalidProtocolBufferException {}
    public abstract int readTag() throws java.io.IOException;
    public abstract void checkLastTagWas(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public abstract int getLastTag();
    public abstract boolean skipField(int p0) throws java.io.IOException;
    @java.lang.Deprecated
    public abstract boolean skipField(int p0, com.android.framework.protobuf.CodedOutputStream p1) throws java.io.IOException;
    public abstract void skipMessage() throws java.io.IOException;
    public abstract void skipMessage(com.android.framework.protobuf.CodedOutputStream p0) throws java.io.IOException;
    public abstract double readDouble() throws java.io.IOException;
    public abstract float readFloat() throws java.io.IOException;
    public abstract long readUInt64() throws java.io.IOException;
    public abstract long readInt64() throws java.io.IOException;
    public abstract int readInt32() throws java.io.IOException;
    public abstract long readFixed64() throws java.io.IOException;
    public abstract int readFixed32() throws java.io.IOException;
    public abstract boolean readBool() throws java.io.IOException;
    public abstract java.lang.String readString() throws java.io.IOException;
    public abstract java.lang.String readStringRequireUtf8() throws java.io.IOException;
    public abstract void readGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    public abstract <T extends com.android.framework.protobuf.MessageLite> T readGroup(int p0, com.android.framework.protobuf.Parser<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    @java.lang.Deprecated
    public abstract void readUnknownGroup(int p0, com.android.framework.protobuf.MessageLite.Builder p1) throws java.io.IOException;
    public abstract void readMessage(com.android.framework.protobuf.MessageLite.Builder p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
    public abstract <T extends com.android.framework.protobuf.MessageLite> T readMessage(com.android.framework.protobuf.Parser<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
    public abstract com.android.framework.protobuf.ByteString readBytes() throws java.io.IOException;
    public abstract byte[] readByteArray() throws java.io.IOException;
    public abstract java.nio.ByteBuffer readByteBuffer() throws java.io.IOException;
    public abstract int readUInt32() throws java.io.IOException;
    public abstract int readEnum() throws java.io.IOException;
    public abstract int readSFixed32() throws java.io.IOException;
    public abstract long readSFixed64() throws java.io.IOException;
    public abstract int readSInt32() throws java.io.IOException;
    public abstract long readSInt64() throws java.io.IOException;
    public abstract int readRawVarint32() throws java.io.IOException;
    public abstract long readRawVarint64() throws java.io.IOException;
    abstract long readRawVarint64SlowPath() throws java.io.IOException;
    public abstract int readRawLittleEndian32() throws java.io.IOException;
    public abstract long readRawLittleEndian64() throws java.io.IOException;
    public abstract void enableAliasing(boolean p0);
    public final int setRecursionLimit(int p0) { return 0; }
    public final int setSizeLimit(int p0) { return 0; }
    final void discardUnknownFields() {}
    final void unsetDiscardUnknownFields() {}
    final boolean shouldDiscardUnknownFields() { return false; }
    public abstract void resetSizeCounter();
    public abstract int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public abstract void popLimit(int p0);
    public abstract int getBytesUntilLimit();
    public abstract boolean isAtEnd() throws java.io.IOException;
    public abstract int getTotalBytesRead();
    public abstract byte readRawByte() throws java.io.IOException;
    public abstract byte[] readRawBytes(int p0) throws java.io.IOException;
    public abstract void skipRawBytes(int p0) throws java.io.IOException;
    public static int decodeZigZag32(int p0) { return 0; }
    public static long decodeZigZag64(long p0) { return 0L; }
    public static int readRawVarint32(int p0, java.io.InputStream p1) throws java.io.IOException { return 0; }
    static int readRawVarint32(java.io.InputStream p0) throws java.io.IOException { return 0; }

    private static final class ArrayDecoder extends com.android.framework.protobuf.CodedInputStream {
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
        public long readRawVarint64() throws java.io.IOException { return 0L; }
        long readRawVarint64SlowPath() throws java.io.IOException { return 0L; }
        public int readRawLittleEndian32() throws java.io.IOException { return 0; }
        public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
        public void enableAliasing(boolean p0) {}
        public void resetSizeCounter() {}
        public int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return 0; }
        public void popLimit(int p0) {}
        public int getBytesUntilLimit() { return 0; }
        public boolean isAtEnd() throws java.io.IOException { return false; }
        public int getTotalBytesRead() { return 0; }
        public byte readRawByte() throws java.io.IOException { return 0; }
        public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
        public void skipRawBytes(int p0) throws java.io.IOException {}
    }

    private static final class IterableDirectByteBufferDecoder extends com.android.framework.protobuf.CodedInputStream {
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
        public long readRawVarint64() throws java.io.IOException { return 0L; }
        long readRawVarint64SlowPath() throws java.io.IOException { return 0L; }
        public int readRawLittleEndian32() throws java.io.IOException { return 0; }
        public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
        public void enableAliasing(boolean p0) {}
        public void resetSizeCounter() {}
        public int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return 0; }
        public void popLimit(int p0) {}
        public int getBytesUntilLimit() { return 0; }
        public boolean isAtEnd() throws java.io.IOException { return false; }
        public int getTotalBytesRead() { return 0; }
        public byte readRawByte() throws java.io.IOException { return 0; }
        public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
        public void skipRawBytes(int p0) throws java.io.IOException {}
    }

    private static final class StreamDecoder extends com.android.framework.protobuf.CodedInputStream {
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
        public long readRawVarint64() throws java.io.IOException { return 0L; }
        long readRawVarint64SlowPath() throws java.io.IOException { return 0L; }
        public int readRawLittleEndian32() throws java.io.IOException { return 0; }
        public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
        public void enableAliasing(boolean p0) {}
        public void resetSizeCounter() {}
        public int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return 0; }
        public void popLimit(int p0) {}
        public int getBytesUntilLimit() { return 0; }
        public boolean isAtEnd() throws java.io.IOException { return false; }
        public int getTotalBytesRead() { return 0; }
        public byte readRawByte() throws java.io.IOException { return 0; }
        public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
        public void skipRawBytes(int p0) throws java.io.IOException {}

        private static interface RefillCallback {
            public void onRefill();
        }

        private class SkippedDataSink implements com.android.framework.protobuf.CodedInputStream.StreamDecoder.RefillCallback {
            public void onRefill() {}
            java.nio.ByteBuffer getSkippedData() { return null; }
        }
    }

    private static final class UnsafeDirectNioDecoder extends com.android.framework.protobuf.CodedInputStream {
        static boolean isSupported() { return false; }
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
        public long readRawVarint64() throws java.io.IOException { return 0L; }
        long readRawVarint64SlowPath() throws java.io.IOException { return 0L; }
        public int readRawLittleEndian32() throws java.io.IOException { return 0; }
        public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
        public void enableAliasing(boolean p0) {}
        public void resetSizeCounter() {}
        public int pushLimit(int p0) throws com.android.framework.protobuf.InvalidProtocolBufferException { return 0; }
        public void popLimit(int p0) {}
        public int getBytesUntilLimit() { return 0; }
        public boolean isAtEnd() throws java.io.IOException { return false; }
        public int getTotalBytesRead() { return 0; }
        public byte readRawByte() throws java.io.IOException { return 0; }
        public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
        public void skipRawBytes(int p0) throws java.io.IOException {}
    }
}
