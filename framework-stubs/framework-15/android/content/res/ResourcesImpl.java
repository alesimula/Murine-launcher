package android.content.res;

public class ResourcesImpl {
    static final java.lang.String TAG = "Resources";
    final android.content.res.AssetManager mAssets = null;
    static void resetDrawableStateCache() {}
    public ResourcesImpl(android.content.res.AssetManager p0, android.util.DisplayMetrics p1, android.content.res.Configuration p2, android.view.DisplayAdjustments p3) {}
    public android.view.DisplayAdjustments getDisplayAdjustments() { return null; }
    public android.content.res.AssetManager getAssets() { return null; }
    public android.util.DisplayMetrics getMetrics() { return null; }
    android.util.DisplayMetrics getDisplayMetrics() { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    android.content.res.Configuration[] getSizeConfigurations() { return null; }
    android.content.res.Configuration[] getSizeAndUiModeConfigurations() { return null; }
    android.content.res.CompatibilityInfo getCompatibilityInfo() { return null; }
    void getValue(int p0, android.util.TypedValue p1, boolean p2) throws android.content.res.Resources.NotFoundException {}
    void getValueForDensity(int p0, int p1, android.util.TypedValue p2, boolean p3) throws android.content.res.Resources.NotFoundException {}
    void getValue(java.lang.String p0, android.util.TypedValue p1, boolean p2) throws android.content.res.Resources.NotFoundException {}
    int getIdentifier(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    @android.annotation.NonNull
    java.lang.String getResourceName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    java.lang.String getResourcePackageName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    java.lang.String getResourceTypeName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    java.lang.String getResourceEntryName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    java.lang.String getLastResourceResolution() throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    java.lang.CharSequence getQuantityText(int p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    android.content.res.AssetFileDescriptor openRawResourceFd(int p0, android.util.TypedValue p1) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    java.io.InputStream openRawResource(int p0, android.util.TypedValue p1) throws android.content.res.Resources.NotFoundException { return null; }
    android.content.res.ConfigurationBoundResourceCache<android.animation.Animator> getAnimatorCache() { return null; }
    android.content.res.ConfigurationBoundResourceCache<android.animation.StateListAnimator> getStateListAnimatorCache() { return null; }
    public void updateConfiguration(android.content.res.Configuration p0, android.util.DisplayMetrics p1, android.content.res.CompatibilityInfo p2) {}
    public int calcConfigChanges(android.content.res.Configuration p0) { return 0; }
    public void flushLayoutCache() {}
    public void clearAllCaches() {}
    @android.annotation.Nullable
    android.graphics.drawable.Drawable loadDrawable(android.content.res.Resources p0, android.util.TypedValue p1, int p2, int p3, android.content.res.Resources.Theme p4) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.Nullable
    public android.graphics.Typeface loadFont(android.content.res.Resources p0, android.util.TypedValue p1, int p2) { return null; }
    @android.annotation.Nullable
    android.content.res.ComplexColor loadComplexColor(android.content.res.Resources p0, android.util.TypedValue p1, int p2, android.content.res.Resources.Theme p3) { return null; }
    @android.annotation.NonNull
    android.content.res.ColorStateList loadColorStateList(android.content.res.Resources p0, android.util.TypedValue p1, int p2, android.content.res.Resources.Theme p3) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    android.content.res.XmlResourceParser loadXmlResourceParser(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.content.res.Resources.NotFoundException { return null; }
    public final void startPreloading() {}
    void finishPreloading() {}
    static int getAttributeSetSourceResId(android.util.AttributeSet p0) { return 0; }
    android.util.LongSparseArray<android.graphics.drawable.Drawable.ConstantState> getPreloadedDrawables() { return null; }
    android.content.res.ResourcesImpl.ThemeImpl newThemeImpl() { return null; }
    void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public int getAppliedSharedLibsHash() { return 0; }

    private static class LookupStack {
        public void push(int p0) {}
        public boolean contains(int p0) { return false; }
        public void pop() {}
    }

    public class ThemeImpl {
        ThemeImpl(android.content.res.ResourcesImpl p0) {}
        protected void finalize() throws java.lang.Throwable {}
        android.content.res.Resources.ThemeKey getKey() { return null; }
        long getNativeTheme() { return 0L; }
        int getAppliedStyleResId() { return 0; }
        int getParentThemeIdentifier(int p0) { return 0; }
        void applyStyle(int p0, boolean p1) {}
        void setTo(android.content.res.ResourcesImpl.ThemeImpl p0) {}
        @android.annotation.NonNull
        android.content.res.TypedArray obtainStyledAttributes(android.content.res.Resources.Theme p0, android.util.AttributeSet p1, int[] p2, int p3, int p4) { return null; }
        @android.annotation.NonNull
        android.content.res.TypedArray resolveAttributes(android.content.res.Resources.Theme p0, int[] p1, int[] p2) { return null; }
        boolean resolveAttribute(int p0, android.util.TypedValue p1, boolean p2) { return false; }
        int[] getAllAttributes() { return null; }
        int getChangingConfigurations() { return 0; }
        public void dump(int p0, java.lang.String p1, java.lang.String p2) {}
        java.lang.String[] getTheme() { return null; }
        void rebase() {}
        void rebase(android.content.res.AssetManager p0) {}
        @android.annotation.Nullable
        public int[] getAttributeResolutionStack(int p0, int p1, int p2) { return null; }
    }
}
