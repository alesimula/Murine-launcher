package android.service.watchdog;

@android.annotation.SystemApi
public abstract class ExplicitHealthCheckService extends android.app.Service {
    private static final java.lang.String TAG = "ExplicitHealthCheckService";
    public static final java.lang.String EXTRA_SUPPORTED_PACKAGES = "android.service.watchdog.extra.supported_packages";
    public static final java.lang.String EXTRA_REQUESTED_PACKAGES = "android.service.watchdog.extra.requested_packages";
    public static final java.lang.String EXTRA_HEALTH_CHECK_PASSED_PACKAGE = "android.service.watchdog.extra.health_check_passed_package";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.watchdog.ExplicitHealthCheckService";
    public static final java.lang.String BIND_PERMISSION = "android.permission.BIND_EXPLICIT_HEALTH_CHECK_SERVICE";
    private final android.service.watchdog.ExplicitHealthCheckService.ExplicitHealthCheckServiceWrapper mWrapper = null;
    private final android.os.Handler mHandler = null;
    private android.os.RemoteCallback mCallback;
    public ExplicitHealthCheckService() { super(); }
    public abstract void onRequestHealthCheck(java.lang.String p0);
    public abstract void onCancelHealthCheck(java.lang.String p0);
    public abstract java.util.List<android.service.watchdog.ExplicitHealthCheckService.PackageConfig> onGetSupportedPackages();
    public abstract java.util.List<java.lang.String> onGetRequestedPackages();
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void notifyHealthCheckPassed(java.lang.String p0) {}

    @android.annotation.SystemApi
    public static final class PackageConfig implements android.os.Parcelable {
        private static final long DEFAULT_HEALTH_CHECK_TIMEOUT_MILLIS = Long.valueOf(0L);
        private final java.lang.String mPackageName = null;
        private final long mHealthCheckTimeoutMillis = 0L;
        public static final android.os.Parcelable.Creator<android.service.watchdog.ExplicitHealthCheckService.PackageConfig> CREATOR = null;
        public PackageConfig(java.lang.String p0, long p1) {}
        private PackageConfig(android.os.Parcel p0) {}
        public java.lang.String getPackageName() { return null; }
        public long getHealthCheckTimeoutMillis() { return 0L; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private class ExplicitHealthCheckServiceWrapper extends android.service.watchdog.IExplicitHealthCheckService.Stub {
        private ExplicitHealthCheckServiceWrapper(android.service.watchdog.ExplicitHealthCheckService p0) { super(); }
        public void setCallback(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void request(java.lang.String p0) throws android.os.RemoteException {}
        public void cancel(java.lang.String p0) throws android.os.RemoteException {}
        public void getSupportedPackages(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void getRequestedPackages(android.os.RemoteCallback p0) throws android.os.RemoteException {}
    }
}
