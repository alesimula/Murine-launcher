package android.hardware.camera2.marshal.impl;

public class MarshalQueryableArray<T extends java.lang.Object> implements android.hardware.camera2.marshal.MarshalQueryable<T> {
    public MarshalQueryableArray() {}
    public android.hardware.camera2.marshal.Marshaler<T> createMarshaler(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return false; }

    private class MarshalerArray extends android.hardware.camera2.marshal.Marshaler<T> {
        protected MarshalerArray(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { super(null, null, 0); }
        public void marshal(T p0, java.nio.ByteBuffer p1) {}
        public T unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
        public int calculateMarshalSize(T p0) { return 0; }
    }

    private static interface PrimitiveArrayFiller {
        public void fillArray(java.lang.Object p0, int p1, java.nio.ByteBuffer p2);
        public static android.hardware.camera2.marshal.impl.MarshalQueryableArray.PrimitiveArrayFiller getPrimitiveArrayFiller(java.lang.Class<?> p0) { return null; }
    }
}
