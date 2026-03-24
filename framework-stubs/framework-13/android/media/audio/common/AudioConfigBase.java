package android.media.audio.common;

public class AudioConfigBase implements android.os.Parcelable {
    public int sampleRate;
    public android.media.audio.common.AudioChannelLayout channelMask;
    public android.media.audio.common.AudioFormatDescription format;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioConfigBase> CREATOR = null;
    public AudioConfigBase() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
