package com.android.framework.protobuf;

final class Utf8 {
    private static final com.android.framework.protobuf.Utf8.Processor processor = null;
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int MAX_BYTES_PER_CHAR = 3;
    public static final int COMPLETE = 0;
    public static final int MALFORMED = -1;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    public static boolean isValidUtf8(byte[] p0) { return false; }
    public static boolean isValidUtf8(byte[] p0, int p1, int p2) { return false; }
    public static int partialIsValidUtf8(int p0, byte[] p1, int p2, int p3) { return 0; }
    private static int incompleteStateFor(int p0) { return 0; }
    private static int incompleteStateFor(int p0, int p1) { return 0; }
    private static int incompleteStateFor(int p0, int p1, int p2) { return 0; }
    private static int incompleteStateFor(byte[] p0, int p1, int p2) { return 0; }
    private static int incompleteStateFor(java.nio.ByteBuffer p0, int p1, int p2, int p3) { return 0; }
    static int encodedLength(java.lang.CharSequence p0) { return 0; }
    private static int encodedLengthGeneral(java.lang.CharSequence p0, int p1) { return 0; }
    static int encode(java.lang.CharSequence p0, byte[] p1, int p2, int p3) { return 0; }
    static boolean isValidUtf8(java.nio.ByteBuffer p0) { return false; }
    static int partialIsValidUtf8(int p0, java.nio.ByteBuffer p1, int p2, int p3) { return 0; }
    static java.lang.String decodeUtf8(java.nio.ByteBuffer p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
    static java.lang.String decodeUtf8(byte[] p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException { return null; }
    static void encodeUtf8(java.lang.CharSequence p0, java.nio.ByteBuffer p1) {}
    private static int estimateConsecutiveAscii(java.nio.ByteBuffer p0, int p1, int p2) { return 0; }
    private Utf8() {}

    private static class DecodeUtil {
        private DecodeUtil() {}
        private static boolean isOneByte(byte p0) { return false; }
        private static boolean isTwoBytes(byte p0) { return false; }
        private static boolean isThreeBytes(byte p0) { return false; }
        private static void handleOneByte(byte p0, char[] p1, int p2) {}
        private static void handleTwoBytes(byte p0, byte p1, char[] p2, int p3) throws com.android.framework.protobuf.InvalidProtocolBufferException {}
        private static void handleThreeBytes(byte p0, byte p1, byte p2, char[] p3, int p4) throws com.android.framework.protobuf.InvalidProtocolBufferException {}
        private static void handleFourBytes(byte p0, byte p1, byte p2, byte p3, char[] p4, int p5) throws com.android.framework.protobuf.InvalidProtocolBufferException {}
        private static boolean isNotTrailingByte(byte p0) { return false; }
        private static int trailingByteValue(byte p0) { return 0; }
        private static char highSurrogate(int p0) { return 0; }
        private static char lowSurrogate(int p0) { return 0; }
    }

    static abstract class Processor {
        Processor() {}
        final boolean isValidUtf8(byte[] p0, int p1, int p2) { return false; }
        abstract int partialIsValidUtf8(int p0, byte[] p1, int p2, int p3);
        final boolean isValidUtf8(java.nio.ByteBuffer p0, int p1, int p2) { return false; }
        final int partialIsValidUtf8(int p0, java.nio.ByteBuffer p1, int p2, int p3) { return 0; }
        abstract int partialIsValidUtf8Direct(int p0, java.nio.ByteBuffer p1, int p2, int p3);
        final int partialIsValidUtf8Default(int p0, java.nio.ByteBuffer p1, int p2, int p3) { return 0; }
        private static int partialIsValidUtf8(java.nio.ByteBuffer p0, int p1, int p2) { return 0; }
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
        private static int partialIsValidUtf8(byte[] p0, int p1, int p2) { return 0; }
        private static int partialIsValidUtf8NonAscii(byte[] p0, int p1, int p2) { return 0; }
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
        private static int unsafeEstimateConsecutiveAscii(byte[] p0, long p1, int p2) { return 0; }
        private static int unsafeEstimateConsecutiveAscii(long p0, int p1) { return 0; }
        private static int partialIsValidUtf8(byte[] p0, long p1, int p2) { return 0; }
        private static int partialIsValidUtf8(long p0, int p1) { return 0; }
        private static int unsafeIncompleteStateFor(byte[] p0, int p1, long p2, int p3) { return 0; }
        private static int unsafeIncompleteStateFor(long p0, int p1, int p2) { return 0; }
    }
}
