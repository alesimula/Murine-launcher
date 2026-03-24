package android.hardware.tv.tuner;

public class FrontendIsdbtCapabilities implements android.os.Parcelable {
    public int modeCap;
    public int bandwidthCap;
    public int modulationCap;
    public int coderateCap;
    public int guardIntervalCap;
    public int timeInterleaveCap;
    public boolean isSegmentAuto;
    public boolean isFullSegment;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIsdbtCapabilities> CREATOR = null;
    public FrontendIsdbtCapabilities() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
