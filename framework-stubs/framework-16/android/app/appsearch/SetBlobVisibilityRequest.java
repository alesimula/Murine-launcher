package android.app.appsearch;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
public class SetBlobVisibilityRequest {
    SetBlobVisibilityRequest() {}
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getNamespacesNotDisplayedBySystem() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.Set<android.app.appsearch.SchemaVisibilityConfig>> getNamespacesVisibleToConfigs() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.SetBlobVisibilityRequest.Builder addNamespaceVisibleToConfig(java.lang.String p0, android.app.appsearch.SchemaVisibilityConfig p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetBlobVisibilityRequest build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetBlobVisibilityRequest.Builder clearNamespaceVisibleToConfigs(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetBlobVisibilityRequest.Builder setNamespaceDisplayedBySystem(java.lang.String p0, boolean p1) { return null; }
    }
}
