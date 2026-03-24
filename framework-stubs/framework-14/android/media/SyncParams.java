package android.media;

public final class SyncParams {
    public static final int SYNC_SOURCE_DEFAULT = 0;
    public static final int SYNC_SOURCE_SYSTEM_CLOCK = 1;
    public static final int SYNC_SOURCE_AUDIO = 2;
    public static final int SYNC_SOURCE_VSYNC = 3;
    public static final int AUDIO_ADJUST_MODE_DEFAULT = 0;
    public static final int AUDIO_ADJUST_MODE_STRETCH = 1;
    public static final int AUDIO_ADJUST_MODE_RESAMPLE = 2;
    public SyncParams() {}
    public android.media.SyncParams allowDefaults() { return null; }
    public android.media.SyncParams setAudioAdjustMode(int p0) { return null; }
    public int getAudioAdjustMode() { return 0; }
    public android.media.SyncParams setSyncSource(int p0) { return null; }
    public int getSyncSource() { return 0; }
    public android.media.SyncParams setTolerance(float p0) { return null; }
    public float getTolerance() { return 0.0f; }
    public android.media.SyncParams setFrameRate(float p0) { return null; }
    public float getFrameRate() { return 0.0f; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioAdjustMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SyncSource {
    }
}
