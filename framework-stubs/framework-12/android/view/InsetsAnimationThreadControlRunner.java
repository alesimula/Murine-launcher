package android.view;

public class InsetsAnimationThreadControlRunner implements android.view.InsetsAnimationControlRunner {
    private static final java.lang.String TAG = "InsetsAnimThreadRunner";
    private final android.view.InsetsAnimationControlImpl mControl = null;
    private final android.view.InsetsAnimationControlCallbacks mOuterCallbacks = null;
    private final android.os.Handler mMainThreadHandler = null;
    private final android.view.InsetsAnimationControlCallbacks mCallbacks = null;
    public InsetsAnimationThreadControlRunner(android.util.SparseArray<android.view.InsetsSourceControl> p0, android.graphics.Rect p1, android.view.InsetsState p2, android.view.WindowInsetsAnimationControlListener p3, int p4, android.view.InsetsAnimationControlCallbacks p5, long p6, android.view.animation.Interpolator p7, int p8, int p9, android.content.res.CompatibilityInfo.Translator p10, android.os.Handler p11) {}
    private void releaseControls(android.util.SparseArray<android.view.InsetsSourceControl> p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public int getTypes() { return 0; }
    public int getControllingTypes() { return 0; }
    public void notifyControlRevoked(int p0) {}
    public void updateSurfacePosition(android.util.SparseArray<android.view.InsetsSourceControl> p0) {}
    public void cancel() {}
    public android.view.WindowInsetsAnimation getAnimation() { return null; }
    public int getAnimationType() { return 0; }
}
