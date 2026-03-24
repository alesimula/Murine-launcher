package android.graphics;

public class Typeface {
    private static java.lang.String TAG;
    public static final android.graphics.Typeface DEFAULT = null;
    public static final android.graphics.Typeface DEFAULT_BOLD = null;
    public static final android.graphics.Typeface SANS_SERIF = null;
    public static final android.graphics.Typeface SERIF = null;
    public static final android.graphics.Typeface MONOSPACE = null;
    @android.annotation.UnsupportedAppUsage(trackingBug=123769446L)
    static android.graphics.Typeface[] sDefaults;
    private static final android.util.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sStyledTypefaceCache = null;
    private static final java.lang.Object sStyledCacheLock = null;
    private static final android.util.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache = null;
    private static final java.lang.Object sWeightCacheLock = null;
    private static final android.util.LruCache<java.lang.String, android.graphics.Typeface> sDynamicTypefaceCache = null;
    private static final java.lang.Object sDynamicCacheLock = null;
    static android.graphics.Typeface sDefaultTypeface;
    @android.annotation.UnsupportedAppUsage(trackingBug=123769347L)
    static final java.util.Map<java.lang.String, android.graphics.Typeface> sSystemFontMap = null;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    static final java.util.Map<java.lang.String, android.graphics.FontFamily[]> sSystemFallbackMap = null;
    @android.annotation.UnsupportedAppUsage
    public long native_instance;
    public static final int NORMAL = 0;
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int BOLD_ITALIC = 3;
    public static final int STYLE_MASK = 3;
    @android.annotation.UnsupportedAppUsage
    private int mStyle;
    private int mWeight;
    public static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final java.lang.String DEFAULT_FAMILY = "sans-serif";
    private static final int STYLE_NORMAL = 0;
    private static final int STYLE_ITALIC = 1;
    private int[] mSupportedAxes;
    private static final int[] EMPTY_AXES = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private static void setDefault(android.graphics.Typeface p0) {}
    public int getWeight() { return 0; }
    public int getStyle() { return 0; }
    public final boolean isBold() { return false; }
    public final boolean isItalic() { return false; }
    public static android.graphics.Typeface createFromResources(android.content.res.FontResourcesParser.FamilyResourceEntry p0, android.content.res.AssetManager p1, java.lang.String p2) { return null; }
    public static android.graphics.Typeface findFromCache(android.content.res.AssetManager p0, java.lang.String p1) { return null; }
    public static android.graphics.Typeface create(java.lang.String p0, int p1) { return null; }
    public static android.graphics.Typeface create(android.graphics.Typeface p0, int p1) { return null; }
    public static android.graphics.Typeface create(android.graphics.Typeface p0, int p1, boolean p2) { return null; }
    private static android.graphics.Typeface createWeightStyle(android.graphics.Typeface p0, int p1, boolean p2) { return null; }
    public static android.graphics.Typeface createFromTypefaceWithVariation(android.graphics.Typeface p0, java.util.List<android.graphics.fonts.FontVariationAxis> p1) { return null; }
    public static android.graphics.Typeface defaultFromStyle(int p0) { return null; }
    public static android.graphics.Typeface createFromAsset(android.content.res.AssetManager p0, java.lang.String p1) { return null; }
    private static java.lang.String createProviderUid(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.graphics.Typeface createFromFile(java.io.File p0) { return null; }
    public static android.graphics.Typeface createFromFile(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    private static android.graphics.Typeface createFromFamilies(android.graphics.FontFamily[] p0) { return null; }
    private static android.graphics.Typeface createFromFamilies(android.graphics.fonts.FontFamily[] p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(trackingBug=123768395L)
    private static android.graphics.Typeface createFromFamiliesWithDefault(android.graphics.FontFamily[] p0, int p1, int p2) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(trackingBug=123768928L)
    private static android.graphics.Typeface createFromFamiliesWithDefault(android.graphics.FontFamily[] p0, java.lang.String p1, int p2, int p3) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private Typeface(long p0) {}
    private static android.graphics.Typeface getSystemDefaultTypeface(java.lang.String p0) { return null; }
    public static void initSystemDefaultTypefaces(java.util.Map<java.lang.String, android.graphics.Typeface> p0, java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> p1, android.text.FontConfig.Alias[] p2) {}
    private static void registerGenericFamilyNative(java.lang.String p0, android.graphics.Typeface p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isSupportedAxes(int p0) { return false; }
    private static native long nativeCreateFromTypeface(long p0, int p1);
    private static native long nativeCreateFromTypefaceWithExactStyle(long p0, int p1, boolean p2);
    private static native long nativeCreateFromTypefaceWithVariation(long p0, java.util.List<android.graphics.fonts.FontVariationAxis> p1);
    @android.annotation.UnsupportedAppUsage
    private static native long nativeCreateWeightAlias(long p0, int p1);
    @android.annotation.UnsupportedAppUsage
    private static native long nativeCreateFromArray(long[] p0, int p1, int p2);
    private static native int[] nativeGetSupportedAxes(long p0);
    private static native void nativeSetDefault(long p0);
    private static native int nativeGetStyle(long p0);
    private static native int nativeGetWeight(long p0);
    private static native long nativeGetReleaseFunc();
    private static native void nativeRegisterGenericFamily(java.lang.String p0, long p1);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Style {
    }

    public static final class CustomFallbackBuilder {
        private static final int MAX_CUSTOM_FALLBACK = 64;
        private final java.util.ArrayList<android.graphics.fonts.FontFamily> mFamilies = null;
        private java.lang.String mFallbackName;
        private android.graphics.fonts.FontStyle mStyle;
        public static int getMaxCustomFallbackCount() { return 0; }
        public CustomFallbackBuilder(android.graphics.fonts.FontFamily p0) {}
        public android.graphics.Typeface.CustomFallbackBuilder setSystemFallback(java.lang.String p0) { return null; }
        public android.graphics.Typeface.CustomFallbackBuilder setStyle(android.graphics.fonts.FontStyle p0) { return null; }
        public android.graphics.Typeface.CustomFallbackBuilder addCustomFallback(android.graphics.fonts.FontFamily p0) { return null; }
        public android.graphics.Typeface build() { return null; }
    }

    public static final class Builder {
        public static final int NORMAL_WEIGHT = 400;
        public static final int BOLD_WEIGHT = 700;
        private final android.content.res.AssetManager mAssetManager = null;
        private final java.lang.String mPath = null;
        private final android.graphics.fonts.Font.Builder mFontBuilder = null;
        private java.lang.String mFallbackFamilyName;
        private int mWeight;
        private int mItalic;
        public Builder(java.io.File p0) {}
        public Builder(java.io.FileDescriptor p0) {}
        public Builder(java.lang.String p0) {}
        public Builder(android.content.res.AssetManager p0, java.lang.String p1) {}
        public Builder(android.content.res.AssetManager p0, java.lang.String p1, boolean p2, int p3) {}
        public android.graphics.Typeface.Builder setWeight(int p0) { return null; }
        public android.graphics.Typeface.Builder setItalic(boolean p0) { return null; }
        public android.graphics.Typeface.Builder setTtcIndex(int p0) { return null; }
        public android.graphics.Typeface.Builder setFontVariationSettings(java.lang.String p0) { return null; }
        public android.graphics.Typeface.Builder setFontVariationSettings(android.graphics.fonts.FontVariationAxis[] p0) { return null; }
        public android.graphics.Typeface.Builder setFallback(java.lang.String p0) { return null; }
        private static java.lang.String createAssetUid(android.content.res.AssetManager p0, java.lang.String p1, int p2, android.graphics.fonts.FontVariationAxis[] p3, int p4, int p5, java.lang.String p6) { return null; }
        private android.graphics.Typeface resolveFallbackTypeface() { return null; }
        public android.graphics.Typeface build() { return null; }
    }
}
