package android.net.wifi.p2p.nsd;

public class WifiP2pServiceInfo implements android.os.Parcelable {
    public static final int SERVICE_TYPE_ALL = 0;
    public static final int SERVICE_TYPE_BONJOUR = 1;
    public static final int SERVICE_TYPE_UPNP = 2;
    public static final int SERVICE_TYPE_WS_DISCOVERY = 3;
    public static final int SERVICE_TYPE_VENDOR_SPECIFIC = 255;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.util.List<java.lang.String> mQueryList;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.nsd.WifiP2pServiceInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    protected WifiP2pServiceInfo(java.util.List<java.lang.String> p0) {}
    public java.util.List<java.lang.String> getSupplicantQueryList() { return null; }
    static java.lang.String bin2HexStr(byte[] p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
