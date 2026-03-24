package android.app.usage;

public final class AppStandbyInfo implements android.os.Parcelable {
    public java.lang.String mPackageName;
    public int mStandbyBucket;
    public static final android.os.Parcelable.Creator<android.app.usage.AppStandbyInfo> CREATOR = null;
    private AppStandbyInfo(android.os.Parcel p0) {}
    public AppStandbyInfo(java.lang.String p0, int p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
