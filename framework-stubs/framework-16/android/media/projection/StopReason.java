package android.media.projection;

public @interface StopReason {
    public static final int STOP_UNKNOWN = 0;
    public static final int STOP_HOST_APP = 1;
    public static final int STOP_TARGET_REMOVED = 2;
    public static final int STOP_DEVICE_LOCKED = 3;
    public static final int STOP_PRIVACY_CHIP = 4;
    public static final int STOP_QS_TILE = 5;
    public static final int STOP_USER_SWITCH = 6;
    public static final int STOP_FOREGROUND_SERVICE_CHANGE = 7;
    public static final int STOP_NEW_PROJECTION = 8;
    public static final int STOP_NEW_MEDIA_ROUTE = 9;
    public static final int STOP_ERROR = 10;
}
