package android.content.om;

public class OverlayManager {
    public static final long SELF_TARGETING_OVERLAY = 205919743L;
    @android.annotation.SuppressLint("ReferencesHidden")
    public OverlayManager(android.content.Context p0, android.content.om.IOverlayManager p1) {}
    @android.annotation.SuppressLint("ReferencesHidden")
    public OverlayManager(android.content.Context p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void setEnabledExclusiveInCategory(java.lang.String p0, android.os.UserHandle p1) throws java.lang.SecurityException, java.lang.IllegalStateException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void setEnabled(java.lang.String p0, boolean p1, android.os.UserHandle p2) throws java.lang.SecurityException, java.lang.IllegalStateException {}
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.content.om.OverlayInfo getOverlayInfo(java.lang.String p0, android.os.UserHandle p1) { return null; }
    @android.annotation.Nullable
    public android.content.om.OverlayInfo getOverlayInfo(android.content.om.OverlayIdentifier p0, android.os.UserHandle p1) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    @android.annotation.NonNull
    public java.util.List<android.content.om.OverlayInfo> getOverlayInfosForTarget(java.lang.String p0, android.os.UserHandle p1) { return null; }
    @android.annotation.RequiresPermission(anyOf="android.permission.INTERACT_ACROSS_USERS")
    @android.annotation.NonNull
    public void invalidateCachesForOverlay(java.lang.String p0, android.os.UserHandle p1) {}
    public void commit(android.content.om.OverlayManagerTransaction p0) {}
    void commitSelfTarget(android.content.om.OverlayManagerTransaction p0) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {}
    @android.annotation.NonNull
    public java.util.List<android.content.om.OverlayInfo> getOverlayInfosForTarget(java.lang.String p0) { return null; }
}
