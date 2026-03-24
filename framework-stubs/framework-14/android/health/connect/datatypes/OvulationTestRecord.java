package android.health.connect.datatypes;

public final class OvulationTestRecord extends android.health.connect.datatypes.InstantRecord {
    OvulationTestRecord() { super(); }
    public int getResult() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, int p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.OvulationTestRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.OvulationTestRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.OvulationTestRecord build() { return null; }
    }

    public static final class OvulationTestResult {
        public static final int RESULT_HIGH = 2;
        public static final int RESULT_INCONCLUSIVE = 0;
        public static final int RESULT_NEGATIVE = 3;
        public static final int RESULT_POSITIVE = 1;
        OvulationTestResult() {}
    }
}
