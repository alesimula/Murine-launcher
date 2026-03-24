package android.net.wifi.nl80211;

@android.annotation.SystemApi
public final class PnoSettings implements android.os.Parcelable {
    private long mIntervalMs;
    private int mMin2gRssi;
    private int mMin5gRssi;
    private int mMin6gRssi;
    private java.util.List<android.net.wifi.nl80211.PnoNetwork> mPnoNetworks;
    public static final android.os.Parcelable.Creator<android.net.wifi.nl80211.PnoSettings> CREATOR = null;
    public PnoSettings() {}
    public long getIntervalMillis() { return 0L; }
    public void setIntervalMillis(long p0) {}
    public int getMin2gRssiDbm() { return 0; }
    public void setMin2gRssiDbm(int p0) {}
    public int getMin5gRssiDbm() { return 0; }
    public void setMin5gRssiDbm(int p0) {}
    public int getMin6gRssiDbm() { return 0; }
    public void setMin6gRssiDbm(int p0) {}
    public java.util.List<android.net.wifi.nl80211.PnoNetwork> getPnoNetworks() { return null; }
    public void setPnoNetworks(java.util.List<android.net.wifi.nl80211.PnoNetwork> p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
