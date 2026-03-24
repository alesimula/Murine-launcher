package android.app.sdksandbox.sdkprovider;

public class SdkSandboxController {
    public static final java.lang.String SDK_SANDBOX_CONTROLLER_SERVICE = "sdk_sandbox_controller_service";
    SdkSandboxController() {}
    @android.annotation.NonNull
    public java.util.List<android.app.sdksandbox.SandboxedSdk> getSandboxedSdks() { return null; }
    @android.annotation.NonNull
    public android.content.SharedPreferences getClientSharedPreferences() { return null; }
    @android.annotation.NonNull
    public android.os.IBinder registerSdkSandboxActivityHandler(android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler p0) { return null; }
    @android.annotation.NonNull
    public void unregisterSdkSandboxActivityHandler(android.app.sdksandbox.sdkprovider.SdkSandboxActivityHandler p0) {}
}
