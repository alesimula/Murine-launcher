package android.app.appsearch;

public final class GetByDocumentIdRequest implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.GetByDocumentIdRequest> CREATOR = null;
    public static final java.lang.String PROJECTION_SCHEMA_TYPE_WILDCARD = "*";
    GetByDocumentIdRequest() {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getIds() { return null; }
    @android.annotation.NonNull
    public java.lang.String getNamespace() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<android.app.appsearch.PropertyPath>> getProjectionPaths() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getProjections() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.app.appsearch.GetByDocumentIdRequest.Builder addIds(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetByDocumentIdRequest.Builder addIds(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetByDocumentIdRequest.Builder addProjection(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetByDocumentIdRequest.Builder addProjectionPaths(java.lang.String p0, java.util.Collection<android.app.appsearch.PropertyPath> p1) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.GetByDocumentIdRequest build() { return null; }
    }
}
