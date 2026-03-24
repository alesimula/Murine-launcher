package android.net.wifi.p2p;

public class WifiP2pInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pInfo> CREATOR = null;
    public boolean groupFormed;
    public java.net.InetAddress groupOwnerAddress;
    public boolean isGroupOwner;
    public WifiP2pInfo() {}
    public WifiP2pInfo(android.net.wifi.p2p.WifiP2pInfo p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
