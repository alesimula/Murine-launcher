package android.health.connect.datatypes;

public final class HeightRecord extends android.health.connect.datatypes.InstantRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Length> HEIGHT_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Length> HEIGHT_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Length> HEIGHT_MIN = null;
    HeightRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Length getHeight() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, android.health.connect.datatypes.units.Length p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.HeightRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.HeightRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.HeightRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}
