package android.graphics.fonts;

public final class SystemFonts {
    private static final java.lang.String TAG = "SystemFonts";
    private static final java.lang.String FONTS_XML = "/system/etc/fonts.xml";
    public static final java.lang.String SYSTEM_FONT_DIR = "/system/fonts/";
    private static final java.lang.String OEM_XML = "/product/etc/fonts_customization.xml";
    public static final java.lang.String OEM_FONT_DIR = "/product/fonts/";
    private static final java.lang.Object LOCK = null;
    private static java.util.Set<android.graphics.fonts.Font> sAvailableFonts;
    private SystemFonts() {}
    public static java.util.Set<android.graphics.fonts.Font> getAvailableFonts() { return null; }
    public static void resetAvailableFonts() {}
    private static java.nio.ByteBuffer mmap(java.lang.String p0) { return null; }
    private static void pushFamilyToFallback(android.text.FontConfig.FontFamily p0, android.util.ArrayMap<java.lang.String, java.util.ArrayList<android.graphics.fonts.FontFamily>> p1, java.util.Map<java.lang.String, java.nio.ByteBuffer> p2) {}
    private static android.graphics.fonts.FontFamily createFontFamily(java.lang.String p0, java.util.List<android.text.FontConfig.Font> p1, java.lang.String p2, int p3, java.util.Map<java.lang.String, java.nio.ByteBuffer> p4) { return null; }
    private static void appendNamedFamily(android.text.FontConfig.FontFamily p0, android.util.ArrayMap<java.lang.String, java.nio.ByteBuffer> p1, android.util.ArrayMap<java.lang.String, java.util.ArrayList<android.graphics.fonts.FontFamily>> p2) {}
    public static android.text.FontConfig getSystemFontConfig(java.util.Map<java.lang.String, java.io.File> p0, long p1, int p2) { return null; }
    public static android.text.FontConfig getSystemPreinstalledFontConfig() { return null; }
    static android.text.FontConfig getSystemFontConfigInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map<java.lang.String, java.io.File> p4, long p5, int p6) { return null; }
    public static java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> buildSystemFallback(android.text.FontConfig p0) { return null; }
    public static java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> buildSystemFallback(android.text.FontConfig p0, android.util.ArrayMap<java.lang.String, java.nio.ByteBuffer> p1) { return null; }
    public static java.util.Map<java.lang.String, android.graphics.Typeface> buildSystemTypefaces(android.text.FontConfig p0, java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> p1) { return null; }
}
