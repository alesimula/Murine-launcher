package android.media;

@android.annotation.SystemApi
public class HwAudioSource extends android.media.PlayerBase {
    private final android.media.AudioDeviceInfo mAudioDeviceInfo = null;
    private final android.media.AudioAttributes mAudioAttributes = null;
    private int mNativeHandle;
    private HwAudioSource(android.media.AudioDeviceInfo p0, android.media.AudioAttributes p1) { super(null, 0); }
    void playerSetVolume(boolean p0, float p1, float p2) {}
    int playerApplyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1) { return 0; }
    android.media.VolumeShaper.State playerGetVolumeShaperState(int p0) { return null; }
    int playerSetAuxEffectSendLevel(boolean p0, float p1) { return 0; }
    void playerStart() {}
    void playerPause() {}
    void playerStop() {}
    public void start() {}
    public boolean isPlaying() { return false; }
    public void stop() {}

    public static final class Builder {
        private android.media.AudioAttributes mAudioAttributes;
        private android.media.AudioDeviceInfo mAudioDeviceInfo;
        public Builder() {}
        public android.media.HwAudioSource.Builder setAudioAttributes(android.media.AudioAttributes p0) { return null; }
        public android.media.HwAudioSource.Builder setAudioDeviceInfo(android.media.AudioDeviceInfo p0) { return null; }
        public android.media.HwAudioSource build() { return null; }
    }
}
