package android.hardware.camera2.utils;

public abstract class TypeReference<T extends java.lang.Object> {
    private final java.lang.reflect.Type mType = null;
    private final int mHash = 0;
    @android.annotation.UnsupportedAppUsage
    protected TypeReference() {}
    public java.lang.reflect.Type getType() { return null; }
    private TypeReference(java.lang.reflect.Type p0) {}
    public static <T extends java.lang.Object> android.hardware.camera2.utils.TypeReference<T> createSpecializedTypeReference(java.lang.Class<T> p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.hardware.camera2.utils.TypeReference<?> createSpecializedTypeReference(java.lang.reflect.Type p0) { return null; }
    public final java.lang.Class<? super T> getRawType() { return null; }
    private static final java.lang.Class<?> getRawType(java.lang.reflect.Type p0) { return null; }
    private static final java.lang.Class<?> getRawType(java.lang.reflect.Type[] p0) { return null; }
    private static final java.lang.Class<?> getArrayClass(java.lang.Class<?> p0) { return null; }
    public android.hardware.camera2.utils.TypeReference<?> getComponentType() { return null; }
    private static java.lang.reflect.Type getComponentType(java.lang.reflect.Type p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static boolean containsTypeVariable(java.lang.reflect.Type p0) { return false; }
    public java.lang.String toString() { return null; }
    private static void toString(java.lang.reflect.Type p0, java.lang.StringBuilder p1) {}
    private static void toString(java.lang.reflect.Type[] p0, java.lang.StringBuilder p1) {}
    private static boolean containsTypeVariable(java.lang.reflect.Type[] p0) { return false; }

    private static class SpecializedTypeReference<T extends java.lang.Object> extends android.hardware.camera2.utils.TypeReference<T> {
        public SpecializedTypeReference(java.lang.Class<T> p0) { super(); }
    }

    private static class SpecializedBaseTypeReference extends android.hardware.camera2.utils.TypeReference {
        public SpecializedBaseTypeReference(java.lang.reflect.Type p0) { super(); }
    }
}
