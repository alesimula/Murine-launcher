package android.hardware.tv.tuner;

public class FrontendDvbsCapabilities implements android.os.Parcelable {
    public int modulationCap;
    public long innerfecCap;
    public byte standard;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbsCapabilities> CREATOR = null;
    public FrontendDvbsCapabilities() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
