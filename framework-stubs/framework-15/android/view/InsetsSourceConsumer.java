package android.view;

public class InsetsSourceConsumer {
    protected static final int ANIMATION_STATE_NONE = 0;
    protected static final int ANIMATION_STATE_SHOW = 1;
    protected static final int ANIMATION_STATE_HIDE = 2;
    protected int mAnimationState;
    protected final android.view.InsetsController mController = null;
    protected final android.view.InsetsState mState = null;
    public InsetsSourceConsumer(int p0, int p1, android.view.InsetsState p2, java.util.function.Supplier<android.view.SurfaceControl.Transaction> p3, android.view.InsetsController p4) {}
    public boolean setControl(android.view.InsetsSourceControl p0, int[] p1, int[] p2) { return false; }
    public android.view.InsetsSourceControl getControl() { return null; }
    protected boolean isRequestedVisibleAwaitingControl() { return false; }
    int getId() { return 0; }
    void setId(int p0) {}
    int getType() { return 0; }
    public boolean onAnimationStateChanged(boolean p0) { return false; }
    protected boolean isShowRequested() { return false; }
    public void onWindowFocusGained(boolean p0) {}
    public void onWindowFocusLost() {}
    boolean hasViewFocusWhenWindowFocusGain() { return false; }
    public boolean applyLocalVisibilityOverride() { return false; }
    public int requestShow(boolean p0, android.view.inputmethod.ImeTracker.Token p1) { return 0; }
    void requestHide(boolean p0, android.view.inputmethod.ImeTracker.Token p1) {}
    public void onPerceptible(boolean p0) {}
    public void removeSurface() {}
    public void updateSource(android.view.InsetsSource p0, int p1) {}
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ShowResult {
        public static final int SHOW_IMMEDIATELY = 0;
        public static final int IME_SHOW_DELAYED = 1;
        public static final int IME_SHOW_FAILED = 2;
    }
}
