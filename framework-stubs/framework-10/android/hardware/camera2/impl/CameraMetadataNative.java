package android.hardware.camera2.impl;

public class CameraMetadataNative implements android.os.Parcelable {
    private static final java.lang.String TAG = "CameraMetadataJV";
    private static final boolean DEBUG = false;
    public static final int NATIVE_JPEG_FORMAT = 33;
    private static final java.lang.String CELLID_PROCESS = "CELLID";
    private static final java.lang.String GPS_PROCESS = "GPS";
    private static final int FACE_LANDMARK_SIZE = 6;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.impl.CameraMetadataNative> CREATOR = null;
    public static final int TYPE_BYTE = 0;
    public static final int TYPE_INT32 = 1;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_DOUBLE = 4;
    public static final int TYPE_RATIONAL = 5;
    public static final int NUM_TYPES = 6;
    private static final java.util.HashMap<android.hardware.camera2.impl.CameraMetadataNative.Key<?>, android.hardware.camera2.impl.GetCommand> sGetCommandMap = null;
    private static final java.util.HashMap<android.hardware.camera2.impl.CameraMetadataNative.Key<?>, android.hardware.camera2.impl.SetCommand> sSetCommandMap = null;
    private int mCameraId;
    private android.util.Size mDisplaySize;
    @android.annotation.UnsupportedAppUsage
    private long mMetadataPtr;
    private static java.lang.String translateLocationProviderToProcess(java.lang.String p0) { return null; }
    private static java.lang.String translateProcessToLocationProvider(java.lang.String p0) { return null; }
    public CameraMetadataNative() {}
    public CameraMetadataNative(android.hardware.camera2.impl.CameraMetadataNative p0) {}
    public static android.hardware.camera2.impl.CameraMetadataNative move(android.hardware.camera2.impl.CameraMetadataNative p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public <T extends java.lang.Object> T get(android.hardware.camera2.CameraCharacteristics.Key<T> p0) { return null; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.CaptureResult.Key<T> p0) { return null; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.CaptureRequest.Key<T> p0) { return null; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0) { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public static void setupGlobalVendorTagDescriptor() throws android.os.ServiceSpecificException {}
    private static native int nativeSetupGlobalVendorTagDescriptor();
    public <T extends java.lang.Object> void set(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0, T p1) {}
    public <T extends java.lang.Object> void set(android.hardware.camera2.CaptureRequest.Key<T> p0, T p1) {}
    public <T extends java.lang.Object> void set(android.hardware.camera2.CaptureResult.Key<T> p0, T p1) {}
    public <T extends java.lang.Object> void set(android.hardware.camera2.CameraCharacteristics.Key<T> p0, T p1) {}
    private void close() {}
    private <T extends java.lang.Object> T getBase(android.hardware.camera2.CameraCharacteristics.Key<T> p0) { return null; }
    private <T extends java.lang.Object> T getBase(android.hardware.camera2.CaptureResult.Key<T> p0) { return null; }
    private <T extends java.lang.Object> T getBase(android.hardware.camera2.CaptureRequest.Key<T> p0) { return null; }
    private <T extends java.lang.Object> T getBase(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0) { return null; }
    private int[] getAvailableFormats() { return null; }
    private boolean setFaces(android.hardware.camera2.params.Face[] p0) { return false; }
    private android.hardware.camera2.params.Face[] getFaces() { return null; }
    private android.graphics.Rect[] getFaceRectangles() { return null; }
    private android.hardware.camera2.params.LensShadingMap getLensShadingMap() { return null; }
    private android.location.Location getGpsLocation() { return null; }
    private boolean setGpsLocation(android.location.Location p0) { return false; }
    private void parseRecommendedConfigurations(android.hardware.camera2.params.RecommendedStreamConfiguration[] p0, android.hardware.camera2.params.StreamConfigurationMap p1, boolean p2, java.util.ArrayList<java.util.ArrayList<android.hardware.camera2.params.StreamConfiguration>> p3, java.util.ArrayList<java.util.ArrayList<android.hardware.camera2.params.StreamConfigurationDuration>> p4, java.util.ArrayList<java.util.ArrayList<android.hardware.camera2.params.StreamConfigurationDuration>> p5, boolean[] p6) {}
    public void initializeStreamConfigurationData(java.util.ArrayList<android.hardware.camera2.params.StreamConfiguration> p0, java.util.ArrayList<android.hardware.camera2.params.StreamConfigurationDuration> p1, java.util.ArrayList<android.hardware.camera2.params.StreamConfigurationDuration> p2, android.hardware.camera2.impl.CameraMetadataNative.StreamConfigurationData p3) {}
    public java.util.ArrayList<android.hardware.camera2.params.RecommendedStreamConfigurationMap> getRecommendedStreamConfigurations() { return null; }
    private boolean isBurstSupported() { return false; }
    private android.hardware.camera2.params.MandatoryStreamCombination[] getMandatoryStreamCombinations() { return null; }
    private android.hardware.camera2.params.StreamConfigurationMap getStreamConfigurationMap() { return null; }
    private <T extends java.lang.Object> java.lang.Integer getMaxRegions(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0) { return null; }
    private <T extends java.lang.Object> java.lang.Integer getMaxNumOutputs(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0) { return null; }
    private <T extends java.lang.Object> android.hardware.camera2.params.TonemapCurve getTonemapCurve() { return null; }
    private android.hardware.camera2.params.OisSample[] getOisSamples() { return null; }
    private <T extends java.lang.Object> void setBase(android.hardware.camera2.CameraCharacteristics.Key<T> p0, T p1) {}
    private <T extends java.lang.Object> void setBase(android.hardware.camera2.CaptureResult.Key<T> p0, T p1) {}
    private <T extends java.lang.Object> void setBase(android.hardware.camera2.CaptureRequest.Key<T> p0, T p1) {}
    private <T extends java.lang.Object> void setBase(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0, T p1) {}
    private boolean setAvailableFormats(int[] p0) { return false; }
    private boolean setFaceRectangles(android.graphics.Rect[] p0) { return false; }
    private <T extends java.lang.Object> boolean setTonemapCurve(android.hardware.camera2.params.TonemapCurve p0) { return false; }
    public void setCameraId(int p0) {}
    public void setDisplaySize(android.util.Size p0) {}
    private native long nativeAllocate();
    private native long nativeAllocateCopy(android.hardware.camera2.impl.CameraMetadataNative p0) throws java.lang.NullPointerException;
    private synchronized native void nativeWriteToParcel(android.os.Parcel p0);
    private synchronized native void nativeReadFromParcel(android.os.Parcel p0);
    private synchronized native void nativeSwap(android.hardware.camera2.impl.CameraMetadataNative p0) throws java.lang.NullPointerException;
    private synchronized native void nativeClose();
    private synchronized native boolean nativeIsEmpty();
    private synchronized native int nativeGetEntryCount();
    @android.annotation.UnsupportedAppUsage
    private synchronized native byte[] nativeReadValues(int p0);
    private synchronized native void nativeWriteValues(int p0, byte[] p1);
    private synchronized native void nativeDump() throws java.io.IOException;
    private synchronized native java.util.ArrayList nativeGetAllVendorKeys(java.lang.Class p0);
    @android.annotation.UnsupportedAppUsage
    private synchronized native int nativeGetTagFromKeyLocal(java.lang.String p0) throws java.lang.IllegalArgumentException;
    @android.annotation.UnsupportedAppUsage
    private synchronized native int nativeGetTypeFromTagLocal(int p0) throws java.lang.IllegalArgumentException;
    private static native int nativeGetTagFromKey(java.lang.String p0, long p1) throws java.lang.IllegalArgumentException;
    private static native int nativeGetTypeFromTag(int p0, long p1) throws java.lang.IllegalArgumentException;
    public void swap(android.hardware.camera2.impl.CameraMetadataNative p0) {}
    public int getEntryCount() { return 0; }
    public boolean isEmpty() { return false; }
    public <K extends java.lang.Object> java.util.ArrayList<K> getAllVendorKeys(java.lang.Class<K> p0) { return null; }
    public static int getTag(java.lang.String p0) { return 0; }
    public static int getTag(java.lang.String p0, long p1) { return 0; }
    public static int getNativeType(int p0, long p1) { return 0; }
    public void writeValues(int p0, byte[] p1) {}
    public byte[] readValues(int p0) { return null; }
    public void dumpToLog() {}
    protected void finalize() throws java.lang.Throwable {}
    private static <T extends java.lang.Object> android.hardware.camera2.marshal.Marshaler<T> getMarshalerForKey(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0, int p1) { return null; }
    private static void registerAllMarshalers() {}
    private static boolean areValuesAllNull(java.lang.Object... p0) { return false; }

    private class StreamConfigurationData {
        android.hardware.camera2.params.StreamConfiguration[] streamConfigurationArray;
        android.hardware.camera2.params.StreamConfigurationDuration[] minDurationArray;
        android.hardware.camera2.params.StreamConfigurationDuration[] stallDurationArray;
        private StreamConfigurationData(android.hardware.camera2.impl.CameraMetadataNative p0) {}
    }

    public static class Key<T extends java.lang.Object> {
        private boolean mHasTag;
        private int mTag;
        private long mVendorId;
        private final java.lang.Class<T> mType = null;
        private final android.hardware.camera2.utils.TypeReference<T> mTypeReference = null;
        private final java.lang.String mName = null;
        private final java.lang.String mFallbackName = null;
        private final int mHash = 0;
        public Key(java.lang.String p0, java.lang.Class<T> p1, long p2) {}
        public Key(java.lang.String p0, java.lang.String p1, java.lang.Class<T> p2) {}
        public Key(java.lang.String p0, java.lang.Class<T> p1) {}
        public Key(java.lang.String p0, android.hardware.camera2.utils.TypeReference<T> p1) {}
        public final java.lang.String getName() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        @android.annotation.UnsupportedAppUsage
        public final int getTag() { return 0; }
        public final java.lang.Class<T> getType() { return null; }
        public final long getVendorId() { return 0L; }
        public final android.hardware.camera2.utils.TypeReference<T> getTypeReference() { return null; }
    }
}
