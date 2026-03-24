package android.media;

public class VolumeShaperConfiguration implements android.os.Parcelable {
    public int type;
    public int id;
    public int optionFlags;
    public double durationMs;
    public android.media.InterpolatorConfig interpolatorConfig;
    public static final android.os.Parcelable.Creator<android.media.VolumeShaperConfiguration> CREATOR = null;
    public VolumeShaperConfiguration() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
