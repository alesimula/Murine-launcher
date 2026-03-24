package android.net;

@java.lang.Deprecated
public class NetworkQuotaInfo implements android.os.Parcelable {
    public static final long NO_LIMIT = -1L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkQuotaInfo> CREATOR = null;
    public NetworkQuotaInfo() {}
    public NetworkQuotaInfo(android.os.Parcel p0) {}
    public long getEstimatedBytes() { return 0L; }
    public long getSoftLimitBytes() { return 0L; }
    public long getHardLimitBytes() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
