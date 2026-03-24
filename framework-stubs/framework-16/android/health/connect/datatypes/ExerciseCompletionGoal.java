package android.health.connect.datatypes;

@android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
public abstract class ExerciseCompletionGoal {
    ExerciseCompletionGoal() {}

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class ActiveCaloriesBurnedGoal extends android.health.connect.datatypes.ExerciseCompletionGoal {
        public ActiveCaloriesBurnedGoal(android.health.connect.datatypes.units.Energy p0) { super(); }
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Energy getActiveCalories() { return null; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class DistanceGoal extends android.health.connect.datatypes.ExerciseCompletionGoal {
        public DistanceGoal(android.health.connect.datatypes.units.Length p0) { super(); }
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Length getDistance() { return null; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class DistanceWithVariableRestGoal extends android.health.connect.datatypes.ExerciseCompletionGoal {
        public DistanceWithVariableRestGoal(android.health.connect.datatypes.units.Length p0, java.time.Duration p1) { super(); }
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Length getDistance() { return null; }
        @android.annotation.NonNull
        public java.time.Duration getDuration() { return null; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class DurationGoal extends android.health.connect.datatypes.ExerciseCompletionGoal {
        public DurationGoal(java.time.Duration p0) { super(); }
        @android.annotation.NonNull
        public java.time.Duration getDuration() { return null; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class RepetitionsGoal extends android.health.connect.datatypes.ExerciseCompletionGoal {
        public RepetitionsGoal(int p0) { super(); }
        public int getRepetitions() { return 0; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class StepsGoal extends android.health.connect.datatypes.ExerciseCompletionGoal {
        public StepsGoal(int p0) { super(); }
        public int getSteps() { return 0; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class TotalCaloriesBurnedGoal extends android.health.connect.datatypes.ExerciseCompletionGoal {
        public TotalCaloriesBurnedGoal(android.health.connect.datatypes.units.Energy p0) { super(); }
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Energy getTotalCalories() { return null; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class UnknownGoal extends android.health.connect.datatypes.ExerciseCompletionGoal {
        @android.annotation.NonNull
        public static final android.health.connect.datatypes.ExerciseCompletionGoal.UnknownGoal INSTANCE = null;
        UnknownGoal() { super(); }
    }

    public static final class UnspecifiedGoal extends android.health.connect.datatypes.ExerciseCompletionGoal {
        @android.annotation.NonNull
        public static final android.health.connect.datatypes.ExerciseCompletionGoal.UnspecifiedGoal INSTANCE = null;
        UnspecifiedGoal() { super(); }
    }
}
