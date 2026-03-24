package com.android.framework.protobuf;

final class Utf8 {
    static final int MAX_BYTES_PER_CHAR = 3;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static boolean isValidUtf8(byte[] p0) { return false; }
    static boolean isValidUtf8(byte[] p0, int p1, int p2) { return false; }
    static int partialIsValidUtf8(int p0, byte[] p1, int p2, int p3) { return 0; }
    static int encodedLength(java.lang.CharSequence p0) { return 0; }
    static int encode(java.lang.CharSequence p0, byte[] p1, int p2, int p3) { return 0; }
    static boolean isValidUtf8(java.nio.ByteBuffer p0) { return false; }
    static int partialIsValidUtf8(int p0, java.nio.ByteBuffer p1, int p2, int p3) { return 0; }
    static java.lang.String decodeUtf8(java.nio.ByteBuffer p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
    static java.lang.String decodeUtf8(byte[] p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
    static void encodeUtf8(java.lang.CharSequence p0, java.nio.ByteBuffer p1) {}

    private static class DecodeUtil {
    }

    static abstract class Processor {
        Processor() {}
        final boolean isValidUtf8(byte[] p0, int p1, int p2) { return false; }
        abstract int partialIsValidUtf8(int p0, byte[] p1, int p2, int p3);
        final boolean isValidUtf8(java.nio.ByteBuffer p0, int p1, int p2) { return false; }
        final int partialIsValidUtf8(int p0, java.nio.ByteBuffer p1, int p2, int p3) { return 0; }
        abstract int partialIsValidUtf8Direct(int p0, java.nio.ByteBuffer p1, int p2, int p3);
        final int partialIsValidUtf8Default(int p0, java.nio.ByteBuffer p1, int p2, int p3) { return 0; }
        abstract java.lang.String decodeUtf8(byte[] p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException;
        final java.lang.String decodeUtf8(java.nio.ByteBuffer p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        abstract java.lang.String decodeUtf8Direct(java.nio.ByteBuffer p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException;
        final java.lang.String decodeUtf8Default(java.nio.ByteBuffer p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        abstract int encodeUtf8(java.lang.CharSequence p0, byte[] p1, int p2, int p3);
        final void encodeUtf8(java.lang.CharSequence p0, java.nio.ByteBuffer p1) {}
        abstract void encodeUtf8Direct(java.lang.CharSequence p0, java.nio.ByteBuffer p1);
        final void encodeUtf8Default(java.lang.CharSequence p0, java.nio.ByteBuffer p1) {}
    }

    static final class SafeProcessor extends com.android.framework.protobuf.Utf8.Processor {
        SafeProcessor() { super(); }
        int partialIsValidUtf8(int p0, byte[] p1, int p2, int p3) { return 0; }
        int partialIsValidUtf8Direct(int p0, java.nio.ByteBuffer p1, int p2, int p3) { return 0; }
        java.lang.String decodeUtf8(byte[] p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        java.lang.String decodeUtf8Direct(java.nio.ByteBuffer p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        int encodeUtf8(java.lang.CharSequence p0, byte[] p1, int p2, int p3) { return 0; }
        void encodeUtf8Direct(java.lang.CharSequence p0, java.nio.ByteBuffer p1) {}
    }

    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        UnpairedSurrogateException(int p0, int p1) { super(); }
    }

    static final class UnsafeProcessor extends com.android.framework.protobuf.Utf8.Processor {
        UnsafeProcessor() { super(); }
        static boolean isAvailable() { return false; }
        int partialIsValidUtf8(int p0, byte[] p1, int p2, int p3) { return 0; }
        int partialIsValidUtf8Direct(int p0, java.nio.ByteBuffer p1, int p2, int p3) { return 0; }
        java.lang.String decodeUtf8(byte[] p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        java.lang.String decodeUtf8Direct(java.nio.ByteBuffer p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
        int encodeUtf8(java.lang.CharSequence p0, byte[] p1, int p2, int p3) { return 0; }
        void encodeUtf8Direct(java.lang.CharSequence p0, java.nio.ByteBuffer p1) {}
    }
}
