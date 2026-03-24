package android.media.audio.common;

public class AudioAttributes implements android.os.Parcelable {
    public int contentType;
    public int usage;
    public int source;
    public int flags;
    public java.lang.String[] tags;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioAttributes> CREATOR = null;
    public AudioAttributes() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
