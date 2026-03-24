package android.net.wifi.p2p;

public class WifiP2pGroup implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage
    public static final int TEMPORARY_NET_ID = -1;
    public static final int PERSISTENT_NET_ID = -2;
    private java.lang.String mNetworkName;
    private android.net.wifi.p2p.WifiP2pDevice mOwner;
    private boolean mIsGroupOwner;
    private java.util.List<android.net.wifi.p2p.WifiP2pDevice> mClients;
    private java.lang.String mPassphrase;
    private java.lang.String mInterface;
    private int mNetId;
    private int mFrequency;
    private static final java.util.regex.Pattern groupStartedPattern = null;
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pGroup> CREATOR = null;
    public WifiP2pGroup() {}
    @android.annotation.UnsupportedAppUsage
    public WifiP2pGroup(java.lang.String p0) throws java.lang.IllegalArgumentException {}
    public void setNetworkName(java.lang.String p0) {}
    public java.lang.String getNetworkName() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setIsGroupOwner(boolean p0) {}
    public boolean isGroupOwner() { return false; }
    public void setOwner(android.net.wifi.p2p.WifiP2pDevice p0) {}
    public android.net.wifi.p2p.WifiP2pDevice getOwner() { return null; }
    public void addClient(java.lang.String p0) {}
    public void addClient(android.net.wifi.p2p.WifiP2pDevice p0) {}
    public boolean removeClient(java.lang.String p0) { return false; }
    public boolean removeClient(android.net.wifi.p2p.WifiP2pDevice p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isClientListEmpty() { return false; }
    public boolean contains(android.net.wifi.p2p.WifiP2pDevice p0) { return false; }
    public java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> getClientList() { return null; }
    public void setPassphrase(java.lang.String p0) {}
    public java.lang.String getPassphrase() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setInterface(java.lang.String p0) {}
    public java.lang.String getInterface() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getNetworkId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setNetworkId(int p0) {}
    public int getFrequency() { return 0; }
    public void setFrequency(int p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public WifiP2pGroup(android.net.wifi.p2p.WifiP2pGroup p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
