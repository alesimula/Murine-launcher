package android.hardware.tv.tuner;

public class FrontendAtsc3PlpSettings implements android.os.Parcelable {
    public int plpId;
    public int modulation;
    public int interleaveMode;
    public int codeRate;
    public int fec;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendAtsc3PlpSettings> CREATOR = null;
    public FrontendAtsc3PlpSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
