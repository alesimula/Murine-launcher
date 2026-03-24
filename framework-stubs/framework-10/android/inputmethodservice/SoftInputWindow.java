package android.inputmethodservice;

public class SoftInputWindow extends android.app.Dialog {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "SoftInputWindow";
    final java.lang.String mName = null;
    final android.inputmethodservice.SoftInputWindow.Callback mCallback = null;
    final android.view.KeyEvent.Callback mKeyEventCallback = null;
    final android.view.KeyEvent.DispatcherState mDispatcherState = null;
    final int mWindowType = 0;
    final int mGravity = 0;
    final boolean mTakesFocus = false;
    private final android.graphics.Rect mBounds = null;
    private int mWindowState;
    public void setToken(android.os.IBinder p0) {}
    public SoftInputWindow(android.content.Context p0, java.lang.String p1, int p2, android.inputmethodservice.SoftInputWindow.Callback p3, android.view.KeyEvent.Callback p4, android.view.KeyEvent.DispatcherState p5, int p6, int p7, boolean p8) { super((android.content.Context)null); }
    public void onWindowFocusChanged(boolean p0) {}
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setGravity(int p0) {}
    public int getGravity() { return 0; }
    private void updateWidthHeight(android.view.WindowManager.LayoutParams p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public void onBackPressed() {}
    private void initDockWindow() {}
    public final void show() {}
    final void dismissForDestroyIfNecessary() {}
    private void updateWindowState(int p0) {}
    private static java.lang.String stateToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface SoftInputWindowState {
        public static final int TOKEN_PENDING = 0;
        public static final int TOKEN_SET = 1;
        public static final int SHOWN_AT_LEAST_ONCE = 2;
        public static final int REJECTED_AT_LEAST_ONCE = 3;
        public static final int DESTROYED = 4;
    }

    public static interface Callback {
        public void onBackPressed();
    }
}
