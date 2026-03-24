package android.permission;

public abstract class PermissionManagerInternal {
    public PermissionManagerInternal() {}
    public abstract byte[] backupRuntimePermissions(android.os.UserHandle p0);
    public abstract void restoreRuntimePermissions(byte[] p0, android.os.UserHandle p1);
    public abstract void restoreDelayedRuntimePermissions(java.lang.String p0, android.os.UserHandle p1);
    public abstract void addOnRuntimePermissionStateChangedListener(android.permission.PermissionManagerInternal.OnRuntimePermissionStateChangedListener p0);
    public abstract void removeOnRuntimePermissionStateChangedListener(android.permission.PermissionManagerInternal.OnRuntimePermissionStateChangedListener p0);

    public static interface CheckPermissionDelegate {
        public int checkPermission(java.lang.String p0, java.lang.String p1, int p2, com.android.internal.util.function.TriFunction<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer> p3);
        public int checkUidPermission(java.lang.String p0, int p1, java.util.function.BiFunction<java.lang.String, java.lang.Integer, java.lang.Integer> p2);
    }

    public static interface OnRuntimePermissionStateChangedListener {
        public void onRuntimePermissionStateChanged(java.lang.String p0, int p1);
    }
}
