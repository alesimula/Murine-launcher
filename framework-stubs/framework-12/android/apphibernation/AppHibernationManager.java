package android.apphibernation;

@android.annotation.SystemApi
public class AppHibernationManager {
    private static final java.lang.String TAG = "AppHibernationManager";
    private final android.content.Context mContext = null;
    private final android.apphibernation.IAppHibernationService mIAppHibernationService = null;
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
    public java.util.List<java.lang.String> getHibernatingPackagesForUser() { return null; }
}
