package com.android.internal.view.menu;

public class IconMenuPresenter extends com.android.internal.view.menu.BaseMenuPresenter {
    private com.android.internal.view.menu.IconMenuItemView mMoreView;
    private int mMaxItems;
    int mOpenSubMenuId;
    com.android.internal.view.menu.IconMenuPresenter.SubMenuPresenterCallback mSubMenuPresenterCallback;
    com.android.internal.view.menu.MenuDialogHelper mOpenSubMenu;
    private static final java.lang.String VIEWS_TAG = "android:menu:icon";
    private static final java.lang.String OPEN_SUBMENU_KEY = "android:menu:icon:submenu";
    public IconMenuPresenter(android.content.Context p0) { super(null, 0, 0); }
    public void initForMenu(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1) {}
    public void bindItemView(com.android.internal.view.menu.MenuItemImpl p0, com.android.internal.view.menu.MenuView.ItemView p1) {}
    public boolean shouldIncludeItem(int p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
    protected void addItemView(android.view.View p0, int p1) {}
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
    public void updateMenuView(boolean p0) {}
    protected boolean filterLeftoverView(android.view.ViewGroup p0, int p1) { return false; }
    public int getNumActualItemsShown() { return 0; }
    public void saveHierarchyState(android.os.Bundle p0) {}
    public void restoreHierarchyState(android.os.Bundle p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}

    class SubMenuPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
        SubMenuPresenterCallback(com.android.internal.view.menu.IconMenuPresenter p0) {}
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
    }
}
