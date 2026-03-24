package android.hardware.tv.tuner;

public class FrontendDvbcCapabilities implements android.os.Parcelable {
    public int modulationCap;
    public long fecCap;
    public byte annexCap;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbcCapabilities> CREATOR = null;
    public FrontendDvbcCapabilities() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
