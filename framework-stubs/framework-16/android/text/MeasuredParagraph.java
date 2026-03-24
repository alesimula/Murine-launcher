package android.text;

public class MeasuredParagraph {
    public void recycle() {}
    public void release() {}
    public int getTextLength() { return 0; }
    @android.annotation.NonNull
    public char[] getChars() { return null; }
    public int getParagraphDir() { return 0; }
    public android.text.Layout.Directions getDirections(int p0, int p1) { return null; }
    public float getWholeWidth() { return 0.0f; }
    @android.annotation.NonNull
    public android.text.AutoGrowArray.FloatArray getWidths() { return null; }
    @android.annotation.NonNull
    public android.text.AutoGrowArray.IntArray getSpanEndCache() { return null; }
    @android.annotation.NonNull
    public android.text.AutoGrowArray.IntArray getFontMetrics() { return null; }
    public android.graphics.text.MeasuredText getMeasuredText() { return null; }
    public float getWidth(int p0, int p1) { return 0.0f; }
    public void getBounds(int p0, int p1, android.graphics.Rect p2) {}
    public void getFontMetricsInt(int p0, int p1, android.graphics.Paint.FontMetricsInt p2) {}
    public float getCharWidthAt(int p0) { return 0.0f; }
    @android.annotation.NonNull
    public static android.text.MeasuredParagraph buildForBidi(java.lang.CharSequence p0, int p1, int p2, android.text.TextDirectionHeuristic p3, android.text.MeasuredParagraph p4) { return null; }
    @android.annotation.NonNull
    public static android.text.MeasuredParagraph buildForMeasurement(android.text.TextPaint p0, java.lang.CharSequence p1, int p2, int p3, android.text.TextDirectionHeuristic p4, android.text.MeasuredParagraph p5) { return null; }
    @android.annotation.NonNull
    public static android.text.MeasuredParagraph buildForStaticLayout(android.text.TextPaint p0, android.graphics.text.LineBreakConfig p1, java.lang.CharSequence p2, int p3, int p4, android.text.TextDirectionHeuristic p5, int p6, boolean p7, boolean p8, android.text.MeasuredParagraph p9, android.text.MeasuredParagraph p10) { return null; }
    @android.annotation.SuppressLint("ExecutorRegistration")
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public static android.text.MeasuredParagraph buildForStaticLayoutTest(android.text.TextPaint p0, android.graphics.text.LineBreakConfig p1, java.lang.CharSequence p2, int p3, int p4, android.text.TextDirectionHeuristic p5, int p6, boolean p7, android.text.MeasuredParagraph.StyleRunCallback p8) { return null; }
    int breakText(int p0, boolean p1, float p2) { return 0; }
    float measure(int p0, int p1) { return 0.0f; }
    public int getMemoryUsage() { return 0; }

    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public static interface StyleRunCallback {
        @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
        public void onAppendStyleRun(android.graphics.Paint p0, android.graphics.text.LineBreakConfig p1, int p2, boolean p3);
        @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
        public void onAppendReplacementRun(android.graphics.Paint p0, int p1, float p2);
    }
}
