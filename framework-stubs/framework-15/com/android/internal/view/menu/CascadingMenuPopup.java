package com.android.internal.view.menu;

final class CascadingMenuPopup extends com.android.internal.view.menu.MenuPopup implements com.android.internal.view.menu.MenuPresenter, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    public CascadingMenuPopup(android.content.Context p0, android.view.View p1, int p2, int p3, boolean p4) { super(); }
    public void setForceShowIcon(boolean p0) {}
    public void show() {}
    public void dismiss() {}
    public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    public void addMenu(com.android.internal.view.menu.MenuBuilder p0) {}
    public boolean isShowing() { return false; }
    public void onDismiss() {}
    public void updateMenuView(boolean p0) {}
    public void setCallback(com.android.internal.view.menu.MenuPresenter.Callback p0) {}
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    public boolean flagActionItems() { return false; }
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void setGravity(int p0) {}
    public void setAnchorView(android.view.View p0) {}
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0) {}
    public android.widget.ListView getListView() { return null; }
    public void setHorizontalOffset(int p0) {}
    public void setVerticalOffset(int p0) {}
    public void setShowTitle(boolean p0) {}

    private static class CascadingMenuInfo {
        public final android.widget.MenuPopupWindow window = null;
        public final com.android.internal.view.menu.MenuBuilder menu = null;
        public final int position = 0;
        public CascadingMenuInfo(android.widget.MenuPopupWindow p0, com.android.internal.view.menu.MenuBuilder p1, int p2) {}
        public android.widget.ListView getListView() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HorizPosition {
    }
}
