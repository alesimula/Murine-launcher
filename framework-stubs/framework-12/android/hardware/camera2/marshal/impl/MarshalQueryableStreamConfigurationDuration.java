package android.hardware.camera2.marshal.impl;

public class MarshalQueryableStreamConfigurationDuration implements android.hardware.camera2.marshal.MarshalQueryable<android.hardware.camera2.params.StreamConfigurationDuration> {
    private static final int SIZE = 32;
    private static final long MASK_UNSIGNED_INT = 4294967295L;
    public MarshalQueryableStreamConfigurationDuration() {}
    public android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.StreamConfigurationDuration> createMarshaler(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.StreamConfigurationDuration> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.StreamConfigurationDuration> p0, int p1) { return false; }

    private class MarshalerStreamConfigurationDuration extends android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.StreamConfigurationDuration> {
        protected MarshalerStreamConfigurationDuration(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.StreamConfigurationDuration> p0, int p1) { super(null, null, 0); }
        public void marshal(android.hardware.camera2.params.StreamConfigurationDuration p0, java.nio.ByteBuffer p1) {}
        public android.hardware.camera2.params.StreamConfigurationDuration unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
