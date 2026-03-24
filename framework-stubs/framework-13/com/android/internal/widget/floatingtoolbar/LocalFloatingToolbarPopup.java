package com.android.internal.widget.floatingtoolbar;

public final class LocalFloatingToolbarPopup implements com.android.internal.widget.floatingtoolbar.FloatingToolbarPopup {
    public LocalFloatingToolbarPopup(android.content.Context p0, android.view.View p1) {}
    public boolean setOutsideTouchable(boolean p0, android.widget.PopupWindow.OnDismissListener p1) { return false; }
    public void setWidthChanged(boolean p0) {}
    public void setSuggestedWidth(int p0) {}
    public void show(java.util.List<android.view.MenuItem> p0, android.view.MenuItem.OnMenuItemClickListener p1, android.graphics.Rect p2) {}
    public void dismiss() {}
    public void hide() {}
    public boolean isShowing() { return false; }
    public boolean isHidden() { return false; }
    public java.util.List<android.view.MenuItem> layoutMainPanelItems(java.util.List<android.view.MenuItem> p0, int p1) { return null; }

    private static final class LogAccelerateInterpolator implements android.view.animation.Interpolator {
        public float getInterpolation(float p0) { return 0.0f; }
    }

    public static final class MenuItemRepr {
        public final int itemId = 0;
        public final int groupId = 0;
        public final java.lang.String title = null;
        public static com.android.internal.widget.floatingtoolbar.LocalFloatingToolbarPopup.MenuItemRepr of(android.view.MenuItem p0) { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public static boolean reprEquals(java.util.Collection<android.view.MenuItem> p0, java.util.Collection<android.view.MenuItem> p1) { return false; }
    }

    private static final class OverflowPanel extends android.widget.ListView {
        OverflowPanel(com.android.internal.widget.floatingtoolbar.LocalFloatingToolbarPopup p0) { super((android.content.Context)null); }
        protected void onMeasure(int p0, int p1) {}
        public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
        protected boolean awakenScrollBars() { return false; }
    }

    private static final class OverflowPanelViewHelper {
        OverflowPanelViewHelper(android.content.Context p0, int p1) {}
        public android.view.View getView(android.view.MenuItem p0, int p1, android.view.View p2) { return null; }
        public int calculateWidth(android.view.MenuItem p0) { return 0; }
    }
}
