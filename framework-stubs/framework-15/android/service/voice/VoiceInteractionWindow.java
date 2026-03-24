package android.service.voice;

final class VoiceInteractionWindow extends android.app.Dialog {
    void setToken(android.os.IBinder p0) {}
    VoiceInteractionWindow(android.content.Context p0, java.lang.String p1, int p2, android.service.voice.VoiceInteractionWindow.Callback p3, android.view.KeyEvent.Callback p4, android.view.KeyEvent.DispatcherState p5, int p6, int p7, boolean p8) { super((android.content.Context)null); }
    public void onWindowFocusChanged(boolean p0) {}
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public void onBackPressed() {}
    public void show() {}

    static interface Callback {
        public void onBackPressed();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface WindowState {
        public static final int TOKEN_PENDING = 0;
        public static final int TOKEN_SET = 1;
        public static final int SHOWN_AT_LEAST_ONCE = 2;
        public static final int REJECTED_AT_LEAST_ONCE = 3;
        public static final int DESTROYED = 4;
    }
}
