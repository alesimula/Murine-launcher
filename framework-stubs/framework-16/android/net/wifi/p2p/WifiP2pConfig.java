package android.net.wifi.p2p;

public class WifiP2pConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pConfig> CREATOR = null;
    public static final int GROUP_CLIENT_IP_PROVISIONING_MODE_IPV4_DHCP = 0;
    public static final int GROUP_CLIENT_IP_PROVISIONING_MODE_IPV6_LINK_LOCAL = 1;
    public static final int GROUP_OWNER_BAND_2GHZ = 1;
    public static final int GROUP_OWNER_BAND_5GHZ = 2;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int GROUP_OWNER_BAND_6GHZ = 3;
    public static final int GROUP_OWNER_BAND_AUTO = 0;
    public static final int GROUP_OWNER_INTENT_AUTO = -1;
    public static final int GROUP_OWNER_INTENT_MAX = 15;
    public static final int GROUP_OWNER_INTENT_MIN = 0;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int P2P_VERSION_1 = 0;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int P2P_VERSION_2 = 1;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int PCC_MODE_CONNECTION_TYPE_LEGACY_ONLY = 0;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int PCC_MODE_CONNECTION_TYPE_LEGACY_OR_R2 = 1;
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public static final int PCC_MODE_CONNECTION_TYPE_R2_ONLY = 2;
    public java.lang.String deviceAddress;
    public int groupOwnerIntent;
    public android.net.wifi.WpsInfo wps;
    public WifiP2pConfig() {}
    public WifiP2pConfig(android.net.wifi.p2p.WifiP2pConfig p0) {}
    public int describeContents() { return 0; }
    public int getGroupClientIpProvisioningMode() { return 0; }
    public int getGroupOwnerBand() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public int getGroupOwnerVersion() { return 0; }
    public int getNetworkId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getNetworkName() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    @android.annotation.Nullable
    public android.net.wifi.p2p.WifiP2pPairingBootstrappingConfig getPairingBootstrappingConfig() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPassphrase() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public int getPccModeConnectionType() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public boolean isAuthorizeConnectionFromPeerEnabled() { return false; }
    public boolean isJoinExistingGroup() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
    public void setGroupOwnerVersion(int p0) {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder enablePersistentMode(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setAuthorizeConnectionFromPeerEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setDeviceAddress(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setGroupClientIpProvisioningMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setGroupOperatingBand(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setGroupOperatingFrequency(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setJoinExistingGroup(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setNetworkName(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setPairingBootstrappingConfig(android.net.wifi.p2p.WifiP2pPairingBootstrappingConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setPassphrase(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setPccModeConnectionType(int p0) { return null; }
    }
}
