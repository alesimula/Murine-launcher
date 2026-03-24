package android.health.connect.datatypes;

public final class BasalBodyTemperatureRecord extends android.health.connect.datatypes.InstantRecord {
    BasalBodyTemperatureRecord() { super(); }
    public int getMeasurementLocation() { return 0; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Temperature getTemperature() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, int p2, android.health.connect.datatypes.units.Temperature p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BasalBodyTemperatureRecord build() { return null; }
    }
}
