package android.net.wifi.p2p;

public class WifiP2pConfig implements android.os.Parcelable {
    public java.lang.String deviceAddress;
    public android.net.wifi.WpsInfo wps;
    public java.lang.String networkName;
    public java.lang.String passphrase;
    public int groupOwnerBand;
    public static final int MAX_GROUP_OWNER_INTENT = 15;
    @android.annotation.UnsupportedAppUsage
    public static final int MIN_GROUP_OWNER_INTENT = 0;
    public static final int GROUP_OWNER_BAND_AUTO = 0;
    public static final int GROUP_OWNER_BAND_2GHZ = 1;
    public static final int GROUP_OWNER_BAND_5GHZ = 2;
    public int groupOwnerIntent;
    @android.annotation.UnsupportedAppUsage
    public int netId;
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pConfig> CREATOR = null;
    public WifiP2pConfig() {}
    public void invalidate() {}
    @android.annotation.UnsupportedAppUsage
    public WifiP2pConfig(java.lang.String p0) throws java.lang.IllegalArgumentException {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public WifiP2pConfig(android.net.wifi.p2p.WifiP2pConfig p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GroupOperatingBandType {
    }

    public static final class Builder {
        private static final android.net.MacAddress MAC_ANY_ADDRESS = null;
        private android.net.MacAddress mDeviceAddress;
        private java.lang.String mNetworkName;
        private java.lang.String mPassphrase;
        private int mGroupOperatingBand;
        private int mGroupOperatingFrequency;
        private int mNetId;
        public Builder() {}
        public android.net.wifi.p2p.WifiP2pConfig.Builder setDeviceAddress(android.net.MacAddress p0) { return null; }
        public android.net.wifi.p2p.WifiP2pConfig.Builder setNetworkName(java.lang.String p0) { return null; }
        public android.net.wifi.p2p.WifiP2pConfig.Builder setPassphrase(java.lang.String p0) { return null; }
        public android.net.wifi.p2p.WifiP2pConfig.Builder setGroupOperatingBand(int p0) { return null; }
        public android.net.wifi.p2p.WifiP2pConfig.Builder setGroupOperatingFrequency(int p0) { return null; }
        public android.net.wifi.p2p.WifiP2pConfig.Builder enablePersistentMode(boolean p0) { return null; }
        public android.net.wifi.p2p.WifiP2pConfig build() { return null; }
    }
}
