package android.health.connect;

public final class LocalTimeRangeFilter implements android.health.connect.TimeRangeFilter {
    LocalTimeRangeFilter() {}
    @android.annotation.Nullable
    public java.time.LocalDateTime getStartTime() { return null; }
    @android.annotation.Nullable
    public java.time.LocalDateTime getEndTime() { return null; }
    @android.annotation.NonNull
    public boolean isBounded() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.health.connect.LocalTimeRangeFilter.Builder setStartTime(java.time.LocalDateTime p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.LocalTimeRangeFilter.Builder setEndTime(java.time.LocalDateTime p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.LocalTimeRangeFilter build() { return null; }
    }
}
