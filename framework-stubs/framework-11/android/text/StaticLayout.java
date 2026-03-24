package android.text;

public class StaticLayout extends android.text.Layout {
    static final java.lang.String TAG = "StaticLayout";
    private int mLineCount;
    private int mTopPadding;
    private int mBottomPadding;
    private int mColumns;
    private int mEllipsizedWidth;
    private boolean mEllipsized;
    private int mMaxLineHeight;
    private static final int COLUMNS_NORMAL = 5;
    private static final int COLUMNS_ELLIPSIZE = 7;
    private static final int START = 0;
    private static final int DIR = 0;
    private static final int TAB = 0;
    private static final int TOP = 1;
    private static final int DESCENT = 2;
    private static final int EXTRA = 3;
    private static final int HYPHEN = 4;
    private static final int ELLIPSIS_START = 5;
    private static final int ELLIPSIS_COUNT = 6;
    private int[] mLines;
    private android.text.Layout.Directions[] mLineDirections;
    private int mMaximumVisibleLineCount;
    private static final int START_MASK = 536870911;
    private static final int DIR_SHIFT = 30;
    private static final int TAB_MASK = 536870912;
    private static final int HYPHEN_MASK = 255;
    private static final int START_HYPHEN_BITS_SHIFT = 3;
    private static final int START_HYPHEN_MASK = 24;
    private static final int END_HYPHEN_MASK = 7;
    private static final float TAB_INCREMENT = 20.0f;
    private static final char CHAR_NEW_LINE = (char)0x000a;
    private static final double EXTRA_ROUNDING = 0.5;
    private static final int DEFAULT_MAX_LINE_HEIGHT = -1;
    private int[] mLeftIndents;
    private int[] mRightIndents;
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, boolean p6) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, float p6, float p7, boolean p8) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, float p6, float p7, boolean p8, android.text.TextUtils.TruncateAt p9, int p10) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, android.text.TextDirectionHeuristic p6, float p7, float p8, boolean p9, android.text.TextUtils.TruncateAt p10, int p11, int p12) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    StaticLayout(java.lang.CharSequence p0) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    private StaticLayout(android.text.StaticLayout.Builder p0) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    void generate(android.text.StaticLayout.Builder p0, boolean p1, boolean p2) {}
    private int out(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, float p8, float p9, android.text.style.LineHeightSpan[] p10, int[] p11, android.graphics.Paint.FontMetricsInt p12, boolean p13, int p14, boolean p15, android.text.MeasuredParagraph p16, int p17, boolean p18, boolean p19, boolean p20, char[] p21, int p22, android.text.TextUtils.TruncateAt p23, float p24, float p25, android.text.TextPaint p26, boolean p27) { return 0; }
    private void calculateEllipsis(int p0, int p1, android.text.MeasuredParagraph p2, int p3, float p4, android.text.TextUtils.TruncateAt p5, int p6, float p7, android.text.TextPaint p8, boolean p9) {}
    private float getTotalInsets(int p0) { return 0.0f; }
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
    public int getHeight(boolean p0) { return 0; }

    public static final class Builder {
        private java.lang.CharSequence mText;
        private int mStart;
        private int mEnd;
        private android.text.TextPaint mPaint;
        private int mWidth;
        private android.text.Layout.Alignment mAlignment;
        private android.text.TextDirectionHeuristic mTextDir;
        private float mSpacingMult;
        private float mSpacingAdd;
        private boolean mIncludePad;
        private boolean mFallbackLineSpacing;
        private int mEllipsizedWidth;
        private android.text.TextUtils.TruncateAt mEllipsize;
        private int mMaxLines;
        private int mBreakStrategy;
        private int mHyphenationFrequency;
        private int[] mLeftIndents;
        private int[] mRightIndents;
        private int mJustificationMode;
        private boolean mAddLastLineLineSpacing;
        private final android.graphics.Paint.FontMetricsInt mFontMetricsInt = null;
        private static final android.util.Pools.SynchronizedPool<android.text.StaticLayout.Builder> sPool = null;
        private Builder() {}
        public static android.text.StaticLayout.Builder obtain(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4) { return null; }
        private static void recycle(android.text.StaticLayout.Builder p0) {}
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
        public android.text.StaticLayout build() { return null; }
    }

    static class LineBreaks {
        private static final int INITIAL_SIZE = 16;
        public int[] breaks;
        public float[] widths;
        public float[] ascents;
        public float[] descents;
        public int[] flags;
        LineBreaks() {}
    }
}
