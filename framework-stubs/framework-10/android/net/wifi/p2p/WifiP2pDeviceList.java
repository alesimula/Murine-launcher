package android.net.wifi.p2p;

public class WifiP2pDeviceList implements android.os.Parcelable {
    private final java.util.HashMap<java.lang.String, android.net.wifi.p2p.WifiP2pDevice> mDevices = null;
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pDeviceList> CREATOR = null;
    public WifiP2pDeviceList() {}
    public WifiP2pDeviceList(android.net.wifi.p2p.WifiP2pDeviceList p0) {}
    public WifiP2pDeviceList(java.util.ArrayList<android.net.wifi.p2p.WifiP2pDevice> p0) {}
    private void validateDevice(android.net.wifi.p2p.WifiP2pDevice p0) {}
    private void validateDeviceAddress(java.lang.String p0) {}
    public boolean clear() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void update(android.net.wifi.p2p.WifiP2pDevice p0) {}
    public void updateSupplicantDetails(android.net.wifi.p2p.WifiP2pDevice p0) {}
    public void updateGroupCapability(java.lang.String p0, int p1) {}
    public void updateStatus(java.lang.String p0, int p1) {}
    public android.net.wifi.p2p.WifiP2pDevice get(java.lang.String p0) { return null; }
    public boolean remove(android.net.wifi.p2p.WifiP2pDevice p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.net.wifi.p2p.WifiP2pDevice remove(java.lang.String p0) { return null; }
    public boolean remove(android.net.wifi.p2p.WifiP2pDeviceList p0) { return false; }
    public java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> getDeviceList() { return null; }
    public boolean isGroupOwner(java.lang.String p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
