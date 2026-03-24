package android.health.connect.migration;

public final class PermissionMigrationPayload extends android.health.connect.migration.MigrationPayload implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.migration.PermissionMigrationPayload> CREATOR = null;
    PermissionMigrationPayload() { super(); }
    @android.annotation.NonNull
    public java.time.Instant getFirstGrantTime() { return null; }
    @android.annotation.NonNull
    public java.lang.String getHoldingPackageName() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getPermissions() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.time.Instant p1) {}
        @android.annotation.NonNull
        public android.health.connect.migration.PermissionMigrationPayload.Builder addPermission(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.PermissionMigrationPayload build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.PermissionMigrationPayload.Builder setFirstGrantTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.PermissionMigrationPayload.Builder setHoldingPackageName(java.lang.String p0) { return null; }
    }
}
