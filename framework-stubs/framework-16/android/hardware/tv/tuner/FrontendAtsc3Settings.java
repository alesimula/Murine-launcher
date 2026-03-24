package android.hardware.tv.tuner;

public class FrontendAtsc3Settings implements android.os.Parcelable {
    public long frequency;
    public long endFrequency;
    public int bandwidth;
    public int inversion;
    public byte demodOutputFormat;
    public android.hardware.tv.tuner.FrontendAtsc3PlpSettings[] plpSettings;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendAtsc3Settings> CREATOR = null;
    public FrontendAtsc3Settings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
