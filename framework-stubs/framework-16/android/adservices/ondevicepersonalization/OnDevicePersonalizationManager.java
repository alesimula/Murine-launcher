package android.adservices.ondevicepersonalization;

public class OnDevicePersonalizationManager {
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.is_feature_enabled_api_enabled")
    public static final int FEATURE_DISABLED = 1;
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.is_feature_enabled_api_enabled")
    public static final int FEATURE_ENABLED = 0;
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.is_feature_enabled_api_enabled")
    public static final int FEATURE_UNSUPPORTED = 2;
    OnDevicePersonalizationManager() {}
    public void execute(android.content.ComponentName p0, android.os.PersistableBundle p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.adservices.ondevicepersonalization.OnDevicePersonalizationManager.ExecuteResult, java.lang.Exception> p3) {}
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
    public void executeInIsolatedService(android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceResponse, java.lang.Exception> p2) {}
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.is_feature_enabled_api_enabled")
    public void queryFeatureAvailability(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Integer, java.lang.Exception> p2) {}
    public void requestSurfacePackage(android.adservices.ondevicepersonalization.SurfacePackageToken p0, android.os.IBinder p1, int p2, int p3, int p4, java.util.concurrent.Executor p5, android.os.OutcomeReceiver<android.view.SurfaceControlViewHost.SurfacePackage, java.lang.Exception> p6) {}

    public static class ExecuteResult {
        ExecuteResult() {}
        @android.annotation.Nullable
        public byte[] getOutputData() { return null; }
        @android.annotation.Nullable
        public android.adservices.ondevicepersonalization.SurfacePackageToken getSurfacePackageToken() { return null; }
    }
}
