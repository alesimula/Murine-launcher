package android.hardware.tv.tuner;

public class RecordSettings implements android.os.Parcelable {
    public int statusMask;
    public long lowThreshold;
    public long highThreshold;
    public int dataFormat;
    public long packetSize;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.RecordSettings> CREATOR = null;
    public RecordSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
