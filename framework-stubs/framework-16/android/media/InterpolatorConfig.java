package android.media;

public class InterpolatorConfig implements android.os.Parcelable {
    public int type;
    public float firstSlope;
    public float lastSlope;
    public float[] xy;
    public static final android.os.Parcelable.Creator<android.media.InterpolatorConfig> CREATOR = null;
    public InterpolatorConfig() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
