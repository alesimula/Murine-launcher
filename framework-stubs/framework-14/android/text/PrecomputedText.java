package android.text;

public class PrecomputedText implements android.text.Spannable {
    public static android.text.PrecomputedText create(java.lang.CharSequence p0, android.text.PrecomputedText.Params p1) { return null; }
    public static android.text.PrecomputedText.ParagraphInfo[] createMeasuredParagraphs(java.lang.CharSequence p0, android.text.PrecomputedText.Params p1, int p2, int p3, boolean p4) { return null; }
    public java.lang.CharSequence getText() { return null; }
    public int getStart() { return 0; }
    public int getEnd() { return 0; }
    public android.text.PrecomputedText.Params getParams() { return null; }
    public int getParagraphCount() { return 0; }
    public int getParagraphStart(int p0) { return 0; }
    public int getParagraphEnd(int p0) { return 0; }
    public android.text.MeasuredParagraph getMeasuredParagraph(int p0) { return null; }
    public android.text.PrecomputedText.ParagraphInfo[] getParagraphInfo() { return null; }
    public int checkResultUsable(int p0, int p1, android.text.TextDirectionHeuristic p2, android.text.TextPaint p3, int p4, int p5, android.graphics.text.LineBreakConfig p6) { return 0; }
    public int findParaIndex(int p0) { return 0; }
    public float getWidth(int p0, int p1) { return 0.0f; }
    public void getBounds(int p0, int p1, android.graphics.Rect p2) {}
    public void getFontMetricsInt(int p0, int p1, android.graphics.Paint.FontMetricsInt p2) {}
    public float getCharWidthAt(int p0) { return 0.0f; }
    public int getMemoryUsage() { return 0; }
    public void setSpan(java.lang.Object p0, int p1, int p2, int p3) {}
    public void removeSpan(java.lang.Object p0) {}
    public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
    public int getSpanStart(java.lang.Object p0) { return 0; }
    public int getSpanEnd(java.lang.Object p0) { return 0; }
    public int getSpanFlags(java.lang.Object p0) { return 0; }
    public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
    public int length() { return 0; }
    public char charAt(int p0) { return 0; }
    public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Params {
        public static final int UNUSABLE = 0;
        public static final int NEED_RECOMPUTE = 1;
        public static final int USABLE = 2;
        public Params(android.text.TextPaint p0, android.graphics.text.LineBreakConfig p1, android.text.TextDirectionHeuristic p2, int p3, int p4) {}
        public android.text.TextPaint getTextPaint() { return null; }
        public android.text.TextDirectionHeuristic getTextDirection() { return null; }
        public int getBreakStrategy() { return 0; }
        public int getHyphenationFrequency() { return 0; }
        public android.graphics.text.LineBreakConfig getLineBreakConfig() { return null; }
        public int checkResultUsable(android.text.TextPaint p0, android.text.TextDirectionHeuristic p1, int p2, int p3, android.graphics.text.LineBreakConfig p4) { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        public static class Builder {
            public Builder(android.text.TextPaint p0) {}
            public Builder(android.text.PrecomputedText.Params p0) {}
            public android.text.PrecomputedText.Params.Builder setBreakStrategy(int p0) { return null; }
            public android.text.PrecomputedText.Params.Builder setHyphenationFrequency(int p0) { return null; }
            public android.text.PrecomputedText.Params.Builder setTextDirection(android.text.TextDirectionHeuristic p0) { return null; }
            public android.text.PrecomputedText.Params.Builder setLineBreakConfig(android.graphics.text.LineBreakConfig p0) { return null; }
            public android.text.PrecomputedText.Params build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CheckResultUsableResult {
        }
    }

    public static class ParagraphInfo {
        public final int paragraphEnd = 0;
        public final android.text.MeasuredParagraph measured = null;
        public ParagraphInfo(int p0, android.text.MeasuredParagraph p1) {}
    }
}
