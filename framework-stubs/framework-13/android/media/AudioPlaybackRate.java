package android.media;

public class AudioPlaybackRate implements android.os.Parcelable {
    public float speed;
    public float pitch;
    public int stretchMode;
    public int fallbackMode;
    public static final android.os.Parcelable.Creator<android.media.AudioPlaybackRate> CREATOR = null;
    public AudioPlaybackRate() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
