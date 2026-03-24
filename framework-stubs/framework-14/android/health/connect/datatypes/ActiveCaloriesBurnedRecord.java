package android.health.connect.datatypes;

public final class ActiveCaloriesBurnedRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Energy> ACTIVE_CALORIES_TOTAL = null;
    ActiveCaloriesBurnedRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Energy getEnergy() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, android.health.connect.datatypes.units.Energy p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ActiveCaloriesBurnedRecord build() { return null; }
    }
}
