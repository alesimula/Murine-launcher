package android.view;

public interface InsetsAnimationControlCallbacks {
    public <T extends android.view.InsetsAnimationControlRunner & android.view.InternalInsetsAnimationController> void startAnimation(T p0, android.view.WindowInsetsAnimationControlListener p1, int p2, android.view.WindowInsetsAnimation p3, android.view.WindowInsetsAnimation.Bounds p4);
    public void scheduleApplyChangeInsets(android.view.InsetsAnimationControlRunner p0);
    public void notifyFinished(android.view.InsetsAnimationControlRunner p0, boolean p1);
    public void releaseSurfaceControlFromRt(android.view.SurfaceControl p0);
    public void reportPerceptible(int p0, boolean p1);
}
