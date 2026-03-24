package com.android.internal.view.menu;

public abstract class MenuPopup implements com.android.internal.view.menu.ShowableListMenu, com.android.internal.view.menu.MenuPresenter, android.widget.AdapterView.OnItemClickListener {
    private android.graphics.Rect mEpicenterBounds;
    public MenuPopup() {}
    public abstract void setForceShowIcon(boolean p0);
    public abstract void addMenu(com.android.internal.view.menu.MenuBuilder p0);
    public abstract void setGravity(int p0);
    public abstract void setAnchorView(android.view.View p0);
    public abstract void setHorizontalOffset(int p0);
    public abstract void setVerticalOffset(int p0);
    public void setEpicenterBounds(android.graphics.Rect p0) {}
    public android.graphics.Rect getEpicenterBounds() { return null; }
    public abstract void setShowTitle(boolean p0);
    public abstract void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0);
    public void initForMenu(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1) {}
    public com.android.internal.view.menu.MenuView getMenuView(android.view.ViewGroup p0) { return null; }
    public boolean expandItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
    public boolean collapseItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
    public int getId() { return 0; }
    public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
    protected static int measureIndividualMenuWidth(android.widget.ListAdapter p0, android.view.ViewGroup p1, android.content.Context p2, int p3) { return 0; }
    protected static com.android.internal.view.menu.MenuAdapter toMenuAdapter(android.widget.ListAdapter p0) { return null; }
    protected static boolean shouldPreserveIconSpacing(com.android.internal.view.menu.MenuBuilder p0) { return false; }
}
