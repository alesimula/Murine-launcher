package android.hardware.tv.tuner;

public class DemuxAlpFilterSettings implements android.os.Parcelable {
    public int packetType;
    public byte lengthType;
    public android.hardware.tv.tuner.DemuxAlpFilterSettingsFilterSettings filterSettings;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxAlpFilterSettings> CREATOR = null;
    public DemuxAlpFilterSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
