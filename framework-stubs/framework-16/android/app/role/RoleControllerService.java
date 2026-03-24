package android.app.role;

@java.lang.Deprecated
public abstract class RoleControllerService extends android.app.Service {
    @java.lang.Deprecated
    public static final java.lang.String SERVICE_INTERFACE = "android.app.role.RoleControllerService";
    @java.lang.Deprecated
    public RoleControllerService() { super(); }
    @java.lang.Deprecated
    public abstract boolean onAddRoleHolder(java.lang.String p0, java.lang.String p1, int p2);
    @java.lang.Deprecated
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @java.lang.Deprecated
    public abstract boolean onClearRoleHolders(java.lang.String p0, int p1);
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("android.permission.flags.system_server_role_controller_enabled")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> onGetLegacyFallbackDisabledRoles() { return null; }
    @java.lang.Deprecated
    public abstract boolean onGrantDefaultRoles();
    @java.lang.Deprecated
    public abstract boolean onIsApplicationQualifiedForRole(java.lang.String p0, java.lang.String p1);
    @java.lang.Deprecated
    public boolean onIsApplicationVisibleForRole(java.lang.String p0, java.lang.String p1) { return false; }
    @java.lang.Deprecated
    public abstract boolean onIsRoleVisible(java.lang.String p0);
    @java.lang.Deprecated
    public abstract boolean onRemoveRoleHolder(java.lang.String p0, java.lang.String p1, int p2);
}
