package android.app.appsearch;

public final class GetSchemaResponse {
    private static final java.lang.String VERSION_FIELD = "version";
    private static final java.lang.String SCHEMAS_FIELD = "schemas";
    private final android.os.Bundle mBundle = null;
    GetSchemaResponse(android.os.Bundle p0) {}
    public android.os.Bundle getBundle() { return null; }
    public int getVersion() { return 0; }
    public java.util.Set<android.app.appsearch.AppSearchSchema> getSchemas() { return null; }

    public static final class Builder {
        private int mVersion;
        private java.util.ArrayList<android.os.Bundle> mSchemaBundles;
        private boolean mBuilt;
        public Builder() {}
        public android.app.appsearch.GetSchemaResponse.Builder setVersion(int p0) { return null; }
        public android.app.appsearch.GetSchemaResponse.Builder addSchema(android.app.appsearch.AppSearchSchema p0) { return null; }
        public android.app.appsearch.GetSchemaResponse build() { return null; }
        private void resetIfBuilt() {}
    }
}
