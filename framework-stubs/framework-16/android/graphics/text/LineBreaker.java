package android.graphics.text;

public class LineBreaker {
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final int HYPHENATION_FREQUENCY_FULL = 2;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    @android.annotation.FlaggedApi("com.android.text.flags.letter_spacing_justification")
    public static final int JUSTIFICATION_MODE_INTER_CHARACTER = 2;
    @android.annotation.FlaggedApi("com.android.text.flags.missing_getter_apis")
    public int getBreakStrategy() { return 0; }
    @android.annotation.FlaggedApi("com.android.text.flags.missing_getter_apis")
    public int getHyphenationFrequency() { return 0; }
    @android.annotation.FlaggedApi("com.android.text.flags.missing_getter_apis")
    public int getJustificationMode() { return 0; }
    @android.annotation.FlaggedApi("com.android.text.flags.missing_getter_apis")
    @android.annotation.Nullable
    public int[] getIndents() { return null; }
    @android.annotation.FlaggedApi("com.android.text.flags.missing_getter_apis")
    public boolean getUseBoundsForWidth() { return false; }
    @android.annotation.NonNull
    public android.graphics.text.LineBreaker.Result computeLineBreaks(android.graphics.text.MeasuredText p0, android.graphics.text.LineBreaker.ParagraphConstraints p1, int p2) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BreakStrategy {
    }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.graphics.text.LineBreaker.Builder setBreakStrategy(int p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.LineBreaker.Builder setHyphenationFrequency(int p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.LineBreaker.Builder setJustificationMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.LineBreaker.Builder setIndents(int[] p0) { return null; }
        @android.annotation.FlaggedApi("com.android.text.flags.use_bounds_for_width")
        @android.annotation.NonNull
        public android.graphics.text.LineBreaker.Builder setUseBoundsForWidth(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.LineBreaker build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HyphenationFrequency {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface JustificationMode {
    }

    private static class NoImagePreloadHolder {
    }

    public static class ParagraphConstraints {
        public ParagraphConstraints() {}
        public void setWidth(float p0) {}
        public void setIndent(float p0, int p1) {}
        public void setTabStops(float[] p0, float p1) {}
        public float getWidth() { return 0.0f; }
        public float getFirstWidth() { return 0.0f; }
        public int getFirstWidthLineCount() { return 0; }
        @android.annotation.Nullable
        public float[] getTabStops() { return null; }
        public float getDefaultTabStop() { return 0.0f; }
    }

    public static class Result {
        public int getLineCount() { return 0; }
        public int getLineBreakOffset(int p0) { return 0; }
        public float getLineWidth(int p0) { return 0.0f; }
        public float getLineAscent(int p0) { return 0.0f; }
        public float getLineDescent(int p0) { return 0.0f; }
        public boolean hasLineTab(int p0) { return false; }
        public int getStartLineHyphenEdit(int p0) { return 0; }
        public int getEndLineHyphenEdit(int p0) { return 0; }
    }
}
