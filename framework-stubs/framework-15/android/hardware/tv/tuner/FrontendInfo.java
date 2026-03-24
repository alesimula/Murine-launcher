package android.hardware.tv.tuner;

public class FrontendInfo implements android.os.Parcelable {
    public int type;
    public long minFrequency;
    public long maxFrequency;
    public int minSymbolRate;
    public int maxSymbolRate;
    public long acquireRange;
    public int exclusiveGroupId;
    public int[] statusCaps;
    public android.hardware.tv.tuner.FrontendCapabilities frontendCaps;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendInfo> CREATOR = null;
    public FrontendInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
