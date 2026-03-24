package android.hardware.camera2.marshal.impl;

public class MarshalQueryableRange<T extends java.lang.Comparable<? super T>> implements android.hardware.camera2.marshal.MarshalQueryable<android.util.Range<T>> {
    public MarshalQueryableRange() {}
    public android.hardware.camera2.marshal.Marshaler<android.util.Range<T>> createMarshaler(android.hardware.camera2.utils.TypeReference<android.util.Range<T>> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.util.Range<T>> p0, int p1) { return false; }

    private class MarshalerRange extends android.hardware.camera2.marshal.Marshaler<android.util.Range<T>> {
        protected MarshalerRange(android.hardware.camera2.utils.TypeReference<android.util.Range<T>> p0, int p1) { super(null, null, 0); }
        public void marshal(android.util.Range<T> p0, java.nio.ByteBuffer p1) {}
        public android.util.Range<T> unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
        public int calculateMarshalSize(android.util.Range<T> p0) { return 0; }
    }
}
