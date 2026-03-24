package android.view;

public class ScrollCaptureClient extends android.view.IScrollCaptureClient.Stub {
    private static final java.lang.String TAG = "ScrollCaptureClient";
    private static final int DEFAULT_TIMEOUT = 1000;
    private final android.os.Handler mHandler = null;
    private android.view.ScrollCaptureTarget mSelectedTarget;
    private int mTimeoutMillis;
    protected android.view.Surface mSurface;
    private android.view.IScrollCaptureController mController;
    private final android.graphics.Rect mScrollBounds = null;
    private final android.graphics.Point mPositionInWindow = null;
    private final android.util.CloseGuard mCloseGuard = null;
    private android.view.ScrollCaptureSession mSession;
    private android.view.ScrollCaptureClient.DelayedAction mTimeoutAction;
    public ScrollCaptureClient(android.view.ScrollCaptureTarget p0, android.view.IScrollCaptureController p1) { super(); }
    public void setTimeoutMillis(int p0) {}
    public android.view.ScrollCaptureClient.DelayedAction getTimeoutAction() { return null; }
    private void checkConnected() {}
    private void checkStarted() {}
    public void startCapture(android.view.Surface p0) throws android.os.RemoteException {}
    private void onStartCaptureCompleted() {}
    private void onStartCaptureTimeout() {}
    public void requestImage(android.graphics.Rect p0) {}
    void onRequestImageCompleted(long p0, android.graphics.Rect p1) {}
    private void onRequestImageTimeout() {}
    public void endCapture() {}
    private boolean isStarted() { return false; }
    private void onEndCaptureCompleted() {}
    private void onEndCaptureTimeout() {}
    private void doShutdown() {}
    public void disconnect() {}
    public java.lang.String toString() { return null; }
    private boolean cancelTimeout() { return false; }
    private void scheduleTimeout(long p0, java.lang.Runnable p1) {}

    public static class DelayedAction {
        private final java.util.concurrent.atomic.AtomicBoolean mCompleted = null;
        private final java.lang.Object mToken = null;
        private final android.os.Handler mHandler = null;
        private final java.lang.Runnable mAction = null;
        public DelayedAction(android.os.Handler p0, long p1, java.lang.Runnable p2) {}
        private boolean onTimeout() { return false; }
        public boolean timeoutNow() { return false; }
        public boolean cancel() { return false; }
    }
}
