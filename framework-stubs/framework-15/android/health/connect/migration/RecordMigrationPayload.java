package android.health.connect.migration;

public final class RecordMigrationPayload extends android.health.connect.migration.MigrationPayload implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.migration.RecordMigrationPayload> CREATOR = null;
    RecordMigrationPayload() { super(); }
    @android.annotation.NonNull
    public java.lang.String getOriginAppName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getOriginPackageName() { return null; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.Record getRecord() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1, android.health.connect.datatypes.Record p2) {}
        @android.annotation.NonNull
        public android.health.connect.migration.RecordMigrationPayload build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.RecordMigrationPayload.Builder setOriginAppName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.RecordMigrationPayload.Builder setOriginPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.RecordMigrationPayload.Builder setRecord(android.health.connect.datatypes.Record p0) { return null; }
    }
}
