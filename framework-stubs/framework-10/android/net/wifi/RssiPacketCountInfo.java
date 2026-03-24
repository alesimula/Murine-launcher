package android.net.wifi;

public class RssiPacketCountInfo implements android.os.Parcelable {
    public int rssi;
    public int txgood;
    public int txbad;
    public int rxgood;
    public static final android.os.Parcelable.Creator<android.net.wifi.RssiPacketCountInfo> CREATOR = null;
    public RssiPacketCountInfo() {}
    private RssiPacketCountInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
