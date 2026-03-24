package android.health.connect;

public final class AggregateRecordsRequest<T extends java.lang.Object> {
    AggregateRecordsRequest() {}
    @android.annotation.NonNull
    public android.health.connect.TimeRangeFilter getTimeRangeFilter() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.health.connect.datatypes.AggregationType<T>> getAggregationTypes() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.health.connect.datatypes.DataOrigin> getDataOriginsFilters() { return null; }

    public static final class Builder<T extends java.lang.Object> {
        public Builder(android.health.connect.TimeRangeFilter p0) {}
        @android.annotation.NonNull
        public android.health.connect.AggregateRecordsRequest.Builder<T> addAggregationType(android.health.connect.datatypes.AggregationType<T> p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.AggregateRecordsRequest.Builder<T> addDataOriginsFilter(android.health.connect.datatypes.DataOrigin p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.AggregateRecordsRequest<T> build() { return null; }
    }
}
