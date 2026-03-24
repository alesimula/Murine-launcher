package android.hardware.camera2.marshal.impl;

public class MarshalQueryableNativeByteToInteger implements android.hardware.camera2.marshal.MarshalQueryable<java.lang.Integer> {
    public MarshalQueryableNativeByteToInteger() {}
    public android.hardware.camera2.marshal.Marshaler<java.lang.Integer> createMarshaler(android.hardware.camera2.utils.TypeReference<java.lang.Integer> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<java.lang.Integer> p0, int p1) { return false; }

    private class MarshalerNativeByteToInteger extends android.hardware.camera2.marshal.Marshaler<java.lang.Integer> {
        protected MarshalerNativeByteToInteger(android.hardware.camera2.utils.TypeReference<java.lang.Integer> p0, int p1) { super(null, null, 0); }
        public void marshal(java.lang.Integer p0, java.nio.ByteBuffer p1) {}
        public java.lang.Integer unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
