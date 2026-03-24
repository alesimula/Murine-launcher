package android.health.connect.datatypes;

public final class HeartRateRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> BPM_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> BPM_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> BPM_MIN = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> HEART_MEASUREMENTS_COUNT = null;
    HeartRateRecord() { super(); }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.HeartRateRecord.HeartRateSample> getSamples() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, java.util.List<android.health.connect.datatypes.HeartRateRecord.HeartRateSample> p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.HeartRateRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.HeartRateRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.HeartRateRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.HeartRateRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.HeartRateRecord build() { return null; }
    }

    public static final class HeartRateSample {
        public HeartRateSample(long p0, java.time.Instant p1) {}
        public long getBeatsPerMinute() { return 0L; }
        @android.annotation.NonNull
        public java.time.Instant getTime() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
