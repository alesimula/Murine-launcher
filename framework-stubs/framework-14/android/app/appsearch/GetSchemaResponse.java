package android.app.appsearch;

public final class GetSchemaResponse {
    GetSchemaResponse() {}
    public int getVersion() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<android.app.appsearch.AppSearchSchema> getSchemas() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getSchemaTypesNotDisplayedBySystem() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Set<android.app.appsearch.PackageIdentifier>> getSchemaTypesVisibleToPackages() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Set<java.util.Set<java.lang.Integer>>> getRequiredPermissionsForSchemaTypeVisibility() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder setVersion(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder addSchema(android.app.appsearch.AppSearchSchema p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder addSchemaTypeNotDisplayedBySystem(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder setSchemaTypeVisibleToPackages(java.lang.String p0, java.util.Set<android.app.appsearch.PackageIdentifier> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder setRequiredPermissionsForSchemaTypeVisibility(java.lang.String p0, java.util.Set<java.util.Set<java.lang.Integer>> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse build() { return null; }
    }
}
