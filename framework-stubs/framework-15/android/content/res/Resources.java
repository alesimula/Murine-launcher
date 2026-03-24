package android.content.res;

public class Resources {
    public static final int ID_NULL = 0;
    static final java.lang.String TAG = "Resources";
    static android.content.res.Resources mSystem;
    final android.util.Pools.SynchronizedPool<android.content.res.TypedArray> mTypedArrayPool = null;
    final java.lang.ClassLoader mClassLoader = null;
    public static int selectDefaultTheme(int p0, int p1) { return 0; }
    public static int selectSystemTheme(int p0, int p1, int p2, int p3, int p4, int p5) { return 0; }
    public static android.content.res.Resources getSystem() { return null; }
    @java.lang.Deprecated
    public Resources(android.content.res.AssetManager p0, android.util.DisplayMetrics p1, android.content.res.Configuration p2) {}
    public Resources(java.lang.ClassLoader p0) {}
    public void setImpl(android.content.res.ResourcesImpl p0) {}
    public void setCallbacks(android.content.res.Resources.UpdateCallbacks p0) {}
    public android.content.res.ResourcesImpl getImpl() { return null; }
    public java.lang.ClassLoader getClassLoader() { return null; }
    public final android.graphics.drawable.DrawableInflater getDrawableInflater() { return null; }
    public android.content.res.ConfigurationBoundResourceCache<android.animation.Animator> getAnimatorCache() { return null; }
    public android.content.res.ConfigurationBoundResourceCache<android.animation.StateListAnimator> getStateListAnimatorCache() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getText(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public android.graphics.Typeface getFont(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    android.graphics.Typeface getFont(android.util.TypedValue p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    public void preloadFonts(int p0) {}
    @android.annotation.NonNull
    public java.lang.CharSequence getQuantityText(int p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public java.lang.String getString(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public java.lang.String getString(int p0, java.lang.Object... p1) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public java.lang.String getQuantityString(int p0, int p1, java.lang.Object... p2) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public java.lang.String getQuantityString(int p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    public java.lang.CharSequence getText(int p0, java.lang.CharSequence p1) { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence[] getTextArray(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getStringArray(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public int[] getIntArray(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public android.content.res.TypedArray obtainTypedArray(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    public float getDimension(int p0) throws android.content.res.Resources.NotFoundException { return 0.0f; }
    public int getDimensionPixelOffset(int p0) throws android.content.res.Resources.NotFoundException { return 0; }
    public int getDimensionPixelSize(int p0) throws android.content.res.Resources.NotFoundException { return 0; }
    public float getFraction(int p0, int p1, int p2) { return 0.0f; }
    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getDrawable(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    public android.graphics.drawable.Drawable getDrawable(int p0, android.content.res.Resources.Theme p1) throws android.content.res.Resources.NotFoundException { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getDrawableForDensity(int p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getDrawableForDensity(int p0, int p1, android.content.res.Resources.Theme p2) { return null; }
    @android.annotation.NonNull
    android.graphics.drawable.Drawable loadDrawable(android.util.TypedValue p0, int p1, int p2, android.content.res.Resources.Theme p3) throws android.content.res.Resources.NotFoundException { return null; }
    @java.lang.Deprecated
    public android.graphics.Movie getMovie(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @java.lang.Deprecated
    public int getColor(int p0) throws android.content.res.Resources.NotFoundException { return 0; }
    public int getColor(int p0, android.content.res.Resources.Theme p1) throws android.content.res.Resources.NotFoundException { return 0; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.content.res.ColorStateList getColorStateList(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public android.content.res.ColorStateList getColorStateList(int p0, android.content.res.Resources.Theme p1) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    android.content.res.ColorStateList loadColorStateList(android.util.TypedValue p0, int p1, android.content.res.Resources.Theme p2) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public android.content.res.ComplexColor loadComplexColor(android.util.TypedValue p0, int p1, android.content.res.Resources.Theme p2) { return null; }
    public boolean getBoolean(int p0) throws android.content.res.Resources.NotFoundException { return false; }
    public int getInteger(int p0) throws android.content.res.Resources.NotFoundException { return 0; }
    public float getFloat(int p0) { return 0.0f; }
    @android.annotation.NonNull
    public android.content.res.XmlResourceParser getLayout(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public android.content.res.XmlResourceParser getAnimation(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public android.content.res.XmlResourceParser getXml(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public java.io.InputStream openRawResource(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public java.io.InputStream openRawResource(int p0, android.util.TypedValue p1) throws android.content.res.Resources.NotFoundException { return null; }
    public android.content.res.AssetFileDescriptor openRawResourceFd(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    public void getValue(int p0, android.util.TypedValue p1, boolean p2) throws android.content.res.Resources.NotFoundException {}
    public void getValueForDensity(int p0, int p1, android.util.TypedValue p2, boolean p3) throws android.content.res.Resources.NotFoundException {}
    public void getValue(java.lang.String p0, android.util.TypedValue p1, boolean p2) throws android.content.res.Resources.NotFoundException {}
    public static int getAttributeSetSourceResId(android.util.AttributeSet p0) { return 0; }
    static int nextPowerOf2(int p0) { return 0; }
    public final android.content.res.Resources.Theme newTheme() { return null; }
    public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet p0, int[] p1) { return null; }
    @java.lang.Deprecated
    public void updateConfiguration(android.content.res.Configuration p0, android.util.DisplayMetrics p1) {}
    public void updateConfiguration(android.content.res.Configuration p0, android.util.DisplayMetrics p1, android.content.res.CompatibilityInfo p2) {}
    public static void updateSystemConfiguration(android.content.res.Configuration p0, android.util.DisplayMetrics p1, android.content.res.CompatibilityInfo p2) {}
    public android.util.DisplayMetrics getDisplayMetrics() { return null; }
    public android.view.DisplayAdjustments getDisplayAdjustments() { return null; }
    public boolean hasOverrideDisplayAdjustments() { return false; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public android.content.res.Configuration[] getSizeConfigurations() { return null; }
    public android.content.res.Configuration[] getSizeAndUiModeConfigurations() { return null; }
    public android.content.res.CompatibilityInfo getCompatibilityInfo() { return null; }
    public void setCompatibilityInfo(android.content.res.CompatibilityInfo p0) {}
    public int getIdentifier(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public static boolean resourceHasPackage(int p0) { return false; }
    public java.lang.String getResourceName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    public java.lang.String getResourcePackageName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    public java.lang.String getResourceTypeName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    public java.lang.String getResourceEntryName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    public java.lang.String getLastResourceResolution() throws android.content.res.Resources.NotFoundException { return null; }
    public void parseBundleExtras(android.content.res.XmlResourceParser p0, android.os.Bundle p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void parseBundleExtra(java.lang.String p0, android.util.AttributeSet p1, android.os.Bundle p2) throws org.xmlpull.v1.XmlPullParserException {}
    public final android.content.res.AssetManager getAssets() { return null; }
    public final void flushLayoutCache() {}
    public final void startPreloading() {}
    public final void finishPreloading() {}
    public android.util.LongSparseArray<android.graphics.drawable.Drawable.ConstantState> getPreloadedDrawables() { return null; }
    @android.annotation.NonNull
    android.content.res.XmlResourceParser loadXmlResourceParser(int p0, java.lang.String p1) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    android.content.res.XmlResourceParser loadXmlResourceParser(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.content.res.Resources.NotFoundException { return null; }
    public int calcConfigChanges(android.content.res.Configuration p0) { return 0; }
    public static android.content.res.TypedArray obtainAttributes(android.content.res.Resources p0, android.content.res.Resources.Theme p1, android.util.AttributeSet p2, int[] p3) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.res.loader.ResourcesLoader> getLoaders() { return null; }
    public void addLoaders(android.content.res.loader.ResourcesLoader... p0) {}
    public void removeLoaders(android.content.res.loader.ResourcesLoader... p0) {}
    public void clearLoaders() {}
    public static void preloadResources() {}
    public static void resetPreloadDrawableStateCache() {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public static void dumpHistory(java.io.PrintWriter p0, java.lang.String p1) {}
    @android.annotation.FlaggedApi("android.content.res.register_resource_paths")
    public static void registerResourcePaths(java.lang.String p0, android.content.pm.ApplicationInfo p1) {}

    public class AssetManagerUpdateHandler implements android.content.res.Resources.UpdateCallbacks {
        public AssetManagerUpdateHandler(android.content.res.Resources p0) {}
        public void onLoadersChanged(android.content.res.Resources p0, java.util.List<android.content.res.loader.ResourcesLoader> p1) {}
        public void onLoaderUpdated(android.content.res.loader.ResourcesLoader p0) {}
    }

    public static class NotFoundException extends java.lang.RuntimeException {
        public NotFoundException() { super(); }
        public NotFoundException(java.lang.String p0) { super(); }
        public NotFoundException(java.lang.String p0, java.lang.Exception p1) { super(); }
    }

    public final class Theme {
        void setImpl(android.content.res.ResourcesImpl.ThemeImpl p0) {}
        public void applyStyle(int p0, boolean p1) {}
        public void setTo(android.content.res.Resources.Theme p0) {}
        @android.annotation.NonNull
        public android.content.res.TypedArray obtainStyledAttributes(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.content.res.TypedArray obtainStyledAttributes(int p0, int[] p1) throws android.content.res.Resources.NotFoundException { return null; }
        @android.annotation.NonNull
        public android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet p0, int[] p1, int p2, int p3) { return null; }
        @android.annotation.NonNull
        public android.content.res.TypedArray resolveAttributes(int[] p0, int[] p1) { return null; }
        public boolean resolveAttribute(int p0, android.util.TypedValue p1, boolean p2) { return false; }
        public int[] getAllAttributes() { return null; }
        public android.content.res.Resources getResources() { return null; }
        public android.graphics.drawable.Drawable getDrawable(int p0) throws android.content.res.Resources.NotFoundException { return null; }
        public int getChangingConfigurations() { return 0; }
        public void dump(int p0, java.lang.String p1, java.lang.String p2) {}
        long getNativeTheme() { return 0L; }
        int getAppliedStyleResId() { return 0; }
        int getParentThemeIdentifier(int p0) { return 0; }
        public android.content.res.Resources.ThemeKey getKey() { return null; }
        @android.view.ViewDebug.ExportedProperty(category="theme", hasAdjacentMapping=true)
        public java.lang.String[] getTheme() { return null; }
        public void encode(android.view.ViewHierarchyEncoder p0) {}
        public void rebase() {}
        void rebase(android.content.res.ResourcesImpl p0) {}
        public int getExplicitStyle(android.util.AttributeSet p0) { return 0; }
        @android.annotation.NonNull
        public int[] getAttributeResolutionStack(int p0, int p1, int p2) { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    static class ThemeKey implements java.lang.Cloneable {
        int[] mResId;
        boolean[] mForce;
        int mCount;
        ThemeKey() {}
        public void append(int p0, boolean p1) {}
        public void setTo(android.content.res.Resources.ThemeKey p0) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.content.res.Resources.ThemeKey clone() { return null; }
    }

    public static interface UpdateCallbacks extends android.content.res.loader.ResourcesLoader.UpdateCallbacks {
        public void onLoadersChanged(android.content.res.Resources p0, java.util.List<android.content.res.loader.ResourcesLoader> p1);
    }
}
