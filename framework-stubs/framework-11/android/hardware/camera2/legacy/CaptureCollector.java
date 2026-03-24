package android.hardware.camera2.legacy;

public class CaptureCollector {
    private static final java.lang.String TAG = "CaptureCollector";
    private static final boolean DEBUG = false;
    private static final int FLAG_RECEIVED_JPEG = 1;
    private static final int FLAG_RECEIVED_JPEG_TS = 2;
    private static final int FLAG_RECEIVED_PREVIEW = 4;
    private static final int FLAG_RECEIVED_PREVIEW_TS = 8;
    private static final int FLAG_RECEIVED_ALL_JPEG = 3;
    private static final int FLAG_RECEIVED_ALL_PREVIEW = 12;
    private static final int MAX_JPEGS_IN_FLIGHT = 1;
    private final java.util.TreeSet<android.hardware.camera2.legacy.CaptureCollector.CaptureHolder> mActiveRequests = null;
    private final java.util.ArrayDeque<android.hardware.camera2.legacy.CaptureCollector.CaptureHolder> mJpegCaptureQueue = null;
    private final java.util.ArrayDeque<android.hardware.camera2.legacy.CaptureCollector.CaptureHolder> mJpegProduceQueue = null;
    private final java.util.ArrayDeque<android.hardware.camera2.legacy.CaptureCollector.CaptureHolder> mPreviewCaptureQueue = null;
    private final java.util.ArrayDeque<android.hardware.camera2.legacy.CaptureCollector.CaptureHolder> mPreviewProduceQueue = null;
    private final java.util.ArrayList<android.hardware.camera2.legacy.CaptureCollector.CaptureHolder> mCompletedRequests = null;
    private final java.util.concurrent.locks.ReentrantLock mLock = null;
    private final java.util.concurrent.locks.Condition mIsEmpty = null;
    private final java.util.concurrent.locks.Condition mPreviewsEmpty = null;
    private final java.util.concurrent.locks.Condition mNotFull = null;
    private final android.hardware.camera2.legacy.CameraDeviceState mDeviceState = null;
    private int mInFlight;
    private int mInFlightPreviews;
    private final int mMaxInFlight = 0;
    public CaptureCollector(int p0, android.hardware.camera2.legacy.CameraDeviceState p1) {}
    public boolean queueRequest(android.hardware.camera2.legacy.RequestHolder p0, android.hardware.camera2.legacy.LegacyRequest p1, long p2, java.util.concurrent.TimeUnit p3) throws java.lang.InterruptedException { return false; }
    public boolean waitForEmpty(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException { return false; }
    public boolean waitForPreviewsEmpty(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException { return false; }
    public boolean waitForRequestCompleted(android.hardware.camera2.legacy.RequestHolder p0, long p1, java.util.concurrent.TimeUnit p2, android.util.MutableLong p3) throws java.lang.InterruptedException { return false; }
    private boolean removeRequestIfCompleted(android.hardware.camera2.legacy.RequestHolder p0, android.util.MutableLong p1) { return false; }
    public android.hardware.camera2.legacy.RequestHolder jpegCaptured(long p0) { return null; }
    public android.util.Pair<android.hardware.camera2.legacy.RequestHolder, java.lang.Long> jpegProduced() { return null; }
    public boolean hasPendingPreviewCaptures() { return false; }
    public android.util.Pair<android.hardware.camera2.legacy.RequestHolder, java.lang.Long> previewCaptured(long p0) { return null; }
    public android.hardware.camera2.legacy.RequestHolder previewProduced() { return null; }
    public void failNextPreview() {}
    public void failNextJpeg() {}
    public void failAll() {}
    private void onPreviewCompleted() {}
    private void onRequestCompleted(android.hardware.camera2.legacy.CaptureCollector.CaptureHolder p0) {}

    private class CaptureHolder implements java.lang.Comparable<android.hardware.camera2.legacy.CaptureCollector.CaptureHolder> {
        private final android.hardware.camera2.legacy.RequestHolder mRequest = null;
        private final android.hardware.camera2.legacy.LegacyRequest mLegacy = null;
        public final boolean needsJpeg = false;
        public final boolean needsPreview = false;
        private long mTimestamp;
        private int mReceivedFlags;
        private boolean mHasStarted;
        private boolean mFailedJpeg;
        private boolean mFailedPreview;
        private boolean mCompleted;
        private boolean mPreviewCompleted;
        public CaptureHolder(android.hardware.camera2.legacy.CaptureCollector p0, android.hardware.camera2.legacy.RequestHolder p1, android.hardware.camera2.legacy.LegacyRequest p2) {}
        public boolean isPreviewCompleted() { return false; }
        public boolean isJpegCompleted() { return false; }
        public boolean isCompleted() { return false; }
        public void tryComplete() {}
        public void setJpegTimestamp(long p0) {}
        public void setJpegProduced() {}
        public void setJpegFailed() {}
        public void setPreviewTimestamp(long p0) {}
        public void setPreviewProduced() {}
        public void setPreviewFailed() {}
        public int compareTo(android.hardware.camera2.legacy.CaptureCollector.CaptureHolder p0) { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }
}
