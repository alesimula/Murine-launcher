package android.content.res;

public final class AssetManager implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "AssetManager";
    private static final boolean DEBUG_REFS = false;
    private static final boolean FEATURE_FLAG_IDMAP2 = true;
    private static final java.lang.String FRAMEWORK_APK_PATH = "/system/framework/framework-res.apk";
    private static final java.lang.Object sSync = null;
    private static final android.content.res.ApkAssets[] sEmptyApkAssets = null;
    @android.annotation.UnsupportedAppUsage
    static android.content.res.AssetManager sSystem;
    private static android.content.res.ApkAssets[] sSystemApkAssets;
    private static android.util.ArraySet<android.content.res.ApkAssets> sSystemApkAssetsSet;
    public static final int ACCESS_UNKNOWN = 0;
    public static final int ACCESS_RANDOM = 1;
    public static final int ACCESS_STREAMING = 2;
    public static final int ACCESS_BUFFER = 3;
    private final android.util.TypedValue mValue = null;
    private final long[] mOffsets = null;
    @android.annotation.UnsupportedAppUsage
    private long mObject;
    private android.content.res.ApkAssets[] mApkAssets;
    private boolean mOpen;
    private int mNumRefs;
    private java.util.HashMap<java.lang.Long, java.lang.RuntimeException> mRefStacks;
    @android.annotation.UnsupportedAppUsage
    public AssetManager() {}
    private AssetManager(boolean p0) {}
    private static void createSystemAssetsInZygoteLocked() {}
    private static void loadStaticRuntimeOverlays(java.util.ArrayList<android.content.res.ApkAssets> p0) throws java.io.IOException {}
    @android.annotation.UnsupportedAppUsage
    public static android.content.res.AssetManager getSystem() { return null; }
    public void close() {}
    public void setApkAssets(android.content.res.ApkAssets[] p0, boolean p1) {}
    private void invalidateCachesLocked(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.content.res.ApkAssets[] getApkAssets() { return null; }
    public java.lang.String[] getApkPaths() { return null; }
    public int findCookieForPath(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public int addAssetPath(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public int addAssetPathAsSharedLibrary(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public int addOverlayPath(java.lang.String p0) { return 0; }
    private int addAssetPathInternal(java.lang.String p0, boolean p1, boolean p2) { return 0; }
    private void ensureValidLocked() {}
    private void ensureOpenLocked() {}
    @android.annotation.UnsupportedAppUsage
    boolean getResourceValue(int p0, int p1, android.util.TypedValue p2, boolean p3) { return false; }
    @android.annotation.UnsupportedAppUsage
    java.lang.CharSequence getResourceText(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    java.lang.CharSequence getResourceBagText(int p0, int p1) { return null; }
    int getResourceArraySize(int p0) { return 0; }
    int getResourceArray(int p0, int[] p1) { return 0; }
    java.lang.String[] getResourceStringArray(int p0) { return null; }
    java.lang.CharSequence[] getResourceTextArray(int p0) { return null; }
    int[] getResourceIntArray(int p0) { return null; }
    int[] getStyleAttributes(int p0) { return null; }
    boolean getThemeValue(long p0, int p1, android.util.TypedValue p2, boolean p3) { return false; }
    void dumpTheme(long p0, int p1, java.lang.String p2, java.lang.String p3) {}
    @android.annotation.UnsupportedAppUsage
    java.lang.String getResourceName(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    java.lang.String getResourcePackageName(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    java.lang.String getResourceTypeName(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    java.lang.String getResourceEntryName(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    int getResourceIdentifier(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public void setResourceResolutionLoggingEnabled(boolean p0) {}
    public java.lang.String getLastResourceResolution() { return null; }
    java.lang.CharSequence getPooledStringForCookie(int p0, int p1) { return null; }
    public java.io.InputStream open(java.lang.String p0) throws java.io.IOException { return null; }
    public java.io.InputStream open(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public android.content.res.AssetFileDescriptor openFd(java.lang.String p0) throws java.io.IOException { return null; }
    public java.lang.String[] list(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.io.InputStream openNonAsset(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.io.InputStream openNonAsset(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.io.InputStream openNonAsset(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.io.InputStream openNonAsset(int p0, java.lang.String p1, int p2) throws java.io.IOException { return null; }
    public android.content.res.AssetFileDescriptor openNonAssetFd(java.lang.String p0) throws java.io.IOException { return null; }
    public android.content.res.AssetFileDescriptor openNonAssetFd(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    public android.content.res.XmlResourceParser openXmlResourceParser(java.lang.String p0) throws java.io.IOException { return null; }
    public android.content.res.XmlResourceParser openXmlResourceParser(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    android.content.res.XmlBlock openXmlBlockAsset(java.lang.String p0) throws java.io.IOException { return null; }
    android.content.res.XmlBlock openXmlBlockAsset(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    void xmlBlockGone(int p0) {}
    @android.annotation.UnsupportedAppUsage
    void applyStyle(long p0, int p1, int p2, android.content.res.XmlBlock.Parser p3, int[] p4, long p5, long p6) {}
    int[] getAttributeResolutionStack(long p0, int p1, int p2, int p3) { return null; }
    @android.annotation.UnsupportedAppUsage
    boolean resolveAttrs(long p0, int p1, int p2, int[] p3, int[] p4, int[] p5, int[] p6) { return false; }
    @android.annotation.UnsupportedAppUsage
    boolean retrieveAttributes(android.content.res.XmlBlock.Parser p0, int[] p1, int[] p2, int[] p3) { return false; }
    @android.annotation.UnsupportedAppUsage
    long createTheme() { return 0L; }
    void releaseTheme(long p0) {}
    void applyStyleToTheme(long p0, int p1, boolean p2) {}
    @android.annotation.UnsupportedAppUsage
    void setThemeTo(long p0, android.content.res.AssetManager p1, long p2) {}
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.UnsupportedAppUsage
    public boolean isUpToDate() { return false; }
    public java.lang.String[] getLocales() { return null; }
    public java.lang.String[] getNonSystemLocales() { return null; }
    android.content.res.Configuration[] getSizeConfigurations() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setConfiguration(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, int p13, int p14, int p15, int p16, int p17) {}
    @android.annotation.UnsupportedAppUsage
    public android.util.SparseArray<java.lang.String> getAssignedPackageIdentifiers() { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getOverlayableMap(java.lang.String p0) { return null; }
    private void incRefsLocked(long p0) {}
    private void decRefsLocked(long p0) {}
    private static native long nativeCreate();
    private static native void nativeDestroy(long p0);
    private static native void nativeSetApkAssets(long p0, android.content.res.ApkAssets[] p1, boolean p2);
    private static native void nativeSetConfiguration(long p0, int p1, int p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, int p13, int p14, int p15, int p16, int p17, int p18);
    private static native android.util.SparseArray<java.lang.String> nativeGetAssignedPackageIdentifiers(long p0);
    private static native java.lang.String[] nativeList(long p0, java.lang.String p1) throws java.io.IOException;
    private static native long nativeOpenAsset(long p0, java.lang.String p1, int p2);
    private static native android.os.ParcelFileDescriptor nativeOpenAssetFd(long p0, java.lang.String p1, long[] p2) throws java.io.IOException;
    private static native long nativeOpenNonAsset(long p0, int p1, java.lang.String p2, int p3);
    private static native android.os.ParcelFileDescriptor nativeOpenNonAssetFd(long p0, int p1, java.lang.String p2, long[] p3) throws java.io.IOException;
    private static native long nativeOpenXmlAsset(long p0, int p1, java.lang.String p2);
    private static native int nativeGetResourceValue(long p0, int p1, short p2, android.util.TypedValue p3, boolean p4);
    private static native int nativeGetResourceBagValue(long p0, int p1, int p2, android.util.TypedValue p3);
    private static native int[] nativeGetStyleAttributes(long p0, int p1);
    private static native java.lang.String[] nativeGetResourceStringArray(long p0, int p1);
    private static native int[] nativeGetResourceStringArrayInfo(long p0, int p1);
    private static native int[] nativeGetResourceIntArray(long p0, int p1);
    private static native int nativeGetResourceArraySize(long p0, int p1);
    private static native int nativeGetResourceArray(long p0, int p1, int[] p2);
    private static native int nativeGetResourceIdentifier(long p0, java.lang.String p1, java.lang.String p2, java.lang.String p3);
    private static native java.lang.String nativeGetResourceName(long p0, int p1);
    private static native java.lang.String nativeGetResourcePackageName(long p0, int p1);
    private static native java.lang.String nativeGetResourceTypeName(long p0, int p1);
    private static native java.lang.String nativeGetResourceEntryName(long p0, int p1);
    private static native java.lang.String[] nativeGetLocales(long p0, boolean p1);
    private static native android.content.res.Configuration[] nativeGetSizeConfigurations(long p0);
    private static native void nativeSetResourceResolutionLoggingEnabled(long p0, boolean p1);
    private static native java.lang.String nativeGetLastResourceResolution(long p0);
    private static native int[] nativeAttributeResolutionStack(long p0, long p1, int p2, int p3, int p4);
    private static native void nativeApplyStyle(long p0, long p1, int p2, int p3, long p4, int[] p5, long p6, long p7);
    private static native boolean nativeResolveAttrs(long p0, long p1, int p2, int p3, int[] p4, int[] p5, int[] p6, int[] p7);
    private static native boolean nativeRetrieveAttributes(long p0, long p1, int[] p2, int[] p3, int[] p4);
    private static native long nativeThemeCreate(long p0);
    private static native void nativeThemeDestroy(long p0);
    private static native void nativeThemeApplyStyle(long p0, long p1, int p2, boolean p3);
    private static native void nativeThemeCopy(long p0, long p1, long p2, long p3);
    static native void nativeThemeClear(long p0);
    private static native int nativeThemeGetAttributeValue(long p0, long p1, int p2, android.util.TypedValue p3, boolean p4);
    private static native void nativeThemeDump(long p0, long p1, int p2, java.lang.String p3, java.lang.String p4);
    static native int nativeThemeGetChangingConfigurations(long p0);
    private static native void nativeAssetDestroy(long p0);
    private static native int nativeAssetReadChar(long p0);
    private static native int nativeAssetRead(long p0, byte[] p1, int p2, int p3);
    private static native long nativeAssetSeek(long p0, long p1, int p2);
    private static native long nativeAssetGetLength(long p0);
    private static native long nativeAssetGetRemainingLength(long p0);
    private static native void nativeVerifySystemIdmaps();
    private static native java.lang.String[] nativeCreateIdmapsForStaticOverlaysTargetingAndroid();
    private static native java.util.Map nativeGetOverlayableMap(long p0, java.lang.String p1);
    @android.annotation.UnsupportedAppUsage
    public static native int getGlobalAssetCount();
    public static native java.lang.String getAssetAllocations();
    @android.annotation.UnsupportedAppUsage
    public static native int getGlobalAssetManagerCount();

    public static class Builder {
        private java.util.ArrayList<android.content.res.ApkAssets> mUserApkAssets;
        public Builder() {}
        public android.content.res.AssetManager.Builder addApkAssets(android.content.res.ApkAssets p0) { return null; }
        public android.content.res.AssetManager build() { return null; }
    }

    public final class AssetInputStream extends java.io.InputStream {
        private long mAssetNativePtr;
        private long mLength;
        private long mMarkPos;
        @android.annotation.UnsupportedAppUsage
        public final int getAssetInt() { return 0; }
        @android.annotation.UnsupportedAppUsage
        public final long getNativeAsset() { return 0L; }
        private AssetInputStream(android.content.res.AssetManager p0, long p1) { super(); }
        public final int read() throws java.io.IOException { return 0; }
        public final int read(byte[] p0) throws java.io.IOException { return 0; }
        public final int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public final long skip(long p0) throws java.io.IOException { return 0L; }
        public final int available() throws java.io.IOException { return 0; }
        public final boolean markSupported() { return false; }
        public final void mark(int p0) {}
        public final void reset() throws java.io.IOException {}
        public final void close() throws java.io.IOException {}
        protected void finalize() throws java.lang.Throwable {}
        private void ensureOpen() {}
    }
}
