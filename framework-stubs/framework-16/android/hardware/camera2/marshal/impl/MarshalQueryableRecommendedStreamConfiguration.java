package android.hardware.camera2.marshal.impl;

public class MarshalQueryableRecommendedStreamConfiguration implements android.hardware.camera2.marshal.MarshalQueryable<android.hardware.camera2.params.RecommendedStreamConfiguration> {
    public MarshalQueryableRecommendedStreamConfiguration() {}
    public android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.RecommendedStreamConfiguration> createMarshaler(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.RecommendedStreamConfiguration> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.RecommendedStreamConfiguration> p0, int p1) { return false; }

    private class MarshalerRecommendedStreamConfiguration extends android.hardware.camera2.marshal.Marshaler<android.hardware.camera2.params.RecommendedStreamConfiguration> {
        protected MarshalerRecommendedStreamConfiguration(android.hardware.camera2.utils.TypeReference<android.hardware.camera2.params.RecommendedStreamConfiguration> p0, int p1) { super(null, null, 0); }
        public void marshal(android.hardware.camera2.params.RecommendedStreamConfiguration p0, java.nio.ByteBuffer p1) {}
        public android.hardware.camera2.params.RecommendedStreamConfiguration unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
