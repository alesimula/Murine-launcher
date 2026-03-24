package android.net.wifi;

public final class UriParserResults implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.UriParserResults> CREATOR = null;
    public static final int URI_SCHEME_DPP = 2;
    public static final int URI_SCHEME_ZXING_WIFI_NETWORK_CONFIG = 1;
    UriParserResults() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getInformation() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPublicKey() { return null; }
    public int getUriScheme() { return 0; }
    @android.annotation.Nullable
    public android.net.wifi.WifiConfiguration getWifiConfiguration() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
