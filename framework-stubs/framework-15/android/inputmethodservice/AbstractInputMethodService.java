package android.inputmethodservice;

public abstract class AbstractInputMethodService extends android.window.WindowProviderService implements android.view.KeyEvent.Callback {
    final android.view.KeyEvent.DispatcherState mDispatcherState = null;
    public AbstractInputMethodService() { super(); }
    @android.annotation.Nullable
    public final android.view.inputmethod.InputMethod getInputMethodInternal() { return null; }
    public android.view.KeyEvent.DispatcherState getKeyDispatcherState() { return null; }
    public abstract android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface();
    public abstract android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface();
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.NonNull
    android.inputmethodservice.InputMethodServiceInternal createInputMethodServiceInternal() { return null; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public final int getWindowType() { return 0; }
    @android.annotation.Nullable
    public final android.os.Bundle getWindowContextOptions() { return null; }
    public final int getInitialDisplayId() { return 0; }

    public abstract class AbstractInputMethodImpl implements android.view.inputmethod.InputMethod {
        public AbstractInputMethodImpl(android.inputmethodservice.AbstractInputMethodService p0) {}
        public void createSession(android.view.inputmethod.InputMethod.SessionCallback p0) {}
        public void setSessionEnabled(android.view.inputmethod.InputMethodSession p0, boolean p1) {}
        public void revokeSession(android.view.inputmethod.InputMethodSession p0) {}
    }

    public abstract class AbstractInputMethodSessionImpl implements android.view.inputmethod.InputMethodSession {
        boolean mEnabled;
        boolean mRevoked;
        public AbstractInputMethodSessionImpl(android.inputmethodservice.AbstractInputMethodService p0) {}
        public boolean isEnabled() { return false; }
        public boolean isRevoked() { return false; }
        public void setEnabled(boolean p0) {}
        public void revokeSelf() {}
        public void dispatchKeyEvent(int p0, android.view.KeyEvent p1, android.view.inputmethod.InputMethodSession.EventCallback p2) {}
        public void dispatchTrackballEvent(int p0, android.view.MotionEvent p1, android.view.inputmethod.InputMethodSession.EventCallback p2) {}
        public void dispatchGenericMotionEvent(int p0, android.view.MotionEvent p1, android.view.inputmethod.InputMethodSession.EventCallback p2) {}
    }
}
