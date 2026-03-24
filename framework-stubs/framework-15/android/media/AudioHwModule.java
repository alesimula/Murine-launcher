package android.media;

public class AudioHwModule implements android.os.Parcelable {
    public int handle;
    public java.lang.String name;
    public android.media.audio.common.AudioPort[] ports;
    public android.media.AudioRoute[] routes;
    public static final android.os.Parcelable.Creator<android.media.AudioHwModule> CREATOR = null;
    public AudioHwModule() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
