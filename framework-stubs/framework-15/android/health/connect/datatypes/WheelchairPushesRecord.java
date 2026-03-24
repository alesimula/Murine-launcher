package android.health.connect.datatypes;

public final class WheelchairPushesRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> WHEEL_CHAIR_PUSHES_COUNT_TOTAL = null;
    WheelchairPushesRecord() { super(); }
    public long getCount() { return 0L; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, long p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.WheelchairPushesRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.WheelchairPushesRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.WheelchairPushesRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.WheelchairPushesRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.WheelchairPushesRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}
