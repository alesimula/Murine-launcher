package android.view;

public class InsetsAnimationControlImpl implements android.view.InternalInsetsAnimationController, android.view.InsetsAnimationControlRunner {
    public InsetsAnimationControlImpl(android.util.SparseArray<android.view.InsetsSourceControl> p0, android.graphics.Rect p1, android.graphics.Rect p2, android.view.InsetsState p3, android.view.WindowInsetsAnimationControlListener p4, int p5, android.view.InsetsAnimationControlCallbacks p6, android.view.InsetsAnimationControlRunner.SurfaceParamsApplier p7, android.view.InsetsAnimationSpec p8, int p9, int p10, android.content.res.CompatibilityInfo.Translator p11, android.view.inputmethod.ImeTracker.Token p12) {}
    public boolean hasZeroInsetsIme() { return false; }
    public long getDurationMs() { return 0L; }
    public android.view.animation.Interpolator getInsetsInterpolator() { return null; }
    public void setReadyDispatched(boolean p0) {}
    public android.graphics.Insets getHiddenStateInsets() { return null; }
    public android.graphics.Insets getShownStateInsets() { return null; }
    public android.graphics.Insets getCurrentInsets() { return null; }
    public float getCurrentAlpha() { return 0.0f; }
    public int getTypes() { return 0; }
    public int getControllingTypes() { return 0; }
    public void notifyControlRevoked(int p0) {}
    public void updateSurfacePosition(android.util.SparseArray<android.view.InsetsSourceControl> p0) {}
    public boolean willUpdateSurface() { return false; }
    public int getAnimationType() { return 0; }
    public android.view.InsetsAnimationControlRunner.SurfaceParamsApplier getSurfaceParamsApplier() { return null; }
    @android.annotation.Nullable
    public android.view.inputmethod.ImeTracker.Token getStatsToken() { return null; }
    public void setInsetsAndAlpha(android.graphics.Insets p0, float p1, float p2) {}
    public boolean applyChangeInsets(android.view.InsetsState p0) { return false; }
    public void finish(boolean p0) {}
    public float getCurrentFraction() { return 0.0f; }
    public void cancel() {}
    public boolean isFinished() { return false; }
    public boolean isCancelled() { return false; }
    public android.view.WindowInsetsAnimation getAnimation() { return null; }
    public void updateLayoutInsetsDuringAnimation(int p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    android.util.SparseArray<android.view.InsetsSourceControl> getControls() { return null; }
}
