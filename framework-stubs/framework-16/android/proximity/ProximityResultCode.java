package android.proximity;

public @interface ProximityResultCode {
    public static final int SUCCESS = 0;
    public static final int OUT_OF_RANGE = 1;
    public static final int NO_ASSOCIATED_DEVICE = 2;
    public static final int PRIMARY_DEVICE_BT_ADAPTER_OFF = 3;
    public static final int NO_CONNECTED_ASSOCIATED_DEVICE = 4;
    public static final int NO_RANGING_RESULT = 5;
    public static final int REQUEST_TIMED_OUT = 6;
    public static final int ASSOCIATED_DEVICE_NOT_ELIGIBLE = 7;
    public static final int INVALID_RANGING_METHODS = 8;
    public static final int RANGING_RESTRICTED_AVAILABILITY = 9;
    public static final int RANGING_RESTRICTED_AIRPLANE_MODE = 10;
    public static final int PRIMARY_DEVICE_RANGING_TURNED_OFF = 11;
    public static final int PRIMARY_DEVICE_RANGING_FAILED_TO_START = 12;
    public static final int PRIMARY_DEVICE_RANGING_ALREADY_RUNNING = 13;
    public static final int PRIMARY_DEVICE_MAX_RETRY_REACHED = 14;
    public static final int PRIMARY_DEVICE_RANGING_UNAVAILABLE = 15;
    public static final int ASSOCIATED_DEVICE_RANGING_FAILED_TO_START = 16;
    public static final int ASSOCIATED_DEVICE_RANGING_ALREADY_RUNNING = 17;
    public static final int ASSOCIATED_DEVICE_RANGING_TURNED_OFF = 18;
    public static final int ASSOCIATED_DEVICE_MAX_RETRY_REACHED = 19;
    public static final int ASSOCIATED_DEVICE_RANGING_UNAVAILABLE = 20;
    public static final int INVALID_PARAMETERS = 21;
    public static final int REQUEST_CANCELLED = 22;
    public static final int UNKNOWN = 23;
    public static final int PRIMARY_DEVICE_RANGING_NOT_SUPPORTED = 24;
    public static final int ASSOCIATED_DEVICE_RANGING_NOT_SUPPORTED = 25;
}
