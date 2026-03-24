package com.android.internal.view;

public class SurfaceFlingerVsyncChoreographer {
    private static final long ONE_MS_IN_NS = 1000000L;
    private static final long ONE_S_IN_NS = 1000000000L;
    private final android.os.Handler mHandler = null;
    private final android.view.Choreographer mChoreographer = null;
    private long mSurfaceFlingerOffsetMs;
    public SurfaceFlingerVsyncChoreographer(android.os.Handler p0, android.view.Display p1, android.view.Choreographer p2) {}
    public long getSurfaceFlingerOffsetMs() { return 0L; }
    private long calculateAppSurfaceFlingerVsyncOffsetMs(android.view.Display p0) { return 0L; }
    public void scheduleAtSfVsync(java.lang.Runnable p0) {}
    public void scheduleAtSfVsync(android.os.Handler p0, android.os.Message p1) {}
    private long calculateDelay() { return 0L; }
}
