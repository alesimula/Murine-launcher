package android.health.connect.datatypes;

public final class PowerRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Power> POWER_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Power> POWER_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Power> POWER_MIN = null;
    PowerRecord() { super(); }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.PowerRecord.PowerRecordSample> getSamples() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class PowerRecordSample {
        public PowerRecordSample(android.health.connect.datatypes.units.Power p0, java.time.Instant p1) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Power getPower() { return null; }
        @android.annotation.NonNull
        public java.time.Instant getTime() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, java.util.List<android.health.connect.datatypes.PowerRecord.PowerRecordSample> p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.PowerRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PowerRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PowerRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PowerRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PowerRecord build() { return null; }
    }
}
