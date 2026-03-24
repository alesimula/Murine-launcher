package android.hardware.tv.tuner;

public class FrontendDvbcSettings implements android.os.Parcelable {
    public long frequency;
    public long endFrequency;
    public int modulation;
    public long fec;
    public int symbolRate;
    public int outerFec;
    public byte annex;
    public int inversion;
    public int interleaveMode;
    public int bandwidth;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbcSettings> CREATOR = null;
    public FrontendDvbcSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
