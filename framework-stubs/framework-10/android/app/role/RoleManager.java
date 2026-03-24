package android.app.role;

public final class RoleManager {
    private static final java.lang.String LOG_TAG = null;
    public static final java.lang.String ROLE_ASSISTANT = "android.app.role.ASSISTANT";
    public static final java.lang.String ROLE_BROWSER = "android.app.role.BROWSER";
    public static final java.lang.String ROLE_DIALER = "android.app.role.DIALER";
    public static final java.lang.String ROLE_SMS = "android.app.role.SMS";
    public static final java.lang.String ROLE_EMERGENCY = "android.app.role.EMERGENCY";
    public static final java.lang.String ROLE_HOME = "android.app.role.HOME";
    public static final java.lang.String ROLE_CALL_REDIRECTION = "android.app.role.CALL_REDIRECTION";
    public static final java.lang.String ROLE_CALL_SCREENING = "android.app.role.CALL_SCREENING";
    @android.annotation.SystemApi
    public static final int MANAGE_HOLDERS_FLAG_DONT_KILL_APP = 1;
    public static final java.lang.String ACTION_REQUEST_ROLE = "android.app.role.action.REQUEST_ROLE";
    public static final java.lang.String PERMISSION_MANAGE_ROLES_FROM_CONTROLLER = "com.android.permissioncontroller.permission.MANAGE_ROLES_FROM_CONTROLLER";
    private final android.content.Context mContext = null;
    private final android.app.role.IRoleManager mService = null;
    private final android.util.SparseArray<android.util.ArrayMap<android.app.role.OnRoleHoldersChangedListener, android.app.role.RoleManager.OnRoleHoldersChangedListenerDelegate>> mListeners = null;
    private final java.lang.Object mListenersLock = null;
    public RoleManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public android.content.Intent createRequestRoleIntent(java.lang.String p0) { return null; }
    public boolean isRoleAvailable(java.lang.String p0) { return false; }
    public boolean isRoleHeld(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getRoleHolders(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getRoleHoldersAsUser(java.lang.String p0, android.os.UserHandle p1) { return null; }
    @android.annotation.SystemApi
    public void addRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, android.os.UserHandle p3, java.util.concurrent.Executor p4, java.util.function.Consumer<java.lang.Boolean> p5) {}
    @android.annotation.SystemApi
    public void removeRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, android.os.UserHandle p3, java.util.concurrent.Executor p4, java.util.function.Consumer<java.lang.Boolean> p5) {}
    @android.annotation.SystemApi
    public void clearRoleHoldersAsUser(java.lang.String p0, int p1, android.os.UserHandle p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Boolean> p4) {}
    private static android.os.RemoteCallback createRemoteCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) { return null; }
    @android.annotation.SystemApi
    public void addOnRoleHoldersChangedListenerAsUser(java.util.concurrent.Executor p0, android.app.role.OnRoleHoldersChangedListener p1, android.os.UserHandle p2) {}
    @android.annotation.SystemApi
    public void removeOnRoleHoldersChangedListenerAsUser(android.app.role.OnRoleHoldersChangedListener p0, android.os.UserHandle p1) {}
    @android.annotation.SystemApi
    public void setRoleNamesFromController(java.util.List<java.lang.String> p0) {}
    @android.annotation.SystemApi
    public boolean addRoleHolderFromController(java.lang.String p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    public boolean removeRoleHolderFromController(java.lang.String p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getHeldRolesFromController(java.lang.String p0) { return null; }
    public java.lang.String getDefaultSmsPackage(int p0) { return null; }

    private static class OnRoleHoldersChangedListenerDelegate extends android.app.role.IOnRoleHoldersChangedListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.app.role.OnRoleHoldersChangedListener mListener = null;
        OnRoleHoldersChangedListenerDelegate(java.util.concurrent.Executor p0, android.app.role.OnRoleHoldersChangedListener p1) { super(); }
        public void onRoleHoldersChanged(java.lang.String p0, int p1) {}
    }

    public static @interface ManageHoldersFlags {
    }
}
