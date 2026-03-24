package android.permission;

@android.annotation.SystemApi
public final class PermissionControllerManager {
    private static final java.lang.String TAG = null;
    private static final java.lang.Object sLock = null;
    private static android.util.ArrayMap<android.util.Pair<java.lang.Integer, java.lang.Thread>, android.permission.PermissionControllerManager.RemoteService> sRemoteServices;
    public static final java.lang.String KEY_RESULT = "android.permission.PermissionControllerManager.key.result";
    public static final int REASON_MALWARE = 1;
    public static final int REASON_INSTALLER_POLICY_VIOLATION = 2;
    public static final int COUNT_ONLY_WHEN_GRANTED = 1;
    public static final int COUNT_WHEN_SYSTEM = 2;
    private final android.content.Context mContext = null;
    private final android.permission.PermissionControllerManager.RemoteService mRemoteService = null;
    public PermissionControllerManager(android.content.Context p0, android.os.Handler p1) {}
    public void revokeRuntimePermissions(java.util.Map<java.lang.String, java.util.List<java.lang.String>> p0, boolean p1, int p2, java.util.concurrent.Executor p3, android.permission.PermissionControllerManager.OnRevokeRuntimePermissionsCallback p4) {}
    public void setRuntimePermissionGrantStateByDeviceAdmin(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, java.util.concurrent.Executor p4, java.util.function.Consumer<java.lang.Boolean> p5) {}
    public void getRuntimePermissionBackup(android.os.UserHandle p0, java.util.concurrent.Executor p1, android.permission.PermissionControllerManager.OnGetRuntimePermissionBackupCallback p2) {}
    public void restoreRuntimePermissionBackup(byte[] p0, android.os.UserHandle p1) {}
    public void restoreDelayedRuntimePermissionBackup(java.lang.String p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void getAppPermissions(java.lang.String p0, android.permission.PermissionControllerManager.OnGetAppPermissionResultCallback p1, android.os.Handler p2) {}
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1) {}
    public void countPermissionApps(java.util.List<java.lang.String> p0, int p1, android.permission.PermissionControllerManager.OnCountPermissionAppsResultCallback p2, android.os.Handler p3) {}
    public void getPermissionUsages(boolean p0, long p1, java.util.concurrent.Executor p2, android.permission.PermissionControllerManager.OnPermissionUsageResultCallback p3) {}
    public void grantOrUpgradeDefaultRuntimePermissions(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}

    static final class RemoteService extends com.android.internal.infra.AbstractMultiplePendingRequestsRemoteService<android.permission.PermissionControllerManager.RemoteService, android.permission.IPermissionController> {
        private static final long UNBIND_TIMEOUT_MILLIS = 10000L;
        private static final long MESSAGE_TIMEOUT_MILLIS = 30000L;
        RemoteService(android.content.Context p0, android.content.ComponentName p1, android.os.Handler p2, android.os.UserHandle p3) { super(null, null, null, 0, null, null, 0, false, 0); }
        android.os.Handler getHandler() { return null; }
        protected android.permission.IPermissionController getServiceInterface(android.os.IBinder p0) { return null; }
        protected long getTimeoutIdleBindMillis() { return 0L; }
        protected long getRemoteRequestMillis() { return 0L; }
        public void scheduleRequest(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<android.permission.PermissionControllerManager.RemoteService, android.permission.IPermissionController> p0) {}
        public void scheduleAsyncRequest(com.android.internal.infra.AbstractRemoteService.AsyncRequest<android.permission.IPermissionController> p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reason {
    }

    private static final class PendingSetRuntimePermissionGrantStateByDeviceAdmin extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.permission.PermissionControllerManager.RemoteService, android.permission.IPermissionController> {
        private final java.lang.String mCallerPackageName = null;
        private final java.lang.String mPackageName = null;
        private final java.lang.String mPermission = null;
        private final int mGrantState = 0;
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Consumer<java.lang.Boolean> mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private PendingSetRuntimePermissionGrantStateByDeviceAdmin(android.permission.PermissionControllerManager.RemoteService p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, java.util.concurrent.Executor p5, java.util.function.Consumer<java.lang.Boolean> p6) { super(null); }
        protected void onTimeout(android.permission.PermissionControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class PendingRevokeRuntimePermissionRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.permission.PermissionControllerManager.RemoteService, android.permission.IPermissionController> {
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> mRequest = null;
        private final boolean mDoDryRun = false;
        private final int mReason = 0;
        private final java.lang.String mCallingPackage = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.permission.PermissionControllerManager.OnRevokeRuntimePermissionsCallback mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private PendingRevokeRuntimePermissionRequest(android.permission.PermissionControllerManager.RemoteService p0, java.util.Map<java.lang.String, java.util.List<java.lang.String>> p1, boolean p2, int p3, java.lang.String p4, java.util.concurrent.Executor p5, android.permission.PermissionControllerManager.OnRevokeRuntimePermissionsCallback p6) { super(null); }
        protected void onTimeout(android.permission.PermissionControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class PendingRevokeAppPermissionRequest implements com.android.internal.infra.AbstractRemoteService.AsyncRequest<android.permission.IPermissionController> {
        private final java.lang.String mPackageName = null;
        private final java.lang.String mPermissionName = null;
        private PendingRevokeAppPermissionRequest(java.lang.String p0, java.lang.String p1) {}
        public void run(android.permission.IPermissionController p0) {}
    }

    private static final class PendingRestoreRuntimePermissionBackup implements com.android.internal.infra.AbstractRemoteService.AsyncRequest<android.permission.IPermissionController> {
        private final android.permission.PermissionControllerManager.FileWriterTask mBackupSender = null;
        private final byte[] mBackup = null;
        private final android.os.UserHandle mUser = null;
        private PendingRestoreRuntimePermissionBackup(android.permission.PermissionControllerManager.RemoteService p0, byte[] p1, android.os.UserHandle p2) {}
        public void run(android.permission.IPermissionController p0) {}
    }

    private static final class PendingRestoreDelayedRuntimePermissionBackup extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.permission.PermissionControllerManager.RemoteService, android.permission.IPermissionController> {
        private final java.lang.String mPackageName = null;
        private final android.os.UserHandle mUser = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Consumer<java.lang.Boolean> mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private PendingRestoreDelayedRuntimePermissionBackup(android.permission.PermissionControllerManager.RemoteService p0, java.lang.String p1, android.os.UserHandle p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Boolean> p4) { super(null); }
        protected void onTimeout(android.permission.PermissionControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class PendingGrantOrUpgradeDefaultRuntimePermissionsRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.permission.PermissionControllerManager.RemoteService, android.permission.IPermissionController> {
        private final java.util.function.Consumer<java.lang.Boolean> mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private PendingGrantOrUpgradeDefaultRuntimePermissionsRequest(android.permission.PermissionControllerManager.RemoteService p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Boolean> p2) { super(null); }
        protected void onTimeout(android.permission.PermissionControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class PendingGetRuntimePermissionBackup extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.permission.PermissionControllerManager.RemoteService, android.permission.IPermissionController> implements java.util.function.Consumer<byte[]> {
        private final android.permission.PermissionControllerManager.FileReaderTask<android.permission.PermissionControllerManager.PendingGetRuntimePermissionBackup> mBackupReader = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.permission.PermissionControllerManager.OnGetRuntimePermissionBackupCallback mCallback = null;
        private final android.os.UserHandle mUser = null;
        private PendingGetRuntimePermissionBackup(android.permission.PermissionControllerManager.RemoteService p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, android.permission.PermissionControllerManager.OnGetRuntimePermissionBackupCallback p3) { super(null); }
        protected void onTimeout(android.permission.PermissionControllerManager.RemoteService p0) {}
        public void run() {}
        public void accept(byte[] p0) {}
    }

    private static final class PendingGetPermissionUsagesRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.permission.PermissionControllerManager.RemoteService, android.permission.IPermissionController> {
        private final android.permission.PermissionControllerManager.OnPermissionUsageResultCallback mCallback = null;
        private final boolean mCountSystem = false;
        private final long mNumMillis = 0L;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private PendingGetPermissionUsagesRequest(android.permission.PermissionControllerManager.RemoteService p0, boolean p1, long p2, java.util.concurrent.Executor p3, android.permission.PermissionControllerManager.OnPermissionUsageResultCallback p4) { super(null); }
        protected void onTimeout(android.permission.PermissionControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class PendingGetAppPermissionRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.permission.PermissionControllerManager.RemoteService, android.permission.IPermissionController> {
        private final java.lang.String mPackageName = null;
        private final android.permission.PermissionControllerManager.OnGetAppPermissionResultCallback mCallback = null;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private PendingGetAppPermissionRequest(android.permission.PermissionControllerManager.RemoteService p0, java.lang.String p1, android.permission.PermissionControllerManager.OnGetAppPermissionResultCallback p2, android.os.Handler p3) { super(null); }
        protected void onTimeout(android.permission.PermissionControllerManager.RemoteService p0) {}
        public void run() {}
    }

    private static final class PendingCountPermissionAppsRequest extends com.android.internal.infra.AbstractRemoteService.PendingRequest<android.permission.PermissionControllerManager.RemoteService, android.permission.IPermissionController> {
        private final java.util.List<java.lang.String> mPermissionNames = null;
        private final android.permission.PermissionControllerManager.OnCountPermissionAppsResultCallback mCallback = null;
        private final int mFlags = 0;
        private final android.os.RemoteCallback mRemoteCallback = null;
        private PendingCountPermissionAppsRequest(android.permission.PermissionControllerManager.RemoteService p0, java.util.List<java.lang.String> p1, int p2, android.permission.PermissionControllerManager.OnCountPermissionAppsResultCallback p3, android.os.Handler p4) { super(null); }
        protected void onTimeout(android.permission.PermissionControllerManager.RemoteService p0) {}
        public void run() {}
    }

    public static abstract class OnRevokeRuntimePermissionsCallback {
        public OnRevokeRuntimePermissionsCallback() {}
        public abstract void onRevokeRuntimePermissions(java.util.Map<java.lang.String, java.util.List<java.lang.String>> p0);
    }

    public static interface OnPermissionUsageResultCallback {
        public void onPermissionUsageResult(java.util.List<android.permission.RuntimePermissionUsageInfo> p0);
    }

    public static interface OnGetRuntimePermissionBackupCallback {
        public void onGetRuntimePermissionsBackup(byte[] p0);
    }

    public static interface OnGetAppPermissionResultCallback {
        public void onGetAppPermissions(java.util.List<android.permission.RuntimePermissionPresentationInfo> p0);
    }

    public static interface OnCountPermissionAppsResultCallback {
        public void onCountPermissionApps(int p0);
    }

    private static class FileWriterTask extends android.os.AsyncTask<byte[], java.lang.Void, java.lang.Void> {
        private static final int CHUNK_SIZE = 4096;
        private android.os.ParcelFileDescriptor mLocalPipe;
        private android.os.ParcelFileDescriptor mRemotePipe;
        private FileWriterTask() { super(); }
        protected void onPreExecute() {}
        android.os.ParcelFileDescriptor getRemotePipe() { return null; }
        protected java.lang.Void doInBackground(byte[]... p0) { return null; }
        void interruptWrite() {}
        protected void onCancelled() {}
        protected void onPostExecute(java.lang.Void p0) {}
    }

    private static class FileReaderTask<Callback extends java.util.function.Consumer<byte[]>> extends android.os.AsyncTask<java.lang.Void, java.lang.Void, byte[]> {
        private android.os.ParcelFileDescriptor mLocalPipe;
        private android.os.ParcelFileDescriptor mRemotePipe;
        FileReaderTask(Callback p0) { super(); }
        protected void onPreExecute() {}
        android.os.ParcelFileDescriptor getRemotePipe() { return null; }
        protected byte[] doInBackground(java.lang.Void... p0) { return null; }
        void interruptRead() {}
        protected void onCancelled() {}
        protected void onPostExecute(byte[] p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CountPermissionAppsFlag {
    }
}
