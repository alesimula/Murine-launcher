package android.companion.virtual;

public final class VirtualDevice implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.virtual.VirtualDevice> CREATOR = null;
    public VirtualDevice(android.companion.virtual.IVirtualDevice p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public VirtualDevice(android.companion.virtual.IVirtualDevice p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.CharSequence p4) {}
    public int getDeviceId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getPersistentDeviceId() { return null; }
    @android.annotation.Nullable
    public java.lang.String getName() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getDisplayName() { return null; }
    @android.annotation.NonNull
    public int[] getDisplayIds() { return null; }
    public boolean hasCustomSensorSupport() { return false; }
    @android.annotation.SystemApi
    public boolean hasCustomAudioInputSupport() { return false; }
    @android.annotation.SystemApi
    public boolean hasCustomCameraSupport() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
}
