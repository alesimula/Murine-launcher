package com.android.internal.view.menu;

public class MenuBuilder implements android.view.Menu {
    private static final java.lang.String TAG = "MenuBuilder";
    private static final java.lang.String PRESENTER_KEY = "android:menu:presenters";
    private static final java.lang.String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final java.lang.String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final int[] sCategoryToOrder = null;
    private final android.content.Context mContext = null;
    private final android.content.res.Resources mResources = null;
    private boolean mQwertyMode;
    private boolean mShortcutsVisible;
    private com.android.internal.view.menu.MenuBuilder.Callback mCallback;
    private java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> mItems;
    private java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> mVisibleItems;
    private boolean mIsVisibleItemsStale;
    private java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> mActionItems;
    private java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> mNonActionItems;
    private boolean mIsActionItemsStale;
    private int mDefaultShowAsAction;
    private android.view.ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    java.lang.CharSequence mHeaderTitle;
    android.graphics.drawable.Drawable mHeaderIcon;
    android.view.View mHeaderView;
    private android.util.SparseArray<android.os.Parcelable> mFrozenViewStates;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mItemsChangedWhileDispatchPrevented;
    private boolean mOptionalIconsVisible;
    private boolean mIsClosing;
    private java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> mTempShortcutItemList;
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.android.internal.view.menu.MenuPresenter>> mPresenters;
    private com.android.internal.view.menu.MenuItemImpl mExpandedItem;
    private boolean mGroupDividerEnabled;
    public MenuBuilder(android.content.Context p0) {}
    public com.android.internal.view.menu.MenuBuilder setDefaultShowAsAction(int p0) { return null; }
    public void addMenuPresenter(com.android.internal.view.menu.MenuPresenter p0) {}
    public void addMenuPresenter(com.android.internal.view.menu.MenuPresenter p0, android.content.Context p1) {}
    public void removeMenuPresenter(com.android.internal.view.menu.MenuPresenter p0) {}
    private void dispatchPresenterUpdate(boolean p0) {}
    private boolean dispatchSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0, com.android.internal.view.menu.MenuPresenter p1) { return false; }
    private void dispatchSaveInstanceState(android.os.Bundle p0) {}
    private void dispatchRestoreInstanceState(android.os.Bundle p0) {}
    public void savePresenterStates(android.os.Bundle p0) {}
    public void restorePresenterStates(android.os.Bundle p0) {}
    public void saveActionViewStates(android.os.Bundle p0) {}
    public void restoreActionViewStates(android.os.Bundle p0) {}
    protected java.lang.String getActionViewStatesKey() { return null; }
    public void setCallback(com.android.internal.view.menu.MenuBuilder.Callback p0) {}
    private android.view.MenuItem addInternal(int p0, int p1, int p2, java.lang.CharSequence p3) { return null; }
    private com.android.internal.view.menu.MenuItemImpl createNewMenuItem(int p0, int p1, int p2, int p3, java.lang.CharSequence p4, int p5) { return null; }
    public android.view.MenuItem add(java.lang.CharSequence p0) { return null; }
    public android.view.MenuItem add(int p0) { return null; }
    public android.view.MenuItem add(int p0, int p1, int p2, java.lang.CharSequence p3) { return null; }
    public android.view.MenuItem add(int p0, int p1, int p2, int p3) { return null; }
    public android.view.SubMenu addSubMenu(java.lang.CharSequence p0) { return null; }
    public android.view.SubMenu addSubMenu(int p0) { return null; }
    public android.view.SubMenu addSubMenu(int p0, int p1, int p2, java.lang.CharSequence p3) { return null; }
    public android.view.SubMenu addSubMenu(int p0, int p1, int p2, int p3) { return null; }
    public void setGroupDividerEnabled(boolean p0) {}
    public boolean isGroupDividerEnabled() { return false; }
    public int addIntentOptions(int p0, int p1, int p2, android.content.ComponentName p3, android.content.Intent[] p4, android.content.Intent p5, int p6, android.view.MenuItem[] p7) { return 0; }
    public void removeItem(int p0) {}
    public void removeGroup(int p0) {}
    private void removeItemAtInt(int p0, boolean p1) {}
    public void removeItemAt(int p0) {}
    public void clearAll() {}
    public void clear() {}
    void setExclusiveItemChecked(android.view.MenuItem p0) {}
    public void setGroupCheckable(int p0, boolean p1, boolean p2) {}
    public void setGroupVisible(int p0, boolean p1) {}
    public void setGroupEnabled(int p0, boolean p1) {}
    public boolean hasVisibleItems() { return false; }
    public android.view.MenuItem findItem(int p0) { return null; }
    public int findItemIndex(int p0) { return 0; }
    public int findGroupIndex(int p0) { return 0; }
    public int findGroupIndex(int p0, int p1) { return 0; }
    public int size() { return 0; }
    public android.view.MenuItem getItem(int p0) { return null; }
    public boolean isShortcutKey(int p0, android.view.KeyEvent p1) { return false; }
    public void setQwertyMode(boolean p0) {}
    private static int getOrdering(int p0) { return 0; }
    boolean isQwertyMode() { return false; }
    public void setShortcutsVisible(boolean p0) {}
    private void setShortcutsVisibleInner(boolean p0) {}
    public boolean isShortcutsVisible() { return false; }
    android.content.res.Resources getResources() { return null; }
    public android.content.Context getContext() { return null; }
    boolean dispatchMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
    public void changeMenuMode() {}
    private static int findInsertIndex(java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> p0, int p1) { return 0; }
    public boolean performShortcut(int p0, android.view.KeyEvent p1, int p2) { return false; }
    void findItemsWithShortcutForKey(java.util.List<com.android.internal.view.menu.MenuItemImpl> p0, int p1, android.view.KeyEvent p2) {}
    com.android.internal.view.menu.MenuItemImpl findItemWithShortcutForKey(int p0, android.view.KeyEvent p1) { return null; }
    public boolean performIdentifierAction(int p0, int p1) { return false; }
    public boolean performItemAction(android.view.MenuItem p0, int p1) { return false; }
    public boolean performItemAction(android.view.MenuItem p0, com.android.internal.view.menu.MenuPresenter p1, int p2) { return false; }
    public final void close(boolean p0) {}
    public void close() {}
    public void onItemsChanged(boolean p0) {}
    public void stopDispatchingItemsChanged() {}
    public void startDispatchingItemsChanged() {}
    void onItemVisibleChanged(com.android.internal.view.menu.MenuItemImpl p0) {}
    void onItemActionRequestChanged(com.android.internal.view.menu.MenuItemImpl p0) {}
    public java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> getVisibleItems() { return null; }
    public void flagActionItems() {}
    public java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> getActionItems() { return null; }
    public java.util.ArrayList<com.android.internal.view.menu.MenuItemImpl> getNonActionItems() { return null; }
    public void clearHeader() {}
    private void setHeaderInternal(int p0, java.lang.CharSequence p1, int p2, android.graphics.drawable.Drawable p3, android.view.View p4) {}
    protected com.android.internal.view.menu.MenuBuilder setHeaderTitleInt(java.lang.CharSequence p0) { return null; }
    protected com.android.internal.view.menu.MenuBuilder setHeaderTitleInt(int p0) { return null; }
    protected com.android.internal.view.menu.MenuBuilder setHeaderIconInt(android.graphics.drawable.Drawable p0) { return null; }
    protected com.android.internal.view.menu.MenuBuilder setHeaderIconInt(int p0) { return null; }
    protected com.android.internal.view.menu.MenuBuilder setHeaderViewInt(android.view.View p0) { return null; }
    public java.lang.CharSequence getHeaderTitle() { return null; }
    public android.graphics.drawable.Drawable getHeaderIcon() { return null; }
    public android.view.View getHeaderView() { return null; }
    public com.android.internal.view.menu.MenuBuilder getRootMenu() { return null; }
    public void setCurrentMenuInfo(android.view.ContextMenu.ContextMenuInfo p0) {}
    void setOptionalIconsVisible(boolean p0) {}
    boolean getOptionalIconsVisible() { return false; }
    public boolean expandItemActionView(com.android.internal.view.menu.MenuItemImpl p0) { return false; }
    public boolean collapseItemActionView(com.android.internal.view.menu.MenuItemImpl p0) { return false; }
    public com.android.internal.view.menu.MenuItemImpl getExpandedItem() { return null; }

    public static interface Callback {
        public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1);
        public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0);
    }

    public static interface ItemInvoker {
        public boolean invokeItem(com.android.internal.view.menu.MenuItemImpl p0);
    }
}
