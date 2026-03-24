package android.media;

public class AudioPortConfigFw implements android.os.Parcelable {
    public android.media.audio.common.AudioPortConfig hal;
    public android.media.AudioPortConfigSys sys;
    public static final android.os.Parcelable.Creator<android.media.AudioPortConfigFw> CREATOR = null;
    public AudioPortConfigFw() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
