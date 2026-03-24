package android.app.appsearch;

public class GlobalSearchSession implements java.io.Closeable {
    private static final java.lang.String TAG = "AppSearchGlobalSearchSe";
    private final java.lang.String mPackageName = null;
    private final android.os.UserHandle mUserHandle = null;
    private final android.app.appsearch.aidl.IAppSearchManager mService = null;
    private boolean mIsMutated;
    private boolean mIsClosed;
    static void createGlobalSearchSession(android.app.appsearch.aidl.IAppSearchManager p0, android.os.UserHandle p1, java.lang.String p2, java.util.concurrent.Executor p3, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.GlobalSearchSession>> p4) {}
    private void initialize(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.GlobalSearchSession>> p1) {}
    private GlobalSearchSession(android.app.appsearch.aidl.IAppSearchManager p0, android.os.UserHandle p1, java.lang.String p2) {}
    public android.app.appsearch.SearchResults search(java.lang.String p0, android.app.appsearch.SearchSpec p1) { return null; }
    public void reportSystemUsage(android.app.appsearch.ReportSystemUsageRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.lang.Void>> p2) {}
    public void close() {}
}
