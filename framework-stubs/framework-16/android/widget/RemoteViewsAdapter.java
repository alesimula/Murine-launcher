package android.widget;

public class RemoteViewsAdapter extends android.widget.BaseAdapter implements android.os.Handler.Callback {
    static final int MSG_REQUEST_BIND = 1;
    static final int MSG_NOTIFY_DATA_SET_CHANGED = 2;
    static final int MSG_LOAD_NEXT_ITEM = 3;
    static final int MSG_UNBIND_SERVICE = 4;
    public RemoteViewsAdapter(android.content.Context p0, android.content.Intent p1, android.widget.RemoteViewsAdapter.RemoteAdapterConnectionCallback p2, boolean p3) { super(); }
    protected void finalize() throws java.lang.Throwable {}
    public boolean isDataReady() { return false; }
    public void setRemoteViewsInteractionHandler(android.widget.RemoteViews.InteractionHandler p0) {}
    public void saveRemoteViewsCache() {}
    public android.content.Intent getRemoteViewsServiceIntent() { return null; }
    public int getCount() { return 0; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public int getItemViewType(int p0) { return 0; }
    public void setVisibleRangeHint(int p0, int p1) {}
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getViewTypeCount() { return 0; }
    public boolean hasStableIds() { return false; }
    public boolean isEmpty() { return false; }
    public void notifyDataSetChanged() {}
    void superNotifyDataSetChanged() {}
    public boolean handleMessage(android.os.Message p0) { return false; }

    public static class AsyncRemoteAdapterAction implements java.lang.Runnable {
        public AsyncRemoteAdapterAction(android.widget.RemoteViewsAdapter.RemoteAdapterConnectionCallback p0, android.content.Intent p1) {}
        public void run() {}
    }

    private static class FixedSizeRemoteViewsCache {
        FixedSizeRemoteViewsCache(int p0, android.content.res.Configuration p1) {}
        public void insert(int p0, android.widget.RemoteViews p1, long p2, int[] p3) {}
        public android.widget.RemoteViewsAdapter.RemoteViewsMetaData getMetaData() { return null; }
        public android.widget.RemoteViewsAdapter.RemoteViewsMetaData getTemporaryMetaData() { return null; }
        public android.widget.RemoteViews getRemoteViewsAt(int p0) { return null; }
        public android.widget.RemoteViewsAdapter.RemoteViewsIndexMetaData getMetaDataAt(int p0) { return null; }
        public void commitTemporaryMetaData() {}
        public void queueRequestedPositionToLoad(int p0) {}
        public boolean queuePositionsToBePreloadedFromRequestedPosition(int p0) { return false; }
        public int getNextIndexToLoad() { return 0; }
        public boolean containsRemoteViewAt(int p0) { return false; }
        public boolean containsMetaDataAt(int p0) { return false; }
        public void reset() {}
    }

    private static class HandlerThreadExecutor implements java.util.concurrent.Executor {
        HandlerThreadExecutor(android.os.HandlerThread p0) {}
        public void execute(java.lang.Runnable p0) {}
    }

    private static class LoadingViewTemplate {
        public final android.widget.RemoteViews remoteViews = null;
        public int defaultHeight;
        LoadingViewTemplate(android.widget.RemoteViews p0, android.content.Context p1) {}
        public void loadFirstViewHeight(android.widget.RemoteViews p0, android.content.Context p1, java.util.concurrent.Executor p2) {}
    }

    public static interface RemoteAdapterConnectionCallback {
        public boolean onRemoteAdapterConnected();
        public void onRemoteAdapterDisconnected();
        public void deferNotifyDataSetChanged();
        public void setRemoteViewsAdapter(android.content.Intent p0, boolean p1);
    }

    private static class RemoteServiceHandler extends android.os.Handler implements android.content.ServiceConnection {
        RemoteServiceHandler(android.os.Looper p0, android.widget.RemoteViewsAdapter p1, android.content.Context p2) { super(); }
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void onNullBinding(android.content.ComponentName p0) {}
        public void handleMessage(android.os.Message p0) {}
        protected void unbindNow() {}
    }

    static class RemoteViewsCacheKey {
        final android.content.Intent.FilterComparison filter = null;
        final int widgetId = 0;
        RemoteViewsCacheKey(android.content.Intent.FilterComparison p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    static class RemoteViewsFrameLayout extends android.appwidget.AppWidgetHostView.AdapterChildHostView {
        public int cacheIndex;
        public RemoteViewsFrameLayout(android.content.Context p0, android.widget.RemoteViewsAdapter.FixedSizeRemoteViewsCache p1) { super(null); }
        public void onRemoteViewsLoaded(android.widget.RemoteViews p0, android.widget.RemoteViews.InteractionHandler p1, boolean p2) {}
        protected android.view.View getDefaultView() { return null; }
        protected android.view.View getErrorView() { return null; }
    }

    private class RemoteViewsFrameLayoutRefSet extends android.util.SparseArray<java.util.ArrayList<android.widget.RemoteViewsAdapter.RemoteViewsFrameLayout>> {
        public void add(int p0, android.widget.RemoteViewsAdapter.RemoteViewsFrameLayout p1) {}
        public void notifyOnRemoteViewsLoaded(int p0, android.widget.RemoteViews p1) {}
        public void removeView(android.widget.RemoteViewsAdapter.RemoteViewsFrameLayout p0) {}
    }

    private static class RemoteViewsIndexMetaData {
        int typeId;
        long itemId;
        public RemoteViewsIndexMetaData(android.widget.RemoteViews p0, long p1) {}
        public void set(android.widget.RemoteViews p0, long p1) {}
    }

    private static class RemoteViewsMetaData {
        int count;
        int viewTypeCount;
        boolean hasStableIds;
        android.widget.RemoteViewsAdapter.LoadingViewTemplate loadingTemplate;
        public RemoteViewsMetaData() {}
        public void set(android.widget.RemoteViewsAdapter.RemoteViewsMetaData p0) {}
        public void reset() {}
        public int getMappedViewType(int p0) { return 0; }
        public boolean isViewTypeInRange(int p0) { return false; }
        public synchronized android.widget.RemoteViewsAdapter.LoadingViewTemplate getLoadingTemplate(android.content.Context p0) { return null; }
    }
}
