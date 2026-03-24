package android.widget;

public class OverScroller {
    public OverScroller(android.content.Context p0) {}
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1) {}
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1, boolean p2) {}
    @java.lang.Deprecated
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1, float p2, float p3) {}
    @java.lang.Deprecated
    public OverScroller(android.content.Context p0, android.view.animation.Interpolator p1, float p2, float p3, boolean p4) {}
    void setInterpolator(android.view.animation.Interpolator p0) {}
    public final void setFriction(float p0) {}
    public final boolean isFinished() { return false; }
    public final void forceFinished(boolean p0) {}
    public final int getCurrX() { return 0; }
    public final int getCurrY() { return 0; }
    public float getCurrVelocity() { return 0.0f; }
    public final int getStartX() { return 0; }
    public final int getStartY() { return 0; }
    public final int getFinalX() { return 0; }
    public final int getFinalY() { return 0; }
    public final int getDuration() { return 0; }
    public void extendDuration(int p0) {}
    public void setFinalX(int p0) {}
    public void setFinalY(int p0) {}
    public boolean computeScrollOffset() { return false; }
    public void startScroll(int p0, int p1, int p2, int p3) {}
    public void startScroll(int p0, int p1, int p2, int p3, int p4) {}
    public boolean springBack(int p0, int p1, int p2, int p3, int p4, int p5) { return false; }
    public void fling(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    public void fling(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    public void notifyHorizontalEdgeReached(int p0, int p1, int p2) {}
    public void notifyVerticalEdgeReached(int p0, int p1, int p2) {}
    public boolean isOverScrolled() { return false; }
    public void abortAnimation() {}
    public int timePassed() { return 0; }
    public boolean isScrollingInDirection(float p0, float p1) { return false; }
    double getSplineFlingDistance(int p0) { return 0.0; }

    static class SplineOverScroller {
        void setFriction(float p0) {}
        SplineOverScroller(android.content.Context p0) {}
        void updateScroll(float p0, float p1) {}
        void startScroll(int p0, int p1, int p2) {}
        void finish() {}
        void setFinalPosition(int p0) {}
        void extendDuration(int p0) {}
        boolean springback(int p0, int p1, int p2) { return false; }
        void fling(int p0, int p1, int p2, int p3, int p4) {}
        void notifyEdgeReached(int p0, int p1, int p2) {}
        boolean continueWhenFinished() { return false; }
        boolean update() { return false; }
    }
}
