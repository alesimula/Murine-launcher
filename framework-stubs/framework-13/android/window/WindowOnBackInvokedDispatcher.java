package android.window;

public class WindowOnBackInvokedDispatcher implements android.window.OnBackInvokedDispatcher {
    public WindowOnBackInvokedDispatcher(boolean p0) {}
    public void attachToWindow(android.view.IWindowSession p0, android.view.IWindow p1) {}
    public void detachFromWindow() {}
    public void registerOnBackInvokedCallback(int p0, android.window.OnBackInvokedCallback p1) {}
    public void registerOnBackInvokedCallbackUnchecked(android.window.OnBackInvokedCallback p0, int p1) {}
    public void unregisterOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public void registerSystemOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public void clear() {}
    public android.window.OnBackInvokedCallback getTopCallback() { return null; }
    public android.window.WindowOnBackInvokedDispatcher.Checker getChecker() { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public static boolean isOnBackInvokedCallbackEnabled(android.content.Context p0) { return false; }
    public void setImeOnBackInvokedDispatcher(android.window.ImeOnBackInvokedDispatcher p0) {}

    public static class Checker {
        public Checker(boolean p0) {}
        public boolean checkApplicationCallbackRegistration(int p0, android.window.OnBackInvokedCallback p1) { return false; }
    }

    static abstract class OnBackInvokedCallbackWrapper extends android.window.IOnBackInvokedCallback.Stub {
        OnBackInvokedCallbackWrapper(android.window.OnBackInvokedCallback p0) { super(); }
        public void onBackStarted(android.window.BackMotionEvent p0) {}
        public void onBackProgressed(android.window.BackMotionEvent p0) {}
        public void onBackCancelled() {}
        public void onBackInvoked() throws android.os.RemoteException {}
    }
}
