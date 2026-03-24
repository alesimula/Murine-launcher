package android.uwb;

public @interface StateChangeReason {
    public static final int UNKNOWN = 0;
    public static final int SESSION_STARTED = 1;
    public static final int ALL_SESSIONS_CLOSED = 2;
    public static final int SYSTEM_POLICY = 3;
    public static final int SYSTEM_BOOT = 4;
}
