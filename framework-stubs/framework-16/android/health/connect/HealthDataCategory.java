package android.health.connect;

public class HealthDataCategory {
    public static final int ACTIVITY = 1;
    public static final int BODY_MEASUREMENTS = 2;
    public static final int CYCLE_TRACKING = 3;
    public static final int NUTRITION = 4;
    public static final int SLEEP = 5;
    public static final int UNKNOWN = 0;
    public static final int VITALS = 6;
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.mindfulness")
    public static final int WELLNESS = 7;
    HealthDataCategory() {}
}
