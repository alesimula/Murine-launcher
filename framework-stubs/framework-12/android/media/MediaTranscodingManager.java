package android.media;

public final class MediaTranscodingManager {
    MediaTranscodingManager() {}
    @android.annotation.Nullable
    public android.media.MediaTranscodingManager.TranscodingSession enqueueRequest(android.media.MediaTranscodingManager.TranscodingRequest p0, java.util.concurrent.Executor p1, android.media.MediaTranscodingManager.OnTranscodingFinishedListener p2) { return null; }

    @java.lang.FunctionalInterface
    public static interface OnTranscodingFinishedListener {
        public void onTranscodingFinished(android.media.MediaTranscodingManager.TranscodingSession p0);
    }

    public static abstract class TranscodingRequest {
        TranscodingRequest() {}
        @android.annotation.NonNull
        public android.net.Uri getSourceUri() { return null; }
        @android.annotation.Nullable
        public android.os.ParcelFileDescriptor getSourceFileDescriptor() { return null; }
        public int getClientUid() { return 0; }
        public int getClientPid() { return 0; }
        @android.annotation.NonNull
        public android.net.Uri getDestinationUri() { return null; }
        @android.annotation.Nullable
        public android.os.ParcelFileDescriptor getDestinationFileDescriptor() { return null; }

        public static class VideoFormatResolver {
            public VideoFormatResolver(android.media.ApplicationMediaCapabilities p0, android.media.MediaFormat p1) {}
            public boolean shouldTranscode() { return false; }
            @android.annotation.Nullable
            public android.media.MediaFormat resolveVideoFormat() { return null; }
        }
    }

    public static final class TranscodingSession {
        public static final int ERROR_DROPPED_BY_SERVICE = 1;
        public static final int ERROR_NONE = 0;
        public static final int ERROR_SERVICE_DIED = 2;
        public static final int RESULT_CANCELED = 4;
        public static final int RESULT_ERROR = 3;
        public static final int RESULT_NONE = 1;
        public static final int RESULT_SUCCESS = 2;
        public static final int STATUS_FINISHED = 3;
        public static final int STATUS_PAUSED = 4;
        public static final int STATUS_PENDING = 1;
        public static final int STATUS_RUNNING = 2;
        private TranscodingSession() {}
        public void setOnProgressUpdateListener(java.util.concurrent.Executor p0, android.media.MediaTranscodingManager.TranscodingSession.OnProgressUpdateListener p1) {}
        public int getErrorCode() { return 0; }
        public void cancel() {}
        public int getProgress() { return 0; }
        public int getStatus() { return 0; }
        public boolean addClientUid(int p0) { return false; }
        @android.annotation.NonNull
        public java.util.List<java.lang.Integer> getClientUids() { return null; }
        public int getSessionId() { return 0; }
        public int getResult() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.FunctionalInterface
        public static interface OnProgressUpdateListener {
            public void onProgressUpdate(android.media.MediaTranscodingManager.TranscodingSession p0, int p1);
        }
    }

    public static final class VideoTranscodingRequest extends android.media.MediaTranscodingManager.TranscodingRequest {
        private VideoTranscodingRequest() { super(); }
        @android.annotation.NonNull
        public android.media.MediaFormat getVideoTrackFormat() { return null; }

        public static final class Builder {
            public Builder(android.net.Uri p0, android.net.Uri p1, android.media.MediaFormat p2) {}
            @android.annotation.NonNull
            public android.media.MediaTranscodingManager.VideoTranscodingRequest.Builder setClientUid(int p0) { return null; }
            @android.annotation.NonNull
            public android.media.MediaTranscodingManager.VideoTranscodingRequest.Builder setClientPid(int p0) { return null; }
            @android.annotation.NonNull
            public android.media.MediaTranscodingManager.VideoTranscodingRequest.Builder setSourceFileDescriptor(android.os.ParcelFileDescriptor p0) { return null; }
            @android.annotation.NonNull
            public android.media.MediaTranscodingManager.VideoTranscodingRequest.Builder setDestinationFileDescriptor(android.os.ParcelFileDescriptor p0) { return null; }
            @android.annotation.NonNull
            public android.media.MediaTranscodingManager.VideoTranscodingRequest build() { return null; }
        }
    }
}
