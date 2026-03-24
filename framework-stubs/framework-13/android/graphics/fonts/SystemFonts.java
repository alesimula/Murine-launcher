package android.graphics.fonts;

public final class SystemFonts {
    public static final java.lang.String SYSTEM_FONT_DIR = "/system/fonts/";
    public static final java.lang.String OEM_FONT_DIR = "/product/fonts/";
    public static java.util.Set<android.graphics.fonts.Font> getAvailableFonts() { return null; }
    public static void resetAvailableFonts() {}
    public static android.text.FontConfig getSystemFontConfig(java.util.Map<java.lang.String, java.io.File> p0, long p1, int p2) { return null; }
    public static android.text.FontConfig getSystemPreinstalledFontConfig() { return null; }
    static android.text.FontConfig getSystemFontConfigInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map<java.lang.String, java.io.File> p4, long p5, int p6) { return null; }
    public static java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> buildSystemFallback(android.text.FontConfig p0) { return null; }
    public static java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> buildSystemFallback(android.text.FontConfig p0, android.util.ArrayMap<java.lang.String, java.nio.ByteBuffer> p1) { return null; }
    public static java.util.Map<java.lang.String, android.graphics.Typeface> buildSystemTypefaces(android.text.FontConfig p0, java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> p1) { return null; }
}
