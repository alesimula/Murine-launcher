package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppState implements android.os.Parcelable {
    private long mNanoAppId;
    private int mNanoAppVersion;
    private boolean mIsEnabled;
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppState> CREATOR = null;
    public NanoAppState(long p0, int p1, boolean p2) {}
    public long getNanoAppId() { return 0L; }
    public long getNanoAppVersion() { return 0L; }
    public boolean isEnabled() { return false; }
    private NanoAppState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
