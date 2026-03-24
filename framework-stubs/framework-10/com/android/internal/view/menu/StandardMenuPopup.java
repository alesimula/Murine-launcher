package com.android.internal.view.menu;

final class StandardMenuPopup extends com.android.internal.view.menu.MenuPopup implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, com.android.internal.view.menu.MenuPresenter, android.view.View.OnKeyListener {
    private static final int ITEM_LAYOUT = 17367224;
    private final android.content.Context mContext = null;
    private final com.android.internal.view.menu.MenuBuilder mMenu = null;
    private final com.android.internal.view.menu.MenuAdapter mAdapter = null;
    private final boolean mOverflowOnly = false;
    private final int mPopupMaxWidth = 0;
    private final int mPopupStyleAttr = 0;
    private final int mPopupStyleRes = 0;
    private final android.widget.MenuPopupWindow mPopup = null;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = null;
    private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener = null;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private android.view.View mAnchorView;
    private android.view.View mShownAnchorView;
    private com.android.internal.view.menu.MenuPresenter.Callback mPresenterCallback;
    private android.view.ViewTreeObserver mTreeObserver;
    private boolean mWasDismissed;
    private boolean mHasContentWidth;
    private int mContentWidth;
    private int mDropDownGravity;
    private boolean mShowTitle;
    public StandardMenuPopup(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1, android.view.View p2, int p3, int p4, boolean p5) { super(); }
    public void setForceShowIcon(boolean p0) {}
    public void setGravity(int p0) {}
    private boolean tryShow() { return false; }
    public void show() {}
    public void dismiss() {}
    public void addMenu(com.android.internal.view.menu.MenuBuilder p0) {}
    public boolean isShowing() { return false; }
    public void onDismiss() {}
    public void updateMenuView(boolean p0) {}
    public void setCallback(com.android.internal.view.menu.MenuPresenter.Callback p0) {}
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    public boolean flagActionItems() { return false; }
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void setAnchorView(android.view.View p0) {}
    public boolean onKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0) {}
    public android.widget.ListView getListView() { return null; }
    public void setHorizontalOffset(int p0) {}
    public void setVerticalOffset(int p0) {}
    public void setShowTitle(boolean p0) {}
}
