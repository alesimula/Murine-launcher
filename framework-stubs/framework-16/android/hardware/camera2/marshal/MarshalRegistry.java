package android.hardware.camera2.marshal;

public class MarshalRegistry {
    public static <T extends java.lang.Object> void registerMarshalQueryable(android.hardware.camera2.marshal.MarshalQueryable<T> p0) {}
    public static <T extends java.lang.Object> android.hardware.camera2.marshal.Marshaler<T> getMarshaler(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return null; }

    private static class MarshalToken<T extends java.lang.Object> {
        final android.hardware.camera2.utils.TypeReference<T> typeReference = null;
        final int nativeType = 0;
        public MarshalToken(android.hardware.camera2.utils.TypeReference<T> p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
