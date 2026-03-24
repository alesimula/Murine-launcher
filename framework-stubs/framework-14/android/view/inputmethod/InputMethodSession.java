package android.view.inputmethod;

public interface InputMethodSession {
    public void finishInput();
    public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5);
    public void viewClicked(boolean p0);
    public void updateCursor(android.graphics.Rect p0);
    public void displayCompletions(android.view.inputmethod.CompletionInfo[] p0);
    public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1);
    public void dispatchKeyEvent(int p0, android.view.KeyEvent p1, android.view.inputmethod.InputMethodSession.EventCallback p2);
    public void dispatchTrackballEvent(int p0, android.view.MotionEvent p1, android.view.inputmethod.InputMethodSession.EventCallback p2);
    public void dispatchGenericMotionEvent(int p0, android.view.MotionEvent p1, android.view.inputmethod.InputMethodSession.EventCallback p2);
    public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1);
    @java.lang.Deprecated
    public void toggleSoftInput(int p0, int p1);
    public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0);
    public void removeImeSurface();
    default public void invalidateInputInternal(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) {}

    public static interface EventCallback {
        public void finishedEvent(int p0, boolean p1);
    }
}
