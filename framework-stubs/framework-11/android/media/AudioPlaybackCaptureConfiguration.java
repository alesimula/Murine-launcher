package android.media;

public final class AudioPlaybackCaptureConfiguration {
    private final android.media.audiopolicy.AudioMixingRule mAudioMixingRule = null;
    private final android.media.projection.MediaProjection mProjection = null;
    private AudioPlaybackCaptureConfiguration(android.media.audiopolicy.AudioMixingRule p0, android.media.projection.MediaProjection p1) {}
    public android.media.projection.MediaProjection getMediaProjection() { return null; }
    public int[] getMatchingUsages() { return null; }
    public int[] getMatchingUids() { return null; }
    public int[] getExcludeUsages() { return null; }
    public int[] getExcludeUids() { return null; }
    private int[] getIntPredicates(int p0, java.util.function.ToIntFunction<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> p1) { return null; }
    android.media.audiopolicy.AudioMix createAudioMix(android.media.AudioFormat p0) { return null; }

    public static final class Builder {
        private static final int MATCH_TYPE_UNSPECIFIED = 0;
        private static final int MATCH_TYPE_INCLUSIVE = 1;
        private static final int MATCH_TYPE_EXCLUSIVE = 2;
        private static final java.lang.String ERROR_MESSAGE_MISMATCHED_RULES = "Inclusive and exclusive usage rules cannot be combined";
        private static final java.lang.String ERROR_MESSAGE_START_ACTIVITY_FAILED = "startActivityForResult failed";
        private static final java.lang.String ERROR_MESSAGE_NON_AUDIO_PROJECTION = "MediaProjection can not project audio";
        private final android.media.audiopolicy.AudioMixingRule.Builder mAudioMixingRuleBuilder = null;
        private final android.media.projection.MediaProjection mProjection = null;
        private int mUsageMatchType;
        private int mUidMatchType;
        public Builder(android.media.projection.MediaProjection p0) {}
        public android.media.AudioPlaybackCaptureConfiguration.Builder addMatchingUsage(int p0) { return null; }
        public android.media.AudioPlaybackCaptureConfiguration.Builder addMatchingUid(int p0) { return null; }
        public android.media.AudioPlaybackCaptureConfiguration.Builder excludeUsage(int p0) { return null; }
        public android.media.AudioPlaybackCaptureConfiguration.Builder excludeUid(int p0) { return null; }
        public android.media.AudioPlaybackCaptureConfiguration build() { return null; }
    }
}
