package android.view;

public interface AttachedSurfaceControl {
    @android.annotation.Nullable
    public android.view.SurfaceControl.Transaction buildReparentTransaction(android.view.SurfaceControl p0);
    public boolean applyTransactionOnDraw(android.view.SurfaceControl.Transaction p0);
    default public int getBufferTransformHint() { return 0; }
    default public void addOnBufferTransformHintChangedListener(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener p0) {}
    default public void removeOnBufferTransformHintChangedListener(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener p0) {}
    default public void setTouchableRegion(android.graphics.Region p0) {}
    @android.annotation.Nullable
    default public android.window.SurfaceSyncGroup getOrCreateSurfaceSyncGroup() { return null; }
    default public void setChildBoundingInsets(android.graphics.Rect p0) {}
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("com.android.window.flags.surface_control_input_receiver")
    default public android.window.InputTransferToken getInputTransferToken() { return null; }

    public static interface OnBufferTransformHintChangedListener {
        public void onBufferTransformHintChanged(int p0);
    }
}
