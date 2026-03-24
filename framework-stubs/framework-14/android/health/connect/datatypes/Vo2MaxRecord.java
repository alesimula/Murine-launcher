package android.health.connect.datatypes;

public final class Vo2MaxRecord extends android.health.connect.datatypes.InstantRecord {
    Vo2MaxRecord() { super(); }
    public int getMeasurementMethod() { return 0; }
    public double getVo2MillilitersPerMinuteKilogram() { return 0.0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, int p2, double p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.Vo2MaxRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Vo2MaxRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Vo2MaxRecord build() { return null; }
    }

    public static final class Vo2MaxMeasurementMethod {
        public static final int MEASUREMENT_METHOD_COOPER_TEST = 3;
        public static final int MEASUREMENT_METHOD_HEART_RATE_RATIO = 2;
        public static final int MEASUREMENT_METHOD_METABOLIC_CART = 1;
        public static final int MEASUREMENT_METHOD_MULTISTAGE_FITNESS_TEST = 4;
        public static final int MEASUREMENT_METHOD_OTHER = 0;
        public static final int MEASUREMENT_METHOD_ROCKPORT_FITNESS_TEST = 5;
        Vo2MaxMeasurementMethod() {}
    }
}
