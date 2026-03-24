package android.content.res;

public final class ApkAssets {
    public static final int PROPERTY_SYSTEM = 1;
    public static final int PROPERTY_DYNAMIC = 2;
    public static final int PROPERTY_LOADER = 4;
    public static final int PROPERTY_DISABLE_INCREMENTAL_HARDENING = 16;
    public static final int PROPERTY_ONLY_OVERLAYABLES = 32;
    @android.annotation.NonNull
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0, int p1, android.content.res.loader.AssetsProvider p2) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.content.res.ApkAssets loadFromFd(java.io.FileDescriptor p0, java.lang.String p1, int p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.content.res.ApkAssets loadFromFd(java.io.FileDescriptor p0, java.lang.String p1, long p2, long p3, int p4, android.content.res.loader.AssetsProvider p5) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.content.res.ApkAssets loadOverlayFromPath(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.content.res.ApkAssets loadTableFromFd(java.io.FileDescriptor p0, java.lang.String p1, int p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.content.res.ApkAssets loadTableFromFd(java.io.FileDescriptor p0, java.lang.String p1, long p2, long p3, int p4, android.content.res.loader.AssetsProvider p5) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.content.res.ApkAssets loadFromDir(java.lang.String p0, int p1, android.content.res.loader.AssetsProvider p2) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.content.res.ApkAssets loadEmptyForLoader(int p0, android.content.res.loader.AssetsProvider p1) { return null; }
    @android.annotation.NonNull
    public java.lang.String getAssetPath() { return null; }
    @android.annotation.NonNull
    public java.lang.String getDebugName() { return null; }
    @android.annotation.Nullable
    java.lang.CharSequence getStringFromPool(int p0) { return null; }
    public boolean isForLoader() { return false; }
    @android.annotation.Nullable
    public android.content.res.loader.AssetsProvider getAssetsProvider() { return null; }
    @android.annotation.NonNull
    public android.content.res.XmlResourceParser openXml(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public android.content.om.OverlayableInfo getOverlayableInfo(java.lang.String p0) throws java.io.IOException { return null; }
    public boolean definesOverlayable() throws java.io.IOException { return false; }
    public boolean isUpToDate() { return false; }
    public java.lang.String toString() { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public void close() {}
    void dump(java.io.PrintWriter p0, java.lang.String p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FormatType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PropertyFlags {
    }
}
