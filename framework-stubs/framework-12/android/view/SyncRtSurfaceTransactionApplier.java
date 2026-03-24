package android.view;

public class SyncRtSurfaceTransactionApplier {
    public static final int FLAG_ALL = -1;
    public static final int FLAG_ALPHA = 1;
    public static final int FLAG_MATRIX = 2;
    public static final int FLAG_WINDOW_CROP = 4;
    public static final int FLAG_LAYER = 8;
    public static final int FLAG_CORNER_RADIUS = 16;
    public static final int FLAG_BACKGROUND_BLUR_RADIUS = 32;
    public static final int FLAG_VISIBILITY = 64;
    public static final int FLAG_TRANSACTION = 128;
    private android.view.SurfaceControl mTargetSc;
    private final android.view.ViewRootImpl mTargetViewRootImpl = null;
    private final float[] mTmpFloat9 = null;
    public SyncRtSurfaceTransactionApplier(android.view.View p0) {}
    public void scheduleApply(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0) {}
    void applyParams(android.view.SurfaceControl.Transaction p0, android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p1) {}
    void applyTransaction(android.view.SurfaceControl.Transaction p0, long p1) {}
    public static void applyParams(android.view.SurfaceControl.Transaction p0, android.view.SyncRtSurfaceTransactionApplier.SurfaceParams p1, float[] p2) {}
    public static void create(android.view.View p0, java.util.function.Consumer<android.view.SyncRtSurfaceTransactionApplier> p1) {}

    public static class SurfaceParams {
        private final int flags = 0;
        public final android.view.SurfaceControl surface = null;
        public final float alpha = 0.0f;
        public final float cornerRadius = 0.0f;
        public final int backgroundBlurRadius = 0;
        public final android.graphics.Matrix matrix = null;
        public final android.graphics.Rect windowCrop = null;
        public final int layer = 0;
        public final boolean visible = false;
        public final android.view.SurfaceControl.Transaction mergeTransaction = null;
        private SurfaceParams(android.view.SurfaceControl p0, int p1, float p2, android.graphics.Matrix p3, android.graphics.Rect p4, int p5, float p6, int p7, boolean p8, android.view.SurfaceControl.Transaction p9) {}

        public static class Builder {
            final android.view.SurfaceControl surface = null;
            int flags;
            float alpha;
            float cornerRadius;
            int backgroundBlurRadius;
            android.graphics.Matrix matrix;
            android.graphics.Rect windowCrop;
            int layer;
            boolean visible;
            android.view.SurfaceControl.Transaction mergeTransaction;
            public Builder(android.view.SurfaceControl p0) {}
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withAlpha(float p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withMatrix(android.graphics.Matrix p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withWindowCrop(android.graphics.Rect p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withLayer(int p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withCornerRadius(float p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withBackgroundBlur(int p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withVisibility(boolean p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withMergeTransaction(android.view.SurfaceControl.Transaction p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams build() { return null; }
        }
    }
}
