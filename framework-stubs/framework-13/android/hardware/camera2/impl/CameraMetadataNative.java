package android.hardware.camera2.impl;

public class CameraMetadataNative implements android.os.Parcelable {
    public static final int NATIVE_JPEG_FORMAT = 33;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.impl.CameraMetadataNative> CREATOR = null;
    public static final int TYPE_BYTE = 0;
    public static final int TYPE_INT32 = 1;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_DOUBLE = 4;
    public static final int TYPE_RATIONAL = 5;
    public static final int NUM_TYPES = 6;
    public CameraMetadataNative() {}
    public CameraMetadataNative(android.hardware.camera2.impl.CameraMetadataNative p0) {}
    public static android.hardware.camera2.impl.CameraMetadataNative move(android.hardware.camera2.impl.CameraMetadataNative p0) { return null; }
    public static void update(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.impl.CameraMetadataNative p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public <T extends java.lang.Object> T get(android.hardware.camera2.CameraCharacteristics.Key<T> p0) { return null; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.CaptureResult.Key<T> p0) { return null; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.CaptureRequest.Key<T> p0) { return null; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0) { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public static void setupGlobalVendorTagDescriptor() throws android.os.ServiceSpecificException {}
    public <T extends java.lang.Object> void set(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0, T p1) {}
    public <T extends java.lang.Object> void set(android.hardware.camera2.CaptureRequest.Key<T> p0, T p1) {}
    public <T extends java.lang.Object> void set(android.hardware.camera2.CaptureResult.Key<T> p0, T p1) {}
    public <T extends java.lang.Object> void set(android.hardware.camera2.CameraCharacteristics.Key<T> p0, T p1) {}
    public void initializeStreamConfigurationData(java.util.ArrayList<android.hardware.camera2.params.StreamConfiguration> p0, java.util.ArrayList<android.hardware.camera2.params.StreamConfigurationDuration> p1, java.util.ArrayList<android.hardware.camera2.params.StreamConfigurationDuration> p2, android.hardware.camera2.impl.CameraMetadataNative.StreamConfigurationData p3) {}
    public java.util.ArrayList<android.hardware.camera2.params.RecommendedStreamConfigurationMap> getRecommendedStreamConfigurations() { return null; }
    public boolean isUltraHighResolutionSensor() { return false; }
    public void setCameraId(int p0) {}
    public void setHasMandatoryConcurrentStreams(boolean p0) {}
    public void setDisplaySize(android.util.Size p0) {}
    public void setMultiResolutionStreamConfigurationMap(java.util.Map<java.lang.String, android.hardware.camera2.params.StreamConfiguration[]> p0) {}
    public android.hardware.camera2.params.MultiResolutionStreamConfigurationMap getMultiResolutionStreamConfigurationMap() { return null; }
    public void swap(android.hardware.camera2.impl.CameraMetadataNative p0) {}
    public void setVendorId(long p0) {}
    public int getEntryCount() { return 0; }
    public boolean isEmpty() { return false; }
    public long getMetadataPtr() { return 0L; }
    public <K extends java.lang.Object> java.util.ArrayList<K> getAllVendorKeys(java.lang.Class<K> p0) { return null; }
    public static int getTag(java.lang.String p0) { return 0; }
    public static int getTag(java.lang.String p0, long p1) { return 0; }
    public static int getNativeType(int p0, long p1) { return 0; }
    public void writeValues(int p0, byte[] p1) {}
    public byte[] readValues(int p0) { return null; }
    public void dumpToLog() {}
    protected void finalize() throws java.lang.Throwable {}
    public java.util.Set<java.lang.String> getPhysicalCameraIds() { return null; }

    public static class Key<T extends java.lang.Object> {
        public Key(java.lang.String p0, java.lang.Class<T> p1, long p2) {}
        public Key(java.lang.String p0, java.lang.String p1, java.lang.Class<T> p2) {}
        public Key(java.lang.String p0, java.lang.Class<T> p1) {}
        public Key(java.lang.String p0, android.hardware.camera2.utils.TypeReference<T> p1) {}
        public final java.lang.String getName() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int getTag() { return 0; }
        public final boolean hasTag() { return false; }
        public final void cacheTag(int p0) {}
        public final java.lang.Class<T> getType() { return null; }
        public final long getVendorId() { return 0L; }
        public final android.hardware.camera2.utils.TypeReference<T> getTypeReference() { return null; }
    }

    private class StreamConfigurationData {
        android.hardware.camera2.params.StreamConfiguration[] streamConfigurationArray;
        android.hardware.camera2.params.StreamConfigurationDuration[] minDurationArray;
        android.hardware.camera2.params.StreamConfigurationDuration[] stallDurationArray;
    }
}
