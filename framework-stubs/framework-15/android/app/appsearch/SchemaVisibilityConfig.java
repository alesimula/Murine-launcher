package android.app.appsearch;

public final class SchemaVisibilityConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.SchemaVisibilityConfig> CREATOR = null;
    SchemaVisibilityConfig() {}
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.app.appsearch.PackageIdentifier> getAllowedPackages() { return null; }
    @android.annotation.Nullable
    public android.app.appsearch.PackageIdentifier getPubliclyVisibleTargetPackage() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.util.Set<java.lang.Integer>> getRequiredPermissions() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.SchemaVisibilityConfig.Builder addAllowedPackage(android.app.appsearch.PackageIdentifier p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SchemaVisibilityConfig.Builder addRequiredPermissions(java.util.Set<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SchemaVisibilityConfig build() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SchemaVisibilityConfig.Builder clearAllowedPackages() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SchemaVisibilityConfig.Builder clearRequiredPermissions() { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.SchemaVisibilityConfig.Builder setPubliclyVisibleTargetPackage(android.app.appsearch.PackageIdentifier p0) { return null; }
    }
}
