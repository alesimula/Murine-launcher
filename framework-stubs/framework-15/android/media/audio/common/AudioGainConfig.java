package android.media.audio.common;

public class AudioGainConfig implements android.os.Parcelable {
    public int index;
    public int mode;
    public android.media.audio.common.AudioChannelLayout channelMask;
    public int[] values;
    public int rampDurationMs;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioGainConfig> CREATOR = null;
    public AudioGainConfig() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
