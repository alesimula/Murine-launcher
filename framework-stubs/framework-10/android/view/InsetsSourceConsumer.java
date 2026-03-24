package android.view;

public class InsetsSourceConsumer {
    protected final android.view.InsetsController mController = null;
    protected boolean mVisible;
    private final java.util.function.Supplier<android.view.SurfaceControl.Transaction> mTransactionSupplier = null;
    private final int mType = 0;
    private final android.view.InsetsState mState = null;
    private android.view.InsetsSourceControl mSourceControl;
    public InsetsSourceConsumer(int p0, android.view.InsetsState p1, java.util.function.Supplier<android.view.SurfaceControl.Transaction> p2, android.view.InsetsController p3) {}
    public void setControl(android.view.InsetsSourceControl p0) {}
    public android.view.InsetsSourceControl getControl() { return null; }
    int getType() { return 0; }
    public void show() {}
    public void hide() {}
    public void onWindowFocusGained() {}
    public void onWindowFocusLost() {}
    boolean applyLocalVisibilityOverride() { return false; }
    public boolean isVisible() { return false; }
    int requestShow(boolean p0) { return 0; }
    void notifyHidden() {}
    private void setVisible(boolean p0) {}
    private void applyHiddenToControl() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ShowResult {
        public static final int SHOW_IMMEDIATELY = 0;
        public static final int SHOW_DELAYED = 1;
        public static final int SHOW_FAILED = 2;
    }
}
