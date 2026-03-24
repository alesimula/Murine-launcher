package android.app.appsearch;

public final class RemoveByDocumentIdRequest {
    private final java.lang.String mNamespace = null;
    private final java.util.Set<java.lang.String> mIds = null;
    RemoveByDocumentIdRequest(java.lang.String p0, java.util.Set<java.lang.String> p1) {}
    public java.lang.String getNamespace() { return null; }
    public java.util.Set<java.lang.String> getIds() { return null; }

    public static final class Builder {
        private final java.lang.String mNamespace = null;
        private android.util.ArraySet<java.lang.String> mIds;
        private boolean mBuilt;
        public Builder(java.lang.String p0) {}
        public android.app.appsearch.RemoveByDocumentIdRequest.Builder addIds(java.lang.String... p0) { return null; }
        public android.app.appsearch.RemoveByDocumentIdRequest.Builder addIds(java.util.Collection<java.lang.String> p0) { return null; }
        public android.app.appsearch.RemoveByDocumentIdRequest build() { return null; }
        private void resetIfBuilt() {}
    }
}
