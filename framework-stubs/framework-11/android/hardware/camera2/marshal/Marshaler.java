package android.hardware.camera2.marshal;

public abstract class Marshaler<T extends java.lang.Object> {
    protected final android.hardware.camera2.utils.TypeReference<T> mTypeReference = null;
    protected final int mNativeType = 0;
    public static int NATIVE_SIZE_DYNAMIC;
    protected Marshaler(android.hardware.camera2.marshal.MarshalQueryable<T> p0, android.hardware.camera2.utils.TypeReference<T> p1, int p2) {}
    public abstract void marshal(T p0, java.nio.ByteBuffer p1);
    public int calculateMarshalSize(T p0) { return 0; }
    public abstract T unmarshal(java.nio.ByteBuffer p0);
    public abstract int getNativeSize();
    public android.hardware.camera2.utils.TypeReference<T> getTypeReference() { return null; }
    public int getNativeType() { return 0; }
}
