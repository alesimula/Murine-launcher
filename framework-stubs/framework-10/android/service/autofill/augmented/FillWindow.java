package android.service.autofill.augmented;

@android.annotation.SystemApi
public final class FillWindow implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = null;
    private final java.lang.Object mLock = null;
    private final android.os.Handler mUiThreadHandler = null;
    private final android.service.autofill.augmented.FillWindow.FillWindowPresenter mFillWindowPresenter = null;
    private android.view.WindowManager mWm;
    private android.view.View mFillView;
    private boolean mShowing;
    private android.graphics.Rect mBounds;
    private boolean mUpdateCalled;
    private boolean mDestroyed;
    private android.service.autofill.augmented.AugmentedAutofillService.AutofillProxy mProxy;
    public FillWindow() {}
    public boolean update(android.service.autofill.augmented.PresentationParams.Area p0, android.view.View p1, long p2) { return false; }
    void show() {}
    private void hide() {}
    private void handleShow(android.view.WindowManager.LayoutParams p0) {}
    private void handleHide() {}
    public void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    private void checkNotDestroyedLocked() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void close() throws java.lang.Exception {}

    private final class FillWindowPresenter extends android.view.autofill.IAutofillWindowPresenter.Stub {
        private FillWindowPresenter(android.service.autofill.augmented.FillWindow p0) { super(); }
        public void show(android.view.WindowManager.LayoutParams p0, android.graphics.Rect p1, boolean p2, int p3) {}
        public void hide(android.graphics.Rect p0) {}
    }
}
