package android.hardware.tv.tuner;

public class FrontendDvbsSettings implements android.os.Parcelable {
    public long frequency;
    public long endFrequency;
    public int inversion;
    public int modulation;
    public android.hardware.tv.tuner.FrontendDvbsCodeRate coderate;
    public int symbolRate;
    public int rolloff;
    public int pilot;
    public int inputStreamId;
    public byte standard;
    public int vcmMode;
    public int scanType;
    public boolean isDiseqcRxMessage;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbsSettings> CREATOR = null;
    public FrontendDvbsSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
