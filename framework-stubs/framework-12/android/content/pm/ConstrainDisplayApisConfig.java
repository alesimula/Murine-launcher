package android.content.pm;

public final class ConstrainDisplayApisConfig {
    private static final java.lang.String TAG = null;
    private static final java.lang.String FLAG_NEVER_CONSTRAIN_DISPLAY_APIS = "never_constrain_display_apis";
    private static final java.lang.String FLAG_NEVER_CONSTRAIN_DISPLAY_APIS_ALL_PACKAGES = "never_constrain_display_apis_all_packages";
    private static final java.lang.String FLAG_ALWAYS_CONSTRAIN_DISPLAY_APIS = "always_constrain_display_apis";
    public ConstrainDisplayApisConfig() {}
    public static boolean neverConstrainDisplayApis(android.content.pm.ApplicationInfo p0) { return false; }
    public static boolean alwaysConstrainDisplayApis(android.content.pm.ApplicationInfo p0) { return false; }
    private static boolean flagHasMatchingPackageEntry(java.lang.String p0, android.content.pm.ApplicationInfo p1) { return false; }
    private static boolean matchesApplicationInfo(java.lang.String p0, android.content.pm.ApplicationInfo p1) { return false; }
}
