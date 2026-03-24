package android.window;

public class WindowOnBackInvokedDispatcher implements android.window.OnBackInvokedDispatcher {
    public final android.window.BackTouchTracker mTouchTracker = null;
    public final android.window.BackProgressAnimator mProgressAnimator = null;
    public final java.util.TreeMap<java.lang.Integer, java.util.ArrayList<android.window.OnBackInvokedCallback>> mOnBackInvokedCallbacks = null;
    public android.window.OnBackInvokedCallback mSystemNavigationObserverCallback;
    public WindowOnBackInvokedDispatcher(android.content.Context p0, android.os.Looper p1) {}
    public void onMotionEvent(android.view.MotionEvent p0) {}
    public void attachToWindow(android.view.IWindowSession p0, android.view.IWindow p1, android.view.ViewRootImpl p2, android.view.ImeBackAnimationController p3) {}
    public void detachFromWindow() {}
    public void registerOnBackInvokedCallback(int p0, android.window.OnBackInvokedCallback p1) {}
    public void registerOnBackInvokedCallbackUnchecked(android.window.OnBackInvokedCallback p0, int p1) {}
    public void unregisterOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public boolean isBackGestureInProgress() { return false; }
    public boolean isInterceptedMotionEvent() { return false; }
    public void setMotionEventIntercepted() {}
    public void registerSystemOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public void clear() {}
    public void tryInvokeSystemNavigationObserverCallback() {}
    public android.window.OnBackInvokedCallback getTopCallback() { return null; }
    public void updateContext(android.content.Context p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public boolean isOnBackInvokedCallbackEnabled() { return false; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public static boolean isOnBackInvokedCallbackEnabled(android.content.Context p0) { return false; }
    public void setImeOnBackInvokedDispatcher(android.window.ImeOnBackInvokedDispatcher p0) {}
    public boolean hasImeOnBackInvokedDispatcher() { return false; }
    public static boolean isOnBackInvokedCallbackEnabled(android.content.pm.ActivityInfo p0, android.content.pm.ApplicationInfo p1, java.util.function.Supplier<android.content.Context> p2) { return false; }

    public static class Checker {
        public Checker(android.content.Context p0) {}
        public boolean checkApplicationCallbackRegistration(int p0, android.window.OnBackInvokedCallback p1) { return false; }
    }

    private static class OnBackInvokedCallbackWrapper extends android.window.IOnBackInvokedCallback.Stub {
        OnBackInvokedCallbackWrapper(android.window.OnBackInvokedCallback p0, android.window.BackTouchTracker p1, android.window.BackProgressAnimator p2, android.os.Handler p3, java.util.function.BooleanSupplier p4, java.lang.Runnable p5, boolean p6) { super(); }
        public void onBackStarted(android.window.BackMotionEvent p0) {}
        public void setHandoffHandler(android.window.IBackAnimationHandoffHandler p0) {}
        public void onBackProgressed(android.window.BackMotionEvent p0) {}
        public void onBackCancelled() {}
        public void onBackInvoked() throws android.os.RemoteException {}
        public void setTriggerBack(boolean p0) throws android.os.RemoteException {}
    }
}
