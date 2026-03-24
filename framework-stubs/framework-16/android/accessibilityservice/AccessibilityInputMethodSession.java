package android.accessibilityservice;

interface AccessibilityInputMethodSession {
    public void finishInput();
    public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5);
    public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2);
    public void setEnabled(boolean p0);
}
