package android.media.audio.common;

public class AudioDevice implements android.os.Parcelable {
    public android.media.audio.common.AudioDeviceDescription type;
    public android.media.audio.common.AudioDeviceAddress address;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioDevice> CREATOR = null;
    public AudioDevice() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
