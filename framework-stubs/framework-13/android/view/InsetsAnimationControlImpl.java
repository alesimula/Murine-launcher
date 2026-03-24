package android.view;

public class InsetsAnimationControlImpl implements android.view.InternalInsetsAnimationController, android.view.InsetsAnimationControlRunner {
    public InsetsAnimationControlImpl(android.util.SparseArray<android.view.InsetsSourceControl> p0, android.graphics.Rect p1, android.view.InsetsState p2, android.view.WindowInsetsAnimationControlListener p3, int p4, android.view.InsetsAnimationControlCallbacks p5, long p6, android.view.animation.Interpolator p7, int p8, int p9, android.content.res.CompatibilityInfo.Translator p10) {}
    public boolean hasZeroInsetsIme() { return false; }
    public void setReadyDispatched(boolean p0) {}
    public android.graphics.Insets getHiddenStateInsets() { return null; }
    public android.graphics.Insets getShownStateInsets() { return null; }
    public android.graphics.Insets getCurrentInsets() { return null; }
    public float getCurrentAlpha() { return 0.0f; }
    public int getTypes() { return 0; }
    public int getControllingTypes() { return 0; }
    public void notifyControlRevoked(int p0) {}
    public void updateSurfacePosition(android.util.SparseArray<android.view.InsetsSourceControl> p0) {}
    public int getAnimationType() { return 0; }
    public void setInsetsAndAlpha(android.graphics.Insets p0, float p1, float p2) {}
    public boolean applyChangeInsets(android.view.InsetsState p0) { return false; }
    public void finish(boolean p0) {}
    public float getCurrentFraction() { return 0.0f; }
    public void cancel() {}
    public boolean isFinished() { return false; }
    public boolean isCancelled() { return false; }
    public android.view.WindowInsetsAnimation getAnimation() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    android.util.SparseArray<android.view.InsetsSourceControl> getControls() { return null; }
}
