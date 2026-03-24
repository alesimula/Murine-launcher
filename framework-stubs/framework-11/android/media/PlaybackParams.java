package android.media;

public final class PlaybackParams implements android.os.Parcelable {
    public static final int AUDIO_FALLBACK_MODE_DEFAULT = 0;
    public static final int AUDIO_FALLBACK_MODE_MUTE = 1;
    public static final int AUDIO_FALLBACK_MODE_FAIL = 2;
    public static final int AUDIO_STRETCH_MODE_DEFAULT = 0;
    public static final int AUDIO_STRETCH_MODE_VOICE = 1;
    private static final int SET_SPEED = 1;
    private static final int SET_PITCH = 2;
    private static final int SET_AUDIO_FALLBACK_MODE = 4;
    private static final int SET_AUDIO_STRETCH_MODE = 8;
    private int mSet;
    private int mAudioFallbackMode;
    private int mAudioStretchMode;
    private float mPitch;
    private float mSpeed;
    public static final android.os.Parcelable.Creator<android.media.PlaybackParams> CREATOR = null;
    public PlaybackParams() {}
    private PlaybackParams(android.os.Parcel p0) {}
    public android.media.PlaybackParams allowDefaults() { return null; }
    public android.media.PlaybackParams setAudioFallbackMode(int p0) { return null; }
    public int getAudioFallbackMode() { return 0; }
    public android.media.PlaybackParams setAudioStretchMode(int p0) { return null; }
    public int getAudioStretchMode() { return 0; }
    public android.media.PlaybackParams setPitch(float p0) { return null; }
    public float getPitch() { return 0.0f; }
    public android.media.PlaybackParams setSpeed(float p0) { return null; }
    public float getSpeed() { return 0.0f; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioFallbackMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioStretchMode {
    }
}
