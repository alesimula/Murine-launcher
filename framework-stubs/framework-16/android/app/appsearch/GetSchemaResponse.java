package android.app.appsearch;

public final class GetSchemaResponse implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.GetSchemaResponse> CREATOR = null;
    GetSchemaResponse() {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_set_publicly_visible_schema")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.app.appsearch.PackageIdentifier> getPubliclyVisibleSchemas() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Set<java.util.Set<java.lang.Integer>>> getRequiredPermissionsForSchemaTypeVisibility() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getSchemaTypesNotDisplayedBySystem() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_set_schema_visible_to_configs")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Set<android.app.appsearch.SchemaVisibilityConfig>> getSchemaTypesVisibleToConfigs() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Set<android.app.appsearch.PackageIdentifier>> getSchemaTypesVisibleToPackages() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.app.appsearch.AppSearchSchema> getSchemas() { return null; }
    public int getVersion() { return 0; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        public Builder(android.app.appsearch.GetSchemaResponse p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder addSchema(android.app.appsearch.AppSearchSchema p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder addSchemaTypeNotDisplayedBySystem(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse build() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder clearPubliclyVisibleSchema(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder clearRequiredPermissionsForSchemaTypeVisibility(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder clearSchemaTypeNotDisplayedBySystem(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder clearSchemaTypeVisibleToConfigs(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder clearSchemaTypeVisibleToPackages(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_additional_builder_copy_constructors")
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder clearSchemas() { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_set_publicly_visible_schema")
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder setPubliclyVisibleSchema(java.lang.String p0, android.app.appsearch.PackageIdentifier p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder setRequiredPermissionsForSchemaTypeVisibility(java.lang.String p0, java.util.Set<java.util.Set<java.lang.Integer>> p1) { return null; }
        @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_set_schema_visible_to_configs")
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder setSchemaTypeVisibleToConfigs(java.lang.String p0, java.util.Set<android.app.appsearch.SchemaVisibilityConfig> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder setSchemaTypeVisibleToPackages(java.lang.String p0, java.util.Set<android.app.appsearch.PackageIdentifier> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetSchemaResponse.Builder setVersion(int p0) { return null; }
    }
}
