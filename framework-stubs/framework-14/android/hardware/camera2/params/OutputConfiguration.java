package android.hardware.camera2.params;

public final class OutputConfiguration implements android.os.Parcelable {
    @android.annotation.SystemApi
    public static final int ROTATION_0 = 0;
    @android.annotation.SystemApi
    public static final int ROTATION_90 = 1;
    @android.annotation.SystemApi
    public static final int ROTATION_180 = 2;
    @android.annotation.SystemApi
    public static final int ROTATION_270 = 3;
    public static final int SURFACE_GROUP_ID_NONE = -1;
    public static final int TIMESTAMP_BASE_DEFAULT = 0;
    public static final int TIMESTAMP_BASE_SENSOR = 1;
    public static final int TIMESTAMP_BASE_MONOTONIC = 2;
    public static final int TIMESTAMP_BASE_REALTIME = 3;
    public static final int TIMESTAMP_BASE_CHOREOGRAPHER_SYNCED = 4;
    public static final int TIMESTAMP_BASE_READOUT_SENSOR = 5;
    public static final int MIRROR_MODE_AUTO = 0;
    public static final int MIRROR_MODE_NONE = 1;
    public static final int MIRROR_MODE_H = 2;
    public static final int MIRROR_MODE_V = 3;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.params.OutputConfiguration> CREATOR = null;
    public OutputConfiguration(android.view.Surface p0) {}
    public OutputConfiguration(int p0, android.view.Surface p1) {}
    public void setMultiResolutionOutput() {}
    public void setDynamicRangeProfile(long p0) {}
    public long getDynamicRangeProfile() { return 0L; }
    public void setColorSpace(android.graphics.ColorSpace.Named p0) {}
    public void clearColorSpace() {}
    @android.annotation.SuppressLint("MethodNameUnits")
    public android.graphics.ColorSpace getColorSpace() { return null; }
    @android.annotation.SystemApi
    public OutputConfiguration(android.view.Surface p0, int p1) {}
    @android.annotation.SystemApi
    public OutputConfiguration(int p0, android.view.Surface p1, int p2) {}
    public static java.util.Collection<android.hardware.camera2.params.OutputConfiguration> createInstancesForMultiResolutionOutput(android.hardware.camera2.MultiResolutionImageReader p0) { return null; }
    public <T extends java.lang.Object> OutputConfiguration(android.util.Size p0, java.lang.Class<T> p1) {}
    public void enableSurfaceSharing() {}
    public void setPhysicalCameraId(java.lang.String p0) {}
    public void addSensorPixelModeUsed(int p0) {}
    public void removeSensorPixelModeUsed(int p0) {}
    public boolean isForPhysicalCamera() { return false; }
    public boolean isDeferredConfiguration() { return false; }
    public void addSurface(android.view.Surface p0) {}
    public void removeSurface(android.view.Surface p0) {}
    public void setStreamUseCase(long p0) {}
    public long getStreamUseCase() { return 0L; }
    public void setTimestampBase(int p0) {}
    public int getTimestampBase() { return 0; }
    public void setMirrorMode(int p0) {}
    public int getMirrorMode() { return 0; }
    public void setReadoutTimestampEnabled(boolean p0) {}
    public boolean isReadoutTimestampEnabled() { return false; }
    public OutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) {}
    public int getMaxSharedSurfaceCount() { return 0; }
    public android.view.Surface getSurface() { return null; }
    public java.util.List<android.view.Surface> getSurfaces() { return null; }
    @android.annotation.SystemApi
    public int getRotation() { return 0; }
    public int getSurfaceGroupId() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MirrorMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SensorPixelMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StreamUseCase {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimestampBase {
    }
}
