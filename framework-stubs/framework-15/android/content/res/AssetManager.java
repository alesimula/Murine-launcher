package android.content.res;

public final class AssetManager implements java.lang.AutoCloseable {
    static android.content.res.AssetManager sSystem;
    public static final int COOKIE_UNKNOWN = -1;
    public static final int ACCESS_UNKNOWN = 0;
    public static final int ACCESS_RANDOM = 1;
    public static final int ACCESS_STREAMING = 2;
    public static final int ACCESS_BUFFER = 3;
    public AssetManager() {}
    public static void createSystemAssetsInZygoteLocked(boolean p0, java.lang.String p1) {}
    public static android.content.res.AssetManager getSystem() { return null; }
    public void close() {}
    public void setApkAssets(android.content.res.ApkAssets[] p0, boolean p1) {}
    void setLoaders(java.util.List<android.content.res.loader.ResourcesLoader> p0) {}
    @android.annotation.NonNull
    public android.content.res.ApkAssets[] getApkAssets() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getApkPaths() { return null; }
    public int findCookieForPath(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public int addAssetPath(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public int addAssetPathAsSharedLibrary(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public int addOverlayPath(java.lang.String p0) { return 0; }
    public void addPresetApkKeys(java.util.List<android.app.ResourcesManager.ApkKey> p0) {}
    @android.annotation.NonNull
    public java.util.List<android.content.res.loader.ResourcesLoader> getLoaders() { return null; }
    boolean getResourceValue(int p0, int p1, android.util.TypedValue p2, boolean p3) { return false; }
    @android.annotation.Nullable
    java.lang.CharSequence getResourceText(int p0) { return null; }
    @android.annotation.Nullable
    java.lang.CharSequence getResourceBagText(int p0, int p1) { return null; }
    int getResourceArraySize(int p0) { return 0; }
    int getResourceArray(int p0, int[] p1) { return 0; }
    @android.annotation.Nullable
    java.lang.String[] getResourceStringArray(int p0) { return null; }
    @android.annotation.Nullable
    java.lang.CharSequence[] getResourceTextArray(int p0) { return null; }
    @android.annotation.Nullable
    int[] getResourceIntArray(int p0) { return null; }
    int[] getStyleAttributes(int p0) { return null; }
    boolean getThemeValue(long p0, int p1, android.util.TypedValue p2, boolean p3) { return false; }
    void dumpTheme(long p0, int p1, java.lang.String p2, java.lang.String p3) {}
    @android.annotation.Nullable
    java.lang.String getResourceName(int p0) { return null; }
    @android.annotation.Nullable
    java.lang.String getResourcePackageName(int p0) { return null; }
    @android.annotation.Nullable
    java.lang.String getResourceTypeName(int p0) { return null; }
    @android.annotation.Nullable
    java.lang.String getResourceEntryName(int p0) { return null; }
    int getResourceIdentifier(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    int getParentThemeIdentifier(int p0) { return 0; }
    public void setResourceResolutionLoggingEnabled(boolean p0) {}
    @android.annotation.Nullable
    public java.lang.String getLastResourceResolution() { return null; }
    public boolean containsAllocatedTable() { return false; }
    @android.annotation.Nullable
    java.lang.CharSequence getPooledStringForCookie(int p0, int p1) { return null; }
    @android.annotation.NonNull
    public java.io.InputStream open(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public java.io.InputStream open(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public android.content.res.AssetFileDescriptor openFd(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public java.lang.String[] list(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public java.io.InputStream openNonAsset(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public java.io.InputStream openNonAsset(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public java.io.InputStream openNonAsset(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public java.io.InputStream openNonAsset(int p0, java.lang.String p1, int p2) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public android.content.res.AssetFileDescriptor openNonAssetFd(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public android.content.res.AssetFileDescriptor openNonAssetFd(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public android.content.res.XmlResourceParser openXmlResourceParser(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public android.content.res.XmlResourceParser openXmlResourceParser(int p0, java.lang.String p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    android.content.res.XmlBlock openXmlBlockAsset(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
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
    android.content.res.Configuration[] getSizeAndUiModeConfigurations() { return null; }
    public void setConfiguration(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, int p13, int p14, int p15, int p16, int p17, int p18) {}
    public void setConfiguration(int p0, int p1, java.lang.String p2, java.lang.String[] p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, int p13, int p14, int p15, int p16, int p17, int p18, int p19) {}
    void setConfigurationInternal(int p0, int p1, java.lang.String p2, java.lang.String[] p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, int p13, int p14, int p15, int p16, int p17, int p18, int p19, boolean p20) {}
    public android.util.SparseArray<java.lang.String> getAssignedPackageIdentifiers() { return null; }
    public android.util.SparseArray<java.lang.String> getAssignedPackageIdentifiers(boolean p0, boolean p1) { return null; }
    @android.annotation.Nullable
    public java.util.Map<java.lang.String, java.lang.String> getOverlayableMap(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getOverlayablesToString(java.lang.String p0) { return null; }
    synchronized void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    static native int nativeThemeGetChangingConfigurations(long p0);
    public static native int getGlobalAssetCount();
    public static native java.lang.String getAssetAllocations();
    public static native int getGlobalAssetManagerCount();

    public final class AssetInputStream extends java.io.InputStream {
        public final int getAssetInt() { return 0; }
        public final long getNativeAsset() { return 0L; }
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
    }

    public static class Builder {
        public Builder() {}
        public android.content.res.AssetManager.Builder addApkAssets(android.content.res.ApkAssets p0) { return null; }
        public android.content.res.AssetManager.Builder addLoader(android.content.res.loader.ResourcesLoader p0) { return null; }
        public android.content.res.AssetManager.Builder setNoInit() { return null; }
        public android.content.res.AssetManager build() { return null; }
    }
}
