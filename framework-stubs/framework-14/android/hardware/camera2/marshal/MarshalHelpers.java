package android.hardware.camera2.marshal;

public final class MarshalHelpers {
    public static final int SIZEOF_BYTE = 1;
    public static final int SIZEOF_INT32 = 4;
    public static final int SIZEOF_INT64 = 8;
    public static final int SIZEOF_FLOAT = 4;
    public static final int SIZEOF_DOUBLE = 8;
    public static final int SIZEOF_RATIONAL = 8;
    public static int getPrimitiveTypeSize(int p0) { return 0; }
    public static <T extends java.lang.Object> java.lang.Class<T> checkPrimitiveClass(java.lang.Class<T> p0) { return null; }
    public static boolean isUnwrappedPrimitiveClass(java.lang.Class<?> p0) { return false; }
    public static <T extends java.lang.Object> boolean isPrimitiveClass(java.lang.Class<T> p0) { return false; }
    public static <T extends java.lang.Object> java.lang.Class<T> wrapClassIfPrimitive(java.lang.Class<T> p0) { return null; }
    public static java.lang.String toStringNativeType(int p0) { return null; }
    public static int checkNativeType(int p0) { return 0; }
    public static java.lang.Class<?> getPrimitiveTypeClass(int p0) { return null; }
    public static int checkNativeTypeEquals(int p0, int p1) { return 0; }
}
