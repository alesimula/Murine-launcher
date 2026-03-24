package android.media;

class WebVttParser {
    private static final java.lang.String TAG = "WebVttParser";
    private android.media.WebVttParser.Phase mPhase;
    private android.media.TextTrackCue mCue;
    private java.util.Vector<java.lang.String> mCueTexts;
    private android.media.WebVttCueListener mListener;
    private java.lang.String mBuffer;
    private final android.media.WebVttParser.Phase mSkipRest = null;
    private final android.media.WebVttParser.Phase mParseStart = null;
    private final android.media.WebVttParser.Phase mParseHeader = null;
    private final android.media.WebVttParser.Phase mParseCueId = null;
    private final android.media.WebVttParser.Phase mParseCueTime = null;
    private final android.media.WebVttParser.Phase mParseCueText = null;
    WebVttParser(android.media.WebVttCueListener p0) {}
    public static float parseFloatPercentage(java.lang.String p0) throws java.lang.NumberFormatException { return 0.0f; }
    public static int parseIntPercentage(java.lang.String p0) throws java.lang.NumberFormatException { return 0; }
    public static long parseTimestampMs(java.lang.String p0) throws java.lang.NumberFormatException { return 0L; }
    public static java.lang.String timeToString(long p0) { return null; }
    public void parse(java.lang.String p0) {}
    public void eos() {}
    public void yieldCue() {}
    private void log_warning(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
    private void log_warning(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    private void log_warning(java.lang.String p0, java.lang.String p1) {}

    static interface Phase {
        public void parse(java.lang.String p0);
    }
}
