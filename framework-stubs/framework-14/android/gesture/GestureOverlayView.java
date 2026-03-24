package android.gesture;

public class GestureOverlayView extends android.widget.FrameLayout {
    public static final int GESTURE_STROKE_TYPE_SINGLE = 0;
    public static final int GESTURE_STROKE_TYPE_MULTIPLE = 1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public GestureOverlayView(android.content.Context p0) { super((android.content.Context)null); }
    public GestureOverlayView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public GestureOverlayView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public GestureOverlayView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public java.util.ArrayList<android.gesture.GesturePoint> getCurrentStroke() { return null; }
    public int getOrientation() { return 0; }
    public void setOrientation(int p0) {}
    public void setGestureColor(int p0) {}
    public void setUncertainGestureColor(int p0) {}
    public int getUncertainGestureColor() { return 0; }
    public int getGestureColor() { return 0; }
    public float getGestureStrokeWidth() { return 0.0f; }
    public void setGestureStrokeWidth(float p0) {}
    public int getGestureStrokeType() { return 0; }
    public void setGestureStrokeType(int p0) {}
    public float getGestureStrokeLengthThreshold() { return 0.0f; }
    public void setGestureStrokeLengthThreshold(float p0) {}
    public float getGestureStrokeSquarenessTreshold() { return 0.0f; }
    public void setGestureStrokeSquarenessTreshold(float p0) {}
    public float getGestureStrokeAngleThreshold() { return 0.0f; }
    public void setGestureStrokeAngleThreshold(float p0) {}
    public boolean isEventsInterceptionEnabled() { return false; }
    public void setEventsInterceptionEnabled(boolean p0) {}
    public boolean isFadeEnabled() { return false; }
    public void setFadeEnabled(boolean p0) {}
    public android.gesture.Gesture getGesture() { return null; }
    public void setGesture(android.gesture.Gesture p0) {}
    public android.graphics.Path getGesturePath() { return null; }
    public android.graphics.Path getGesturePath(android.graphics.Path p0) { return null; }
    public boolean isGestureVisible() { return false; }
    public void setGestureVisible(boolean p0) {}
    public long getFadeOffset() { return 0L; }
    public void setFadeOffset(long p0) {}
    public void addOnGestureListener(android.gesture.GestureOverlayView.OnGestureListener p0) {}
    public void removeOnGestureListener(android.gesture.GestureOverlayView.OnGestureListener p0) {}
    public void removeAllOnGestureListeners() {}
    public void addOnGesturePerformedListener(android.gesture.GestureOverlayView.OnGesturePerformedListener p0) {}
    public void removeOnGesturePerformedListener(android.gesture.GestureOverlayView.OnGesturePerformedListener p0) {}
    public void removeAllOnGesturePerformedListeners() {}
    public void addOnGesturingListener(android.gesture.GestureOverlayView.OnGesturingListener p0) {}
    public void removeOnGesturingListener(android.gesture.GestureOverlayView.OnGesturingListener p0) {}
    public void removeAllOnGesturingListeners() {}
    public boolean isGesturing() { return false; }
    public android.graphics.Paint getGesturePaint() { return null; }
    public void draw(android.graphics.Canvas p0) {}
    public void clear(boolean p0) {}
    public void cancelClearAnimation() {}
    public void cancelGesture() {}
    protected void onDetachedFromWindow() {}
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }

    public static interface OnGesturePerformedListener {
        public void onGesturePerformed(android.gesture.GestureOverlayView p0, android.gesture.Gesture p1);
    }

    public static interface OnGestureListener {
        public void onGestureStarted(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
        public void onGesture(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
        public void onGestureEnded(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
        public void onGestureCancelled(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
    }

    public static interface OnGesturingListener {
        public void onGesturingStarted(android.gesture.GestureOverlayView p0);
        public void onGesturingEnded(android.gesture.GestureOverlayView p0);
    }

    private class FadeOutRunnable implements java.lang.Runnable {
        boolean fireActionPerformed;
        boolean resetMultipleStrokes;
        public void run() {}
    }
}
