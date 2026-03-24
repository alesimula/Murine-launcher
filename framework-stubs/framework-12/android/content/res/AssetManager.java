package android.content.res;

public final class AssetManager implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "AssetManager";
    private static final boolean DEBUG_REFS = false;
    private static final java.lang.String FRAMEWORK_APK_PATH = "/system/framework/framework-res.apk";
    private static final java.lang.Object sSync = null;
    private static final android.content.res.ApkAssets[] sEmptyApkAssets = null;
    static android.content.res.AssetManager sSystem;
    private static android.content.res.ApkAssets[] sSystemApkAssets;
    private static android.util.ArraySet<android.content.res.ApkAssets> sSystemApkAssetsSet;
    public static final int ACCESS_UNKNOWN = 0;
    public static final int ACCESS_RANDOM = 1;
    public static final int ACCESS_STREAMING = 2;
    public static final int ACCESS_BUFFER = 3;
    private final android.util.TypedValue mValue = null;
    private final long[] mOffsets = null;
    private long mObject;
    private android.content.res.ApkAssets[] mApkAssets;
    private boolean mOpen;
    private int mNumRefs;
    private java.util.HashMap<java.lang.Long, java.lang.RuntimeException> mRefStacks;
    private android.content.res.loader.ResourcesLoader[] mLoaders;
    public AssetManager() {}
    private AssetManager(boolean p0) {}
    public static void createSystemAssetsInZygoteLocked(boolean p0, java.lang.String p1) {}
    public static android.content.res.AssetManager getSystem() { return null; }
    public void close() {}
    public void setApkAssets(android.content.res.ApkAssets[] p0, boolean p1) {}
    void setLoaders(java.util.List<android.content.res.loader.ResourcesLoader> p0) {}
    private void invalidateCachesLocked(int p0) {}
    public android.content.res.ApkAssets[] getApkAssets() { return null; }
    public java.lang.String[] getApkPaths() { return null; }
    public int findCookieForPath(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public int addAssetPath(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public int addAssetPathAsSharedLibrary(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public int addOverlayPath(java.lang.String p0) { return 0; }
    private int addAssetPathInternal(java.lang.String p0, boolean p1, boolean p2) { return 0; }
    public java.util.List<android.content.res.loader.ResourcesLoader> getLoaders() { return null; }
    private void ensureValidLocked() {}
    private void ensureOpenLocked() {}
    boolean getResourceValue(int p0, int p1, android.util.TypedValue p2, boolean p3) { return false; }
    java.lang.CharSequence getResourceText(int p0) { return null; }
    java.lang.CharSequence getResourceBagText(int p0, int p1) { return null; }
    int getResourceArraySize(int p0) { return 0; }
    int getResourceArray(int p0, int[] p1) { return 0; }
    java.lang.String[] getResourceStringArray(int p0) { return null; }
    java.lang.CharSequence[] getResourceTextArray(int p0) { return null; }
    int[] getResourceIntArray(int p0) { return null; }
    int[] getStyleAttributes(int p0) { return null; }
    boolean getThemeValue(long p0, int p1, android.util.TypedValue p2, boolean p3) { return false; }
    void dumpTheme(long p0, int p1, java.lang.String p2, java.lang.String p3) {}
    java.lang.String getResourceName(int p0) { return null; }
    java.lang.String getResourcePackageName(int p0) { return null; }
    java.lang.String getResourceTypeName(int p0) { return null; }
    java.lang.String getResourceEntryName(int p0) { return null; }
    int getResourceIdentifier(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public void setResourceResolutionLoggingEnabled(boolean p0) {}
    public java.lang.String getLastResourceResolution() { return null; }
    public boolean containsAllocatedTable() { return false; }
    java.lang.CharSequence getPooledStringForCookie(int p0, int p1) { return null; }
    public java.io.InputStream open(java.lang.String p0) throws java.io.IOException { return null; }
    public java.io.InputStream open(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public android.content.res.AssetFileDescriptor openFd(java.lang.String p0) throws java.io.IOException { return null; }
    public java.lang.String[] list(java.lang.String p0) throws java.io.IOException { return null; }
    public java.io.InputStream openNonAsset(java.lang.String p0) throws java.io.IOException { return null; }
    public java.io.InputStream openNonAsset(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public java.io.InputStream openNonAsset(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    public java.io.InputStream openNonAsset(int p0, java.lang.String p1, int p2) throws java.io.IOException { return null; }
    public android.content.res.AssetFileDescriptor openNonAssetFd(java.lang.String p0) throws java.io.IOException { return null; }
    public android.content.res.AssetFileDescriptor openNonAssetFd(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    public android.content.res.XmlResourceParser openXmlResourceParser(java.lang.String p0) throws java.io.IOException { return null; }
    public android.content.res.XmlResourceParser openXmlResourceParser(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    android.content.res.XmlBlock openXmlBlockAsset(java.lang.String p0) throws java.io.IOException { return null; }
    android.content.res.XmlBlock openXmlBlockAsset(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    void xmlBlockGone(int p0) {}
    void applyStyle(long p0, int p1, int p2, android.content.res.XmlBlock.Parser p3, int[] p4, long p5, long p6) {}
    int[] getAttributeResolutionStack(long p0, int p1, int p2, int p3) { return null; }
    boolean resolveAttrs(long p0, int p1, int p2, int[] p3, int[] p4, int[] p5, int[] p6) { return false; }
    boolean retrieveAttributes(android.content.res.XmlBlock.Parser p0, int[] p1, int[] p2, int[] p3) { return false; }
    long createTheme() { return 0L; }
    void releaseTheme(long p0) {}
    static long getThemeFreeFunction() { return 0L; }
    void applyStyleToTheme(long p0, int p1, boolean p2) {}
    android.content.res.AssetManager rebaseTheme(long p0, android.content.res.AssetManager p1, int[] p2, boolean[] p3, int p4) { return null; }
    void setThemeTo(long p0, android.content.res.AssetManager p1, long p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public boolean isUpToDate() { return false; }
    public java.lang.String[] getLocales() { return null; }
    public java.lang.String[] getNonSystemLocales() { return null; }
    android.content.res.Configuration[] getSizeConfigurations() { return null; }
    public void setConfiguration(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, int p13, int p14, int p15, int p16, int p17) {}
    public android.util.SparseArray<java.lang.String> getAssignedPackageIdentifiers() { return null; }
    public android.util.SparseArray<java.lang.String> getAssignedPackageIdentifiers(boolean p0, boolean p1) { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getOverlayableMap(java.lang.String p0) { return null; }
    public java.lang.String getOverlayablesToString(java.lang.String p0) { return null; }
    private void incRefsLocked(long p0) {}
    private void decRefsLocked(long p0) {}
    private static native long nativeCreate();
    private static native void nativeDestroy(long p0);
    private static native void nativeSetApkAssets(long p0, android.content.res.ApkAssets[] p1, boolean p2);
    private static native void nativeSetConfiguration(long p0, int p1, int p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, int p13, int p14, int p15, int p16, int p17, int p18);
    private static native android.util.SparseArray<java.lang.String> nativeGetAssignedPackageIdentifiers(long p0, boolean p1, boolean p2);
    private static native boolean nativeContainsAllocatedTable(long p0);
    private static native java.lang.String[] nativeList(long p0, java.lang.String p1) throws java.io.IOException;
    private static native long nativeOpenAsset(long p0, java.lang.String p1, int p2);
    private static native android.os.ParcelFileDescriptor nativeOpenAssetFd(long p0, java.lang.String p1, long[] p2) throws java.io.IOException;
    private static native long nativeOpenNonAsset(long p0, int p1, java.lang.String p2, int p3);
    private static native android.os.ParcelFileDescriptor nativeOpenNonAssetFd(long p0, int p1, java.lang.String p2, long[] p3) throws java.io.IOException;
    private static native long nativeOpenXmlAsset(long p0, int p1, java.lang.String p2);
    private static native long nativeOpenXmlAssetFd(long p0, int p1, java.io.FileDescriptor p2);
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
    private static native long nativeGetThemeFreeFunction();
    private static native void nativeThemeApplyStyle(long p0, long p1, int p2, boolean p3);
    private static native void nativeThemeRebase(long p0, long p1, int[] p2, boolean[] p3, int p4);
    private static native void nativeThemeCopy(long p0, long p1, long p2, long p3);
    private static native int nativeThemeGetAttributeValue(long p0, long p1, int p2, android.util.TypedValue p3, boolean p4);
    private static native void nativeThemeDump(long p0, long p1, int p2, java.lang.String p3, java.lang.String p4);
    static native int nativeThemeGetChangingConfigurations(long p0);
    private static native void nativeAssetDestroy(long p0);
    private static native int nativeAssetReadChar(long p0);
    private static native int nativeAssetRead(long p0, byte[] p1, int p2, int p3);
    private static native long nativeAssetSeek(long p0, long p1, int p2);
    private static native long nativeAssetGetLength(long p0);
    private static native long nativeAssetGetRemainingLength(long p0);
    private static native java.util.Map nativeGetOverlayableMap(long p0, java.lang.String p1);
    private static native java.lang.String nativeGetOverlayablesToString(long p0, java.lang.String p1);
    public static native int getGlobalAssetCount();
    public static native java.lang.String getAssetAllocations();
    public static native int getGlobalAssetManagerCount();

    public final class AssetInputStream extends java.io.InputStream {
        private long mAssetNativePtr;
        private long mLength;
        private long mMarkPos;
        public final int getAssetInt() { return 0; }
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

    public static class Builder {
        private java.util.ArrayList<android.content.res.ApkAssets> mUserApkAssets;
        private java.util.ArrayList<android.content.res.loader.ResourcesLoader> mLoaders;
        public Builder() {}
        public android.content.res.AssetManager.Builder addApkAssets(android.content.res.ApkAssets p0) { return null; }
        public android.content.res.AssetManager.Builder addLoader(android.content.res.loader.ResourcesLoader p0) { return null; }
        public android.content.res.AssetManager build() { return null; }
    }
}
