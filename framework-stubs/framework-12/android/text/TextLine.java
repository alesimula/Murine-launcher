package android.text;

public class TextLine {
    private static final boolean DEBUG = false;
    private static final char TAB_CHAR = (char)0x0009;
    private android.text.TextPaint mPaint;
    private java.lang.CharSequence mText;
    private int mStart;
    private int mLen;
    private int mDir;
    private android.text.Layout.Directions mDirections;
    private boolean mHasTabs;
    private android.text.Layout.TabStops mTabs;
    private char[] mChars;
    private boolean mCharsValid;
    private android.text.Spanned mSpanned;
    private android.text.PrecomputedText mComputed;
    private int mEllipsisStart;
    private int mEllipsisEnd;
    private float mAddedWidthForJustify;
    private boolean mIsJustifying;
    private final android.text.TextPaint mWorkPaint = null;
    private final android.text.TextPaint mActivePaint = null;
    private final android.text.SpanSet<android.text.style.MetricAffectingSpan> mMetricAffectingSpanSpanSet = null;
    private final android.text.SpanSet<android.text.style.CharacterStyle> mCharacterStyleSpanSet = null;
    private final android.text.SpanSet<android.text.style.ReplacementSpan> mReplacementSpanSpanSet = null;
    private final android.text.TextLine.DecorationInfo mDecorationInfo = null;
    private final java.util.ArrayList<android.text.TextLine.DecorationInfo> mDecorations = null;
    private static final android.text.TextLine[] sCached = null;
    private static final int TAB_INCREMENT = 20;
    public TextLine() {}
    public static android.text.TextLine obtain() { return null; }
    public static android.text.TextLine recycle(android.text.TextLine p0) { return null; }
    public void set(android.text.TextPaint p0, java.lang.CharSequence p1, int p2, int p3, int p4, android.text.Layout.Directions p5, boolean p6, android.text.Layout.TabStops p7, int p8, int p9) {}
    private char charAt(int p0) { return 0; }
    public void justify(float p0) {}
    void draw(android.graphics.Canvas p0, float p1, int p2, int p3, int p4) {}
    public float metrics(android.graphics.Paint.FontMetricsInt p0) { return 0.0f; }
    void shape(android.text.TextShaper.GlyphsConsumer p0) {}
    public float measure(int p0, boolean p1, android.graphics.Paint.FontMetricsInt p2) { return 0.0f; }
    public float[] measureAllOffsets(boolean[] p0, android.graphics.Paint.FontMetricsInt p1) { return null; }
    private float drawRun(android.graphics.Canvas p0, int p1, int p2, boolean p3, float p4, int p5, int p6, int p7, boolean p8) { return 0.0f; }
    private float measureRun(int p0, int p1, int p2, boolean p3, android.graphics.Paint.FontMetricsInt p4) { return 0.0f; }
    private float shapeRun(android.text.TextShaper.GlyphsConsumer p0, int p1, int p2, boolean p3, float p4, boolean p5) { return 0.0f; }
    int getOffsetToLeftRightOf(int p0, boolean p1) { return 0; }
    private int getOffsetBeforeAfter(int p0, int p1, int p2, boolean p3, int p4, boolean p5) { return 0; }
    private static void expandMetricsFromPaint(android.graphics.Paint.FontMetricsInt p0, android.text.TextPaint p1) {}
    static void updateMetrics(android.graphics.Paint.FontMetricsInt p0, int p1, int p2, int p3, int p4, int p5) {}
    private static void drawStroke(android.text.TextPaint p0, android.graphics.Canvas p1, int p2, float p3, float p4, float p5, float p6, float p7) {}
    private float getRunAdvance(android.text.TextPaint p0, int p1, int p2, int p3, int p4, boolean p5, int p6) { return 0.0f; }
    private float handleText(android.text.TextPaint p0, int p1, int p2, int p3, int p4, boolean p5, android.graphics.Canvas p6, android.text.TextShaper.GlyphsConsumer p7, float p8, int p9, int p10, int p11, android.graphics.Paint.FontMetricsInt p12, boolean p13, int p14, java.util.ArrayList<android.text.TextLine.DecorationInfo> p15) { return 0.0f; }
    private float handleReplacement(android.text.style.ReplacementSpan p0, android.text.TextPaint p1, int p2, int p3, boolean p4, android.graphics.Canvas p5, float p6, int p7, int p8, int p9, android.graphics.Paint.FontMetricsInt p10, boolean p11) { return 0.0f; }
    private int adjustStartHyphenEdit(int p0, int p1) { return 0; }
    private int adjustEndHyphenEdit(int p0, int p1) { return 0; }
    private void extractDecorationInfo(android.text.TextPaint p0, android.text.TextLine.DecorationInfo p1) {}
    private float handleRun(int p0, int p1, int p2, boolean p3, android.graphics.Canvas p4, android.text.TextShaper.GlyphsConsumer p5, float p6, int p7, int p8, int p9, android.graphics.Paint.FontMetricsInt p10, boolean p11) { return 0.0f; }
    private void drawTextRun(android.graphics.Canvas p0, android.text.TextPaint p1, int p2, int p3, int p4, int p5, boolean p6, float p7, int p8) {}
    private void shapeTextRun(android.text.TextShaper.GlyphsConsumer p0, android.text.TextPaint p1, int p2, int p3, int p4, int p5, boolean p6, float p7) {}
    float nextTab(float p0) { return 0.0f; }
    private boolean isStretchableWhitespace(int p0) { return false; }
    private int countStretchableSpaces(int p0, int p1) { return 0; }
    public static boolean isLineEndSpace(char p0) { return false; }
    private static boolean equalAttributes(android.text.TextPaint p0, android.text.TextPaint p1) { return false; }

    private static final class DecorationInfo {
        public boolean isStrikeThruText;
        public boolean isUnderlineText;
        public int underlineColor;
        public float underlineThickness;
        public int start;
        public int end;
        private DecorationInfo() {}
        public boolean hasDecoration() { return false; }
        public android.text.TextLine.DecorationInfo copyInfo() { return null; }
    }
}
