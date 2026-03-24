package com.android.internal.app;

public class WindowDecorActionBar extends android.app.ActionBar implements com.android.internal.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback {
    private static final java.lang.String TAG = "WindowDecorActionBar";
    private android.content.Context mContext;
    private android.content.Context mThemedContext;
    private android.app.Activity mActivity;
    private android.app.Dialog mDialog;
    private com.android.internal.widget.ActionBarOverlayLayout mOverlayLayout;
    private com.android.internal.widget.ActionBarContainer mContainerView;
    private com.android.internal.widget.DecorToolbar mDecorToolbar;
    private com.android.internal.widget.ActionBarContextView mContextView;
    private com.android.internal.widget.ActionBarContainer mSplitView;
    private android.view.View mContentView;
    private com.android.internal.widget.ScrollingTabContainerView mTabScrollView;
    private java.util.ArrayList<com.android.internal.app.WindowDecorActionBar.TabImpl> mTabs;
    private com.android.internal.app.WindowDecorActionBar.TabImpl mSelectedTab;
    private int mSavedTabPosition;
    private boolean mDisplayHomeAsUpSet;
    android.view.ActionMode mActionMode;
    android.view.ActionMode mDeferredDestroyActionMode;
    android.view.ActionMode.Callback mDeferredModeDestroyCallback;
    private boolean mLastMenuVisibility;
    private java.util.ArrayList<android.app.ActionBar.OnMenuVisibilityListener> mMenuVisibilityListeners;
    private static final int CONTEXT_DISPLAY_NORMAL = 0;
    private static final int CONTEXT_DISPLAY_SPLIT = 1;
    private static final int INVALID_POSITION = -1;
    private static final long FADE_OUT_DURATION_MS = 100L;
    private static final long FADE_IN_DURATION_MS = 200L;
    private int mContextDisplayMode;
    private boolean mHasEmbeddedTabs;
    private int mCurWindowVisibility;
    private boolean mContentAnimations;
    private boolean mHiddenByApp;
    private boolean mHiddenBySystem;
    private boolean mShowingForMode;
    private boolean mNowShowing;
    private android.animation.Animator mCurrentShowAnim;
    private boolean mShowHideAnimationEnabled;
    boolean mHideOnContentScroll;
    final android.animation.Animator.AnimatorListener mHideListener = null;
    final android.animation.Animator.AnimatorListener mShowListener = null;
    final android.animation.ValueAnimator.AnimatorUpdateListener mUpdateListener = null;
    public WindowDecorActionBar(android.app.Activity p0) { super(); }
    public WindowDecorActionBar(android.app.Dialog p0) { super(); }
    public WindowDecorActionBar(android.view.View p0) { super(); }
    private void init(android.view.View p0) {}
    private com.android.internal.widget.DecorToolbar getDecorToolbar(android.view.View p0) { return null; }
    public void setElevation(float p0) {}
    public float getElevation() { return 0.0f; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    private void setHasEmbeddedTabs(boolean p0) {}
    private void ensureTabsExist() {}
    void completeDeferredDestroyActionMode() {}
    public void onWindowVisibilityChanged(int p0) {}
    public void setShowHideAnimationEnabled(boolean p0) {}
    public void addOnMenuVisibilityListener(android.app.ActionBar.OnMenuVisibilityListener p0) {}
    public void removeOnMenuVisibilityListener(android.app.ActionBar.OnMenuVisibilityListener p0) {}
    public void dispatchMenuVisibilityChanged(boolean p0) {}
    public void setCustomView(int p0) {}
    public void setDisplayUseLogoEnabled(boolean p0) {}
    public void setDisplayShowHomeEnabled(boolean p0) {}
    public void setDisplayHomeAsUpEnabled(boolean p0) {}
    public void setDisplayShowTitleEnabled(boolean p0) {}
    public void setDisplayShowCustomEnabled(boolean p0) {}
    public void setHomeButtonEnabled(boolean p0) {}
    public void setTitle(int p0) {}
    public void setSubtitle(int p0) {}
    public void setSelectedNavigationItem(int p0) {}
    public void removeAllTabs() {}
    private void cleanupTabs() {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setWindowTitle(java.lang.CharSequence p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setDisplayOptions(int p0) {}
    public void setDisplayOptions(int p0, int p1) {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public android.view.View getCustomView() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public int getNavigationMode() { return 0; }
    public int getDisplayOptions() { return 0; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }
    private void configureTab(android.app.ActionBar.Tab p0, int p1) {}
    public void addTab(android.app.ActionBar.Tab p0) {}
    public void addTab(android.app.ActionBar.Tab p0, int p1) {}
    public void addTab(android.app.ActionBar.Tab p0, boolean p1) {}
    public void addTab(android.app.ActionBar.Tab p0, int p1, boolean p2) {}
    public android.app.ActionBar.Tab newTab() { return null; }
    public void removeTab(android.app.ActionBar.Tab p0) {}
    public void removeTabAt(int p0) {}
    public void selectTab(android.app.ActionBar.Tab p0) {}
    public android.app.ActionBar.Tab getSelectedTab() { return null; }
    public int getHeight() { return 0; }
    public void enableContentAnimations(boolean p0) {}
    public void show() {}
    private void showForActionMode() {}
    public void showForSystem() {}
    public void hide() {}
    private void hideForActionMode() {}
    public void hideForSystem() {}
    public void setHideOnContentScrollEnabled(boolean p0) {}
    public boolean isHideOnContentScrollEnabled() { return false; }
    public int getHideOffset() { return 0; }
    public void setHideOffset(int p0) {}
    private static boolean checkShowingFlags(boolean p0, boolean p1, boolean p2) { return false; }
    private void updateVisibility(boolean p0) {}
    public void doShow(boolean p0) {}
    public void doHide(boolean p0) {}
    public boolean isShowing() { return false; }
    void animateToMode(boolean p0) {}
    private boolean shouldAnimateContextView() { return false; }
    public android.content.Context getThemedContext() { return null; }
    public boolean isTitleTruncated() { return false; }
    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable p0) {}
    public void setHomeAsUpIndicator(int p0) {}
    public void setHomeActionContentDescription(java.lang.CharSequence p0) {}
    public void setHomeActionContentDescription(int p0) {}
    public void onContentScrollStarted() {}
    public void onContentScrollStopped() {}
    public boolean collapseActionView() { return false; }
    public void setCustomView(android.view.View p0) {}
    public void setCustomView(android.view.View p0, android.app.ActionBar.LayoutParams p1) {}
    public void setListNavigationCallbacks(android.widget.SpinnerAdapter p0, android.app.ActionBar.OnNavigationListener p1) {}
    public int getSelectedNavigationIndex() { return 0; }
    public int getNavigationItemCount() { return 0; }
    public int getTabCount() { return 0; }
    public void setNavigationMode(int p0) {}
    public android.app.ActionBar.Tab getTabAt(int p0) { return null; }
    public void setIcon(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public boolean hasIcon() { return false; }
    public void setLogo(int p0) {}
    public void setLogo(android.graphics.drawable.Drawable p0) {}
    public boolean hasLogo() { return false; }
    public void setDefaultDisplayHomeAsUpEnabled(boolean p0) {}

    public class ActionModeImpl extends android.view.ActionMode implements com.android.internal.view.menu.MenuBuilder.Callback {
        private final android.content.Context mActionModeContext = null;
        private final com.android.internal.view.menu.MenuBuilder mMenu = null;
        private android.view.ActionMode.Callback mCallback;
        private java.lang.ref.WeakReference<android.view.View> mCustomView;
        public ActionModeImpl(com.android.internal.app.WindowDecorActionBar p0, android.content.Context p1, android.view.ActionMode.Callback p2) { super(); }
        public android.view.MenuInflater getMenuInflater() { return null; }
        public android.view.Menu getMenu() { return null; }
        public void finish() {}
        public void invalidate() {}
        public boolean dispatchOnCreate() { return false; }
        public void setCustomView(android.view.View p0) {}
        public void setSubtitle(java.lang.CharSequence p0) {}
        public void setTitle(java.lang.CharSequence p0) {}
        public void setTitle(int p0) {}
        public void setSubtitle(int p0) {}
        public java.lang.CharSequence getTitle() { return null; }
        public java.lang.CharSequence getSubtitle() { return null; }
        public void setTitleOptionalHint(boolean p0) {}
        public boolean isTitleOptional() { return false; }
        public android.view.View getCustomView() { return null; }
        public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
        public void onCloseSubMenu(com.android.internal.view.menu.SubMenuBuilder p0) {}
        public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
    }

    public class TabImpl extends android.app.ActionBar.Tab {
        private android.app.ActionBar.TabListener mCallback;
        private java.lang.Object mTag;
        private android.graphics.drawable.Drawable mIcon;
        private java.lang.CharSequence mText;
        private java.lang.CharSequence mContentDesc;
        private int mPosition;
        private android.view.View mCustomView;
        public TabImpl(com.android.internal.app.WindowDecorActionBar p0) { super(); }
        public java.lang.Object getTag() { return null; }
        public android.app.ActionBar.Tab setTag(java.lang.Object p0) { return null; }
        public android.app.ActionBar.TabListener getCallback() { return null; }
        public android.app.ActionBar.Tab setTabListener(android.app.ActionBar.TabListener p0) { return null; }
        public android.view.View getCustomView() { return null; }
        public android.app.ActionBar.Tab setCustomView(android.view.View p0) { return null; }
        public android.app.ActionBar.Tab setCustomView(int p0) { return null; }
        public android.graphics.drawable.Drawable getIcon() { return null; }
        public int getPosition() { return 0; }
        public void setPosition(int p0) {}
        public java.lang.CharSequence getText() { return null; }
        public android.app.ActionBar.Tab setIcon(android.graphics.drawable.Drawable p0) { return null; }
        public android.app.ActionBar.Tab setIcon(int p0) { return null; }
        public android.app.ActionBar.Tab setText(java.lang.CharSequence p0) { return null; }
        public android.app.ActionBar.Tab setText(int p0) { return null; }
        public void select() {}
        public android.app.ActionBar.Tab setContentDescription(int p0) { return null; }
        public android.app.ActionBar.Tab setContentDescription(java.lang.CharSequence p0) { return null; }
        public java.lang.CharSequence getContentDescription() { return null; }
    }
}
