package android.media;

public class AudioRoute implements android.os.Parcelable {
    public int[] sourcePortIds;
    public int sinkPortId;
    public boolean isExclusive;
    public static final android.os.Parcelable.Creator<android.media.AudioRoute> CREATOR = null;
    public AudioRoute() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
