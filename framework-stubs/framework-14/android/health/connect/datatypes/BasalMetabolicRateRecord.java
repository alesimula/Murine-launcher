package android.health.connect.datatypes;

public final class BasalMetabolicRateRecord extends android.health.connect.datatypes.InstantRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Energy> BASAL_CALORIES_TOTAL = null;
    BasalMetabolicRateRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Power getBasalMetabolicRate() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, android.health.connect.datatypes.units.Power p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.BasalMetabolicRateRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BasalMetabolicRateRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BasalMetabolicRateRecord build() { return null; }
    }
}
