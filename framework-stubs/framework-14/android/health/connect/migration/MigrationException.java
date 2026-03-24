package android.health.connect.migration;

public final class MigrationException extends java.lang.RuntimeException implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.migration.MigrationException> CREATOR = null;
    public static final int ERROR_INTERNAL = 1;
    public static final int ERROR_MIGRATE_ENTITY = 2;
    public static final int ERROR_MIGRATION_UNAVAILABLE = 3;
    public MigrationException(java.lang.String p0, int p1, java.lang.String p2) { super(); }
    public int getErrorCode() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getFailedEntityId() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
