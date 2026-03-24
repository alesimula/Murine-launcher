package android.health.connect.datatypes;

public final class BodyTemperatureRecord extends android.health.connect.datatypes.InstantRecord {
    BodyTemperatureRecord() { super(); }
    public int getMeasurementLocation() { return 0; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Temperature getTemperature() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, int p2, android.health.connect.datatypes.units.Temperature p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.BodyTemperatureRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BodyTemperatureRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BodyTemperatureRecord build() { return null; }
    }
}
