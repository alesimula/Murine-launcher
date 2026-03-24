package android.permissionpresenterservice;

@java.lang.Deprecated
@android.annotation.SystemApi
public abstract class RuntimePermissionPresenterService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.permissionpresenterservice.RuntimePermissionPresenterService";
    public RuntimePermissionPresenterService() { super(); }
    public final void attachBaseContext(android.content.Context p0) {}
    public abstract java.util.List<android.content.pm.permission.RuntimePermissionPresentationInfo> onGetAppPermissions(java.lang.String p0);
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
}
