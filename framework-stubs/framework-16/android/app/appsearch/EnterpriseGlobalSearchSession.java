package android.app.appsearch;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_enterprise_global_search_session")
public class EnterpriseGlobalSearchSession {
    EnterpriseGlobalSearchSession() {}
    public void getByDocumentId(java.lang.String p0, java.lang.String p1, android.app.appsearch.GetByDocumentIdRequest p2, java.util.concurrent.Executor p3, android.app.appsearch.BatchResultCallback<java.lang.String, android.app.appsearch.GenericDocument> p4) {}
    public void getSchema(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.GetSchemaResponse>> p3) {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
    public void openBlobForRead(java.util.Set<android.app.appsearch.AppSearchBlobHandle> p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.OpenBlobForReadResponse>> p2) {}
    @android.annotation.NonNull
    public android.app.appsearch.SearchResults search(java.lang.String p0, android.app.appsearch.SearchSpec p1) { return null; }
}
