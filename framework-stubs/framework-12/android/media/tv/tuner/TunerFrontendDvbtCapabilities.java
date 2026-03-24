package android.media.tv.tuner;

public class TunerFrontendDvbtCapabilities implements android.os.Parcelable {
    public int transmissionModeCap;
    public int bandwidthCap;
    public int constellationCap;
    public int codeRateCap;
    public int hierarchyCap;
    public int guardIntervalCap;
    public boolean isT2Supported;
    public boolean isMisoSupported;
    public static final android.os.Parcelable.Creator<android.media.tv.tuner.TunerFrontendDvbtCapabilities> CREATOR = null;
    public TunerFrontendDvbtCapabilities() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
