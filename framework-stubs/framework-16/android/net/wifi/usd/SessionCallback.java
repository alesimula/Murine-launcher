package android.net.wifi.usd;

@android.annotation.FlaggedApi("android.net.wifi.flags.usd")
public abstract class SessionCallback {
    public static final int FAILURE_MAX_SESSIONS_REACHED = 3;
    public static final int FAILURE_NOT_AVAILABLE = 2;
    public static final int FAILURE_TIMEOUT = 1;
    public static final int FAILURE_UNKNOWN = 0;
    public static final int TERMINATION_REASON_NOT_AVAILABLE = 1;
    public static final int TERMINATION_REASON_UNKNOWN = 0;
    public static final int TERMINATION_REASON_USER_INITIATED = 2;
    public SessionCallback() {}
    public void onMessageReceived(int p0, byte[] p1) {}
    public void onSessionTerminated(int p0) {}
}
