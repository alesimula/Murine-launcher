package com.android.internal.view.menu;

public final class ExpandedMenuView extends android.widget.ListView implements com.android.internal.view.menu.MenuBuilder.ItemInvoker, com.android.internal.view.menu.MenuView, android.widget.AdapterView.OnItemClickListener {
    private com.android.internal.view.menu.MenuBuilder mMenu;
    private int mAnimations;
    public ExpandedMenuView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void initialize(com.android.internal.view.menu.MenuBuilder p0) {}
    protected void onDetachedFromWindow() {}
    public boolean invokeItem(com.android.internal.view.menu.MenuItemImpl p0) { return false; }
    public void onItemClick(android.widget.AdapterView p0, android.view.View p1, int p2, long p3) {}
    public int getWindowAnimations() { return 0; }
}
