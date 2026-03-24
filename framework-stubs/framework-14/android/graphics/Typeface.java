package android.graphics;

public class Typeface {
    public static final boolean ENABLE_LAZY_TYPEFACE_INITIALIZATION = true;
    public static final android.graphics.Typeface DEFAULT = null;
    public static final android.graphics.Typeface DEFAULT_BOLD = null;
    public static final android.graphics.Typeface SANS_SERIF = null;
    public static final android.graphics.Typeface SERIF = null;
    public static final android.graphics.Typeface MONOSPACE = null;
    static android.graphics.Typeface[] sDefaults;
    static android.graphics.Typeface sDefaultTypeface;
    static final java.util.Map<java.lang.String, android.graphics.Typeface> sSystemFontMap = null;
    static java.nio.ByteBuffer sSystemFontMapBuffer;
    static android.os.SharedMemory sSystemFontMapSharedMemory;
    @java.lang.Deprecated
    static final java.util.Map<java.lang.String, android.graphics.FontFamily[]> sSystemFallbackMap = null;
    public final long native_instance = 0L;
    public static final int NORMAL = 0;
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int BOLD_ITALIC = 3;
    public static final int STYLE_MASK = 3;
    public static final int RESOLVE_BY_FONT_TABLE = -1;
    public static final java.lang.String DEFAULT_FAMILY = "sans-serif";
    public static android.os.SharedMemory getSystemFontMapSharedMemory() { return null; }
    public int getWeight() { return 0; }
    public int getStyle() { return 0; }
    public final boolean isBold() { return false; }
    public final boolean isItalic() { return false; }
    public final java.lang.String getSystemFontFamilyName() { return null; }
    public static android.graphics.Typeface createFromResources(android.content.res.FontResourcesParser.FamilyResourceEntry p0, android.content.res.AssetManager p1, java.lang.String p2) { return null; }
    public static android.graphics.Typeface findFromCache(android.content.res.AssetManager p0, java.lang.String p1) { return null; }
    public static android.graphics.Typeface create(java.lang.String p0, int p1) { return null; }
    public static android.graphics.Typeface create(android.graphics.Typeface p0, int p1) { return null; }
    public static android.graphics.Typeface create(android.graphics.Typeface p0, int p1, boolean p2) { return null; }
    public static android.graphics.Typeface createFromTypefaceWithVariation(android.graphics.Typeface p0, java.util.List<android.graphics.fonts.FontVariationAxis> p1) { return null; }
    public static android.graphics.Typeface defaultFromStyle(int p0) { return null; }
    public static android.graphics.Typeface createFromAsset(android.content.res.AssetManager p0, java.lang.String p1) { return null; }
    public static android.graphics.Typeface createFromFile(java.io.File p0) { return null; }
    public static android.graphics.Typeface createFromFile(java.lang.String p0) { return null; }
    public void releaseNativeObjectForTest() {}
    public static void initSystemDefaultTypefaces(java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> p0, java.util.List<android.text.FontConfig.Alias> p1, java.util.Map<java.lang.String, android.graphics.Typeface> p2) {}
    public static android.os.SharedMemory serializeFontMap(java.util.Map<java.lang.String, android.graphics.Typeface> p0) throws java.io.IOException, android.system.ErrnoException { return null; }
    public static long[] deserializeFontMap(java.nio.ByteBuffer p0, java.util.Map<java.lang.String, android.graphics.Typeface> p1) throws java.io.IOException { return null; }
    public static java.util.Map<java.lang.String, android.graphics.Typeface> getSystemFontMap() { return null; }
    public static void setSystemFontMap(android.os.SharedMemory p0) throws java.io.IOException, android.system.ErrnoException {}
    public static void setSystemFontMap(java.util.Map<java.lang.String, android.graphics.Typeface> p0) {}
    public static android.util.Pair<java.util.List<android.graphics.Typeface>, java.util.List<android.graphics.Typeface>> changeDefaultFontForTest(java.util.List<android.graphics.Typeface> p0, java.util.List<android.graphics.Typeface> p1) { return null; }
    public static void destroySystemFontMap() {}
    public static void loadPreinstalledSystemFontMap() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isSupportedAxes(int p0) { return false; }

    public static final class Builder {
        public static final int NORMAL_WEIGHT = 400;
        public static final int BOLD_WEIGHT = 700;
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
        public android.graphics.Typeface build() { return null; }
    }

    public static final class CustomFallbackBuilder {
        public static int getMaxCustomFallbackCount() { return 0; }
        public CustomFallbackBuilder(android.graphics.fonts.FontFamily p0) {}
        public android.graphics.Typeface.CustomFallbackBuilder setSystemFallback(java.lang.String p0) { return null; }
        public android.graphics.Typeface.CustomFallbackBuilder setStyle(android.graphics.fonts.FontStyle p0) { return null; }
        public android.graphics.Typeface.CustomFallbackBuilder addCustomFallback(android.graphics.fonts.FontFamily p0) { return null; }
        public android.graphics.Typeface build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Style {
    }
}
