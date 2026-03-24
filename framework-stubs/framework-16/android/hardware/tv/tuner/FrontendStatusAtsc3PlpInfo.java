package android.hardware.tv.tuner;

public class FrontendStatusAtsc3PlpInfo implements android.os.Parcelable {
    public int plpId;
    public boolean isLocked;
    public int uec;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendStatusAtsc3PlpInfo> CREATOR = null;
    public FrontendStatusAtsc3PlpInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
