package android.window;

public class ImeOnBackInvokedDispatcher implements android.window.OnBackInvokedDispatcher, android.os.Parcelable {
    static final java.lang.String RESULT_KEY_ID = "id";
    static final java.lang.String RESULT_KEY_CALLBACK = "callback";
    static final java.lang.String RESULT_KEY_PRIORITY = "priority";
    static final int RESULT_CODE_REGISTER = 0;
    static final int RESULT_CODE_UNREGISTER = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.ImeOnBackInvokedDispatcher> CREATOR = null;
    public ImeOnBackInvokedDispatcher(android.os.Handler p0) {}
    void setHandler(android.os.Handler p0) {}
    @android.annotation.Nullable
    protected android.window.WindowOnBackInvokedDispatcher getReceivingDispatcher() { return null; }
    ImeOnBackInvokedDispatcher(android.os.Parcel p0) {}
    public void registerOnBackInvokedCallback(int p0, android.window.OnBackInvokedCallback p1) {}
    public void unregisterOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void clear() {}
    public void switchRootView(android.view.ViewRootImpl p0, android.view.ViewRootImpl p1) {}

    public static class DefaultImeOnBackAnimationCallback extends android.window.ImeOnBackInvokedDispatcher.ImeOnBackInvokedCallback {
        DefaultImeOnBackAnimationCallback(android.window.IOnBackInvokedCallback p0, int p1, int p2) { super(null, 0, 0); }
    }

    public static class ImeOnBackInvokedCallback implements android.window.OnBackAnimationCallback {
        ImeOnBackInvokedCallback(android.window.IOnBackInvokedCallback p0, int p1, int p2) {}
        public void onBackStarted(android.window.BackEvent p0) {}
        public void onBackProgressed(android.window.BackEvent p0) {}
        public void onBackInvoked() {}
        public void onBackCancelled() {}
        public java.lang.String toString() { return null; }
    }

    private class ImeOnBackInvokedCallbackWrapper extends android.window.IOnBackInvokedCallback.Stub {
        ImeOnBackInvokedCallbackWrapper(android.window.ImeOnBackInvokedDispatcher p0, android.window.OnBackInvokedCallback p1) { super(); }
        public void onBackStarted(android.window.BackMotionEvent p0) {}
        public void onBackProgressed(android.window.BackMotionEvent p0) {}
        public void onBackCancelled() {}
        public void onBackInvoked() {}
        public void setTriggerBack(boolean p0) {}
    }
}
