package android.print;

public final class PrintManager {
    private static final java.lang.String LOG_TAG = "PrintManager";
    private static final boolean DEBUG = false;
    private static final int MSG_NOTIFY_PRINT_JOB_STATE_CHANGED = 1;
    public static final java.lang.String PRINT_SPOOLER_PACKAGE_NAME = "com.android.printspooler";
    @android.annotation.SystemApi
    public static final int ENABLED_SERVICES = 1;
    public static final int DISABLED_SERVICES = 2;
    public static final int ALL_SERVICES = 3;
    public static final java.lang.String ACTION_PRINT_DIALOG = "android.print.PRINT_DIALOG";
    public static final java.lang.String EXTRA_PRINT_DIALOG_INTENT = "android.print.intent.extra.EXTRA_PRINT_DIALOG_INTENT";
    public static final java.lang.String EXTRA_PRINT_JOB = "android.print.intent.extra.EXTRA_PRINT_JOB";
    public static final java.lang.String EXTRA_PRINT_DOCUMENT_ADAPTER = "android.print.intent.extra.EXTRA_PRINT_DOCUMENT_ADAPTER";
    public static final int APP_ID_ANY = -2;
    private final android.content.Context mContext = null;
    private final android.print.IPrintManager mService = null;
    private final int mUserId = 0;
    private final int mAppId = 0;
    private final android.os.Handler mHandler = null;
    private java.util.Map<android.print.PrintManager.PrintJobStateChangeListener, android.print.PrintManager.PrintJobStateChangeListenerWrapper> mPrintJobStateChangeListeners;
    private java.util.Map<android.print.PrintManager.PrintServicesChangeListener, android.print.PrintManager.PrintServicesChangeListenerWrapper> mPrintServicesChangeListeners;
    private java.util.Map<android.print.PrintManager.PrintServiceRecommendationsChangeListener, android.print.PrintManager.PrintServiceRecommendationsChangeListenerWrapper> mPrintServiceRecommendationsChangeListeners;
    public PrintManager(android.content.Context p0, android.print.IPrintManager p1, int p2, int p3) {}
    public android.print.PrintManager getGlobalPrintManagerForUser(int p0) { return null; }
    android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public void addPrintJobStateChangeListener(android.print.PrintManager.PrintJobStateChangeListener p0) {}
    public void removePrintJobStateChangeListener(android.print.PrintManager.PrintJobStateChangeListener p0) {}
    public android.print.PrintJob getPrintJob(android.print.PrintJobId p0) { return null; }
    public android.graphics.drawable.Icon getCustomPrinterIcon(android.print.PrinterId p0) { return null; }
    public java.util.List<android.print.PrintJob> getPrintJobs() { return null; }
    void cancelPrintJob(android.print.PrintJobId p0) {}
    void restartPrintJob(android.print.PrintJobId p0) {}
    public android.print.PrintJob print(java.lang.String p0, android.print.PrintDocumentAdapter p1, android.print.PrintAttributes p2) { return null; }
    @android.annotation.SystemApi
    public void addPrintServicesChangeListener(android.print.PrintManager.PrintServicesChangeListener p0, android.os.Handler p1) {}
    @android.annotation.SystemApi
    public void removePrintServicesChangeListener(android.print.PrintManager.PrintServicesChangeListener p0) {}
    @android.annotation.SystemApi
    public java.util.List<android.printservice.PrintServiceInfo> getPrintServices(int p0) { return null; }
    @android.annotation.SystemApi
    public void addPrintServiceRecommendationsChangeListener(android.print.PrintManager.PrintServiceRecommendationsChangeListener p0, android.os.Handler p1) {}
    @android.annotation.SystemApi
    public void removePrintServiceRecommendationsChangeListener(android.print.PrintManager.PrintServiceRecommendationsChangeListener p0) {}
    @android.annotation.SystemApi
    public java.util.List<android.printservice.recommendation.RecommendationInfo> getPrintServiceRecommendations() { return null; }
    public android.print.PrinterDiscoverySession createPrinterDiscoverySession() { return null; }
    public void setPrintServiceEnabled(android.content.ComponentName p0, boolean p1) {}

    public static final class PrintServicesChangeListenerWrapper extends android.print.IPrintServicesChangeListener.Stub {
        private final java.lang.ref.WeakReference<android.print.PrintManager.PrintServicesChangeListener> mWeakListener = null;
        private final java.lang.ref.WeakReference<android.os.Handler> mWeakHandler = null;
        public PrintServicesChangeListenerWrapper(android.print.PrintManager.PrintServicesChangeListener p0, android.os.Handler p1) { super(); }
        public void onPrintServicesChanged() {}
        public void destroy() {}
    }

    @android.annotation.SystemApi
    public static interface PrintServicesChangeListener {
        public void onPrintServicesChanged();
    }

    public static final class PrintServiceRecommendationsChangeListenerWrapper extends android.printservice.recommendation.IRecommendationsChangeListener.Stub {
        private final java.lang.ref.WeakReference<android.print.PrintManager.PrintServiceRecommendationsChangeListener> mWeakListener = null;
        private final java.lang.ref.WeakReference<android.os.Handler> mWeakHandler = null;
        public PrintServiceRecommendationsChangeListenerWrapper(android.print.PrintManager.PrintServiceRecommendationsChangeListener p0, android.os.Handler p1) { super(); }
        public void onRecommendationsChanged() {}
        public void destroy() {}
    }

    @android.annotation.SystemApi
    public static interface PrintServiceRecommendationsChangeListener {
        public void onPrintServiceRecommendationsChanged();
    }

    public static final class PrintJobStateChangeListenerWrapper extends android.print.IPrintJobStateChangeListener.Stub {
        private final java.lang.ref.WeakReference<android.print.PrintManager.PrintJobStateChangeListener> mWeakListener = null;
        private final java.lang.ref.WeakReference<android.os.Handler> mWeakHandler = null;
        public PrintJobStateChangeListenerWrapper(android.print.PrintManager.PrintJobStateChangeListener p0, android.os.Handler p1) { super(); }
        public void onPrintJobStateChanged(android.print.PrintJobId p0) {}
        public void destroy() {}
        public android.print.PrintManager.PrintJobStateChangeListener getListener() { return null; }
    }

    public static interface PrintJobStateChangeListener {
        public void onPrintJobStateChanged(android.print.PrintJobId p0);
    }

    public static final class PrintDocumentAdapterDelegate extends android.print.IPrintDocumentAdapter.Stub implements android.app.Application.ActivityLifecycleCallbacks {
        private final java.lang.Object mLock = null;
        private android.app.Activity mActivity;
        private android.print.PrintDocumentAdapter mDocumentAdapter;
        private android.os.Handler mHandler;
        private android.print.IPrintDocumentAdapterObserver mObserver;
        private android.print.PrintManager.PrintDocumentAdapterDelegate.DestroyableCallback mPendingCallback;
        public PrintDocumentAdapterDelegate(android.app.Activity p0, android.print.PrintDocumentAdapter p1) { super(); }
        public void setObserver(android.print.IPrintDocumentAdapterObserver p0) {}
        public void start() {}
        public void layout(android.print.PrintAttributes p0, android.print.PrintAttributes p1, android.print.ILayoutResultCallback p2, android.os.Bundle p3, int p4) {}
        public void write(android.print.PageRange[] p0, android.os.ParcelFileDescriptor p1, android.print.IWriteResultCallback p2, int p3) {}
        public void finish() {}
        public void kill(java.lang.String p0) {}
        public void onActivityPaused(android.app.Activity p0) {}
        public void onActivityCreated(android.app.Activity p0, android.os.Bundle p1) {}
        public void onActivityStarted(android.app.Activity p0) {}
        public void onActivityResumed(android.app.Activity p0) {}
        public void onActivityStopped(android.app.Activity p0) {}
        public void onActivitySaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
        public void onActivityDestroyed(android.app.Activity p0) {}
        private boolean isDestroyedLocked() { return false; }
        private void destroyLocked() {}

        private final class MyWriteResultCallback extends android.print.PrintDocumentAdapter.WriteResultCallback implements android.print.PrintManager.PrintDocumentAdapterDelegate.DestroyableCallback {
            private android.os.ParcelFileDescriptor mFd;
            private android.print.IWriteResultCallback mCallback;
            private final int mSequence = 0;
            public MyWriteResultCallback(android.print.PrintManager.PrintDocumentAdapterDelegate p0, android.print.IWriteResultCallback p1, android.os.ParcelFileDescriptor p2, int p3) { super(); }
            public void onWriteFinished(android.print.PageRange[] p0) {}
            public void onWriteFailed(java.lang.CharSequence p0) {}
            public void onWriteCancelled() {}
            public void destroy() {}
        }

        private final class MyLayoutResultCallback extends android.print.PrintDocumentAdapter.LayoutResultCallback implements android.print.PrintManager.PrintDocumentAdapterDelegate.DestroyableCallback {
            private android.print.ILayoutResultCallback mCallback;
            private final int mSequence = 0;
            public MyLayoutResultCallback(android.print.PrintManager.PrintDocumentAdapterDelegate p0, android.print.ILayoutResultCallback p1, int p2) { super(); }
            public void onLayoutFinished(android.print.PrintDocumentInfo p0, boolean p1) {}
            public void onLayoutFailed(java.lang.CharSequence p0) {}
            public void onLayoutCancelled() {}
            public void destroy() {}
        }

        private final class MyHandler extends android.os.Handler {
            public static final int MSG_ON_START = 1;
            public static final int MSG_ON_LAYOUT = 2;
            public static final int MSG_ON_WRITE = 3;
            public static final int MSG_ON_FINISH = 4;
            public static final int MSG_ON_KILL = 5;
            public MyHandler(android.print.PrintManager.PrintDocumentAdapterDelegate p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }

        private static interface DestroyableCallback {
            public void destroy();
        }
    }
}
