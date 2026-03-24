package android.hardware.camera2.marshal;

public interface MarshalQueryable<T extends java.lang.Object> {
    public android.hardware.camera2.marshal.Marshaler<T> createMarshaler(android.hardware.camera2.utils.TypeReference<T> p0, int p1);
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<T> p0, int p1);
}
