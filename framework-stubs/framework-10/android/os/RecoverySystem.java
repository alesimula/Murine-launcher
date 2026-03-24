package android.os;

public class RecoverySystem {
    private static final java.lang.String TAG = "RecoverySystem";
    private static final java.io.File DEFAULT_KEYSTORE = null;
    private static final long PUBLISH_PROGRESS_INTERVAL_MS = 500L;
    private static final long DEFAULT_EUICC_FACTORY_RESET_TIMEOUT_MILLIS = 30000L;
    private static final long MIN_EUICC_FACTORY_RESET_TIMEOUT_MILLIS = 5000L;
    private static final long MAX_EUICC_FACTORY_RESET_TIMEOUT_MILLIS = 60000L;
    private static final long DEFAULT_EUICC_REMOVING_INVISIBLE_PROFILES_TIMEOUT_MILLIS = 45000L;
    private static final long MIN_EUICC_REMOVING_INVISIBLE_PROFILES_TIMEOUT_MILLIS = 15000L;
    private static final long MAX_EUICC_REMOVING_INVISIBLE_PROFILES_TIMEOUT_MILLIS = 90000L;
    private static final java.io.File RECOVERY_DIR = null;
    private static final java.io.File LOG_FILE = null;
    private static final java.lang.String LAST_INSTALL_PATH = "last_install";
    private static final java.lang.String LAST_PREFIX = "last_";
    private static final java.lang.String ACTION_EUICC_FACTORY_RESET = "com.android.internal.action.EUICC_FACTORY_RESET";
    private static final java.lang.String ACTION_EUICC_REMOVE_INVISIBLE_SUBSCRIPTIONS = "com.android.internal.action.EUICC_REMOVE_INVISIBLE_SUBSCRIPTIONS";
    private static final java.lang.String PACKAGE_NAME_EUICC_DATA_MANAGEMENT_CALLBACK = "android";
    public static final java.io.File BLOCK_MAP_FILE = null;
    public static final java.io.File UNCRYPT_PACKAGE_FILE = null;
    public static final java.io.File UNCRYPT_STATUS_FILE = null;
    private static final int LOG_FILE_MAX_LENGTH = 65536;
    private static final java.lang.Object sRequestLock = null;
    private final android.os.IRecoverySystem mService = null;
    private static java.util.HashSet<java.security.cert.X509Certificate> getTrustedCerts(java.io.File p0) throws java.io.IOException, java.security.GeneralSecurityException { return null; }
    public static void verifyPackage(java.io.File p0, android.os.RecoverySystem.ProgressListener p1, java.io.File p2) throws java.io.IOException, java.security.GeneralSecurityException {}
    @android.annotation.UnsupportedAppUsage
    private static boolean verifyPackageCompatibility(java.io.InputStream p0) throws java.io.IOException { return false; }
    private static boolean readAndVerifyPackageCompatibilityEntry(java.io.File p0) throws java.io.IOException { return false; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public static boolean verifyPackageCompatibility(java.io.File p0) throws java.io.IOException { return false; }
    @android.annotation.SystemApi
    public static void processPackage(android.content.Context p0, java.io.File p1, android.os.RecoverySystem.ProgressListener p2, android.os.Handler p3) throws java.io.IOException {}
    @android.annotation.SystemApi
    public static void processPackage(android.content.Context p0, java.io.File p1, android.os.RecoverySystem.ProgressListener p2) throws java.io.IOException {}
    public static void installPackage(android.content.Context p0, java.io.File p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    public static void installPackage(android.content.Context p0, java.io.File p1, boolean p2) throws java.io.IOException {}
    @android.annotation.SystemApi
    public static void scheduleUpdateOnBoot(android.content.Context p0, java.io.File p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    public static void cancelScheduledUpdate(android.content.Context p0) throws java.io.IOException {}
    public static void rebootWipeUserData(android.content.Context p0) throws java.io.IOException {}
    public static void rebootWipeUserData(android.content.Context p0, java.lang.String p1) throws java.io.IOException {}
    public static void rebootWipeUserData(android.content.Context p0, boolean p1) throws java.io.IOException {}
    public static void rebootWipeUserData(android.content.Context p0, boolean p1, java.lang.String p2, boolean p3) throws java.io.IOException {}
    public static void rebootWipeUserData(android.content.Context p0, boolean p1, java.lang.String p2, boolean p3, boolean p4) throws java.io.IOException {}
    public static boolean wipeEuiccData(android.content.Context p0, java.lang.String p1) { return false; }
    private static void removeEuiccInvisibleSubs(android.content.Context p0, android.telephony.euicc.EuiccManager p1) {}
    private static boolean removeEuiccInvisibleSubs(android.content.Context p0, java.util.List<android.telephony.SubscriptionInfo> p1, android.telephony.euicc.EuiccManager p2) { return false; }
    public static void rebootPromptAndWipeUserData(android.content.Context p0, java.lang.String p1) throws java.io.IOException {}
    public static void rebootWipeCache(android.content.Context p0) throws java.io.IOException {}
    public static void rebootWipeCache(android.content.Context p0, java.lang.String p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    public static void rebootWipeAb(android.content.Context p0, java.io.File p1, java.lang.String p2) throws java.io.IOException {}
    private static void bootCommand(android.content.Context p0, java.lang.String... p1) throws java.io.IOException {}
    public static java.lang.String handleAftermath(android.content.Context p0) { return null; }
    private static void recursiveDelete(java.io.File p0) {}
    private boolean uncrypt(java.lang.String p0, android.os.IRecoverySystemProgressListener p1) { return false; }
    private boolean setupBcb(java.lang.String p0) { return false; }
    private boolean clearBcb() { return false; }
    private void rebootRecoveryWithCommand(java.lang.String p0) {}
    private static java.lang.String sanitizeArg(java.lang.String p0) { return null; }
    public RecoverySystem() {}
    public RecoverySystem(android.os.IRecoverySystem p0) {}

    public static interface ProgressListener {
        public void onProgress(int p0);
    }
}
