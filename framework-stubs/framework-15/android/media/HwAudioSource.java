package android.media;

@android.annotation.SystemApi
public class HwAudioSource extends android.media.PlayerBase {
    HwAudioSource() { super(null, 0); }
    void playerSetVolume(boolean p0, float p1, float p2) {}
    int playerApplyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1) { return 0; }
    @android.annotation.Nullable
    android.media.VolumeShaper.State playerGetVolumeShaperState(int p0) { return null; }
    int playerSetAuxEffectSendLevel(boolean p0, float p1) { return 0; }
    void playerStart() {}
    void playerPause() {}
    void playerStop() {}
    public void start() {}
    public boolean isPlaying() { return false; }
    public void stop() {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.media.HwAudioSource.Builder setAudioAttributes(android.media.AudioAttributes p0) { return null; }
        @android.annotation.NonNull
        public android.media.HwAudioSource.Builder setAudioDeviceInfo(android.media.AudioDeviceInfo p0) { return null; }
        @android.annotation.NonNull
        public android.media.HwAudioSource build() { return null; }
    }
}
