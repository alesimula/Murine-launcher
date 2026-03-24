package com.android.internal.view.inline;

public final class InlineTooltipUi extends android.widget.PopupWindow implements java.lang.AutoCloseable {
    public InlineTooltipUi(android.content.Context p0) { super(); }
    public void setTooltipView(android.widget.inline.InlineContentView p0) {}
    public void close() {}
    protected boolean hasContentView() { return false; }
    protected boolean hasDecorView() { return false; }
    protected android.view.WindowManager.LayoutParams getDecorViewLayoutParams() { return null; }
    public void update(android.view.View p0) {}
    protected boolean findDropDownPosition(android.view.View p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, boolean p7) { return false; }
    protected void update(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}
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
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}

    private class DelayShowRunnable implements java.lang.Runnable {
        java.lang.ref.WeakReference<android.view.View> mAnchor;
        DelayShowRunnable(com.android.internal.view.inline.InlineTooltipUi p0, android.view.View p1) {}
        public void run() {}
        public void setAnchor(android.view.View p0) {}
    }
}
