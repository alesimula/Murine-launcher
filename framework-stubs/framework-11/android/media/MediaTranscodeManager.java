package android.media;

public final class MediaTranscodeManager {
    private static final java.lang.String TAG = "MediaTranscodeManager";
    private static final long ID_INVALID = -1L;
    private static final int EVENT_JOB_STARTED = 1;
    private static final int EVENT_JOB_PROGRESSED = 2;
    private static final int EVENT_JOB_FINISHED = 3;
    private static android.media.MediaTranscodeManager sMediaTranscodeManager;
    private final java.util.concurrent.ConcurrentMap<java.lang.Long, android.media.MediaTranscodeManager.TranscodingJob> mPendingTranscodingJobs = null;
    private final android.content.Context mContext = null;
    private static native void native_init();
    private native long native_requestUniqueJobID();
    private native boolean native_enqueueTranscodingRequest(long p0, android.media.MediaTranscodeManager.TranscodingRequest p1, android.content.Context p2);
    private native void native_cancelTranscodingRequest(long p0);
    private MediaTranscodeManager(android.content.Context p0) {}
    private void postEventFromNative(int p0, long p1, int p2) {}
    public static android.media.MediaTranscodeManager getInstance(android.content.Context p0) { return null; }
    public android.media.MediaTranscodeManager.TranscodingJob enqueueTranscodingRequest(android.media.MediaTranscodeManager.TranscodingRequest p0, java.util.concurrent.Executor p1, android.media.MediaTranscodeManager.OnTranscodingFinishedListener p2) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Event {
    }

    @java.lang.FunctionalInterface
    public static interface OnTranscodingFinishedListener {
        public void onTranscodingFinished(android.media.MediaTranscodeManager.TranscodingJob p0);
    }

    public static final class TranscodingJob {
        public static final int STATUS_PENDING = 1;
        public static final int STATUS_RUNNING = 2;
        public static final int STATUS_FINISHED = 3;
        public static final int RESULT_NONE = 1;
        public static final int RESULT_SUCCESS = 2;
        public static final int RESULT_ERROR = 3;
        public static final int RESULT_CANCELED = 4;
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.media.MediaTranscodeManager.OnTranscodingFinishedListener mListener = null;
        private final java.util.concurrent.locks.ReentrantLock mStatusChangeLock = null;
        private java.util.concurrent.Executor mProgressChangedExecutor;
        private android.media.MediaTranscodeManager.TranscodingJob.OnProgressChangedListener mProgressChangedListener;
        private long mID;
        private float mProgress;
        private int mStatus;
        private int mResult;
        private TranscodingJob(long p0, java.util.concurrent.Executor p1, android.media.MediaTranscodeManager.OnTranscodingFinishedListener p2) {}
        public void setOnProgressChangedListener(java.util.concurrent.Executor p0, android.media.MediaTranscodeManager.TranscodingJob.OnProgressChangedListener p1) {}
        public void cancel() {}
        public float getProgress() { return 0.0f; }
        public int getStatus() { return 0; }
        public int getResult() { return 0; }
        private void setJobStarted() {}
        private void setJobProgress(float p0) {}
        private void setJobFinished(int p0) {}
        private void processJobEvent(int p0, int p1) {}

        @java.lang.FunctionalInterface
        public static interface OnProgressChangedListener {
            public void onProgressChanged(float p0);
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Result {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Status {
        }
    }

    public static final class TranscodingRequest {
        private android.net.Uri mSrcUri;
        private android.net.Uri mDstUri;
        private android.media.MediaFormat mDstFormat;
        private TranscodingRequest(android.media.MediaTranscodeManager.TranscodingRequest.Builder p0) {}

        public static class Builder {
            private android.net.Uri mSrcUri;
            private android.net.Uri mDstUri;
            private android.media.MediaFormat mDstFormat;
            public Builder() {}
            public android.media.MediaTranscodeManager.TranscodingRequest.Builder setSourceUri(android.net.Uri p0) { return null; }
            public android.media.MediaTranscodeManager.TranscodingRequest.Builder setDestinationUri(android.net.Uri p0) { return null; }
            public android.media.MediaTranscodeManager.TranscodingRequest.Builder setDestinationFormat(android.media.MediaFormat p0) { return null; }
            public android.media.MediaTranscodeManager.TranscodingRequest build() { return null; }
        }
    }
}
