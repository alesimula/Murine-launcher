package android.health.connect;

public final class TimeInstantRangeFilter implements android.health.connect.TimeRangeFilter {
    TimeInstantRangeFilter() {}
    @android.annotation.Nullable
    public java.time.Instant getStartTime() { return null; }
    @android.annotation.Nullable
    public java.time.Instant getEndTime() { return null; }
    @android.annotation.NonNull
    public boolean isBounded() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.health.connect.TimeInstantRangeFilter.Builder setStartTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.TimeInstantRangeFilter.Builder setEndTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.TimeInstantRangeFilter build() { return null; }
    }
}
