package com.android.framework.protobuf;

public abstract class CodedOutputStream extends com.android.framework.protobuf.ByteOutput {
    private static final java.util.logging.Logger logger = null;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = Boolean.valueOf(false);
    private static final long ARRAY_BASE_OFFSET = Long.valueOf(0L);
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int MAX_VARINT_SIZE = 10;
    @java.lang.Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    static int computePreferredBufferSize(int p0) { return 0; }
    public static com.android.framework.protobuf.CodedOutputStream newInstance(java.io.OutputStream p0) { return null; }
    public static com.android.framework.protobuf.CodedOutputStream newInstance(java.io.OutputStream p0, int p1) { return null; }
    public static com.android.framework.protobuf.CodedOutputStream newInstance(byte[] p0) { return null; }
    public static com.android.framework.protobuf.CodedOutputStream newInstance(byte[] p0, int p1, int p2) { return null; }
    public static com.android.framework.protobuf.CodedOutputStream newInstance(java.nio.ByteBuffer p0) { return null; }
    @java.lang.Deprecated
    public static com.android.framework.protobuf.CodedOutputStream newInstance(java.nio.ByteBuffer p0, int p1) { return null; }
    static com.android.framework.protobuf.CodedOutputStream newInstance(com.android.framework.protobuf.ByteOutput p0, int p1) { return null; }
    private CodedOutputStream() { super(); }
    public abstract void writeTag(int p0, int p1) throws java.io.IOException;
    public abstract void writeInt32(int p0, int p1) throws java.io.IOException;
    public abstract void writeUInt32(int p0, int p1) throws java.io.IOException;
    public final void writeSInt32(int p0, int p1) throws java.io.IOException {}
    public abstract void writeFixed32(int p0, int p1) throws java.io.IOException;
    public final void writeSFixed32(int p0, int p1) throws java.io.IOException {}
    public final void writeInt64(int p0, long p1) throws java.io.IOException {}
    public abstract void writeUInt64(int p0, long p1) throws java.io.IOException;
    public final void writeSInt64(int p0, long p1) throws java.io.IOException {}
    public abstract void writeFixed64(int p0, long p1) throws java.io.IOException;
    public final void writeSFixed64(int p0, long p1) throws java.io.IOException {}
    public final void writeFloat(int p0, float p1) throws java.io.IOException {}
    public final void writeDouble(int p0, double p1) throws java.io.IOException {}
    public abstract void writeBool(int p0, boolean p1) throws java.io.IOException;
    public final void writeEnum(int p0, int p1) throws java.io.IOException {}
    public abstract void writeString(int p0, java.lang.String p1) throws java.io.IOException;
    public abstract void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException;
    public abstract void writeByteArray(int p0, byte[] p1) throws java.io.IOException;
    public abstract void writeByteArray(int p0, byte[] p1, int p2, int p3) throws java.io.IOException;
    public abstract void writeByteBuffer(int p0, java.nio.ByteBuffer p1) throws java.io.IOException;
    public final void writeRawByte(byte p0) throws java.io.IOException {}
    public final void writeRawByte(int p0) throws java.io.IOException {}
    public final void writeRawBytes(byte[] p0) throws java.io.IOException {}
    public final void writeRawBytes(byte[] p0, int p1, int p2) throws java.io.IOException {}
    public final void writeRawBytes(com.android.framework.protobuf.ByteString p0) throws java.io.IOException {}
    public abstract void writeRawBytes(java.nio.ByteBuffer p0) throws java.io.IOException;
    public abstract void writeMessage(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException;
    public abstract void writeMessageSetExtension(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException;
    public abstract void writeRawMessageSetExtension(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException;
    public abstract void writeInt32NoTag(int p0) throws java.io.IOException;
    public abstract void writeUInt32NoTag(int p0) throws java.io.IOException;
    public final void writeSInt32NoTag(int p0) throws java.io.IOException {}
    public abstract void writeFixed32NoTag(int p0) throws java.io.IOException;
    public final void writeSFixed32NoTag(int p0) throws java.io.IOException {}
    public final void writeInt64NoTag(long p0) throws java.io.IOException {}
    public abstract void writeUInt64NoTag(long p0) throws java.io.IOException;
    public final void writeSInt64NoTag(long p0) throws java.io.IOException {}
    public abstract void writeFixed64NoTag(long p0) throws java.io.IOException;
    public final void writeSFixed64NoTag(long p0) throws java.io.IOException {}
    public final void writeFloatNoTag(float p0) throws java.io.IOException {}
    public final void writeDoubleNoTag(double p0) throws java.io.IOException {}
    public final void writeBoolNoTag(boolean p0) throws java.io.IOException {}
    public final void writeEnumNoTag(int p0) throws java.io.IOException {}
    public abstract void writeStringNoTag(java.lang.String p0) throws java.io.IOException;
    public abstract void writeBytesNoTag(com.android.framework.protobuf.ByteString p0) throws java.io.IOException;
    public final void writeByteArrayNoTag(byte[] p0) throws java.io.IOException {}
    public abstract void writeMessageNoTag(com.android.framework.protobuf.MessageLite p0) throws java.io.IOException;
    public abstract void write(byte p0) throws java.io.IOException;
    public abstract void write(byte[] p0, int p1, int p2) throws java.io.IOException;
    public abstract void writeLazy(byte[] p0, int p1, int p2) throws java.io.IOException;
    public abstract void write(java.nio.ByteBuffer p0) throws java.io.IOException;
    public abstract void writeLazy(java.nio.ByteBuffer p0) throws java.io.IOException;
    public static int computeInt32Size(int p0, int p1) { return 0; }
    public static int computeUInt32Size(int p0, int p1) { return 0; }
    public static int computeSInt32Size(int p0, int p1) { return 0; }
    public static int computeFixed32Size(int p0, int p1) { return 0; }
    public static int computeSFixed32Size(int p0, int p1) { return 0; }
    public static int computeInt64Size(int p0, long p1) { return 0; }
    public static int computeUInt64Size(int p0, long p1) { return 0; }
    public static int computeSInt64Size(int p0, long p1) { return 0; }
    public static int computeFixed64Size(int p0, long p1) { return 0; }
    public static int computeSFixed64Size(int p0, long p1) { return 0; }
    public static int computeFloatSize(int p0, float p1) { return 0; }
    public static int computeDoubleSize(int p0, double p1) { return 0; }
    public static int computeBoolSize(int p0, boolean p1) { return 0; }
    public static int computeEnumSize(int p0, int p1) { return 0; }
    public static int computeStringSize(int p0, java.lang.String p1) { return 0; }
    public static int computeBytesSize(int p0, com.android.framework.protobuf.ByteString p1) { return 0; }
    public static int computeByteArraySize(int p0, byte[] p1) { return 0; }
    public static int computeByteBufferSize(int p0, java.nio.ByteBuffer p1) { return 0; }
    public static int computeLazyFieldSize(int p0, com.android.framework.protobuf.LazyFieldLite p1) { return 0; }
    public static int computeMessageSize(int p0, com.android.framework.protobuf.MessageLite p1) { return 0; }
    public static int computeMessageSetExtensionSize(int p0, com.android.framework.protobuf.MessageLite p1) { return 0; }
    public static int computeRawMessageSetExtensionSize(int p0, com.android.framework.protobuf.ByteString p1) { return 0; }
    public static int computeLazyFieldMessageSetExtensionSize(int p0, com.android.framework.protobuf.LazyFieldLite p1) { return 0; }
    public static int computeTagSize(int p0) { return 0; }
    public static int computeInt32SizeNoTag(int p0) { return 0; }
    public static int computeUInt32SizeNoTag(int p0) { return 0; }
    public static int computeSInt32SizeNoTag(int p0) { return 0; }
    public static int computeFixed32SizeNoTag(int p0) { return 0; }
    public static int computeSFixed32SizeNoTag(int p0) { return 0; }
    public static int computeInt64SizeNoTag(long p0) { return 0; }
    public static int computeUInt64SizeNoTag(long p0) { return 0; }
    public static int computeSInt64SizeNoTag(long p0) { return 0; }
    public static int computeFixed64SizeNoTag(long p0) { return 0; }
    public static int computeSFixed64SizeNoTag(long p0) { return 0; }
    public static int computeFloatSizeNoTag(float p0) { return 0; }
    public static int computeDoubleSizeNoTag(double p0) { return 0; }
    public static int computeBoolSizeNoTag(boolean p0) { return 0; }
    public static int computeEnumSizeNoTag(int p0) { return 0; }
    public static int computeStringSizeNoTag(java.lang.String p0) { return 0; }
    public static int computeLazyFieldSizeNoTag(com.android.framework.protobuf.LazyFieldLite p0) { return 0; }
    public static int computeBytesSizeNoTag(com.android.framework.protobuf.ByteString p0) { return 0; }
    public static int computeByteArraySizeNoTag(byte[] p0) { return 0; }
    public static int computeByteBufferSizeNoTag(java.nio.ByteBuffer p0) { return 0; }
    public static int computeMessageSizeNoTag(com.android.framework.protobuf.MessageLite p0) { return 0; }
    private static int computeLengthDelimitedFieldSize(int p0) { return 0; }
    public static int encodeZigZag32(int p0) { return 0; }
    public static long encodeZigZag64(long p0) { return 0L; }
    public abstract void flush() throws java.io.IOException;
    public abstract int spaceLeft();
    public final void checkNoSpaceLeft() {}
    public abstract int getTotalBytesWritten();
    abstract void writeByteArrayNoTag(byte[] p0, int p1, int p2) throws java.io.IOException;
    final void inefficientWriteStringNoTag(java.lang.String p0, com.android.framework.protobuf.Utf8.UnpairedSurrogateException p1) throws java.io.IOException {}
    @java.lang.Deprecated
    public final void writeGroup(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException {}
    @java.lang.Deprecated
    public final void writeGroupNoTag(com.android.framework.protobuf.MessageLite p0) throws java.io.IOException {}
    @java.lang.Deprecated
    public static int computeGroupSize(int p0, com.android.framework.protobuf.MessageLite p1) { return 0; }
    @java.lang.Deprecated
    public static int computeGroupSizeNoTag(com.android.framework.protobuf.MessageLite p0) { return 0; }
    @java.lang.Deprecated
    public final void writeRawVarint32(int p0) throws java.io.IOException {}
    @java.lang.Deprecated
    public final void writeRawVarint64(long p0) throws java.io.IOException {}
    @java.lang.Deprecated
    public static int computeRawVarint32Size(int p0) { return 0; }
    @java.lang.Deprecated
    public static int computeRawVarint64Size(long p0) { return 0; }
    @java.lang.Deprecated
    public final void writeRawLittleEndian32(int p0) throws java.io.IOException {}
    @java.lang.Deprecated
    public final void writeRawLittleEndian64(long p0) throws java.io.IOException {}
    private static sun.misc.Unsafe getUnsafe() { return null; }
    private static boolean supportsUnsafeArrayOperations() { return false; }
    private static <T extends java.lang.Object> int byteArrayBaseOffset() { return 0; }

    private static final class OutputStreamEncoder extends com.android.framework.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final java.io.OutputStream out = null;
        OutputStreamEncoder(java.io.OutputStream p0, int p1) { super(0); }
        public void writeTag(int p0, int p1) throws java.io.IOException {}
        public void writeInt32(int p0, int p1) throws java.io.IOException {}
        public void writeUInt32(int p0, int p1) throws java.io.IOException {}
        public void writeFixed32(int p0, int p1) throws java.io.IOException {}
        public void writeUInt64(int p0, long p1) throws java.io.IOException {}
        public void writeFixed64(int p0, long p1) throws java.io.IOException {}
        public void writeBool(int p0, boolean p1) throws java.io.IOException {}
        public void writeString(int p0, java.lang.String p1) throws java.io.IOException {}
        public void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException {}
        public void writeByteArray(int p0, byte[] p1) throws java.io.IOException {}
        public void writeByteArray(int p0, byte[] p1, int p2, int p3) throws java.io.IOException {}
        public void writeByteBuffer(int p0, java.nio.ByteBuffer p1) throws java.io.IOException {}
        public void writeBytesNoTag(com.android.framework.protobuf.ByteString p0) throws java.io.IOException {}
        public void writeByteArrayNoTag(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void writeRawBytes(java.nio.ByteBuffer p0) throws java.io.IOException {}
        public void writeMessage(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException {}
        public void writeMessageSetExtension(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException {}
        public void writeRawMessageSetExtension(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException {}
        public void writeMessageNoTag(com.android.framework.protobuf.MessageLite p0) throws java.io.IOException {}
        public void write(byte p0) throws java.io.IOException {}
        public void writeInt32NoTag(int p0) throws java.io.IOException {}
        public void writeUInt32NoTag(int p0) throws java.io.IOException {}
        public void writeFixed32NoTag(int p0) throws java.io.IOException {}
        public void writeUInt64NoTag(long p0) throws java.io.IOException {}
        public void writeFixed64NoTag(long p0) throws java.io.IOException {}
        public void writeStringNoTag(java.lang.String p0) throws java.io.IOException {}
        public void flush() throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void writeLazy(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void write(java.nio.ByteBuffer p0) throws java.io.IOException {}
        public void writeLazy(java.nio.ByteBuffer p0) throws java.io.IOException {}
        private void flushIfNotAvailable(int p0) throws java.io.IOException {}
        private void doFlush() throws java.io.IOException {}
    }

    public static class OutOfSpaceException extends java.io.IOException {
        private static final long serialVersionUID = -6947486886997889499L;
        private static final java.lang.String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        OutOfSpaceException() { super(); }
        OutOfSpaceException(java.lang.Throwable p0) { super(); }
    }

    private static final class NioHeapEncoder extends com.android.framework.protobuf.CodedOutputStream.ArrayEncoder {
        private final java.nio.ByteBuffer byteBuffer = null;
        private int initialPosition;
        NioHeapEncoder(java.nio.ByteBuffer p0) { super(null, 0, 0); }
        public void flush() {}
    }

    private static final class NioEncoder extends com.android.framework.protobuf.CodedOutputStream {
        private final java.nio.ByteBuffer originalBuffer = null;
        private final java.nio.ByteBuffer buffer = null;
        private final int initialPosition = 0;
        NioEncoder(java.nio.ByteBuffer p0) { super(); }
        public void writeTag(int p0, int p1) throws java.io.IOException {}
        public void writeInt32(int p0, int p1) throws java.io.IOException {}
        public void writeUInt32(int p0, int p1) throws java.io.IOException {}
        public void writeFixed32(int p0, int p1) throws java.io.IOException {}
        public void writeUInt64(int p0, long p1) throws java.io.IOException {}
        public void writeFixed64(int p0, long p1) throws java.io.IOException {}
        public void writeBool(int p0, boolean p1) throws java.io.IOException {}
        public void writeString(int p0, java.lang.String p1) throws java.io.IOException {}
        public void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException {}
        public void writeByteArray(int p0, byte[] p1) throws java.io.IOException {}
        public void writeByteArray(int p0, byte[] p1, int p2, int p3) throws java.io.IOException {}
        public void writeByteBuffer(int p0, java.nio.ByteBuffer p1) throws java.io.IOException {}
        public void writeMessage(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException {}
        public void writeMessageSetExtension(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException {}
        public void writeRawMessageSetExtension(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException {}
        public void writeMessageNoTag(com.android.framework.protobuf.MessageLite p0) throws java.io.IOException {}
        public void write(byte p0) throws java.io.IOException {}
        public void writeBytesNoTag(com.android.framework.protobuf.ByteString p0) throws java.io.IOException {}
        public void writeByteArrayNoTag(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void writeRawBytes(java.nio.ByteBuffer p0) throws java.io.IOException {}
        public void writeInt32NoTag(int p0) throws java.io.IOException {}
        public void writeUInt32NoTag(int p0) throws java.io.IOException {}
        public void writeFixed32NoTag(int p0) throws java.io.IOException {}
        public void writeUInt64NoTag(long p0) throws java.io.IOException {}
        public void writeFixed64NoTag(long p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void writeLazy(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void write(java.nio.ByteBuffer p0) throws java.io.IOException {}
        public void writeLazy(java.nio.ByteBuffer p0) throws java.io.IOException {}
        public void writeStringNoTag(java.lang.String p0) throws java.io.IOException {}
        public void flush() {}
        public int spaceLeft() { return 0; }
        public int getTotalBytesWritten() { return 0; }
        private void encode(java.lang.String p0) throws java.io.IOException {}
    }

    private static final class ByteOutputEncoder extends com.android.framework.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final com.android.framework.protobuf.ByteOutput out = null;
        ByteOutputEncoder(com.android.framework.protobuf.ByteOutput p0, int p1) { super(0); }
        public void writeTag(int p0, int p1) throws java.io.IOException {}
        public void writeInt32(int p0, int p1) throws java.io.IOException {}
        public void writeUInt32(int p0, int p1) throws java.io.IOException {}
        public void writeFixed32(int p0, int p1) throws java.io.IOException {}
        public void writeUInt64(int p0, long p1) throws java.io.IOException {}
        public void writeFixed64(int p0, long p1) throws java.io.IOException {}
        public void writeBool(int p0, boolean p1) throws java.io.IOException {}
        public void writeString(int p0, java.lang.String p1) throws java.io.IOException {}
        public void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException {}
        public void writeByteArray(int p0, byte[] p1) throws java.io.IOException {}
        public void writeByteArray(int p0, byte[] p1, int p2, int p3) throws java.io.IOException {}
        public void writeByteBuffer(int p0, java.nio.ByteBuffer p1) throws java.io.IOException {}
        public void writeBytesNoTag(com.android.framework.protobuf.ByteString p0) throws java.io.IOException {}
        public void writeByteArrayNoTag(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void writeRawBytes(java.nio.ByteBuffer p0) throws java.io.IOException {}
        public void writeMessage(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException {}
        public void writeMessageSetExtension(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException {}
        public void writeRawMessageSetExtension(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException {}
        public void writeMessageNoTag(com.android.framework.protobuf.MessageLite p0) throws java.io.IOException {}
        public void write(byte p0) throws java.io.IOException {}
        public void writeInt32NoTag(int p0) throws java.io.IOException {}
        public void writeUInt32NoTag(int p0) throws java.io.IOException {}
        public void writeFixed32NoTag(int p0) throws java.io.IOException {}
        public void writeUInt64NoTag(long p0) throws java.io.IOException {}
        public void writeFixed64NoTag(long p0) throws java.io.IOException {}
        public void writeStringNoTag(java.lang.String p0) throws java.io.IOException {}
        public void flush() throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void writeLazy(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void write(java.nio.ByteBuffer p0) throws java.io.IOException {}
        public void writeLazy(java.nio.ByteBuffer p0) throws java.io.IOException {}
        private void flushIfNotAvailable(int p0) throws java.io.IOException {}
        private void doFlush() throws java.io.IOException {}
    }

    private static class ArrayEncoder extends com.android.framework.protobuf.CodedOutputStream {
        private final byte[] buffer = null;
        private final int offset = 0;
        private final int limit = 0;
        private int position;
        ArrayEncoder(byte[] p0, int p1, int p2) { super(); }
        public final void writeTag(int p0, int p1) throws java.io.IOException {}
        public final void writeInt32(int p0, int p1) throws java.io.IOException {}
        public final void writeUInt32(int p0, int p1) throws java.io.IOException {}
        public final void writeFixed32(int p0, int p1) throws java.io.IOException {}
        public final void writeUInt64(int p0, long p1) throws java.io.IOException {}
        public final void writeFixed64(int p0, long p1) throws java.io.IOException {}
        public final void writeBool(int p0, boolean p1) throws java.io.IOException {}
        public final void writeString(int p0, java.lang.String p1) throws java.io.IOException {}
        public final void writeBytes(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException {}
        public final void writeByteArray(int p0, byte[] p1) throws java.io.IOException {}
        public final void writeByteArray(int p0, byte[] p1, int p2, int p3) throws java.io.IOException {}
        public final void writeByteBuffer(int p0, java.nio.ByteBuffer p1) throws java.io.IOException {}
        public final void writeBytesNoTag(com.android.framework.protobuf.ByteString p0) throws java.io.IOException {}
        public final void writeByteArrayNoTag(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public final void writeRawBytes(java.nio.ByteBuffer p0) throws java.io.IOException {}
        public final void writeMessage(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException {}
        public final void writeMessageSetExtension(int p0, com.android.framework.protobuf.MessageLite p1) throws java.io.IOException {}
        public final void writeRawMessageSetExtension(int p0, com.android.framework.protobuf.ByteString p1) throws java.io.IOException {}
        public final void writeMessageNoTag(com.android.framework.protobuf.MessageLite p0) throws java.io.IOException {}
        public final void write(byte p0) throws java.io.IOException {}
        public final void writeInt32NoTag(int p0) throws java.io.IOException {}
        public final void writeUInt32NoTag(int p0) throws java.io.IOException {}
        public final void writeFixed32NoTag(int p0) throws java.io.IOException {}
        public final void writeUInt64NoTag(long p0) throws java.io.IOException {}
        public final void writeFixed64NoTag(long p0) throws java.io.IOException {}
        public final void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public final void writeLazy(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public final void write(java.nio.ByteBuffer p0) throws java.io.IOException {}
        public final void writeLazy(java.nio.ByteBuffer p0) throws java.io.IOException {}
        public final void writeStringNoTag(java.lang.String p0) throws java.io.IOException {}
        public void flush() {}
        public final int spaceLeft() { return 0; }
        public final int getTotalBytesWritten() { return 0; }
    }

    private static abstract class AbstractBufferedEncoder extends com.android.framework.protobuf.CodedOutputStream {
        final byte[] buffer = null;
        final int limit = 0;
        int position;
        int totalBytesWritten;
        AbstractBufferedEncoder(int p0) { super(); }
        public final int spaceLeft() { return 0; }
        public final int getTotalBytesWritten() { return 0; }
        final void buffer(byte p0) {}
        final void bufferTag(int p0, int p1) {}
        final void bufferInt32NoTag(int p0) {}
        final void bufferUInt32NoTag(int p0) {}
        final void bufferUInt64NoTag(long p0) {}
        final void bufferFixed32NoTag(int p0) {}
        final void bufferFixed64NoTag(long p0) {}
    }
}
