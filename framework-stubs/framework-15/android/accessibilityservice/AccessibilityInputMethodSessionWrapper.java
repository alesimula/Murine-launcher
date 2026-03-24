package android.accessibilityservice;

final class AccessibilityInputMethodSessionWrapper extends com.android.internal.inputmethod.IAccessibilityInputMethodSession.Stub {
    AccessibilityInputMethodSessionWrapper(android.os.Looper p0, android.accessibilityservice.AccessibilityInputMethodSession p1) { super(); }
    @android.annotation.Nullable
    android.accessibilityservice.AccessibilityInputMethodSession getSession() { return null; }
    public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public void finishInput() {}
    public void finishSession() {}
    public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2) {}
}
