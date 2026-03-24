package android.health.connect.datatypes;

public final class BloodPressureRecord extends android.health.connect.datatypes.InstantRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Pressure> DIASTOLIC_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Pressure> DIASTOLIC_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Pressure> DIASTOLIC_MIN = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Pressure> SYSTOLIC_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Pressure> SYSTOLIC_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Pressure> SYSTOLIC_MIN = null;
    BloodPressureRecord() { super(); }
    public int getBodyPosition() { return 0; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Pressure getDiastolic() { return null; }
    public int getMeasurementLocation() { return 0; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Pressure getSystolic() { return null; }

    public static final class BloodPressureMeasurementLocation {
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_LEFT_UPPER_ARM = 3;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_LEFT_WRIST = 1;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_RIGHT_UPPER_ARM = 4;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_RIGHT_WRIST = 2;
        public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_UNKNOWN = 0;
        BloodPressureMeasurementLocation() {}
    }

    public static final class BodyPosition {
        public static final int BODY_POSITION_LYING_DOWN = 3;
        public static final int BODY_POSITION_RECLINING = 4;
        public static final int BODY_POSITION_SITTING_DOWN = 2;
        public static final int BODY_POSITION_STANDING_UP = 1;
        public static final int BODY_POSITION_UNKNOWN = 0;
        BodyPosition() {}
    }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, int p2, android.health.connect.datatypes.units.Pressure p3, android.health.connect.datatypes.units.Pressure p4, int p5) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.BloodPressureRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BloodPressureRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BloodPressureRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}
