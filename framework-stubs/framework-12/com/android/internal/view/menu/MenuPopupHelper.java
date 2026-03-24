package com.android.internal.view.menu;

public class MenuPopupHelper implements com.android.internal.view.menu.MenuHelper {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private final android.content.Context mContext = null;
    private final com.android.internal.view.menu.MenuBuilder mMenu = null;
    private final boolean mOverflowOnly = false;
    private final int mPopupStyleAttr = 0;
    private final int mPopupStyleRes = 0;
    private android.view.View mAnchorView;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private com.android.internal.view.menu.MenuPresenter.Callback mPresenterCallback;
    private com.android.internal.view.menu.MenuPopup mPopup;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.widget.PopupWindow.OnDismissListener mInternalOnDismissListener = null;
    public MenuPopupHelper(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1) {}
    public MenuPopupHelper(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1, android.view.View p2) {}
    public MenuPopupHelper(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1, android.view.View p2, boolean p3, int p4) {}
    public MenuPopupHelper(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1, android.view.View p2, boolean p3, int p4, int p5) {}
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0) {}
    public void setAnchorView(android.view.View p0) {}
    public void setForceShowIcon(boolean p0) {}
    public void setGravity(int p0) {}
    public int getGravity() { return 0; }
    public void show() {}
    public void show(int p0, int p1) {}
    public com.android.internal.view.menu.MenuPopup getPopup() { return null; }
    public boolean tryShow() { return false; }
    public boolean tryShow(int p0, int p1) { return false; }
    private com.android.internal.view.menu.MenuPopup createPopup() { return null; }
    private void showPopup(int p0, int p1, boolean p2, boolean p3) {}
    public void dismiss() {}
    protected void onDismiss() {}
    public boolean isShowing() { return false; }
    public void setPresenterCallback(com.android.internal.view.menu.MenuPresenter.Callback p0) {}
}
