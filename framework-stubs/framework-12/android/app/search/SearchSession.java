package android.app.search;

@android.annotation.SystemApi
public final class SearchSession implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private final android.app.search.ISearchUiManager mInterface = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsClosed = null;
    private final android.app.search.SearchSessionId mSessionId = null;
    private final android.os.IBinder mToken = null;
    SearchSession(android.content.Context p0, android.app.search.SearchContext p1) {}
    public void notifyEvent(android.app.search.Query p0, android.app.search.SearchTargetEvent p1) {}
    public void query(android.app.search.Query p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.util.List<android.app.search.SearchTarget>> p2) {}
    @java.lang.Deprecated
    public void destroy() {}
    protected void finalize() {}
    public void close() {}

    static class CallbackWrapper extends android.app.search.ISearchCallback.Stub {
        private final java.util.function.Consumer<java.util.List<android.app.search.SearchTarget>> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        CallbackWrapper(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.app.search.SearchTarget>> p1) { super(); }
        public void onResult(android.content.pm.ParceledListSlice p0) {}
    }
}
