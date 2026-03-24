package android.util;

public class TypedValue {
    public static final int TYPE_NULL = 0;
    public static final int TYPE_REFERENCE = 1;
    public static final int TYPE_ATTRIBUTE = 2;
    public static final int TYPE_STRING = 3;
    public static final int TYPE_FLOAT = 4;
    public static final int TYPE_DIMENSION = 5;
    public static final int TYPE_FRACTION = 6;
    public static final int TYPE_FIRST_INT = 16;
    public static final int TYPE_INT_DEC = 16;
    public static final int TYPE_INT_HEX = 17;
    public static final int TYPE_INT_BOOLEAN = 18;
    public static final int TYPE_FIRST_COLOR_INT = 28;
    public static final int TYPE_INT_COLOR_ARGB8 = 28;
    public static final int TYPE_INT_COLOR_RGB8 = 29;
    public static final int TYPE_INT_COLOR_ARGB4 = 30;
    public static final int TYPE_INT_COLOR_RGB4 = 31;
    public static final int TYPE_LAST_COLOR_INT = 31;
    public static final int TYPE_LAST_INT = 31;
    public static final int COMPLEX_UNIT_SHIFT = 0;
    public static final int COMPLEX_UNIT_MASK = 15;
    public static final int COMPLEX_UNIT_PX = 0;
    public static final int COMPLEX_UNIT_DIP = 1;
    public static final int COMPLEX_UNIT_SP = 2;
    public static final int COMPLEX_UNIT_PT = 3;
    public static final int COMPLEX_UNIT_IN = 4;
    public static final int COMPLEX_UNIT_MM = 5;
    public static final int COMPLEX_UNIT_FRACTION = 0;
    public static final int COMPLEX_UNIT_FRACTION_PARENT = 1;
    public static final int COMPLEX_RADIX_SHIFT = 4;
    public static final int COMPLEX_RADIX_MASK = 3;
    public static final int COMPLEX_RADIX_23p0 = 0;
    public static final int COMPLEX_RADIX_16p7 = 1;
    public static final int COMPLEX_RADIX_8p15 = 2;
    public static final int COMPLEX_RADIX_0p23 = 3;
    public static final int COMPLEX_MANTISSA_SHIFT = 8;
    public static final int COMPLEX_MANTISSA_MASK = 16777215;
    public static final int DATA_NULL_UNDEFINED = 0;
    public static final int DATA_NULL_EMPTY = 1;
    public static final int DENSITY_DEFAULT = 0;
    public static final int DENSITY_NONE = 65535;
    public int type;
    public java.lang.CharSequence string;
    public int data;
    public int assetCookie;
    public int resourceId;
    public int changingConfigurations;
    public int density;
    public int sourceResourceId;
    public TypedValue() {}
    public final float getFloat() { return 0.0f; }
    public boolean isColorType() { return false; }
    public static float complexToFloat(int p0) { return 0.0f; }
    public static float complexToDimension(int p0, android.util.DisplayMetrics p1) { return 0.0f; }
    public static int complexToDimensionPixelOffset(int p0, android.util.DisplayMetrics p1) { return 0; }
    public static int complexToDimensionPixelSize(int p0, android.util.DisplayMetrics p1) { return 0; }
    @java.lang.Deprecated
    public static float complexToDimensionNoisy(int p0, android.util.DisplayMetrics p1) { return 0.0f; }
    public int getComplexUnit() { return 0; }
    public static float applyDimension(int p0, float p1, android.util.DisplayMetrics p2) { return 0.0f; }
    public float getDimension(android.util.DisplayMetrics p0) { return 0.0f; }
    public static int intToComplex(int p0) { return 0; }
    public static int floatToComplex(float p0) { return 0; }
    public static int createComplexDimension(int p0, int p1) { return 0; }
    public static int createComplexDimension(float p0, int p1) { return 0; }
    public static float complexToFraction(int p0, float p1, float p2) { return 0.0f; }
    public float getFraction(float p0, float p1) { return 0.0f; }
    public final java.lang.CharSequence coerceToString() { return null; }
    public static final java.lang.String coerceToString(int p0, int p1) { return null; }
    public void setTo(android.util.TypedValue p0) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ComplexDimensionUnit {
    }
}
