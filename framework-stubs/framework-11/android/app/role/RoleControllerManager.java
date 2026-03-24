package android.app.role;

public class RoleControllerManager {
    private static final java.lang.String LOG_TAG = null;
    private static final long REQUEST_TIMEOUT_MILLIS = 15000L;
    private static volatile android.content.ComponentName sRemoteServiceComponentName;
    private static final java.lang.Object sRemoteServicesLock = null;
    private static final android.util.SparseArray<com.android.internal.infra.ServiceConnector<android.app.role.IRoleController>> sRemoteServices = null;
    private final com.android.internal.infra.ServiceConnector<android.app.role.IRoleController> mRemoteService = null;
    public static void initializeRemoteServiceComponentName(android.content.Context p0) {}
    public static android.app.role.RoleControllerManager createWithInitializedRemoteServiceComponentName(android.os.Handler p0, android.content.Context p1) { return null; }
    private RoleControllerManager(android.content.ComponentName p0, android.os.Handler p1, android.content.Context p2) {}
    public RoleControllerManager(android.content.Context p0) {}
    private static android.content.ComponentName getRemoteServiceComponentName(android.content.Context p0) { return null; }
    public void grantDefaultRoles(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    public void onAddRoleHolder(java.lang.String p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) {}
    public void onRemoveRoleHolder(java.lang.String p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) {}
    public void onClearRoleHolders(java.lang.String p0, int p1, android.os.RemoteCallback p2) {}
    public void isApplicationQualifiedForRole(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void isApplicationVisibleForRole(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void isRoleVisible(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Boolean> p2) {}
    private void propagateCallback(com.android.internal.infra.AndroidFuture<android.os.Bundle> p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    private void propagateCallback(com.android.internal.infra.AndroidFuture<android.os.Bundle> p0, java.lang.String p1, android.os.RemoteCallback p2) {}
}
