package android.hardware.tv.tuner;

public class FrontendAnalogSettings implements android.os.Parcelable {
    public long frequency;
    public long endFrequency;
    public int inversion;
    public int type;
    public int aftFlag;
    public int sifStandard;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendAnalogSettings> CREATOR = null;
    public FrontendAnalogSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
