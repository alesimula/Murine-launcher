package android.net.wifi.p2p.nsd;

public class WifiP2pServiceInfo implements android.os.Parcelable {
    public static final int SERVICE_TYPE_ALL = 0;
    public static final int SERVICE_TYPE_BONJOUR = 1;
    public static final int SERVICE_TYPE_UPNP = 2;
    public static final int SERVICE_TYPE_VENDOR_SPECIFIC = 255;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public WifiP2pServiceInfo(android.net.wifi.p2p.nsd.WifiP2pUsdBasedServiceConfig p0) {}
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    @android.annotation.Nullable
    public android.net.wifi.p2p.nsd.WifiP2pUsdBasedServiceConfig getWifiP2pUsdBasedServiceConfig() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
