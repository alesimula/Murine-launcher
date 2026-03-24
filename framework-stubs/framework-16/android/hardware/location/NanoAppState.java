package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppState implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppState> CREATOR = null;
    public NanoAppState(long p0, int p1, boolean p2) {}
    public NanoAppState(long p0, int p1, boolean p2, java.util.List<java.lang.String> p3) {}
    public NanoAppState(long p0, int p1, boolean p2, java.util.List<java.lang.String> p3, java.util.List<android.hardware.location.NanoAppRpcService> p4) {}
    public long getNanoAppId() { return 0L; }
    public long getNanoAppVersion() { return 0L; }
    public boolean isEnabled() { return false; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getNanoAppPermissions() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.hardware.location.NanoAppRpcService> getRpcServices() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
