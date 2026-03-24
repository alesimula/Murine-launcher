package android.app.sdksandbox.sdkprovider;

public class SdkSandboxController {
    public static final java.lang.String SDK_SANDBOX_CONTROLLER_SERVICE = "sdk_sandbox_controller_service";
    SdkSandboxController() {}
    @android.annotation.NonNull
    public java.util.List<android.app.sdksandbox.AppOwnedSdkSandboxInterface> getAppOwnedSdkSandboxInterfaces() { return null; }
    @android.annotation.NonNull
    public java.lang.String getClientPackageName() { return null; }
    @android.annotation.NonNull
    public android.content.SharedPreferences getClientSharedPreferences() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.app.sdksandbox.SandboxedSdk> getSandboxedSdks() { return null; }
    public void loadSdk(java.lang.String p0, android.os.Bundle p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.app.sdksandbox.SandboxedSdk, android.app.sdksandbox.LoadSdkException> p3) {}
    @android.annotation.NonNull
    public android.os.IBinder registerSdkSandboxActivityHandler(android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler p0) { return null; }
    @android.annotation.FlaggedApi("com.android.sdksandbox.flags.sandbox_client_importance_listener")
    public void registerSdkSandboxClientImportanceListener(java.util.concurrent.Executor p0, android.app.sdksandbox.sdkprovider.SdkSandboxClientImportanceListener p1) {}
    @android.annotation.NonNull
    public void unregisterSdkSandboxActivityHandler(android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler p0) {}
    @android.annotation.FlaggedApi("com.android.sdksandbox.flags.sandbox_client_importance_listener")
    public void unregisterSdkSandboxClientImportanceListener(android.app.sdksandbox.sdkprovider.SdkSandboxClientImportanceListener p0) {}
}
