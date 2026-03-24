package android.health.connect.datatypes;

public final class StepsCadenceRecord extends android.health.connect.datatypes.IntervalRecord {
    StepsCadenceRecord() { super(); }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample> getSamples() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, java.util.List<android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample> p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsCadenceRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsCadenceRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsCadenceRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsCadenceRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.StepsCadenceRecord build() { return null; }
    }

    public static final class StepsCadenceRecordSample {
        public StepsCadenceRecordSample(double p0, java.time.Instant p1) {}
        public double getRate() { return 0.0; }
        @android.annotation.NonNull
        public java.time.Instant getTime() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
