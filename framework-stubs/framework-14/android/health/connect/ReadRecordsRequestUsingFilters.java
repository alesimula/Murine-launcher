package android.health.connect;

public final class ReadRecordsRequestUsingFilters<T extends android.health.connect.datatypes.Record> extends android.health.connect.ReadRecordsRequest<T> {
    ReadRecordsRequestUsingFilters() { super(); }
    @android.annotation.Nullable
    public android.health.connect.TimeRangeFilter getTimeRangeFilter() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.health.connect.datatypes.DataOrigin> getDataOrigins() { return null; }
    public int getPageSize() { return 0; }
    public long getPageToken() { return 0L; }
    public boolean isAscending() { return false; }

    public static final class Builder<T extends android.health.connect.datatypes.Record> {
        public Builder(java.lang.Class<T> p0) {}
        @android.annotation.NonNull
        public android.health.connect.ReadRecordsRequestUsingFilters.Builder<T> addDataOrigins(android.health.connect.datatypes.DataOrigin p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadRecordsRequestUsingFilters.Builder<T> setTimeRangeFilter(android.health.connect.TimeRangeFilter p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadRecordsRequestUsingFilters.Builder<T> setPageSize(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadRecordsRequestUsingFilters.Builder<T> setPageToken(long p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadRecordsRequestUsingFilters.Builder<T> setAscending(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.ReadRecordsRequestUsingFilters<T> build() { return null; }
    }
}
