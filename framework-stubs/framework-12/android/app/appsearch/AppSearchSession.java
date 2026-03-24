package android.app.appsearch;

public final class AppSearchSession implements java.io.Closeable {
    private static final java.lang.String TAG = "AppSearchSession";
    private final java.lang.String mPackageName = null;
    private final java.lang.String mDatabaseName = null;
    private final android.os.UserHandle mUserHandle = null;
    private final android.app.appsearch.aidl.IAppSearchManager mService = null;
    private boolean mIsMutated;
    private boolean mIsClosed;
    static void createSearchSession(android.app.appsearch.AppSearchManager.SearchContext p0, android.app.appsearch.aidl.IAppSearchManager p1, android.os.UserHandle p2, java.lang.String p3, java.util.concurrent.Executor p4, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.AppSearchSession>> p5) {}
    private void initialize(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.AppSearchSession>> p1) {}
    private AppSearchSession(android.app.appsearch.aidl.IAppSearchManager p0, android.os.UserHandle p1, java.lang.String p2, java.lang.String p3) {}
    public void setSchema(android.app.appsearch.SetSchemaRequest p0, java.util.concurrent.Executor p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.SetSchemaResponse>> p3) {}
    public void getSchema(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.GetSchemaResponse>> p1) {}
    public void getNamespaces(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.util.Set<java.lang.String>>> p1) {}
    public void put(android.app.appsearch.PutDocumentsRequest p0, java.util.concurrent.Executor p1, android.app.appsearch.BatchResultCallback<java.lang.String, java.lang.Void> p2) {}
    public void getByDocumentId(android.app.appsearch.GetByDocumentIdRequest p0, java.util.concurrent.Executor p1, android.app.appsearch.BatchResultCallback<java.lang.String, android.app.appsearch.GenericDocument> p2) {}
    public android.app.appsearch.SearchResults search(java.lang.String p0, android.app.appsearch.SearchSpec p1) { return null; }
    public void reportUsage(android.app.appsearch.ReportUsageRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.lang.Void>> p2) {}
    public void remove(android.app.appsearch.RemoveByDocumentIdRequest p0, java.util.concurrent.Executor p1, android.app.appsearch.BatchResultCallback<java.lang.String, java.lang.Void> p2) {}
    public void remove(java.lang.String p0, android.app.appsearch.SearchSpec p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.lang.Void>> p3) {}
    public void getStorageInfo(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.StorageInfo>> p1) {}
    public void close() {}
    private void setSchemaNoMigrations(android.app.appsearch.SetSchemaRequest p0, java.util.List<android.os.Bundle> p1, java.util.Map<java.lang.String, java.util.List<android.os.Bundle>> p2, java.util.concurrent.Executor p3, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.SetSchemaResponse>> p4) {}
    private void setSchemaWithMigrations(android.app.appsearch.SetSchemaRequest p0, java.util.List<android.os.Bundle> p1, java.util.Map<java.lang.String, java.util.List<android.os.Bundle>> p2, java.util.concurrent.Executor p3, java.util.concurrent.Executor p4, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.SetSchemaResponse>> p5) {}
    private void sendSystemErrorToCallback(android.app.appsearch.AppSearchResult<?> p0, android.app.appsearch.BatchResultCallback<?, ?> p1) {}
}
