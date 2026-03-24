package android.webkit;

public final class Flags {
    public static final java.lang.String FLAG_DEPRECATE_START_SAFE_BROWSING = "android.webkit.deprecate_start_safe_browsing";
    public static final java.lang.String FLAG_FILE_SYSTEM_ACCESS = "android.webkit.file_system_access";
    public static final java.lang.String FLAG_MAINLINE_APIS = "android.webkit.mainline_apis";
    public static final java.lang.String FLAG_UPDATE_SERVICE_IPC_WRAPPER = "android.webkit.update_service_ipc_wrapper";
    public static final java.lang.String FLAG_UPDATE_SERVICE_V2 = "android.webkit.update_service_v2";
    public static final java.lang.String FLAG_USE_B_ENTRY_POINT = "android.webkit.use_b_entry_point";
    public static final java.lang.String FLAG_USER_AGENT_REDUCTION = "android.webkit.user_agent_reduction";
    public Flags() {}
    public static boolean deprecateStartSafeBrowsing() { return false; }
    public static boolean fileSystemAccess() { return false; }
    public static boolean mainlineApis() { return false; }
    public static boolean updateServiceIpcWrapper() { return false; }
    public static boolean updateServiceV2() { return false; }
    public static boolean useBEntryPoint() { return false; }
    public static boolean userAgentReduction() { return false; }
}
