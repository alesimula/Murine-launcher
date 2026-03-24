package android.companion.virtual.camera;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtual.flags.virtual_camera")
public final class VirtualCameraConfig implements android.os.Parcelable {
    public static final int SENSOR_ORIENTATION_0 = 0;
    public static final int SENSOR_ORIENTATION_90 = 90;
    public static final int SENSOR_ORIENTATION_180 = 180;
    public static final int SENSOR_ORIENTATION_270 = 270;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.virtual.camera.VirtualCameraConfig> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.companion.virtual.camera.VirtualCameraStreamConfig> getStreamConfigs() { return null; }
    @android.annotation.NonNull
    public android.companion.virtual.camera.IVirtualCameraCallback getCallback() { return null; }
    public int getSensorOrientation() { return 0; }
    public int getLensFacing() { return 0; }

    @android.annotation.FlaggedApi("android.companion.virtual.flags.virtual_camera")
    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.companion.virtual.camera.VirtualCameraConfig.Builder addStreamConfig(int p0, int p1, int p2, int p3) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.camera.VirtualCameraConfig.Builder setSensorOrientation(int p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.camera.VirtualCameraConfig.Builder setLensFacing(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.companion.virtual.camera.VirtualCameraConfig.Builder setVirtualCameraCallback(java.util.concurrent.Executor p0, android.companion.virtual.camera.VirtualCameraCallback p1) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.camera.VirtualCameraConfig build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SensorOrientation {
    }

    private static class VirtualCameraCallbackInternal extends android.companion.virtual.camera.IVirtualCameraCallback.Stub {
        public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4) {}
        public void onProcessCaptureRequest(int p0, long p1) {}
        public void onStreamClosed(int p0) {}
    }
}
