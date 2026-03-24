package android.hardware.camera2.marshal.impl;

public class MarshalQueryableParcelable<T extends android.os.Parcelable> implements android.hardware.camera2.marshal.MarshalQueryable<T> {
    public MarshalQueryableParcelable() {}
    public android.hardware.camera2.marshal.Marshaler<T> createMarshaler(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return false; }

    private class MarshalerParcelable extends android.hardware.camera2.marshal.Marshaler<T> {
        protected MarshalerParcelable(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { super(null, null, 0); }
        public void marshal(T p0, java.nio.ByteBuffer p1) {}
        public T unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
        public int calculateMarshalSize(T p0) { return 0; }
    }
}
