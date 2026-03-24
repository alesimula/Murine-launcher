package android.service.autofill.augmented;

@android.annotation.SystemApi
public final class FillWindow implements java.lang.AutoCloseable {
    public FillWindow() {}
    public boolean update(android.service.autofill.augmented.PresentationParams.Area p0, android.view.View p1, long p2) { return false; }
    void show() {}
    public void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void close() {}

    private static final class FillWindowPresenter extends android.view.autofill.IAutofillWindowPresenter.Stub {
        FillWindowPresenter(android.service.autofill.augmented.FillWindow p0) { super(); }
        public void show(android.view.WindowManager.LayoutParams p0, android.graphics.Rect p1, boolean p2, int p3) {}
        public void hide(android.graphics.Rect p0) {}
    }
}
