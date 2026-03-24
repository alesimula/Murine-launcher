package android.media.audio.common;

public class AudioPortConfig implements android.os.Parcelable {
    public int id;
    public int portId;
    public android.media.audio.common.Int sampleRate;
    public android.media.audio.common.AudioChannelLayout channelMask;
    public android.media.audio.common.AudioFormatDescription format;
    public android.media.audio.common.AudioGainConfig gain;
    public android.media.audio.common.AudioIoFlags flags;
    public android.media.audio.common.AudioPortExt ext;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioPortConfig> CREATOR = null;
    public AudioPortConfig() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
