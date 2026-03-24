package com.android.internal.inputmethod;

public final class InputMethodPrivilegedOperations {
    public InputMethodPrivilegedOperations() {}
    public void set(com.android.internal.inputmethod.IInputMethodPrivilegedOperations p0) {}
    public void setImeWindowStatusAsync(int p0, int p1) {}
    public void reportStartInputAsync(android.os.IBinder p0) {}
    public com.android.internal.inputmethod.IInputContentUriToken createInputContentUriToken(android.net.Uri p0, java.lang.String p1) { return null; }
    public void reportFullscreenModeAsync(boolean p0) {}
    public void updateStatusIconAsync(java.lang.String p0, int p1) {}
    public void setInputMethod(java.lang.String p0) {}
    public void setInputMethodAndSubtype(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1) {}
    public void hideMySoftInput(int p0, int p1) {}
    public void showMySoftInput(int p0) {}
    public boolean switchToPreviousInputMethod() { return false; }
    public boolean switchToNextInputMethod(boolean p0) { return false; }
    public boolean shouldOfferSwitchingToNextInputMethod() { return false; }
    public void notifyUserActionAsync() {}
    public void applyImeVisibilityAsync(android.os.IBinder p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) {}
    public void onStylusHandwritingReady(int p0, int p1) {}
    public void resetStylusHandwriting(int p0) {}

    private static final class OpsHolder {
        public synchronized void set(com.android.internal.inputmethod.IInputMethodPrivilegedOperations p0) {}
        public synchronized com.android.internal.inputmethod.IInputMethodPrivilegedOperations getAndWarnIfNull() { return null; }
    }
}
