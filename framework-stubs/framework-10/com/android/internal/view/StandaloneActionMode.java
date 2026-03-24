package com.android.internal.view;

public class StandaloneActionMode extends android.view.ActionMode implements com.android.internal.view.menu.MenuBuilder.Callback {
    private android.content.Context mContext;
    private com.android.internal.widget.ActionBarContextView mContextView;
    private android.view.ActionMode.Callback mCallback;
    private java.lang.ref.WeakReference<android.view.View> mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private com.android.internal.view.menu.MenuBuilder mMenu;
    public StandaloneActionMode(android.content.Context p0, com.android.internal.widget.ActionBarContextView p1, android.view.ActionMode.Callback p2, boolean p3) { super(); }
    public void setTitle(java.lang.CharSequence p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setTitle(int p0) {}
    public void setSubtitle(int p0) {}
    public void setTitleOptionalHint(boolean p0) {}
    public boolean isTitleOptional() { return false; }
    public void setCustomView(android.view.View p0) {}
    public void invalidate() {}
    public void finish() {}
    public android.view.Menu getMenu() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public android.view.View getCustomView() { return null; }
    public android.view.MenuInflater getMenuInflater() { return null; }
    public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
    public void onCloseSubMenu(com.android.internal.view.menu.SubMenuBuilder p0) {}
    public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
    public boolean isUiFocusable() { return false; }
}
