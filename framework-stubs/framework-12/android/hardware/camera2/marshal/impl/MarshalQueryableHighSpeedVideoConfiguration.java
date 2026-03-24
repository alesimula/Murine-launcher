package android.hardware.camera2.marshal.impl;

public class MarshalQueryableHighSpeedVideoConfiguration implements android.hardware.camera2.marshal.MarshalQueryable<android.hardware.camera2.params.HighSpeedVideoConfiguration> {
    private static final int SIZE = 20;
    public MarshalQueryableHighSpeedVideoConfiguration() {}
    public android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.HighSpeedVideoConfiguration> createMarshaler(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.HighSpeedVideoConfiguration> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.HighSpeedVideoConfiguration> p0, int p1) { return false; }

    private class MarshalerHighSpeedVideoConfiguration extends android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.HighSpeedVideoConfiguration> {
        protected MarshalerHighSpeedVideoConfiguration(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.HighSpeedVideoConfiguration> p0, int p1) { super(null, null, 0); }
        public void marshal(android.hardware.camera2.params.HighSpeedVideoConfiguration p0, java.nio.ByteBuffer p1) {}
        public android.hardware.camera2.params.HighSpeedVideoConfiguration unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
