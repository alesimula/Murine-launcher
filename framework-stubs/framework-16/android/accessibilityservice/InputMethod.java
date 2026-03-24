package android.accessibilityservice;

public class InputMethod {
    public InputMethod(android.accessibilityservice.AccessibilityService p0) {}
    @android.annotation.Nullable
    public final android.accessibilityservice.InputMethod.AccessibilityInputConnection getCurrentInputConnection() { return null; }
    public final boolean getCurrentInputStarted() { return false; }
    @android.annotation.Nullable
    public final android.view.inputmethod.EditorInfo getCurrentInputEditorInfo() { return null; }
    public void onStartInput(android.view.inputmethod.EditorInfo p0, boolean p1) {}
    public void onFinishInput() {}
    public void onUpdateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    final void createImeSession(com.android.internal.inputmethod.IAccessibilityInputMethodSessionCallback p0) {}
    final void startInput(com.android.internal.inputmethod.RemoteAccessibilityInputConnection p0, android.view.inputmethod.EditorInfo p1) {}
    final void restartInput(com.android.internal.inputmethod.RemoteAccessibilityInputConnection p0, android.view.inputmethod.EditorInfo p1) {}
    final void doStartInput(com.android.internal.inputmethod.RemoteAccessibilityInputConnection p0, android.view.inputmethod.EditorInfo p1, boolean p2) {}
    final void doFinishInput() {}

    public final class AccessibilityInputConnection {
        AccessibilityInputConnection(android.accessibilityservice.InputMethod p0, com.android.internal.inputmethod.RemoteAccessibilityInputConnection p1) {}
        public void commitText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) {}
        public void setSelection(int p0, int p1) {}
        @android.annotation.Nullable
        public android.view.inputmethod.SurroundingText getSurroundingText(int p0, int p1, int p2) { return null; }
        public void deleteSurroundingText(int p0, int p1) {}
        public void sendKeyEvent(android.view.KeyEvent p0) {}
        public void performEditorAction(int p0) {}
        public void performContextMenuAction(int p0) {}
        public int getCursorCapsMode(int p0) { return 0; }
        public void clearMetaKeyStates(int p0) {}
    }

    private final class SessionImpl implements android.accessibilityservice.AccessibilityInputMethodSession {
        boolean mEnabled;
        public void setEnabled(boolean p0) {}
        public void finishInput() {}
        public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
        public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2) {}
    }
}
