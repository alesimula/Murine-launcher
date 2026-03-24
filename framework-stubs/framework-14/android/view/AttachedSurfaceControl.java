package android.view;

public interface AttachedSurfaceControl {
    public android.view.SurfaceControl.Transaction buildReparentTransaction(android.view.SurfaceControl p0);
    public boolean applyTransactionOnDraw(android.view.SurfaceControl.Transaction p0);
    default public int getBufferTransformHint() { return 0; }
    default public void addOnBufferTransformHintChangedListener(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener p0) {}
    default public void removeOnBufferTransformHintChangedListener(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener p0) {}
    default public void setTouchableRegion(android.graphics.Region p0) {}
    default public android.window.SurfaceSyncGroup getOrCreateSurfaceSyncGroup() { return null; }
    default public void setChildBoundingInsets(android.graphics.Rect p0) {}

    public static interface OnBufferTransformHintChangedListener {
        public void onBufferTransformHintChanged(int p0);
    }
}
