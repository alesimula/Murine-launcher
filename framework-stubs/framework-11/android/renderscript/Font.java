package android.renderscript;

public class Font extends android.renderscript.BaseObj {
    private static final java.lang.String[] sSansNames = null;
    private static final java.lang.String[] sSerifNames = null;
    private static final java.lang.String[] sMonoNames = null;
    private static java.util.Map<java.lang.String, android.renderscript.Font.FontFamily> sFontFamilyMap;
    private static void addFamilyToMap(android.renderscript.Font.FontFamily p0) {}
    private static void initFontFamilyMap() {}
    static java.lang.String getFontFileName(java.lang.String p0, android.renderscript.Font.Style p1) { return null; }
    Font(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public static android.renderscript.Font createFromFile(android.renderscript.RenderScript p0, android.content.res.Resources p1, java.lang.String p2, float p3) { return null; }
    public static android.renderscript.Font createFromFile(android.renderscript.RenderScript p0, android.content.res.Resources p1, java.io.File p2, float p3) { return null; }
    public static android.renderscript.Font createFromAsset(android.renderscript.RenderScript p0, android.content.res.Resources p1, java.lang.String p2, float p3) { return null; }
    public static android.renderscript.Font createFromResource(android.renderscript.RenderScript p0, android.content.res.Resources p1, int p2, float p3) { return null; }
    public static android.renderscript.Font create(android.renderscript.RenderScript p0, android.content.res.Resources p1, java.lang.String p2, android.renderscript.Font.Style p3, float p4) { return null; }

    private static class FontFamily {
        java.lang.String[] mNames;
        java.lang.String mNormalFileName;
        java.lang.String mBoldFileName;
        java.lang.String mItalicFileName;
        java.lang.String mBoldItalicFileName;
        private FontFamily() {}
    }

    public static enum Style {
        NORMAL,
        BOLD,
        ITALIC,
        BOLD_ITALIC;
        private Style() {}
    }
}
