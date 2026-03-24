package android.app.role;

public class RoleControllerManager {
    private static final java.lang.String LOG_TAG = null;
    private static volatile android.content.ComponentName sRemoteServiceComponentName;
    private static final java.lang.Object sRemoteServicesLock = null;
    private static final android.util.SparseArray<android.app.role.RoleControllerManager.RemoteService> sRemoteServices = null;
    private final android.app.role.RoleControllerManager.RemoteService mRemoteService = null;
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
    public void isRoleVisible(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Boolean> p2) {}

    private static final class RemoteService extends com.android.internal.infra.AbstractMultiplePendingRequestsRemoteService<android.app.role.RoleControllerManager.RemoteService, android.app.role.IRoleController> {
        private static final long UNBIND_DELAY_MILLIS = 15000L;
        private static final long REQUEST_TIMEOUT_MILLIS = 15000L;
        RemoteService(android.content.Context p0, android.content.ComponentName p1, android.os.Handler p2, int p3) { super(null, null, null, 0, null, null, 0, false, 0); }
        public android.os.Handler getHandler() { return null; }
        protected android.app.role.IRoleController getServiceInterface(android.os.IBinder p0) { return null; }
        protected long getTimeoutIdleBindMillis() { return 0L; }
        protected long getRemoteRequestMillis() { return 0L; }
        public void scheduleRequest(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<android.app.role.RoleControllerManager.RemoteService, android.app.role.IRoleController> p0) {}
        public void scheduleAsyncRequest(com.android.internal.infra.AbstractRemoteService.AsyncRequest<android.app.role.IRoleController> p0) {}
    }

    private static final class OnRemoveRoleHolderRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.app.role.RoleControllerManager.RemoteService, android.app.role.IRoleController> {
        private final java.lang.String mRoleName = null;
        private final java.lang.String mPackageName = null;
        @android.app.role.RoleManager.ManageHoldersFlags
        private final int mFlags = 0;
        private final android.os.RemoteCallback mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private OnRemoveRoleHolderRequest(android.app.role.RoleControllerManager.RemoteService p0, java.lang.String p1, java.lang.String p2, int p3, android.os.RemoteCallback p4) { super(null); }
        protected void onTimeout(android.app.role.RoleControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class OnClearRoleHoldersRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.app.role.RoleControllerManager.RemoteService, android.app.role.IRoleController> {
        private final java.lang.String mRoleName = null;
        @android.app.role.RoleManager.ManageHoldersFlags
        private final int mFlags = 0;
        private final android.os.RemoteCallback mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private OnClearRoleHoldersRequest(android.app.role.RoleControllerManager.RemoteService p0, java.lang.String p1, int p2, android.os.RemoteCallback p3) { super(null); }
        protected void onTimeout(android.app.role.RoleControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class OnAddRoleHolderRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.app.role.RoleControllerManager.RemoteService, android.app.role.IRoleController> {
        private final java.lang.String mRoleName = null;
        private final java.lang.String mPackageName = null;
        @android.app.role.RoleManager.ManageHoldersFlags
        private final int mFlags = 0;
        private final android.os.RemoteCallback mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private OnAddRoleHolderRequest(android.app.role.RoleControllerManager.RemoteService p0, java.lang.String p1, java.lang.String p2, int p3, android.os.RemoteCallback p4) { super(null); }
        protected void onTimeout(android.app.role.RoleControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class IsRoleVisibleRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.app.role.RoleControllerManager.RemoteService, android.app.role.IRoleController> {
        private final java.lang.String mRoleName = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Consumer<java.lang.Boolean> mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private IsRoleVisibleRequest(android.app.role.RoleControllerManager.RemoteService p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) { super(null); }
        protected void onTimeout(android.app.role.RoleControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class IsApplicationQualifiedForRoleRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.app.role.RoleControllerManager.RemoteService, android.app.role.IRoleController> {
        private final java.lang.String mRoleName = null;
        private final java.lang.String mPackageName = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Consumer<java.lang.Boolean> mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private IsApplicationQualifiedForRoleRequest(android.app.role.RoleControllerManager.RemoteService p0, java.lang.String p1, java.lang.String p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Boolean> p4) { super(null); }
        protected void onTimeout(android.app.role.RoleControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class GrantDefaultRolesRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.app.role.RoleControllerManager.RemoteService, android.app.role.IRoleController> {
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Consumer<java.lang.Boolean> mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private GrantDefaultRolesRequest(android.app.role.RoleControllerManager.RemoteService p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Boolean> p2) { super(null); }
        protected void onTimeout(android.app.role.RoleControllerManager.RemoteService p0) {}
        public void run() {}
        protected void onFailed() {}
    }
}
