package com.android.internal.inputmethod;

public class MultiClientInputMethodPrivilegedOperations {
    private static final java.lang.String TAG = "MultiClientInputMethodPrivilegedOperations";
    private final com.android.internal.inputmethod.MultiClientInputMethodPrivilegedOperations.OpsHolder mOps = null;
    public MultiClientInputMethodPrivilegedOperations() {}
    public void set(com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations p0) {}
    public void dispose() {}
    public android.os.IBinder createInputMethodWindowToken(int p0) { return null; }
    public void deleteInputMethodWindowToken(android.os.IBinder p0) {}
    public void acceptClient(int p0, com.android.internal.view.IInputMethodSession p1, com.android.internal.inputmethod.IMultiClientInputMethodSession p2, android.view.InputChannel p3) {}
    public void reportImeWindowTarget(int p0, int p1, android.os.IBinder p2) {}
    public boolean isUidAllowedOnDisplay(int p0, int p1) { return false; }
    public void setActive(int p0, boolean p1) {}

    private static final class OpsHolder {
        private com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations mPrivOps;
        private OpsHolder() {}
        public synchronized void set(com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations p0) {}
        private static java.lang.String getCallerMethodName() { return null; }
        public synchronized void dispose() {}
        public synchronized com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations getAndWarnIfNull() { return null; }
    }
}
