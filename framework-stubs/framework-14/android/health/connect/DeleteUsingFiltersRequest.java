package android.health.connect;

public final class DeleteUsingFiltersRequest {
    DeleteUsingFiltersRequest() {}
    @android.annotation.NonNull
    public java.util.Set<java.lang.Class<? extends android.health.connect.datatypes.Record>> getRecordTypes() { return null; }
    @android.annotation.Nullable
    public android.health.connect.TimeRangeFilter getTimeRangeFilter() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.health.connect.datatypes.DataOrigin> getDataOrigins() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.health.connect.DeleteUsingFiltersRequest.Builder addDataOrigin(android.health.connect.datatypes.DataOrigin p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.DeleteUsingFiltersRequest.Builder clearDataOrigins() { return null; }
        @android.annotation.NonNull
        public android.health.connect.DeleteUsingFiltersRequest.Builder setTimeRangeFilter(android.health.connect.TimeRangeFilter p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.DeleteUsingFiltersRequest.Builder addRecordType(java.lang.Class<? extends android.health.connect.datatypes.Record> p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.DeleteUsingFiltersRequest.Builder clearRecordTypes() { return null; }
        @android.annotation.NonNull
        public android.health.connect.DeleteUsingFiltersRequest build() { return null; }
    }
}
