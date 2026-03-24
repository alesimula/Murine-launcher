package android.util;

public final class Half extends java.lang.Number implements java.lang.Comparable<android.util.Half> {
    public static final int SIZE = 16;
    public static final short EPSILON = 5120;
    public static final int MAX_EXPONENT = 15;
    public static final int MIN_EXPONENT = -14;
    public static final short LOWEST_VALUE = -1025;
    public static final short MAX_VALUE = 31743;
    public static final short MIN_NORMAL = 1024;
    public static final short MIN_VALUE = 1;
    public static final short NaN = 32256;
    public static final short NEGATIVE_INFINITY = -1024;
    public static final short NEGATIVE_ZERO = -32768;
    public static final short POSITIVE_INFINITY = 31744;
    public static final short POSITIVE_ZERO = 0;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_COMBINED = 32767;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP32_SIGN_SHIFT = 31;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final float FP32_DENORMAL_FLOAT = Float.valueOf(0.0f);
    private final short mValue = 0;
    public Half(short p0) { super(); }
    public Half(float p0) { super(); }
    public Half(double p0) { super(); }
    public Half(java.lang.String p0) throws java.lang.NumberFormatException { super(); }
    public short halfValue() { return 0; }
    public byte byteValue() { return 0; }
    public short shortValue() { return 0; }
    public int intValue() { return 0; }
    public long longValue() { return 0L; }
    public float floatValue() { return 0.0f; }
    public double doubleValue() { return 0.0; }
    public boolean isNaN() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int compareTo(android.util.Half p0) { return 0; }
    public static int hashCode(short p0) { return 0; }
    public static int compare(short p0, short p1) { return 0; }
    public static short halfToShortBits(short p0) { return 0; }
    public static int halfToIntBits(short p0) { return 0; }
    public static int halfToRawIntBits(short p0) { return 0; }
    public static short intBitsToHalf(int p0) { return 0; }
    public static short copySign(short p0, short p1) { return 0; }
    public static short abs(short p0) { return 0; }
    public static short round(short p0) { return 0; }
    public static short ceil(short p0) { return 0; }
    public static short floor(short p0) { return 0; }
    public static short trunc(short p0) { return 0; }
    public static short min(short p0, short p1) { return 0; }
    public static short max(short p0, short p1) { return 0; }
    public static boolean less(short p0, short p1) { return false; }
    public static boolean lessEquals(short p0, short p1) { return false; }
    public static boolean greater(short p0, short p1) { return false; }
    public static boolean greaterEquals(short p0, short p1) { return false; }
    public static boolean equals(short p0, short p1) { return false; }
    public static int getSign(short p0) { return 0; }
    public static int getExponent(short p0) { return 0; }
    public static int getSignificand(short p0) { return 0; }
    public static boolean isInfinite(short p0) { return false; }
    public static boolean isNaN(short p0) { return false; }
    public static boolean isNormalized(short p0) { return false; }
    public static float toFloat(short p0) { return 0.0f; }
    public static short toHalf(float p0) { return 0; }
    public static android.util.Half valueOf(short p0) { return null; }
    public static android.util.Half valueOf(float p0) { return null; }
    public static android.util.Half valueOf(java.lang.String p0) { return null; }
    public static short parseHalf(java.lang.String p0) throws java.lang.NumberFormatException { return 0; }
    public static java.lang.String toString(short p0) { return null; }
    public static java.lang.String toHexString(short p0) { return null; }
}
