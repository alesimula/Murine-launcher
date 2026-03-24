package android.health.connect.datatypes;

@android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
public abstract class ExercisePerformanceGoal {
    ExercisePerformanceGoal() {}

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class AmrapGoal extends android.health.connect.datatypes.ExercisePerformanceGoal {
        @android.annotation.NonNull
        public static final android.health.connect.datatypes.ExercisePerformanceGoal.AmrapGoal INSTANCE = null;
        AmrapGoal() { super(); }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class CadenceGoal extends android.health.connect.datatypes.ExercisePerformanceGoal {
        public CadenceGoal(double p0, double p1) { super(); }
        public double getMaxRpm() { return 0.0; }
        public double getMinRpm() { return 0.0; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class HeartRateGoal extends android.health.connect.datatypes.ExercisePerformanceGoal {
        public HeartRateGoal(int p0, int p1) { super(); }
        public int getMaxBpm() { return 0; }
        public int getMinBpm() { return 0; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class PowerGoal extends android.health.connect.datatypes.ExercisePerformanceGoal {
        public PowerGoal(android.health.connect.datatypes.units.Power p0, android.health.connect.datatypes.units.Power p1) { super(); }
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Power getMaxPower() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Power getMinPower() { return null; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class RateOfPerceivedExertionGoal extends android.health.connect.datatypes.ExercisePerformanceGoal {
        public RateOfPerceivedExertionGoal(int p0) { super(); }
        public int getRpe() { return 0; }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class SpeedGoal extends android.health.connect.datatypes.ExercisePerformanceGoal {
        public SpeedGoal(android.health.connect.datatypes.units.Velocity p0, android.health.connect.datatypes.units.Velocity p1) { super(); }
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Velocity getMaxSpeed() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Velocity getMinSpeed() { return null; }
    }

    public static final class UnknownGoal extends android.health.connect.datatypes.ExercisePerformanceGoal {
        @android.annotation.NonNull
        public static final android.health.connect.datatypes.ExercisePerformanceGoal.UnknownGoal INSTANCE = null;
        UnknownGoal() { super(); }
    }

    @android.annotation.FlaggedApi("com.android.healthconnect.flags.training_plans")
    public static final class WeightGoal extends android.health.connect.datatypes.ExercisePerformanceGoal {
        public WeightGoal(android.health.connect.datatypes.units.Mass p0) { super(); }
        @android.annotation.NonNull
        public android.health.connect.datatypes.units.Mass getMass() { return null; }
    }
}
