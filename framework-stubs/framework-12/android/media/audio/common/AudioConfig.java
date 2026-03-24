package android.media.audio.common;

public class AudioConfig implements android.os.Parcelable {
    public int sampleRateHz;
    public int channelMask;
    public int format;
    public android.media.audio.common.AudioOffloadInfo offloadInfo;
    public long frameCount;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioConfig> CREATOR = null;
    public AudioConfig() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}
