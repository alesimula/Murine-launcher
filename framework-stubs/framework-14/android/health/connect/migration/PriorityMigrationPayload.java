package android.health.connect.migration;

public final class PriorityMigrationPayload extends android.health.connect.migration.MigrationPayload implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.migration.PriorityMigrationPayload> CREATOR = null;
    PriorityMigrationPayload() { super(); }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getDataCategory() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.DataOrigin> getDataOrigins() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.health.connect.migration.PriorityMigrationPayload.Builder setDataCategory(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.PriorityMigrationPayload.Builder addDataOrigin(android.health.connect.datatypes.DataOrigin p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.PriorityMigrationPayload build() { return null; }
    }
}
