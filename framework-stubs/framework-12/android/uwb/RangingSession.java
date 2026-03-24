package android.uwb;

@android.annotation.SystemApi
public final class RangingSession implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "Uwb.RangingSession";
    private final android.uwb.SessionHandle mSessionHandle = null;
    private final android.uwb.IUwbAdapter mAdapter = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.uwb.RangingSession.Callback mCallback = null;
    private android.uwb.RangingSession.State mState;
    public RangingSession(java.util.concurrent.Executor p0, android.uwb.RangingSession.Callback p1, android.uwb.IUwbAdapter p2, android.uwb.SessionHandle p3) {}
    public boolean isOpen() { return false; }
    @android.annotation.RequiresPermission("android.permission.UWB_PRIVILEGED")
    public void start(android.os.PersistableBundle p0) {}
    @android.annotation.RequiresPermission("android.permission.UWB_PRIVILEGED")
    public void reconfigure(android.os.PersistableBundle p0) {}
    @android.annotation.RequiresPermission("android.permission.UWB_PRIVILEGED")
    public void stop() {}
    @android.annotation.RequiresPermission("android.permission.UWB_PRIVILEGED")
    public void close() {}
    public void onRangingOpened() {}
    public void onRangingOpenFailed(int p0, android.os.PersistableBundle p1) {}
    public void onRangingStarted(android.os.PersistableBundle p0) {}
    public void onRangingStartFailed(int p0, android.os.PersistableBundle p1) {}
    public void onRangingReconfigured(android.os.PersistableBundle p0) {}
    public void onRangingReconfigureFailed(int p0, android.os.PersistableBundle p1) {}
    public void onRangingStopped(int p0, android.os.PersistableBundle p1) {}
    public void onRangingStopFailed(int p0, android.os.PersistableBundle p1) {}
    public void onRangingClosed(int p0, android.os.PersistableBundle p1) {}
    public void onRangingResult(android.uwb.RangingReport p0) {}
    private void executeCallback(java.lang.Runnable p0) {}

    public static interface Callback {
        public static final int REASON_UNKNOWN = 0;
        public static final int REASON_LOCAL_REQUEST = 1;
        public static final int REASON_REMOTE_REQUEST = 2;
        public static final int REASON_BAD_PARAMETERS = 3;
        public static final int REASON_GENERIC_ERROR = 4;
        public static final int REASON_MAX_SESSIONS_REACHED = 5;
        public static final int REASON_SYSTEM_POLICY = 6;
        public static final int REASON_PROTOCOL_SPECIFIC_ERROR = 7;
        public void onOpened(android.uwb.RangingSession p0);
        public void onOpenFailed(int p0, android.os.PersistableBundle p1);
        public void onStarted(android.os.PersistableBundle p0);
        public void onStartFailed(int p0, android.os.PersistableBundle p1);
        public void onReconfigured(android.os.PersistableBundle p0);
        public void onReconfigureFailed(int p0, android.os.PersistableBundle p1);
        public void onStopped(int p0, android.os.PersistableBundle p1);
        public void onStopFailed(int p0, android.os.PersistableBundle p1);
        public void onClosed(int p0, android.os.PersistableBundle p1);
        public void onReportReceived(android.uwb.RangingReport p0);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Reason {
        }
    }

    private static enum State {
        INIT,
        IDLE,
        ACTIVE,
        CLOSED;
        private State() {}
    }
}
