package android.media;

public final class AudioRecordingConfiguration implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.AudioRecordingConfiguration> CREATOR = null;
    public AudioRecordingConfiguration(int p0, int p1, int p2, android.media.AudioFormat p3, android.media.AudioFormat p4, int p5, java.lang.String p6, int p7, boolean p8, int p9, android.media.audiofx.AudioEffect.Descriptor[] p10, android.media.audiofx.AudioEffect.Descriptor[] p11) {}
    public AudioRecordingConfiguration(int p0, int p1, int p2, android.media.AudioFormat p3, android.media.AudioFormat p4, int p5, java.lang.String p6) {}
    public void dump(java.io.PrintWriter p0) {}
    public static java.lang.String toLogFriendlyString(android.media.AudioRecordingConfiguration p0) { return null; }
    public static android.media.AudioRecordingConfiguration anonymizedCopy(android.media.AudioRecordingConfiguration p0) { return null; }
    public int getClientAudioSource() { return 0; }
    public int getClientAudioSessionId() { return 0; }
    public android.media.AudioFormat getFormat() { return null; }
    public android.media.AudioFormat getClientFormat() { return null; }
    public java.lang.String getClientPackageName() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int getClientUid() { return 0; }
    public android.media.AudioDeviceInfo getAudioDevice() { return null; }
    public int getClientPortId() { return 0; }
    public boolean isClientSilenced() { return false; }
    public int getAudioSource() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.media.audiofx.AudioEffect.Descriptor> getClientEffects() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.media.audiofx.AudioEffect.Descriptor> getEffects() { return null; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioSource {
    }
}
