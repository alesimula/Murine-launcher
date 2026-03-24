package android.app.appsearch;

public final class GetByDocumentIdRequest {
    public static final java.lang.String PROJECTION_SCHEMA_TYPE_WILDCARD = "*";
    GetByDocumentIdRequest() {}
    @android.annotation.NonNull
    public java.lang.String getNamespace() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getIds() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getProjections() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<android.app.appsearch.PropertyPath>> getProjectionPaths() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.GetByDocumentIdRequest.Builder addIds(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetByDocumentIdRequest.Builder addIds(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetByDocumentIdRequest.Builder addProjection(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetByDocumentIdRequest.Builder addProjectionPaths(java.lang.String p0, java.util.Collection<android.app.appsearch.PropertyPath> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetByDocumentIdRequest build() { return null; }
    }
}
