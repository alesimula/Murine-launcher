package android.hardware.tv.tuner;

public class DemuxTlvFilterSettings implements android.os.Parcelable {
    public int packetType;
    public boolean isCompressedIpPacket;
    public android.hardware.tv.tuner.DemuxTlvFilterSettingsFilterSettings filterSettings;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxTlvFilterSettings> CREATOR = null;
    public DemuxTlvFilterSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
