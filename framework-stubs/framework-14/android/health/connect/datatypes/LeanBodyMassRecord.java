package android.health.connect.datatypes;

public final class LeanBodyMassRecord extends android.health.connect.datatypes.InstantRecord {
    LeanBodyMassRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.Mass getMass() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, android.health.connect.datatypes.units.Mass p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.LeanBodyMassRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.LeanBodyMassRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.LeanBodyMassRecord build() { return null; }
    }
}
