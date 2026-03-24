package android.service.voice;

@android.annotation.SystemApi
public final class HotwordDetectedResult implements android.os.Parcelable {
    public static final int CONFIDENCE_LEVEL_NONE = 0;
    public static final int CONFIDENCE_LEVEL_LOW = 1;
    public static final int CONFIDENCE_LEVEL_LOW_MEDIUM = 2;
    public static final int CONFIDENCE_LEVEL_MEDIUM = 3;
    public static final int CONFIDENCE_LEVEL_MEDIUM_HIGH = 4;
    public static final int CONFIDENCE_LEVEL_HIGH = 5;
    public static final int CONFIDENCE_LEVEL_VERY_HIGH = 6;
    public static final int HOTWORD_OFFSET_UNSET = -1;
    public static final int AUDIO_CHANNEL_UNSET = -1;
    private static final int LIMIT_HOTWORD_OFFSET_MAX_VALUE = 3600000;
    private static final int LIMIT_AUDIO_CHANNEL_MAX_VALUE = 63;
    @android.service.voice.HotwordDetectedResult.HotwordConfidenceLevelValue
    private final int mConfidenceLevel = 0;
    private android.media.MediaSyncEvent mMediaSyncEvent;
    private int mHotwordOffsetMillis;
    private int mHotwordDurationMillis;
    private int mAudioChannel;
    private boolean mHotwordDetectionPersonalized;
    private final int mScore = 0;
    private final int mPersonalizedScore = 0;
    private final int mHotwordPhraseId = 0;
    private final android.os.PersistableBundle mExtras = null;
    private static int sMaxBundleSize;
    public static final android.os.Parcelable.Creator<android.service.voice.HotwordDetectedResult> CREATOR = null;
    private static int defaultConfidenceLevel() { return 0; }
    private static int defaultScore() { return 0; }
    private static int defaultPersonalizedScore() { return 0; }
    public static int getMaxScore() { return 0; }
    private static int defaultHotwordPhraseId() { return 0; }
    public static int getMaxHotwordPhraseId() { return 0; }
    private static android.os.PersistableBundle defaultExtras() { return null; }
    public static int getMaxBundleSize() { return 0; }
    public android.media.MediaSyncEvent getMediaSyncEvent() { return null; }
    public static int getParcelableSize(android.os.Parcelable p0) { return 0; }
    public static int getUsageSize(android.service.voice.HotwordDetectedResult p0) { return 0; }
    private static int bitCount(long p0) { return 0; }
    private void onConstructed() {}
    public static java.lang.String confidenceLevelToString(int p0) { return null; }
    static java.lang.String limitToString(int p0) { return null; }
    HotwordDetectedResult(int p0, android.media.MediaSyncEvent p1, int p2, int p3, int p4, boolean p5, int p6, int p7, int p8, android.os.PersistableBundle p9) {}
    @android.service.voice.HotwordDetectedResult.HotwordConfidenceLevelValue
    public int getConfidenceLevel() { return 0; }
    public int getHotwordOffsetMillis() { return 0; }
    public int getHotwordDurationMillis() { return 0; }
    public int getAudioChannel() { return 0; }
    public boolean isHotwordDetectionPersonalized() { return false; }
    public int getScore() { return 0; }
    public int getPersonalizedScore() { return 0; }
    public int getHotwordPhraseId() { return 0; }
    public android.os.PersistableBundle getExtras() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    HotwordDetectedResult(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    public static final class Builder {
        @android.service.voice.HotwordDetectedResult.HotwordConfidenceLevelValue
        private int mConfidenceLevel;
        private android.media.MediaSyncEvent mMediaSyncEvent;
        private int mHotwordOffsetMillis;
        private int mHotwordDurationMillis;
        private int mAudioChannel;
        private boolean mHotwordDetectionPersonalized;
        private int mScore;
        private int mPersonalizedScore;
        private int mHotwordPhraseId;
        private android.os.PersistableBundle mExtras;
        private long mBuilderFieldsSet;
        public Builder() {}
        public android.service.voice.HotwordDetectedResult.Builder setConfidenceLevel(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setMediaSyncEvent(android.media.MediaSyncEvent p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setHotwordOffsetMillis(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setHotwordDurationMillis(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setAudioChannel(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setHotwordDetectionPersonalized(boolean p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setScore(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setPersonalizedScore(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setHotwordPhraseId(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setExtras(android.os.PersistableBundle p0) { return null; }
        public android.service.voice.HotwordDetectedResult build() { return null; }
        private void checkNotUsed() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfidenceLevel {
    }

    static @interface HotwordConfidenceLevelValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Limit {
    }
}
