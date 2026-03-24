package android.anr;

public final class AnrProtoEnums {
    public static final int UNKNOWN_ANR_TYPE = 0;
    public static final int BROADCAST_OF_INTENT = 1;
    public static final int EXECUTING_SERVICE = 2;
    public static final int START_FOREGROUND_SERVICE = 3;
    public static final int INPUT_DISPATCHING_TIMEOUT_NO_FOCUSED_WINDOW = 4;
    public static final int INPUT_DISPATCHING_TIMEOUT = 5;
    public static final int CONTENT_PROVIDER_NOT_RESPONDING = 6;
    public static final int SHORT_FGS_TIMEOUT = 7;
    public static final int JOB_SERVICE = 8;
    public static final int FGS_TIMEOUT = 9;
    public AnrProtoEnums() {}
}
