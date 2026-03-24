package android.content.res;

public class ResourcesImpl {
    static final java.lang.String TAG = "Resources";
    private static final boolean DEBUG_LOAD = false;
    private static final boolean DEBUG_CONFIG = false;
    static final java.lang.String TAG_PRELOAD = "Resources.preload";
    @android.annotation.UnsupportedAppUsage
    private static final boolean TRACE_FOR_PRELOAD = false;
    @android.annotation.UnsupportedAppUsage
    private static final boolean TRACE_FOR_MISS_PRELOAD = false;
    public static final boolean TRACE_FOR_DETAILED_PRELOAD = Boolean.valueOf(false);
    private static int sPreloadTracingNumLoadedDrawables;
    private long mPreloadTracingPreloadStartTime;
    private long mPreloadTracingStartBitmapSize;
    private long mPreloadTracingStartBitmapCount;
    private static final int ID_OTHER = 16777220;
    private static final java.lang.Object sSync = null;
    private static boolean sPreloaded;
    @android.annotation.UnsupportedAppUsage
    private boolean mPreloading;
    @android.annotation.UnsupportedAppUsage
    private static final android.util.LongSparseArray<android.graphics.drawable.Drawable.ConstantState>[] sPreloadedDrawables = null;
    @android.annotation.UnsupportedAppUsage
    private static final android.util.LongSparseArray<android.graphics.drawable.Drawable.ConstantState> sPreloadedColorDrawables = null;
    @android.annotation.UnsupportedAppUsage
    private static final android.util.LongSparseArray<android.content.res.ConstantState<android.content.res.ComplexColor>> sPreloadedComplexColors = null;
    @android.annotation.UnsupportedAppUsage
    private final java.lang.Object mAccessLock = null;
    private final android.content.res.Configuration mTmpConfig = null;
    @android.annotation.UnsupportedAppUsage
    private final android.content.res.DrawableCache mDrawableCache = null;
    @android.annotation.UnsupportedAppUsage
    private final android.content.res.DrawableCache mColorDrawableCache = null;
    private final android.content.res.ConfigurationBoundResourceCache<android.content.res.ComplexColor> mComplexColorCache = null;
    @android.annotation.UnsupportedAppUsage
    private final android.content.res.ConfigurationBoundResourceCache<android.animation.Animator> mAnimatorCache = null;
    @android.annotation.UnsupportedAppUsage
    private final android.content.res.ConfigurationBoundResourceCache<android.animation.StateListAnimator> mStateListAnimatorCache = null;
    private final java.lang.ThreadLocal<android.content.res.ResourcesImpl.LookupStack> mLookupStack = null;
    private static final int XML_BLOCK_CACHE_SIZE = 4;
    private int mLastCachedXmlBlockIndex;
    private final int[] mCachedXmlBlockCookies = null;
    private final java.lang.String[] mCachedXmlBlockFiles = null;
    private final android.content.res.XmlBlock[] mCachedXmlBlocks = null;
    @android.annotation.UnsupportedAppUsage
    final android.content.res.AssetManager mAssets = null;
    private final android.util.DisplayMetrics mMetrics = null;
    private final android.view.DisplayAdjustments mDisplayAdjustments = null;
    @android.annotation.UnsupportedAppUsage
    private final android.content.res.Configuration mConfiguration = null;
    @android.annotation.UnsupportedAppUsage
    public ResourcesImpl(android.content.res.AssetManager p0, android.util.DisplayMetrics p1, android.content.res.Configuration p2, android.view.DisplayAdjustments p3) {}
    public android.view.DisplayAdjustments getDisplayAdjustments() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.content.res.AssetManager getAssets() { return null; }
    @android.annotation.UnsupportedAppUsage
    android.util.DisplayMetrics getDisplayMetrics() { return null; }
    android.content.res.Configuration getConfiguration() { return null; }
    android.content.res.Configuration[] getSizeConfigurations() { return null; }
    android.content.res.CompatibilityInfo getCompatibilityInfo() { return null; }
    private android.icu.text.PluralRules getPluralRule() { return null; }
    @android.annotation.UnsupportedAppUsage
    void getValue(int p0, android.util.TypedValue p1, boolean p2) throws android.content.res.Resources.NotFoundException {}
    void getValueForDensity(int p0, int p1, android.util.TypedValue p2, boolean p3) throws android.content.res.Resources.NotFoundException {}
    void getValue(java.lang.String p0, android.util.TypedValue p1, boolean p2) throws android.content.res.Resources.NotFoundException {}
    int getIdentifier(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    java.lang.String getResourceName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    java.lang.String getResourcePackageName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    java.lang.String getResourceTypeName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    java.lang.String getResourceEntryName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    java.lang.String getLastResourceResolution() throws android.content.res.Resources.NotFoundException { return null; }
    java.lang.CharSequence getQuantityText(int p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    private static int attrForQuantityCode(java.lang.String p0) { return 0; }
    android.content.res.AssetFileDescriptor openRawResourceFd(int p0, android.util.TypedValue p1) throws android.content.res.Resources.NotFoundException { return null; }
    java.io.InputStream openRawResource(int p0, android.util.TypedValue p1) throws android.content.res.Resources.NotFoundException { return null; }
    android.content.res.ConfigurationBoundResourceCache<android.animation.Animator> getAnimatorCache() { return null; }
    android.content.res.ConfigurationBoundResourceCache<android.animation.StateListAnimator> getStateListAnimatorCache() { return null; }
    public void updateConfiguration(android.content.res.Configuration p0, android.util.DisplayMetrics p1, android.content.res.CompatibilityInfo p2) {}
    public int calcConfigChanges(android.content.res.Configuration p0) { return 0; }
    private static java.lang.String adjustLanguageTag(java.lang.String p0) { return null; }
    public void flushLayoutCache() {}
    android.graphics.drawable.Drawable loadDrawable(android.content.res.Resources p0, android.util.TypedValue p1, int p2, int p3, android.content.res.Resources.Theme p4) throws android.content.res.Resources.NotFoundException { return null; }
    private void cacheDrawable(android.util.TypedValue p0, boolean p1, android.content.res.DrawableCache p2, android.content.res.Resources.Theme p3, boolean p4, long p5, android.graphics.drawable.Drawable p6) {}
    private boolean verifyPreloadConfig(int p0, int p1, int p2, java.lang.String p3) { return false; }
    private android.graphics.drawable.Drawable decodeImageDrawable(android.content.res.AssetManager.AssetInputStream p0, android.content.res.Resources p1, android.util.TypedValue p2) { return null; }
    private android.graphics.drawable.Drawable loadDrawableForCookie(android.content.res.Resources p0, android.util.TypedValue p1, int p2, int p3) { return null; }
    private android.graphics.drawable.Drawable loadColorOrXmlDrawable(android.content.res.Resources p0, android.util.TypedValue p1, int p2, int p3, java.lang.String p4) { return null; }
    private android.graphics.drawable.Drawable loadXmlDrawable(android.content.res.Resources p0, android.util.TypedValue p1, int p2, int p3, java.lang.String p4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public android.graphics.Typeface loadFont(android.content.res.Resources p0, android.util.TypedValue p1, int p2) { return null; }
    private android.content.res.ComplexColor loadComplexColorFromName(android.content.res.Resources p0, android.content.res.Resources.Theme p1, android.util.TypedValue p2, int p3) { return null; }
    android.content.res.ComplexColor loadComplexColor(android.content.res.Resources p0, android.util.TypedValue p1, int p2, android.content.res.Resources.Theme p3) { return null; }
    android.content.res.ColorStateList loadColorStateList(android.content.res.Resources p0, android.util.TypedValue p1, int p2, android.content.res.Resources.Theme p3) throws android.content.res.Resources.NotFoundException { return null; }
    private android.content.res.ColorStateList getColorStateListFromInt(android.util.TypedValue p0, long p1) { return null; }
    private android.content.res.ComplexColor loadComplexColorForCookie(android.content.res.Resources p0, android.util.TypedValue p1, int p2, android.content.res.Resources.Theme p3) { return null; }
    android.content.res.XmlResourceParser loadXmlResourceParser(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.content.res.Resources.NotFoundException { return null; }
    public final void startPreloading() {}
    void finishPreloading() {}
    static int getAttributeSetSourceResId(android.util.AttributeSet p0) { return 0; }
    android.util.LongSparseArray<android.graphics.drawable.Drawable.ConstantState> getPreloadedDrawables() { return null; }
    android.content.res.ResourcesImpl.ThemeImpl newThemeImpl() { return null; }
    android.content.res.ResourcesImpl.ThemeImpl newThemeImpl(android.content.res.Resources.ThemeKey p0) { return null; }

    public class ThemeImpl {
        private final android.content.res.Resources.ThemeKey mKey = null;
        private final android.content.res.AssetManager mAssets = null;
        private final long mTheme = 0L;
        private int mThemeResId;
        ThemeImpl(android.content.res.ResourcesImpl p0) {}
        protected void finalize() throws java.lang.Throwable {}
        android.content.res.Resources.ThemeKey getKey() { return null; }
        long getNativeTheme() { return 0L; }
        int getAppliedStyleResId() { return 0; }
        void applyStyle(int p0, boolean p1) {}
        void setTo(android.content.res.ResourcesImpl.ThemeImpl p0) {}
        android.content.res.TypedArray obtainStyledAttributes(android.content.res.Resources.Theme p0, android.util.AttributeSet p1, int[] p2, int p3, int p4) { return null; }
        android.content.res.TypedArray resolveAttributes(android.content.res.Resources.Theme p0, int[] p1, int[] p2) { return null; }
        boolean resolveAttribute(int p0, android.util.TypedValue p1, boolean p2) { return false; }
        int[] getAllAttributes() { return null; }
        int getChangingConfigurations() { return 0; }
        public void dump(int p0, java.lang.String p1, java.lang.String p2) {}
        java.lang.String[] getTheme() { return null; }
        void rebase() {}
        public int[] getAttributeResolutionStack(int p0, int p1, int p2) { return null; }
    }

    private static class LookupStack {
        private int[] mIds;
        private int mSize;
        private LookupStack() {}
        public void push(int p0) {}
        public boolean contains(int p0) { return false; }
        public void pop() {}
    }
}
