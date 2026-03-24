package com.android.internal.view.menu;

public class SubMenuBuilder extends com.android.internal.view.menu.MenuBuilder implements android.view.SubMenu {
    public SubMenuBuilder(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1, com.android.internal.view.menu.MenuItemImpl p2) { super(null); }
    public void setQwertyMode(boolean p0) {}
    public boolean isQwertyMode() { return false; }
    public void setShortcutsVisible(boolean p0) {}
    public boolean isShortcutsVisible() { return false; }
    public android.view.Menu getParentMenu() { return null; }
    public android.view.MenuItem getItem() { return null; }
    public void setCallback(com.android.internal.view.menu.MenuBuilder.Callback p0) {}
    public com.android.internal.view.menu.MenuBuilder getRootMenu() { return null; }
    boolean dispatchMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable p0) { return null; }
    public android.view.SubMenu setIcon(int p0) { return null; }
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable p0) { return null; }
    public android.view.SubMenu setHeaderIcon(int p0) { return null; }
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence p0) { return null; }
    public android.view.SubMenu setHeaderTitle(int p0) { return null; }
    public android.view.SubMenu setHeaderView(android.view.View p0) { return null; }
    public boolean expandItemActionView(com.android.internal.view.menu.MenuItemImpl p0) { return false; }
    public boolean collapseItemActionView(com.android.internal.view.menu.MenuItemImpl p0) { return false; }
    public java.lang.String getActionViewStatesKey() { return null; }
    public void setGroupDividerEnabled(boolean p0) {}
    public boolean isGroupDividerEnabled() { return false; }
}
