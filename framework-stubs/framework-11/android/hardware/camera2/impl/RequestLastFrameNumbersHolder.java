package android.hardware.camera2.impl;

public class RequestLastFrameNumbersHolder {
    private final int mRequestId = 0;
    private final long mLastRegularFrameNumber = 0L;
    private final long mLastReprocessFrameNumber = 0L;
    private final long mLastZslStillFrameNumber = 0L;
    private boolean mSequenceCompleted;
    private boolean mInflightCompleted;
    public RequestLastFrameNumbersHolder(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.utils.SubmitInfo p1) {}
    RequestLastFrameNumbersHolder(int p0, long p1, int[] p2) {}
    public long getLastRegularFrameNumber() { return 0L; }
    public long getLastReprocessFrameNumber() { return 0L; }
    public long getLastZslStillFrameNumber() { return 0L; }
    public long getLastFrameNumber() { return 0L; }
    public int getRequestId() { return 0; }
    public boolean isSequenceCompleted() { return false; }
    public void markSequenceCompleted() {}
    public boolean isInflightCompleted() { return false; }
    public void markInflightCompleted() {}
}
