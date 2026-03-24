package android.app.role;

@android.annotation.SystemApi
public abstract class RoleControllerService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.app.role.RoleControllerService";
    private android.os.HandlerThread mWorkerThread;
    private android.os.Handler mWorkerHandler;
    public RoleControllerService() { super(); }
    public void onCreate() {}
    public void onDestroy() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    private void grantDefaultRoles(android.os.RemoteCallback p0) {}
    private void onAddRoleHolder(java.lang.String p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) {}
    private void onRemoveRoleHolder(java.lang.String p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) {}
    private void onClearRoleHolders(java.lang.String p0, int p1, android.os.RemoteCallback p2) {}
    public abstract boolean onGrantDefaultRoles();
    public abstract boolean onAddRoleHolder(java.lang.String p0, java.lang.String p1, int p2);
    public abstract boolean onRemoveRoleHolder(java.lang.String p0, java.lang.String p1, int p2);
    public abstract boolean onClearRoleHolders(java.lang.String p0, int p1);
    public abstract boolean onIsApplicationQualifiedForRole(java.lang.String p0, java.lang.String p1);
    public abstract boolean onIsRoleVisible(java.lang.String p0);
}
