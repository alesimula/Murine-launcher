package android.net.wifi.p2p;

@android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
public final class WifiP2pExtListenParams implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pExtListenParams> CREATOR = null;
    WifiP2pExtListenParams() {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final class Builder {
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        public Builder() {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pExtListenParams build() { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.p2p.WifiP2pExtListenParams.Builder setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) { return null; }
    }
}
