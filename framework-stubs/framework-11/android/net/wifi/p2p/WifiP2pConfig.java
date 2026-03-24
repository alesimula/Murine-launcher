package android.net.wifi.p2p;

public class WifiP2pConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pConfig> CREATOR = null;
    public static final int GROUP_OWNER_BAND_2GHZ = 1;
    public static final int GROUP_OWNER_BAND_5GHZ = 2;
    public static final int GROUP_OWNER_BAND_AUTO = 0;
    public static final int GROUP_OWNER_INTENT_AUTO = -1;
    public static final int GROUP_OWNER_INTENT_MAX = 15;
    public static final int GROUP_OWNER_INTENT_MIN = 0;
    public java.lang.String deviceAddress;
    public int groupOwnerIntent;
    public android.net.wifi.WpsInfo wps;
    public WifiP2pConfig() {}
    public WifiP2pConfig(android.net.wifi.p2p.WifiP2pConfig p0) {}
    @android.annotation.Nullable
    public java.lang.String getNetworkName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPassphrase() { return null; }
    public int getGroupOwnerBand() { return 0; }
    public int getNetworkId() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setDeviceAddress(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setNetworkName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setPassphrase(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setGroupOperatingBand(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder setGroupOperatingFrequency(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig.Builder enablePersistentMode(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pConfig build() { return null; }
    }
}
