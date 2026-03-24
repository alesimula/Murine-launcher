package android.health.connect.datatypes;

public final class HydrationRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Volume> VOLUME_TOTAL = null;
    HydrationRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Volume getVolume() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, android.health.connect.datatypes.units.Volume p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.HydrationRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.HydrationRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.HydrationRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.HydrationRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.HydrationRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}
