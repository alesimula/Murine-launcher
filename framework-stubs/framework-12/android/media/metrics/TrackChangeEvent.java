package android.media.metrics;

public final class TrackChangeEvent extends android.media.metrics.Event implements android.os.Parcelable {
    public static final int TRACK_STATE_OFF = 0;
    public static final int TRACK_STATE_ON = 1;
    public static final int TRACK_CHANGE_REASON_UNKNOWN = 0;
    public static final int TRACK_CHANGE_REASON_OTHER = 1;
    public static final int TRACK_CHANGE_REASON_INITIAL = 2;
    public static final int TRACK_CHANGE_REASON_MANUAL = 3;
    public static final int TRACK_CHANGE_REASON_ADAPTIVE = 4;
    public static final int TRACK_TYPE_AUDIO = 0;
    public static final int TRACK_TYPE_VIDEO = 1;
    public static final int TRACK_TYPE_TEXT = 2;
    private final int mState = 0;
    private final int mReason = 0;
    private final java.lang.String mContainerMimeType = null;
    private final java.lang.String mSampleMimeType = null;
    private final java.lang.String mCodecName = null;
    private final int mBitrate = 0;
    private final long mTimeSinceCreatedMillis = 0L;
    private final int mType = 0;
    private final java.lang.String mLanguage = null;
    private final java.lang.String mLanguageRegion = null;
    private final int mChannelCount = 0;
    private final int mAudioSampleRate = 0;
    private final int mWidth = 0;
    private final int mHeight = 0;
    private final float mVideoFrameRate = 0.0f;
    public static final android.os.Parcelable.Creator<android.media.metrics.TrackChangeEvent> CREATOR = null;
    private TrackChangeEvent(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, long p6, int p7, java.lang.String p8, java.lang.String p9, int p10, int p11, int p12, int p13, float p14, android.os.Bundle p15) { super(); }
    public int getTrackState() { return 0; }
    public int getTrackChangeReason() { return 0; }
    public java.lang.String getContainerMimeType() { return null; }
    public java.lang.String getSampleMimeType() { return null; }
    public java.lang.String getCodecName() { return null; }
    public int getBitrate() { return 0; }
    public long getTimeSinceCreatedMillis() { return 0L; }
    public int getTrackType() { return 0; }
    public java.lang.String getLanguage() { return null; }
    public java.lang.String getLanguageRegion() { return null; }
    public int getChannelCount() { return 0; }
    public int getAudioSampleRate() { return 0; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public float getVideoFrameRate() { return 0.0f; }
    public android.os.Bundle getMetricsBundle() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    private TrackChangeEvent(android.os.Parcel p0) { super(); }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        private int mState;
        private int mReason;
        private java.lang.String mContainerMimeType;
        private java.lang.String mSampleMimeType;
        private java.lang.String mCodecName;
        private int mBitrate;
        private long mTimeSinceCreatedMillis;
        private final int mType = 0;
        private java.lang.String mLanguage;
        private java.lang.String mLanguageRegion;
        private int mChannelCount;
        private int mAudioSampleRate;
        private int mWidth;
        private int mHeight;
        private float mVideoFrameRate;
        private android.os.Bundle mMetricsBundle;
        private long mBuilderFieldsSet;
        public Builder(int p0) {}
        public android.media.metrics.TrackChangeEvent.Builder setTrackState(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setTrackChangeReason(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setContainerMimeType(java.lang.String p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setSampleMimeType(java.lang.String p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setCodecName(java.lang.String p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setBitrate(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setTimeSinceCreatedMillis(long p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setLanguage(java.lang.String p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setLanguageRegion(java.lang.String p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setChannelCount(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setAudioSampleRate(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setWidth(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setHeight(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setVideoFrameRate(float p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setMetricsBundle(android.os.Bundle p0) { return null; }
        public android.media.metrics.TrackChangeEvent build() { return null; }
        private void checkNotUsed() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TrackChangeReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TrackState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TrackType {
    }
}
