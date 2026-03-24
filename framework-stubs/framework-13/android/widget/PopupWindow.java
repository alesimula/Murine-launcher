package android.widget;

public class PopupWindow {
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public PopupWindow(android.content.Context p0) {}
    public PopupWindow(android.content.Context p0, android.util.AttributeSet p1) {}
    public PopupWindow(android.content.Context p0, android.util.AttributeSet p1, int p2) {}
    public PopupWindow(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) {}
    public PopupWindow() {}
    public PopupWindow(android.view.View p0) {}
    public PopupWindow(int p0, int p1) {}
    public PopupWindow(android.view.View p0, int p1, int p2) {}
    public PopupWindow(android.view.View p0, int p1, int p2, boolean p3) {}
    public void setEnterTransition(android.transition.Transition p0) {}
    public android.transition.Transition getEnterTransition() { return null; }
    public void setExitTransition(android.transition.Transition p0) {}
    public android.transition.Transition getExitTransition() { return null; }
    public android.graphics.Rect getEpicenterBounds() { return null; }
    public void setEpicenterBounds(android.graphics.Rect p0) {}
    public android.graphics.drawable.Drawable getBackground() { return null; }
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public float getElevation() { return 0.0f; }
    public void setElevation(float p0) {}
    public int getAnimationStyle() { return 0; }
    public void setIgnoreCheekPress() {}
    public void setAnimationStyle(int p0) {}
    public android.view.View getContentView() { return null; }
    public void setContentView(android.view.View p0) {}
    public void setTouchInterceptor(android.view.View.OnTouchListener p0) {}
    public boolean isFocusable() { return false; }
    public void setFocusable(boolean p0) {}
    public int getInputMethodMode() { return 0; }
    public void setInputMethodMode(int p0) {}
    public void setSoftInputMode(int p0) {}
    public int getSoftInputMode() { return 0; }
    public boolean isTouchable() { return false; }
    public void setTouchable(boolean p0) {}
    public boolean isOutsideTouchable() { return false; }
    public void setOutsideTouchable(boolean p0) {}
    public boolean isClippingEnabled() { return false; }
    public void setClippingEnabled(boolean p0) {}
    @java.lang.Deprecated
    public boolean isClipToScreenEnabled() { return false; }
    @java.lang.Deprecated
    public void setClipToScreenEnabled(boolean p0) {}
    public boolean isClippedToScreen() { return false; }
    public void setIsClippedToScreen(boolean p0) {}
    void setAllowScrollingAnchorParent(boolean p0) {}
    protected final boolean getAllowScrollingAnchorParent() { return false; }
    public boolean isSplitTouchEnabled() { return false; }
    public void setSplitTouchEnabled(boolean p0) {}
    @java.lang.Deprecated
    public boolean isLayoutInScreenEnabled() { return false; }
    @java.lang.Deprecated
    public void setLayoutInScreenEnabled(boolean p0) {}
    public boolean isLaidOutInScreen() { return false; }
    public void setIsLaidOutInScreen(boolean p0) {}
    public boolean isAttachedInDecor() { return false; }
    public void setAttachedInDecor(boolean p0) {}
    public void setLayoutInsetDecor(boolean p0) {}
    protected final boolean isLayoutInsetDecor() { return false; }
    public void setWindowLayoutType(int p0) {}
    public int getWindowLayoutType() { return 0; }
    public boolean isTouchModal() { return false; }
    public void setTouchModal(boolean p0) {}
    @java.lang.Deprecated
    public void setWindowLayoutMode(int p0, int p1) {}
    public int getHeight() { return 0; }
    public void setHeight(int p0) {}
    public int getWidth() { return 0; }
    public void setWidth(int p0) {}
    public void setOverlapAnchor(boolean p0) {}
    public boolean getOverlapAnchor() { return false; }
    public boolean isShowing() { return false; }
    protected final void setShowing(boolean p0) {}
    protected final void setDropDown(boolean p0) {}
    protected final void setTransitioningToDismiss(boolean p0) {}
    protected final boolean isTransitioningToDismiss() { return false; }
    public void showAtLocation(android.view.View p0, int p1, int p2, int p3) {}
    public void showAtLocation(android.os.IBinder p0, int p1, int p2, int p3) {}
    public void showAsDropDown(android.view.View p0) {}
    public void showAsDropDown(android.view.View p0, int p1, int p2) {}
    public void showAsDropDown(android.view.View p0, int p1, int p2, int p3) {}
    protected final void updateAboveAnchor(boolean p0) {}
    public boolean isAboveAnchor() { return false; }
    protected final android.view.WindowManager.LayoutParams createPopupLayoutParams(android.os.IBinder p0) { return null; }
    protected boolean findDropDownPosition(android.view.View p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, boolean p7) { return false; }
    public int getMaxAvailableHeight(android.view.View p0) { return 0; }
    public int getMaxAvailableHeight(android.view.View p0, int p1) { return 0; }
    public int getMaxAvailableHeight(android.view.View p0, int p1, boolean p2) { return 0; }
    public void dismiss() {}
    protected final android.graphics.Rect getTransitionEpicenter() { return null; }
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0) {}
    protected final android.widget.PopupWindow.OnDismissListener getOnDismissListener() { return null; }
    public void update() {}
    protected void update(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}
    public void update(int p0, int p1) {}
    public void update(int p0, int p1, int p2, int p3) {}
    public void update(int p0, int p1, int p2, int p3, boolean p4) {}
    protected boolean hasContentView() { return false; }
    protected boolean hasDecorView() { return false; }
    protected android.view.WindowManager.LayoutParams getDecorViewLayoutParams() { return null; }
    public void update(android.view.View p0, int p1, int p2) {}
    public void update(android.view.View p0, int p1, int p2, int p3, int p4) {}
    protected void detachFromAnchor() {}
    protected void attachToAnchor(android.view.View p0, int p1, int p2, int p3) {}
    protected android.view.View getAnchor() { return null; }

    public static interface OnDismissListener {
        public void onDismiss();
    }

    private class PopupBackgroundView extends android.widget.FrameLayout {
        public PopupBackgroundView(android.widget.PopupWindow p0, android.content.Context p1) { super((android.content.Context)null); }
        protected int[] onCreateDrawableState(int p0) { return null; }
    }

    private class PopupDecorView extends android.widget.FrameLayout {
        public PopupDecorView(android.widget.PopupWindow p0, android.content.Context p1) { super((android.content.Context)null); }
        public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
        public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        public void requestEnterTransition(android.transition.Transition p0) {}
        public void startExitTransition(android.transition.Transition p0, android.view.View p1, android.graphics.Rect p2, android.transition.Transition.TransitionListener p3) {}
        public void cancelTransitions() {}
        public void requestKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, int p1) {}
        protected void onAttachedToWindow() {}
        protected void onDetachedFromWindow() {}
    }
}
