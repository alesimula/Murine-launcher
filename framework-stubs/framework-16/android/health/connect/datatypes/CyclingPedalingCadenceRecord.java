package android.health.connect.datatypes;

public final class CyclingPedalingCadenceRecord extends android.health.connect.datatypes.IntervalRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Double> RPM_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Double> RPM_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Double> RPM_MIN = null;
    CyclingPedalingCadenceRecord() { super(); }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample> getSamples() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, java.util.List<android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample> p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.CyclingPedalingCadenceRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder clearEndZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder clearStartZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }

    public static final class CyclingPedalingCadenceRecordSample {
        public CyclingPedalingCadenceRecordSample(double p0, java.time.Instant p1) {}
        public double getRevolutionsPerMinute() { return 0.0; }
        @android.annotation.NonNull
        public java.time.Instant getTime() { return null; }
    }
}
