package android.view.autofill;

public class AutofillPopupWindow extends android.widget.PopupWindow {
    public AutofillPopupWindow(android.view.autofill.IAutofillWindowPresenter p0) { super(); }
    protected boolean hasContentView() { return false; }
    protected boolean hasDecorView() { return false; }
    protected android.view.WindowManager.LayoutParams getDecorViewLayoutParams() { return null; }
    public void update(android.view.View p0, int p1, int p2, int p3, int p4, android.graphics.Rect p5) {}
    protected void update(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}
    protected boolean findDropDownPosition(android.view.View p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, boolean p7) { return false; }
    public void showAsDropDown(android.view.View p0, int p1, int p2, int p3) {}
    protected void attachToAnchor(android.view.View p0, int p1, int p2, int p3) {}
    protected void detachFromAnchor() {}
    public void dismiss() {}
    public int getAnimationStyle() { return 0; }
    public android.graphics.drawable.Drawable getBackground() { return null; }
    public android.view.View getContentView() { return null; }
    public float getElevation() { return 0.0f; }
    public android.transition.Transition getEnterTransition() { return null; }
    public android.transition.Transition getExitTransition() { return null; }
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setContentView(android.view.View p0) {}
    public void setElevation(float p0) {}
    public void setEnterTransition(android.transition.Transition p0) {}
    public void setExitTransition(android.transition.Transition p0) {}
    public void setTouchInterceptor(android.view.View.OnTouchListener p0) {}

    private class WindowPresenter {
        final android.view.autofill.IAutofillWindowPresenter mPresenter = null;
        WindowPresenter(android.view.autofill.AutofillPopupWindow p0, android.view.autofill.IAutofillWindowPresenter p1) {}
        void show(android.view.WindowManager.LayoutParams p0, android.graphics.Rect p1, boolean p2, int p3) {}
        void hide(android.graphics.Rect p0) {}
    }
}
