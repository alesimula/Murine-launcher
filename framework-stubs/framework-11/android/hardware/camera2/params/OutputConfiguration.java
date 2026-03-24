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
    private final int SURFACE_TYPE_UNKNOWN = 0;
    private final int SURFACE_TYPE_SURFACE_VIEW = 0;
    private final int SURFACE_TYPE_SURFACE_TEXTURE = 0;
    private static final int MAX_SURFACES_COUNT = 4;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.params.OutputConfiguration> CREATOR = null;
    private static final java.lang.String TAG = "OutputConfiguration";
    private java.util.ArrayList<android.view.Surface> mSurfaces;
    private final int mRotation = 0;
    private final int mSurfaceGroupId = 0;
    private final int mSurfaceType = 0;
    private final android.util.Size mConfiguredSize = null;
    private final int mConfiguredFormat = 0;
    private final int mConfiguredDataspace = 0;
    private final int mConfiguredGenerationId = 0;
    private final boolean mIsDeferredConfig = false;
    private boolean mIsShared;
    private java.lang.String mPhysicalCameraId;
    public OutputConfiguration(android.view.Surface p0) {}
    public OutputConfiguration(int p0, android.view.Surface p1) {}
    @android.annotation.SystemApi
    public OutputConfiguration(android.view.Surface p0, int p1) {}
    @android.annotation.SystemApi
    public OutputConfiguration(int p0, android.view.Surface p1, int p2) {}
    public <T extends java.lang.Object> OutputConfiguration(android.util.Size p0, java.lang.Class<T> p1) {}
    public void enableSurfaceSharing() {}
    public void setPhysicalCameraId(java.lang.String p0) {}
    public boolean isForPhysicalCamera() { return false; }
    public boolean isDeferredConfiguration() { return false; }
    public void addSurface(android.view.Surface p0) {}
    public void removeSurface(android.view.Surface p0) {}
    public OutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) {}
    private OutputConfiguration(android.os.Parcel p0) {}
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
}
