package android.permission;

public interface PermissionManagerInternal {
    @android.annotation.Nullable
    public byte[] backupRuntimePermissions(int p0);
    public void restoreRuntimePermissions(byte[] p0, int p1);
    public void restoreDelayedRuntimePermissions(java.lang.String p0, int p1);
}
