package com.android.internal.view.menu;

final class StandardMenuPopup extends com.android.internal.view.menu.MenuPopup implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, com.android.internal.view.menu.MenuPresenter, android.view.View.OnKeyListener {
    public StandardMenuPopup(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1, android.view.View p2, int p3, int p4, boolean p5) { super(); }
    public void setForceShowIcon(boolean p0) {}
    public void setGravity(int p0) {}
    public void show() {}
    public void dismiss() {}
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
    public void setAnchorView(android.view.View p0) {}
    public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0) {}
    public android.widget.ListView getListView() { return null; }
    public void setHorizontalOffset(int p0) {}
    public void setVerticalOffset(int p0) {}
    public void setShowTitle(boolean p0) {}
}
