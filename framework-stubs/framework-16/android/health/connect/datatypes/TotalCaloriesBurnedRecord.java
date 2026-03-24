package android.health.connect.datatypes;

public final class TotalCaloriesBurnedRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Energy> ENERGY_TOTAL = null;
    TotalCaloriesBurnedRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Energy getEnergy() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, android.health.connect.datatypes.units.Energy p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.TotalCaloriesBurnedRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}
