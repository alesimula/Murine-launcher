package android.hardware.contexthub;

public @interface ErrorCode {
    public static final byte OK = 0;
    public static final byte TRANSIENT_ERROR = 1;
    public static final byte PERMANENT_ERROR = 2;
    public static final byte PERMISSION_DENIED = 3;
    public static final byte DESTINATION_NOT_FOUND = 4;
}
