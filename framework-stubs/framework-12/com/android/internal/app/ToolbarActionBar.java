package com.android.internal.app;

public class ToolbarActionBar extends android.app.ActionBar {
    private com.android.internal.widget.DecorToolbar mDecorToolbar;
    private boolean mToolbarMenuPrepared;
    private android.view.Window.Callback mWindowCallback;
    private boolean mMenuCallbackSet;
    private boolean mLastMenuVisibility;
    private java.util.ArrayList<android.app.ActionBar.OnMenuVisibilityListener> mMenuVisibilityListeners;
    private final java.lang.Runnable mMenuInvalidator = null;
    private final android.widget.Toolbar.OnMenuItemClickListener mMenuClicker = null;
    public ToolbarActionBar(android.widget.Toolbar p0, java.lang.CharSequence p1, android.view.Window.Callback p2) { super(); }
    public android.view.Window.Callback getWrappedWindowCallback() { return null; }
    public void setCustomView(android.view.View p0) {}
    public void setCustomView(android.view.View p0, android.app.ActionBar.LayoutParams p1) {}
    public void setCustomView(int p0) {}
    public void setIcon(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setLogo(int p0) {}
    public void setLogo(android.graphics.drawable.Drawable p0) {}
    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setHomeButtonEnabled(boolean p0) {}
    public void setElevation(float p0) {}
    public float getElevation() { return 0.0f; }
    public android.content.Context getThemedContext() { return null; }
    public boolean isTitleTruncated() { return false; }
    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable p0) {}
    public void setHomeAsUpIndicator(int p0) {}
    public void setHomeActionContentDescription(java.lang.CharSequence p0) {}
    public void setDefaultDisplayHomeAsUpEnabled(boolean p0) {}
    public void setHomeActionContentDescription(int p0) {}
    public void setShowHideAnimationEnabled(boolean p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }
    public void setListNavigationCallbacks(android.widget.SpinnerAdapter p0, android.app.ActionBar.OnNavigationListener p1) {}
    public void setSelectedNavigationItem(int p0) {}
    public int getSelectedNavigationIndex() { return 0; }
    public int getNavigationItemCount() { return 0; }
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitle(int p0) {}
    public void setWindowTitle(java.lang.CharSequence p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setSubtitle(int p0) {}
    public void setDisplayOptions(int p0) {}
    public void setDisplayOptions(int p0, int p1) {}
    public void setDisplayUseLogoEnabled(boolean p0) {}
    public void setDisplayShowHomeEnabled(boolean p0) {}
    public void setDisplayHomeAsUpEnabled(boolean p0) {}
    public void setDisplayShowTitleEnabled(boolean p0) {}
    public void setDisplayShowCustomEnabled(boolean p0) {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public android.view.View getCustomView() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public int getNavigationMode() { return 0; }
    public void setNavigationMode(int p0) {}
    public int getDisplayOptions() { return 0; }
    public android.app.ActionBar.Tab newTab() { return null; }
    public void addTab(android.app.ActionBar.Tab p0) {}
    public void addTab(android.app.ActionBar.Tab p0, boolean p1) {}
    public void addTab(android.app.ActionBar.Tab p0, int p1) {}
    public void addTab(android.app.ActionBar.Tab p0, int p1, boolean p2) {}
    public void removeTab(android.app.ActionBar.Tab p0) {}
    public void removeTabAt(int p0) {}
    public void removeAllTabs() {}
    public void selectTab(android.app.ActionBar.Tab p0) {}
    public android.app.ActionBar.Tab getSelectedTab() { return null; }
    public android.app.ActionBar.Tab getTabAt(int p0) { return null; }
    public int getTabCount() { return 0; }
    public int getHeight() { return 0; }
    public void show() {}
    public void hide() {}
    public boolean isShowing() { return false; }
    public boolean openOptionsMenu() { return false; }
    public boolean closeOptionsMenu() { return false; }
    public boolean invalidateOptionsMenu() { return false; }
    public boolean collapseActionView() { return false; }
    void populateOptionsMenu() {}
    public boolean onMenuKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean onKeyShortcut(int p0, android.view.KeyEvent p1) { return false; }
    public void onDestroy() {}
    public void addOnMenuVisibilityListener(android.app.ActionBar.OnMenuVisibilityListener p0) {}
    public void removeOnMenuVisibilityListener(android.app.ActionBar.OnMenuVisibilityListener p0) {}
    public void dispatchMenuVisibilityChanged(boolean p0) {}

    private final class ActionMenuPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
        private boolean mClosingActionMenu;
        private ActionMenuPresenterCallback(com.android.internal.app.ToolbarActionBar p0) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    }

    private final class MenuBuilderCallback implements com.android.internal.view.menu.MenuBuilder.Callback {
        private MenuBuilderCallback(com.android.internal.app.ToolbarActionBar p0) {}
        public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
        public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
    }

    private class ToolbarCallbackWrapper extends android.view.WindowCallbackWrapper {
        public ToolbarCallbackWrapper(com.android.internal.app.ToolbarActionBar p0, android.view.Window.Callback p1) { super(null); }
        public boolean onPreparePanel(int p0, android.view.View p1, android.view.Menu p2) { return false; }
        public android.view.View onCreatePanelView(int p0) { return null; }
    }
}
