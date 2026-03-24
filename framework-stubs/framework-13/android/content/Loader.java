package android.content;

@java.lang.Deprecated
public class Loader<D extends java.lang.Object> {
    int mId;
    android.content.Loader.OnLoadCompleteListener<D> mListener;
    android.content.Loader.OnLoadCanceledListener<D> mOnLoadCanceledListener;
    android.content.Context mContext;
    boolean mStarted;
    boolean mAbandoned;
    boolean mReset;
    boolean mContentChanged;
    boolean mProcessingChange;
    public Loader(android.content.Context p0) {}
    public void deliverResult(D p0) {}
    public void deliverCancellation() {}
    public android.content.Context getContext() { return null; }
    public int getId() { return 0; }
    public void registerListener(int p0, android.content.Loader.OnLoadCompleteListener<D> p1) {}
    public void unregisterListener(android.content.Loader.OnLoadCompleteListener<D> p0) {}
    public void registerOnLoadCanceledListener(android.content.Loader.OnLoadCanceledListener<D> p0) {}
    public void unregisterOnLoadCanceledListener(android.content.Loader.OnLoadCanceledListener<D> p0) {}
    public boolean isStarted() { return false; }
    public boolean isAbandoned() { return false; }
    public boolean isReset() { return false; }
    public final void startLoading() {}
    protected void onStartLoading() {}
    public boolean cancelLoad() { return false; }
    protected boolean onCancelLoad() { return false; }
    public void forceLoad() {}
    protected void onForceLoad() {}
    public void stopLoading() {}
    protected void onStopLoading() {}
    public void abandon() {}
    protected void onAbandon() {}
    public void reset() {}
    protected void onReset() {}
    public boolean takeContentChanged() { return false; }
    public void commitContentChanged() {}
    public void rollbackContentChanged() {}
    public void onContentChanged() {}
    public java.lang.String dataToString(D p0) { return null; }
    public java.lang.String toString() { return null; }
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}

    @java.lang.Deprecated
    public final class ForceLoadContentObserver extends android.database.ContentObserver {
        public ForceLoadContentObserver(android.content.Loader p0) { super(null); }
        public boolean deliverSelfNotifications() { return false; }
        public void onChange(boolean p0) {}
    }

    @java.lang.Deprecated
    public static interface OnLoadCanceledListener<D extends java.lang.Object> {
        public void onLoadCanceled(android.content.Loader<D> p0);
    }

    @java.lang.Deprecated
    public static interface OnLoadCompleteListener<D extends java.lang.Object> {
        public void onLoadComplete(android.content.Loader<D> p0, D p1);
    }
}
