package android.health.connect.datatypes;

public final class RestingHeartRateRecord extends android.health.connect.datatypes.InstantRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> BPM_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> BPM_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> BPM_MIN = null;
    RestingHeartRateRecord() { super(); }
    public long getBeatsPerMinute() { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, long p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.RestingHeartRateRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.RestingHeartRateRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.RestingHeartRateRecord build() { return null; }
    }
}
