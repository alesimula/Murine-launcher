package android.net.wifi.aware;

public final class WifiAwareNetworkInfo implements android.os.Parcelable, android.net.TransportInfo {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.WifiAwareNetworkInfo> CREATOR = null;
    WifiAwareNetworkInfo() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.aware.WifiAwareChannelInfo> getChannelInfoList() { return null; }
    @android.annotation.Nullable
    public java.net.Inet6Address getPeerIpv6Addr() { return null; }
    public int getPort() { return 0; }
    public int getTransportProtocol() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
