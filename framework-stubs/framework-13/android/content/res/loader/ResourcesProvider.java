package android.content.res.loader;

public class ResourcesProvider implements java.lang.AutoCloseable, java.io.Closeable {
    public static android.content.res.loader.ResourcesProvider empty(android.content.res.loader.AssetsProvider p0) { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromApk(android.os.ParcelFileDescriptor p0) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromApk(android.os.ParcelFileDescriptor p0, android.content.res.loader.AssetsProvider p1) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromApk(android.os.ParcelFileDescriptor p0, long p1, long p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromTable(android.os.ParcelFileDescriptor p0, android.content.res.loader.AssetsProvider p1) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromTable(android.os.ParcelFileDescriptor p0, long p1, long p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromSplit(android.content.Context p0, java.lang.String p1) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromDirectory(java.lang.String p0, android.content.res.loader.AssetsProvider p1) throws java.io.IOException { return null; }
    public android.content.res.ApkAssets getApkAssets() { return null; }
    final void incrementRefCount() {}
    final void decrementRefCount() {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
}
