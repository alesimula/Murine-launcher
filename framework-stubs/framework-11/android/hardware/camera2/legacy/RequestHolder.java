package android.hardware.camera2.legacy;

public class RequestHolder {
    private static final java.lang.String TAG = "RequestHolder";
    private final boolean mRepeating = false;
    private final android.hardware.camera2.CaptureRequest mRequest = null;
    private final int mRequestId = 0;
    private final int mSubsequeceId = 0;
    private final long mFrameNumber = 0L;
    private final int mNumJpegTargets = 0;
    private final int mNumPreviewTargets = 0;
    private volatile boolean mFailed;
    private boolean mOutputAbandoned;
    private final java.util.Collection<java.lang.Long> mJpegSurfaceIds = null;
    private RequestHolder(int p0, int p1, android.hardware.camera2.CaptureRequest p2, boolean p3, long p4, int p5, int p6, java.util.Collection<java.lang.Long> p7) {}
    public int getRequestId() { return 0; }
    public boolean isRepeating() { return false; }
    public int getSubsequeceId() { return 0; }
    public long getFrameNumber() { return 0L; }
    public android.hardware.camera2.CaptureRequest getRequest() { return null; }
    public java.util.Collection<android.view.Surface> getHolderTargets() { return null; }
    public boolean hasJpegTargets() { return false; }
    public boolean hasPreviewTargets() { return false; }
    public int numJpegTargets() { return 0; }
    public int numPreviewTargets() { return 0; }
    public boolean jpegType(android.view.Surface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return false; }
    public void failRequest() {}
    public boolean requestFailed() { return false; }
    public void setOutputAbandoned() {}
    public boolean isOutputAbandoned() { return false; }

    public static final class Builder {
        private final int mRequestId = 0;
        private final int mSubsequenceId = 0;
        private final android.hardware.camera2.CaptureRequest mRequest = null;
        private final boolean mRepeating = false;
        private final int mNumJpegTargets = 0;
        private final int mNumPreviewTargets = 0;
        private final java.util.Collection<java.lang.Long> mJpegSurfaceIds = null;
        public Builder(int p0, int p1, android.hardware.camera2.CaptureRequest p2, boolean p3, java.util.Collection<java.lang.Long> p4) {}
        private boolean jpegType(android.view.Surface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return false; }
        private boolean previewType(android.view.Surface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return false; }
        private int numJpegTargets(android.hardware.camera2.CaptureRequest p0) { return 0; }
        private int numPreviewTargets(android.hardware.camera2.CaptureRequest p0) { return 0; }
        public android.hardware.camera2.legacy.RequestHolder build(long p0) { return null; }
    }
}
