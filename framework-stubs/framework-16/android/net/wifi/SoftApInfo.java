package android.net.wifi;

public final class SoftApInfo implements android.os.Parcelable {
    public static final int CHANNEL_WIDTH_160MHZ = 6;
    public static final int CHANNEL_WIDTH_20MHZ = 2;
    public static final int CHANNEL_WIDTH_20MHZ_NOHT = 1;
    public static final int CHANNEL_WIDTH_2160MHZ = 7;
    public static final int CHANNEL_WIDTH_320MHZ = 11;
    public static final int CHANNEL_WIDTH_40MHZ = 3;
    public static final int CHANNEL_WIDTH_4320MHZ = 8;
    public static final int CHANNEL_WIDTH_6480MHZ = 9;
    public static final int CHANNEL_WIDTH_80MHZ = 4;
    public static final int CHANNEL_WIDTH_80MHZ_PLUS_MHZ = 5;
    public static final int CHANNEL_WIDTH_8640MHZ = 10;
    public static final int CHANNEL_WIDTH_AUTO = -1;
    public static final int CHANNEL_WIDTH_INVALID = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.SoftApInfo> CREATOR = null;
    SoftApInfo() {}
    public int describeContents() { return 0; }
    public long getAutoShutdownTimeoutMillis() { return 0L; }
    public int getBandwidth() { return 0; }
    @android.annotation.Nullable
    public android.net.MacAddress getBssid() { return null; }
    public int getFrequency() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.mlo_sap")
    @android.annotation.Nullable
    public android.net.MacAddress getMldAddress() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    public int getWifiStandard() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
