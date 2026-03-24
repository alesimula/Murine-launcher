package android.widget;

public final class TextViewOnReceiveContentListener implements android.view.OnReceiveContentListener {
    public TextViewOnReceiveContentListener() {}
    @android.annotation.Nullable
    public android.view.ContentInfo onReceiveContent(android.view.View p0, android.view.ContentInfo p1) { return null; }
    void setInputConnectionInfo(android.widget.TextView p0, android.view.inputmethod.InputConnection p1, android.view.inputmethod.EditorInfo p2) {}
    void clearInputConnectionInfo() {}
    @android.annotation.Nullable
    public java.lang.String[] getFallbackMimeTypesForAutofill(android.widget.TextView p0) { return null; }

    private static final class InputConnectionInfo {
        public java.lang.String toString() { return null; }
    }
}
