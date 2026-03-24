package android.security;

public class KeyStoreAuthorization {
    public static final int SYSTEM_ERROR = 4;
    public KeyStoreAuthorization() {}
    public static android.security.KeyStoreAuthorization getInstance() { return null; }
    public int addAuthToken(android.hardware.security.keymint.HardwareAuthToken p0) { return 0; }
    public int addAuthToken(byte[] p0) { return 0; }
    public int onDeviceUnlocked(int p0, byte[] p1) { return 0; }
    public int onDeviceLocked(int p0, long[] p1, boolean p2) { return 0; }
    public long getLastAuthTime(long p0, int[] p1) { return 0L; }
}
