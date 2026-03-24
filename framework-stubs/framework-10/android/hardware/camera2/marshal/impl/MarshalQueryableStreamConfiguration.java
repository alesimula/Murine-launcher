package android.hardware.camera2.marshal.impl;

public class MarshalQueryableStreamConfiguration implements android.hardware.camera2.marshal.MarshalQueryable<android.hardware.camera2.params.StreamConfiguration> {
    private static final int SIZE = 16;
    public MarshalQueryableStreamConfiguration() {}
    public android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.StreamConfiguration> createMarshaler(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.StreamConfiguration> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.StreamConfiguration> p0, int p1) { return false; }

    private class MarshalerStreamConfiguration extends android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.StreamConfiguration> {
        protected MarshalerStreamConfiguration(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.StreamConfiguration> p0, int p1) { super(null, null, 0); }
        public void marshal(android.hardware.camera2.params.StreamConfiguration p0, java.nio.ByteBuffer p1) {}
        public android.hardware.camera2.params.StreamConfiguration unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
