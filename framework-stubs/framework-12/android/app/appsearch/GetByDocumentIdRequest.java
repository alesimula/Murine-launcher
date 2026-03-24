package android.app.appsearch;

public final class GetByDocumentIdRequest {
    public static final java.lang.String PROJECTION_SCHEMA_TYPE_WILDCARD = "*";
    private final java.lang.String mNamespace = null;
    private final java.util.Set<java.lang.String> mIds = null;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> mTypePropertyPathsMap = null;
    GetByDocumentIdRequest(java.lang.String p0, java.util.Set<java.lang.String> p1, java.util.Map<java.lang.String, java.util.List<java.lang.String>> p2) {}
    public java.lang.String getNamespace() { return null; }
    public java.util.Set<java.lang.String> getIds() { return null; }
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getProjections() { return null; }
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getProjectionsInternal() { return null; }

    public static final class Builder {
        private final java.lang.String mNamespace = null;
        private android.util.ArraySet<java.lang.String> mIds;
        private android.util.ArrayMap<java.lang.String, java.util.List<java.lang.String>> mProjectionTypePropertyPaths;
        private boolean mBuilt;
        public Builder(java.lang.String p0) {}
        public android.app.appsearch.GetByDocumentIdRequest.Builder addIds(java.lang.String... p0) { return null; }
        public android.app.appsearch.GetByDocumentIdRequest.Builder addIds(java.util.Collection<java.lang.String> p0) { return null; }
        public android.app.appsearch.GetByDocumentIdRequest.Builder addProjection(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        public android.app.appsearch.GetByDocumentIdRequest build() { return null; }
        private void resetIfBuilt() {}
    }
}
