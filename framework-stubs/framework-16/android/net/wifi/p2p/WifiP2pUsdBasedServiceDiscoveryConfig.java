package android.net.wifi.p2p;

@android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
public final class WifiP2pUsdBasedServiceDiscoveryConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pUsdBasedServiceDiscoveryConfig> CREATOR = null;
    WifiP2pUsdBasedServiceDiscoveryConfig() {}
    public int describeContents() { return 0; }
    public int getBand() { return 0; }
    @android.annotation.Nullable
    public int[] getFrequenciesMhz() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pUsdBasedServiceDiscoveryConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pUsdBasedServiceDiscoveryConfig.Builder setBand(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pUsdBasedServiceDiscoveryConfig.Builder setFrequenciesMhz(int[] p0) { return null; }
    }
}
