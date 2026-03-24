package android.app.appsearch;

public final class SetSchemaResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.SetSchemaResponse> CREATOR = null;
    SetSchemaResponse() {}
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDeletedTypes() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getIncompatibleTypes() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getMigratedTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.SetSchemaResponse.MigrationFailure> getMigrationFailures() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaResponse.Builder addDeletedType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaResponse.Builder addDeletedTypes(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaResponse.Builder addIncompatibleType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaResponse.Builder addIncompatibleTypes(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaResponse.Builder addMigratedType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaResponse.Builder addMigratedTypes(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaResponse.Builder addMigrationFailure(android.app.appsearch.SetSchemaResponse.MigrationFailure p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaResponse.Builder addMigrationFailures(java.util.Collection<android.app.appsearch.SetSchemaResponse.MigrationFailure> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SetSchemaResponse build() { return null; }
    }

    public static class MigrationFailure implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.appsearch.SetSchemaResponse.MigrationFailure> CREATOR = null;
        public MigrationFailure(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.app.appsearch.AppSearchResult<?> p3) {}
        public final int describeContents() { return 0; }
        @android.annotation.NonNull
        public android.app.appsearch.AppSearchResult<java.lang.Void> getAppSearchResult() { return null; }
        @android.annotation.NonNull
        public java.lang.String getDocumentId() { return null; }
        @android.annotation.NonNull
        public java.lang.String getNamespace() { return null; }
        @android.annotation.NonNull
        public java.lang.String getSchemaType() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
