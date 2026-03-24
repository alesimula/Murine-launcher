package android.text;

public abstract class Layout {
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final int HYPHENATION_FREQUENCY_FULL = 2;
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = 3;
    public static final int HYPHENATION_FREQUENCY_FULL_FAST = 4;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;
    public static final float DEFAULT_LINESPACING_ADDITION = 0.0f;
    public static final android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_ANY_OVERLAP = null;
    public static final android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_CONTAINS_CENTER = null;
    public static final android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_CONTAINS_ALL = null;
    public static final int DIR_LEFT_TO_RIGHT = 1;
    public static final int DIR_RIGHT_TO_LEFT = -1;
    static final int DIR_REQUEST_LTR = 1;
    static final int DIR_REQUEST_RTL = -1;
    static final int DIR_REQUEST_DEFAULT_LTR = 2;
    static final int DIR_REQUEST_DEFAULT_RTL = -2;
    static final int RUN_LENGTH_MASK = 67108863;
    static final int RUN_LEVEL_SHIFT = 26;
    static final int RUN_LEVEL_MASK = 63;
    static final int RUN_RTL_FLAG = 67108864;
    public static final android.text.Layout.Directions DIRS_ALL_LEFT_TO_RIGHT = null;
    public static final android.text.Layout.Directions DIRS_ALL_RIGHT_TO_LEFT = null;
    public static final int TEXT_SELECTION_LAYOUT_RIGHT_TO_LEFT = 0;
    public static final int TEXT_SELECTION_LAYOUT_LEFT_TO_RIGHT = 1;
    public static float getDesiredWidth(java.lang.CharSequence p0, android.text.TextPaint p1) { return 0.0f; }
    public static float getDesiredWidth(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3) { return 0.0f; }
    public static float getDesiredWidth(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, android.text.TextDirectionHeuristic p4) { return 0.0f; }
    public static float getDesiredWidthWithLimit(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, android.text.TextDirectionHeuristic p4, float p5) { return 0.0f; }
    protected Layout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5) {}
    protected Layout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, android.text.TextDirectionHeuristic p4, float p5, float p6) {}
    protected void setJustificationMode(int p0) {}
    void replaceWith(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5) {}
    public void draw(android.graphics.Canvas p0) {}
    public void draw(android.graphics.Canvas p0, android.graphics.Path p1, android.graphics.Paint p2, int p3) {}
    public void draw(android.graphics.Canvas p0, java.util.List<android.graphics.Path> p1, java.util.List<android.graphics.Paint> p2, android.graphics.Path p3, android.graphics.Paint p4, int p5) {}
    public void drawText(android.graphics.Canvas p0) {}
    public void drawBackground(android.graphics.Canvas p0) {}
    public void drawWithoutText(android.graphics.Canvas p0, java.util.List<android.graphics.Path> p1, java.util.List<android.graphics.Paint> p2, android.graphics.Path p3, android.graphics.Paint p4, int p5, int p6, int p7) {}
    public void drawText(android.graphics.Canvas p0, int p1, int p2) {}
    public void drawBackground(android.graphics.Canvas p0, int p1, int p2) {}
    public long getLineRangeForDraw(android.graphics.Canvas p0) { return 0L; }
    public final java.lang.CharSequence getText() { return null; }
    public final android.text.TextPaint getPaint() { return null; }
    public final int getWidth() { return 0; }
    public int getEllipsizedWidth() { return 0; }
    public final void increaseWidthTo(int p0) {}
    public int getHeight() { return 0; }
    public int getHeight(boolean p0) { return 0; }
    public final android.text.Layout.Alignment getAlignment() { return null; }
    public final float getSpacingMultiplier() { return 0.0f; }
    public final float getSpacingAdd() { return 0.0f; }
    public final android.text.TextDirectionHeuristic getTextDirectionHeuristic() { return null; }
    public abstract int getLineCount();
    public int getLineBounds(int p0, android.graphics.Rect p1) { return 0; }
    public abstract int getLineTop(int p0);
    public abstract int getLineDescent(int p0);
    public abstract int getLineStart(int p0);
    public abstract int getParagraphDirection(int p0);
    public abstract boolean getLineContainsTab(int p0);
    public abstract android.text.Layout.Directions getLineDirections(int p0);
    public abstract int getTopPadding();
    public abstract int getBottomPadding();
    public int getStartHyphenEdit(int p0) { return 0; }
    public int getEndHyphenEdit(int p0) { return 0; }
    public int getIndentAdjust(int p0, android.text.Layout.Alignment p1) { return 0; }
    public boolean isFallbackLineSpacingEnabled() { return false; }
    public boolean isLevelBoundary(int p0) { return false; }
    public boolean isRtlCharAt(int p0) { return false; }
    public long getRunRange(int p0) { return 0L; }
    public boolean primaryIsTrailingPrevious(int p0) { return false; }
    public boolean[] primaryIsTrailingPreviousAllLineOffsets(int p0) { return null; }
    public float getPrimaryHorizontal(int p0) { return 0.0f; }
    public float getPrimaryHorizontal(int p0, boolean p1) { return 0.0f; }
    public float getSecondaryHorizontal(int p0) { return 0.0f; }
    public float getSecondaryHorizontal(int p0, boolean p1) { return 0.0f; }
    public void fillCharacterBounds(int p0, int p1, float[] p2, int p3) {}
    public float getLineLeft(int p0) { return 0.0f; }
    public float getLineRight(int p0) { return 0.0f; }
    public float getLineMax(int p0) { return 0.0f; }
    public float getLineWidth(int p0) { return 0.0f; }
    public int getLineForVertical(int p0) { return 0; }
    public int getLineForOffset(int p0) { return 0; }
    public int getOffsetForHorizontal(int p0, float p1) { return 0; }
    public int getOffsetForHorizontal(int p0, float p1, boolean p2) { return 0; }
    public int[] getRangeForRect(android.graphics.RectF p0, android.text.SegmentFinder p1, android.text.Layout.TextInclusionStrategy p2) { return null; }
    public final int getLineEnd(int p0) { return 0; }
    public int getLineVisibleEnd(int p0) { return 0; }
    public final int getLineBottom(int p0) { return 0; }
    public int getLineBottom(int p0, boolean p1) { return 0; }
    public final int getLineBaseline(int p0) { return 0; }
    public final int getLineAscent(int p0) { return 0; }
    public int getLineExtra(int p0) { return 0; }
    public int getOffsetToLeftOf(int p0) { return 0; }
    public int getOffsetToRightOf(int p0) { return 0; }
    public boolean shouldClampCursor(int p0) { return false; }
    public void getCursorPath(int p0, android.graphics.Path p1, java.lang.CharSequence p2) {}
    public void getSelectionPath(int p0, int p1, android.graphics.Path p2) {}
    public final void getSelection(int p0, int p1, android.text.Layout.SelectionRectangleConsumer p2) {}
    public final android.text.Layout.Alignment getParagraphAlignment(int p0) { return null; }
    public final int getParagraphLeft(int p0) { return 0; }
    public final int getParagraphRight(int p0) { return 0; }
    static float nextTab(java.lang.CharSequence p0, int p1, int p2, float p3, java.lang.Object[] p4) { return 0.0f; }
    protected final boolean isSpanned() { return false; }
    static <T extends java.lang.Object> T[] getParagraphSpans(android.text.Spanned p0, int p1, int p2, java.lang.Class<T> p3) { return null; }
    public abstract int getEllipsisStart(int p0);
    public abstract int getEllipsisCount(int p0);

    public static enum Alignment {
        ALIGN_NORMAL,
        ALIGN_OPPOSITE,
        ALIGN_CENTER,
        ALIGN_LEFT,
        ALIGN_RIGHT;
    }

    @java.lang.FunctionalInterface
    public static interface TextInclusionStrategy {
        public boolean isSegmentInside(android.graphics.RectF p0, android.graphics.RectF p1);
    }

    public static class Directions {
        public int[] mDirections;
        public Directions(int[] p0) {}
        public int getRunCount() { return 0; }
        public int getRunStart(int p0) { return 0; }
        public int getRunLength(int p0) { return 0; }
        public int getRunLevel(int p0) { return 0; }
        public boolean isRunRtl(int p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BreakStrategy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Direction {
    }

    static class Ellipsizer implements java.lang.CharSequence, android.text.GetChars {
        java.lang.CharSequence mText;
        android.text.Layout mLayout;
        int mWidth;
        android.text.TextUtils.TruncateAt mMethod;
        public Ellipsizer(java.lang.CharSequence p0) {}
        public char charAt(int p0) { return 0; }
        public void getChars(int p0, int p1, char[] p2, int p3) {}
        public int length() { return 0; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public java.lang.String toString() { return null; }
    }

    private class HorizontalMeasurementProvider {
        HorizontalMeasurementProvider(android.text.Layout p0, int p1, boolean p2) {}
        float get(int p0) { return 0.0f; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HyphenationFrequency {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface JustificationMode {
    }

    @java.lang.FunctionalInterface
    public static interface SelectionRectangleConsumer {
        public void accept(float p0, float p1, float p2, float p3, int p4);
    }

    static class SpannedEllipsizer extends android.text.Layout.Ellipsizer implements android.text.Spanned {
        public SpannedEllipsizer(java.lang.CharSequence p0) { super(null); }
        public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
        public int getSpanStart(java.lang.Object p0) { return 0; }
        public int getSpanEnd(java.lang.Object p0) { return 0; }
        public int getSpanFlags(java.lang.Object p0) { return 0; }
        public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
    }

    public static class TabStops {
        public TabStops(float p0, java.lang.Object[] p1) {}
        void reset(float p0, java.lang.Object[] p1) {}
        float nextTab(float p0) { return 0.0f; }
        public static float nextDefaultStop(float p0, float p1) { return 0.0f; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TextSelectionLayout {
    }
}
