package android.media;

public class AudioIoDescriptor implements android.os.Parcelable {
    public int ioHandle;
    public android.media.AudioPatch patch;
    public boolean isInput;
    public int samplingRate;
    public android.media.audio.common.AudioFormatDescription format;
    public android.media.audio.common.AudioChannelLayout channelMask;
    public long frameCount;
    public long frameCountHAL;
    public int latency;
    public int portId;
    public static final android.os.Parcelable.Creator<android.media.AudioIoDescriptor> CREATOR = null;
    public AudioIoDescriptor() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
