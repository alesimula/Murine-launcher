package android.media.audio.common;

public class AudioHalAttributesGroup implements android.os.Parcelable {
    public int streamType;
    public java.lang.String volumeGroupName;
    public android.media.audio.common.AudioAttributes[] attributes;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalAttributesGroup> CREATOR = null;
    public AudioHalAttributesGroup() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
