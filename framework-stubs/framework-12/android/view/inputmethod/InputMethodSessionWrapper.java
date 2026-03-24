package android.view.inputmethod;

final class InputMethodSessionWrapper {
    private static final java.lang.String TAG = "InputMethodSessionWrapper";
    private final com.android.internal.view.IInputMethodSession mSession = null;
    private InputMethodSessionWrapper(com.android.internal.view.IInputMethodSession p0) {}
    public static android.view.inputmethod.InputMethodSessionWrapper createOrNull(com.android.internal.view.IInputMethodSession p0) { return null; }
    void finishInput() {}
    void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
    void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
    void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
    void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    void notifyImeHidden() {}
    void viewClicked(boolean p0) {}
    void updateCursor(android.graphics.Rect p0) {}
    void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public java.lang.String toString() { return null; }
}
