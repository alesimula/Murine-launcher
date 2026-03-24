package android.widget;

public final class SelectionActionModeHelper {
    private static final java.lang.String LOG_TAG = "SelectActionModeHelper";
    private final android.widget.Editor mEditor = null;
    private final android.widget.TextView mTextView = null;
    private final android.widget.SelectionActionModeHelper.TextClassificationHelper mTextClassificationHelper = null;
    private android.view.textclassifier.TextClassification mTextClassification;
    private android.os.AsyncTask mTextClassificationAsyncTask;
    private final android.widget.SelectionActionModeHelper.SelectionTracker mSelectionTracker = null;
    private final android.widget.SmartSelectSprite mSmartSelectSprite = null;
    SelectionActionModeHelper(android.widget.Editor p0) {}
    private static int[] sortSelctionIndices(int p0, int p1) { return null; }
    private static int[] sortSelctionIndicesFromTextView(android.widget.TextView p0) { return null; }
    public void startSelectionActionModeAsync(boolean p0) {}
    public void startLinkActionModeAsync(int p0, int p1) {}
    public void invalidateActionModeAsync() {}
    public void onSelectionAction(int p0, java.lang.String p1) {}
    public void onSelectionDrag() {}
    public void onTextChanged(int p0, int p1) {}
    public boolean resetSelection(int p0) { return false; }
    public android.view.textclassifier.TextClassification getTextClassification() { return null; }
    public void onDestroyActionMode() {}
    public void onDraw(android.graphics.Canvas p0) {}
    public boolean isDrawingHighlight() { return false; }
    private android.view.textclassifier.TextClassificationConstants getTextClassificationSettings() { return null; }
    private void cancelAsyncTask() {}
    private boolean skipTextClassification() { return false; }
    private void startLinkActionMode(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
    private void startSelectionActionMode(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
    private void startActionMode(int p0, android.widget.SelectionActionModeHelper.SelectionResult p1) {}
    private void startSelectionActionModeWithSmartSelectAnimation(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
    private java.util.List<android.widget.SmartSelectSprite.RectangleWithTextSelectionLayout> convertSelectionToRectangles(android.text.Layout p0, int p1, int p2) { return null; }
    public static <T extends java.lang.Object> void mergeRectangleIntoList(java.util.List<T> p0, android.graphics.RectF p1, java.util.function.Function<T, android.graphics.RectF> p2, java.util.function.Function<android.graphics.RectF, T> p3) {}
    public static <T extends java.lang.Object> android.graphics.PointF movePointInsideNearestRectangle(android.graphics.PointF p0, java.util.List<T> p1, java.util.function.Function<T, android.graphics.RectF> p2) { return null; }
    private void invalidateActionMode(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
    private void resetTextClassificationHelper(int p0, int p1) {}
    private void resetTextClassificationHelper() {}
    private void cancelSmartSelectAnimation() {}
    private static int getActionType(int p0) { return 0; }
    private static java.lang.CharSequence getText(android.widget.TextView p0) { return null; }

    private static final class SelectionMetricsLogger {
        private static final java.lang.String LOG_TAG = "SelectionMetricsLogger";
        private static final java.util.regex.Pattern PATTERN_WHITESPACE = null;
        private final boolean mEditTextLogger = false;
        private final java.text.BreakIterator mTokenIterator = null;
        private android.view.textclassifier.TextClassifier mClassificationSession;
        private android.view.textclassifier.TextClassificationContext mClassificationContext;
        private android.view.textclassifier.TextClassifierEvent mTranslateViewEvent;
        private android.view.textclassifier.TextClassifierEvent mTranslateClickEvent;
        private int mStartIndex;
        private java.lang.String mText;
        SelectionMetricsLogger(android.widget.TextView p0) {}
        public void logSelectionStarted(android.view.textclassifier.TextClassifier p0, android.view.textclassifier.TextClassificationContext p1, java.lang.CharSequence p2, int p3, int p4) {}
        public void logSelectionModified(int p0, int p1, android.view.textclassifier.TextClassification p2, android.view.textclassifier.TextSelection p3) {}
        public void logSelectionAction(int p0, int p1, int p2, java.lang.String p3, android.view.textclassifier.TextClassification p4) {}
        public boolean isEditTextLogger() { return false; }
        public void endTextClassificationSession() {}
        private boolean hasActiveClassificationSession() { return false; }
        private int[] getWordDelta(int p0, int p1) { return null; }
        private int countWordsBackward(int p0) { return 0; }
        private int countWordsForward(int p0) { return 0; }
        private boolean isWhitespace(int p0, int p1) { return false; }
        private void maybeGenerateTranslateViewEvent(android.view.textclassifier.TextClassification p0) {}
        private void maybeGenerateTranslateClickEvent(android.view.textclassifier.TextClassification p0, java.lang.String p1) {}
        private void maybeReportTranslateEvents() {}
        private static android.view.textclassifier.TextClassifierEvent generateTranslateEvent(int p0, android.view.textclassifier.TextClassification p1, android.view.textclassifier.TextClassificationContext p2, java.lang.String p3) { return null; }
    }

    private static final class SelectionResult {
        private final int mStart = 0;
        private final int mEnd = 0;
        private final android.view.textclassifier.TextClassification mClassification = null;
        private final android.view.textclassifier.TextSelection mSelection = null;
        SelectionResult(int p0, int p1, android.view.textclassifier.TextClassification p2, android.view.textclassifier.TextSelection p3) {}
    }

    private static final class SelectionTracker {
        private final android.widget.TextView mTextView = null;
        private android.widget.SelectionActionModeHelper.SelectionMetricsLogger mLogger;
        private int mOriginalStart;
        private int mOriginalEnd;
        private int mSelectionStart;
        private int mSelectionEnd;
        private boolean mAllowReset;
        private final android.widget.SelectionActionModeHelper.SelectionTracker.LogAbandonRunnable mDelayedLogAbandon = null;
        SelectionTracker(android.widget.TextView p0) {}
        public void onOriginalSelection(java.lang.CharSequence p0, int p1, int p2, boolean p3) {}
        public void onSmartSelection(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
        public void onLinkSelected(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
        private void onClassifiedSelection(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
        public void onSelectionUpdated(int p0, int p1, android.view.textclassifier.TextClassification p2) {}
        public void onSelectionDestroyed() {}
        public void onSelectionAction(int p0, int p1, int p2, java.lang.String p3, android.view.textclassifier.TextClassification p4) {}
        public boolean resetSelection(int p0, android.widget.Editor p1) { return false; }
        public void onTextChanged(int p0, int p1, android.view.textclassifier.TextClassification p2) {}
        private void maybeInvalidateLogger() {}
        private boolean isSelectionStarted() { return false; }

        private final class LogAbandonRunnable implements java.lang.Runnable {
            private boolean mIsPending;
            private LogAbandonRunnable(android.widget.SelectionActionModeHelper.SelectionTracker p0) {}
            void schedule(int p0) {}
            void flush() {}
            public void run() {}
        }
    }

    private static final class TextClassificationAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.widget.SelectionActionModeHelper.SelectionResult> {
        private final int mTimeOutDuration = 0;
        private final java.util.function.Supplier<android.widget.SelectionActionModeHelper.SelectionResult> mSelectionResultSupplier = null;
        private final java.util.function.Consumer<android.widget.SelectionActionModeHelper.SelectionResult> mSelectionResultCallback = null;
        private final java.util.function.Supplier<android.widget.SelectionActionModeHelper.SelectionResult> mTimeOutResultSupplier = null;
        private final android.widget.TextView mTextView = null;
        private final java.lang.String mOriginalText = null;
        TextClassificationAsyncTask(android.widget.TextView p0, int p1, java.util.function.Supplier<android.widget.SelectionActionModeHelper.SelectionResult> p2, java.util.function.Consumer<android.widget.SelectionActionModeHelper.SelectionResult> p3, java.util.function.Supplier<android.widget.SelectionActionModeHelper.SelectionResult> p4) { super(); }
        protected android.widget.SelectionActionModeHelper.SelectionResult doInBackground(java.lang.Void... p0) { return null; }
        protected void onPostExecute(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
        private void onTimeOut() {}
    }

    private static final class TextClassificationHelper {
        private static final int TRIM_DELTA = 120;
        private final android.content.Context mContext = null;
        private java.util.function.Supplier<android.view.textclassifier.TextClassifier> mTextClassifier;
        private java.lang.String mText;
        private int mSelectionStart;
        private int mSelectionEnd;
        private android.os.LocaleList mDefaultLocales;
        private java.lang.CharSequence mTrimmedText;
        private int mTrimStart;
        private int mRelativeStart;
        private int mRelativeEnd;
        private java.lang.CharSequence mLastClassificationText;
        private int mLastClassificationSelectionStart;
        private int mLastClassificationSelectionEnd;
        private android.os.LocaleList mLastClassificationLocales;
        private android.widget.SelectionActionModeHelper.SelectionResult mLastClassificationResult;
        private boolean mHot;
        TextClassificationHelper(android.content.Context p0, java.util.function.Supplier<android.view.textclassifier.TextClassifier> p1, java.lang.CharSequence p2, int p3, int p4, android.os.LocaleList p5) {}
        public void init(java.util.function.Supplier<android.view.textclassifier.TextClassifier> p0, java.lang.CharSequence p1, int p2, int p3, android.os.LocaleList p4) {}
        public android.widget.SelectionActionModeHelper.SelectionResult classifyText() { return null; }
        public android.widget.SelectionActionModeHelper.SelectionResult suggestSelection() { return null; }
        public android.widget.SelectionActionModeHelper.SelectionResult getOriginalSelection() { return null; }
        public int getTimeoutDuration() { return 0; }
        private boolean isDarkLaunchEnabled() { return false; }
        private android.widget.SelectionActionModeHelper.SelectionResult performClassification(android.view.textclassifier.TextSelection p0) { return null; }
        private void trimText() {}
    }
}
