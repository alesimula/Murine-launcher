package android.hardware.tv.tuner;

public class FrontendDtmbCapabilities implements android.os.Parcelable {
    public int transmissionModeCap;
    public int bandwidthCap;
    public int modulationCap;
    public int codeRateCap;
    public int guardIntervalCap;
    public int interleaveModeCap;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDtmbCapabilities> CREATOR = null;
    public FrontendDtmbCapabilities() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
