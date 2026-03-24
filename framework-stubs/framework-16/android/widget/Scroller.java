package android.widget;

public class Scroller {
    public Scroller(android.content.Context p0) {}
    public Scroller(android.content.Context p0, android.view.animation.Interpolator p1) {}
    public Scroller(android.content.Context p0, android.view.animation.Interpolator p1, boolean p2) {}
    public final void setFriction(float p0) {}
    public final boolean isFinished() { return false; }
    public final void forceFinished(boolean p0) {}
    public final int getDuration() { return 0; }
    public final int getCurrX() { return 0; }
    public final int getCurrY() { return 0; }
    public float getCurrVelocity() { return 0.0f; }
    public final int getStartX() { return 0; }
    public final int getStartY() { return 0; }
    public final int getFinalX() { return 0; }
    public final int getFinalY() { return 0; }
    public boolean computeScrollOffset() { return false; }
    public void startScroll(int p0, int p1, int p2, int p3) {}
    public void startScroll(int p0, int p1, int p2, int p3, int p4) {}
    public void fling(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    public void abortAnimation() {}
    public void extendDuration(int p0) {}
    public int timePassed() { return 0; }
    public void setFinalX(int p0) {}
    public void setFinalY(int p0) {}
    public boolean isScrollingInDirection(float p0, float p1) { return false; }

    static class ViscousFluidInterpolator implements android.view.animation.Interpolator {
        ViscousFluidInterpolator() {}
        public float getInterpolation(float p0) { return 0.0f; }
    }
}
