package android.view.contentcapture;

public final class ContentCaptureManager {
    public static final boolean DEBUG = false;
    public static final java.lang.String DUMPABLE_NAME = "ContentCaptureManager";
    public static final int DATA_SHARE_ERROR_UNKNOWN = 1;
    public static final int DATA_SHARE_ERROR_CONCURRENT_REQUEST = 2;
    public static final int DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED = 3;
    public static final int RESULT_CODE_OK = 0;
    public static final int RESULT_CODE_TRUE = 1;
    public static final int RESULT_CODE_FALSE = 2;
    public static final int RESULT_CODE_SECURITY_EXCEPTION = -1;
    @android.annotation.SystemApi
    public static final int NO_SESSION_ID = 0;
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_SERVICE_EXPLICITLY_ENABLED = "service_explicitly_enabled";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_REPORT_LIST_VIEW_CHILDREN = "report_list_view_children";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_MAX_BUFFER_SIZE = "max_buffer_size";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_IDLE_FLUSH_FREQUENCY = "idle_flush_frequency";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_TEXT_CHANGE_FLUSH_FREQUENCY = "text_change_flush_frequency";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_LOG_HISTORY_SIZE = "log_history_size";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_LOGGING_LEVEL = "logging_level";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_IDLE_UNBIND_TIMEOUT = "idle_unbind_timeout";
    public static final java.lang.String DEVICE_CONFIG_PROPERTY_DISABLE_FLUSH_FOR_VIEW_TREE_APPEARING = "disable_flush_for_view_tree_appearing";
    public static final int LOGGING_LEVEL_OFF = 0;
    public static final int LOGGING_LEVEL_DEBUG = 1;
    public static final int LOGGING_LEVEL_VERBOSE = 2;
    public static final int DEFAULT_MAX_BUFFER_SIZE = 500;
    public static final int DEFAULT_IDLE_FLUSHING_FREQUENCY_MS = 5000;
    public static final int DEFAULT_TEXT_CHANGE_FLUSHING_FREQUENCY_MS = 1000;
    public static final int DEFAULT_LOG_HISTORY_SIZE = 10;
    public static final boolean DEFAULT_DISABLE_FLUSH_FOR_VIEW_TREE_APPEARING = false;
    final android.content.ContentCaptureOptions mOptions = null;
    public ContentCaptureManager(android.content.Context p0, android.view.contentcapture.IContentCaptureManager p1, android.content.ContentCaptureOptions p2) {}
    public android.view.contentcapture.MainContentCaptureSession getMainContentCaptureSession() { return null; }
    public void onActivityCreated(android.os.IBinder p0, android.os.IBinder p1, android.content.ComponentName p2) {}
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
    public void setFlushViewTreeAppearingEventDisabled(boolean p0) {}
    public boolean getFlushViewTreeAppearingEventDisabled() { return false; }
    @android.annotation.SystemApi
    public boolean isContentCaptureFeatureEnabled() { return false; }
    public void removeData(android.view.contentcapture.DataRemovalRequest p0) {}
    public void shareData(android.view.contentcapture.DataShareRequest p0, java.util.concurrent.Executor p1, android.view.contentcapture.DataShareWriteAdapter p2) {}
    public void addDumpable(android.app.Activity p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_CONTENT_CAPTURE")
    public static void resetTemporaryService(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_CONTENT_CAPTURE")
    public static void setTemporaryService(int p0, java.lang.String p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_CONTENT_CAPTURE")
    public static void setDefaultServiceEnabled(int p0, boolean p1) {}

    public static interface ContentCaptureClient {
        public android.content.ComponentName contentCaptureClientGetComponentName();
    }

    private static class DataShareAdapterDelegate extends android.view.contentcapture.IDataShareWriteAdapter.Stub {
        public void write(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void error(int p0) throws android.os.RemoteException {}
        public void rejected() throws android.os.RemoteException {}
        public void finish() throws android.os.RemoteException {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataShareError {
    }

    private final class Dumper implements android.util.Dumpable {
        public void dump(java.io.PrintWriter p0, java.lang.String[] p1) {}
        public java.lang.String getDumpableName() { return null; }
    }

    private static class LocalDataShareAdapterResourceManager {
        void initializeForDelegate(android.view.contentcapture.ContentCaptureManager.DataShareAdapterDelegate p0, android.view.contentcapture.DataShareWriteAdapter p1, java.util.concurrent.Executor p2) {}
        java.util.concurrent.Executor getExecutor(android.view.contentcapture.ContentCaptureManager.DataShareAdapterDelegate p0) { return null; }
        android.view.contentcapture.DataShareWriteAdapter getAdapter(android.view.contentcapture.ContentCaptureManager.DataShareAdapterDelegate p0) { return null; }
        void clearHardReferences(android.view.contentcapture.ContentCaptureManager.DataShareAdapterDelegate p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LoggingLevel {
    }

    private static interface MyRunnable {
        public void run(com.android.internal.util.SyncResultReceiver p0) throws android.os.RemoteException;
    }

    static class StrippedContext {
        final java.lang.String mPackageName = null;
        final java.lang.String mContext = null;
        final int mUserId = 0;
        public java.lang.String toString() { return null; }
        public java.lang.String getPackageName() { return null; }
        public int getUserId() { return 0; }
    }
}
