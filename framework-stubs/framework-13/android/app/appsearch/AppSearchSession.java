package android.app.appsearch;

public final class AppSearchSession implements java.io.Closeable {
    public void setSchema(android.app.appsearch.SetSchemaRequest p0, java.util.concurrent.Executor p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.SetSchemaResponse>> p3) {}
    public void getSchema(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.GetSchemaResponse>> p1) {}
    public void getNamespaces(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.util.Set<java.lang.String>>> p1) {}
    public void put(android.app.appsearch.PutDocumentsRequest p0, java.util.concurrent.Executor p1, android.app.appsearch.BatchResultCallback<java.lang.String, java.lang.Void> p2) {}
    public void getByDocumentId(android.app.appsearch.GetByDocumentIdRequest p0, java.util.concurrent.Executor p1, android.app.appsearch.BatchResultCallback<java.lang.String, android.app.appsearch.GenericDocument> p2) {}
    @android.annotation.NonNull
    public android.app.appsearch.SearchResults search(java.lang.String p0, android.app.appsearch.SearchSpec p1) { return null; }
    public void reportUsage(android.app.appsearch.ReportUsageRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.lang.Void>> p2) {}
    public void remove(android.app.appsearch.RemoveByDocumentIdRequest p0, java.util.concurrent.Executor p1, android.app.appsearch.BatchResultCallback<java.lang.String, java.lang.Void> p2) {}
    public void remove(java.lang.String p0, android.app.appsearch.SearchSpec p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.lang.Void>> p3) {}
    public void getStorageInfo(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.StorageInfo>> p1) {}
    public void close() {}
}
