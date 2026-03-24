package android.hardware.camera2.marshal.impl;

public class MarshalQueryableBoolean implements android.hardware.camera2.marshal.MarshalQueryable<java.lang.Boolean> {
    public MarshalQueryableBoolean() {}
    public android.hardware.camera2.marshal.Marshaler<java.lang.Boolean> createMarshaler(android.hardware.camera2.utils.TypeReference<java.lang.Boolean> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<java.lang.Boolean> p0, int p1) { return false; }

    private class MarshalerBoolean extends android.hardware.camera2.marshal.Marshaler<java.lang.Boolean> {
        protected MarshalerBoolean(android.hardware.camera2.utils.TypeReference<java.lang.Boolean> p0, int p1) { super(null, null, 0); }
        public void marshal(java.lang.Boolean p0, java.nio.ByteBuffer p1) {}
        public java.lang.Boolean unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
