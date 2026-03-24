package android.content.res;

public final class ApkAssets {
    private final long mNativePtr = 0L;
    private final android.content.res.StringBlock mStringBlock = null;
    private boolean mOpen;
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0, boolean p1) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0, boolean p1, boolean p2) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromFd(java.io.FileDescriptor p0, java.lang.String p1, boolean p2, boolean p3) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadOverlayFromPath(java.lang.String p0, boolean p1) throws java.io.IOException { return null; }
    private ApkAssets(java.lang.String p0, boolean p1, boolean p2, boolean p3) throws java.io.IOException {}
    private ApkAssets(java.io.FileDescriptor p0, java.lang.String p1, boolean p2, boolean p3) throws java.io.IOException {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getAssetPath() { return null; }
    java.lang.CharSequence getStringFromPool(int p0) { return null; }
    public android.content.res.XmlResourceParser openXml(java.lang.String p0) throws java.io.IOException { return null; }
    public boolean isUpToDate() { return false; }
    public java.lang.String toString() { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public void close() throws java.lang.Throwable {}
    private static native long nativeLoad(java.lang.String p0, boolean p1, boolean p2, boolean p3) throws java.io.IOException;
    private static native long nativeLoadFromFd(java.io.FileDescriptor p0, java.lang.String p1, boolean p2, boolean p3) throws java.io.IOException;
    private static native void nativeDestroy(long p0);
    private static native java.lang.String nativeGetAssetPath(long p0);
    private static native long nativeGetStringBlock(long p0);
    private static native boolean nativeIsUpToDate(long p0);
    private static native long nativeOpenXml(long p0, java.lang.String p1) throws java.io.IOException;
}
