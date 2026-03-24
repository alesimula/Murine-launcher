package android.os;

public class RecoverySystem {
    public static final java.io.File BLOCK_MAP_FILE = null;
    public static final java.io.File UNCRYPT_PACKAGE_FILE = null;
    public static final java.io.File UNCRYPT_STATUS_FILE = null;
    public static final int RESUME_ON_REBOOT_REBOOT_ERROR_NONE = 0;
    @android.annotation.SystemApi
    public static final int RESUME_ON_REBOOT_REBOOT_ERROR_UNSPECIFIED = 1000;
    @android.annotation.SystemApi
    public static final int RESUME_ON_REBOOT_REBOOT_ERROR_INVALID_PACKAGE_NAME = 2000;
    @android.annotation.SystemApi
    public static final int RESUME_ON_REBOOT_REBOOT_ERROR_LSKF_NOT_CAPTURED = 3000;
    @android.annotation.SystemApi
    public static final int RESUME_ON_REBOOT_REBOOT_ERROR_SLOT_MISMATCH = 4000;
    @android.annotation.SystemApi
    public static final int RESUME_ON_REBOOT_REBOOT_ERROR_PROVIDER_PREPARATION_FAILURE = 5000;
    public static void verifyPackage(java.io.File p0, android.os.RecoverySystem.ProgressListener p1, java.io.File p2) throws java.io.IOException, java.security.GeneralSecurityException {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public static boolean verifyPackageCompatibility(java.io.File p0) throws java.io.IOException { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RECOVERY")
    public static void processPackage(android.content.Context p0, java.io.File p1, android.os.RecoverySystem.ProgressListener p2, android.os.Handler p3) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RECOVERY")
    public static void processPackage(android.content.Context p0, java.io.File p1, android.os.RecoverySystem.ProgressListener p2) throws java.io.IOException {}
    @android.annotation.RequiresPermission("android.permission.RECOVERY")
    public static void installPackage(android.content.Context p0, java.io.File p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RECOVERY")
    public static void installPackage(android.content.Context p0, java.io.File p1, boolean p2) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.RECOVERY", "android.permission.REBOOT"})
    public static void prepareForUnattendedUpdate(android.content.Context p0, java.lang.String p1, android.content.IntentSender p2) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.RECOVERY", "android.permission.REBOOT"})
    public static void clearPrepareForUnattendedUpdate(android.content.Context p0) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RECOVERY")
    public static void rebootAndApply(android.content.Context p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.RECOVERY", "android.permission.REBOOT"})
    public static boolean isPreparedForUnattendedUpdate(android.content.Context p0) throws java.io.IOException { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.RECOVERY", "android.permission.REBOOT"})
    @android.os.RecoverySystem.ResumeOnRebootRebootErrorCode
    public static int rebootAndApply(android.content.Context p0, java.lang.String p1, boolean p2) throws java.io.IOException { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RECOVERY")
    public static void scheduleUpdateOnBoot(android.content.Context p0, java.io.File p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RECOVERY")
    public static void cancelScheduledUpdate(android.content.Context p0) throws java.io.IOException {}
    public static void rebootWipeUserData(android.content.Context p0) throws java.io.IOException {}
    public static void rebootWipeUserData(android.content.Context p0, java.lang.String p1) throws java.io.IOException {}
    public static void rebootWipeUserData(android.content.Context p0, boolean p1) throws java.io.IOException {}
    public static void rebootWipeUserData(android.content.Context p0, boolean p1, java.lang.String p2, boolean p3) throws java.io.IOException {}
    public static void rebootWipeUserData(android.content.Context p0, boolean p1, java.lang.String p2, boolean p3, boolean p4) throws java.io.IOException {}
    public static boolean wipeEuiccData(android.content.Context p0, java.lang.String p1) { return false; }
    public static void rebootPromptAndWipeUserData(android.content.Context p0, java.lang.String p1) throws java.io.IOException {}
    public static void rebootWipeCache(android.content.Context p0) throws java.io.IOException {}
    public static void rebootWipeCache(android.content.Context p0, java.lang.String p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.RECOVERY", "android.permission.REBOOT"})
    public static void rebootWipeAb(android.content.Context p0, java.io.File p1, java.lang.String p2) throws java.io.IOException {}
    public static java.lang.String handleAftermath(android.content.Context p0) { return null; }
    public RecoverySystem() {}
    public RecoverySystem(android.os.IRecoverySystem p0) {}

    public static interface ProgressListener {
        public void onProgress(int p0);
    }

    public static @interface ResumeOnRebootRebootErrorCode {
    }
}
