package android.health.connect.datatypes;

public final class DistanceRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Length> DISTANCE_TOTAL = null;
    DistanceRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Length getDistance() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, android.health.connect.datatypes.units.Length p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.DistanceRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.DistanceRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.DistanceRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.DistanceRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.DistanceRecord build() { return null; }
    }
}
