package android.hardware.camera2.marshal.impl;

public class MarshalQueryableColorSpaceTransform implements android.hardware.camera2.marshal.MarshalQueryable<android.hardware.camera2.params.ColorSpaceTransform> {
    public MarshalQueryableColorSpaceTransform() {}
    public android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.ColorSpaceTransform> createMarshaler(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.ColorSpaceTransform> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.ColorSpaceTransform> p0, int p1) { return false; }

    private class MarshalerColorSpaceTransform extends android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.ColorSpaceTransform> {
        protected MarshalerColorSpaceTransform(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.ColorSpaceTransform> p0, int p1) { super(null, null, 0); }
        public void marshal(android.hardware.camera2.params.ColorSpaceTransform p0, java.nio.ByteBuffer p1) {}
        public android.hardware.camera2.params.ColorSpaceTransform unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
