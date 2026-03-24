package android.content.pm;

public class PackageBackwardCompatibility extends android.content.pm.PackageSharedLibraryUpdater {
    private static final java.lang.String TAG = null;
    private static final android.content.pm.PackageBackwardCompatibility INSTANCE = null;
    private final boolean mBootClassPathContainsATB = false;
    private final android.content.pm.PackageSharedLibraryUpdater[] mPackageUpdaters = null;
    private static boolean addOptionalUpdater(java.util.List<android.content.pm.PackageSharedLibraryUpdater> p0, java.lang.String p1, java.util.function.Supplier<android.content.pm.PackageSharedLibraryUpdater> p2) { return false; }
    public static android.content.pm.PackageSharedLibraryUpdater getInstance() { return null; }
    private PackageBackwardCompatibility(boolean p0, android.content.pm.PackageSharedLibraryUpdater[] p1) { super(); }
    public static void modifySharedLibraries(android.content.pm.PackageParser.Package p0) {}
    public void updatePackage(android.content.pm.PackageParser.Package p0) {}
    public static boolean bootClassPathContainsATB() { return false; }

    public static class RemoveUnnecessaryOrgApacheHttpLegacyLibrary extends android.content.pm.PackageSharedLibraryUpdater {
        public RemoveUnnecessaryOrgApacheHttpLegacyLibrary() { super(); }
        public void updatePackage(android.content.pm.PackageParser.Package p0) {}
    }

    public static class RemoveUnnecessaryAndroidTestBaseLibrary extends android.content.pm.PackageSharedLibraryUpdater {
        public RemoveUnnecessaryAndroidTestBaseLibrary() { super(); }
        public void updatePackage(android.content.pm.PackageParser.Package p0) {}
    }

    public static class AndroidTestRunnerSplitUpdater extends android.content.pm.PackageSharedLibraryUpdater {
        public AndroidTestRunnerSplitUpdater() { super(); }
        public void updatePackage(android.content.pm.PackageParser.Package p0) {}
    }
}
