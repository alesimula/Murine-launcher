package com.android.internal.view.menu;

public class ListMenuPresenter implements com.android.internal.view.menu.MenuPresenter, android.widget.AdapterView.OnItemClickListener {
    private static final java.lang.String TAG = "ListMenuPresenter";
    android.content.Context mContext;
    android.view.LayoutInflater mInflater;
    com.android.internal.view.menu.MenuBuilder mMenu;
    com.android.internal.view.menu.ExpandedMenuView mMenuView;
    private int mItemIndexOffset;
    int mThemeRes;
    int mItemLayoutRes;
    private com.android.internal.view.menu.MenuPresenter.Callback mCallback;
    com.android.internal.view.menu.ListMenuPresenter.MenuAdapter mAdapter;
    private int mId;
    public static final java.lang.String VIEWS_TAG = "android:menu:list";
    public ListMenuPresenter(android.content.Context p0, int p1) {}
    public ListMenuPresenter(int p0, int p1) {}
    public void initForMenu(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1) {}
    public com.android.internal.view.menu.MenuView getMenuView(android.view.ViewGroup p0) { return null; }
    public android.widget.ListAdapter getAdapter() { return null; }
    public void updateMenuView(boolean p0) {}
    public void setCallback(com.android.internal.view.menu.MenuPresenter.Callback p0) {}
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    int getItemIndexOffset() { return 0; }
    public void setItemIndexOffset(int p0) {}
    public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
    public boolean flagActionItems() { return false; }
    public boolean expandItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
    public boolean collapseItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
    public void saveHierarchyState(android.os.Bundle p0) {}
    public void restoreHierarchyState(android.os.Bundle p0) {}
    public void setId(int p0) {}
    public int getId() { return 0; }
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}

    private class MenuAdapter extends android.widget.BaseAdapter {
        private int mExpandedIndex;
        public MenuAdapter(com.android.internal.view.menu.ListMenuPresenter p0) { super(); }
        public int getCount() { return 0; }
        public com.android.internal.view.menu.MenuItemImpl getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        void findExpandedIndex() {}
        public void notifyDataSetChanged() {}
    }
}
