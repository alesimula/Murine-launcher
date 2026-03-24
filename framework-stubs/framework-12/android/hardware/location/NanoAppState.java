package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppState implements android.os.Parcelable {
    private long mNanoAppId;
    private int mNanoAppVersion;
    private boolean mIsEnabled;
    private java.util.List<java.lang.String> mNanoAppPermissions;
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppState> CREATOR = null;
    public NanoAppState(long p0, int p1, boolean p2) {}
    public NanoAppState(long p0, int p1, boolean p2, java.util.List<java.lang.String> p3) {}
    public long getNanoAppId() { return 0L; }
    public long getNanoAppVersion() { return 0L; }
    public boolean isEnabled() { return false; }
    public java.util.List<java.lang.String> getNanoAppPermissions() { return null; }
    private NanoAppState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
