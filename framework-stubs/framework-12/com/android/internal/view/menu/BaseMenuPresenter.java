package com.android.internal.view.menu;

public abstract class BaseMenuPresenter implements com.android.internal.view.menu.MenuPresenter {
    protected android.content.Context mSystemContext;
    protected android.content.Context mContext;
    protected com.android.internal.view.menu.MenuBuilder mMenu;
    protected android.view.LayoutInflater mSystemInflater;
    protected android.view.LayoutInflater mInflater;
    private com.android.internal.view.menu.MenuPresenter.Callback mCallback;
    private int mMenuLayoutRes;
    private int mItemLayoutRes;
    protected com.android.internal.view.menu.MenuView mMenuView;
    private int mId;
    public BaseMenuPresenter(android.content.Context p0, int p1, int p2) {}
    public void initForMenu(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1) {}
    public com.android.internal.view.menu.MenuView getMenuView(android.view.ViewGroup p0) { return null; }
    public void updateMenuView(boolean p0) {}
    protected void addItemView(android.view.View p0, int p1) {}
    protected boolean filterLeftoverView(android.view.ViewGroup p0, int p1) { return false; }
    public void setCallback(com.android.internal.view.menu.MenuPresenter.Callback p0) {}
    public com.android.internal.view.menu.MenuPresenter.Callback getCallback() { return null; }
    public com.android.internal.view.menu.MenuView.ItemView createItemView(android.view.ViewGroup p0) { return null; }
    public android.view.View getItemView(com.android.internal.view.menu.MenuItemImpl p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public abstract void bindItemView(com.android.internal.view.menu.MenuItemImpl p0, com.android.internal.view.menu.MenuView.ItemView p1);
    public boolean shouldIncludeItem(int p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
    public boolean flagActionItems() { return false; }
    public boolean expandItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
    public boolean collapseItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
    public int getId() { return 0; }
    public void setId(int p0) {}
}
