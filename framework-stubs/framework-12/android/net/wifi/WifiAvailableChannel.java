package android.net.wifi;

public final class WifiAvailableChannel implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiAvailableChannel> CREATOR = null;
    public static final int OP_MODE_SAP = 2;
    public static final int OP_MODE_STA = 1;
    public static final int OP_MODE_TDLS = 32;
    public static final int OP_MODE_WIFI_AWARE = 16;
    public static final int OP_MODE_WIFI_DIRECT_CLI = 4;
    public static final int OP_MODE_WIFI_DIRECT_GO = 8;
    public WifiAvailableChannel(int p0, int p1) {}
    public int getFrequencyMhz() { return 0; }
    public int getOperationalModes() { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
