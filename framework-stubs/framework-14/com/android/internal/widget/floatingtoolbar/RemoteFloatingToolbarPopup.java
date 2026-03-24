package com.android.internal.widget.floatingtoolbar;

public final class RemoteFloatingToolbarPopup implements com.android.internal.widget.floatingtoolbar.FloatingToolbarPopup {
    public RemoteFloatingToolbarPopup(android.content.Context p0, android.view.View p1) {}
    public void show(java.util.List<android.view.MenuItem> p0, android.view.MenuItem.OnMenuItemClickListener p1, android.graphics.Rect p2) {}
    public void dismiss() {}
    public void hide() {}
    public void setSuggestedWidth(int p0) {}
    public void setWidthChanged(boolean p0) {}
    public boolean isHidden() { return false; }
    public boolean isShowing() { return false; }
    public boolean setOutsideTouchable(boolean p0, android.widget.PopupWindow.OnDismissListener p1) { return false; }

    static final class MenuItemRepr {
        public final int mItemId = 0;
        public final int mGroupId = 0;
        public final java.lang.String mTitle = null;
        public static com.android.internal.widget.floatingtoolbar.RemoteFloatingToolbarPopup.MenuItemRepr of(android.view.MenuItem p0) { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public static boolean reprEquals(java.util.Collection<android.view.MenuItem> p0, java.util.Collection<android.view.MenuItem> p1) { return false; }
    }

    private static class SelectionToolbarCallbackImpl extends android.view.selectiontoolbar.ISelectionToolbarCallback.Stub {
        SelectionToolbarCallbackImpl(com.android.internal.widget.floatingtoolbar.RemoteFloatingToolbarPopup p0) { super(); }
        public void onShown(android.view.selectiontoolbar.WidgetInfo p0) {}
        public void onWidgetUpdated(android.view.selectiontoolbar.WidgetInfo p0) {}
        public void onToolbarShowTimeout() {}
        public void onMenuItemClicked(android.view.selectiontoolbar.ToolbarMenuItem p0) {}
        public void onError(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ToolbarState {
    }
}
