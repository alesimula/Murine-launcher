package android.renderscript;

@java.lang.Deprecated
public class Font extends android.renderscript.BaseObj {
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
    }

    public static enum Style {
        NORMAL,
        BOLD,
        ITALIC,
        BOLD_ITALIC;
    }
}
