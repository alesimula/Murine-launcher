package android.graphics.fonts;

public final class SystemFonts {
    private static final java.lang.String TAG = "SystemFonts";
    private static final java.lang.String DEFAULT_FAMILY = "sans-serif";
    private static final java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> sSystemFallbackMap = null;
    private static final android.text.FontConfig.Alias[] sAliases = null;
    private static final java.util.List<android.graphics.fonts.Font> sAvailableFonts = null;
    private SystemFonts() {}
    public static java.util.Set<android.graphics.fonts.Font> getAvailableFonts() { return null; }
    public static android.graphics.fonts.FontFamily[] getSystemFallback(java.lang.String p0) { return null; }
    public static java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> getRawSystemFallbackMap() { return null; }
    public static android.text.FontConfig.Alias[] getAliases() { return null; }
    private static java.nio.ByteBuffer mmap(java.lang.String p0) { return null; }
    private static void pushFamilyToFallback(android.text.FontConfig.Family p0, android.util.ArrayMap<java.lang.String, java.util.ArrayList<android.graphics.fonts.FontFamily>> p1, java.util.Map<java.lang.String, java.nio.ByteBuffer> p2, java.util.ArrayList<android.graphics.fonts.Font> p3) {}
    private static android.graphics.fonts.FontFamily createFontFamily(java.lang.String p0, java.util.List<android.text.FontConfig.Font> p1, java.lang.String p2, int p3, java.util.Map<java.lang.String, java.nio.ByteBuffer> p4, java.util.ArrayList<android.graphics.fonts.Font> p5) { return null; }
    private static void appendNamedFamily(android.text.FontConfig.Family p0, java.util.HashMap<java.lang.String, java.nio.ByteBuffer> p1, android.util.ArrayMap<java.lang.String, java.util.ArrayList<android.graphics.fonts.FontFamily>> p2, java.util.ArrayList<android.graphics.fonts.Font> p3) {}
    public static android.text.FontConfig.Alias[] buildSystemFallback(java.lang.String p0, java.lang.String p1, android.graphics.fonts.FontCustomizationParser.Result p2, android.util.ArrayMap<java.lang.String, android.graphics.fonts.FontFamily[]> p3, java.util.ArrayList<android.graphics.fonts.Font> p4) { return null; }
    private static android.graphics.fonts.FontCustomizationParser.Result readFontCustomization(java.lang.String p0, java.lang.String p1) { return null; }
}
