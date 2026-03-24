package android.widget;

public class Toolbar extends android.view.ViewGroup {
    android.view.View mExpandedActionView;
    public Toolbar(android.content.Context p0) { super((android.content.Context)null); }
    public Toolbar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Toolbar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Toolbar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    public void setPopupTheme(int p0) {}
    public int getPopupTheme() { return 0; }
    public void setTitleMargin(int p0, int p1, int p2, int p3) {}
    public int getTitleMarginStart() { return 0; }
    public void setTitleMarginStart(int p0) {}
    public int getTitleMarginTop() { return 0; }
    public void setTitleMarginTop(int p0) {}
    public int getTitleMarginEnd() { return 0; }
    public void setTitleMarginEnd(int p0) {}
    public int getTitleMarginBottom() { return 0; }
    public void setTitleMarginBottom(int p0) {}
    public void onRtlPropertiesChanged(int p0) {}
    public void setLogo(int p0) {}
    public boolean canShowOverflowMenu() { return false; }
    public boolean isOverflowMenuShowing() { return false; }
    public boolean isOverflowMenuShowPending() { return false; }
    public boolean showOverflowMenu() { return false; }
    public boolean hideOverflowMenu() { return false; }
    public void setMenu(com.android.internal.view.menu.MenuBuilder p0, android.widget.ActionMenuPresenter p1) {}
    public void dismissPopupMenus() {}
    public boolean isTitleTruncated() { return false; }
    public void setLogo(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getLogo() { return null; }
    public void setLogoDescription(int p0) {}
    public void setLogoDescription(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getLogoDescription() { return null; }
    public boolean hasExpandedActionView() { return false; }
    public void collapseActionView() {}
    public java.lang.CharSequence getTitle() { return null; }
    public void setTitle(int p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getSubtitle() { return null; }
    public void setSubtitle(int p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setTitleTextAppearance(android.content.Context p0, int p1) {}
    public void setSubtitleTextAppearance(android.content.Context p0, int p1) {}
    public void setTitleTextColor(int p0) {}
    public void setSubtitleTextColor(int p0) {}
    public java.lang.CharSequence getNavigationContentDescription() { return null; }
    public void setNavigationContentDescription(int p0) {}
    public void setNavigationContentDescription(java.lang.CharSequence p0) {}
    public void setNavigationIcon(int p0) {}
    public void setNavigationIcon(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getNavigationIcon() { return null; }
    public void setNavigationOnClickListener(android.view.View.OnClickListener p0) {}
    public android.view.View getNavigationView() { return null; }
    public java.lang.CharSequence getCollapseContentDescription() { return null; }
    public void setCollapseContentDescription(int p0) {}
    public void setCollapseContentDescription(java.lang.CharSequence p0) {}
    public android.graphics.drawable.Drawable getCollapseIcon() { return null; }
    public void setCollapseIcon(int p0) {}
    public void setCollapseIcon(android.graphics.drawable.Drawable p0) {}
    public android.view.Menu getMenu() { return null; }
    public void setOverflowIcon(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getOverflowIcon() { return null; }
    public void inflateMenu(int p0) {}
    public void setOnMenuItemClickListener(android.widget.Toolbar.OnMenuItemClickListener p0) {}
    public void setContentInsetsRelative(int p0, int p1) {}
    public int getContentInsetStart() { return 0; }
    public int getContentInsetEnd() { return 0; }
    public void setContentInsetsAbsolute(int p0, int p1) {}
    public int getContentInsetLeft() { return 0; }
    public int getContentInsetRight() { return 0; }
    public int getContentInsetStartWithNavigation() { return 0; }
    public void setContentInsetStartWithNavigation(int p0) {}
    public int getContentInsetEndWithActions() { return 0; }
    public void setContentInsetEndWithActions(int p0) {}
    public int getCurrentContentInsetStart() { return 0; }
    public int getCurrentContentInsetEnd() { return 0; }
    public int getCurrentContentInsetLeft() { return 0; }
    public int getCurrentContentInsetRight() { return 0; }
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected void onDetachedFromWindow() {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onSetLayoutParams(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.widget.Toolbar.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.widget.Toolbar.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    protected android.widget.Toolbar.LayoutParams generateDefaultLayoutParams() { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public com.android.internal.widget.DecorToolbar getWrapper() { return null; }
    void removeChildrenForExpandedActionView() {}
    void addChildrenForExpandedActionView() {}
    public void setCollapsible(boolean p0) {}
    public void setMenuCallbacks(com.android.internal.view.menu.MenuPresenter.Callback p0, com.android.internal.view.menu.MenuBuilder.Callback p1) {}
    android.widget.ActionMenuPresenter getOuterActionMenuPresenter() { return null; }
    android.content.Context getPopupContext() { return null; }

    public static class LayoutParams extends android.app.ActionBar.LayoutParams {
        static final int CUSTOM = 0;
        static final int SYSTEM = 1;
        static final int EXPANDED = 2;
        int mViewType;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super(0); }
        public LayoutParams(int p0, int p1) { super(0); }
        public LayoutParams(int p0, int p1, int p2) { super(0); }
        public LayoutParams(int p0) { super(0); }
        public LayoutParams(android.widget.Toolbar.LayoutParams p0) { super(0); }
        public LayoutParams(android.app.ActionBar.LayoutParams p0) { super(0); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super(0); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super(0); }
    }

    public static interface OnMenuItemClickListener {
        public boolean onMenuItemClick(android.view.MenuItem p0);
    }

    private class ExpandedActionViewMenuPresenter implements com.android.internal.view.menu.MenuPresenter {
        com.android.internal.view.menu.MenuBuilder mMenu;
        com.android.internal.view.menu.MenuItemImpl mCurrentExpandedItem;
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

    static class SavedState extends android.view.View.BaseSavedState {
        public int expandedMenuItemId;
        public boolean isOverflowOpen;
        public static final android.os.Parcelable.Creator<android.widget.Toolbar.SavedState> CREATOR = null;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
