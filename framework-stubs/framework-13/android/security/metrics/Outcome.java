package android.security.metrics;

public @interface Outcome {
    public static final int OUTCOME_UNSPECIFIED = 0;
    public static final int DROPPED = 1;
    public static final int SUCCESS = 2;
    public static final int ABORT = 3;
    public static final int PRUNED = 4;
    public static final int ERROR = 5;
}
