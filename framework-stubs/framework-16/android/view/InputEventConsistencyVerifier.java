package android.view;

public final class InputEventConsistencyVerifier {
    public static final int FLAG_RAW_DEVICE_INPUT = 1;
    public InputEventConsistencyVerifier(java.lang.Object p0, int p1) {}
    public InputEventConsistencyVerifier(java.lang.Object p0, int p1, java.lang.String p2) {}
    public static boolean isInstrumentationEnabled() { return false; }
    public void reset() {}
    public void onInputEvent(android.view.InputEvent p0, int p1) {}
    public void onKeyEvent(android.view.KeyEvent p0, int p1) {}
    public void onTrackballEvent(android.view.MotionEvent p0, int p1) {}
    public void onTouchEvent(android.view.MotionEvent p0, int p1) {}
    public void onGenericMotionEvent(android.view.MotionEvent p0, int p1) {}
    public void onUnhandledEvent(android.view.InputEvent p0, int p1) {}

    private static final class KeyState {
        public android.view.InputEventConsistencyVerifier.KeyState next;
        public int deviceId;
        public int source;
        public int keyCode;
        public boolean unhandled;
        public static android.view.InputEventConsistencyVerifier.KeyState obtain(int p0, int p1, int p2) { return null; }
        public void recycle() {}
    }
}
