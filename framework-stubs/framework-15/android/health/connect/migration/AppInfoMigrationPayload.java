package android.health.connect.migration;

public final class AppInfoMigrationPayload extends android.health.connect.migration.MigrationPayload implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.migration.AppInfoMigrationPayload> CREATOR = null;
    AppInfoMigrationPayload() { super(); }
    @android.annotation.Nullable
    public byte[] getAppIcon() { return null; }
    @android.annotation.NonNull
    public java.lang.String getAppName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.health.connect.migration.AppInfoMigrationPayload build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.AppInfoMigrationPayload.Builder setAppIcon(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.AppInfoMigrationPayload.Builder setAppName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.AppInfoMigrationPayload.Builder setPackageName(java.lang.String p0) { return null; }
    }
}
