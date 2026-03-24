package android.widget;

public abstract class RemoteViewsService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "RemoteViewsService";
    private static final java.util.HashMap<android.content.Intent.FilterComparison, android.widget.RemoteViewsService.RemoteViewsFactory> sRemoteViewFactories = null;
    private static final java.lang.Object sLock = null;
    public RemoteViewsService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(android.content.Intent p0);

    public static interface RemoteViewsFactory {
        public void onCreate();
        public void onDataSetChanged();
        public void onDestroy();
        public int getCount();
        public android.widget.RemoteViews getViewAt(int p0);
        public android.widget.RemoteViews getLoadingView();
        public int getViewTypeCount();
        public long getItemId(int p0);
        public boolean hasStableIds();
    }

    private static class RemoteViewsFactoryAdapter extends com.android.internal.widget.IRemoteViewsFactory.Stub {
        private android.widget.RemoteViewsService.RemoteViewsFactory mFactory;
        private boolean mIsCreated;
        public RemoteViewsFactoryAdapter(android.widget.RemoteViewsService.RemoteViewsFactory p0, boolean p1) { super(); }
        public synchronized boolean isCreated() { return false; }
        public synchronized void onDataSetChanged() {}
        public synchronized void onDataSetChangedAsync() {}
        public synchronized int getCount() { return 0; }
        public synchronized android.widget.RemoteViews getViewAt(int p0) { return null; }
        public synchronized android.widget.RemoteViews getLoadingView() { return null; }
        public synchronized int getViewTypeCount() { return 0; }
        public synchronized long getItemId(int p0) { return 0L; }
        public synchronized boolean hasStableIds() { return false; }
        public void onDestroy(android.content.Intent p0) {}
    }
}
