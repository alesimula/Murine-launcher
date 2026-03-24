package android.view.inputmethod;

public interface InputMethod {
    public static final java.lang.String SERVICE_INTERFACE = "android.view.InputMethod";
    public static final java.lang.String SERVICE_META_DATA = "android.view.im";
    public static final int SHOW_EXPLICIT = 1;
    public static final int SHOW_FORCED = 2;
    default public void initializeInternal(android.os.IBinder p0, int p1, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p2) {}
    public void attachToken(android.os.IBinder p0);
    default public void updateInputMethodDisplay(int p0) {}
    public void bindInput(android.view.inputmethod.InputBinding p0);
    public void unbindInput();
    public void startInput(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1);
    public void restartInput(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1);
    default public void dispatchStartInputWithToken(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, boolean p2, android.os.IBinder p3, boolean p4) {}
    public void createSession(android.view.inputmethod.InputMethod.SessionCallback p0);
    public void setSessionEnabled(android.view.inputmethod.InputMethodSession p0, boolean p1);
    public void revokeSession(android.view.inputmethod.InputMethodSession p0);
    public void showSoftInput(int p0, android.os.ResultReceiver p1);
    public void hideSoftInput(int p0, android.os.ResultReceiver p1);
    public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0);

    public static interface SessionCallback {
        public void sessionCreated(android.view.inputmethod.InputMethodSession p0);
    }
}
