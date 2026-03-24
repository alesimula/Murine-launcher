package android.app.appsearch;

public final class SetSchemaRequest {
    public static final int READ_ASSISTANT_APP_SEARCH_DATA = 6;
    public static final int READ_CALENDAR = 2;
    public static final int READ_CONTACTS = 3;
    public static final int READ_EXTERNAL_STORAGE = 4;
    public static final int READ_HOME_APP_SEARCH_DATA = 5;
    public static final int READ_SMS = 1;
    SetSchemaRequest() {}
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.app.appsearch.Migrator> getMigrators() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.app.appsearch.PackageIdentifier> getPubliclyVisibleSchemas() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Set<java.util.Set<java.lang.Integer>>> getRequiredPermissionsForSchemaTypeVisibility() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.app.appsearch.AppSearchSchema> getSchemas() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getSchemasNotDisplayedBySystem() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Set<android.app.appsearch.SchemaVisibilityConfig>> getSchemasVisibleToConfigs() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Set<android.app.appsearch.PackageIdentifier>> getSchemasVisibleToPackages() { return null; }
    public int getVersion() { return 0; }
    public boolean isForceOverride() { return false; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder addRequiredPermissionsForSchemaTypeVisibility(java.lang.String p0, java.util.Set<java.lang.Integer> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder addSchemaTypeVisibleToConfig(java.lang.String p0, android.app.appsearch.SchemaVisibilityConfig p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder addSchemas(android.app.appsearch.AppSearchSchema... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder addSchemas(java.util.Collection<android.app.appsearch.AppSearchSchema> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder clearRequiredPermissionsForSchemaTypeVisibility(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder clearSchemaTypeVisibleToConfigs(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder setForceOverride(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder setMigrator(java.lang.String p0, android.app.appsearch.Migrator p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder setMigrators(java.util.Map<java.lang.String, android.app.appsearch.Migrator> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder setPubliclyVisibleSchema(java.lang.String p0, android.app.appsearch.PackageIdentifier p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder setSchemaTypeDisplayedBySystem(java.lang.String p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder setSchemaTypeVisibilityForPackage(java.lang.String p0, boolean p1, android.app.appsearch.PackageIdentifier p2) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaRequest.Builder setVersion(int p0) { return null; }
    }
}
