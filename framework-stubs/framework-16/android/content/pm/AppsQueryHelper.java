package android.content.pm;

public class AppsQueryHelper {
    public static int GET_NON_LAUNCHABLE_APPS;
    public static int GET_APPS_WITH_INTERACT_ACROSS_USERS_PERM;
    public static int GET_IMES;
    public static int GET_REQUIRED_FOR_SYSTEM_USER;
    public AppsQueryHelper(android.content.pm.IPackageManager p0) {}
    public AppsQueryHelper() {}
    public java.util.List<java.lang.String> queryApps(int p0, boolean p1, android.os.UserHandle p2) { return null; }
    protected java.util.List<android.content.pm.ApplicationInfo> getAllApps(int p0) { return null; }
    protected java.util.List<android.content.pm.ResolveInfo> queryIntentActivitiesAsUser(android.content.Intent p0, int p1) { return null; }
    protected java.util.List<android.content.pm.ResolveInfo> queryIntentServicesAsUser(android.content.Intent p0, int p1) { return null; }
    protected java.util.List<android.content.pm.PackageInfo> getPackagesHoldingPermission(java.lang.String p0, int p1) { return null; }
}
