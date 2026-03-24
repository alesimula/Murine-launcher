package com.android.internal.inputmethod;

final class IRemoteAccessibilityInputConnectionInvoker {
    public static com.android.internal.inputmethod.IRemoteAccessibilityInputConnectionInvoker create(com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.inputmethod.IRemoteAccessibilityInputConnectionInvoker cloneWithSessionId(int p0) { return null; }
    public boolean isSameConnection(com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p0) { return false; }
    @android.annotation.NonNull
    com.android.internal.inputmethod.InputConnectionCommandHeader createHeader() { return null; }
    public void commitText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) {}
    public void setSelection(int p0, int p1) {}
    @android.annotation.NonNull
    public com.android.internal.infra.AndroidFuture<android.view.inputmethod.SurroundingText> getSurroundingText(int p0, int p1, int p2) { return null; }
    public void deleteSurroundingText(int p0, int p1) {}
    public void sendKeyEvent(android.view.KeyEvent p0) {}
    public void performEditorAction(int p0) {}
    public void performContextMenuAction(int p0) {}
    @android.annotation.NonNull
    public com.android.internal.infra.AndroidFuture<java.lang.Integer> getCursorCapsMode(int p0) { return null; }
    public void clearMetaKeyStates(int p0) {}
}
