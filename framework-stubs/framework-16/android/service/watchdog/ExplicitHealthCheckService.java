package android.service.watchdog;

public abstract class ExplicitHealthCheckService extends android.app.Service {
    public static final java.lang.String BIND_PERMISSION = "android.permission.BIND_EXPLICIT_HEALTH_CHECK_SERVICE";
    @android.annotation.FlaggedApi("android.crashrecovery.flags.enable_crashrecovery")
    public static final java.lang.String EXTRA_HEALTH_CHECK_PASSED_PACKAGE = "android.service.watchdog.extra.HEALTH_CHECK_PASSED_PACKAGE";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.watchdog.ExplicitHealthCheckService";
    public ExplicitHealthCheckService() { super(); }
    public final void notifyHealthCheckPassed(java.lang.String p0) {}
    @android.annotation.NonNull
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onCancelHealthCheck(java.lang.String p0);
    @android.annotation.NonNull
    public abstract java.util.List<java.lang.String> onGetRequestedPackages();
    @android.annotation.NonNull
    public abstract java.util.List<android.service.watchdog.ExplicitHealthCheckService.PackageConfig> onGetSupportedPackages();
    public abstract void onRequestHealthCheck(java.lang.String p0);
    @android.annotation.FlaggedApi("android.crashrecovery.flags.enable_crashrecovery")
    public final void setHealthCheckPassedCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.os.Bundle> p1) {}

    public static final class PackageConfig implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.service.watchdog.ExplicitHealthCheckService.PackageConfig> CREATOR = null;
        public PackageConfig(java.lang.String p0, long p1) {}
        public int describeContents() { return 0; }
        public long getHealthCheckTimeoutMillis() { return 0L; }
        @android.annotation.NonNull
        public java.lang.String getPackageName() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
