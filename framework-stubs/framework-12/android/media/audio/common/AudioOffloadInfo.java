package android.media.audio.common;

public class AudioOffloadInfo implements android.os.Parcelable {
    public int sampleRateHz;
    public int channelMask;
    public int format;
    public int streamType;
    public int bitRatePerSecond;
    public long durationMicroseconds;
    public boolean hasVideo;
    public boolean isStreaming;
    public int bitWidth;
    public int bufferSize;
    public int usage;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioOffloadInfo> CREATOR = null;
    public AudioOffloadInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
