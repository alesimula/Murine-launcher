package android.health.connect.datatypes;

public final class SpeedRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Velocity> SPEED_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Velocity> SPEED_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Velocity> SPEED_MIN = null;
    SpeedRecord() { super(); }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.SpeedRecord.SpeedRecordSample> getSamples() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, java.util.List<android.health.connect.datatypes.SpeedRecord.SpeedRecordSample> p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.SpeedRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SpeedRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SpeedRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SpeedRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SpeedRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }

    public static final class SpeedRecordSample {
        public SpeedRecordSample(android.health.connect.datatypes.units.Velocity p0, java.time.Instant p1) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Velocity getSpeed() { return null; }
        @android.annotation.NonNull
        public java.time.Instant getTime() { return null; }
    }
}
