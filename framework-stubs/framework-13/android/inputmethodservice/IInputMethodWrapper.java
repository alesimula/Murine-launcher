package android.inputmethodservice;

class IInputMethodWrapper extends com.android.internal.view.IInputMethod.Stub implements com.android.internal.os.HandlerCaller.Callback {
    final java.lang.ref.WeakReference<android.inputmethodservice.InputMethodServiceInternal> mTarget = null;
    final android.content.Context mContext = null;
    final com.android.internal.os.HandlerCaller mCaller = null;
    final java.lang.ref.WeakReference<android.view.inputmethod.InputMethod> mInputMethod = null;
    final int mTargetSdkVersion = 0;
    com.android.internal.inputmethod.CancellationGroup mCancellationGroup;
    IInputMethodWrapper(android.inputmethodservice.InputMethodServiceInternal p0, android.view.inputmethod.InputMethod p1) { super(); }
    public void executeMessage(android.os.Message p0) {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void initializeInternal(android.os.IBinder p0, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p1, int p2, boolean p3, int p4) {}
    public void onCreateInlineSuggestionsRequest(com.android.internal.view.InlineSuggestionsRequestInfo p0, com.android.internal.view.IInlineSuggestionsRequestCallback p1) {}
    public void bindInput(android.view.inputmethod.InputBinding p0) {}
    public void unbindInput() {}
    public void startInput(android.os.IBinder p0, com.android.internal.view.IInputContext p1, android.view.inputmethod.EditorInfo p2, boolean p3, int p4, android.window.ImeOnBackInvokedDispatcher p5) {}
    public void onNavButtonFlagsChanged(int p0) {}
    public void createSession(android.view.InputChannel p0, com.android.internal.view.IInputSessionCallback p1) {}
    public void setSessionEnabled(com.android.internal.view.IInputMethodSession p0, boolean p1) {}
    public void showSoftInput(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) {}
    public void hideSoftInput(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) {}
    public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) {}
    public void canStartStylusHandwriting(int p0) throws android.os.RemoteException {}
    public void startStylusHandwriting(int p0, android.view.InputChannel p1, java.util.List<android.view.MotionEvent> p2) throws android.os.RemoteException {}
    public void initInkWindow() {}
    public void finishStylusHandwriting() {}

    static final class InputMethodSessionCallbackWrapper implements android.view.inputmethod.InputMethod.SessionCallback {
        final android.content.Context mContext = null;
        final android.view.InputChannel mChannel = null;
        final com.android.internal.view.IInputSessionCallback mCb = null;
        InputMethodSessionCallbackWrapper(android.content.Context p0, android.view.InputChannel p1, com.android.internal.view.IInputSessionCallback p2) {}
        public void sessionCreated(android.view.inputmethod.InputMethodSession p0) {}
    }
}
