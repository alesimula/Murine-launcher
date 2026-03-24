package com.android.internal.view.menu;

public class MenuDialogHelper implements com.android.internal.view.menu.MenuHelper, android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, com.android.internal.view.menu.MenuPresenter.Callback {
    private com.android.internal.view.menu.MenuBuilder mMenu;
    private android.app.AlertDialog mDialog;
    com.android.internal.view.menu.ListMenuPresenter mPresenter;
    private com.android.internal.view.menu.MenuPresenter.Callback mPresenterCallback;
    @android.annotation.UnsupportedAppUsage
    public MenuDialogHelper(com.android.internal.view.menu.MenuBuilder p0) {}
    @android.annotation.UnsupportedAppUsage
    public void show(android.os.IBinder p0) {}
    public boolean onKey(android.content.DialogInterface p0, int p1, android.view.KeyEvent p2) { return false; }
    public void setPresenterCallback(com.android.internal.view.menu.MenuPresenter.Callback p0) {}
    @android.annotation.UnsupportedAppUsage
    public void dismiss() {}
    public void onDismiss(android.content.DialogInterface p0) {}
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
    public void onClick(android.content.DialogInterface p0, int p1) {}
}
