package com.android.internal.view.menu;

public final class MenuItemImpl implements android.view.MenuItem {
    static final int NO_ICON = 0;
    MenuItemImpl(com.android.internal.view.menu.MenuBuilder p0, int p1, int p2, int p3, int p4, java.lang.CharSequence p5, int p6) {}
    public boolean invoke() { return false; }
    public boolean isEnabled() { return false; }
    public android.view.MenuItem setEnabled(boolean p0) { return null; }
    public int getGroupId() { return 0; }
    @android.view.ViewDebug.CapturedViewProperty
    public int getItemId() { return 0; }
    public int getOrder() { return 0; }
    public int getOrdering() { return 0; }
    public android.content.Intent getIntent() { return null; }
    public android.view.MenuItem setIntent(android.content.Intent p0) { return null; }
    java.lang.Runnable getCallback() { return null; }
    public android.view.MenuItem setCallback(java.lang.Runnable p0) { return null; }
    public char getAlphabeticShortcut() { return 0; }
    public int getAlphabeticModifiers() { return 0; }
    public android.view.MenuItem setAlphabeticShortcut(char p0) { return null; }
    public android.view.MenuItem setAlphabeticShortcut(char p0, int p1) { return null; }
    public char getNumericShortcut() { return 0; }
    public int getNumericModifiers() { return 0; }
    public android.view.MenuItem setNumericShortcut(char p0) { return null; }
    public android.view.MenuItem setNumericShortcut(char p0, int p1) { return null; }
    public android.view.MenuItem setShortcut(char p0, char p1) { return null; }
    public android.view.MenuItem setShortcut(char p0, char p1, int p2, int p3) { return null; }
    char getShortcut() { return 0; }
    java.lang.String getShortcutLabel() { return null; }
    boolean shouldShowShortcut() { return false; }
    public android.view.SubMenu getSubMenu() { return null; }
    public boolean hasSubMenu() { return false; }
    void setSubMenu(com.android.internal.view.menu.SubMenuBuilder p0) {}
    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getTitle() { return null; }
    java.lang.CharSequence getTitleForItemView(com.android.internal.view.menu.MenuView.ItemView p0) { return null; }
    public android.view.MenuItem setTitle(java.lang.CharSequence p0) { return null; }
    public android.view.MenuItem setTitle(int p0) { return null; }
    public java.lang.CharSequence getTitleCondensed() { return null; }
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence p0) { return null; }
    public android.graphics.drawable.Drawable getIcon() { return null; }
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable p0) { return null; }
    public android.view.MenuItem setIcon(int p0) { return null; }
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList p0) { return null; }
    public android.content.res.ColorStateList getIconTintList() { return null; }
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode p0) { return null; }
    public android.graphics.PorterDuff.Mode getIconTintMode() { return null; }
    public boolean isCheckable() { return false; }
    public android.view.MenuItem setCheckable(boolean p0) { return null; }
    public void setExclusiveCheckable(boolean p0) {}
    public boolean isExclusiveCheckable() { return false; }
    public boolean isChecked() { return false; }
    public android.view.MenuItem setChecked(boolean p0) { return null; }
    void setCheckedInt(boolean p0) {}
    public boolean isVisible() { return false; }
    boolean setVisibleInt(boolean p0) { return false; }
    public android.view.MenuItem setVisible(boolean p0) { return null; }
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener p0) { return null; }
    public java.lang.String toString() { return null; }
    void setMenuInfo(android.view.ContextMenu.ContextMenuInfo p0) {}
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() { return null; }
    public void actionFormatChanged() {}
    public boolean shouldShowIcon() { return false; }
    public boolean isActionButton() { return false; }
    public boolean requestsActionButton() { return false; }
    public boolean requiresActionButton() { return false; }
    public boolean requiresOverflow() { return false; }
    public void setIsActionButton(boolean p0) {}
    public boolean showsTextAsAction() { return false; }
    public void setShowAsAction(int p0) {}
    public android.view.MenuItem setActionView(android.view.View p0) { return null; }
    public android.view.MenuItem setActionView(int p0) { return null; }
    public android.view.View getActionView() { return null; }
    public android.view.ActionProvider getActionProvider() { return null; }
    public android.view.MenuItem setActionProvider(android.view.ActionProvider p0) { return null; }
    public android.view.MenuItem setShowAsActionFlags(int p0) { return null; }
    public boolean expandActionView() { return false; }
    public boolean collapseActionView() { return false; }
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener p0) { return null; }
    public boolean hasCollapsibleActionView() { return false; }
    public void setActionViewExpanded(boolean p0) {}
    public boolean isActionViewExpanded() { return false; }
    public android.view.MenuItem setContentDescription(java.lang.CharSequence p0) { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.view.MenuItem setTooltipText(java.lang.CharSequence p0) { return null; }
    public java.lang.CharSequence getTooltipText() { return null; }
}
