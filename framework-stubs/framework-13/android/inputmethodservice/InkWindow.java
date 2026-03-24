package android.inputmethodservice;

final class InkWindow extends com.android.internal.policy.PhoneWindow {
    public InkWindow(android.content.Context p0) { super((android.content.Context)null); }
    void initOnly() {}
    void show() {}
    void hide(boolean p0) {}
    void setToken(android.os.IBinder p0) {}
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void setContentView(android.view.View p0) {}
    public void clearContentView() {}
    void setInkViewVisibilityListener(android.inputmethodservice.InkWindow.InkVisibilityListener p0) {}
    void initInkViewVisibilityListener() {}
    boolean isInkViewVisible() { return false; }

    static interface InkVisibilityListener {
        public void onInkViewVisible();
    }
}
