package android.media.audiopolicy;

@android.annotation.SystemApi
public final class AudioVolumeGroup implements android.os.Parcelable {
    private static final java.lang.String TAG = "AudioVolumeGroup";
    public static final int DEFAULT_VOLUME_GROUP = -1;
    private int mId;
    private final java.lang.String mName = null;
    private final android.media.AudioAttributes[] mAudioAttributes = null;
    private int[] mLegacyStreamTypes;
    private static final java.lang.Object sLock = null;
    private static java.util.List<android.media.audiopolicy.AudioVolumeGroup> sAudioVolumeGroups;
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioVolumeGroup> CREATOR = null;
    public static java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() { return null; }
    private static java.util.List<android.media.audiopolicy.AudioVolumeGroup> initializeAudioVolumeGroups() { return null; }
    private static native int native_list_audio_volume_groups(java.util.ArrayList<android.media.audiopolicy.AudioVolumeGroup> p0);
    AudioVolumeGroup(java.lang.String p0, int p1, android.media.AudioAttributes[] p2, int[] p3) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.media.AudioAttributes> getAudioAttributes() { return null; }
    public int[] getLegacyStreamTypes() { return null; }
    public java.lang.String name() { return null; }
    public int getId() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
