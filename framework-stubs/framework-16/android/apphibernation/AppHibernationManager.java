package android.apphibernation;

@android.annotation.SystemApi
public class AppHibernationManager {
    public AppHibernationManager(android.content.Context p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_APP_HIBERNATION")
    public boolean isHibernatingForUser(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_APP_HIBERNATION")
    public void setHibernatingForUser(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_APP_HIBERNATION")
    public boolean isHibernatingGlobally(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_APP_HIBERNATION")
    public void setHibernatingGlobally(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_APP_HIBERNATION")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getHibernatingPackagesForUser() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_APP_HIBERNATION")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.apphibernation.HibernationStats> getHibernationStatsForUser(java.util.Set<java.lang.String> p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_APP_HIBERNATION")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.apphibernation.HibernationStats> getHibernationStatsForUser() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_APP_HIBERNATION")
    public boolean isOatArtifactDeletionEnabled() { return false; }
}
