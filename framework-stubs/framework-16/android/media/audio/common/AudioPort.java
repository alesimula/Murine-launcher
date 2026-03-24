package android.media.audio.common;

public class AudioPort implements android.os.Parcelable {
    public int id;
    public java.lang.String name;
    public android.media.audio.common.AudioProfile[] profiles;
    public android.media.audio.common.AudioIoFlags flags;
    public android.media.audio.common.ExtraAudioDescriptor[] extraAudioDescriptors;
    public android.media.audio.common.AudioGain[] gains;
    public android.media.audio.common.AudioPortExt ext;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioPort> CREATOR = null;
    public AudioPort() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
