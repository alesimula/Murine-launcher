package android.appwidget;

public class AppWidgetHost {
    static final int HANDLE_UPDATE = 1;
    static final int HANDLE_PROVIDER_CHANGED = 2;
    static final int HANDLE_PROVIDERS_CHANGED = 3;
    static final int HANDLE_VIEW_DATA_CHANGED = 4;
    static final int HANDLE_APP_WIDGET_REMOVED = 5;
    static final int HANDLE_VIEW_UPDATE_DEFERRED = 6;
    static final java.lang.Object sServiceLock = null;
    static com.android.internal.appwidget.IAppWidgetService sService;
    static boolean sServiceInitialized;
    public AppWidgetHost(android.content.Context p0, int p1) {}
    public AppWidgetHost(android.content.Context p0, int p1, android.widget.RemoteViews.InteractionHandler p2, android.os.Looper p3) {}
    public void startListening() {}
    public void stopListening() {}
    public int allocateAppWidgetId() { return 0; }
    @android.annotation.Nullable
    public final android.content.IntentSender getIntentSenderForConfigureActivity(int p0, int p1) { return null; }
    public final void startAppWidgetConfigureActivityForResult(android.app.Activity p0, int p1, int p2, int p3, android.os.Bundle p4) {}
    public void setAppWidgetHidden() {}
    public void setInteractionHandler(android.widget.RemoteViews.InteractionHandler p0) {}
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
    public void setListener(int p0, android.appwidget.AppWidgetHost.AppWidgetHostListener p1) {}
    public void removeListener(int p0) {}
    void updateAppWidgetView(int p0, android.widget.RemoteViews p1) {}
    void viewDataChanged(int p0, int p1) {}
    protected void clearViews() {}
    public void reportAllWidgetEvents() {}
    public void reportEventForWidget(int p0) {}

    public static interface AppWidgetHostListener {
        public void onUpdateProviderInfo(android.appwidget.AppWidgetProviderInfo p0);
        public void updateAppWidget(android.widget.RemoteViews p0);
        default public void updateAppWidgetDeferred(java.lang.String p0, int p1) {}
        public void onViewDataChanged(int p0);
        @android.annotation.FlaggedApi("android.appwidget.flags.engagement_metrics")
        @android.annotation.Nullable
        default public android.appwidget.AppWidgetEvent collectWidgetEvent() { return null; }
    }

    static class Callbacks extends com.android.internal.appwidget.IAppWidgetHost.Stub {
        public Callbacks(android.os.Handler p0) { super(); }
        public void updateAppWidget(int p0, android.widget.RemoteViews p1) {}
        public void providerChanged(int p0, android.appwidget.AppWidgetProviderInfo p1) {}
        public void appWidgetRemoved(int p0) {}
        public void providersChanged() {}
        public void viewDataChanged(int p0, int p1) {}
        public void updateAppWidgetDeferred(int p0) {}
    }

    class UpdateHandler extends android.os.Handler {
        public UpdateHandler(android.appwidget.AppWidgetHost p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
