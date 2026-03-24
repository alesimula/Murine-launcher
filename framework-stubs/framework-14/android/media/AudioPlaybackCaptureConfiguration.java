package android.media;

public final class AudioPlaybackCaptureConfiguration {
    public android.media.projection.MediaProjection getMediaProjection() { return null; }
    public int[] getMatchingUsages() { return null; }
    public int[] getMatchingUids() { return null; }
    public int[] getExcludeUsages() { return null; }
    public int[] getExcludeUids() { return null; }
    android.media.audiopolicy.AudioMix createAudioMix(android.media.AudioFormat p0) { return null; }

    public static final class Builder {
        public Builder(android.media.projection.MediaProjection p0) {}
        public android.media.AudioPlaybackCaptureConfiguration.Builder addMatchingUsage(int p0) { return null; }
        public android.media.AudioPlaybackCaptureConfiguration.Builder addMatchingUid(int p0) { return null; }
        public android.media.AudioPlaybackCaptureConfiguration.Builder excludeUsage(int p0) { return null; }
        public android.media.AudioPlaybackCaptureConfiguration.Builder excludeUid(int p0) { return null; }
        public android.media.AudioPlaybackCaptureConfiguration build() { return null; }
    }
}
