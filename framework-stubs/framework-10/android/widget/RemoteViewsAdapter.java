package android.widget;

public class RemoteViewsAdapter extends android.widget.BaseAdapter implements android.os.Handler.Callback {
    private static final java.lang.String TAG = "RemoteViewsAdapter";
    private static final int DEFAULT_CACHE_SIZE = 40;
    private static final int UNBIND_SERVICE_DELAY = 5000;
    private static final int DEFAULT_LOADING_VIEW_HEIGHT = 50;
    private static final java.util.HashMap<android.widget.RemoteViewsAdapter.RemoteViewsCacheKey, android.widget.RemoteViewsAdapter.FixedSizeRemoteViewsCache> sCachedRemoteViewsCaches = null;
    private static final java.util.HashMap<android.widget.RemoteViewsAdapter.RemoteViewsCacheKey, java.lang.Runnable> sRemoteViewsCacheRemoveRunnables = null;
    private static android.os.HandlerThread sCacheRemovalThread;
    private static android.os.Handler sCacheRemovalQueue;
    private static final int REMOTE_VIEWS_CACHE_DURATION = 5000;
    private final android.content.Context mContext = null;
    private final android.content.Intent mIntent = null;
    private final int mAppWidgetId = 0;
    private final boolean mOnLightBackground = false;
    private final java.util.concurrent.Executor mAsyncViewLoadExecutor = null;
    private android.widget.RemoteViews.OnClickHandler mRemoteViewsOnClickHandler;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.RemoteViewsAdapter.FixedSizeRemoteViewsCache mCache = null;
    private int mVisibleWindowLowerBound;
    private int mVisibleWindowUpperBound;
    private android.widget.RemoteViewsAdapter.RemoteViewsFrameLayoutRefSet mRequestedViews;
    @android.annotation.UnsupportedAppUsage
    private final android.os.HandlerThread mWorkerThread = null;
    private final android.os.Handler mMainHandler = null;
    private final android.widget.RemoteViewsAdapter.RemoteServiceHandler mServiceHandler = null;
    private final android.widget.RemoteViewsAdapter.RemoteAdapterConnectionCallback mCallback = null;
    private boolean mDataReady;
    private android.content.pm.ApplicationInfo mLastRemoteViewAppInfo;
    static final int MSG_REQUEST_BIND = 1;
    static final int MSG_NOTIFY_DATA_SET_CHANGED = 2;
    static final int MSG_LOAD_NEXT_ITEM = 3;
    static final int MSG_UNBIND_SERVICE = 4;
    private static final int MSG_MAIN_HANDLER_COMMIT_METADATA = 1;
    private static final int MSG_MAIN_HANDLER_SUPER_NOTIFY_DATA_SET_CHANGED = 2;
    private static final int MSG_MAIN_HANDLER_REMOTE_ADAPTER_CONNECTED = 3;
    private static final int MSG_MAIN_HANDLER_REMOTE_ADAPTER_DISCONNECTED = 4;
    private static final int MSG_MAIN_HANDLER_REMOTE_VIEWS_LOADED = 5;
    private static final int CACHE_RESET_CONFIG_FLAGS = -1073737216;
    public RemoteViewsAdapter(android.content.Context p0, android.content.Intent p1, android.widget.RemoteViewsAdapter.RemoteAdapterConnectionCallback p2, boolean p3) { super(); }
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.UnsupportedAppUsage
    public boolean isDataReady() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setRemoteViewsOnClickHandler(android.widget.RemoteViews.OnClickHandler p0) {}
    @android.annotation.UnsupportedAppUsage
    public void saveRemoteViewsCache() {}
    private void updateTemporaryMetaData(com.android.internal.widget.IRemoteViewsFactory p0) {}
    private void updateRemoteViews(com.android.internal.widget.IRemoteViewsFactory p0, int p1, boolean p2) {}
    @android.annotation.UnsupportedAppUsage
    public android.content.Intent getRemoteViewsServiceIntent() { return null; }
    public int getCount() { return 0; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public int getItemViewType(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setVisibleRangeHint(int p0, int p1) {}
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getViewTypeCount() { return 0; }
    public boolean hasStableIds() { return false; }
    public boolean isEmpty() { return false; }
    private int[] getVisibleWindow(int p0) { return null; }
    public void notifyDataSetChanged() {}
    void superNotifyDataSetChanged() {}
    public boolean handleMessage(android.os.Message p0) { return false; }
    private void requestBindService() {}

    private static class RemoteViewsMetaData {
        int count;
        int viewTypeCount;
        boolean hasStableIds;
        android.widget.RemoteViewsAdapter.LoadingViewTemplate loadingTemplate;
        private final android.util.SparseIntArray mTypeIdIndexMap = null;
        public RemoteViewsMetaData() {}
        public void set(android.widget.RemoteViewsAdapter.RemoteViewsMetaData p0) {}
        public void reset() {}
        public int getMappedViewType(int p0) { return 0; }
        public boolean isViewTypeInRange(int p0) { return false; }
        public synchronized android.widget.RemoteViewsAdapter.LoadingViewTemplate getLoadingTemplate(android.content.Context p0) { return null; }
    }

    private static class RemoteViewsIndexMetaData {
        int typeId;
        long itemId;
        public RemoteViewsIndexMetaData(android.widget.RemoteViews p0, long p1) {}
        public void set(android.widget.RemoteViews p0, long p1) {}
    }

    private class RemoteViewsFrameLayoutRefSet extends android.util.SparseArray<java.util.LinkedList<android.widget.RemoteViewsAdapter.RemoteViewsFrameLayout>> {
        private RemoteViewsFrameLayoutRefSet(android.widget.RemoteViewsAdapter p0) { super(); }
        public void add(int p0, android.widget.RemoteViewsAdapter.RemoteViewsFrameLayout p1) {}
        public void notifyOnRemoteViewsLoaded(int p0, android.widget.RemoteViews p1) {}
        public void removeView(android.widget.RemoteViewsAdapter.RemoteViewsFrameLayout p0) {}
    }

    static class RemoteViewsFrameLayout extends android.appwidget.AppWidgetHostView {
        private final android.widget.RemoteViewsAdapter.FixedSizeRemoteViewsCache mCache = null;
        public int cacheIndex;
        public RemoteViewsFrameLayout(android.content.Context p0, android.widget.RemoteViewsAdapter.FixedSizeRemoteViewsCache p1) { super((android.content.Context)null); }
        public void onRemoteViewsLoaded(android.widget.RemoteViews p0, android.widget.RemoteViews.OnClickHandler p1, boolean p2) {}
        protected android.view.View getDefaultView() { return null; }
        protected android.content.Context getRemoteContext() { return null; }
        protected android.view.View getErrorView() { return null; }
    }

    static class RemoteViewsCacheKey {
        final android.content.Intent.FilterComparison filter = null;
        final int widgetId = 0;
        RemoteViewsCacheKey(android.content.Intent.FilterComparison p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static class RemoteServiceHandler extends android.os.Handler implements android.content.ServiceConnection {
        private final java.lang.ref.WeakReference<android.widget.RemoteViewsAdapter> mAdapter = null;
        private final android.content.Context mContext = null;
        private com.android.internal.widget.IRemoteViewsFactory mRemoteViewsFactory;
        private boolean mNotifyDataSetChangedPending;
        private boolean mBindRequested;
        RemoteServiceHandler(android.os.Looper p0, android.widget.RemoteViewsAdapter p1, android.content.Context p2) { super(); }
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void handleMessage(android.os.Message p0) {}
        protected void unbindNow() {}
        private boolean sendNotifyDataSetChange(boolean p0) { return false; }
        private void enqueueDeferredUnbindServiceMessage() {}
    }

    public static interface RemoteAdapterConnectionCallback {
        public boolean onRemoteAdapterConnected();
        public void onRemoteAdapterDisconnected();
        public void deferNotifyDataSetChanged();
        public void setRemoteViewsAdapter(android.content.Intent p0, boolean p1);
    }

    private static class LoadingViewTemplate {
        public final android.widget.RemoteViews remoteViews = null;
        public int defaultHeight;
        LoadingViewTemplate(android.widget.RemoteViews p0, android.content.Context p1) {}
        public void loadFirstViewHeight(android.widget.RemoteViews p0, android.content.Context p1, java.util.concurrent.Executor p2) {}
    }

    private static class HandlerThreadExecutor implements java.util.concurrent.Executor {
        private final android.os.HandlerThread mThread = null;
        HandlerThreadExecutor(android.os.HandlerThread p0) {}
        public void execute(java.lang.Runnable p0) {}
    }

    private static class FixedSizeRemoteViewsCache {
        private final android.widget.RemoteViewsAdapter.RemoteViewsMetaData mMetaData = null;
        private final android.widget.RemoteViewsAdapter.RemoteViewsMetaData mTemporaryMetaData = null;
        private final android.util.SparseArray<android.widget.RemoteViewsAdapter.RemoteViewsIndexMetaData> mIndexMetaData = null;
        private final android.util.SparseArray<android.widget.RemoteViews> mIndexRemoteViews = null;
        private final android.util.SparseBooleanArray mIndicesToLoad = null;
        private int mLastRequestedIndex;
        private int mPreloadLowerBound;
        private int mPreloadUpperBound;
        private final int mMaxCount = 0;
        private final int mMaxCountSlack = 0;
        private static final float sMaxCountSlackPercent = 0.75f;
        private static final int sMaxMemoryLimitInBytes = 2097152;
        private final android.content.res.Configuration mConfiguration = null;
        FixedSizeRemoteViewsCache(int p0, android.content.res.Configuration p1) {}
        public void insert(int p0, android.widget.RemoteViews p1, long p2, int[] p3) {}
        public android.widget.RemoteViewsAdapter.RemoteViewsMetaData getMetaData() { return null; }
        public android.widget.RemoteViewsAdapter.RemoteViewsMetaData getTemporaryMetaData() { return null; }
        public android.widget.RemoteViews getRemoteViewsAt(int p0) { return null; }
        public android.widget.RemoteViewsAdapter.RemoteViewsIndexMetaData getMetaDataAt(int p0) { return null; }
        public void commitTemporaryMetaData() {}
        private int getRemoteViewsBitmapMemoryUsage() { return 0; }
        private int getFarthestPositionFrom(int p0, int[] p1) { return 0; }
        public void queueRequestedPositionToLoad(int p0) {}
        public boolean queuePositionsToBePreloadedFromRequestedPosition(int p0) { return false; }
        public int getNextIndexToLoad() { return 0; }
        public boolean containsRemoteViewAt(int p0) { return false; }
        public boolean containsMetaDataAt(int p0) { return false; }
        public void reset() {}
    }

    public static class AsyncRemoteAdapterAction implements java.lang.Runnable {
        private final android.widget.RemoteViewsAdapter.RemoteAdapterConnectionCallback mCallback = null;
        private final android.content.Intent mIntent = null;
        public AsyncRemoteAdapterAction(android.widget.RemoteViewsAdapter.RemoteAdapterConnectionCallback p0, android.content.Intent p1) {}
        public void run() {}
    }
}
