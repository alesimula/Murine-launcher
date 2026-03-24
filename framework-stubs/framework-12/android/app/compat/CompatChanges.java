package android.app.compat;

@android.annotation.SystemApi
public final class CompatChanges {
    private static final android.app.compat.ChangeIdStateCache QUERY_CACHE = null;
    private CompatChanges() {}
    public static boolean isChangeEnabled(long p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_COMPAT_CHANGE_CONFIG", "android.permission.LOG_COMPAT_CHANGE"})
    public static boolean isChangeEnabled(long p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_COMPAT_CHANGE_CONFIG", "android.permission.LOG_COMPAT_CHANGE"})
    public static boolean isChangeEnabled(long p0, int p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG_ON_RELEASE_BUILD")
    public static void putPackageOverrides(java.lang.String p0, java.util.Map<java.lang.Long, android.app.compat.PackageOverride> p1) {}
    @android.annotation.RequiresPermission("android.permission.OVERRIDE_COMPAT_CHANGE_CONFIG_ON_RELEASE_BUILD")
    public static void removePackageOverrides(java.lang.String p0, java.util.Set<java.lang.Long> p1) {}
}
