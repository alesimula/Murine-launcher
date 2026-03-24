package android.health.connect.datatypes;

public final class ElevationGainedRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Length> ELEVATION_GAINED_TOTAL = null;
    ElevationGainedRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Length getElevation() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, android.health.connect.datatypes.units.Length p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.ElevationGainedRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ElevationGainedRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ElevationGainedRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ElevationGainedRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ElevationGainedRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}
