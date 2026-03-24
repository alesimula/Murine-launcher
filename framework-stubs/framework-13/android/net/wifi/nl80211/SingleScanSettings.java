package android.net.wifi.nl80211;

public class SingleScanSettings implements android.os.Parcelable {
    public int scanType;
    public boolean enable6GhzRnr;
    public java.util.ArrayList<android.net.wifi.nl80211.ChannelSettings> channelSettings;
    public java.util.ArrayList<android.net.wifi.nl80211.HiddenNetwork> hiddenNetworks;
    public static final android.os.Parcelable.Creator<android.net.wifi.nl80211.SingleScanSettings> CREATOR = null;
    public SingleScanSettings() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
