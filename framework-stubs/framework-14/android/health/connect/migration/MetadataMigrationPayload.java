package android.health.connect.migration;

public final class MetadataMigrationPayload extends android.health.connect.migration.MigrationPayload implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.migration.MetadataMigrationPayload> CREATOR = null;
    MetadataMigrationPayload() { super(); }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getRecordRetentionPeriodDays() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.health.connect.migration.MetadataMigrationPayload.Builder setRecordRetentionPeriodDays(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.migration.MetadataMigrationPayload build() { return null; }
    }
}
