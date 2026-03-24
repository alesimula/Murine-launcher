package android.health.connect.datatypes;

public final class BodyFatRecord extends android.health.connect.datatypes.InstantRecord {
    BodyFatRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Percentage getPercentage() { return null; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, android.health.connect.datatypes.units.Percentage p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.BodyFatRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BodyFatRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BodyFatRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}
