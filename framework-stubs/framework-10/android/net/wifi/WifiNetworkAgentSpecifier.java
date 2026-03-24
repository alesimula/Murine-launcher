package android.net.wifi;

public final class WifiNetworkAgentSpecifier extends android.net.NetworkSpecifier implements android.os.Parcelable {
    private final android.net.wifi.WifiConfiguration mWifiConfiguration = null;
    private final int mOriginalRequestorUid = 0;
    private final java.lang.String mOriginalRequestorPackageName = null;
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiNetworkAgentSpecifier> CREATOR = null;
    public WifiNetworkAgentSpecifier(android.net.wifi.WifiConfiguration p0, int p1, java.lang.String p2) { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean satisfiedBy(android.net.NetworkSpecifier p0) { return false; }
    public boolean satisfiesNetworkSpecifier(android.net.wifi.WifiNetworkSpecifier p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void assertValidFromUid(int p0) {}
    public android.net.NetworkSpecifier redact() { return null; }
}
