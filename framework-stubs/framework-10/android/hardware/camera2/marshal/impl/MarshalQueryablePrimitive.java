package android.hardware.camera2.marshal.impl;

public final class MarshalQueryablePrimitive<T extends java.lang.Object> implements android.hardware.camera2.marshal.MarshalQueryable<T> {
    public MarshalQueryablePrimitive() {}
    public android.hardware.camera2.marshal.Marshaler<T> createMarshaler(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return false; }

    private class MarshalerPrimitive extends android.hardware.camera2.marshal.Marshaler<T> {
        private final java.lang.Class<T> mClass = null;
        protected MarshalerPrimitive(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { super(null, null, 0); }
        public T unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int calculateMarshalSize(T p0) { return 0; }
        public void marshal(T p0, java.nio.ByteBuffer p1) {}
        private void marshalPrimitive(int p0, java.nio.ByteBuffer p1) {}
        private void marshalPrimitive(float p0, java.nio.ByteBuffer p1) {}
        private void marshalPrimitive(double p0, java.nio.ByteBuffer p1) {}
        private void marshalPrimitive(long p0, java.nio.ByteBuffer p1) {}
        private void marshalPrimitive(android.util.Rational p0, java.nio.ByteBuffer p1) {}
        private void marshalPrimitive(byte p0, java.nio.ByteBuffer p1) {}
        private java.lang.Object unmarshalObject(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
