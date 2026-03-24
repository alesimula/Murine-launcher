package android.content.res;

public final class ApkAssets {
    public static final int PROPERTY_SYSTEM = 1;
    public static final int PROPERTY_DYNAMIC = 2;
    public static final int PROPERTY_LOADER = 4;
    private static final int PROPERTY_OVERLAY = 8;
    private static final int FORMAT_APK = 0;
    private static final int FORMAT_IDMAP = 1;
    private static final int FORMAT_ARSC = 2;
    private static final int FORMAT_DIR = 3;
    private final long mNativePtr = 0L;
    private final android.content.res.StringBlock mStringBlock = null;
    private boolean mOpen;
    private final int mFlags = 0;
    private final android.content.res.loader.AssetsProvider mAssets = null;
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0, int p1, android.content.res.loader.AssetsProvider p2) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromFd(java.io.FileDescriptor p0, java.lang.String p1, int p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromFd(java.io.FileDescriptor p0, java.lang.String p1, long p2, long p3, int p4, android.content.res.loader.AssetsProvider p5) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadOverlayFromPath(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadTableFromFd(java.io.FileDescriptor p0, java.lang.String p1, int p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadTableFromFd(java.io.FileDescriptor p0, java.lang.String p1, long p2, long p3, int p4, android.content.res.loader.AssetsProvider p5) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromDir(java.lang.String p0, int p1, android.content.res.loader.AssetsProvider p2) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadEmptyForLoader(int p0, android.content.res.loader.AssetsProvider p1) { return null; }
    private ApkAssets(int p0, java.lang.String p1, int p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException {}
    private ApkAssets(int p0, java.io.FileDescriptor p1, java.lang.String p2, int p3, android.content.res.loader.AssetsProvider p4) throws java.io.IOException {}
    private ApkAssets(int p0, java.io.FileDescriptor p1, java.lang.String p2, long p3, long p4, int p5, android.content.res.loader.AssetsProvider p6) throws java.io.IOException {}
    private ApkAssets(int p0, android.content.res.loader.AssetsProvider p1) {}
    public java.lang.String getAssetPath() { return null; }
    java.lang.CharSequence getStringFromPool(int p0) { return null; }
    public boolean isForLoader() { return false; }
    public android.content.res.loader.AssetsProvider getAssetsProvider() { return null; }
    public android.content.res.XmlResourceParser openXml(java.lang.String p0) throws java.io.IOException { return null; }
    public android.content.om.OverlayableInfo getOverlayableInfo(java.lang.String p0) throws java.io.IOException { return null; }
    public boolean definesOverlayable() throws java.io.IOException { return false; }
    public boolean isUpToDate() { return false; }
    public java.lang.String toString() { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public void close() {}
    private static native long nativeLoad(int p0, java.lang.String p1, int p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException;
    private static native long nativeLoadEmpty(int p0, android.content.res.loader.AssetsProvider p1);
    private static native long nativeLoadFd(int p0, java.io.FileDescriptor p1, java.lang.String p2, int p3, android.content.res.loader.AssetsProvider p4) throws java.io.IOException;
    private static native long nativeLoadFdOffsets(int p0, java.io.FileDescriptor p1, java.lang.String p2, long p3, long p4, int p5, android.content.res.loader.AssetsProvider p6) throws java.io.IOException;
    private static native void nativeDestroy(long p0);
    private static native java.lang.String nativeGetAssetPath(long p0);
    private static native long nativeGetStringBlock(long p0);
    private static native boolean nativeIsUpToDate(long p0);
    private static native long nativeOpenXml(long p0, java.lang.String p1) throws java.io.IOException;
    private static native android.content.om.OverlayableInfo nativeGetOverlayableInfo(long p0, java.lang.String p1) throws java.io.IOException;
    private static native boolean nativeDefinesOverlayable(long p0) throws java.io.IOException;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FormatType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PropertyFlags {
    }
}
