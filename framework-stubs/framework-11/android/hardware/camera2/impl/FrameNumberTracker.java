package android.hardware.camera2.impl;

public class FrameNumberTracker {
    private static final java.lang.String TAG = "FrameNumberTracker";
    private long[] mCompletedFrameNumber;
    private final java.util.LinkedList<java.lang.Long>[] mSkippedOtherFrameNumbers = null;
    private final java.util.LinkedList<java.lang.Long>[] mSkippedFrameNumbers = null;
    private final java.util.TreeMap<java.lang.Long, java.lang.Integer> mFutureErrorMap = null;
    private final java.util.HashMap<java.lang.Long, java.util.List<android.hardware.camera2.CaptureResult>> mPartialResults = null;
    public FrameNumberTracker() {}
    private void update() {}
    public void updateTracker(long p0, boolean p1, int p2) {}
    public void updateTracker(long p0, android.hardware.camera2.CaptureResult p1, boolean p2, int p3) {}
    public java.util.List<android.hardware.camera2.CaptureResult> popPartialResults(long p0) { return null; }
    public long getCompletedFrameNumber() { return 0L; }
    public long getCompletedReprocessFrameNumber() { return 0L; }
    public long getCompletedZslStillFrameNumber() { return 0L; }
    private void updateCompletedFrameNumber(long p0, int p1) throws java.lang.IllegalArgumentException {}
}
