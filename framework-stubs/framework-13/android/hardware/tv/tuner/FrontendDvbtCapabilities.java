package android.hardware.tv.tuner;

public class FrontendDvbtCapabilities implements android.os.Parcelable {
    public int transmissionModeCap;
    public int bandwidthCap;
    public int constellationCap;
    public int coderateCap;
    public int hierarchyCap;
    public int guardIntervalCap;
    public boolean isT2Supported;
    public boolean isMisoSupported;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbtCapabilities> CREATOR = null;
    public FrontendDvbtCapabilities() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
