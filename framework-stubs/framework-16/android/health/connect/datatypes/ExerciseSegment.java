package android.health.connect.datatypes;

public final class ExerciseSegment {
    ExerciseSegment() {}
    @android.annotation.NonNull
    public java.time.Instant getEndTime() { return null; }
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
    public float getRateOfPerceivedExertion() { return 0.0f; }
    public int getRepetitionsCount() { return 0; }
    public int getSegmentType() { return 0; }
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
    public int getSetIndex() { return 0; }
    @android.annotation.NonNull
    public java.time.Instant getStartTime() { return null; }
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
    @android.annotation.Nullable
    public android.health.connect.datatypes.units.Mass getWeight() { return null; }
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
    public boolean hasRateOfPerceivedExertion() { return false; }
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
    public boolean hasSetIndex() { return false; }

    public static final class Builder {
        public Builder(java.time.Instant p0, java.time.Instant p1, int p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment build() { return null; }
        @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment.Builder clearRateOfPerceivedExertion() { return null; }
        @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment.Builder clearSetIndex() { return null; }
        @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment.Builder clearWeight() { return null; }
        @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment.Builder setRateOfPerceivedExertion(float p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment.Builder setRepetitionsCount(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment.Builder setSetIndex(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.healthfitness.flags.exercise_segment_improvements")
        @android.annotation.NonNull
        public android.health.connect.datatypes.ExerciseSegment.Builder setWeight(android.health.connect.datatypes.units.Mass p0) { return null; }
    }
}
