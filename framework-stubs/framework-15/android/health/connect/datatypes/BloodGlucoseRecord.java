package android.health.connect.datatypes;

public final class BloodGlucoseRecord extends android.health.connect.datatypes.InstantRecord {
    BloodGlucoseRecord() { super(); }
    @android.annotation.NonNull
    public android.health.connect.datatypes.units.BloodGlucose getLevel() { return null; }
    public int getMealType() { return 0; }
    public int getRelationToMeal() { return 0; }
    public int getSpecimenSource() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, int p2, android.health.connect.datatypes.units.BloodGlucose p3, int p4, int p5) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.BloodGlucoseRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BloodGlucoseRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.BloodGlucoseRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
    }

    public static final class RelationToMealType {
        public static final int RELATION_TO_MEAL_AFTER_MEAL = 4;
        public static final int RELATION_TO_MEAL_BEFORE_MEAL = 3;
        public static final int RELATION_TO_MEAL_FASTING = 2;
        public static final int RELATION_TO_MEAL_GENERAL = 1;
        public static final int RELATION_TO_MEAL_UNKNOWN = 0;
        RelationToMealType() {}
    }

    public static final class SpecimenSource {
        public static final int SPECIMEN_SOURCE_CAPILLARY_BLOOD = 2;
        public static final int SPECIMEN_SOURCE_INTERSTITIAL_FLUID = 1;
        public static final int SPECIMEN_SOURCE_PLASMA = 3;
        public static final int SPECIMEN_SOURCE_SERUM = 4;
        public static final int SPECIMEN_SOURCE_TEARS = 5;
        public static final int SPECIMEN_SOURCE_UNKNOWN = 0;
        public static final int SPECIMEN_SOURCE_WHOLE_BLOOD = 6;
        SpecimenSource() {}
    }
}
