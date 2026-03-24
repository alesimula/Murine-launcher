package android.app;

public @interface ProcessStateEnum {
    public static final int UNKNOWN = -1;
    public static final int PERSISTENT = 0;
    public static final int PERSISTENT_UI = 1;
    public static final int TOP = 2;
    public static final int BOUND_TOP = 3;
    public static final int FOREGROUND_SERVICE = 4;
    public static final int BOUND_FOREGROUND_SERVICE = 5;
    public static final int IMPORTANT_FOREGROUND = 6;
    public static final int IMPORTANT_BACKGROUND = 7;
    public static final int TRANSIENT_BACKGROUND = 8;
    public static final int BACKUP = 9;
    public static final int SERVICE = 10;
    public static final int RECEIVER = 11;
    public static final int TOP_SLEEPING = 12;
    public static final int HEAVY_WEIGHT = 13;
    public static final int HOME = 14;
    public static final int LAST_ACTIVITY = 15;
    public static final int CACHED_ACTIVITY = 16;
    public static final int CACHED_ACTIVITY_CLIENT = 17;
    public static final int CACHED_RECENT = 18;
    public static final int CACHED_EMPTY = 19;
    public static final int NONEXISTENT = 20;
}
