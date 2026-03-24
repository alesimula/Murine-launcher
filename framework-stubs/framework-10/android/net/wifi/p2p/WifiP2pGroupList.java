package android.net.wifi.p2p;

public class WifiP2pGroupList implements android.os.Parcelable {
    private static final int CREDENTIAL_MAX_NUM = 32;
    @android.annotation.UnsupportedAppUsage
    private final android.util.LruCache<java.lang.Integer, android.net.wifi.p2p.WifiP2pGroup> mGroups = null;
    private final android.net.wifi.p2p.WifiP2pGroupList.GroupDeleteListener mListener = null;
    private boolean isClearCalled;
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pGroupList> CREATOR = null;
    public WifiP2pGroupList() {}
    @android.annotation.UnsupportedAppUsage
    public WifiP2pGroupList(android.net.wifi.p2p.WifiP2pGroupList p0, android.net.wifi.p2p.WifiP2pGroupList.GroupDeleteListener p1) {}
    @android.annotation.UnsupportedAppUsage
    public java.util.Collection<android.net.wifi.p2p.WifiP2pGroup> getGroupList() { return null; }
    public void add(android.net.wifi.p2p.WifiP2pGroup p0) {}
    public void remove(int p0) {}
    void remove(java.lang.String p0) {}
    public boolean clear() { return false; }
    public int getNetworkId(java.lang.String p0) { return 0; }
    public int getNetworkId(java.lang.String p0, java.lang.String p1) { return 0; }
    public java.lang.String getOwnerAddr(int p0) { return null; }
    public boolean contains(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static interface GroupDeleteListener {
        public void onDeleteGroup(int p0);
    }
}
