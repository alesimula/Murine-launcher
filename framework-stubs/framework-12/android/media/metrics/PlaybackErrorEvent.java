package android.media.metrics;

public final class PlaybackErrorEvent extends android.media.metrics.Event implements android.os.Parcelable {
    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_OTHER = 1;
    public static final int ERROR_RUNTIME = 2;
    public static final int ERROR_IO_NETWORK_UNAVAILABLE = 3;
    public static final int ERROR_IO_NETWORK_CONNECTION_FAILED = 4;
    public static final int ERROR_IO_BAD_HTTP_STATUS = 5;
    public static final int ERROR_IO_DNS_FAILED = 6;
    public static final int ERROR_IO_CONNECTION_TIMEOUT = 7;
    public static final int ERROR_IO_CONNECTION_CLOSED = 8;
    public static final int ERROR_IO_OTHER = 9;
    public static final int ERROR_PARSING_MANIFEST_MALFORMED = 10;
    public static final int ERROR_PARSING_CONTAINER_MALFORMED = 11;
    public static final int ERROR_PARSING_OTHER = 12;
    public static final int ERROR_DECODER_INIT_FAILED = 13;
    public static final int ERROR_DECODING_FAILED = 14;
    public static final int ERROR_DECODING_FORMAT_EXCEEDS_CAPABILITIES = 15;
    public static final int ERROR_DECODING_OTHER = 16;
    public static final int ERROR_AUDIO_TRACK_INIT_FAILED = 17;
    public static final int ERROR_AUDIO_TRACK_WRITE_FAILED = 18;
    public static final int ERROR_AUDIO_TRACK_OTHER = 19;
    public static final int ERROR_PLAYER_REMOTE = 20;
    public static final int ERROR_PLAYER_BEHIND_LIVE_WINDOW = 21;
    public static final int ERROR_PLAYER_OTHER = 22;
    public static final int ERROR_DRM_SCHEME_UNSUPPORTED = 23;
    public static final int ERROR_DRM_PROVISIONING_FAILED = 24;
    public static final int ERROR_DRM_LICENSE_ACQUISITION_FAILED = 25;
    public static final int ERROR_DRM_DISALLOWED_OPERATION = 26;
    public static final int ERROR_DRM_SYSTEM_ERROR = 27;
    public static final int ERROR_DRM_CONTENT_ERROR = 28;
    public static final int ERROR_DRM_DEVICE_REVOKED = 29;
    public static final int ERROR_DRM_OTHER = 30;
    public static final int ERROR_IO_FILE_NOT_FOUND = 31;
    public static final int ERROR_IO_NO_PERMISSION = 32;
    public static final int ERROR_PARSING_MANIFEST_UNSUPPORTED = 33;
    public static final int ERROR_PARSING_CONTAINER_UNSUPPORTED = 34;
    public static final int ERROR_DECODING_FORMAT_UNSUPPORTED = 35;
    private final java.lang.String mExceptionStack = null;
    private final int mErrorCode = 0;
    private final int mSubErrorCode = 0;
    private final long mTimeSinceCreatedMillis = 0L;
    public static final android.os.Parcelable.Creator<android.media.metrics.PlaybackErrorEvent> CREATOR = null;
    private PlaybackErrorEvent(java.lang.String p0, int p1, int p2, long p3, android.os.Bundle p4) { super(); }
    public java.lang.String getExceptionStack() { return null; }
    public int getErrorCode() { return 0; }
    public int getSubErrorCode() { return 0; }
    public long getTimeSinceCreatedMillis() { return 0L; }
    public android.os.Bundle getMetricsBundle() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    private PlaybackErrorEvent(android.os.Parcel p0) { super(); }

    public static final class Builder {
        private java.lang.Exception mException;
        private int mErrorCode;
        private int mSubErrorCode;
        private long mTimeSinceCreatedMillis;
        private android.os.Bundle mMetricsBundle;
        public Builder() {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.media.metrics.PlaybackErrorEvent.Builder setException(java.lang.Exception p0) { return null; }
        public android.media.metrics.PlaybackErrorEvent.Builder setErrorCode(int p0) { return null; }
        public android.media.metrics.PlaybackErrorEvent.Builder setSubErrorCode(int p0) { return null; }
        public android.media.metrics.PlaybackErrorEvent.Builder setTimeSinceCreatedMillis(long p0) { return null; }
        public android.media.metrics.PlaybackErrorEvent.Builder setMetricsBundle(android.os.Bundle p0) { return null; }
        public android.media.metrics.PlaybackErrorEvent build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }
}
