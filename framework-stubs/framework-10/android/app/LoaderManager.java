package android.app;

@java.lang.Deprecated
public abstract class LoaderManager {
    public LoaderManager() {}
    public abstract <D extends java.lang.Object> android.content.Loader<D> initLoader(int p0, android.os.Bundle p1, android.app.LoaderManager.LoaderCallbacks<D> p2);
    public abstract <D extends java.lang.Object> android.content.Loader<D> restartLoader(int p0, android.os.Bundle p1, android.app.LoaderManager.LoaderCallbacks<D> p2);
    public abstract void destroyLoader(int p0);
    public abstract <D extends java.lang.Object> android.content.Loader<D> getLoader(int p0);
    public abstract void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3);
    public static void enableDebugLogging(boolean p0) {}
    public android.app.FragmentHostCallback getFragmentHostCallback() { return null; }

    @java.lang.Deprecated
    public static interface LoaderCallbacks<D extends java.lang.Object> {
        public android.content.Loader<D> onCreateLoader(int p0, android.os.Bundle p1);
        public void onLoadFinished(android.content.Loader<D> p0, D p1);
        public void onLoaderReset(android.content.Loader<D> p0);
    }
}
