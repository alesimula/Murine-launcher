package android.media.metrics;

@android.annotation.FlaggedApi("com.android.media.editing.flags.add_media_metrics_editing")
public final class EditingEndedEvent extends android.media.metrics.Event implements android.os.Parcelable {
    public static final int FINAL_STATE_SUCCEEDED = 1;
    public static final int FINAL_STATE_CANCELED = 2;
    public static final int FINAL_STATE_ERROR = 3;
    public static final int ERROR_CODE_NONE = 1;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = 2;
    public static final int ERROR_CODE_IO_UNSPECIFIED = 3;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_FAILED = 4;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT = 5;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = 6;
    public static final int ERROR_CODE_IO_FILE_NOT_FOUND = 7;
    public static final int ERROR_CODE_IO_NO_PERMISSION = 8;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = 9;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = 10;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = 11;
    public static final int ERROR_CODE_DECODING_FAILED = 12;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = 13;
    public static final int ERROR_CODE_ENCODER_INIT_FAILED = 14;
    public static final int ERROR_CODE_ENCODING_FAILED = 15;
    public static final int ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED = 16;
    public static final int ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED = 17;
    public static final int ERROR_CODE_AUDIO_PROCESSING_FAILED = 18;
    public static final int ERROR_CODE_MUXING_FAILED = 19;
    public static final int TIME_SINCE_CREATED_UNKNOWN = -1;
    public static final int PROGRESS_PERCENT_UNKNOWN = -1;
    public static final long OPERATION_TYPE_VIDEO_TRANSCODE = 1L;
    public static final long OPERATION_TYPE_AUDIO_TRANSCODE = 2L;
    public static final long OPERATION_TYPE_VIDEO_EDIT = 4L;
    public static final long OPERATION_TYPE_AUDIO_EDIT = 8L;
    public static final long OPERATION_TYPE_VIDEO_TRANSMUX = 16L;
    public static final long OPERATION_TYPE_AUDIO_TRANSMUX = 32L;
    public static final long OPERATION_TYPE_PAUSED = 64L;
    public static final long OPERATION_TYPE_RESUMED = 128L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.metrics.EditingEndedEvent> CREATOR = null;
    public int getFinalState() { return 0; }
    public float getFinalProgressPercent() { return 0.0f; }
    public int getErrorCode() { return 0; }
    public long getTimeSinceCreatedMillis() { return 0L; }
    @android.annotation.Nullable
    public java.lang.String getExporterName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getMuxerName() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.media.metrics.MediaItemInfo> getInputMediaItemInfos() { return null; }
    @android.annotation.Nullable
    public android.media.metrics.MediaItemInfo getOutputMediaItemInfo() { return null; }
    public long getOperationTypes() { return 0L; }
    @android.annotation.NonNull
    public android.os.Bundle getMetricsBundle() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.FlaggedApi("com.android.media.editing.flags.add_media_metrics_editing")
    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.media.metrics.EditingEndedEvent.Builder setFinalProgressPercent(float p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.EditingEndedEvent.Builder setTimeSinceCreatedMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.EditingEndedEvent.Builder setExporterName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.EditingEndedEvent.Builder setMuxerName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.EditingEndedEvent.Builder setErrorCode(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.EditingEndedEvent.Builder addInputMediaItemInfo(android.media.metrics.MediaItemInfo p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.EditingEndedEvent.Builder setOutputMediaItemInfo(android.media.metrics.MediaItemInfo p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.EditingEndedEvent.Builder addOperationType(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.EditingEndedEvent.Builder setMetricsBundle(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.EditingEndedEvent build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FinalState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperationType {
    }
}
