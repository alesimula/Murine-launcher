package android.os.image;

@android.annotation.SystemApi
public class DynamicSystemClient {
    private static final java.lang.String TAG = "DynamicSystemClient";
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_NOT_STARTED = 1;
    public static final int STATUS_IN_PROGRESS = 2;
    public static final int STATUS_READY = 3;
    public static final int STATUS_IN_USE = 4;
    public static final int CAUSE_NOT_SPECIFIED = 0;
    public static final int CAUSE_INSTALL_COMPLETED = 1;
    public static final int CAUSE_INSTALL_CANCELLED = 2;
    public static final int CAUSE_ERROR_IO = 3;
    public static final int CAUSE_ERROR_INVALID_URL = 4;
    public static final int CAUSE_ERROR_IPC = 5;
    public static final int CAUSE_ERROR_EXCEPTION = 6;
    public static final int MSG_REGISTER_LISTENER = 1;
    public static final int MSG_UNREGISTER_LISTENER = 2;
    public static final int MSG_POST_STATUS = 3;
    public static final java.lang.String KEY_INSTALLED_SIZE = "KEY_INSTALLED_SIZE";
    public static final java.lang.String KEY_EXCEPTION_DETAIL = "KEY_EXCEPTION_DETAIL";
    public static final java.lang.String ACTION_START_INSTALL = "android.os.image.action.START_INSTALL";
    public static final java.lang.String ACTION_NOTIFY_IF_IN_USE = "android.os.image.action.NOTIFY_IF_IN_USE";
    public static final java.lang.String KEY_SYSTEM_SIZE = "KEY_SYSTEM_SIZE";
    public static final java.lang.String KEY_USERDATA_SIZE = "KEY_USERDATA_SIZE";
    private final android.content.Context mContext = null;
    private final android.os.image.DynamicSystemClient.DynSystemServiceConnection mConnection = null;
    private final android.os.Messenger mMessenger = null;
    private boolean mBound;
    private java.util.concurrent.Executor mExecutor;
    private android.os.image.DynamicSystemClient.OnStatusChangedListener mListener;
    private android.os.Messenger mService;
    @android.annotation.SystemApi
    public DynamicSystemClient(android.content.Context p0) {}
    public void setOnStatusChangedListener(java.util.concurrent.Executor p0, android.os.image.DynamicSystemClient.OnStatusChangedListener p1) {}
    public void setOnStatusChangedListener(android.os.image.DynamicSystemClient.OnStatusChangedListener p0) {}
    private void notifyOnStatusChangedListener(int p0, int p1, long p2, java.lang.Throwable p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INSTALL_DYNAMIC_SYSTEM")
    public void bind() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INSTALL_DYNAMIC_SYSTEM")
    public void unbind() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INSTALL_DYNAMIC_SYSTEM")
    public void start(android.net.Uri p0, long p1) {}
    @android.annotation.RequiresPermission("android.permission.INSTALL_DYNAMIC_SYSTEM")
    public void start(android.net.Uri p0, long p1, long p2) {}
    private void handleMessage(android.os.Message p0) {}

    private class DynSystemServiceConnection implements android.content.ServiceConnection {
        private DynSystemServiceConnection(android.os.image.DynamicSystemClient p0) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }

    private static class IncomingHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<android.os.image.DynamicSystemClient> mWeakClient = null;
        IncomingHandler(android.os.image.DynamicSystemClient p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InstallationStatus {
    }

    public static interface OnStatusChangedListener {
        public void onStatusChanged(int p0, int p1, long p2, java.lang.Throwable p3);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StatusChangedCause {
    }
}
