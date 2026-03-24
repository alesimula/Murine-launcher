package android.hardware.tv.tuner;

public class DemuxIpAddress implements android.os.Parcelable {
    public android.hardware.tv.tuner.DemuxIpAddressIpAddress srcIpAddress;
    public android.hardware.tv.tuner.DemuxIpAddressIpAddress dstIpAddress;
    public int srcPort;
    public int dstPort;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxIpAddress> CREATOR = null;
    public DemuxIpAddress() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
