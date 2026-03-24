package android.security;

public class AndroidKeyStoreMaintenance {
    private static final java.lang.String TAG = "AndroidKeyStoreMaintenance";
    public static final int SYSTEM_ERROR = 4;
    public static final int INVALID_ARGUMENT = 20;
    public static final int PERMISSION_DENIED = 6;
    public static final int KEY_NOT_FOUND = 7;
    public AndroidKeyStoreMaintenance() {}
    private static android.security.maintenance.IKeystoreMaintenance getService() { return null; }
    public static int onUserAdded(int p0) { return 0; }
    public static int onUserRemoved(int p0) { return 0; }
    public static int onUserPasswordChanged(int p0, byte[] p1) { return 0; }
    public static int clearNamespace(int p0, long p1) { return 0; }
    public static int getState(int p0) { return 0; }
    public static void onDeviceOffBody() {}
    public static int migrateKeyNamespace(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyDescriptor p1) { return 0; }
}
