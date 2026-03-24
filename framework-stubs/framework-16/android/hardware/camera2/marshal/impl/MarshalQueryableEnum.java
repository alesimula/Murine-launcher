package android.hardware.camera2.marshal.impl;

public class MarshalQueryableEnum<T extends java.lang.Enum<T>> implements android.hardware.camera2.marshal.MarshalQueryable<T> {
    public MarshalQueryableEnum() {}
    public android.hardware.camera2.marshal.Marshaler<T> createMarshaler(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return false; }
    public static <T extends java.lang.Enum<T>> void registerEnumValues(java.lang.Class<T> p0, int[] p1) {}

    private class MarshalerEnum extends android.hardware.camera2.marshal.Marshaler<T> {
        protected MarshalerEnum(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { super(null, null, 0); }
        public void marshal(T p0, java.nio.ByteBuffer p1) {}
        public T unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
