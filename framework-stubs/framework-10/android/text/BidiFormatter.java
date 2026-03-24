package android.text;

public final class BidiFormatter {
    private static android.text.TextDirectionHeuristic DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final char LRE = (char)0x202a;
    private static final char RLE = (char)0x202b;
    private static final char PDF = (char)0x202c;
    private static final char LRM = (char)0x200e;
    private static final char RLM = (char)0x200f;
    private static final java.lang.String LRM_STRING = null;
    private static final java.lang.String RLM_STRING = null;
    private static final java.lang.String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final int DEFAULT_FLAGS = 2;
    private static final android.text.BidiFormatter DEFAULT_LTR_INSTANCE = null;
    private static final android.text.BidiFormatter DEFAULT_RTL_INSTANCE = null;
    private final boolean mIsRtlContext = false;
    private final int mFlags = 0;
    private final android.text.TextDirectionHeuristic mDefaultTextDirectionHeuristic = null;
    private static final int DIR_LTR = -1;
    private static final int DIR_UNKNOWN = 0;
    private static final int DIR_RTL = 1;
    public static android.text.BidiFormatter getInstance() { return null; }
    public static android.text.BidiFormatter getInstance(boolean p0) { return null; }
    public static android.text.BidiFormatter getInstance(java.util.Locale p0) { return null; }
    private BidiFormatter(boolean p0, int p1, android.text.TextDirectionHeuristic p2) {}
    public boolean isRtlContext() { return false; }
    public boolean getStereoReset() { return false; }
    public java.lang.String markAfter(java.lang.CharSequence p0, android.text.TextDirectionHeuristic p1) { return null; }
    public java.lang.String markBefore(java.lang.CharSequence p0, android.text.TextDirectionHeuristic p1) { return null; }
    public boolean isRtl(java.lang.String p0) { return false; }
    public boolean isRtl(java.lang.CharSequence p0) { return false; }
    public java.lang.String unicodeWrap(java.lang.String p0, android.text.TextDirectionHeuristic p1, boolean p2) { return null; }
    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence p0, android.text.TextDirectionHeuristic p1, boolean p2) { return null; }
    public java.lang.String unicodeWrap(java.lang.String p0, android.text.TextDirectionHeuristic p1) { return null; }
    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence p0, android.text.TextDirectionHeuristic p1) { return null; }
    public java.lang.String unicodeWrap(java.lang.String p0, boolean p1) { return null; }
    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence p0, boolean p1) { return null; }
    public java.lang.String unicodeWrap(java.lang.String p0) { return null; }
    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence p0) { return null; }
    private static android.text.BidiFormatter getDefaultInstanceFromContext(boolean p0) { return null; }
    private static boolean isRtlLocale(java.util.Locale p0) { return false; }
    private static int getExitDir(java.lang.CharSequence p0) { return 0; }
    private static int getEntryDir(java.lang.CharSequence p0) { return 0; }

    public static class DirectionalityEstimator {
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private static final byte[] DIR_TYPE_CACHE = null;
        private final java.lang.CharSequence text = null;
        private final boolean isHtml = false;
        private final int length = 0;
        private int charIndex;
        private char lastChar;
        public static byte getDirectionality(int p0) { return 0; }
        DirectionalityEstimator(java.lang.CharSequence p0, boolean p1) {}
        int getEntryDir() { return 0; }
        int getExitDir() { return 0; }
        private static byte getCachedDirectionality(char p0) { return 0; }
        byte dirTypeForward() { return 0; }
        byte dirTypeBackward() { return 0; }
        private byte skipTagForward() { return 0; }
        private byte skipTagBackward() { return 0; }
        private byte skipEntityForward() { return 0; }
        private byte skipEntityBackward() { return 0; }
    }

    public static final class Builder {
        private boolean mIsRtlContext;
        private int mFlags;
        private android.text.TextDirectionHeuristic mTextDirectionHeuristic;
        public Builder() {}
        public Builder(boolean p0) {}
        public Builder(java.util.Locale p0) {}
        private void initialize(boolean p0) {}
        public android.text.BidiFormatter.Builder stereoReset(boolean p0) { return null; }
        public android.text.BidiFormatter.Builder setTextDirectionHeuristic(android.text.TextDirectionHeuristic p0) { return null; }
        public android.text.BidiFormatter build() { return null; }
    }
}
