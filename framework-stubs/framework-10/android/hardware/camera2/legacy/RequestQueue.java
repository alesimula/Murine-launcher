package android.hardware.camera2.legacy;

public class RequestQueue {
    private static final java.lang.String TAG = "RequestQueue";
    private static final long INVALID_FRAME = -1L;
    private android.hardware.camera2.legacy.BurstHolder mRepeatingRequest;
    private final java.util.ArrayDeque<android.hardware.camera2.legacy.BurstHolder> mRequestQueue = null;
    private long mCurrentFrameNumber;
    private long mCurrentRepeatingFrameNumber;
    private int mCurrentRequestId;
    private final java.util.List<java.lang.Long> mJpegSurfaceIds = null;
    public RequestQueue(java.util.List<java.lang.Long> p0) {}
    public synchronized android.hardware.camera2.legacy.RequestQueue.RequestQueueEntry getNext() { return null; }
    public synchronized long stopRepeating(int p0) { return 0L; }
    public synchronized long stopRepeating() { return 0L; }
    public synchronized android.hardware.camera2.utils.SubmitInfo submit(android.hardware.camera2.CaptureRequest[] p0, boolean p1) { return null; }
    private long calculateLastFrame(int p0) { return 0L; }

    public final class RequestQueueEntry {
        private final android.hardware.camera2.legacy.BurstHolder mBurstHolder = null;
        private final java.lang.Long mFrameNumber = null;
        private final boolean mQueueEmpty = false;
        public android.hardware.camera2.legacy.BurstHolder getBurstHolder() { return null; }
        public java.lang.Long getFrameNumber() { return null; }
        public boolean isQueueEmpty() { return false; }
        public RequestQueueEntry(android.hardware.camera2.legacy.RequestQueue p0, android.hardware.camera2.legacy.BurstHolder p1, java.lang.Long p2, boolean p3) {}
    }
}
