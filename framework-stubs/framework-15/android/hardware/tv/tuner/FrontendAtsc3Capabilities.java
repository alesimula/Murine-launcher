package android.hardware.tv.tuner;

public class FrontendAtsc3Capabilities implements android.os.Parcelable {
    public int bandwidthCap;
    public int modulationCap;
    public int timeInterleaveModeCap;
    public int codeRateCap;
    public int fecCap;
    public byte demodOutputFormatCap;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendAtsc3Capabilities> CREATOR = null;
    public FrontendAtsc3Capabilities() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
