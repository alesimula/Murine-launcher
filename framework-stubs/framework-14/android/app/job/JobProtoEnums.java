package android.app.job;

public final class JobProtoEnums {
    public static final int INTERNAL_STOP_REASON_UNKNOWN = -1;
    public static final int INTERNAL_STOP_REASON_CANCELLED = 0;
    public static final int INTERNAL_STOP_REASON_CONSTRAINTS_NOT_SATISFIED = 1;
    public static final int INTERNAL_STOP_REASON_PREEMPT = 2;
    public static final int INTERNAL_STOP_REASON_TIMEOUT = 3;
    public static final int INTERNAL_STOP_REASON_DEVICE_IDLE = 4;
    public static final int INTERNAL_STOP_REASON_DEVICE_THERMAL = 5;
    public static final int INTERNAL_STOP_REASON_RESTRICTED_BUCKET = 6;
    public static final int INTERNAL_STOP_REASON_UNINSTALL = 7;
    public static final int INTERNAL_STOP_REASON_DATA_CLEARED = 8;
    public static final int INTERNAL_STOP_REASON_RTC_UPDATED = 9;
    public static final int INTERNAL_STOP_REASON_SUCCESSFUL_FINISH = 10;
    public static final int INTERNAL_STOP_REASON_USER_UI_STOP = 11;
    public static final int INTERNAL_STOP_REASON_ANR = 12;
    public static final int STOP_REASON_UNDEFINED = 0;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_USER = 13;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public JobProtoEnums() {}
}
