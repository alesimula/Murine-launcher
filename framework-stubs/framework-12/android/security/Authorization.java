package android.security;

public class Authorization {
    private static final java.lang.String TAG = "KeystoreAuthorization";
    public static final int SYSTEM_ERROR = 4;
    public Authorization() {}
    private static android.security.authorization.IKeystoreAuthorization getService() { return null; }
    public static int addAuthToken(android.hardware.security.keymint.HardwareAuthToken p0) { return 0; }
    public static int addAuthToken(byte[] p0) { return 0; }
    public static int onLockScreenEvent(boolean p0, int p1, byte[] p2, long[] p3) { return 0; }
}
