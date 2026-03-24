package android.view.inputmethod;

public interface InputMethod {
    public static final java.lang.String TAG = "InputMethod";
    public static final java.lang.String SERVICE_INTERFACE = "android.view.InputMethod";
    public static final java.lang.String SERVICE_META_DATA = "android.view.im";
    public static final int SHOW_EXPLICIT = 1;
    public static final int SHOW_FORCED = 2;
    default public void initializeInternal(android.os.IBinder p0, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p1, int p2, boolean p3, int p4) {}
    default public void onCreateInlineSuggestionsRequest(com.android.internal.view.InlineSuggestionsRequestInfo p0, com.android.internal.view.IInlineSuggestionsRequestCallback p1) {}
    public void attachToken(android.os.IBinder p0);
    public void bindInput(android.view.inputmethod.InputBinding p0);
    public void unbindInput();
    public void startInput(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1);
    public void restartInput(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1);
    default public void dispatchStartInputWithToken(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, boolean p2, android.os.IBinder p3, int p4, android.window.ImeOnBackInvokedDispatcher p5) {}
    default public void onNavButtonFlagsChanged(int p0) {}
    public void createSession(android.view.inputmethod.InputMethod.SessionCallback p0);
    public void setSessionEnabled(android.view.inputmethod.InputMethodSession p0, boolean p1);
    public void revokeSession(android.view.inputmethod.InputMethodSession p0);
    default public void showSoftInputWithToken(int p0, android.os.ResultReceiver p1, android.os.IBinder p2) {}
    public void showSoftInput(int p0, android.os.ResultReceiver p1);
    public void hideSoftInputWithToken(int p0, android.os.ResultReceiver p1, android.os.IBinder p2);
    public void hideSoftInput(int p0, android.os.ResultReceiver p1);
    public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0);
    default public void canStartStylusHandwriting(int p0) {}
    default public void startStylusHandwriting(int p0, android.view.InputChannel p1, java.util.List<android.view.MotionEvent> p2) {}
    default public void initInkWindow() {}
    default public void finishStylusHandwriting() {}

    public static interface SessionCallback {
        public void sessionCreated(android.view.inputmethod.InputMethodSession p0);
    }
}
