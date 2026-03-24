package android.hardware.camera2.marshal.impl;

public class MarshalQueryableSizeF implements android.hardware.camera2.marshal.MarshalQueryable<android.util.SizeF> {
    public MarshalQueryableSizeF() {}
    public android.hardware.camera2.marshal.Marshaler<android.util.SizeF> createMarshaler(android.hardware.camera2.utils.TypeReference<android.util.SizeF> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.util.SizeF> p0, int p1) { return false; }

    private class MarshalerSizeF extends android.hardware.camera2.marshal.Marshaler<android.util.SizeF> {
        protected MarshalerSizeF(android.hardware.camera2.utils.TypeReference<android.util.SizeF> p0, int p1) { super(null, null, 0); }
        public void marshal(android.util.SizeF p0, java.nio.ByteBuffer p1) {}
        public android.util.SizeF unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
