package android.app.appsearch;

public class SetSchemaResponse {
    private static final java.lang.String DELETED_TYPES_FIELD = "deletedTypes";
    private static final java.lang.String INCOMPATIBLE_TYPES_FIELD = "incompatibleTypes";
    private static final java.lang.String MIGRATED_TYPES_FIELD = "migratedTypes";
    private final android.os.Bundle mBundle = null;
    private final java.util.List<android.app.appsearch.SetSchemaResponse.MigrationFailure> mMigrationFailures = null;
    private java.util.Set<java.lang.String> mDeletedTypes;
    private java.util.Set<java.lang.String> mMigratedTypes;
    private java.util.Set<java.lang.String> mIncompatibleTypes;
    SetSchemaResponse(android.os.Bundle p0, java.util.List<android.app.appsearch.SetSchemaResponse.MigrationFailure> p1) {}
    SetSchemaResponse(android.os.Bundle p0) {}
    public android.os.Bundle getBundle() { return null; }
    public java.util.List<android.app.appsearch.SetSchemaResponse.MigrationFailure> getMigrationFailures() { return null; }
    public java.util.Set<java.lang.String> getDeletedTypes() { return null; }
    public java.util.Set<java.lang.String> getMigratedTypes() { return null; }
    public java.util.Set<java.lang.String> getIncompatibleTypes() { return null; }
    public android.app.appsearch.SetSchemaResponse.Builder toBuilder() { return null; }

    public static final class Builder {
        private java.util.List<android.app.appsearch.SetSchemaResponse.MigrationFailure> mMigrationFailures;
        private java.util.ArrayList<java.lang.String> mDeletedTypes;
        private java.util.ArrayList<java.lang.String> mMigratedTypes;
        private java.util.ArrayList<java.lang.String> mIncompatibleTypes;
        private boolean mBuilt;
        public Builder() {}
        public android.app.appsearch.SetSchemaResponse.Builder addMigrationFailures(java.util.Collection<android.app.appsearch.SetSchemaResponse.MigrationFailure> p0) { return null; }
        public android.app.appsearch.SetSchemaResponse.Builder addMigrationFailure(android.app.appsearch.SetSchemaResponse.MigrationFailure p0) { return null; }
        public android.app.appsearch.SetSchemaResponse.Builder addDeletedTypes(java.util.Collection<java.lang.String> p0) { return null; }
        public android.app.appsearch.SetSchemaResponse.Builder addDeletedType(java.lang.String p0) { return null; }
        public android.app.appsearch.SetSchemaResponse.Builder addIncompatibleTypes(java.util.Collection<java.lang.String> p0) { return null; }
        public android.app.appsearch.SetSchemaResponse.Builder addIncompatibleType(java.lang.String p0) { return null; }
        public android.app.appsearch.SetSchemaResponse.Builder addMigratedTypes(java.util.Collection<java.lang.String> p0) { return null; }
        public android.app.appsearch.SetSchemaResponse.Builder addMigratedType(java.lang.String p0) { return null; }
        public android.app.appsearch.SetSchemaResponse build() { return null; }
        private void resetIfBuilt() {}
    }

    public static class MigrationFailure {
        private static final java.lang.String SCHEMA_TYPE_FIELD = "schemaType";
        private static final java.lang.String NAMESPACE_FIELD = "namespace";
        private static final java.lang.String DOCUMENT_ID_FIELD = "id";
        private static final java.lang.String ERROR_MESSAGE_FIELD = "errorMessage";
        private static final java.lang.String RESULT_CODE_FIELD = "resultCode";
        private final android.os.Bundle mBundle = null;
        public MigrationFailure(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.appsearch.AppSearchResult<?> p3) {}
        MigrationFailure(android.os.Bundle p0) {}
        public android.os.Bundle getBundle() { return null; }
        public java.lang.String getNamespace() { return null; }
        public java.lang.String getDocumentId() { return null; }
        public java.lang.String getSchemaType() { return null; }
        public android.app.appsearch.AppSearchResult<java.lang.Void> getAppSearchResult() { return null; }
        public java.lang.String toString() { return null; }
    }
}
