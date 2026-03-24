package android.view;

public interface AttachedSurfaceControl {
    public android.view.SurfaceControl.Transaction buildReparentTransaction(android.view.SurfaceControl p0);
    public boolean applyTransactionOnDraw(android.view.SurfaceControl.Transaction p0);
}
