package android.view;

public class ScaleGestureDetector {
    public ScaleGestureDetector(android.content.Context p0, android.view.ScaleGestureDetector.OnScaleGestureListener p1) {}
    public ScaleGestureDetector(android.content.Context p0, android.view.ScaleGestureDetector.OnScaleGestureListener p1, android.os.Handler p2) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setQuickScaleEnabled(boolean p0) {}
    public boolean isQuickScaleEnabled() { return false; }
    public void setStylusScaleEnabled(boolean p0) {}
    public boolean isStylusScaleEnabled() { return false; }
    public boolean isInProgress() { return false; }
    public float getFocusX() { return 0.0f; }
    public float getFocusY() { return 0.0f; }
    public float getCurrentSpan() { return 0.0f; }
    public float getCurrentSpanX() { return 0.0f; }
    public float getCurrentSpanY() { return 0.0f; }
    public float getPreviousSpan() { return 0.0f; }
    public float getPreviousSpanX() { return 0.0f; }
    public float getPreviousSpanY() { return 0.0f; }
    public float getScaleFactor() { return 0.0f; }
    public long getTimeDelta() { return 0L; }
    public long getEventTime() { return 0L; }

    public static class SimpleOnScaleGestureListener implements android.view.ScaleGestureDetector.OnScaleGestureListener {
        public SimpleOnScaleGestureListener() {}
        public boolean onScale(android.view.ScaleGestureDetector p0) { return false; }
        public boolean onScaleBegin(android.view.ScaleGestureDetector p0) { return false; }
        public void onScaleEnd(android.view.ScaleGestureDetector p0) {}
    }

    public static interface OnScaleGestureListener {
        public boolean onScale(android.view.ScaleGestureDetector p0);
        public boolean onScaleBegin(android.view.ScaleGestureDetector p0);
        public void onScaleEnd(android.view.ScaleGestureDetector p0);
    }
}
