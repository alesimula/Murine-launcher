package android.view.contentcapture;

public final class ContentCaptureManager {
    private static final java.lang.String TAG = null;
    public static final int RESULT_CODE_OK = 0;
    public static final int RESULT_CODE_TRUE = 1;
    public static final int RESULT_CODE_FALSE = 2;
    public static final int RESULT_CODE_SECURITY_EXCEPTION = -1;
    private static final int SYNC_CALLS_TIMEOUT_MS = 5000;
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_SERVICE_EXPLICITLY_ENABLED = "service_explicitly_enabled";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_MAX_BUFFER_SIZE = "max_buffer_size";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_IDLE_FLUSH_FREQUENCY = "idle_flush_frequency";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_TEXT_CHANGE_FLUSH_FREQUENCY = "text_change_flush_frequency";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_LOG_HISTORY_SIZE = "log_history_size";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_LOGGING_LEVEL = "logging_level";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_IDLE_UNBIND_TIMEOUT = "idle_unbind_timeout";
    public static final int LOGGING_LEVEL_OFF = 0;
    public static final int LOGGING_LEVEL_DEBUG = 1;
    public static final int LOGGING_LEVEL_VERBOSE = 2;
    public static final int DEFAULT_MAX_BUFFER_SIZE = 100;
    public static final int DEFAULT_IDLE_FLUSHING_FREQUENCY_MS = 5000;
    public static final int DEFAULT_TEXT_CHANGE_FLUSHING_FREQUENCY_MS = 1000;
    public static final int DEFAULT_LOG_HISTORY_SIZE = 10;
    private final java.lang.Object mLock = null;
    private final android.content.Context mContext = null;
    private final android.view.contentcapture.IContentCaptureManager mService = null;
    final android.content.ContentCaptureOptions mOptions = null;
    private int mFlags;
    private final android.os.Handler mHandler = null;
    private android.view.contentcapture.MainContentCaptureSession mMainSession;
    public ContentCaptureManager(android.content.Context p0, android.view.contentcapture.IContentCaptureManager p1, android.content.ContentCaptureOptions p2) {}
    public android.view.contentcapture.MainContentCaptureSession getMainContentCaptureSession() { return null; }
    public void onActivityCreated(android.os.IBinder p0, android.content.ComponentName p1) {}
    public void onActivityResumed() {}
    public void onActivityPaused() {}
    public void onActivityDestroyed() {}
    public void flush(int p0) {}
    public android.content.ComponentName getServiceComponentName() { return null; }
    public static android.content.ComponentName getServiceSettingsComponentName() { return null; }
    public boolean isContentCaptureEnabled() { return false; }
    public java.util.Set<android.view.contentcapture.ContentCaptureCondition> getContentCaptureConditions() { return null; }
    public void setContentCaptureEnabled(boolean p0) {}
    public void updateWindowAttributes(android.view.WindowManager.LayoutParams p0) {}
    @android.annotation.SystemApi
    public boolean isContentCaptureFeatureEnabled() { return false; }
    public void removeData(android.view.contentcapture.DataRemovalRequest p0) {}
    private com.android.internal.util.SyncResultReceiver syncRun(android.view.contentcapture.ContentCaptureManager.MyRunnable p0) { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    private static interface MyRunnable {
        public void run(com.android.internal.util.SyncResultReceiver p0) throws android.os.RemoteException;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LoggingLevel {
    }

    public static interface ContentCaptureClient {
        public android.content.ComponentName contentCaptureClientGetComponentName();
    }
}
