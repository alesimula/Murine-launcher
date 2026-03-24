package android.hardware.camera2.marshal.impl;

public class MarshalQueryableMeteringRectangle implements android.hardware.camera2.marshal.MarshalQueryable<android.hardware.camera2.params.MeteringRectangle> {
    public MarshalQueryableMeteringRectangle() {}
    public android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.MeteringRectangle> createMarshaler(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.MeteringRectangle> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.MeteringRectangle> p0, int p1) { return false; }

    private class MarshalerMeteringRectangle extends android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.MeteringRectangle> {
        protected MarshalerMeteringRectangle(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.MeteringRectangle> p0, int p1) { super(null, null, 0); }
        public void marshal(android.hardware.camera2.params.MeteringRectangle p0, java.nio.ByteBuffer p1) {}
        public android.hardware.camera2.params.MeteringRectangle unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
