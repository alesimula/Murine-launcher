package android.inputmethodservice;

public final class MultiClientInputMethodServiceDelegate {
    public static final java.lang.String SERVICE_INTERFACE = "android.inputmethodservice.MultiClientInputMethodService";
    public static final int INVALID_CLIENT_ID = -1;
    public static final int INVALID_WINDOW_HANDLE = -1;
    private final android.inputmethodservice.MultiClientInputMethodServiceDelegateImpl mImpl = null;
    private MultiClientInputMethodServiceDelegate(android.content.Context p0, android.inputmethodservice.MultiClientInputMethodServiceDelegate.ServiceCallback p1) {}
    public static android.inputmethodservice.MultiClientInputMethodServiceDelegate create(android.content.Context p0, android.inputmethodservice.MultiClientInputMethodServiceDelegate.ServiceCallback p1) { return null; }
    public void onDestroy() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public android.os.IBinder createInputMethodWindowToken(int p0) { return null; }
    public void acceptClient(int p0, android.inputmethodservice.MultiClientInputMethodServiceDelegate.ClientCallback p1, android.view.KeyEvent.DispatcherState p2, android.os.Looper p3) {}
    public void reportImeWindowTarget(int p0, int p1, android.os.IBinder p2) {}
    public boolean isUidAllowedOnDisplay(int p0, int p1) { return false; }
    public void setActive(int p0, boolean p1) {}

    public static interface ClientCallback {
        public void onAppPrivateCommand(java.lang.String p0, android.os.Bundle p1);
        public void onDisplayCompletions(android.view.inputmethod.CompletionInfo[] p0);
        public void onFinishSession();
        public void onHideSoftInput(int p0, android.os.ResultReceiver p1);
        public void onShowSoftInput(int p0, android.os.ResultReceiver p1);
        public void onStartInputOrWindowGainedFocus(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, int p2, int p3, int p4);
        public void onUpdateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0);
        public void onUpdateSelection(int p0, int p1, int p2, int p3, int p4, int p5);
        public boolean onGenericMotionEvent(android.view.MotionEvent p0);
        public boolean onKeyDown(int p0, android.view.KeyEvent p1);
        public boolean onKeyLongPress(int p0, android.view.KeyEvent p1);
        public boolean onKeyMultiple(int p0, android.view.KeyEvent p1);
        public boolean onKeyUp(int p0, android.view.KeyEvent p1);
        public boolean onTrackballEvent(android.view.MotionEvent p0);
    }

    public static interface ServiceCallback {
        public void initialized();
        public void addClient(int p0, int p1, int p2, int p3);
        public void removeClient(int p0);
    }
}
