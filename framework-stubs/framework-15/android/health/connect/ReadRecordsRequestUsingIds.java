package android.health.connect;

public final class ReadRecordsRequestUsingIds<T extends android.health.connect.datatypes.Record> extends android.health.connect.ReadRecordsRequest<T> {
    ReadRecordsRequestUsingIds() { super(); }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.RecordIdFilter> getRecordIdFilters() { return null; }

    public static final class Builder<T extends android.health.connect.datatypes.Record> {
        public Builder(java.lang.Class<T> p0) {}
        @android.annotation.NonNull
        public android.health.connect.ReadRecordsRequestUsingIds.Builder<T> addClientRecordId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadRecordsRequestUsingIds.Builder<T> addId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadRecordsRequestUsingIds<T> build() { return null; }
    }
}
