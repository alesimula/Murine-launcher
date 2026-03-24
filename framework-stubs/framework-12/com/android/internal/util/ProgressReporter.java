package com.android.internal.util;

public class ProgressReporter {
    private static final int STATE_INIT = 0;
    private static final int STATE_STARTED = 1;
    private static final int STATE_FINISHED = 2;
    private final int mId = 0;
    private final android.os.RemoteCallbackList<android.os.IProgressListener> mListeners = null;
    private int mState;
    private int mProgress;
    private android.os.Bundle mExtras;
    private int[] mSegmentRange;
    public ProgressReporter(int p0) {}
    public void addListener(android.os.IProgressListener p0) {}
    public void setProgress(int p0) {}
    public void setProgress(int p0, java.lang.CharSequence p1) {}
    public void setProgress(int p0, int p1) {}
    public void setProgress(int p0, int p1, java.lang.CharSequence p2) {}
    public int[] startSegment(int p0) { return null; }
    public void endSegment(int[] p0) {}
    int getProgress() { return 0; }
    int[] getSegmentRange() { return null; }
    public void start() {}
    public void finish() {}
    private void notifyStarted(int p0, android.os.Bundle p1) {}
    private void notifyProgress(int p0, int p1, android.os.Bundle p2) {}
    private void notifyFinished(int p0, android.os.Bundle p1) {}
}
