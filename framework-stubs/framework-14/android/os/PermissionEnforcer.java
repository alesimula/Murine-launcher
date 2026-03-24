package android.os;

public class PermissionEnforcer {
    protected PermissionEnforcer() {}
    public PermissionEnforcer(android.content.Context p0) {}
    protected int checkPermission(java.lang.String p0, android.content.AttributionSource p1) { return 0; }
    protected int checkPermission(java.lang.String p0, int p1, int p2) { return 0; }
    public void enforcePermission(java.lang.String p0, android.content.AttributionSource p1) throws java.lang.SecurityException {}
    public void enforcePermission(java.lang.String p0, int p1, int p2) throws java.lang.SecurityException {}
    public void enforcePermissionAllOf(java.lang.String[] p0, android.content.AttributionSource p1) throws java.lang.SecurityException {}
    public void enforcePermissionAllOf(java.lang.String[] p0, int p1, int p2) throws java.lang.SecurityException {}
    public void enforcePermissionAnyOf(java.lang.String[] p0, android.content.AttributionSource p1) throws java.lang.SecurityException {}
    public void enforcePermissionAnyOf(java.lang.String[] p0, int p1, int p2) throws java.lang.SecurityException {}
    public static android.os.PermissionEnforcer fromContext(android.content.Context p0) { return null; }
}
