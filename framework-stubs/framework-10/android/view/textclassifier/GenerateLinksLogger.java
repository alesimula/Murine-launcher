package android.view.textclassifier;

public final class GenerateLinksLogger {
    private static final java.lang.String LOG_TAG = "GenerateLinksLogger";
    private static final java.lang.String ZERO = "0";
    private final com.android.internal.logging.MetricsLogger mMetricsLogger = null;
    private final java.util.Random mRng = null;
    private final int mSampleRate = 0;
    public GenerateLinksLogger(int p0) {}
    public GenerateLinksLogger(int p0, com.android.internal.logging.MetricsLogger p1) {}
    public void logGenerateLinks(java.lang.CharSequence p0, android.view.textclassifier.TextLinks p1, java.lang.String p2, long p3) {}
    private boolean shouldLog() { return false; }
    private void writeStats(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.view.textclassifier.GenerateLinksLogger.LinkifyStats p3, java.lang.CharSequence p4, long p5) {}
    private static void debugLog(android.metrics.LogMaker p0) {}

    private static final class LinkifyStats {
        int mNumLinks;
        int mNumLinksTextLength;
        private LinkifyStats() {}
        void countLink(android.view.textclassifier.TextLinks.TextLink p0) {}
    }
}
