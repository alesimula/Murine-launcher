package android.content.pm.dex;

@android.annotation.SystemApi
public class ArtManager {
    private static final java.lang.String TAG = "ArtManager";
    public static final int SNAPSHOT_FAILED_PACKAGE_NOT_FOUND = 0;
    public static final int SNAPSHOT_FAILED_CODE_PATH_NOT_FOUND = 1;
    public static final int SNAPSHOT_FAILED_INTERNAL_ERROR = 2;
    public static final int PROFILE_APPS = 0;
    public static final int PROFILE_BOOT_IMAGE = 1;
    private final android.content.Context mContext = null;
    private final android.content.pm.dex.IArtManager mArtManager = null;
    public ArtManager(android.content.Context p0, android.content.pm.dex.IArtManager p1) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_RUNTIME_PROFILES", "android.permission.PACKAGE_USAGE_STATS"})
    public void snapshotRuntimeProfile(int p0, java.lang.String p1, java.lang.String p2, java.util.concurrent.Executor p3, android.content.pm.dex.ArtManager.SnapshotRuntimeProfileCallback p4) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_RUNTIME_PROFILES", "android.permission.PACKAGE_USAGE_STATS"})
    public boolean isRuntimeProfilingEnabled(int p0) { return false; }
    public static java.lang.String getProfileName(java.lang.String p0) { return null; }
    public static java.lang.String getCurrentProfilePath(java.lang.String p0, int p1, java.lang.String p2) { return null; }
    public static java.lang.String getReferenceProfilePath(java.lang.String p0, int p1, java.lang.String p2) { return null; }
    public static java.io.File getProfileSnapshotFileForName(java.lang.String p0, java.lang.String p1) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileType {
    }

    public static abstract class SnapshotRuntimeProfileCallback {
        public SnapshotRuntimeProfileCallback() {}
        public abstract void onSuccess(android.os.ParcelFileDescriptor p0);
        public abstract void onError(int p0);
    }

    private static class SnapshotRuntimeProfileCallbackDelegate extends android.content.pm.dex.ISnapshotRuntimeProfileCallback.Stub {
        private final android.content.pm.dex.ArtManager.SnapshotRuntimeProfileCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private SnapshotRuntimeProfileCallbackDelegate(android.content.pm.dex.ArtManager.SnapshotRuntimeProfileCallback p0, java.util.concurrent.Executor p1) { super(); }
        public void onSuccess(android.os.ParcelFileDescriptor p0) {}
        public void onError(int p0) {}
    }
}
