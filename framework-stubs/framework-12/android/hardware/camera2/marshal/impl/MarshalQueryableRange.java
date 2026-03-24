package android.hardware.camera2.marshal.impl;

public class MarshalQueryableRange<T extends java.lang.Comparable<? super T>> implements android.hardware.camera2.marshal.MarshalQueryable<android.util.Range<T>> {
    private static final int RANGE_COUNT = 2;
    public MarshalQueryableRange() {}
    public android.hardware.camera2.marshal.Marshaler<android.util.Range<T>> createMarshaler(android.hardware.camera2.utils.TypeReference<android.util.Range<T>> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.util.Range<T>> p0, int p1) { return false; }

    private class MarshalerRange extends android.hardware.camera2.marshal.Marshaler<android.util.Range<T>> {
        private final java.lang.Class<? super android.util.Range<T>> mClass = null;
        private final java.lang.reflect.Constructor<android.util.Range<T>> mConstructor = null;
        private final android.hardware.camera2.marshal.Marshaler<T> mNestedTypeMarshaler = null;
        protected MarshalerRange(android.hardware.camera2.utils.TypeReference<android.util.Range<T>> p0, int p1) { super(null, null, 0); }
        public void marshal(android.util.Range<T> p0, java.nio.ByteBuffer p1) {}
        public android.util.Range<T> unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
        public int calculateMarshalSize(android.util.Range<T> p0) { return 0; }
    }
}
