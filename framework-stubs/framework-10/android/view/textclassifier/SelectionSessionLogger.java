package android.view.textclassifier;

public final class SelectionSessionLogger {
    private static final java.lang.String LOG_TAG = "SelectionSessionLogger";
    static final java.lang.String CLASSIFIER_ID = "androidtc";
    private static final int START_EVENT_DELTA = 1117;
    private static final int PREV_EVENT_DELTA = 1118;
    private static final int INDEX = 1120;
    private static final int WIDGET_TYPE = 1255;
    private static final int WIDGET_VERSION = 1262;
    private static final int MODEL_NAME = 1256;
    private static final int ENTITY_TYPE = 1254;
    private static final int SMART_START = 1252;
    private static final int SMART_END = 1253;
    private static final int EVENT_START = 1250;
    private static final int EVENT_END = 1251;
    private static final int SESSION_ID = 1119;
    private static final java.lang.String ZERO = "0";
    private static final java.lang.String UNKNOWN = "unknown";
    private final com.android.internal.logging.MetricsLogger mMetricsLogger = null;
    public SelectionSessionLogger() {}
    public SelectionSessionLogger(com.android.internal.logging.MetricsLogger p0) {}
    public void writeEvent(android.view.textclassifier.SelectionEvent p0) {}
    private static int getLogType(android.view.textclassifier.SelectionEvent p0) { return 0; }
    private static int getLogSubType(android.view.textclassifier.SelectionEvent p0) { return 0; }
    private static java.lang.String getLogTypeString(int p0) { return null; }
    private static java.lang.String getLogSubTypeString(int p0) { return null; }
    static boolean isPlatformLocalTextClassifierSmartSelection(java.lang.String p0) { return false; }
    private static void debugLog(android.metrics.LogMaker p0) {}
    public static java.text.BreakIterator getTokenIterator(java.util.Locale p0) { return null; }
    public static java.lang.String createId(java.lang.String p0, int p1, int p2, android.content.Context p3, int p4, java.util.List<java.util.Locale> p5) { return null; }

    public static final class SignatureParser {
        public SignatureParser() {}
        static java.lang.String createSignature(java.lang.String p0, java.lang.String p1, int p2) { return null; }
        static java.lang.String getClassifierId(java.lang.String p0) { return null; }
        static java.lang.String getModelName(java.lang.String p0) { return null; }
        static int getHash(java.lang.String p0) { return 0; }
    }
}
