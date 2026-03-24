package android.media;

public class AudioPortSys implements android.os.Parcelable {
    public int role;
    public int type;
    public android.media.AudioProfileSys[] profiles;
    public android.media.AudioGainSys[] gains;
    public android.media.AudioPortConfig activeConfig;
    public android.media.AudioPortExtSys ext;
    public static final android.os.Parcelable.Creator<android.media.AudioPortSys> CREATOR = null;
    public AudioPortSys() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
