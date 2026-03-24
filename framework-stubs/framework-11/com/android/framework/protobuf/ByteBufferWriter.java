package com.android.framework.protobuf;

final class ByteBufferWriter {
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> BUFFER = null;
    private static final java.lang.Class<?> FILE_OUTPUT_STREAM_CLASS = null;
    private static final long CHANNEL_FIELD_OFFSET = Long.valueOf(0L);
    private ByteBufferWriter() {}
    static void clearCachedBuffer() {}
    static void write(java.nio.ByteBuffer p0, java.io.OutputStream p1) throws java.io.IOException {}
    private static byte[] getOrCreateBuffer(int p0) { return null; }
    private static boolean needToReallocate(int p0, int p1) { return false; }
    private static byte[] getBuffer() { return null; }
    private static void setBuffer(byte[] p0) {}
    private static boolean writeToChannel(java.nio.ByteBuffer p0, java.io.OutputStream p1) throws java.io.IOException { return false; }
    private static java.lang.Class<?> safeGetClass(java.lang.String p0) { return null; }
    private static long getChannelFieldOffset(java.lang.Class<?> p0) { return 0L; }
}
