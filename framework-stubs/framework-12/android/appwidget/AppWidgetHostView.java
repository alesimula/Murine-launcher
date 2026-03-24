package android.appwidget;

public class AppWidgetHostView extends android.widget.FrameLayout {
    static final java.lang.String TAG = "AppWidgetHostView";
    private static final java.lang.String KEY_JAILED_ARRAY = "jail";
    private static final java.lang.String KEY_INFLATION_ID = "inflation_id";
    static final boolean LOGD = false;
    static final int VIEW_MODE_NOINIT = 0;
    static final int VIEW_MODE_CONTENT = 1;
    static final int VIEW_MODE_ERROR = 2;
    static final int VIEW_MODE_DEFAULT = 3;
    private static final int FIRST_RESOURCE_COLOR_ID = 17170461;
    private static final int LAST_RESOURCE_COLOR_ID = 17170525;
    private static final android.view.LayoutInflater.Filter INFLATER_FILTER = null;
    android.content.Context mContext;
    android.content.Context mRemoteContext;
    int mAppWidgetId;
    android.appwidget.AppWidgetProviderInfo mInfo;
    android.view.View mView;
    int mViewMode;
    int mLayoutId;
    private android.widget.RemoteViews.InteractionHandler mInteractionHandler;
    private boolean mOnLightBackground;
    private android.util.SizeF mCurrentSize;
    private android.widget.RemoteViews.ColorResources mColorResources;
    private android.util.SparseIntArray mColorMapping;
    private android.widget.RemoteViews mLastInflatedRemoteViews;
    private long mLastInflatedRemoteViewsId;
    private java.util.concurrent.Executor mAsyncExecutor;
    private android.os.CancellationSignal mLastExecutionSignal;
    private android.util.SparseArray<android.os.Parcelable> mDelayedRestoredState;
    private long mDelayedRestoredInflationId;
    public AppWidgetHostView(android.content.Context p0) { super((android.content.Context)null); }
    public AppWidgetHostView(android.content.Context p0, android.widget.RemoteViews.InteractionHandler p1) { super((android.content.Context)null); }
    public AppWidgetHostView(android.content.Context p0, int p1, int p2) { super((android.content.Context)null); }
    public void setInteractionHandler(android.widget.RemoteViews.InteractionHandler p0) {}
    public void setAppWidget(int p0, android.appwidget.AppWidgetProviderInfo p1) {}
    public static android.graphics.Rect getDefaultPaddingForWidget(android.content.Context p0, android.content.ComponentName p1, android.graphics.Rect p2) { return null; }
    private static android.graphics.Rect getDefaultPaddingForWidget(android.content.Context p0, android.graphics.Rect p1) { return null; }
    private android.graphics.Rect getDefaultPadding() { return null; }
    public int getAppWidgetId() { return 0; }
    public android.appwidget.AppWidgetProviderInfo getAppWidgetInfo() { return null; }
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    private int generateId() { return 0; }
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    void restoreInstanceState() {}
    private android.util.SizeF computeSizeFromLayout(int p0, int p1, int p2, int p3) { return null; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    @java.lang.Deprecated
    public void updateAppWidgetSize(android.os.Bundle p0, int p1, int p2, int p3, int p4) {}
    public void updateAppWidgetSize(android.os.Bundle p0, java.util.List<android.util.SizeF> p1) {}
    public void updateAppWidgetSize(android.os.Bundle p0, int p1, int p2, int p3, int p4, boolean p5) {}
    public void updateAppWidgetOptions(android.os.Bundle p0) {}
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public void setExecutor(java.util.concurrent.Executor p0) {}
    public void setOnLightBackground(boolean p0) {}
    void resetAppWidget(android.appwidget.AppWidgetProviderInfo p0) {}
    public void updateAppWidget(android.widget.RemoteViews p0) {}
    private void reapplyLastRemoteViews() {}
    protected void applyRemoteViews(android.widget.RemoteViews p0, boolean p1) {}
    private void applyContent(android.view.View p0, boolean p1, java.lang.Exception p2) {}
    private void inflateAsync(android.widget.RemoteViews p0) {}
    void viewDataChanged(int p0) {}
    protected android.content.Context getRemoteContext() { return null; }
    protected void prepareView(android.view.View p0) {}
    protected android.view.View getDefaultView() { return null; }
    private void onDefaultViewClicked(android.view.View p0) {}
    protected android.view.View getErrorView() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public android.app.ActivityOptions createSharedElementActivityOptions(int[] p0, java.lang.String[] p1, android.content.Intent p2) { return null; }
    private android.widget.RemoteViews.InteractionHandler getHandler(android.widget.RemoteViews.InteractionHandler p0) { return null; }
    public void setColorResources(android.util.SparseIntArray p0) {}
    private boolean isSameColorMapping(android.util.SparseIntArray p0, android.util.SparseIntArray p1) { return false; }
    public void resetColorResources() {}

    private class ViewApplyListener implements android.widget.RemoteViews.OnViewAppliedListener {
        private final android.widget.RemoteViews mViews = null;
        private final boolean mIsReapply = false;
        private final int mLayoutId = 0;
        ViewApplyListener(android.appwidget.AppWidgetHostView p0, android.widget.RemoteViews p1, int p2, boolean p3) {}
        public void onViewApplied(android.view.View p0) {}
        public void onError(java.lang.Exception p0) {}
    }
}
