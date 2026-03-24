package com.android.framework.protobuf.nano;

public final class InternalNano {
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_UINT64 = 4;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    static final java.nio.charset.Charset UTF_8 = null;
    static final java.nio.charset.Charset ISO_8859_1 = null;
    public static final java.lang.Object LAZY_INIT_LOCK = null;
    private InternalNano() {}
    public static java.lang.String stringDefaultValue(java.lang.String p0) { return null; }
    public static byte[] bytesDefaultValue(java.lang.String p0) { return null; }
    public static byte[] copyFromUtf8(java.lang.String p0) { return null; }
    public static boolean equals(int[] p0, int[] p1) { return false; }
    public static boolean equals(long[] p0, long[] p1) { return false; }
    public static boolean equals(float[] p0, float[] p1) { return false; }
    public static boolean equals(double[] p0, double[] p1) { return false; }
    public static boolean equals(boolean[] p0, boolean[] p1) { return false; }
    public static boolean equals(byte[][] p0, byte[][] p1) { return false; }
    public static boolean equals(java.lang.Object[] p0, java.lang.Object[] p1) { return false; }
    public static int hashCode(int[] p0) { return 0; }
    public static int hashCode(long[] p0) { return 0; }
    public static int hashCode(float[] p0) { return 0; }
    public static int hashCode(double[] p0) { return 0; }
    public static int hashCode(boolean[] p0) { return 0; }
    public static int hashCode(byte[][] p0) { return 0; }
    public static int hashCode(java.lang.Object[] p0) { return 0; }
    private static java.lang.Object primitiveDefaultValue(int p0) { return null; }
    public static final <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> mergeMapEntry(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0, java.util.Map<K, V> p1, com.android.framework.protobuf.nano.MapFactories.MapFactory p2, int p3, int p4, V p5, int p6, int p7) throws java.io.IOException { return null; }
    public static <K extends java.lang.Object, V extends java.lang.Object> void serializeMapField(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0, java.util.Map<K, V> p1, int p2, int p3, int p4) throws java.io.IOException {}
    public static <K extends java.lang.Object, V extends java.lang.Object> int computeMapFieldSize(java.util.Map<K, V> p0, int p1, int p2, int p3) { return 0; }
    public static <K extends java.lang.Object, V extends java.lang.Object> boolean equals(java.util.Map<K, V> p0, java.util.Map<K, V> p1) { return false; }
    private static boolean equalsMapValue(java.lang.Object p0, java.lang.Object p1) { return false; }
    public static <K extends java.lang.Object, V extends java.lang.Object> int hashCode(java.util.Map<K, V> p0) { return 0; }
    private static int hashCodeForMap(java.lang.Object p0) { return 0; }
    public static void cloneUnknownFieldData(com.android.framework.protobuf.nano.ExtendableMessageNano p0, com.android.framework.protobuf.nano.ExtendableMessageNano p1) {}
}
