package android.text;

public class StaticLayout extends android.text.Layout {
    static final java.lang.String TAG = "StaticLayout";
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, boolean p6) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, float p6, float p7, boolean p8) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, float p6, float p7, boolean p8, android.text.TextUtils.TruncateAt p9, int p10) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, android.text.TextDirectionHeuristic p6, float p7, float p8, boolean p9, android.text.TextUtils.TruncateAt p10, int p11, int p12) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    StaticLayout(java.lang.CharSequence p0) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    void generate(android.text.StaticLayout.Builder p0, boolean p1, boolean p2) {}
    public int getLineForVertical(int p0) { return 0; }
    public int getLineCount() { return 0; }
    public int getLineTop(int p0) { return 0; }
    public int getLineExtra(int p0) { return 0; }
    public int getLineDescent(int p0) { return 0; }
    public int getLineStart(int p0) { return 0; }
    public int getParagraphDirection(int p0) { return 0; }
    public boolean getLineContainsTab(int p0) { return false; }
    public final android.text.Layout.Directions getLineDirections(int p0) { return null; }
    public int getTopPadding() { return 0; }
    public int getBottomPadding() { return 0; }
    static int packHyphenEdit(int p0, int p1) { return 0; }
    static int unpackStartHyphenEdit(int p0) { return 0; }
    static int unpackEndHyphenEdit(int p0) { return 0; }
    public int getStartHyphenEdit(int p0) { return 0; }
    public int getEndHyphenEdit(int p0) { return 0; }
    public int getIndentAdjust(int p0, android.text.Layout.Alignment p1) { return 0; }
    public int getEllipsisCount(int p0) { return 0; }
    public int getEllipsisStart(int p0) { return 0; }
    public int getEllipsizedWidth() { return 0; }
    public boolean isFallbackLineSpacingEnabled() { return false; }
    public int getHeight(boolean p0) { return 0; }

    public static final class Builder {
        public static android.text.StaticLayout.Builder obtain(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4) { return null; }
        void finish() {}
        public android.text.StaticLayout.Builder setText(java.lang.CharSequence p0) { return null; }
        public android.text.StaticLayout.Builder setText(java.lang.CharSequence p0, int p1, int p2) { return null; }
        public android.text.StaticLayout.Builder setPaint(android.text.TextPaint p0) { return null; }
        public android.text.StaticLayout.Builder setWidth(int p0) { return null; }
        public android.text.StaticLayout.Builder setAlignment(android.text.Layout.Alignment p0) { return null; }
        public android.text.StaticLayout.Builder setTextDirection(android.text.TextDirectionHeuristic p0) { return null; }
        public android.text.StaticLayout.Builder setLineSpacing(float p0, float p1) { return null; }
        public android.text.StaticLayout.Builder setIncludePad(boolean p0) { return null; }
        public android.text.StaticLayout.Builder setUseLineSpacingFromFallbacks(boolean p0) { return null; }
        public android.text.StaticLayout.Builder setEllipsizedWidth(int p0) { return null; }
        public android.text.StaticLayout.Builder setEllipsize(android.text.TextUtils.TruncateAt p0) { return null; }
        public android.text.StaticLayout.Builder setMaxLines(int p0) { return null; }
        public android.text.StaticLayout.Builder setBreakStrategy(int p0) { return null; }
        public android.text.StaticLayout.Builder setHyphenationFrequency(int p0) { return null; }
        public android.text.StaticLayout.Builder setIndents(int[] p0, int[] p1) { return null; }
        public android.text.StaticLayout.Builder setJustificationMode(int p0) { return null; }
        android.text.StaticLayout.Builder setAddLastLineLineSpacing(boolean p0) { return null; }
        public android.text.StaticLayout.Builder setLineBreakConfig(android.graphics.text.LineBreakConfig p0) { return null; }
        public android.text.StaticLayout build() { return null; }
    }

    static class LineBreaks {
        public int[] breaks;
        public float[] widths;
        public float[] ascents;
        public float[] descents;
        public int[] flags;
        LineBreaks() {}
    }
}
