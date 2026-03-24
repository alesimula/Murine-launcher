package android.hardware.tv.tuner;

public class FrontendDvbsCodeRate implements android.os.Parcelable {
    public long fec;
    public boolean isLinear;
    public boolean isShortFrames;
    public int bitsPer1000Symbol;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendDvbsCodeRate> CREATOR = null;
    public FrontendDvbsCodeRate() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
