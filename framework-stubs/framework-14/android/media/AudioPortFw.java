package android.media;

public class AudioPortFw implements android.os.Parcelable {
    public android.media.audio.common.AudioPort hal;
    public android.media.AudioPortSys sys;
    public static final android.os.Parcelable.Creator<android.media.AudioPortFw> CREATOR = null;
    public AudioPortFw() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
