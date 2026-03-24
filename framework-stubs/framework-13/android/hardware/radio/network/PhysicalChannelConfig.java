package android.hardware.radio.network;

public class PhysicalChannelConfig implements android.os.Parcelable {
    public int status;
    public int rat;
    public int downlinkChannelNumber;
    public int uplinkChannelNumber;
    public int cellBandwidthDownlinkKhz;
    public int cellBandwidthUplinkKhz;
    public int[] contextIds;
    public int physicalCellId;
    public android.hardware.radio.network.PhysicalChannelConfigBand band;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.PhysicalChannelConfig> CREATOR = null;
    public PhysicalChannelConfig() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
