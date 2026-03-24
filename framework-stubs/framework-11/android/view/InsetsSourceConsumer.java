package android.view;

public class InsetsSourceConsumer {
    protected final android.view.InsetsController mController = null;
    protected boolean mRequestedVisible;
    protected final android.view.InsetsState mState = null;
    protected final int mType = 0;
    private static final java.lang.String TAG = "InsetsSourceConsumer";
    private final java.util.function.Supplier<android.view.SurfaceControl.Transaction> mTransactionSupplier = null;
    private android.view.InsetsSourceControl mSourceControl;
    private boolean mHasWindowFocus;
    private android.graphics.Rect mPendingFrame;
    private android.graphics.Rect mPendingVisibleFrame;
    private boolean mIsAnimationPending;
    public InsetsSourceConsumer(int p0, android.view.InsetsState p1, java.util.function.Supplier<android.view.SurfaceControl.Transaction> p2, android.view.InsetsController p3) {}
    public void setControl(android.view.InsetsSourceControl p0, int[] p1, int[] p2) {}
    public android.view.InsetsSourceControl getControl() { return null; }
    protected boolean isRequestedVisibleAwaitingControl() { return false; }
    int getType() { return 0; }
    public void show(boolean p0) {}
    public void hide() {}
    void hide(boolean p0, int p1) {}
    public void onWindowFocusGained() {}
    public void onWindowFocusLost() {}
    boolean hasWindowFocus() { return false; }
    boolean applyLocalVisibilityOverride() { return false; }
    public boolean isRequestedVisible() { return false; }
    public int requestShow(boolean p0) { return 0; }
    public void onPerceptible(boolean p0) {}
    void notifyHidden() {}
    public void removeSurface() {}
    public void updateSource(android.view.InsetsSource p0, int p1) {}
    public boolean notifyAnimationFinished() { return false; }
    protected void setRequestedVisible(boolean p0) {}
    private void applyHiddenToControl() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ShowResult {
        public static final int SHOW_IMMEDIATELY = 0;
        public static final int IME_SHOW_DELAYED = 1;
        public static final int IME_SHOW_FAILED = 2;
    }
}
