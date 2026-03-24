package android.inputmethodservice.navigationbar;

public final class NavigationBarView extends android.widget.FrameLayout {
    android.view.View mCurrentView;
    int mDisabledFlags;
    int mNavigationIconHints;
    public NavigationBarView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public android.view.View getCurrentView() { return null; }
    public void forEachView(java.util.function.Consumer<android.view.View> p0) {}
    public android.inputmethodservice.navigationbar.ButtonDispatcher getBackButton() { return null; }
    public android.inputmethodservice.navigationbar.ButtonDispatcher getImeSwitchButton() { return null; }
    public android.inputmethodservice.navigationbar.ButtonDispatcher getHomeHandle() { return null; }
    public android.util.SparseArray<android.inputmethodservice.navigationbar.ButtonDispatcher> getButtonDispatchers() { return null; }
    public static boolean isGesturalMode(int p0) { return false; }
    public void setLayoutDirection(int p0) {}
    public void setNavigationIconHints(int p0) {}
    public void onFinishInflate() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public void setDarkIntensity(float p0) {}
}
