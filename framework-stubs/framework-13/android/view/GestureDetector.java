package android.view;

public class GestureDetector {
    @java.lang.Deprecated
    public GestureDetector(android.view.GestureDetector.OnGestureListener p0, android.os.Handler p1) {}
    @java.lang.Deprecated
    public GestureDetector(android.view.GestureDetector.OnGestureListener p0) {}
    public GestureDetector(android.content.Context p0, android.view.GestureDetector.OnGestureListener p1) {}
    public GestureDetector(android.content.Context p0, android.view.GestureDetector.OnGestureListener p1, android.os.Handler p2) {}
    public GestureDetector(android.content.Context p0, android.view.GestureDetector.OnGestureListener p1, android.os.Handler p2, boolean p3) {}
    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener p0) {}
    public void setContextClickListener(android.view.GestureDetector.OnContextClickListener p0) {}
    public void setIsLongpressEnabled(boolean p0) {}
    public boolean isLongpressEnabled() { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }

    private class GestureHandler extends android.os.Handler {
        GestureHandler(android.view.GestureDetector p0) { super(); }
        GestureHandler(android.view.GestureDetector p0, android.os.Handler p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnContextClickListener {
        public boolean onContextClick(android.view.MotionEvent p0);
    }

    public static interface OnDoubleTapListener {
        public boolean onSingleTapConfirmed(android.view.MotionEvent p0);
        public boolean onDoubleTap(android.view.MotionEvent p0);
        public boolean onDoubleTapEvent(android.view.MotionEvent p0);
    }

    public static interface OnGestureListener {
        public boolean onDown(android.view.MotionEvent p0);
        public void onShowPress(android.view.MotionEvent p0);
        public boolean onSingleTapUp(android.view.MotionEvent p0);
        public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);
        public void onLongPress(android.view.MotionEvent p0);
        public boolean onFling(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);
    }

    public static class SimpleOnGestureListener implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnContextClickListener {
        public SimpleOnGestureListener() {}
        public boolean onSingleTapUp(android.view.MotionEvent p0) { return false; }
        public void onLongPress(android.view.MotionEvent p0) {}
        public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
        public boolean onFling(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
        public void onShowPress(android.view.MotionEvent p0) {}
        public boolean onDown(android.view.MotionEvent p0) { return false; }
        public boolean onDoubleTap(android.view.MotionEvent p0) { return false; }
        public boolean onDoubleTapEvent(android.view.MotionEvent p0) { return false; }
        public boolean onSingleTapConfirmed(android.view.MotionEvent p0) { return false; }
        public boolean onContextClick(android.view.MotionEvent p0) { return false; }
    }
}
