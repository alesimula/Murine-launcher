package android.net.wifi.p2p;

public class WifiP2pGroup implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pGroup> CREATOR = null;
    public static final int NETWORK_ID_PERSISTENT = -2;
    public static final int NETWORK_ID_TEMPORARY = -1;
    public WifiP2pGroup() {}
    public WifiP2pGroup(android.net.wifi.p2p.WifiP2pGroup p0) {}
    public java.lang.String getNetworkName() { return null; }
    public boolean isGroupOwner() { return false; }
    public android.net.wifi.p2p.WifiP2pDevice getOwner() { return null; }
    public java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> getClientList() { return null; }
    public java.lang.String getPassphrase() { return null; }
    public java.lang.String getInterface() { return null; }
    public int getNetworkId() { return 0; }
    public int getFrequency() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
