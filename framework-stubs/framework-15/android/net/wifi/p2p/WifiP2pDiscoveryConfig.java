package android.net.wifi.p2p;

public final class WifiP2pDiscoveryConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pDiscoveryConfig> CREATOR = null;
    WifiP2pDiscoveryConfig() {}
    public int describeContents() { return 0; }
    public int getFrequencyMhz() { return 0; }
    public int getScanType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pDiscoveryConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pDiscoveryConfig.Builder setFrequencyMhz(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pDiscoveryConfig.Builder setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) { return null; }
    }
}
