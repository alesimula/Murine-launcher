package android.app.sdksandbox;

public final class SdkSandboxManager {
    public static final java.lang.String ACTION_START_SANDBOXED_ACTIVITY = "android.app.sdksandbox.action.START_SANDBOXED_ACTIVITY";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_DISPLAY_ID = "android.app.sdksandbox.extra.DISPLAY_ID";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_HEIGHT_IN_PIXELS = "android.app.sdksandbox.extra.HEIGHT_IN_PIXELS";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_HOST_TOKEN = "android.app.sdksandbox.extra.HOST_TOKEN";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_SURFACE_PACKAGE = "android.app.sdksandbox.extra.SURFACE_PACKAGE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_WIDTH_IN_PIXELS = "android.app.sdksandbox.extra.WIDTH_IN_PIXELS";
    public static final int LOAD_SDK_ALREADY_LOADED = 101;
    public static final int LOAD_SDK_INTERNAL_ERROR = 500;
    public static final int LOAD_SDK_NOT_FOUND = 100;
    public static final int LOAD_SDK_SDK_DEFINED_ERROR = 102;
    public static final int LOAD_SDK_SDK_SANDBOX_DISABLED = 103;
    public static final int REQUEST_SURFACE_PACKAGE_INTERNAL_ERROR = 700;
    public static final int REQUEST_SURFACE_PACKAGE_SDK_NOT_LOADED = 701;
    public static final int SDK_SANDBOX_PROCESS_NOT_AVAILABLE = 503;
    public static final java.lang.String SDK_SANDBOX_SERVICE = "sdk_sandbox";
    public static final int SDK_SANDBOX_STATE_DISABLED = 0;
    public static final int SDK_SANDBOX_STATE_ENABLED_PROCESS_ISOLATION = 2;
    SdkSandboxManager() {}
    public void addSdkSandboxProcessDeathCallback(java.util.concurrent.Executor p0, android.app.sdksandbox.SdkSandboxManager.SdkSandboxProcessDeathCallback p1) {}
    public void addSyncedSharedPreferencesKeys(java.util.Set<java.lang.String> p0) {}
    @android.annotation.NonNull
    public java.util.List<android.app.sdksandbox.AppOwnedSdkSandboxInterface> getAppOwnedSdkSandboxInterfaces() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.sdksandbox.SandboxedSdk> getSandboxedSdks() { return null; }
    public static int getSdkSandboxState() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getSyncedSharedPreferencesKeys() { return null; }
    public void loadSdk(java.lang.String p0, android.os.Bundle p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.app.sdksandbox.SandboxedSdk, android.app.sdksandbox.LoadSdkException> p3) {}
    public void registerAppOwnedSdkSandboxInterface(android.app.sdksandbox.AppOwnedSdkSandboxInterface p0) {}
    public void removeSdkSandboxProcessDeathCallback(android.app.sdksandbox.SdkSandboxManager.SdkSandboxProcessDeathCallback p0) {}
    public void removeSyncedSharedPreferencesKeys(java.util.Set<java.lang.String> p0) {}
    @java.lang.Deprecated
    public void requestSurfacePackage(java.lang.String p0, android.os.Bundle p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.os.Bundle, android.app.sdksandbox.RequestSurfacePackageException> p3) {}
    public void startSdkSandboxActivity(android.app.Activity p0, android.os.IBinder p1) {}
    public void unloadSdk(java.lang.String p0) {}
    public void unregisterAppOwnedSdkSandboxInterface(java.lang.String p0) {}

    public static interface SdkSandboxProcessDeathCallback {
        public void onSdkSandboxDied();
    }
}
