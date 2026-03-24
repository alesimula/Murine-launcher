package android.companion.virtual.camera;

@android.annotation.SystemApi
public final class VirtualCameraStreamConfig implements android.os.Parcelable {
    static final int MAX_FPS_UPPER_LIMIT = 60;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.virtual.camera.VirtualCameraStreamConfig> CREATOR = null;
    public VirtualCameraStreamConfig(int p0, int p1, int p2, int p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int getFormat() { return 0; }
    public int getMaximumFramesPerSecond() { return 0; }
}
