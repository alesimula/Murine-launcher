package android.health.connect.datatypes;

public final class RespiratoryRateRecord extends android.health.connect.datatypes.InstantRecord {
    RespiratoryRateRecord() { super(); }
    public double getRate() { return 0.0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, double p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.RespiratoryRateRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.RespiratoryRateRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.RespiratoryRateRecord build() { return null; }
    }
}
