package android.net.wifi.nl80211;

@android.annotation.SystemApi
public final class RadioChainInfo implements android.os.Parcelable {
    public int chainId;
    public int level;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.nl80211.RadioChainInfo> CREATOR = null;
    public int getChainId() { return 0; }
    public int getLevelDbm() { return 0; }
    public RadioChainInfo(int p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
