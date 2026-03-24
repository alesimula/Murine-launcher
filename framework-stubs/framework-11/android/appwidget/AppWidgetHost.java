package android.appwidget;

public class AppWidgetHost {
    static final int HANDLE_UPDATE = 1;
    static final int HANDLE_PROVIDER_CHANGED = 2;
    static final int HANDLE_PROVIDERS_CHANGED = 3;
    static final int HANDLE_VIEW_DATA_CHANGED = 4;
    static final int HANDLE_APP_WIDGET_REMOVED = 5;
    static final java.lang.Object sServiceLock = null;
    static com.android.internal.appwidget.IAppWidgetService sService;
    static boolean sServiceInitialized;
    private android.util.DisplayMetrics mDisplayMetrics;
    private java.lang.String mContextOpPackageName;
    private final android.os.Handler mHandler = null;
    private final int mHostId = 0;
    private final android.appwidget.AppWidgetHost.Callbacks mCallbacks = null;
    private final android.util.SparseArray<android.appwidget.AppWidgetHostView> mViews = null;
    private android.widget.RemoteViews.OnClickHandler mOnClickHandler;
    public AppWidgetHost(android.content.Context p0, int p1) {}
    public AppWidgetHost(android.content.Context p0, int p1, android.widget.RemoteViews.OnClickHandler p2, android.os.Looper p3) {}
    private static void bindService(android.content.Context p0) {}
    public void startListening() {}
    public void stopListening() {}
    public int allocateAppWidgetId() { return 0; }
    public final void startAppWidgetConfigureActivityForResult(android.app.Activity p0, int p1, int p2, int p3, android.os.Bundle p4) {}
    public int[] getAppWidgetIds() { return null; }
    public void deleteAppWidgetId(int p0) {}
    public void deleteHost() {}
    public static void deleteAllHosts() {}
    public final android.appwidget.AppWidgetHostView createView(android.content.Context p0, int p1, android.appwidget.AppWidgetProviderInfo p2) { return null; }
    protected android.appwidget.AppWidgetHostView onCreateView(android.content.Context p0, int p1, android.appwidget.AppWidgetProviderInfo p2) { return null; }
    protected void onProviderChanged(int p0, android.appwidget.AppWidgetProviderInfo p1) {}
    void dispatchOnAppWidgetRemoved(int p0) {}
    public void onAppWidgetRemoved(int p0) {}
    protected void onProvidersChanged() {}
    void updateAppWidgetView(int p0, android.widget.RemoteViews p1) {}
    void viewDataChanged(int p0, int p1) {}
    protected void clearViews() {}

    static class Callbacks extends com.android.internal.appwidget.IAppWidgetHost.Stub {
        private final java.lang.ref.WeakReference<android.os.Handler> mWeakHandler = null;
        public Callbacks(android.os.Handler p0) { super(); }
        public void updateAppWidget(int p0, android.widget.RemoteViews p1) {}
        public void providerChanged(int p0, android.appwidget.AppWidgetProviderInfo p1) {}
        public void appWidgetRemoved(int p0) {}
        public void providersChanged() {}
        public void viewDataChanged(int p0, int p1) {}
        private static boolean isLocalBinder() { return false; }
    }

    class UpdateHandler extends android.os.Handler {
        public UpdateHandler(android.appwidget.AppWidgetHost p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
