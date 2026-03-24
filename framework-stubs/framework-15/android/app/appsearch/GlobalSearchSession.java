package android.app.appsearch;

public class GlobalSearchSession implements java.io.Closeable {
    GlobalSearchSession() {}
    public void close() {}
    public void getByDocumentId(java.lang.String p0, java.lang.String p1, android.app.appsearch.GetByDocumentIdRequest p2, java.util.concurrent.Executor p3, android.app.appsearch.BatchResultCallback<java.lang.String, android.app.appsearch.GenericDocument> p4) {}
    public void getSchema(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.GetSchemaResponse>> p3) {}
    public void registerObserverCallback(java.lang.String p0, android.app.appsearch.observer.ObserverSpec p1, java.util.concurrent.Executor p2, android.app.appsearch.observer.ObserverCallback p3) throws android.app.appsearch.exceptions.AppSearchException {}
    public void reportSystemUsage(android.app.appsearch.ReportSystemUsageRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.appsearch.AppSearchResult<java.lang.Void>> p2) {}
    @android.annotation.NonNull
    public android.app.appsearch.SearchResults search(java.lang.String p0, android.app.appsearch.SearchSpec p1) { return null; }
    public void unregisterObserverCallback(java.lang.String p0, android.app.appsearch.observer.ObserverCallback p1) throws android.app.appsearch.exceptions.AppSearchException {}
}
