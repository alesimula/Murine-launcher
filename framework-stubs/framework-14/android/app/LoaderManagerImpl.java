package android.app;

class LoaderManagerImpl extends android.app.LoaderManager {
    static final java.lang.String TAG = "LoaderManager";
    static boolean DEBUG;
    final android.util.SparseArray<android.app.LoaderManagerImpl.LoaderInfo> mLoaders = null;
    final android.util.SparseArray<android.app.LoaderManagerImpl.LoaderInfo> mInactiveLoaders = null;
    final java.lang.String mWho = null;
    boolean mStarted;
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mCreatingLoader;
    LoaderManagerImpl(java.lang.String p0, android.app.FragmentHostCallback p1, boolean p2) { super(); }
    void updateHostController(android.app.FragmentHostCallback p0) {}
    public android.app.FragmentHostCallback getFragmentHostCallback() { return null; }
    void installLoader(android.app.LoaderManagerImpl.LoaderInfo p0) {}
    public <D extends java.lang.Object> android.content.Loader<D> initLoader(int p0, android.os.Bundle p1, android.app.LoaderManager.LoaderCallbacks<D> p2) { return null; }
    public <D extends java.lang.Object> android.content.Loader<D> restartLoader(int p0, android.os.Bundle p1, android.app.LoaderManager.LoaderCallbacks<D> p2) { return null; }
    public void destroyLoader(int p0) {}
    public <D extends java.lang.Object> android.content.Loader<D> getLoader(int p0) { return null; }
    void doStart() {}
    void doStop() {}
    void doRetain() {}
    void finishRetain() {}
    void doReportNextStart() {}
    void doReportStart() {}
    void doDestroy() {}
    public java.lang.String toString() { return null; }
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public boolean hasRunningLoaders() { return false; }

    final class LoaderInfo implements android.content.Loader.OnLoadCompleteListener<java.lang.Object>, android.content.Loader.OnLoadCanceledListener<java.lang.Object> {
        final int mId = 0;
        final android.os.Bundle mArgs = null;
        android.app.LoaderManager.LoaderCallbacks<java.lang.Object> mCallbacks;
        android.content.Loader<java.lang.Object> mLoader;
        boolean mHaveData;
        boolean mDeliveredData;
        java.lang.Object mData;
        boolean mStarted;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mReportNextStart;
        boolean mDestroyed;
        boolean mListenerRegistered;
        android.app.LoaderManagerImpl.LoaderInfo mPendingLoader;
        public LoaderInfo(int p0, android.os.Bundle p1, android.app.LoaderManager.LoaderCallbacks<java.lang.Object> p2) {}
        void start() {}
        void retain() {}
        void finishRetain() {}
        void reportStart() {}
        void stop() {}
        boolean cancel() { return false; }
        void destroy() {}
        public void onLoadCanceled(android.content.Loader<java.lang.Object> p0) {}
        public void onLoadComplete(android.content.Loader<java.lang.Object> p0, java.lang.Object p1) {}
        void callOnLoadFinished(android.content.Loader<java.lang.Object> p0, java.lang.Object p1) {}
        public java.lang.String toString() { return null; }
        public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    }
}
