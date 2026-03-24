package android.content.pm;

public class PackageList implements android.content.pm.PackageManagerInternal.PackageListObserver, java.lang.AutoCloseable {
    private final android.content.pm.PackageManagerInternal.PackageListObserver mWrappedObserver = null;
    private final java.util.List<java.lang.String> mPackageNames = null;
    public PackageList(java.util.List<java.lang.String> p0, android.content.pm.PackageManagerInternal.PackageListObserver p1) {}
    public void onPackageAdded(java.lang.String p0, int p1) {}
    public void onPackageRemoved(java.lang.String p0, int p1) {}
    public void close() throws java.lang.Exception {}
    public java.util.List<java.lang.String> getPackageNames() { return null; }
}
