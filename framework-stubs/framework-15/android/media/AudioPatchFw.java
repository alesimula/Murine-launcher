package android.media;

public class AudioPatchFw implements android.os.Parcelable {
    public int id;
    public android.media.AudioPortConfigFw[] sources;
    public android.media.AudioPortConfigFw[] sinks;
    public static final android.os.Parcelable.Creator<android.media.AudioPatchFw> CREATOR = null;
    public AudioPatchFw() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
