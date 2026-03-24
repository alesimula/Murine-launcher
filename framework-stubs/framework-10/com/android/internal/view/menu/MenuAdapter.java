package com.android.internal.view.menu;

public class MenuAdapter extends android.widget.BaseAdapter {
    com.android.internal.view.menu.MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    private boolean mForceShowIcon;
    private final boolean mOverflowOnly = false;
    private final android.view.LayoutInflater mInflater = null;
    private final int mItemLayoutRes = 0;
    public MenuAdapter(com.android.internal.view.menu.MenuBuilder p0, android.view.LayoutInflater p1, boolean p2, int p3) { super(); }
    public boolean getForceShowIcon() { return false; }
    public void setForceShowIcon(boolean p0) {}
    public int getCount() { return 0; }
    public com.android.internal.view.menu.MenuBuilder getAdapterMenu() { return null; }
    public com.android.internal.view.menu.MenuItemImpl getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    void findExpandedIndex() {}
    public void notifyDataSetChanged() {}
}
