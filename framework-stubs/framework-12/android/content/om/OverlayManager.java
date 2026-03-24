package android.content.om;

@android.annotation.SystemApi
public class OverlayManager {
    private final android.content.om.IOverlayManager mService = null;
    private final android.content.Context mContext = null;
    private static final long THROW_SECURITY_EXCEPTIONS = 147340954L;
    public OverlayManager(android.content.Context p0, android.content.om.IOverlayManager p1) {}
    public OverlayManager(android.content.Context p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void setEnabledExclusiveInCategory(java.lang.String p0, android.os.UserHandle p1) throws java.lang.SecurityException, java.lang.IllegalStateException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void setEnabled(java.lang.String p0, boolean p1, android.os.UserHandle p2) throws java.lang.SecurityException, java.lang.IllegalStateException {}
    @android.annotation.SystemApi
    public android.content.om.OverlayInfo getOverlayInfo(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public android.content.om.OverlayInfo getOverlayInfo(android.content.om.OverlayIdentifier p0, android.os.UserHandle p1) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public java.util.List<android.content.om.OverlayInfo> getOverlayInfosForTarget(java.lang.String p0, android.os.UserHandle p1) { return null; }
    @android.annotation.RequiresPermission(anyOf="android.permission.INTERACT_ACROSS_USERS")
    public void invalidateCachesForOverlay(java.lang.String p0, android.os.UserHandle p1) {}
    public void commit(android.content.om.OverlayManagerTransaction p0) {}
    private void rethrowSecurityException(java.lang.SecurityException p0) {}
}
