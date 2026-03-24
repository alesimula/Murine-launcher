package android.text;

public class TextDirectionHeuristics {
    public static final android.text.TextDirectionHeuristic LTR = null;
    public static final android.text.TextDirectionHeuristic RTL = null;
    public static final android.text.TextDirectionHeuristic FIRSTSTRONG_LTR = null;
    public static final android.text.TextDirectionHeuristic FIRSTSTRONG_RTL = null;
    public static final android.text.TextDirectionHeuristic ANYRTL_LTR = null;
    public static final android.text.TextDirectionHeuristic LOCALE = null;
    private static final int STATE_TRUE = 0;
    private static final int STATE_FALSE = 1;
    private static final int STATE_UNKNOWN = 2;
    public TextDirectionHeuristics() {}
    private static int isRtlCodePoint(int p0) { return 0; }

    private static class TextDirectionHeuristicLocale extends android.text.TextDirectionHeuristics.TextDirectionHeuristicImpl {
        public static final android.text.TextDirectionHeuristics.TextDirectionHeuristicLocale INSTANCE = null;
        public TextDirectionHeuristicLocale() { super(null); }
        protected boolean defaultIsRtl() { return false; }
    }

    private static class TextDirectionHeuristicInternal extends android.text.TextDirectionHeuristics.TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl = false;
        private TextDirectionHeuristicInternal(android.text.TextDirectionHeuristics.TextDirectionAlgorithm p0, boolean p1) { super(null); }
        protected boolean defaultIsRtl() { return false; }
    }

    private static abstract class TextDirectionHeuristicImpl implements android.text.TextDirectionHeuristic {
        private final android.text.TextDirectionHeuristics.TextDirectionAlgorithm mAlgorithm = null;
        public TextDirectionHeuristicImpl(android.text.TextDirectionHeuristics.TextDirectionAlgorithm p0) {}
        protected abstract boolean defaultIsRtl();
        public boolean isRtl(char[] p0, int p1, int p2) { return false; }
        public boolean isRtl(java.lang.CharSequence p0, int p1, int p2) { return false; }
        private boolean doCheck(java.lang.CharSequence p0, int p1, int p2) { return false; }
    }

    private static interface TextDirectionAlgorithm {
        public int checkRtl(java.lang.CharSequence p0, int p1, int p2);
    }

    private static class FirstStrong implements android.text.TextDirectionHeuristics.TextDirectionAlgorithm {
        public static final android.text.TextDirectionHeuristics.FirstStrong INSTANCE = null;
        public int checkRtl(java.lang.CharSequence p0, int p1, int p2) { return 0; }
        private FirstStrong() {}
    }

    private static class AnyStrong implements android.text.TextDirectionHeuristics.TextDirectionAlgorithm {
        private final boolean mLookForRtl = false;
        public static final android.text.TextDirectionHeuristics.AnyStrong INSTANCE_RTL = null;
        public static final android.text.TextDirectionHeuristics.AnyStrong INSTANCE_LTR = null;
        public int checkRtl(java.lang.CharSequence p0, int p1, int p2) { return 0; }
        private AnyStrong(boolean p0) {}
    }
}
