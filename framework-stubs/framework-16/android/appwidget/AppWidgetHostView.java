package android.appwidget;

public class AppWidgetHostView extends android.widget.FrameLayout implements android.appwidget.AppWidgetHost.AppWidgetHostListener {
    static final java.lang.String TAG = "AppWidgetHostView";
    static final boolean LOGD = false;
    static final int VIEW_MODE_NOINIT = 0;
    static final int VIEW_MODE_CONTENT = 1;
    static final int VIEW_MODE_ERROR = 2;
    static final int VIEW_MODE_DEFAULT = 3;
    int mAppWidgetId;
    android.appwidget.AppWidgetProviderInfo mInfo;
    android.view.View mView;
    int mViewMode;
    boolean mColorMappingChanged;
    public AppWidgetHostView(android.content.Context p0) { super((android.content.Context)null); }
    public AppWidgetHostView(android.content.Context p0, android.widget.RemoteViews.InteractionHandler p1) { super((android.content.Context)null); }
    public AppWidgetHostView(android.content.Context p0, int p1, int p2) { super((android.content.Context)null); }
    public void setInteractionHandler(android.widget.RemoteViews.InteractionHandler p0) {}
    @android.annotation.NonNull
    public android.appwidget.AppWidgetHostView.InteractionLogger getInteractionLogger() { return null; }
    public void setAppWidget(int p0, android.appwidget.AppWidgetProviderInfo p1) {}
    public static android.graphics.Rect getDefaultPaddingForWidget(android.content.Context p0, android.content.ComponentName p1, android.graphics.Rect p2) { return null; }
    public int getAppWidgetId() { return 0; }
    public android.appwidget.AppWidgetProviderInfo getAppWidgetInfo() { return null; }
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    void restoreInstanceState() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onWindowFocusChanged(boolean p0) {}
    @java.lang.Deprecated
    public void updateAppWidgetSize(android.os.Bundle p0, int p1, int p2, int p3, int p4) {}
    public void updateAppWidgetSize(android.os.Bundle p0, java.util.List<android.util.SizeF> p1) {}
    public void updateAppWidgetSize(android.os.Bundle p0, int p1, int p2, int p3, int p4, boolean p5) {}
    public void updateAppWidgetOptions(android.os.Bundle p0) {}
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.content.Context p0, android.util.AttributeSet p1) { return null; }
    public void setExecutor(java.util.concurrent.Executor p0) {}
    public void setOnLightBackground(boolean p0) {}
    public void onUpdateProviderInfo(android.appwidget.AppWidgetProviderInfo p0) {}
    public void updateAppWidget(android.widget.RemoteViews p0) {}
    protected void applyRemoteViews(android.widget.RemoteViews p0, boolean p1) {}
    public void onViewDataChanged(int p0) {}
    protected void prepareView(android.view.View p0) {}
    protected android.view.View getDefaultView() { return null; }
    protected void onDefaultViewClicked(android.view.View p0) {}
    protected android.view.View getErrorView() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public android.app.ActivityOptions createSharedElementActivityOptions(int[] p0, java.lang.String[] p1, android.content.Intent p2) { return null; }
    public void setColorResources(android.util.SparseIntArray p0) {}
    public void setColorResources(android.widget.RemoteViews.ColorResources p0) {}
    public void setColorResourcesNoReapply(android.widget.RemoteViews.ColorResources p0) {}
    public void resetColorResources() {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    @android.annotation.FlaggedApi("android.appwidget.flags.engagement_metrics")
    public android.appwidget.AppWidgetEvent collectWidgetEvent() { return null; }

    public static class AdapterChildHostView extends android.appwidget.AppWidgetHostView {
        public AdapterChildHostView(android.content.Context p0) { super((android.content.Context)null); }
    }

    public class InteractionLogger implements android.widget.RemoteViews.InteractionHandler {
        InteractionLogger(android.appwidget.AppWidgetHostView p0) {}
        InteractionLogger(android.appwidget.AppWidgetHostView p0, android.widget.RemoteViews.InteractionHandler p1) {}
        public android.appwidget.AppWidgetEvent getEvent() { return null; }
        public boolean onInteraction(android.view.View p0, android.app.PendingIntent p1, android.widget.RemoteViews.RemoteResponse p2) { return false; }
        public void onScroll(android.widget.AbsListView p0) {}
    }

    private static class RemoteViewsWrapper extends android.widget.RemoteViews {
        RemoteViewsWrapper(android.content.pm.ApplicationInfo p0, int p1) { super((java.util.Map)null); }
    }

    private class ViewApplyListener implements android.widget.RemoteViews.OnViewAppliedListener {
        ViewApplyListener(android.appwidget.AppWidgetHostView p0, android.widget.RemoteViews p1, int p2, boolean p3) {}
        public void onViewApplied(android.view.View p0) {}
        public void onError(java.lang.Exception p0) {}
    }
}
