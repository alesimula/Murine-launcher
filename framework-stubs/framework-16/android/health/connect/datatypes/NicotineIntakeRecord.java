package android.health.connect.datatypes;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.smoking")
public final class NicotineIntakeRecord extends android.health.connect.datatypes.IntervalRecord {
    public static final int NICOTINE_INTAKE_TYPE_CIGARETTE = 1;
    public static final int NICOTINE_INTAKE_TYPE_VAPE = 0;
    NicotineIntakeRecord() { super(); }
    @android.annotation.Nullable
    public android.health.connect.datatypes.units.Mass getNicotineIntake() { return null; }
    public int getNicotineIntakeType() { return 0; }
    public int getQuantity() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, int p3, int p4) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.NicotineIntakeRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.NicotineIntakeRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.NicotineIntakeRecord.Builder setNicotineIntake(android.health.connect.datatypes.units.Mass p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.NicotineIntakeRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}
