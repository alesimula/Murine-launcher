package android.app.sdksandbox;

public final class SdkSandboxManager {
    public static final int SDK_SANDBOX_STATE_DISABLED = 0;
    public static final int SDK_SANDBOX_STATE_ENABLED_PROCESS_ISOLATION = 2;
    SdkSandboxManager() {}
    public static int getSdkSandboxState() { return 0; }
}
