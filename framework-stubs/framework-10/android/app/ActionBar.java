package android.app;

public abstract class ActionBar {
    @java.lang.Deprecated
    public static final int NAVIGATION_MODE_STANDARD = 0;
    @java.lang.Deprecated
    public static final int NAVIGATION_MODE_LIST = 1;
    @java.lang.Deprecated
    public static final int NAVIGATION_MODE_TABS = 2;
    public static final int DISPLAY_USE_LOGO = 1;
    public static final int DISPLAY_SHOW_HOME = 2;
    public static final int DISPLAY_HOME_AS_UP = 4;
    public static final int DISPLAY_SHOW_TITLE = 8;
    public static final int DISPLAY_SHOW_CUSTOM = 16;
    @android.annotation.UnsupportedAppUsage
    public static final int DISPLAY_TITLE_MULTIPLE_LINES = 32;
    public ActionBar() {}
    public abstract void setCustomView(android.view.View p0);
    public abstract void setCustomView(android.view.View p0, android.app.ActionBar.LayoutParams p1);
    public abstract void setCustomView(int p0);
    public abstract void setIcon(int p0);
    public abstract void setIcon(android.graphics.drawable.Drawable p0);
    public abstract void setLogo(int p0);
    public abstract void setLogo(android.graphics.drawable.Drawable p0);
    @java.lang.Deprecated
    public abstract void setListNavigationCallbacks(android.widget.SpinnerAdapter p0, android.app.ActionBar.OnNavigationListener p1);
    @java.lang.Deprecated
    public abstract void setSelectedNavigationItem(int p0);
    @java.lang.Deprecated
    public abstract int getSelectedNavigationIndex();
    @java.lang.Deprecated
    public abstract int getNavigationItemCount();
    public abstract void setTitle(java.lang.CharSequence p0);
    public abstract void setTitle(int p0);
    public abstract void setSubtitle(java.lang.CharSequence p0);
    public abstract void setSubtitle(int p0);
    public abstract void setDisplayOptions(int p0);
    public abstract void setDisplayOptions(int p0, int p1);
    public abstract void setDisplayUseLogoEnabled(boolean p0);
    public abstract void setDisplayShowHomeEnabled(boolean p0);
    public abstract void setDisplayHomeAsUpEnabled(boolean p0);
    public abstract void setDisplayShowTitleEnabled(boolean p0);
    public abstract void setDisplayShowCustomEnabled(boolean p0);
    public abstract void setBackgroundDrawable(android.graphics.drawable.Drawable p0);
    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public abstract android.view.View getCustomView();
    public abstract java.lang.CharSequence getTitle();
    public abstract java.lang.CharSequence getSubtitle();
    @java.lang.Deprecated
    public abstract int getNavigationMode();
    @java.lang.Deprecated
    public abstract void setNavigationMode(int p0);
    public abstract int getDisplayOptions();
    @java.lang.Deprecated
    public abstract android.app.ActionBar.Tab newTab();
    @java.lang.Deprecated
    public abstract void addTab(android.app.ActionBar.Tab p0);
    @java.lang.Deprecated
    public abstract void addTab(android.app.ActionBar.Tab p0, boolean p1);
    @java.lang.Deprecated
    public abstract void addTab(android.app.ActionBar.Tab p0, int p1);
    @java.lang.Deprecated
    public abstract void addTab(android.app.ActionBar.Tab p0, int p1, boolean p2);
    @java.lang.Deprecated
    public abstract void removeTab(android.app.ActionBar.Tab p0);
    @java.lang.Deprecated
    public abstract void removeTabAt(int p0);
    @java.lang.Deprecated
    public abstract void removeAllTabs();
    @java.lang.Deprecated
    public abstract void selectTab(android.app.ActionBar.Tab p0);
    @java.lang.Deprecated
    public abstract android.app.ActionBar.Tab getSelectedTab();
    @java.lang.Deprecated
    public abstract android.app.ActionBar.Tab getTabAt(int p0);
    @java.lang.Deprecated
    public abstract int getTabCount();
    public abstract int getHeight();
    public abstract void show();
    public abstract void hide();
    public abstract boolean isShowing();
    public abstract void addOnMenuVisibilityListener(android.app.ActionBar.OnMenuVisibilityListener p0);
    public abstract void removeOnMenuVisibilityListener(android.app.ActionBar.OnMenuVisibilityListener p0);
    public void setHomeButtonEnabled(boolean p0) {}
    public android.content.Context getThemedContext() { return null; }
    public boolean isTitleTruncated() { return false; }
    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable p0) {}
    public void setHomeAsUpIndicator(int p0) {}
    public void setHomeActionContentDescription(java.lang.CharSequence p0) {}
    public void setHomeActionContentDescription(int p0) {}
    public void setHideOnContentScrollEnabled(boolean p0) {}
    public boolean isHideOnContentScrollEnabled() { return false; }
    public int getHideOffset() { return 0; }
    public void setHideOffset(int p0) {}
    public void setElevation(float p0) {}
    public float getElevation() { return 0.0f; }
    public void setDefaultDisplayHomeAsUpEnabled(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setShowHideAnimationEnabled(boolean p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void dispatchMenuVisibilityChanged(boolean p0) {}
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }
    public boolean openOptionsMenu() { return false; }
    public boolean closeOptionsMenu() { return false; }
    public boolean invalidateOptionsMenu() { return false; }
    public boolean onMenuKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean onKeyShortcut(int p0, android.view.KeyEvent p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean collapseActionView() { return false; }
    public void setWindowTitle(java.lang.CharSequence p0) {}
    public void onDestroy() {}

    @java.lang.Deprecated
    public static interface TabListener {
        public void onTabSelected(android.app.ActionBar.Tab p0, android.app.FragmentTransaction p1);
        public void onTabUnselected(android.app.ActionBar.Tab p0, android.app.FragmentTransaction p1);
        public void onTabReselected(android.app.ActionBar.Tab p0, android.app.FragmentTransaction p1);
    }

    @java.lang.Deprecated
    public static abstract class Tab {
        public static final int INVALID_POSITION = -1;
        public Tab() {}
        public abstract int getPosition();
        public abstract android.graphics.drawable.Drawable getIcon();
        public abstract java.lang.CharSequence getText();
        public abstract android.app.ActionBar.Tab setIcon(android.graphics.drawable.Drawable p0);
        public abstract android.app.ActionBar.Tab setIcon(int p0);
        public abstract android.app.ActionBar.Tab setText(java.lang.CharSequence p0);
        public abstract android.app.ActionBar.Tab setText(int p0);
        public abstract android.app.ActionBar.Tab setCustomView(android.view.View p0);
        public abstract android.app.ActionBar.Tab setCustomView(int p0);
        public abstract android.view.View getCustomView();
        public abstract android.app.ActionBar.Tab setTag(java.lang.Object p0);
        public abstract java.lang.Object getTag();
        public abstract android.app.ActionBar.Tab setTabListener(android.app.ActionBar.TabListener p0);
        public abstract void select();
        public abstract android.app.ActionBar.Tab setContentDescription(int p0);
        public abstract android.app.ActionBar.Tab setContentDescription(java.lang.CharSequence p0);
        public abstract java.lang.CharSequence getContentDescription();
    }

    @java.lang.Deprecated
    public static interface OnNavigationListener {
        public boolean onNavigationItemSelected(int p0, long p1);
    }

    public static interface OnMenuVisibilityListener {
        public void onMenuVisibilityChanged(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NavigationMode {
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=-1, to="NONE"), @android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=48, to="TOP"), @android.view.ViewDebug.IntToString(from=80, to="BOTTOM"), @android.view.ViewDebug.IntToString(from=3, to="LEFT"), @android.view.ViewDebug.IntToString(from=5, to="RIGHT"), @android.view.ViewDebug.IntToString(from=8388611, to="START"), @android.view.ViewDebug.IntToString(from=8388613, to="END"), @android.view.ViewDebug.IntToString(from=16, to="CENTER_VERTICAL"), @android.view.ViewDebug.IntToString(from=112, to="FILL_VERTICAL"), @android.view.ViewDebug.IntToString(from=1, to="CENTER_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=7, to="FILL_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=17, to="CENTER"), @android.view.ViewDebug.IntToString(from=119, to="FILL")})
        public int gravity;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.app.ActionBar.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.app.ActionBar.LayoutParams> {
            private boolean mPropertiesMapped;
            private int mLayout_gravityId;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.app.ActionBar.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisplayOptions {
    }
}
