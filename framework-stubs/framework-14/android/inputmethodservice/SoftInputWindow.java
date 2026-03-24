package android.inputmethodservice;

final class SoftInputWindow extends android.app.Dialog {
    void setToken(android.os.IBinder p0) {}
    SoftInputWindow(android.inputmethodservice.InputMethodService p0, int p1, android.view.KeyEvent.DispatcherState p2) { super((android.content.Context)null); }
    public void onWindowFocusChanged(boolean p0) {}
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public void show() {}
    void dismissForDestroyIfNecessary() {}
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface WindowState {
        public static final int TOKEN_PENDING = 0;
        public static final int TOKEN_SET = 1;
        public static final int SHOWN_AT_LEAST_ONCE = 2;
        public static final int REJECTED_AT_LEAST_ONCE = 3;
        public static final int DESTROYED = 4;
    }
}
