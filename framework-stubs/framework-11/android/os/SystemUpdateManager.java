package android.os;

@android.annotation.SystemApi
public class SystemUpdateManager {
    private static final java.lang.String TAG = "SystemUpdateManager";
    public static final java.lang.String KEY_STATUS = "status";
    public static final java.lang.String KEY_TITLE = "title";
    public static final java.lang.String KEY_IS_SECURITY_UPDATE = "is_security_update";
    public static final java.lang.String KEY_TARGET_BUILD_FINGERPRINT = "target_build_fingerprint";
    public static final java.lang.String KEY_TARGET_SECURITY_PATCH_LEVEL = "target_security_patch_level";
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_IDLE = 1;
    public static final int STATUS_WAITING_DOWNLOAD = 2;
    public static final int STATUS_IN_PROGRESS = 3;
    public static final int STATUS_WAITING_INSTALL = 4;
    public static final int STATUS_WAITING_REBOOT = 5;
    private final android.os.ISystemUpdateManager mService = null;
    public SystemUpdateManager(android.os.ISystemUpdateManager p0) {}
    public android.os.Bundle retrieveSystemUpdateInfo() { return null; }
    public void updateSystemUpdateInfo(android.os.PersistableBundle p0) {}
}
