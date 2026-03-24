package com.android.internal.widget;

public interface DecorContentParent {
    public void setWindowCallback(android.view.Window.Callback p0);
    public void setWindowTitle(java.lang.CharSequence p0);
    public java.lang.CharSequence getTitle();
    public void initFeature(int p0);
    public void setUiOptions(int p0);
    public boolean hasIcon();
    public boolean hasLogo();
    public void setIcon(int p0);
    public void setIcon(android.graphics.drawable.Drawable p0);
    public void setLogo(int p0);
    public boolean canShowOverflowMenu();
    public boolean isOverflowMenuShowing();
    public boolean isOverflowMenuShowPending();
    public boolean showOverflowMenu();
    public boolean hideOverflowMenu();
    public void setMenuPrepared();
    public void setMenu(android.view.Menu p0, com.android.internal.view.menu.MenuPresenter.Callback p1);
    public void saveToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> p0);
    public void restoreToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> p0);
    public void dismissPopups();
    public void notifyContentChanged();
}
