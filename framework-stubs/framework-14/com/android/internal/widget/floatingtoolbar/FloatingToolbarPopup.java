package com.android.internal.widget.floatingtoolbar;

public interface FloatingToolbarPopup {
    public void setSuggestedWidth(int p0);
    public void setWidthChanged(boolean p0);
    public void show(java.util.List<android.view.MenuItem> p0, android.view.MenuItem.OnMenuItemClickListener p1, android.graphics.Rect p2);
    public void dismiss();
    public void hide();
    public boolean isShowing();
    public boolean isHidden();
    public boolean setOutsideTouchable(boolean p0, android.widget.PopupWindow.OnDismissListener p1);
    public static com.android.internal.widget.floatingtoolbar.FloatingToolbarPopup createInstance(android.content.Context p0, android.view.View p1) { return null; }
}
