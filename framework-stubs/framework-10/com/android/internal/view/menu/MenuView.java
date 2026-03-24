package com.android.internal.view.menu;

public interface MenuView {
    public void initialize(com.android.internal.view.menu.MenuBuilder p0);
    @android.annotation.UnsupportedAppUsage
    public int getWindowAnimations();

    public static interface ItemView {
        public void initialize(com.android.internal.view.menu.MenuItemImpl p0, int p1);
        @android.annotation.UnsupportedAppUsage
        public com.android.internal.view.menu.MenuItemImpl getItemData();
        public void setTitle(java.lang.CharSequence p0);
        public void setEnabled(boolean p0);
        public void setCheckable(boolean p0);
        public void setChecked(boolean p0);
        public void setShortcut(boolean p0, char p1);
        public void setIcon(android.graphics.drawable.Drawable p0);
        public boolean prefersCondensedTitle();
        public boolean showsIcon();
    }
}
