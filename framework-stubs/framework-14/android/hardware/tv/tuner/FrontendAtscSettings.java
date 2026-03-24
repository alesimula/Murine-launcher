package android.hardware.tv.tuner;

public class FrontendAtscSettings implements android.os.Parcelable {
    public long frequency;
    public long endFrequency;
    public int inversion;
    public int modulation;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendAtscSettings> CREATOR = null;
    public FrontendAtscSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
