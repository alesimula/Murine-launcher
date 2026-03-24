package android.view;

public class InsetsAnimationThreadControlRunner implements android.view.InsetsAnimationControlRunner {
    public InsetsAnimationThreadControlRunner(android.util.SparseArray<android.view.InsetsSourceControl> p0, android.graphics.Rect p1, android.graphics.Rect p2, android.view.InsetsState p3, android.view.WindowInsetsAnimationControlListener p4, int p5, android.view.InsetsAnimationControlCallbacks p6, android.view.InsetsAnimationSpec p7, int p8, int p9, android.content.res.CompatibilityInfo.Translator p10, android.os.Handler p11, android.view.inputmethod.ImeTracker.Token p12) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    @android.annotation.Nullable
    public android.view.inputmethod.ImeTracker.Token getStatsToken() { return null; }
    public int getTypes() { return 0; }
    public int getControllingTypes() { return 0; }
    public void notifyControlRevoked(int p0) {}
    public void updateSurfacePosition(android.util.SparseArray<android.view.InsetsSourceControl> p0) {}
    public boolean willUpdateSurface() { return false; }
    public void cancel() {}
    public android.view.WindowInsetsAnimation getAnimation() { return null; }
    public int getAnimationType() { return 0; }
    public android.view.InsetsAnimationControlRunner.SurfaceParamsApplier getSurfaceParamsApplier() { return null; }
    public void updateLayoutInsetsDuringAnimation(int p0) {}
}
