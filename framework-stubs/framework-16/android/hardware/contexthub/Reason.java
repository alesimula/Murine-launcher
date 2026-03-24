package android.hardware.contexthub;

public @interface Reason {
    public static final byte UNSPECIFIED = 0;
    public static final byte OUT_OF_MEMORY = 1;
    public static final byte TIMEOUT = 2;
    public static final byte OPEN_ENDPOINT_SESSION_REQUEST_REJECTED = 3;
    public static final byte CLOSE_ENDPOINT_SESSION_REQUESTED = 4;
    public static final byte ENDPOINT_INVALID = 5;
    public static final byte ENDPOINT_GONE = 6;
    public static final byte ENDPOINT_CRASHED = 7;
    public static final byte HUB_RESET = 8;
    public static final byte PERMISSION_DENIED = 9;
}
