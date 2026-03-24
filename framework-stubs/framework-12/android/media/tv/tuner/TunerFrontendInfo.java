package android.media.tv.tuner;

public class TunerFrontendInfo implements android.os.Parcelable {
    public int handle;
    public int type;
    public int minFrequency;
    public int maxFrequency;
    public int minSymbolRate;
    public int maxSymbolRate;
    public int acquireRange;
    public int exclusiveGroupId;
    public int[] statusCaps;
    public android.media.tv.tuner.TunerFrontendCapabilities caps;
    public static final android.os.Parcelable.Creator<android.media.tv.tuner.TunerFrontendInfo> CREATOR = null;
    public TunerFrontendInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}
