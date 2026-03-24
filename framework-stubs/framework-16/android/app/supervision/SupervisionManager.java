package android.app.supervision;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.supervision.flags.supervision_manager_apis")
public class SupervisionManager {
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.app.supervision.flags.supervision_manager_apis")
    public static final java.lang.String ACTION_ENABLE_SUPERVISION = "android.app.supervision.action.ENABLE_SUPERVISION";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.app.supervision.flags.supervision_manager_apis")
    public static final java.lang.String ACTION_DISABLE_SUPERVISION = "android.app.supervision.action.DISABLE_SUPERVISION";
    public SupervisionManager(android.content.Context p0, android.app.supervision.ISupervisionManager p1) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.app.supervision.flags.supervision_manager_apis")
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.QUERY_USERS"})
    @android.annotation.Nullable
    public android.content.Intent createConfirmSupervisionCredentialsIntent() { return null; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.app.supervision.flags.supervision_manager_apis")
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.QUERY_USERS"})
    public boolean isSupervisionEnabled() { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.QUERY_USERS"})
    public boolean isSupervisionEnabledForUser(int p0) { return false; }
    public void setSupervisionEnabled(boolean p0) {}
    public void setSupervisionEnabledForUser(int p0, boolean p1) {}
    @android.annotation.Nullable
    public java.lang.String getActiveSupervisionAppPackage() { return null; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.enable_system_supervision_role_behavior")
    @android.annotation.RequiresPermission("android.permission.MANAGE_ROLE_HOLDERS")
    public boolean shouldAllowBypassingSupervisionRoleQualification() { return false; }
    public void setSupervisionRecoveryInfo(android.app.supervision.SupervisionRecoveryInfo p0) {}
    @android.annotation.Nullable
    public android.app.supervision.SupervisionRecoveryInfo getSupervisionRecoveryInfo() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.QUERY_USERS"})
    public boolean hasSupervisionCredentials() { return false; }
    public void registerSupervisionListener(android.app.supervision.SupervisionManager.SupervisionListener p0) {}
    public void unregisterSupervisionListener(android.app.supervision.SupervisionManager.SupervisionListener p0) {}

    public static abstract class SupervisionListener {
        protected final android.app.supervision.ISupervisionListener mListener = null;
        public SupervisionListener() {}
        public abstract void onSupervisionEnabled(int p0);
        public abstract void onSupervisionDisabled(int p0);
    }
}
