package android.net;

public class DhcpInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.DhcpInfo> CREATOR = null;
    public int dns1;
    public int dns2;
    public int gateway;
    public int ipAddress;
    public int leaseDuration;
    public int netmask;
    public int serverAddress;
    public DhcpInfo() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
