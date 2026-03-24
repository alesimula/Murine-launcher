package android.hardware.tv.tuner;

public class FrontendDvbtSettings implements android.os.Parcelable {
    public long frequency;
    public long endFrequency;
    public int inversion;
    public int transmissionMode;
    public int bandwidth;
    public int constellation;
    public int hierarchy;
    public int hpCoderate;
    public int lpCoderate;
    public int guardInterval;
    public boolean isHighPriority;
    public byte standard;
    public boolean isMiso;
    public int plpMode;
    public int plpId;
    public int plpGroupId;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbtSettings> CREATOR = null;
    public FrontendDvbtSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
