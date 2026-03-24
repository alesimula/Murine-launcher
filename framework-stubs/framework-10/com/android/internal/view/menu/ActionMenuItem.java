package com.android.internal.view.menu;

public class ActionMenuItem implements android.view.MenuItem {
    private final int mId = 0;
    private final int mGroup = 0;
    private final int mCategoryOrder = 0;
    private final int mOrdering = 0;
    private java.lang.CharSequence mTitle;
    private java.lang.CharSequence mTitleCondensed;
    private android.content.Intent mIntent;
    private char mShortcutNumericChar;
    private int mShortcutNumericModifiers;
    private char mShortcutAlphabeticChar;
    private int mShortcutAlphabeticModifiers;
    private android.graphics.drawable.Drawable mIconDrawable;
    private int mIconResId;
    private android.content.res.ColorStateList mIconTintList;
    private android.graphics.PorterDuff.Mode mIconTintMode;
    private boolean mHasIconTint;
    private boolean mHasIconTintMode;
    private android.content.Context mContext;
    private android.view.MenuItem.OnMenuItemClickListener mClickListener;
    private java.lang.CharSequence mContentDescription;
    private java.lang.CharSequence mTooltipText;
    private static final int NO_ICON = 0;
    private int mFlags;
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int ENABLED = 16;
    @android.annotation.UnsupportedAppUsage
    public ActionMenuItem(android.content.Context p0, int p1, int p2, int p3, int p4, java.lang.CharSequence p5) {}
    public char getAlphabeticShortcut() { return 0; }
    public int getAlphabeticModifiers() { return 0; }
    public int getGroupId() { return 0; }
    public android.graphics.drawable.Drawable getIcon() { return null; }
    public android.content.Intent getIntent() { return null; }
    public int getItemId() { return 0; }
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() { return null; }
    public char getNumericShortcut() { return 0; }
    public int getNumericModifiers() { return 0; }
    public int getOrder() { return 0; }
    public android.view.SubMenu getSubMenu() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getTitleCondensed() { return null; }
    public boolean hasSubMenu() { return false; }
    public boolean isCheckable() { return false; }
    public boolean isChecked() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isVisible() { return false; }
    public android.view.MenuItem setAlphabeticShortcut(char p0) { return null; }
    public android.view.MenuItem setAlphabeticShortcut(char p0, int p1) { return null; }
    public android.view.MenuItem setCheckable(boolean p0) { return null; }
    public com.android.internal.view.menu.ActionMenuItem setExclusiveCheckable(boolean p0) { return null; }
    public android.view.MenuItem setChecked(boolean p0) { return null; }
    public android.view.MenuItem setEnabled(boolean p0) { return null; }
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable p0) { return null; }
    public android.view.MenuItem setIcon(int p0) { return null; }
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList p0) { return null; }
    public android.content.res.ColorStateList getIconTintList() { return null; }
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode p0) { return null; }
    public android.graphics.PorterDuff.Mode getIconTintMode() { return null; }
    private void applyIconTint() {}
    public android.view.MenuItem setIntent(android.content.Intent p0) { return null; }
    public android.view.MenuItem setNumericShortcut(char p0) { return null; }
    public android.view.MenuItem setNumericShortcut(char p0, int p1) { return null; }
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener p0) { return null; }
    public android.view.MenuItem setShortcut(char p0, char p1) { return null; }
    public android.view.MenuItem setShortcut(char p0, char p1, int p2, int p3) { return null; }
    public android.view.MenuItem setTitle(java.lang.CharSequence p0) { return null; }
    public android.view.MenuItem setTitle(int p0) { return null; }
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence p0) { return null; }
    public android.view.MenuItem setVisible(boolean p0) { return null; }
    public boolean invoke() { return false; }
    public void setShowAsAction(int p0) {}
    public android.view.MenuItem setActionView(android.view.View p0) { return null; }
    public android.view.View getActionView() { return null; }
    public android.view.MenuItem setActionView(int p0) { return null; }
    public android.view.ActionProvider getActionProvider() { return null; }
    public android.view.MenuItem setActionProvider(android.view.ActionProvider p0) { return null; }
    public android.view.MenuItem setShowAsActionFlags(int p0) { return null; }
    public boolean expandActionView() { return false; }
    public boolean collapseActionView() { return false; }
    public boolean isActionViewExpanded() { return false; }
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener p0) { return null; }
    public android.view.MenuItem setContentDescription(java.lang.CharSequence p0) { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.view.MenuItem setTooltipText(java.lang.CharSequence p0) { return null; }
    public java.lang.CharSequence getTooltipText() { return null; }
}
