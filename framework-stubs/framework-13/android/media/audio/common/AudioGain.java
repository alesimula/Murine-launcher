package android.media.audio.common;

public class AudioGain implements android.os.Parcelable {
    public int mode;
    public android.media.audio.common.AudioChannelLayout channelMask;
    public int minValue;
    public int maxValue;
    public int defaultValue;
    public int stepValue;
    public int minRampMs;
    public int maxRampMs;
    public boolean useForVolume;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioGain> CREATOR = null;
    public AudioGain() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
