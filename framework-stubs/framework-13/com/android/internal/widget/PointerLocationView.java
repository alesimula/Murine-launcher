package com.android.internal.widget;

public class PointerLocationView extends android.view.View implements android.hardware.input.InputManager.InputDeviceListener, android.view.WindowManagerPolicyConstants.PointerEventListener {
    public PointerLocationView(android.content.Context p0) { super((android.content.Context)null); }
    public void setPrintCoords(boolean p0) {}
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    protected void onMeasure(int p0, int p1) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onPointerEvent(android.view.MotionEvent p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public void onInputDeviceAdded(int p0) {}
    public void onInputDeviceChanged(int p0) {}
    public void onInputDeviceRemoved(int p0) {}

    private static final class FasterStringBuilder {
        public FasterStringBuilder() {}
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder clear() { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(java.lang.String p0) { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(int p0) { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(int p0, int p1) { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(float p0, int p1) { return null; }
        public java.lang.String toString() { return null; }
    }

    public static class PointerState {
        public PointerState() {}
        public void clearTrace() {}
        public void addTrace(float p0, float p1, boolean p2) {}
    }
}
