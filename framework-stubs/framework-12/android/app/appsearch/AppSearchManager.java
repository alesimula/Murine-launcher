package android.app.appsearch;

public class AppSearchManager {
    private final android.app.appsearch.aidl.IAppSearchManager mService = null;
    private final android.content.Context mContext = null;
    public AppSearchManager(android.content.Context p0, android.app.appsearch.aidl.IAppSearchManager p1) {}
    public void createSearchSession(android.app.appsearch.AppSearchManager.SearchContext p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.AppSearchSession>> p2) {}
    public void createGlobalSearchSession(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.GlobalSearchSession>> p1) {}
    private java.lang.String getPackageName() { return null; }

    public static final class SearchContext {
        final java.lang.String mDatabaseName = null;
        SearchContext(java.lang.String p0) {}
        public java.lang.String getDatabaseName() { return null; }

        public static final class Builder {
            private final java.lang.String mDatabaseName = null;
            private boolean mBuilt;
            public Builder(java.lang.String p0) {}
            public android.app.appsearch.AppSearchManager.SearchContext build() { return null; }
        }
    }
}
