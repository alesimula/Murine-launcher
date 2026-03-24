package android.permission;

@android.annotation.SystemApi
public final class PermissionManager {
    public static final java.util.ArrayList<android.permission.PermissionManager.SplitPermissionInfo> SPLIT_PERMISSIONS = null;
    private final android.content.Context mContext = null;
    private final android.content.pm.IPackageManager mPackageManager = null;
    public PermissionManager(android.content.Context p0, android.content.pm.IPackageManager p1) {}
    @android.annotation.SystemApi
    public int getRuntimePermissionsVersion() { return 0; }
    @android.annotation.SystemApi
    public void setRuntimePermissionsVersion(int p0) {}
    public java.util.List<android.permission.PermissionManager.SplitPermissionInfo> getSplitPermissions() { return null; }

    public static final class SplitPermissionInfo {
        private final java.lang.String mSplitPerm = null;
        private final java.util.List<java.lang.String> mNewPerms = null;
        private final int mTargetSdk = 0;
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String getSplitPermission() { return null; }
        public java.util.List<java.lang.String> getNewPermissions() { return null; }
        public int getTargetSdk() { return 0; }
        public SplitPermissionInfo(java.lang.String p0, java.util.List<java.lang.String> p1, int p2) {}
    }
}
