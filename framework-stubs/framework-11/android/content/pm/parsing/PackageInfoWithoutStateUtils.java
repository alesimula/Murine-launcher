package android.content.pm.parsing;

public class PackageInfoWithoutStateUtils {
    public PackageInfoWithoutStateUtils() {}
    public static android.content.pm.PackageInfo generate(android.content.pm.parsing.ParsingPackageRead p0, int[] p1, int p2, long p3, long p4, java.util.Set<java.lang.String> p5, android.content.pm.PackageUserState p6, int p7) { return null; }
    public static android.content.pm.PackageInfo generate(android.content.pm.parsing.ParsingPackageRead p0, android.apex.ApexInfo p1, int p2) { return null; }
    private static android.content.pm.PackageInfo generateWithComponents(android.content.pm.parsing.ParsingPackageRead p0, int[] p1, int p2, long p3, long p4, java.util.Set<java.lang.String> p5, android.content.pm.PackageUserState p6, int p7, android.apex.ApexInfo p8) { return null; }
    public static android.content.pm.PackageInfo generateWithoutComponents(android.content.pm.parsing.ParsingPackageRead p0, int[] p1, int p2, long p3, long p4, java.util.Set<java.lang.String> p5, android.content.pm.PackageUserState p6, int p7, android.apex.ApexInfo p8, android.content.pm.ApplicationInfo p9) { return null; }
    public static android.content.pm.PackageInfo generateWithoutComponentsUnchecked(android.content.pm.parsing.ParsingPackageRead p0, int[] p1, int p2, long p3, long p4, java.util.Set<java.lang.String> p5, android.content.pm.PackageUserState p6, int p7, android.apex.ApexInfo p8, android.content.pm.ApplicationInfo p9) { return null; }
    public static android.content.pm.ApplicationInfo generateApplicationInfo(android.content.pm.parsing.ParsingPackageRead p0, int p1, android.content.pm.PackageUserState p2, int p3) { return null; }
    public static android.content.pm.ApplicationInfo generateApplicationInfoUnchecked(android.content.pm.parsing.ParsingPackageRead p0, int p1, android.content.pm.PackageUserState p2, int p3) { return null; }
    public static android.content.pm.ActivityInfo generateActivityInfo(android.content.pm.parsing.ParsingPackageRead p0, android.content.pm.parsing.component.ParsedActivity p1, int p2, android.content.pm.PackageUserState p3, android.content.pm.ApplicationInfo p4, int p5) { return null; }
    public static android.content.pm.ActivityInfo generateActivityInfoUnchecked(android.content.pm.parsing.component.ParsedActivity p0, android.content.pm.ApplicationInfo p1) { return null; }
    public static android.content.pm.ActivityInfo generateActivityInfo(android.content.pm.parsing.ParsingPackageRead p0, android.content.pm.parsing.component.ParsedActivity p1, int p2, android.content.pm.PackageUserState p3, int p4) { return null; }
    public static android.content.pm.ServiceInfo generateServiceInfo(android.content.pm.parsing.ParsingPackageRead p0, android.content.pm.parsing.component.ParsedService p1, int p2, android.content.pm.PackageUserState p3, android.content.pm.ApplicationInfo p4, int p5) { return null; }
    public static android.content.pm.ServiceInfo generateServiceInfoUnchecked(android.content.pm.parsing.component.ParsedService p0, android.content.pm.ApplicationInfo p1) { return null; }
    public static android.content.pm.ServiceInfo generateServiceInfo(android.content.pm.parsing.ParsingPackageRead p0, android.content.pm.parsing.component.ParsedService p1, int p2, android.content.pm.PackageUserState p3, int p4) { return null; }
    public static android.content.pm.ProviderInfo generateProviderInfo(android.content.pm.parsing.ParsingPackageRead p0, android.content.pm.parsing.component.ParsedProvider p1, int p2, android.content.pm.PackageUserState p3, android.content.pm.ApplicationInfo p4, int p5) { return null; }
    public static android.content.pm.ProviderInfo generateProviderInfoUnchecked(android.content.pm.parsing.component.ParsedProvider p0, int p1, android.content.pm.ApplicationInfo p2) { return null; }
    public static android.content.pm.ProviderInfo generateProviderInfo(android.content.pm.parsing.ParsingPackageRead p0, android.content.pm.parsing.component.ParsedProvider p1, int p2, android.content.pm.PackageUserState p3, int p4) { return null; }
    public static android.content.pm.InstrumentationInfo generateInstrumentationInfo(android.content.pm.parsing.component.ParsedInstrumentation p0, android.content.pm.parsing.ParsingPackageRead p1, int p2, int p3) { return null; }
    public static android.content.pm.PermissionInfo generatePermissionInfo(android.content.pm.parsing.component.ParsedPermission p0, int p1) { return null; }
    public static android.content.pm.PermissionGroupInfo generatePermissionGroupInfo(android.content.pm.parsing.component.ParsedPermissionGroup p0, int p1) { return null; }
    private static void assignSharedFieldsForComponentInfo(android.content.pm.ComponentInfo p0, android.content.pm.parsing.component.ParsedMainComponent p1) {}
    private static void assignSharedFieldsForPackageItemInfo(android.content.pm.PackageItemInfo p0, android.content.pm.parsing.component.ParsedComponent p1) {}
    private static int flag(boolean p0, int p1) { return 0; }
    public static int appInfoFlags(android.content.pm.parsing.ParsingPackageRead p0) { return 0; }
    public static int appInfoPrivateFlags(android.content.pm.parsing.ParsingPackageRead p0) { return 0; }
    private static boolean checkUseInstalled(android.content.pm.parsing.ParsingPackageRead p0, android.content.pm.PackageUserState p1, int p2) { return false; }
    public static java.io.File getDataDir(android.content.pm.parsing.ParsingPackageRead p0, int p1) { return null; }
    public static java.io.File getDeviceProtectedDataDir(android.content.pm.parsing.ParsingPackageRead p0, int p1) { return null; }
    public static java.io.File getCredentialProtectedDataDir(android.content.pm.parsing.ParsingPackageRead p0, int p1) { return null; }
}
