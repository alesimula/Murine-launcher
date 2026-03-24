package android.health.connect.datatypes;

public final class WeightRecord extends android.health.connect.datatypes.InstantRecord {
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Mass> WEIGHT_AVG = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Mass> WEIGHT_MAX = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<android.health.connect.datatypes.units.Mass> WEIGHT_MIN = null;
    WeightRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Mass getWeight() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, android.health.connect.datatypes.units.Mass p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.WeightRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.WeightRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.WeightRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}
