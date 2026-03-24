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
    private final long mNativePtr = 0L;
    private LineBreaker(int p0, int p1, int p2, int[] p3) {}
    public android.graphics.text.LineBreaker.Result computeLineBreaks(android.graphics.text.MeasuredText p0, android.graphics.text.LineBreaker.ParagraphConstraints p1, int p2) { return null; }
    private static native long nInit(int p0, int p1, boolean p2, int[] p3);
    private static native long nGetReleaseFunc();
    private static native long nComputeLineBreaks(long p0, char[] p1, long p2, int p3, float p4, int p5, float p6, float[] p7, float p8, int p9);
    private static native int nGetLineCount(long p0);
    private static native int nGetLineBreakOffset(long p0, int p1);
    private static native float nGetLineWidth(long p0, int p1);
    private static native float nGetLineAscent(long p0, int p1);
    private static native float nGetLineDescent(long p0, int p1);
    private static native int nGetLineFlag(long p0, int p1);
    private static native long nGetReleaseResultFunc();

    public static class Result {
        private static final int TAB_MASK = 536870912;
        private static final int HYPHEN_MASK = 255;
        private static final int START_HYPHEN_MASK = 24;
        private static final int END_HYPHEN_MASK = 7;
        private static final int START_HYPHEN_BITS_SHIFT = 3;
        private final long mPtr = 0L;
        private Result(long p0) {}
        public int getLineCount() { return 0; }
        public int getLineBreakOffset(int p0) { return 0; }
        public float getLineWidth(int p0) { return 0.0f; }
        public float getLineAscent(int p0) { return 0.0f; }
        public float getLineDescent(int p0) { return 0.0f; }
        public boolean hasLineTab(int p0) { return false; }
        public int getStartLineHyphenEdit(int p0) { return 0; }
        public int getEndLineHyphenEdit(int p0) { return 0; }
    }

    public static class ParagraphConstraints {
        private float mWidth;
        private float mFirstWidth;
        private int mFirstWidthLineCount;
        private float[] mVariableTabStops;
        private float mDefaultTabStop;
        public ParagraphConstraints() {}
        public void setWidth(float p0) {}
        public void setIndent(float p0, int p1) {}
        public void setTabStops(float[] p0, float p1) {}
        public float getWidth() { return 0.0f; }
        public float getFirstWidth() { return 0.0f; }
        public int getFirstWidthLineCount() { return 0; }
        public float[] getTabStops() { return null; }
        public float getDefaultTabStop() { return 0.0f; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface JustificationMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HyphenationFrequency {
    }

    public static final class Builder {
        private int mBreakStrategy;
        private int mHyphenationFrequency;
        private int mJustificationMode;
        private int[] mIndents;
        public Builder() {}
        public android.graphics.text.LineBreaker.Builder setBreakStrategy(int p0) { return null; }
        public android.graphics.text.LineBreaker.Builder setHyphenationFrequency(int p0) { return null; }
        public android.graphics.text.LineBreaker.Builder setJustificationMode(int p0) { return null; }
        public android.graphics.text.LineBreaker.Builder setIndents(int[] p0) { return null; }
        public android.graphics.text.LineBreaker build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BreakStrategy {
    }
}
