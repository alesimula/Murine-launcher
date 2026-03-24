package android.view.inputmethod;

final class IInputMethodSessionInvoker {
    @android.annotation.Nullable
    public static android.view.inputmethod.IInputMethodSessionInvoker createOrNull(com.android.internal.inputmethod.IInputMethodSession p0) { return null; }
    void finishInput() {}
    void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
    void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
    void displayCompletionsInternal(android.view.inputmethod.CompletionInfo[] p0) {}
    void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
    void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    void viewClicked(boolean p0) {}
    void updateCursor(android.graphics.Rect p0) {}
    void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
}
