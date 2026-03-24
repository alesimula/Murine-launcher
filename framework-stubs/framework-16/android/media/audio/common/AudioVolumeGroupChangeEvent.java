package android.media.audio.common;

public class AudioVolumeGroupChangeEvent implements android.os.Parcelable {
    public int groupId;
    public int volumeIndex;
    public boolean muted;
    public int flags;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioVolumeGroupChangeEvent> CREATOR = null;
    public static final int VOLUME_FLAG_SHOW_UI = 1;
    public static final int VOLUME_FLAG_ALLOW_RINGER_MODES = 2;
    public static final int VOLUME_FLAG_PLAY_SOUND = 4;
    public static final int VOLUME_FLAG_REMOVE_SOUND_AND_VIBRATE = 8;
    public static final int VOLUME_FLAG_VIBRATE = 16;
    public static final int VOLUME_FLAG_FIXED_VOLUME = 32;
    public static final int VOLUME_FLAG_BLUETOOTH_ABS_VOLUME = 64;
    public static final int VOLUME_FLAG_SHOW_SILENT_HINT = 128;
    public static final int VOLUME_FLAG_HDMI_SYSTEM_AUDIO_VOLUME = 256;
    public static final int VOLUME_FLAG_ACTIVE_MEDIA_ONLY = 512;
    public static final int VOLUME_FLAG_SHOW_UI_WARNINGS = 1024;
    public static final int VOLUME_FLAG_SHOW_VIBRATE_HINT = 2048;
    public static final int VOLUME_FLAG_FROM_KEY = 4096;
    public static final int VOLUME_FLAG_ABSOLUTE_VOLUME = 8192;
    public AudioVolumeGroupChangeEvent() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
