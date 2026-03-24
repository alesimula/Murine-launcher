package com.android.internal.view.inline;

public final class InlineTooltipUi extends android.widget.PopupWindow implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "InlineTooltipUi";
    private final android.view.WindowManager mWm = null;
    private final android.view.ViewGroup mContentContainer = null;
    private boolean mShowing;
    private android.view.WindowManager.LayoutParams mWindowLayoutParams;
    private final android.view.View.OnAttachStateChangeListener mAnchorOnAttachStateChangeListener = null;
    private final android.view.View.OnLayoutChangeListener mAnchoredOnLayoutChangeListener = null;
    public InlineTooltipUi(android.content.Context p0) { super(); }
    public void setTooltipView(android.widget.inline.InlineContentView p0) {}
    public void close() {}
    protected boolean hasContentView() { return false; }
    protected boolean hasDecorView() { return false; }
    protected android.view.WindowManager.LayoutParams getDecorViewLayoutParams() { return null; }
    public void update(android.view.View p0) {}
    protected void update(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}
    public void showAsDropDown(android.view.View p0, int p1, int p2, int p3) {}
    protected void attachToAnchor(android.view.View p0, int p1, int p2, int p3) {}
    protected void detachFromAnchor() {}
    public void dismiss() {}
    private void adjustPosition() {}
    private void show(android.view.WindowManager.LayoutParams p0) {}
    private void hide() {}
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
}
