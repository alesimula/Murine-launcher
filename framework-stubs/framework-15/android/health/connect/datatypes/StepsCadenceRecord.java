package android.health.connect.datatypes;

public final class StepsCadenceRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Double> STEPS_CADENCE_RATE_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Double> STEPS_CADENCE_RATE_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Double> STEPS_CADENCE_RATE_MIN = null;
    StepsCadenceRecord() { super(); }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample> getSamples() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, java.util.List<android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample> p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsCadenceRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsCadenceRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsCadenceRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsCadenceRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsCadenceRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }

    public static final class StepsCadenceRecordSample {
        public StepsCadenceRecordSample(double p0, java.time.Instant p1) {}
        public double getRate() { return 0.0; }
        @android.annotation.NonNull
        public java.time.Instant getTime() { return null; }
    }
}
