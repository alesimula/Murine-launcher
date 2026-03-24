package android.media;

@android.annotation.FlaggedApi("android.media.audio.loudness_configurator_api")
public class LoudnessCodecController implements android.media.permission.SafeCloseable {
    @android.annotation.FlaggedApi("android.media.audio.loudness_configurator_api")
    public static android.media.LoudnessCodecController create(int p0) { return null; }
    @android.annotation.FlaggedApi("android.media.audio.loudness_configurator_api")
    public static android.media.LoudnessCodecController create(int p0, java.util.concurrent.Executor p1, android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener p2) { return null; }
    public static android.media.LoudnessCodecController createForTesting(int p0, java.util.concurrent.Executor p1, android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener p2, android.media.IAudioService p3) { return null; }
    @android.annotation.FlaggedApi("android.media.audio.loudness_configurator_api")
    public boolean addMediaCodec(android.media.MediaCodec p0) { return false; }
    @android.annotation.FlaggedApi("android.media.audio.loudness_configurator_api")
    public void removeMediaCodec(android.media.MediaCodec p0) {}
    @android.annotation.FlaggedApi("android.media.audio.loudness_configurator_api")
    public android.os.Bundle getLoudnessCodecParams(android.media.MediaCodec p0) { return null; }
    @android.annotation.FlaggedApi("android.media.audio.loudness_configurator_api")
    public void close() {}
    int getSessionId() { return 0; }
    void mediaCodecsConsume(java.util.function.Consumer<java.util.Map.Entry<android.media.LoudnessCodecInfo, java.util.Set<android.media.MediaCodec>>> p0) {}

    @android.annotation.FlaggedApi("android.media.audio.loudness_configurator_api")
    public static interface OnLoudnessCodecUpdateListener {
        @android.annotation.FlaggedApi("android.media.audio.loudness_configurator_api")
        default public android.os.Bundle onLoudnessCodecUpdate(android.media.MediaCodec p0, android.os.Bundle p1) { return null; }
    }
}
