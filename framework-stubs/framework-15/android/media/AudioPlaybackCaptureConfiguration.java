package android.media;

public final class AudioPlaybackCaptureConfiguration {
    @android.annotation.NonNull
    public android.media.projection.MediaProjection getMediaProjection() { return null; }
    @android.annotation.NonNull
    public int[] getMatchingUsages() { return null; }
    @android.annotation.NonNull
    public int[] getMatchingUids() { return null; }
    @android.annotation.NonNull
    public int[] getExcludeUsages() { return null; }
    @android.annotation.NonNull
    public int[] getExcludeUids() { return null; }
    @android.annotation.NonNull
    android.media.audiopolicy.AudioMix createAudioMix(android.media.AudioFormat p0) { return null; }

    public static final class Builder {
        public Builder(android.media.projection.MediaProjection p0) {}
        @android.annotation.NonNull
        public android.media.AudioPlaybackCaptureConfiguration.Builder addMatchingUsage(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPlaybackCaptureConfiguration.Builder addMatchingUid(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPlaybackCaptureConfiguration.Builder excludeUsage(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPlaybackCaptureConfiguration.Builder excludeUid(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioPlaybackCaptureConfiguration build() { return null; }
    }
}
