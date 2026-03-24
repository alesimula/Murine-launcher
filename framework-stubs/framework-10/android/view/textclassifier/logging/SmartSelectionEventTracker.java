package android.view.textclassifier.logging;

public final class SmartSelectionEventTracker {
    private static final java.lang.String LOG_TAG = "SmartSelectEventTracker";
    private static final boolean DEBUG_LOG_ENABLED = true;
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
    private static final java.lang.String TEXTVIEW = "textview";
    private static final java.lang.String EDITTEXT = "edittext";
    private static final java.lang.String UNSELECTABLE_TEXTVIEW = "nosel-textview";
    private static final java.lang.String WEBVIEW = "webview";
    private static final java.lang.String EDIT_WEBVIEW = "edit-webview";
    private static final java.lang.String CUSTOM_TEXTVIEW = "customview";
    private static final java.lang.String CUSTOM_EDITTEXT = "customedit";
    private static final java.lang.String CUSTOM_UNSELECTABLE_TEXTVIEW = "nosel-customview";
    private static final java.lang.String UNKNOWN = "unknown";
    private final com.android.internal.logging.MetricsLogger mMetricsLogger = null;
    private final int mWidgetType = 0;
    private final java.lang.String mWidgetVersion = null;
    private final android.content.Context mContext = null;
    private java.lang.String mSessionId;
    private final int[] mSmartIndices = null;
    private final int[] mPrevIndices = null;
    private int mOrigStart;
    private int mIndex;
    private long mSessionStartTime;
    private long mLastEventTime;
    private boolean mSmartSelectionTriggered;
    private java.lang.String mModelName;
    @android.annotation.UnsupportedAppUsage
    public SmartSelectionEventTracker(android.content.Context p0, int p1) {}
    public SmartSelectionEventTracker(android.content.Context p0, int p1, java.lang.String p2) {}
    @android.annotation.UnsupportedAppUsage
    public void logEvent(android.view.textclassifier.logging.SmartSelectionEventTracker.SelectionEvent p0) {}
    private void writeEvent(android.view.textclassifier.logging.SmartSelectionEventTracker.SelectionEvent p0, long p1) {}
    private java.lang.String startNewSession() { return null; }
    private void endSession() {}
    private static int getLogType(android.view.textclassifier.logging.SmartSelectionEventTracker.SelectionEvent p0) { return 0; }
    private static java.lang.String getLogTypeString(int p0) { return null; }
    private int getRangeDelta(int p0) { return 0; }
    private int getSmartRangeDelta(int p0) { return 0; }
    private java.lang.String getWidgetTypeName() { return null; }
    private java.lang.String getModelName(android.view.textclassifier.logging.SmartSelectionEventTracker.SelectionEvent p0) { return null; }
    private static java.lang.String createSessionId() { return null; }
    private static void debugLog(android.metrics.LogMaker p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WidgetType {
        public static final int UNSPECIFIED = 0;
        public static final int TEXTVIEW = 1;
        public static final int WEBVIEW = 2;
        public static final int EDITTEXT = 3;
        public static final int EDIT_WEBVIEW = 4;
        public static final int UNSELECTABLE_TEXTVIEW = 5;
        public static final int CUSTOM_TEXTVIEW = 6;
        public static final int CUSTOM_EDITTEXT = 7;
        public static final int CUSTOM_UNSELECTABLE_TEXTVIEW = 8;
    }

    public static final class SelectionEvent {
        public static final int OUT_OF_BOUNDS = 2147483647;
        public static final int OUT_OF_BOUNDS_NEGATIVE = -2147483648;
        private static final java.lang.String NO_VERSION_TAG = "";
        private final int mStart = 0;
        private final int mEnd = 0;
        private int mEventType;
        private final java.lang.String mEntityType = null;
        private final java.lang.String mVersionTag = null;
        private SelectionEvent(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {}
        @android.annotation.UnsupportedAppUsage
        public static android.view.textclassifier.logging.SmartSelectionEventTracker.SelectionEvent selectionStarted(int p0) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.view.textclassifier.logging.SmartSelectionEventTracker.SelectionEvent selectionModified(int p0, int p1) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.view.textclassifier.logging.SmartSelectionEventTracker.SelectionEvent selectionModified(int p0, int p1, android.view.textclassifier.TextClassification p2) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.view.textclassifier.logging.SmartSelectionEventTracker.SelectionEvent selectionModified(int p0, int p1, android.view.textclassifier.TextSelection p2) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.view.textclassifier.logging.SmartSelectionEventTracker.SelectionEvent selectionAction(int p0, int p1, int p2) { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.view.textclassifier.logging.SmartSelectionEventTracker.SelectionEvent selectionAction(int p0, int p1, int p2, android.view.textclassifier.TextClassification p3) { return null; }
        private static java.lang.String getVersionInfo(java.lang.String p0) { return null; }
        private static java.lang.String getSourceClassifier(java.lang.String p0) { return null; }
        private boolean isTerminal() { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface EventType {
            public static final int SELECTION_STARTED = 1;
            public static final int SELECTION_MODIFIED = 2;
            public static final int SMART_SELECTION_SINGLE = 3;
            public static final int SMART_SELECTION_MULTI = 4;
            public static final int AUTO_SELECTION = 5;
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ActionType {
            public static final int OVERTYPE = 100;
            public static final int COPY = 101;
            public static final int PASTE = 102;
            public static final int CUT = 103;
            public static final int SHARE = 104;
            public static final int SMART_SHARE = 105;
            public static final int DRAG = 106;
            public static final int ABANDON = 107;
            public static final int OTHER = 108;
            public static final int SELECT_ALL = 200;
            public static final int RESET = 201;
        }
    }
}
