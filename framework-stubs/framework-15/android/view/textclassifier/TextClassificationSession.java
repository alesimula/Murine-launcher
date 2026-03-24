package android.view.textclassifier;

final class TextClassificationSession implements android.view.textclassifier.TextClassifier {
    TextClassificationSession(android.view.textclassifier.TextClassificationContext p0, android.view.textclassifier.TextClassifier p1) {}
    public android.view.textclassifier.TextSelection suggestSelection(android.view.textclassifier.TextSelection.Request p0) { return null; }
    public android.view.textclassifier.TextClassification classifyText(android.view.textclassifier.TextClassification.Request p0) { return null; }
    public android.view.textclassifier.TextLinks generateLinks(android.view.textclassifier.TextLinks.Request p0) { return null; }
    public android.view.textclassifier.ConversationActions suggestConversationActions(android.view.textclassifier.ConversationActions.Request p0) { return null; }
    public android.view.textclassifier.TextLanguage detectLanguage(android.view.textclassifier.TextLanguage.Request p0) { return null; }
    public int getMaxGenerateLinksTextLength() { return 0; }
    public void onSelectionEvent(android.view.textclassifier.SelectionEvent p0) {}
    public void onTextClassifierEvent(android.view.textclassifier.TextClassifierEvent p0) {}
    public void destroy() {}
    public boolean isDestroyed() { return false; }

    private static class CleanerRunnable implements java.lang.Runnable {
        CleanerRunnable(android.view.textclassifier.TextClassificationSession.SelectionEventHelper p0, android.view.textclassifier.TextClassifier p1) {}
        public void run() {}
    }

    private static final class SelectionEventHelper {
        SelectionEventHelper(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextClassificationContext p1) {}
        boolean sanitizeEvent(android.view.textclassifier.SelectionEvent p0) { return false; }
        void endSession() {}
    }
}
