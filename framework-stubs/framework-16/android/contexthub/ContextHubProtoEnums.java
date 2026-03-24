package android.contexthub;

public final class ContextHubProtoEnums {
    public static final int TRANSACTION_RESULT_SUCCESS = 0;
    public static final int TRANSACTION_RESULT_FAILED_UNKNOWN = 1;
    public static final int TRANSACTION_RESULT_FAILED_BAD_PARAMS = 2;
    public static final int TRANSACTION_RESULT_FAILED_UNINITIALIZED = 3;
    public static final int TRANSACTION_RESULT_FAILED_BUSY = 4;
    public static final int TRANSACTION_RESULT_FAILED_AT_HUB = 5;
    public static final int TRANSACTION_RESULT_FAILED_TIMEOUT = 6;
    public static final int TRANSACTION_RESULT_FAILED_SERVICE_INTERNAL_FAILURE = 7;
    public static final int TRANSACTION_RESULT_FAILED_HAL_UNAVAILABLE = 8;
    public static final int SIGNIFICANT_MOTION_UNKNOWN = 0;
    public static final int SIGNIFICANT_MOTION_STATIC_LOCATION = 1;
    public static final int SIGNIFICANT_MOTION_LOW_MOBILITY = 2;
    public static final int SIGNIFICANT_MOTION_HIGH_MOBILITY = 3;
    public ContextHubProtoEnums() {}
}
