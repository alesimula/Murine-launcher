package android.inputmethodservice;

final class MultiClientInputMethodClientCallbackAdaptor {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = null;
    private final java.lang.Object mSessionLock = null;
    android.inputmethodservice.MultiClientInputMethodClientCallbackAdaptor.CallbackImpl mCallbackImpl;
    android.view.InputChannel mReadChannel;
    android.view.KeyEvent.DispatcherState mDispatcherState;
    android.os.Handler mHandler;
    android.view.InputEventReceiver mInputEventReceiver;
    private final java.util.concurrent.atomic.AtomicBoolean mFinished = null;
    com.android.internal.view.IInputMethodSession.Stub createIInputMethodSession() { return null; }
    com.android.internal.inputmethod.IMultiClientInputMethodSession.Stub createIMultiClientInputMethodSession() { return null; }
    MultiClientInputMethodClientCallbackAdaptor(android.inputmethodservice.MultiClientInputMethodServiceDelegate.ClientCallback p0, android.os.Looper p1, android.view.KeyEvent.DispatcherState p2, android.view.InputChannel p3) {}
    private static void reportNotSupported() {}

    private static final class MultiClientInputMethodSessionImpl extends com.android.internal.inputmethod.IMultiClientInputMethodSession.Stub {
        private final java.lang.Object mSessionLock = null;
        private android.inputmethodservice.MultiClientInputMethodClientCallbackAdaptor.CallbackImpl mCallbackImpl;
        private android.os.Handler mHandler;
        private final java.util.concurrent.atomic.AtomicBoolean mSessionFinished = null;
        MultiClientInputMethodSessionImpl(java.lang.Object p0, android.inputmethodservice.MultiClientInputMethodClientCallbackAdaptor.CallbackImpl p1, android.os.Handler p2, java.util.concurrent.atomic.AtomicBoolean p3) { super(); }
        public void startInputOrWindowGainedFocus(com.android.internal.view.IInputContext p0, int p1, android.view.inputmethod.EditorInfo p2, int p3, int p4, int p5) {}
        public void showSoftInput(int p0, android.os.ResultReceiver p1) {}
        public void hideSoftInput(int p0, android.os.ResultReceiver p1) {}
    }

    private static final class KeyEventCallbackAdaptor implements android.view.KeyEvent.Callback {
        private final android.inputmethodservice.MultiClientInputMethodServiceDelegate.ClientCallback mLocalCallback = null;
        KeyEventCallbackAdaptor(android.inputmethodservice.MultiClientInputMethodServiceDelegate.ClientCallback p0) {}
        public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    }

    private static final class InputMethodSessionImpl extends com.android.internal.view.IInputMethodSession.Stub {
        private final java.lang.Object mSessionLock = null;
        private android.inputmethodservice.MultiClientInputMethodClientCallbackAdaptor.CallbackImpl mCallbackImpl;
        private android.os.Handler mHandler;
        private final java.util.concurrent.atomic.AtomicBoolean mSessionFinished = null;
        InputMethodSessionImpl(java.lang.Object p0, android.inputmethodservice.MultiClientInputMethodClientCallbackAdaptor.CallbackImpl p1, android.os.Handler p2, java.util.concurrent.atomic.AtomicBoolean p3) { super(); }
        public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
        public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
        public void viewClicked(boolean p0) {}
        public void updateCursor(android.graphics.Rect p0) {}
        public void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
        public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        public void toggleSoftInput(int p0, int p1) {}
        public void finishSession() {}
        public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
        public final void notifyImeHidden() {}
    }

    private static final class ImeInputEventReceiver extends android.view.InputEventReceiver {
        private final java.util.concurrent.atomic.AtomicBoolean mFinished = null;
        private final android.view.KeyEvent.DispatcherState mDispatcherState = null;
        private final android.inputmethodservice.MultiClientInputMethodServiceDelegate.ClientCallback mClientCallback = null;
        private final android.inputmethodservice.MultiClientInputMethodClientCallbackAdaptor.KeyEventCallbackAdaptor mKeyEventCallbackAdaptor = null;
        ImeInputEventReceiver(android.view.InputChannel p0, android.os.Looper p1, java.util.concurrent.atomic.AtomicBoolean p2, android.view.KeyEvent.DispatcherState p3, android.inputmethodservice.MultiClientInputMethodServiceDelegate.ClientCallback p4) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
    }

    private static final class CallbackImpl {
        private final android.inputmethodservice.MultiClientInputMethodClientCallbackAdaptor mCallbackAdaptor = null;
        private final android.inputmethodservice.MultiClientInputMethodServiceDelegate.ClientCallback mOriginalCallback = null;
        private boolean mFinished;
        CallbackImpl(android.inputmethodservice.MultiClientInputMethodClientCallbackAdaptor p0, android.inputmethodservice.MultiClientInputMethodServiceDelegate.ClientCallback p1) {}
        void updateSelection(com.android.internal.os.SomeArgs p0) {}
        void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
        void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        void toggleSoftInput(int p0, int p1) {}
        void finishSession() {}
        void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
        void startInputOrWindowGainedFocus(com.android.internal.os.SomeArgs p0) {}
        void showSoftInput(int p0, android.os.ResultReceiver p1) {}
        void hideSoftInput(int p0, android.os.ResultReceiver p1) {}
    }
}
