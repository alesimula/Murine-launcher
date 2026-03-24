package android.hardware.camera2.marshal.impl;

public class MarshalQueryableReprocessFormatsMap implements android.hardware.camera2.marshal.MarshalQueryable<android.hardware.camera2.params.ReprocessFormatsMap> {
    public MarshalQueryableReprocessFormatsMap() {}
    public android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.ReprocessFormatsMap> createMarshaler(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.ReprocessFormatsMap> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.ReprocessFormatsMap> p0, int p1) { return false; }

    private class MarshalerReprocessFormatsMap extends android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.ReprocessFormatsMap> {
        protected MarshalerReprocessFormatsMap(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.ReprocessFormatsMap> p0, int p1) { super(null, null, 0); }
        public void marshal(android.hardware.camera2.params.ReprocessFormatsMap p0, java.nio.ByteBuffer p1) {}
        public android.hardware.camera2.params.ReprocessFormatsMap unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
        public int calculateMarshalSize(android.hardware.camera2.params.ReprocessFormatsMap p0) { return 0; }
    }
}
