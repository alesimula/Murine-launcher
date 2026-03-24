package android.graphics.text;

public final class PositionedGlyphs {
    private final long mLayoutPtr = 0L;
    private final float mXOffset = 0.0f;
    private final float mYOffset = 0.0f;
    private final java.util.ArrayList<android.graphics.fonts.Font> mFonts = null;
    public float getAdvance() { return 0.0f; }
    public float getAscent() { return 0.0f; }
    public float getDescent() { return 0.0f; }
    public float getOffsetX() { return 0.0f; }
    public float getOffsetY() { return 0.0f; }
    public int glyphCount() { return 0; }
    public android.graphics.fonts.Font getFont(int p0) { return null; }
    public int getGlyphId(int p0) { return 0; }
    public float getGlyphX(int p0) { return 0.0f; }
    public float getGlyphY(int p0) { return 0.0f; }
    public PositionedGlyphs(long p0, float p1, float p2) {}
    private static native int nGetGlyphCount(long p0);
    private static native float nGetTotalAdvance(long p0);
    private static native float nGetAscent(long p0);
    private static native float nGetDescent(long p0);
    private static native int nGetGlyphId(long p0, int p1);
    private static native float nGetX(long p0, int p1);
    private static native float nGetY(long p0, int p1);
    private static native long nGetFont(long p0, int p1);
    private static native long nReleaseFunc();
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
