package com.android.internal.widget;

public class ActionBarView extends com.android.internal.widget.AbsActionBarView implements com.android.internal.widget.DecorToolbar {
    private static final java.lang.String TAG = "ActionBarView";
    public static final int DISPLAY_DEFAULT = 0;
    private static final int DISPLAY_RELAYOUT_MASK = 63;
    private static final int DEFAULT_CUSTOM_GRAVITY = 8388627;
    private int mNavigationMode;
    private int mDisplayOptions;
    private java.lang.CharSequence mTitle;
    private java.lang.CharSequence mSubtitle;
    private android.graphics.drawable.Drawable mIcon;
    private android.graphics.drawable.Drawable mLogo;
    private java.lang.CharSequence mHomeDescription;
    private int mHomeDescriptionRes;
    private com.android.internal.widget.ActionBarView.HomeView mHomeLayout;
    private com.android.internal.widget.ActionBarView.HomeView mExpandedHomeLayout;
    private android.widget.LinearLayout mTitleLayout;
    private android.widget.TextView mTitleView;
    private android.widget.TextView mSubtitleView;
    private android.view.ViewGroup mUpGoerFive;
    private android.widget.Spinner mSpinner;
    private android.widget.LinearLayout mListNavLayout;
    private com.android.internal.widget.ScrollingTabContainerView mTabScrollView;
    private android.view.View mCustomNavView;
    private android.widget.ProgressBar mProgressView;
    private android.widget.ProgressBar mIndeterminateProgressView;
    private int mProgressBarPadding;
    private int mItemPadding;
    private final int mTitleStyleRes = 0;
    private final int mSubtitleStyleRes = 0;
    private final int mProgressStyle = 0;
    private final int mIndeterminateProgressStyle = 0;
    private boolean mUserTitle;
    private boolean mIncludeTabs;
    private boolean mIsCollapsible;
    private boolean mWasHomeEnabled;
    private com.android.internal.view.menu.MenuBuilder mOptionsMenu;
    private boolean mMenuPrepared;
    private com.android.internal.widget.ActionBarContextView mContextView;
    private com.android.internal.view.menu.ActionMenuItem mLogoNavItem;
    private android.widget.SpinnerAdapter mSpinnerAdapter;
    private android.widget.AdapterView.OnItemSelectedListener mNavItemSelectedListener;
    private java.lang.Runnable mTabSelector;
    private com.android.internal.widget.ActionBarView.ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    android.view.View mExpandedActionView;
    private int mDefaultUpDescription;
    android.view.Window.Callback mWindowCallback;
    private final android.view.View.OnClickListener mExpandedActionViewUpListener = null;
    private final android.view.View.OnClickListener mUpClickListener = null;
    public ActionBarView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void setWindowCallback(android.view.Window.Callback p0) {}
    public void onDetachedFromWindow() {}
    public boolean shouldDelayChildPressedState() { return false; }
    public void initProgress() {}
    public void initIndeterminateProgress() {}
    public void setSplitToolbar(boolean p0) {}
    public boolean isSplit() { return false; }
    public boolean canSplit() { return false; }
    public boolean hasEmbeddedTabs() { return false; }
    public void setEmbeddedTabView(com.android.internal.widget.ScrollingTabContainerView p0) {}
    public void setMenuPrepared() {}
    public void setMenu(android.view.Menu p0, com.android.internal.view.menu.MenuPresenter.Callback p1) {}
    private void configPresenters(com.android.internal.view.menu.MenuBuilder p0) {}
    public boolean hasExpandedActionView() { return false; }
    public void collapseActionView() {}
    public void setCustomView(android.view.View p0) {}
    public java.lang.CharSequence getTitle() { return null; }
    public void setTitle(java.lang.CharSequence p0) {}
    public void setWindowTitle(java.lang.CharSequence p0) {}
    private void setTitleImpl(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getSubtitle() { return null; }
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setHomeButtonEnabled(boolean p0) {}
    private void setHomeButtonEnabled(boolean p0, boolean p1) {}
    private void updateHomeAccessibility(boolean p0) {}
    private java.lang.CharSequence buildHomeContentDescription() { return null; }
    public void setDisplayOptions(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setIcon(int p0) {}
    public boolean hasIcon() { return false; }
    public void setLogo(android.graphics.drawable.Drawable p0) {}
    public void setLogo(int p0) {}
    public boolean hasLogo() { return false; }
    public void setNavigationMode(int p0) {}
    public void setDropdownParams(android.widget.SpinnerAdapter p0, android.widget.AdapterView.OnItemSelectedListener p1) {}
    public int getDropdownItemCount() { return 0; }
    public void setDropdownSelectedPosition(int p0) {}
    public int getDropdownSelectedPosition() { return 0; }
    public android.view.View getCustomView() { return null; }
    public int getNavigationMode() { return 0; }
    public int getDisplayOptions() { return 0; }
    public android.view.ViewGroup getViewGroup() { return null; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected void onFinishInflate() {}
    private void initTitle() {}
    public void setContextView(com.android.internal.widget.ActionBarContextView p0) {}
    public void setCollapsible(boolean p0) {}
    public boolean isTitleTruncated() { return false; }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void setNavigationIcon(android.graphics.drawable.Drawable p0) {}
    public void setDefaultNavigationIcon(android.graphics.drawable.Drawable p0) {}
    public void setNavigationIcon(int p0) {}
    public void setNavigationContentDescription(java.lang.CharSequence p0) {}
    public void setNavigationContentDescription(int p0) {}
    public void setDefaultNavigationContentDescription(int p0) {}
    public void setMenuCallbacks(com.android.internal.view.menu.MenuPresenter.Callback p0, com.android.internal.view.menu.MenuBuilder.Callback p1) {}
    public android.view.Menu getMenu() { return null; }

    static class SavedState extends android.view.View.BaseSavedState {
        int expandedMenuItemId;
        boolean isOverflowOpen;
        public static final android.os.Parcelable.Creator<com.android.internal.widget.ActionBarView.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class HomeView extends android.widget.FrameLayout {
        private android.widget.ImageView mUpView;
        private android.widget.ImageView mIconView;
        private int mUpWidth;
        private int mStartOffset;
        private int mUpIndicatorRes;
        private android.graphics.drawable.Drawable mDefaultUpIndicator;
        private android.graphics.drawable.Drawable mUpIndicator;
        private static final long DEFAULT_TRANSITION_DURATION = 150L;
        public HomeView(android.content.Context p0) { super((android.content.Context)null); }
        public HomeView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public void setShowUp(boolean p0) {}
        public void setShowIcon(boolean p0) {}
        public void setIcon(android.graphics.drawable.Drawable p0) {}
        public void setUpIndicator(android.graphics.drawable.Drawable p0) {}
        public void setDefaultUpIndicator(android.graphics.drawable.Drawable p0) {}
        public void setUpIndicator(int p0) {}
        private void updateUpIndicator() {}
        protected void onConfigurationChanged(android.content.res.Configuration p0) {}
        public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
        public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
        public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
        protected void onFinishInflate() {}
        public int getStartOffset() { return 0; }
        public int getUpWidth() { return 0; }
        protected void onMeasure(int p0, int p1) {}
        protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    }

    private class ExpandedActionViewMenuPresenter implements com.android.internal.view.menu.MenuPresenter {
        com.android.internal.view.menu.MenuBuilder mMenu;
        com.android.internal.view.menu.MenuItemImpl mCurrentExpandedItem;
        private ExpandedActionViewMenuPresenter(com.android.internal.widget.ActionBarView p0) {}
        public void initForMenu(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1) {}
        public com.android.internal.view.menu.MenuView getMenuView(android.view.ViewGroup p0) { return null; }
        public void updateMenuView(boolean p0) {}
        public void setCallback(com.android.internal.view.menu.MenuPresenter.Callback p0) {}
        public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean flagActionItems() { return false; }
        public boolean expandItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
        public boolean collapseItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
        public int getId() { return 0; }
        public android.os.Parcelable onSaveInstanceState() { return null; }
        public void onRestoreInstanceState(android.os.Parcelable p0) {}
    }
}
