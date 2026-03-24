package android.text;

public abstract class Layout {
    static final float HIGH_CONTRAST_TEXT_BACKGROUND_CORNER_RADIUS_MIN_DP = 5.0f;
    static final float HIGH_CONTRAST_TEXT_BACKGROUND_CORNER_RADIUS_FACTOR = 0.5f;
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
    @android.annotation.FlaggedApi("com.android.text.flags.letter_spacing_justification")
    public static final int JUSTIFICATION_MODE_INTER_CHARACTER = 2;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;
    public static final float DEFAULT_LINESPACING_ADDITION = 0.0f;
    @android.annotation.NonNull
    public static final android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_ANY_OVERLAP = null;
    @android.annotation.NonNull
    public static final android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_CONTAINS_CENTER = null;
    @android.annotation.NonNull
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
    public static float getDesiredWidthWithLimit(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, android.text.TextDirectionHeuristic p4, float p5, boolean p6) { return 0.0f; }
    protected Layout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5) {}
    protected Layout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, android.text.TextDirectionHeuristic p4, float p5, float p6, boolean p7, boolean p8, int p9, android.text.TextUtils.TruncateAt p10, int p11, int p12, int p13, int[] p14, int[] p15, int p16, android.graphics.text.LineBreakConfig p17, boolean p18, boolean p19, android.graphics.Paint.FontMetrics p20) {}
    void replaceWith(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5) {}
    public void draw(android.graphics.Canvas p0) {}
    public void draw(android.graphics.Canvas p0, android.graphics.Path p1, android.graphics.Paint p2, int p3) {}
    public void draw(android.graphics.Canvas p0, java.util.List<android.graphics.Path> p1, java.util.List<android.graphics.Paint> p2, android.graphics.Path p3, android.graphics.Paint p4, int p5) {}
    public void drawText(android.graphics.Canvas p0) {}
    public void drawBackground(android.graphics.Canvas p0) {}
    public void drawWithoutText(android.graphics.Canvas p0, java.util.List<android.graphics.Path> p1, java.util.List<android.graphics.Paint> p2, android.graphics.Path p3, android.graphics.Paint p4, int p5, int p6, int p7) {}
    public void drawHighlights(android.graphics.Canvas p0, java.util.List<android.graphics.Path> p1, java.util.List<android.graphics.Paint> p2, android.graphics.Path p3, android.graphics.Paint p4, int p5, int p6, int p7) {}
    public void drawText(android.graphics.Canvas p0, int p1, int p2) {}
    public void drawBackground(android.graphics.Canvas p0, int p1, int p2) {}
    public long getLineRangeForDraw(android.graphics.Canvas p0) { return 0L; }
    public final void increaseWidthTo(int p0) {}
    public int getHeight() { return 0; }
    public int getHeight(boolean p0) { return 0; }
    public abstract int getLineCount();
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public android.graphics.RectF computeDrawingBoundingBox() { return null; }
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
    @android.annotation.FlaggedApi("com.android.text.flags.letter_spacing_justification")
    public int getLineLetterSpacingUnitCount(int p0, boolean p1) { return 0; }
    public int getLineForVertical(int p0) { return 0; }
    public int getLineForOffset(int p0) { return 0; }
    public int getOffsetForHorizontal(int p0, float p1) { return 0; }
    public int getOffsetForHorizontal(int p0, float p1, boolean p2) { return 0; }
    @android.annotation.Nullable
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
    @android.annotation.NonNull
    public final java.lang.CharSequence getText() { return null; }
    @android.annotation.NonNull
    public final android.text.TextPaint getPaint() { return null; }
    public final int getWidth() { return 0; }
    @android.annotation.NonNull
    public final android.text.Layout.Alignment getAlignment() { return null; }
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final android.text.TextDirectionHeuristic getTextDirectionHeuristic() { return null; }
    public final float getSpacingMultiplier() { return 0.0f; }
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final float getLineSpacingMultiplier() { return 0.0f; }
    public final float getSpacingAdd() { return 0.0f; }
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final float getLineSpacingAmount() { return 0.0f; }
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final boolean isFontPaddingIncluded() { return false; }
    public boolean isFallbackLineSpacingEnabled() { return false; }
    public int getEllipsizedWidth() { return 0; }
    @android.annotation.Nullable
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final android.text.TextUtils.TruncateAt getEllipsize() { return null; }
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final int getMaxLines() { return 0; }
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final int getBreakStrategy() { return 0; }
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final int getHyphenationFrequency() { return 0; }
    @android.annotation.Nullable
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final int[] getLeftIndents() { return null; }
    @android.annotation.Nullable
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final int[] getRightIndents() { return null; }
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public final int getJustificationMode() { return 0; }
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public android.graphics.text.LineBreakConfig getLineBreakConfig() { return null; }
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public boolean getUseBoundsForWidth() { return false; }
    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public boolean getShiftDrawingOffsetForStartOverhang() { return false; }
    @android.annotation.Nullable
    @android.annotation.FlaggedApi("com.android.text.flags.fix_line_height_for_locale")
    public android.graphics.Paint.FontMetrics getMinimumFontMetrics() { return null; }

    public static enum Alignment {
        ALIGN_NORMAL,
        ALIGN_OPPOSITE,
        ALIGN_CENTER,
        ALIGN_LEFT,
        ALIGN_RIGHT;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BreakStrategy {
    }

    @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
    public static final class Builder {
        public Builder(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4) {}
        @android.annotation.NonNull
        public android.text.Layout.Builder setAlignment(android.text.Layout.Alignment p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setTextDirectionHeuristic(android.text.TextDirectionHeuristic p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setLineSpacingAmount(float p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setLineSpacingMultiplier(float p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setFontPaddingIncluded(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setFallbackLineSpacingEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setEllipsizedWidth(int p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setEllipsize(android.text.TextUtils.TruncateAt p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setMaxLines(int p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setBreakStrategy(int p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setHyphenationFrequency(int p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setLeftIndents(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setRightIndents(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setJustificationMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout.Builder setLineBreakConfig(android.graphics.text.LineBreakConfig p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
        public android.text.Layout.Builder setUseBoundsForWidth(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
        public android.text.Layout.Builder setShiftDrawingOffsetForStartOverhang(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.text.flags.fix_line_height_for_locale")
        public android.text.Layout.Builder setMinimumFontMetrics(android.graphics.Paint.FontMetrics p0) { return null; }
        @android.annotation.NonNull
        public android.text.Layout build() { return null; }
    }

    private static interface CharacterBoundsListener {
        public void onCharacterBounds(int p0, int p1, float p2, float p3, float p4, float p5);
        default public void onEnd() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Direction {
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

    @java.lang.FunctionalInterface
    public static interface TextInclusionStrategy {
        public boolean isSegmentInside(android.graphics.RectF p0, android.graphics.RectF p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TextSelectionLayout {
    }
}
