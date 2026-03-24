package android.view;

public final class ScrollCaptureTarget {
    private final android.view.View mContainingView = null;
    private final android.view.ScrollCaptureCallback mCallback = null;
    private final android.graphics.Rect mLocalVisibleRect = null;
    private final android.graphics.Point mPositionInWindow = null;
    private final int mHint = 0;
    private android.graphics.Rect mScrollBounds;
    private final float[] mTmpFloatArr = null;
    private final android.graphics.Matrix mMatrixViewLocalToWindow = null;
    private final android.graphics.Rect mTmpRect = null;
    public ScrollCaptureTarget(android.view.View p0, android.graphics.Rect p1, android.graphics.Point p2, android.view.ScrollCaptureCallback p3) {}
    public int getHint() { return 0; }
    public android.view.ScrollCaptureCallback getCallback() { return null; }
    public android.view.View getContainingView() { return null; }
    public android.graphics.Rect getLocalVisibleRect() { return null; }
    public android.graphics.Point getPositionInWindow() { return null; }
    public android.graphics.Rect getScrollBounds() { return null; }
    public void setScrollBounds(android.graphics.Rect p0) {}
    private static void zero(float[] p0) {}
    private static void roundIntoPoint(android.graphics.Point p0, float[] p1) {}
    public void updatePositionInWindow() {}
}
