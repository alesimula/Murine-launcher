package android.widget;

public final class TextViewOnReceiveContentListener implements android.view.OnReceiveContentListener {
    private static final java.lang.String LOG_TAG = "ReceiveContent";
    private android.widget.TextViewOnReceiveContentListener.InputConnectionInfo mInputConnectionInfo;
    private static final long AUTOFILL_NON_TEXT_REQUIRES_ON_RECEIVE_CONTENT_LISTENER = 163400105L;
    public TextViewOnReceiveContentListener() {}
    public android.view.ContentInfo onReceiveContent(android.view.View p0, android.view.ContentInfo p1) { return null; }
    private static void replaceSelection(android.text.Editable p0, java.lang.CharSequence p1) {}
    private void onReceiveForAutofill(android.widget.TextView p0, android.view.ContentInfo p1) {}
    private static java.lang.CharSequence coerceToText(android.content.ClipData p0, android.content.Context p1, int p2) { return null; }
    private static boolean isUsageOfImeCommitContentEnabled(android.view.View p0) { return false; }
    void setInputConnectionInfo(android.widget.TextView p0, android.view.inputmethod.InputConnection p1, android.view.inputmethod.EditorInfo p2) {}
    void clearInputConnectionInfo() {}
    public java.lang.String[] getFallbackMimeTypesForAutofill(android.widget.TextView p0) { return null; }
    private android.content.ClipData handleNonTextViaImeCommitContent(android.content.ClipData p0) { return null; }
    private static boolean isClipMimeTypeSupported(java.lang.String[] p0, android.content.ClipDescription p1) { return false; }
    private static boolean containsUri(android.content.ClipData p0) { return false; }
    private static boolean containsOnlyText(android.content.ClipData p0) { return false; }

    private static final class InputConnectionInfo {
        private final java.lang.ref.WeakReference<android.view.inputmethod.InputConnection> mInputConnection = null;
        private final java.lang.String[] mEditorInfoContentMimeTypes = null;
        private InputConnectionInfo(android.view.inputmethod.InputConnection p0, java.lang.String[] p1) {}
        public java.lang.String toString() { return null; }
    }
}
