package android.view.textclassifier;

public final class SystemTextClassifier implements android.view.textclassifier.TextClassifier {
    public SystemTextClassifier(android.content.Context p0, android.view.textclassifier.TextClassificationConstants p1, boolean p2) throws android.os.ServiceManager.ServiceNotFoundException {}
    public android.view.textclassifier.TextSelection suggestSelection(android.view.textclassifier.TextSelection.Request p0) { return null; }
    public android.view.textclassifier.TextClassification classifyText(android.view.textclassifier.TextClassification.Request p0) { return null; }
    public android.view.textclassifier.TextLinks generateLinks(android.view.textclassifier.TextLinks.Request p0) { return null; }
    public void onSelectionEvent(android.view.textclassifier.SelectionEvent p0) {}
    public void onTextClassifierEvent(android.view.textclassifier.TextClassifierEvent p0) {}
    public android.view.textclassifier.TextLanguage detectLanguage(android.view.textclassifier.TextLanguage.Request p0) { return null; }
    public android.view.textclassifier.ConversationActions suggestConversationActions(android.view.textclassifier.ConversationActions.Request p0) { return null; }
    public int getMaxGenerateLinksTextLength() { return 0; }
    public void destroy() {}
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    void initializeRemoteSession(android.view.textclassifier.TextClassificationContext p0, android.view.textclassifier.TextClassificationSessionId p1) {}

    private static final class BlockingCallback<T extends android.os.Parcelable> extends android.service.textclassifier.ITextClassifierCallback.Stub {
        BlockingCallback(java.lang.String p0, android.view.textclassifier.TextClassificationConstants p1) { super(); }
        public void onSuccess(android.os.Bundle p0) {}
        public void onFailure() {}
        public T get() { return null; }
    }

    private static final class ResponseReceiver<T extends java.lang.Object> {
        public void onSuccess(T p0) {}
        public void onFailure() {}
        public T get() { return null; }
    }
}
