package android.uwb;

@android.annotation.SystemApi
public final class UwbManager {
    private static final java.lang.String SERVICE_NAME = "uwb";
    private final android.content.Context mContext = null;
    private final android.uwb.IUwbAdapter mUwbAdapter = null;
    private final android.uwb.AdapterStateListener mAdapterStateListener = null;
    private final android.uwb.RangingManager mRangingManager = null;
    private UwbManager(android.content.Context p0, android.uwb.IUwbAdapter p1) {}
    public static android.uwb.UwbManager getInstance(android.content.Context p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.UWB_PRIVILEGED")
    public void registerAdapterStateCallback(java.util.concurrent.Executor p0, android.uwb.UwbManager.AdapterStateCallback p1) {}
    @android.annotation.RequiresPermission("android.permission.UWB_PRIVILEGED")
    public void unregisterAdapterStateCallback(android.uwb.UwbManager.AdapterStateCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.UWB_PRIVILEGED")
    public android.os.PersistableBundle getSpecificationInfo() { return null; }
    @android.annotation.SuppressLint("MethodNameUnits")
    @android.annotation.RequiresPermission("android.permission.UWB_PRIVILEGED")
    public long elapsedRealtimeResolutionNanos() { return 0L; }
    @android.annotation.RequiresPermission(allOf={"android.permission.UWB_PRIVILEGED", "android.permission.UWB_RANGING"})
    public android.os.CancellationSignal openRangingSession(android.os.PersistableBundle p0, java.util.concurrent.Executor p1, android.uwb.RangingSession.Callback p2) { return null; }
    public int getAdapterState() { return 0; }
    public void setUwbEnabled(boolean p0) {}

    public static interface AdapterStateCallback {
        public static final int STATE_CHANGED_REASON_SESSION_STARTED = 0;
        public static final int STATE_CHANGED_REASON_ALL_SESSIONS_CLOSED = 1;
        public static final int STATE_CHANGED_REASON_SYSTEM_POLICY = 2;
        public static final int STATE_CHANGED_REASON_SYSTEM_BOOT = 3;
        public static final int STATE_CHANGED_REASON_ERROR_UNKNOWN = 4;
        public static final int STATE_DISABLED = 0;
        public static final int STATE_ENABLED_INACTIVE = 1;
        public static final int STATE_ENABLED_ACTIVE = 2;
        public void onStateChanged(int p0, int p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface State {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface StateChangedReason {
        }
    }
}
