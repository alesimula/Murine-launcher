package android.hardware.tv.tuner;

public class FrontendDtmbSettings implements android.os.Parcelable {
    public long frequency;
    public long endFrequency;
    public int inversion;
    public int transmissionMode;
    public int bandwidth;
    public int modulation;
    public int codeRate;
    public int guardInterval;
    public int interleaveMode;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDtmbSettings> CREATOR = null;
    public FrontendDtmbSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
