package android.view;

public final class ImeInsetsSourceConsumer extends android.view.InsetsSourceConsumer {
    private boolean mIsRequestedVisibleAwaitingControl;
    public ImeInsetsSourceConsumer(android.view.InsetsState p0, java.util.function.Supplier<android.view.SurfaceControl.Transaction> p1, android.view.InsetsController p2) { super(0, null, null, null); }
    public void onWindowFocusGained(boolean p0) {}
    public void onWindowFocusLost() {}
    public void hide() {}
    void hide(boolean p0, int p1) {}
    public int requestShow(boolean p0) { return 0; }
    void notifyHidden() {}
    public void removeSurface() {}
    public void setControl(android.view.InsetsSourceControl p0, int[] p1, int[] p2) {}
    protected boolean isRequestedVisibleAwaitingControl() { return false; }
    public void onPerceptible(boolean p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    private android.view.inputmethod.InputMethodManager getImm() { return null; }
}
