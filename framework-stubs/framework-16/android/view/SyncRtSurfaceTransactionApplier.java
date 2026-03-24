package android.view;

public class SyncRtSurfaceTransactionApplier {
    public static final int FLAG_ALL = -1;
    public static final int FLAG_ALPHA = 1;
    public static final int FLAG_MATRIX = 2;
    public static final int FLAG_WINDOW_CROP = 4;
    public static final int FLAG_LAYER = 8;
    public static final int FLAG_CORNER_RADIUS = 16;
    public static final int FLAG_BACKGROUND_BLUR_RADIUS = 32;
    public static final int FLAG_BACKGROUND_BLUR_SCALE = 64;
    public static final int FLAG_VISIBILITY = 128;
    public static final int FLAG_TRANSACTION = 256;
    public static final int FLAG_EARLY_WAKEUP_START = 512;
    public static final int FLAG_EARLY_WAKEUP_END = 1024;
    public static final int FLAG_OPAQUE = 2048;
    public SyncRtSurfaceTransactionApplier(android.view.View p0) {}
    public void scheduleApply(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0) {}
    void applyParams(android.view.SurfaceControl.Transaction p0, android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p1) {}
    void applyTransaction(android.view.SurfaceControl.Transaction p0, long p1) {}
    @android.annotation.SuppressLint("MissingPermission")
    public static void applyParams(android.view.SurfaceControl.Transaction p0, android.view.SyncRtSurfaceTransactionApplier.SurfaceParams p1, float[] p2) {}
    public static void create(android.view.View p0, java.util.function.Consumer<android.view.SyncRtSurfaceTransactionApplier> p1) {}

    public static class SurfaceParams {
        public final android.view.SurfaceControl surface = null;
        public final float alpha = 0.0f;
        public final float cornerRadius = 0.0f;
        public final int backgroundBlurRadius = 0;
        public final float backgroundBlurScale = 0.0f;
        public final android.graphics.Matrix matrix = null;
        public final android.graphics.Rect windowCrop = null;
        public final int layer = 0;
        public final boolean visible = false;
        public final android.view.SurfaceControl.Transaction mergeTransaction = null;
        public final boolean opaque = false;
        public final android.gui.EarlyWakeupInfo earlyWakeupInfo = null;

        public static class Builder {
            final android.view.SurfaceControl surface = null;
            int flags;
            float alpha;
            float cornerRadius;
            int backgroundBlurRadius;
            float backgroundBlurScale;
            android.graphics.Matrix matrix;
            android.graphics.Rect windowCrop;
            int layer;
            boolean visible;
            boolean opaque;
            android.view.SurfaceControl.Transaction mergeTransaction;
            android.gui.EarlyWakeupInfo earlyWakeupInfo;
            public Builder(android.view.SurfaceControl p0) {}
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withAlpha(float p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withMatrix(android.graphics.Matrix p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withWindowCrop(android.graphics.Rect p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withLayer(int p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withCornerRadius(float p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withBackgroundBlurRadius(int p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withBackgroundBlurScale(float p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withVisibility(boolean p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withMergeTransaction(android.view.SurfaceControl.Transaction p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withEarlyWakeupStart(android.gui.EarlyWakeupInfo p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withEarlyWakeupEnd(android.gui.EarlyWakeupInfo p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withOpaque(boolean p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams build() { return null; }
        }
    }
}
