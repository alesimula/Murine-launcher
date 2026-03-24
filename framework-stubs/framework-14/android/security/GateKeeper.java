package android.security;

public abstract class GateKeeper {
    public static final long INVALID_SECURE_USER_ID = 0L;
    public static android.service.gatekeeper.IGateKeeperService getService() { return null; }
    public static long getSecureUserId() throws java.lang.IllegalStateException { return 0L; }
}
