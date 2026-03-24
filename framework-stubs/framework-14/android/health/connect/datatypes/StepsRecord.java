package android.health.connect.datatypes;

public final class StepsRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> STEPS_COUNT_TOTAL = null;
    StepsRecord() { super(); }
    public long getCount() { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, long p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsRecord build() { return null; }
    }
}
