package android.view.textclassifier;

final class TextClassificationSession implements android.view.textclassifier.TextClassifier {
    private static final java.lang.String LOG_TAG = "TextClassificationSession";
    private final android.view.textclassifier.TextClassifier mDelegate = null;
    private final android.view.textclassifier.TextClassificationSession.SelectionEventHelper mEventHelper = null;
    private final android.view.textclassifier.TextClassificationSessionId mSessionId = null;
    private final android.view.textclassifier.TextClassificationContext mClassificationContext = null;
    private boolean mDestroyed;
    TextClassificationSession(android.view.textclassifier.TextClassificationContext p0, android.view.textclassifier.TextClassifier p1) {}
    public android.view.textclassifier.TextSelection suggestSelection(android.view.textclassifier.TextSelection.Request p0) { return null; }
    private void initializeRemoteSession() {}
    public android.view.textclassifier.TextClassification classifyText(android.view.textclassifier.TextClassification.Request p0) { return null; }
    public android.view.textclassifier.TextLinks generateLinks(android.view.textclassifier.TextLinks.Request p0) { return null; }
    public void onSelectionEvent(android.view.textclassifier.SelectionEvent p0) {}
    public void onTextClassifierEvent(android.view.textclassifier.TextClassifierEvent p0) {}
    public void destroy() {}
    public boolean isDestroyed() { return false; }
    private void checkDestroyed() {}

    private static final class SelectionEventHelper {
        private final android.view.textclassifier.TextClassificationSessionId mSessionId = null;
        private final android.view.textclassifier.TextClassificationContext mContext = null;
        private int mInvocationMethod;
        private android.view.textclassifier.SelectionEvent mPrevEvent;
        private android.view.textclassifier.SelectionEvent mSmartEvent;
        private android.view.textclassifier.SelectionEvent mStartEvent;
        SelectionEventHelper(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextClassificationContext p1) {}
        boolean sanitizeEvent(android.view.textclassifier.SelectionEvent p0) { return false; }
        void endSession() {}
        private void updateInvocationMethod(android.view.textclassifier.SelectionEvent p0) {}
        private void modifyAutoSelectionEventType(android.view.textclassifier.SelectionEvent p0) {}
    }
}
