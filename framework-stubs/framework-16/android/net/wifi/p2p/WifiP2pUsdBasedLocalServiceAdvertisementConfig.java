package android.net.wifi.p2p;

@android.annotation.FlaggedApi("com.android.wifi.flags.wifi_direct_r2")
public final class WifiP2pUsdBasedLocalServiceAdvertisementConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pUsdBasedLocalServiceAdvertisementConfig> CREATOR = null;
    WifiP2pUsdBasedLocalServiceAdvertisementConfig() {}
    public int describeContents() { return 0; }
    public int getFrequencyMhz() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pUsdBasedLocalServiceAdvertisementConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pUsdBasedLocalServiceAdvertisementConfig.Builder setFrequencyMhz(int p0) { return null; }
    }
}
