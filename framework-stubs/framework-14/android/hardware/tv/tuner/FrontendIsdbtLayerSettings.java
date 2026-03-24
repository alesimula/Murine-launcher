package android.hardware.tv.tuner;

public class FrontendIsdbtLayerSettings implements android.os.Parcelable {
    public int modulation;
    public int coderate;
    public int timeInterleave;
    public int numOfSegment;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIsdbtLayerSettings> CREATOR = null;
    public FrontendIsdbtLayerSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
