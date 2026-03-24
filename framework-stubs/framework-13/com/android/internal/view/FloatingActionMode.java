package com.android.internal.view;

public final class FloatingActionMode extends android.view.ActionMode {
    public FloatingActionMode(android.content.Context p0, android.view.ActionMode.Callback2 p1, android.view.View p2, com.android.internal.widget.floatingtoolbar.FloatingToolbar p3) { super(); }
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitle(int p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setSubtitle(int p0) {}
    public void setCustomView(android.view.View p0) {}
    public void invalidate() {}
    public void invalidateContentRect() {}
    public void updateViewLocationInWindow() {}
    public void hide(long p0) {}
    public void setOutsideTouchable(boolean p0, android.widget.PopupWindow.OnDismissListener p1) {}
    public void onWindowFocusChanged(boolean p0) {}
    public void finish() {}
    public android.view.Menu getMenu() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public android.view.View getCustomView() { return null; }
    public android.view.MenuInflater getMenuInflater() { return null; }

    private static final class FloatingToolbarVisibilityHelper {
        public FloatingToolbarVisibilityHelper(com.android.internal.widget.floatingtoolbar.FloatingToolbar p0) {}
        public void activate() {}
        public void deactivate() {}
        public void setHideRequested(boolean p0) {}
        public void setMoving(boolean p0) {}
        public void setOutOfBounds(boolean p0) {}
        public void setWindowFocused(boolean p0) {}
        public void updateToolbarVisibility() {}
    }
}
