package android.net.wifi;

@android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
public final class UriParserResults implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.UriParserResults> CREATOR = null;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int URI_SCHEME_DPP = 2;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int URI_SCHEME_ZXING_WIFI_NETWORK_CONFIG = 1;
    UriParserResults() {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.Nullable
    public java.lang.String getInformation() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.Nullable
    public java.lang.String getPublicKey() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getUriScheme() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.Nullable
    public android.net.wifi.WifiConfiguration getWifiConfiguration() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
