package android.hardware.camera2.marshal.impl;

public class MarshalQueryableSize implements android.hardware.camera2.marshal.MarshalQueryable<android.util.Size> {
    private static final int SIZE = 8;
    public MarshalQueryableSize() {}
    public android.hardware.camera2.marshal.Marshaler<android.util.Size> createMarshaler(android.hardware.camera2.utils.TypeReference<android.util.Size> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.util.Size> p0, int p1) { return false; }

    private class MarshalerSize extends android.hardware.camera2.marshal.Marshaler<android.util.Size> {
        protected MarshalerSize(android.hardware.camera2.utils.TypeReference<android.util.Size> p0, int p1) { super(null, null, 0); }
        public void marshal(android.util.Size p0, java.nio.ByteBuffer p1) {}
        public android.util.Size unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
