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
    public int getFrequency() { return 0; }
    public int getBandwidth() { return 0; }
    @android.annotation.Nullable
    public android.net.MacAddress getBssid() { return null; }
    public int getWifiStandard() { return 0; }
    public long getAutoShutdownTimeoutMillis() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
