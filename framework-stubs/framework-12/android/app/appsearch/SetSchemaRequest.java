package android.app.appsearch;

public final class SetSchemaRequest {
    private final java.util.Set<android.app.appsearch.AppSearchSchema> mSchemas = null;
    private final java.util.Set<java.lang.String> mSchemasNotDisplayedBySystem = null;
    private final java.util.Map<java.lang.String, java.util.Set<android.app.appsearch.PackageIdentifier>> mSchemasVisibleToPackages = null;
    private final java.util.Map<java.lang.String, android.app.appsearch.Migrator> mMigrators = null;
    private final boolean mForceOverride = false;
    private final int mVersion = 0;
    SetSchemaRequest(java.util.Set<android.app.appsearch.AppSearchSchema> p0, java.util.Set<java.lang.String> p1, java.util.Map<java.lang.String, java.util.Set<android.app.appsearch.PackageIdentifier>> p2, java.util.Map<java.lang.String, android.app.appsearch.Migrator> p3, boolean p4, int p5) {}
    public java.util.Set<android.app.appsearch.AppSearchSchema> getSchemas() { return null; }
    public java.util.Set<java.lang.String> getSchemasNotDisplayedBySystem() { return null; }
    public java.util.Map<java.lang.String, java.util.Set<android.app.appsearch.PackageIdentifier>> getSchemasVisibleToPackages() { return null; }
    public java.util.Map<java.lang.String, android.app.appsearch.Migrator> getMigrators() { return null; }
    public java.util.Map<java.lang.String, java.util.Set<android.app.appsearch.PackageIdentifier>> getSchemasVisibleToPackagesInternal() { return null; }
    public boolean isForceOverride() { return false; }
    public int getVersion() { return 0; }

    public static final class Builder {
        private static final int DEFAULT_VERSION = 1;
        private android.util.ArraySet<android.app.appsearch.AppSearchSchema> mSchemas;
        private android.util.ArraySet<java.lang.String> mSchemasNotDisplayedBySystem;
        private android.util.ArrayMap<java.lang.String, java.util.Set<android.app.appsearch.PackageIdentifier>> mSchemasVisibleToPackages;
        private android.util.ArrayMap<java.lang.String, android.app.appsearch.Migrator> mMigrators;
        private boolean mForceOverride;
        private int mVersion;
        private boolean mBuilt;
        public Builder() {}
        public android.app.appsearch.SetSchemaRequest.Builder addSchemas(android.app.appsearch.AppSearchSchema... p0) { return null; }
        public android.app.appsearch.SetSchemaRequest.Builder addSchemas(java.util.Collection<android.app.appsearch.AppSearchSchema> p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.app.appsearch.SetSchemaRequest.Builder setSchemaTypeDisplayedBySystem(java.lang.String p0, boolean p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.app.appsearch.SetSchemaRequest.Builder setSchemaTypeVisibilityForPackage(java.lang.String p0, boolean p1, android.app.appsearch.PackageIdentifier p2) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.app.appsearch.SetSchemaRequest.Builder setMigrator(java.lang.String p0, android.app.appsearch.Migrator p1) { return null; }
        public android.app.appsearch.SetSchemaRequest.Builder setMigrators(java.util.Map<java.lang.String, android.app.appsearch.Migrator> p0) { return null; }
        public android.app.appsearch.SetSchemaRequest.Builder setForceOverride(boolean p0) { return null; }
        public android.app.appsearch.SetSchemaRequest.Builder setVersion(int p0) { return null; }
        public android.app.appsearch.SetSchemaRequest build() { return null; }
        private void resetIfBuilt() {}
    }
}
