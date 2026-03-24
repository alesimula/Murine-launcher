package com.android.internal.inputmethod;

public final class InputMethodPrivilegedOperations {
    private static final java.lang.String TAG = "InputMethodPrivilegedOperations";
    private final com.android.internal.inputmethod.InputMethodPrivilegedOperations.OpsHolder mOps = null;
    public InputMethodPrivilegedOperations() {}
    public void set(com.android.internal.inputmethod.IInputMethodPrivilegedOperations p0) {}
    public void setImeWindowStatus(int p0, int p1) {}
    public void reportStartInput(android.os.IBinder p0) {}
    public com.android.internal.inputmethod.IInputContentUriToken createInputContentUriToken(android.net.Uri p0, java.lang.String p1) { return null; }
    public void reportFullscreenMode(boolean p0) {}
    public void updateStatusIcon(java.lang.String p0, int p1) {}
    public void setInputMethod(java.lang.String p0) {}
    public void setInputMethodAndSubtype(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1) {}
    public void hideMySoftInput(int p0) {}
    public void showMySoftInput(int p0) {}
    public boolean switchToPreviousInputMethod() { return false; }
    public boolean switchToNextInputMethod(boolean p0) { return false; }
    public boolean shouldOfferSwitchingToNextInputMethod() { return false; }
    public void notifyUserAction() {}
    public void reportPreRendered(android.view.inputmethod.EditorInfo p0) {}
    public void applyImeVisibility(boolean p0) {}

    private static final class OpsHolder {
        private com.android.internal.inputmethod.IInputMethodPrivilegedOperations mPrivOps;
        private OpsHolder() {}
        public synchronized void set(com.android.internal.inputmethod.IInputMethodPrivilegedOperations p0) {}
        private static java.lang.String getCallerMethodName() { return null; }
        public synchronized com.android.internal.inputmethod.IInputMethodPrivilegedOperations getAndWarnIfNull() { return null; }
    }
}
