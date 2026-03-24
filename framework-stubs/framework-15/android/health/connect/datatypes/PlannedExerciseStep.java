package android.health.connect.datatypes;

public final class PlannedExerciseStep {
    public static final int EXERCISE_CATEGORY_ACTIVE = 3;
    public static final int EXERCISE_CATEGORY_COOLDOWN = 4;
    public static final int EXERCISE_CATEGORY_RECOVERY = 5;
    public static final int EXERCISE_CATEGORY_REST = 2;
    public static final int EXERCISE_CATEGORY_UNKNOWN = 0;
    public static final int EXERCISE_CATEGORY_WARMUP = 1;
    PlannedExerciseStep() {}
    @android.annotation.NonNull
    public android.health.connect.datatypes.ExerciseCompletionGoal getCompletionGoal() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getDescription() { return null; }
    public int getExerciseCategory() { return 0; }
    public int getExerciseType() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.ExercisePerformanceGoal> getPerformanceGoals() { return null; }

    public static final class Builder {
        public Builder(int p0, int p1, android.health.connect.datatypes.ExerciseCompletionGoal p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseStep.Builder addPerformanceGoal(android.health.connect.datatypes.ExercisePerformanceGoal p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseStep build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseStep.Builder clearPerformanceGoals() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseStep.Builder setCompletionGoal(android.health.connect.datatypes.ExerciseCompletionGoal p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseStep.Builder setDescription(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseStep.Builder setExerciseCategory(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseStep.Builder setExerciseType(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.PlannedExerciseStep.Builder setPerformanceGoals(java.util.List<android.health.connect.datatypes.ExercisePerformanceGoal> p0) { return null; }
    }
}
