package android.uwb;

public @interface RangingChangeReason {
    public static final int UNKNOWN = 0;
    public static final int LOCAL_API = 1;
    public static final int MAX_SESSIONS_REACHED = 2;
    public static final int SYSTEM_POLICY = 3;
    public static final int REMOTE_REQUEST = 4;
    public static final int PROTOCOL_SPECIFIC = 5;
    public static final int BAD_PARAMETERS = 6;
}
