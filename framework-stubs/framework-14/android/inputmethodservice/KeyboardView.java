package android.inputmethodservice;

@java.lang.Deprecated
public class KeyboardView extends android.view.View implements android.view.View.OnClickListener {
    android.os.Handler mHandler;
    public KeyboardView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public KeyboardView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public KeyboardView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    public void setOnKeyboardActionListener(android.inputmethodservice.KeyboardView.OnKeyboardActionListener p0) {}
    protected android.inputmethodservice.KeyboardView.OnKeyboardActionListener getOnKeyboardActionListener() { return null; }
    public void setKeyboard(android.inputmethodservice.Keyboard p0) {}
    public android.inputmethodservice.Keyboard getKeyboard() { return null; }
    public boolean setShifted(boolean p0) { return false; }
    public boolean isShifted() { return false; }
    public void setPreviewEnabled(boolean p0) {}
    public boolean isPreviewEnabled() { return false; }
    public void setVerticalCorrection(int p0) {}
    public void setPopupParent(android.view.View p0) {}
    public void setPopupOffset(int p0, int p1) {}
    public void setProximityCorrectionEnabled(boolean p0) {}
    public boolean isProximityCorrectionEnabled() { return false; }
    public void onClick(android.view.View p0) {}
    public void onMeasure(int p0, int p1) {}
    public void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void onDraw(android.graphics.Canvas p0) {}
    public void invalidateAllKeys() {}
    public void invalidateKey(int p0) {}
    protected boolean onLongPress(android.inputmethodservice.Keyboard.Key p0) { return false; }
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void swipeRight() {}
    protected void swipeLeft() {}
    protected void swipeUp() {}
    protected void swipeDown() {}
    public void closing() {}
    public void onDetachedFromWindow() {}
    public boolean handleBack() { return false; }

    public static interface OnKeyboardActionListener {
        public void onPress(int p0);
        public void onRelease(int p0);
        public void onKey(int p0, int[] p1);
        public void onText(java.lang.CharSequence p0);
        public void swipeLeft();
        public void swipeRight();
        public void swipeDown();
        public void swipeUp();
    }

    private static class SwipeTracker {
        static final int NUM_PAST = 4;
        static final int LONGEST_PAST_TIME = 200;
        final float[] mPastX = null;
        final float[] mPastY = null;
        final long[] mPastTime = null;
        float mYVelocity;
        float mXVelocity;
        public void clear() {}
        public void addMovement(android.view.MotionEvent p0) {}
        public void computeCurrentVelocity(int p0) {}
        public void computeCurrentVelocity(int p0, float p1) {}
        public float getXVelocity() { return 0.0f; }
        public float getYVelocity() { return 0.0f; }
    }
}
