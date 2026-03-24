package com.android.internal.view.menu;

final class CascadingMenuPopup extends com.android.internal.view.menu.MenuPopup implements com.android.internal.view.menu.MenuPresenter, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    private static final int ITEM_LAYOUT = 17367113;
    private static final int HORIZ_POSITION_LEFT = 0;
    private static final int HORIZ_POSITION_RIGHT = 1;
    private static final int SUBMENU_TIMEOUT_MS = 200;
    private final android.content.Context mContext = null;
    private final int mMenuMaxWidth = 0;
    private final int mPopupStyleAttr = 0;
    private final int mPopupStyleRes = 0;
    private final boolean mOverflowOnly = false;
    private final android.os.Handler mSubMenuHoverHandler = null;
    private final java.util.List<com.android.internal.view.menu.MenuBuilder> mPendingMenus = null;
    private final java.util.List<com.android.internal.view.menu.CascadingMenuPopup.CascadingMenuInfo> mShowingMenus = null;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = null;
    private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener = null;
    private final android.widget.MenuItemHoverListener mMenuItemHoverListener = null;
    private int mRawDropDownGravity;
    private int mDropDownGravity;
    private android.view.View mAnchorView;
    private android.view.View mShownAnchorView;
    private int mLastPosition;
    private boolean mHasXOffset;
    private boolean mHasYOffset;
    private int mXOffset;
    private int mYOffset;
    private boolean mForceShowIcon;
    private boolean mShowTitle;
    private com.android.internal.view.menu.MenuPresenter.Callback mPresenterCallback;
    private android.view.ViewTreeObserver mTreeObserver;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private boolean mShouldCloseImmediately;
    public CascadingMenuPopup(android.content.Context p0, android.view.View p1, int p2, int p3, boolean p4) { super(); }
    public void setForceShowIcon(boolean p0) {}
    private android.widget.MenuPopupWindow createPopupWindow() { return null; }
    public void show() {}
    public void dismiss() {}
    public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    private int getInitialMenuPosition() { return 0; }
    private int getNextMenuPosition(int p0) { return 0; }
    public void addMenu(com.android.internal.view.menu.MenuBuilder p0) {}
    private void showMenu(com.android.internal.view.menu.MenuBuilder p0) {}
    private android.view.MenuItem findMenuItemForSubmenu(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuBuilder p1) { return null; }
    private android.view.View findParentViewForSubmenu(com.android.internal.view.menu.CascadingMenuPopup.CascadingMenuInfo p0, com.android.internal.view.menu.MenuBuilder p1) { return null; }
    public boolean isShowing() { return false; }
    public void onDismiss() {}
    public void updateMenuView(boolean p0) {}
    public void setCallback(com.android.internal.view.menu.MenuPresenter.Callback p0) {}
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
    private int findIndexOfAddedMenu(com.android.internal.view.menu.MenuBuilder p0) { return 0; }
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    public boolean flagActionItems() { return false; }
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void setGravity(int p0) {}
    public void setAnchorView(android.view.View p0) {}
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0) {}
    public android.widget.ListView getListView() { return null; }
    public void setHorizontalOffset(int p0) {}
    public void setVerticalOffset(int p0) {}
    public void setShowTitle(boolean p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HorizPosition {
    }

    private static class CascadingMenuInfo {
        public final android.widget.MenuPopupWindow window = null;
        public final com.android.internal.view.menu.MenuBuilder menu = null;
        public final int position = 0;
        public CascadingMenuInfo(android.widget.MenuPopupWindow p0, com.android.internal.view.menu.MenuBuilder p1, int p2) {}
        public android.widget.ListView getListView() { return null; }
    }
}
