package android.content.pm;

public abstract class PackageSharedLibraryUpdater {
    public PackageSharedLibraryUpdater() {}
    public abstract void updatePackage(android.content.pm.PackageParser.Package p0);
    static void removeLibrary(android.content.pm.PackageParser.Package p0, java.lang.String p1) {}
    static <T extends java.lang.Object> java.util.ArrayList<T> prefix(java.util.ArrayList<T> p0, T p1) { return null; }
    private static boolean isLibraryPresent(java.util.ArrayList<java.lang.String> p0, java.util.ArrayList<java.lang.String> p1, java.lang.String p2) { return false; }
    void prefixImplicitDependency(android.content.pm.PackageParser.Package p0, java.lang.String p1, java.lang.String p2) {}
    void prefixRequiredLibrary(android.content.pm.PackageParser.Package p0, java.lang.String p1) {}
}
