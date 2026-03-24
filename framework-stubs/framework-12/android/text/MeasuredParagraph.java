package android.text;

public class MeasuredParagraph {
    private static final char OBJECT_REPLACEMENT_CHARACTER = (char)0xfffc;
    private static final android.util.Pools.SynchronizedPool<android.text.MeasuredParagraph> sPool = null;
    private android.text.Spanned mSpanned;
    private int mTextStart;
    private int mTextLength;
    private char[] mCopiedBuffer;
    private int mParaDir;
    private boolean mLtrWithoutBidi;
    private android.text.AutoGrowArray.ByteArray mLevels;
    private float mWholeWidth;
    private android.text.AutoGrowArray.FloatArray mWidths;
    private android.text.AutoGrowArray.IntArray mSpanEndCache;
    private android.text.AutoGrowArray.IntArray mFontMetrics;
    private android.graphics.text.MeasuredText mMeasuredText;
    private android.text.TextPaint mCachedPaint;
    private android.graphics.Paint.FontMetricsInt mCachedFm;
    private MeasuredParagraph() {}
    private static android.text.MeasuredParagraph obtain() { return null; }
    public void recycle() {}
    public void release() {}
    private void reset() {}
    public int getTextLength() { return 0; }
    public char[] getChars() { return null; }
    public int getParagraphDir() { return 0; }
    public android.text.Layout.Directions getDirections(int p0, int p1) { return null; }
    public float getWholeWidth() { return 0.0f; }
    public android.text.AutoGrowArray.FloatArray getWidths() { return null; }
    public android.text.AutoGrowArray.IntArray getSpanEndCache() { return null; }
    public android.text.AutoGrowArray.IntArray getFontMetrics() { return null; }
    public android.graphics.text.MeasuredText getMeasuredText() { return null; }
    public float getWidth(int p0, int p1) { return 0.0f; }
    public void getBounds(int p0, int p1, android.graphics.Rect p2) {}
    public float getCharWidthAt(int p0) { return 0.0f; }
    public static android.text.MeasuredParagraph buildForBidi(java.lang.CharSequence p0, int p1, int p2, android.text.TextDirectionHeuristic p3, android.text.MeasuredParagraph p4) { return null; }
    public static android.text.MeasuredParagraph buildForMeasurement(android.text.TextPaint p0, java.lang.CharSequence p1, int p2, int p3, android.text.TextDirectionHeuristic p4, android.text.MeasuredParagraph p5) { return null; }
    public static android.text.MeasuredParagraph buildForStaticLayout(android.text.TextPaint p0, java.lang.CharSequence p1, int p2, int p3, android.text.TextDirectionHeuristic p4, boolean p5, boolean p6, android.text.MeasuredParagraph p7, android.text.MeasuredParagraph p8) { return null; }
    private void resetAndAnalyzeBidi(java.lang.CharSequence p0, int p1, int p2, android.text.TextDirectionHeuristic p3) {}
    private void applyReplacementRun(android.text.style.ReplacementSpan p0, int p1, int p2, android.graphics.text.MeasuredText.Builder p3) {}
    private void applyStyleRun(int p0, int p1, android.graphics.text.MeasuredText.Builder p2) {}
    private void applyMetricsAffectingSpan(android.text.TextPaint p0, android.text.style.MetricAffectingSpan[] p1, int p2, int p3, android.graphics.text.MeasuredText.Builder p4) {}
    int breakText(int p0, boolean p1, float p2) { return 0; }
    float measure(int p0, int p1) { return 0.0f; }
    public int getMemoryUsage() { return 0; }
}
