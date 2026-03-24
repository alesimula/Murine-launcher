package android.window;

public class WindowOnBackInvokedDispatcher implements android.window.OnBackInvokedDispatcher {
    public final java.util.TreeMap<java.lang.Integer, java.util.ArrayList<android.window.OnBackInvokedCallback>> mOnBackInvokedCallbacks = null;
    public WindowOnBackInvokedDispatcher(android.content.Context p0) {}
    public void attachToWindow(android.view.IWindowSession p0, android.view.IWindow p1) {}
    public void detachFromWindow() {}
    public void registerOnBackInvokedCallback(int p0, android.window.OnBackInvokedCallback p1) {}
    public void registerOnBackInvokedCallbackUnchecked(android.window.OnBackInvokedCallback p0, int p1) {}
    public void unregisterOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public void registerSystemOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public void clear() {}
    public android.window.OnBackInvokedCallback getTopCallback() { return null; }
    public void updateContext(android.content.Context p0) {}
    public boolean isOnBackInvokedCallbackEnabled() { return false; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public static boolean isOnBackInvokedCallbackEnabled(android.content.Context p0) { return false; }
    public void setImeOnBackInvokedDispatcher(android.window.ImeOnBackInvokedDispatcher p0) {}
    public boolean hasImeOnBackInvokedDispatcher() { return false; }

    public static class Checker {
        public Checker(android.content.Context p0) {}
        public boolean checkApplicationCallbackRegistration(int p0, android.window.OnBackInvokedCallback p1) { return false; }
    }

    static class OnBackInvokedCallbackWrapper extends android.window.IOnBackInvokedCallback.Stub {
        final android.window.WindowOnBackInvokedDispatcher.OnBackInvokedCallbackWrapper.CallbackRef mCallbackRef = null;
        OnBackInvokedCallbackWrapper(android.window.OnBackInvokedCallback p0) { super(); }
        OnBackInvokedCallbackWrapper(android.window.OnBackInvokedCallback p0, boolean p1) { super(); }
        public void onBackStarted(android.window.BackMotionEvent p0) {}
        public void onBackProgressed(android.window.BackMotionEvent p0) {}
        public void onBackCancelled() {}
        public void onBackInvoked() throws android.os.RemoteException {}

        static class CallbackRef {
            final java.lang.ref.WeakReference<android.window.OnBackInvokedCallback> mWeakRef = null;
            final android.window.OnBackInvokedCallback mStrongRef = null;
            CallbackRef(android.window.OnBackInvokedCallback p0, boolean p1) {}
            android.window.OnBackInvokedCallback get() { return null; }
        }
    }
}
