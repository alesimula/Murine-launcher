package android.app.appfunctions;

@android.annotation.FlaggedApi("android.app.appfunctions.flags.enable_app_function_manager")
public class AppFunctionRuntimeMetadata extends android.app.appsearch.GenericDocument {
    public static final java.lang.String RUNTIME_SCHEMA_TYPE = "AppFunctionRuntimeMetadata";
    public static final java.lang.String APP_FUNCTION_INDEXER_PACKAGE = "android";
    public static final java.lang.String APP_FUNCTION_RUNTIME_METADATA_DB = "appfunctions-db";
    public static final java.lang.String APP_FUNCTION_RUNTIME_NAMESPACE = "app_functions_runtime";
    public static final java.lang.String PROPERTY_FUNCTION_ID = "functionId";
    public static final java.lang.String PROPERTY_PACKAGE_NAME = "packageName";
    public static final java.lang.String PROPERTY_ENABLED = "enabled";
    public static final java.lang.String PROPERTY_APP_FUNCTION_STATIC_METADATA_QUALIFIED_ID = "appFunctionStaticMetadataQualifiedId";
    public AppFunctionRuntimeMetadata(android.app.appsearch.GenericDocument p0) { super(null); }
    public static java.lang.String getRuntimeSchemaNameForPackage(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String getPackageNameFromSchema(java.lang.String p0) { return null; }
    public static java.lang.String getDocumentIdForAppFunction(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public static android.app.appsearch.AppSearchSchema createAppFunctionRuntimeSchema(java.lang.String p0) { return null; }
    public static android.app.appsearch.AppSearchSchema createParentAppFunctionRuntimeSchema() { return null; }
    @android.annotation.NonNull
    public java.lang.String getFunctionId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public int getEnabled() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getAppFunctionStaticMetadataQualifiedId() { return null; }

    public static final class Builder extends android.app.appsearch.GenericDocument.Builder<android.app.appfunctions.AppFunctionRuntimeMetadata.Builder> {
        public Builder(java.lang.String p0, java.lang.String p1) { super((android.app.appsearch.GenericDocument)null); }
        public Builder(android.app.appfunctions.AppFunctionRuntimeMetadata p0) { super((android.app.appsearch.GenericDocument)null); }
        @android.annotation.NonNull
        public android.app.appfunctions.AppFunctionRuntimeMetadata.Builder setEnabled(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.appfunctions.AppFunctionRuntimeMetadata build() { return null; }
    }
}
