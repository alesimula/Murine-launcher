package android.permission;

public interface PermissionManagerInternal {
    public byte[] backupRuntimePermissions(int p0);
    public void restoreRuntimePermissions(byte[] p0, int p1);
    public void restoreDelayedRuntimePermissions(java.lang.String p0, int p1);
}
