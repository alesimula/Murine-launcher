package android.media;

@android.annotation.SystemApi
public class PlayerProxy {
    private static final java.lang.String TAG = "PlayerProxy";
    private static final boolean DEBUG = false;
    private final android.media.AudioPlaybackConfiguration mConf = null;
    PlayerProxy(android.media.AudioPlaybackConfiguration p0) {}
    @android.annotation.SystemApi
    public void start() {}
    @android.annotation.SystemApi
    public void pause() {}
    @android.annotation.SystemApi
    public void stop() {}
    @android.annotation.SystemApi
    public void setVolume(float p0) {}
    @android.annotation.SystemApi
    public void setPan(float p0) {}
    @android.annotation.SystemApi
    public void setStartDelayMs(int p0) {}
    public void applyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1) {}
}
