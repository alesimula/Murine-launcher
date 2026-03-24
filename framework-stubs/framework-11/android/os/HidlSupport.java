package android.os;

@android.annotation.SystemApi
public class HidlSupport {
    @android.annotation.SystemApi
    public static boolean deepEquals(java.lang.Object p0, java.lang.Object p1) { return false; }
    @android.annotation.SystemApi
    public static int deepHashCode(java.lang.Object p0) { return 0; }
    private static void throwErrorIfUnsupportedType(java.lang.Object p0) {}
    private static int primitiveArrayHashCode(java.lang.Object p0) { return 0; }
    @android.annotation.SystemApi
    public static boolean interfacesEqual(android.os.IHwInterface p0, java.lang.Object p1) { return false; }
    @android.annotation.SystemApi
    public static native int getPidIfSharable();
    public HidlSupport() {}

    public static final class Mutable<E extends java.lang.Object> {
        public E value;
        public Mutable() {}
        public Mutable(E p0) {}
    }
}
