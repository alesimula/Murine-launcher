package android.net.wifi.p2p;

public class WifiP2pGroup implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pGroup> CREATOR = null;
    public static final int NETWORK_ID_PERSISTENT = -2;
    public static final int NETWORK_ID_TEMPORARY = -1;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int SECURITY_TYPE_UNKNOWN = -1;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int SECURITY_TYPE_WPA2_PSK = 0;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int SECURITY_TYPE_WPA3_COMPATIBILITY = 1;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int SECURITY_TYPE_WPA3_SAE = 2;
    public WifiP2pGroup() {}
    public WifiP2pGroup(android.net.wifi.p2p.WifiP2pGroup p0) {}
    public int describeContents() { return 0; }
    public java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> getClientList() { return null; }
    public int getFrequency() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    @android.annotation.Nullable
    public android.net.MacAddress getGroupOwnerBssid() { return null; }
    public java.lang.String getInterface() { return null; }
    public int getNetworkId() { return 0; }
    public java.lang.String getNetworkName() { return null; }
    public android.net.wifi.p2p.WifiP2pDevice getOwner() { return null; }
    public java.lang.String getPassphrase() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public int getSecurityType() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    public boolean isGroupOwner() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
