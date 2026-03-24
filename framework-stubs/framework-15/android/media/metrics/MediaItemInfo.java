package android.media.metrics;

@android.annotation.FlaggedApi("com.android.media.editing.flags.add_media_metrics_editing")
public final class MediaItemInfo implements android.os.Parcelable {
    public static final int SOURCE_TYPE_UNSPECIFIED = 0;
    public static final int SOURCE_TYPE_GALLERY = 1;
    public static final int SOURCE_TYPE_CAMERA = 2;
    public static final int SOURCE_TYPE_EDITING_SESSION = 3;
    public static final int SOURCE_TYPE_LOCAL_FILE = 4;
    public static final int SOURCE_TYPE_REMOTE_FILE = 5;
    public static final int SOURCE_TYPE_REMOTE_LIVE_STREAM = 6;
    public static final int SOURCE_TYPE_GENERATED = 7;
    public static final long DATA_TYPE_IMAGE = 1L;
    public static final long DATA_TYPE_VIDEO = 2L;
    public static final long DATA_TYPE_AUDIO = 4L;
    public static final long DATA_TYPE_METADATA = 8L;
    public static final long DATA_TYPE_DEPTH = 16L;
    public static final long DATA_TYPE_GAIN_MAP = 32L;
    public static final long DATA_TYPE_HIGH_FRAME_RATE = 64L;
    public static final long DATA_TYPE_SPEED_SETTING_CUE_POINTS = 128L;
    public static final long DATA_TYPE_GAPLESS = 256L;
    public static final long DATA_TYPE_SPATIAL_AUDIO = 512L;
    public static final long DATA_TYPE_HIGH_DYNAMIC_RANGE_VIDEO = 1024L;
    public static final int VALUE_UNSPECIFIED = -1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.metrics.MediaItemInfo> CREATOR = null;
    public int getSourceType() { return 0; }
    public long getDataTypes() { return 0L; }
    public long getDurationMillis() { return 0L; }
    public long getClipDurationMillis() { return 0L; }
    @android.annotation.Nullable
    public java.lang.String getContainerMimeType() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSampleMimeTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getCodecNames() { return null; }
    public int getAudioSampleRateHz() { return 0; }
    public int getAudioChannelCount() { return 0; }
    public long getAudioSampleCount() { return 0L; }
    @android.annotation.NonNull
    public android.util.Size getVideoSize() { return null; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public int getVideoDataSpace() { return 0; }
    public float getVideoFrameRate() { return 0.0f; }
    public long getVideoSampleCount() { return 0L; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.FlaggedApi("com.android.media.editing.flags.add_media_metrics_editing")
    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setSourceType(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder addDataType(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setDurationMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setClipDurationMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setContainerMimeType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder addSampleMimeType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder addCodecName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setAudioSampleRateHz(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setAudioChannelCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setAudioSampleCount(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setVideoSize(android.util.Size p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setVideoDataSpace(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setVideoFrameRate(float p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo.Builder setVideoSampleCount(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.MediaItemInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SourceType {
    }
}
