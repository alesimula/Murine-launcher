package android.health.connect.datatypes;

public final class SkinTemperatureRecord extends android.health.connect.datatypes.IntervalRecord {
    public static final int MEASUREMENT_LOCATION_FINGER = 1;
    public static final int MEASUREMENT_LOCATION_TOE = 2;
    public static final int MEASUREMENT_LOCATION_UNKNOWN = 0;
    public static final int MEASUREMENT_LOCATION_WRIST = 3;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.TemperatureDelta> SKIN_TEMPERATURE_DELTA_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.TemperatureDelta> SKIN_TEMPERATURE_DELTA_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.TemperatureDelta> SKIN_TEMPERATURE_DELTA_MIN = null;
    SkinTemperatureRecord() { super(); }
    @android.annotation.Nullable
    public android.health.connect.datatypes.units.Temperature getBaseline() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.SkinTemperatureRecord.Delta> getDeltas() { return null; }
    public int getMeasurementLocation() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.SkinTemperatureRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SkinTemperatureRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SkinTemperatureRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SkinTemperatureRecord.Builder setBaseline(android.health.connect.datatypes.units.Temperature p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SkinTemperatureRecord.Builder setDeltas(java.util.List<android.health.connect.datatypes.SkinTemperatureRecord.Delta> p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SkinTemperatureRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SkinTemperatureRecord.Builder setMeasurementLocation(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SkinTemperatureRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }

    public static final class Delta {
        public Delta(android.health.connect.datatypes.units.TemperatureDelta p0, java.time.Instant p1) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.TemperatureDelta getDelta() { return null; }
        @android.annotation.NonNull
        public java.time.Instant getTime() { return null; }
    }
}
