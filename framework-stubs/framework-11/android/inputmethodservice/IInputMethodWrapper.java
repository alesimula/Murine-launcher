package android.inputmethodservice;

class IInputMethodWrapper extends com.android.internal.view.IInputMethod.Stub implements com.android.internal.os.HandlerCaller.Callback {
    private static final java.lang.String TAG = "InputMethodWrapper";
    private static final int DO_DUMP = 1;
    private static final int DO_INITIALIZE_INTERNAL = 10;
    private static final int DO_SET_INPUT_CONTEXT = 20;
    private static final int DO_UNSET_INPUT_CONTEXT = 30;
    private static final int DO_START_INPUT = 32;
    private static final int DO_CREATE_SESSION = 40;
    private static final int DO_SET_SESSION_ENABLED = 45;
    private static final int DO_REVOKE_SESSION = 50;
    private static final int DO_SHOW_SOFT_INPUT = 60;
    private static final int DO_HIDE_SOFT_INPUT = 70;
    private static final int DO_CHANGE_INPUTMETHOD_SUBTYPE = 80;
    private static final int DO_CREATE_INLINE_SUGGESTIONS_REQUEST = 90;
    final java.lang.ref.WeakReference<android.inputmethodservice.AbstractInputMethodService> mTarget = null;
    final android.content.Context mContext = null;
    final com.android.internal.os.HandlerCaller mCaller = null;
    final java.lang.ref.WeakReference<android.view.inputmethod.InputMethod> mInputMethod = null;
    final int mTargetSdkVersion = 0;
    com.android.internal.inputmethod.CancellationGroup mCancellationGroup;
    public IInputMethodWrapper(android.inputmethodservice.AbstractInputMethodService p0, android.view.inputmethod.InputMethod p1) { super(); }
    public void executeMessage(android.os.Message p0) {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void initializeInternal(android.os.IBinder p0, int p1, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p2) {}
    public void onCreateInlineSuggestionsRequest(com.android.internal.view.InlineSuggestionsRequestInfo p0, com.android.internal.view.IInlineSuggestionsRequestCallback p1) {}
    public void bindInput(android.view.inputmethod.InputBinding p0) {}
    public void unbindInput() {}
    public void startInput(android.os.IBinder p0, com.android.internal.view.IInputContext p1, int p2, android.view.inputmethod.EditorInfo p3, boolean p4, boolean p5) {}
    public void createSession(android.view.InputChannel p0, com.android.internal.view.IInputSessionCallback p1) {}
    public void setSessionEnabled(com.android.internal.view.IInputMethodSession p0, boolean p1) {}
    public void revokeSession(com.android.internal.view.IInputMethodSession p0) {}
    public void showSoftInput(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) {}
    public void hideSoftInput(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) {}
    public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) {}

    static final class InputMethodSessionCallbackWrapper implements android.view.inputmethod.InputMethod.SessionCallback {
        final android.content.Context mContext = null;
        final android.view.InputChannel mChannel = null;
        final com.android.internal.view.IInputSessionCallback mCb = null;
        InputMethodSessionCallbackWrapper(android.content.Context p0, android.view.InputChannel p1, com.android.internal.view.IInputSessionCallback p2) {}
        public void sessionCreated(android.view.inputmethod.InputMethodSession p0) {}
    }
}
