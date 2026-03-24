package android.net.wifi.p2p.nsd;

public class WifiP2pServiceInfo implements android.os.Parcelable {
    public static final int SERVICE_TYPE_ALL = 0;
    public static final int SERVICE_TYPE_BONJOUR = 1;
    public static final int SERVICE_TYPE_UPNP = 2;
    public static final int SERVICE_TYPE_VENDOR_SPECIFIC = 255;
    WifiP2pServiceInfo() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
