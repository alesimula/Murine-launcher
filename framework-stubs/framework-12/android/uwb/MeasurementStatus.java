package android.uwb;

public @interface MeasurementStatus {
    public static final int SUCCESS = 0;
    public static final int FAILURE_OUT_OF_RANGE = 1;
    public static final int FAILURE_UNKNOWN = 2;
}
