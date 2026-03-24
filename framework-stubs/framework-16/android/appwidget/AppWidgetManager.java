package android.appwidget;

public class AppWidgetManager {
    public static final java.lang.String ACTION_APPWIDGET_PICK = "android.appwidget.action.APPWIDGET_PICK";
    public static final java.lang.String ACTION_KEYGUARD_APPWIDGET_PICK = "android.appwidget.action.KEYGUARD_APPWIDGET_PICK";
    public static final java.lang.String ACTION_APPWIDGET_BIND = "android.appwidget.action.APPWIDGET_BIND";
    public static final java.lang.String ACTION_APPWIDGET_CONFIGURE = "android.appwidget.action.APPWIDGET_CONFIGURE";
    public static final java.lang.String EXTRA_APPWIDGET_ID = "appWidgetId";
    public static final java.lang.String OPTION_APPWIDGET_RESTORE_COMPLETED = "appWidgetRestoreCompleted";
    public static final java.lang.String OPTION_APPWIDGET_MIN_WIDTH = "appWidgetMinWidth";
    public static final java.lang.String OPTION_APPWIDGET_MIN_HEIGHT = "appWidgetMinHeight";
    public static final java.lang.String OPTION_APPWIDGET_MAX_WIDTH = "appWidgetMaxWidth";
    public static final java.lang.String OPTION_APPWIDGET_MAX_HEIGHT = "appWidgetMaxHeight";
    public static final java.lang.String OPTION_APPWIDGET_SIZES = "appWidgetSizes";
    public static final java.lang.String OPTION_APPWIDGET_HOST_CATEGORY = "appWidgetCategory";
    public static final java.lang.String EXTRA_APPWIDGET_OPTIONS = "appWidgetOptions";
    public static final java.lang.String EXTRA_APPWIDGET_IDS = "appWidgetIds";
    public static final java.lang.String EXTRA_APPWIDGET_PROVIDER = "appWidgetProvider";
    public static final java.lang.String EXTRA_APPWIDGET_PROVIDER_PROFILE = "appWidgetProviderProfile";
    public static final java.lang.String EXTRA_CUSTOM_INFO = "customInfo";
    public static final java.lang.String EXTRA_HOST_ID = "hostId";
    public static final java.lang.String EXTRA_CUSTOM_EXTRAS = "customExtras";
    public static final java.lang.String EXTRA_CATEGORY_FILTER = "categoryFilter";
    public static final java.lang.String EXTRA_CUSTOM_SORT = "customSort";
    public static final int INVALID_APPWIDGET_ID = 0;
    public static final java.lang.String ACTION_APPWIDGET_UPDATE = "android.appwidget.action.APPWIDGET_UPDATE";
    public static final java.lang.String ACTION_APPWIDGET_ENABLE_AND_UPDATE = "android.appwidget.action.APPWIDGET_ENABLE_AND_UPDATE";
    public static final java.lang.String ACTION_APPWIDGET_OPTIONS_CHANGED = "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS";
    public static final java.lang.String ACTION_APPWIDGET_DELETED = "android.appwidget.action.APPWIDGET_DELETED";
    public static final java.lang.String ACTION_APPWIDGET_DISABLED = "android.appwidget.action.APPWIDGET_DISABLED";
    public static final java.lang.String ACTION_APPWIDGET_ENABLED = "android.appwidget.action.APPWIDGET_ENABLED";
    public static final java.lang.String ACTION_APPWIDGET_RESTORED = "android.appwidget.action.APPWIDGET_RESTORED";
    public static final java.lang.String ACTION_APPWIDGET_HOST_RESTORED = "android.appwidget.action.APPWIDGET_HOST_RESTORED";
    @android.annotation.FlaggedApi("android.appwidget.flags.engagement_metrics")
    public static final java.lang.String EVENT_TYPE_WIDGET_INTERACTION = "widget_interaction";
    @android.annotation.FlaggedApi("android.appwidget.flags.engagement_metrics")
    public static final java.lang.String EVENT_CATEGORY_APPWIDGET = "android.appwidget";
    @android.annotation.FlaggedApi("android.appwidget.flags.engagement_metrics")
    public static final java.lang.String EXTRA_EVENT_CLICKED_VIEWS = "android.appwidget.extra.EVENT_CLICKED_VIEWS";
    @android.annotation.FlaggedApi("android.appwidget.flags.engagement_metrics")
    public static final java.lang.String EXTRA_EVENT_SCROLLED_VIEWS = "android.appwidget.extra.EVENT_SCROLLED_VIEWS";
    @android.annotation.FlaggedApi("android.appwidget.flags.engagement_metrics")
    public static final java.lang.String EXTRA_EVENT_DURATION_MS = "android.appwidget.extra.EVENT_DURATION_MS";
    @android.annotation.FlaggedApi("android.appwidget.flags.engagement_metrics")
    public static final java.lang.String EXTRA_EVENT_POSITION_RECT = "android.appwidget.extra.EVENT_POSITION_RECT";
    public static final java.lang.String EXTRA_APPWIDGET_OLD_IDS = "appWidgetOldIds";
    public static final java.lang.String EXTRA_APPWIDGET_PREVIEW = "appWidgetPreview";
    public static final java.lang.String META_DATA_APPWIDGET_PROVIDER = "android.appwidget.provider";
    public static android.appwidget.AppWidgetManager getInstance(android.content.Context p0) { return null; }
    public AppWidgetManager(android.content.Context p0, com.android.internal.appwidget.IAppWidgetService p1) {}
    public void updateAppWidget(int[] p0, android.widget.RemoteViews p1) {}
    public void updateAppWidgetOptions(int p0, android.os.Bundle p1) {}
    public android.os.Bundle getAppWidgetOptions(int p0) { return null; }
    public void updateAppWidget(int p0, android.widget.RemoteViews p1) {}
    public void partiallyUpdateAppWidget(int[] p0, android.widget.RemoteViews p1) {}
    public void partiallyUpdateAppWidget(int p0, android.widget.RemoteViews p1) {}
    public void updateAppWidget(android.content.ComponentName p0, android.widget.RemoteViews p1) {}
    public void updateAppWidgetProviderInfo(android.content.ComponentName p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void notifyAppWidgetViewDataChanged(int[] p0, int p1) {}
    @java.lang.Deprecated
    public void notifyAppWidgetViewDataChanged(int p0, int p1) {}
    @android.annotation.NonNull
    public java.util.List<android.appwidget.AppWidgetProviderInfo> getInstalledProvidersForProfile(android.os.UserHandle p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.appwidget.AppWidgetProviderInfo> getInstalledProvidersForPackage(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public java.util.List<android.appwidget.AppWidgetProviderInfo> getInstalledProviders() { return null; }
    public java.util.List<android.appwidget.AppWidgetProviderInfo> getInstalledProviders(int p0) { return null; }
    public java.util.List<android.appwidget.AppWidgetProviderInfo> getInstalledProvidersForProfile(int p0, android.os.UserHandle p1, java.lang.String p2) { return null; }
    public android.appwidget.AppWidgetProviderInfo getAppWidgetInfo(int p0) { return null; }
    public void bindAppWidgetId(int p0, android.content.ComponentName p1) {}
    public void bindAppWidgetId(int p0, android.content.ComponentName p1, android.os.Bundle p2) {}
    public boolean bindAppWidgetIdIfAllowed(int p0, android.content.ComponentName p1) { return false; }
    public boolean bindAppWidgetIdIfAllowed(int p0, android.content.ComponentName p1, android.os.Bundle p2) { return false; }
    public boolean bindAppWidgetIdIfAllowed(int p0, android.os.UserHandle p1, android.content.ComponentName p2, android.os.Bundle p3) { return false; }
    public boolean hasBindAppWidgetPermission(java.lang.String p0, int p1) { return false; }
    public boolean hasBindAppWidgetPermission(java.lang.String p0) { return false; }
    public void setBindAppWidgetPermission(java.lang.String p0, boolean p1) {}
    public void setBindAppWidgetPermission(java.lang.String p0, int p1, boolean p2) {}
    public boolean bindRemoteViewsService(android.content.Context p0, int p1, android.content.Intent p2, android.app.IServiceConnection p3, int p4) { return false; }
    public int[] getAppWidgetIds(android.content.ComponentName p0) { return null; }
    public boolean isBoundWidgetPackage(java.lang.String p0, int p1) { return false; }
    public boolean isRequestPinAppWidgetSupported() { return false; }
    public boolean requestPinAppWidget(android.content.ComponentName p0, android.app.PendingIntent p1) { return false; }
    public boolean requestPinAppWidget(android.content.ComponentName p0, android.os.Bundle p1, android.app.PendingIntent p2) { return false; }
    public void noteAppWidgetTapped(int p0) {}
    @android.annotation.FlaggedApi("android.appwidget.flags.generated_previews")
    public boolean setWidgetPreview(android.content.ComponentName p0, int p1, android.widget.RemoteViews p2) { return false; }
    @android.annotation.Nullable
    @android.annotation.FlaggedApi("android.appwidget.flags.generated_previews")
    public android.widget.RemoteViews getWidgetPreview(android.content.ComponentName p0, android.os.UserHandle p1, int p2) { return null; }
    @android.annotation.FlaggedApi("android.appwidget.flags.generated_previews")
    public void removeWidgetPreview(android.content.ComponentName p0, int p1) {}
    public void setConfigActivityComplete(int p0) {}

    public static class ServiceCollectionCache {
        public ServiceCollectionCache(android.content.Context p0, long p1) {}
        public void connectAndConsume(android.content.Intent p0, java.util.function.Consumer<android.os.IBinder> p1) {}

        private class ConnectionTask implements android.content.ServiceConnection {
            ConnectionTask(android.appwidget.AppWidgetManager.ServiceCollectionCache p0, android.content.Intent.FilterComparison p1) {}
            public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
            public void onNullBinding(android.content.ComponentName p0) {}
            public void onServiceDisconnected(android.content.ComponentName p0) {}
            void add(java.util.function.Consumer<android.os.IBinder> p0) {}
        }
    }
}
