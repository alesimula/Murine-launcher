package android.net.wifi;

public final class SoftApInfo implements android.os.Parcelable {
    public static final int CHANNEL_WIDTH_160MHZ = 6;
    public static final int CHANNEL_WIDTH_20MHZ = 2;
    public static final int CHANNEL_WIDTH_20MHZ_NOHT = 1;
    public static final int CHANNEL_WIDTH_40MHZ = 3;
    public static final int CHANNEL_WIDTH_80MHZ = 4;
    public static final int CHANNEL_WIDTH_80MHZ_PLUS_MHZ = 5;
    public static final int CHANNEL_WIDTH_INVALID = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.SoftApInfo> CREATOR = null;
    SoftApInfo() {}
    public int getFrequency() { return 0; }
    public int getBandwidth() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
