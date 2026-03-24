package android.view;

public final class ImeInsetsSourceConsumer extends android.view.InsetsSourceConsumer {
    public ImeInsetsSourceConsumer(int p0, android.view.InsetsState p1, java.util.function.Supplier<android.view.SurfaceControl.Transaction> p2, android.view.InsetsController p3) { super(0, 0, null, null, null); }
    public boolean onAnimationStateChanged(boolean p0) { return false; }
    public void onWindowFocusGained(boolean p0) {}
    public void onWindowFocusLost() {}
    public boolean applyLocalVisibilityOverride() { return false; }
    public int requestShow(boolean p0, android.view.inputmethod.ImeTracker.Token p1) { return 0; }
    void requestHide(boolean p0, android.view.inputmethod.ImeTracker.Token p1) {}
    public void removeSurface() {}
    public boolean setControl(android.view.InsetsSourceControl p0, int[] p1, int[] p2) { return false; }
    protected boolean isRequestedVisibleAwaitingControl() { return false; }
    public void onPerceptible(boolean p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void onShowRequested() {}
}
