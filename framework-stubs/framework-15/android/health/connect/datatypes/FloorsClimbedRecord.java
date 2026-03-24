package android.health.connect.datatypes;

public final class FloorsClimbedRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Double> FLOORS_CLIMBED_TOTAL = null;
    FloorsClimbedRecord() { super(); }
    public double getFloors() { return 0.0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, double p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.FloorsClimbedRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.FloorsClimbedRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.FloorsClimbedRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.FloorsClimbedRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.FloorsClimbedRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}
