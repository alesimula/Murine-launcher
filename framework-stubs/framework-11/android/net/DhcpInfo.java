package android.net;

public class DhcpInfo implements android.os.Parcelable {
    public int ipAddress;
    public int gateway;
    public int netmask;
    public int dns1;
    public int dns2;
    public int serverAddress;
    public int leaseDuration;
    public static final android.os.Parcelable.Creator<android.net.DhcpInfo> CREATOR = null;
    public DhcpInfo() {}
    public DhcpInfo(android.net.DhcpInfo p0) {}
    public java.lang.String toString() { return null; }
    private static void putAddress(java.lang.StringBuffer p0, int p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
