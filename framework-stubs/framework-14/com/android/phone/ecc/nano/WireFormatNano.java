package com.android.phone.ecc.nano;

public final class WireFormatNano {
    static final int WIRETYPE_VARINT = 0;
    static final int WIRETYPE_FIXED64 = 1;
    static final int WIRETYPE_LENGTH_DELIMITED = 2;
    static final int WIRETYPE_START_GROUP = 3;
    static final int WIRETYPE_END_GROUP = 4;
    static final int WIRETYPE_FIXED32 = 5;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int[] EMPTY_INT_ARRAY = null;
    public static final long[] EMPTY_LONG_ARRAY = null;
    public static final float[] EMPTY_FLOAT_ARRAY = null;
    public static final double[] EMPTY_DOUBLE_ARRAY = null;
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = null;
    public static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    public static final byte[][] EMPTY_BYTES_ARRAY = null;
    public static final byte[] EMPTY_BYTES = null;
    static int getTagWireType(int p0) { return 0; }
    public static int getTagFieldNumber(int p0) { return 0; }
    static int makeTag(int p0, int p1) { return 0; }
    public static boolean parseUnknownField(com.android.phone.ecc.nano.CodedInputByteBufferNano p0, int p1) throws java.io.IOException { return false; }
    public static final int getRepeatedFieldArrayLength(com.android.phone.ecc.nano.CodedInputByteBufferNano p0, int p1) throws java.io.IOException { return 0; }
}
