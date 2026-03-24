package android.media.audiopolicy;

@android.annotation.SystemApi
public final class AudioVolumeGroup implements android.os.Parcelable {
    public static final int DEFAULT_VOLUME_GROUP = -1;
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioVolumeGroup> CREATOR = null;
    @android.annotation.NonNull
    public static java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() { return null; }
    AudioVolumeGroup(java.lang.String p0, int p1, android.media.AudioAttributes[] p2, int[] p3) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.media.AudioAttributes> getAudioAttributes() { return null; }
    @android.annotation.NonNull
    public int[] getLegacyStreamTypes() { return null; }
    @android.annotation.NonNull
    public java.lang.String name() { return null; }
    public int getId() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
}
