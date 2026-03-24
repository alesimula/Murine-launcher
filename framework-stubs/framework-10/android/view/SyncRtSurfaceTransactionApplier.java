package android.view;

public class SyncRtSurfaceTransactionApplier {
    private final android.view.Surface mTargetSurface = null;
    private final android.view.ViewRootImpl mTargetViewRootImpl = null;
    private final float[] mTmpFloat9 = null;
    public SyncRtSurfaceTransactionApplier(android.view.View p0) {}
    public void scheduleApply(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0) {}
    public static void applyParams(android.view.SurfaceControl.Transaction p0, android.view.SyncRtSurfaceTransactionApplier.SurfaceParams p1, float[] p2) {}
    public static void create(android.view.View p0, java.util.function.Consumer<android.view.SyncRtSurfaceTransactionApplier> p1) {}

    public static class SurfaceParams {
        public final android.view.SurfaceControl surface = null;
        public final float alpha = 0.0f;
        final float cornerRadius = 0.0f;
        public final android.graphics.Matrix matrix = null;
        public final android.graphics.Rect windowCrop = null;
        public final int layer = 0;
        public final boolean visible = false;
        public SurfaceParams(android.view.SurfaceControl p0, float p1, android.graphics.Matrix p2, android.graphics.Rect p3, int p4, float p5, boolean p6) {}
    }
}
