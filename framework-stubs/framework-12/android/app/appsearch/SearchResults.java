package android.app.appsearch;

public class SearchResults implements java.io.Closeable {
    private static final java.lang.String TAG = "SearchResults";
    private final android.app.appsearch.aidl.IAppSearchManager mService = null;
    private final java.lang.String mPackageName = null;
    private final java.lang.String mDatabaseName = null;
    private final java.lang.String mQueryExpression = null;
    private final android.app.appsearch.SearchSpec mSearchSpec = null;
    private final android.os.UserHandle mUserHandle = null;
    private long mNextPageToken;
    private boolean mIsFirstLoad;
    private boolean mIsClosed;
    SearchResults(android.app.appsearch.aidl.IAppSearchManager p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.app.appsearch.SearchSpec p4, android.os.UserHandle p5) {}
    public void getNextPage(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.util.List<android.app.appsearch.SearchResult>>> p1) {}
    public void close() {}
    private android.app.appsearch.aidl.IAppSearchResultCallback wrapCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.util.List<android.app.appsearch.SearchResult>>> p1) { return null; }
    private void invokeCallback(android.app.appsearch.AppSearchResult<android.os.Bundle> p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.util.List<android.app.appsearch.SearchResult>>> p1) {}
}
