package android.widget;

public class ActionMenuPresenter extends com.android.internal.view.menu.BaseMenuPresenter implements android.view.ActionProvider.SubUiVisibilityListener {
    final android.widget.ActionMenuPresenter.PopupPresenterCallback mPopupPresenterCallback = null;
    int mOpenSubMenuId;
    public ActionMenuPresenter(android.content.Context p0) { super(null, 0, 0); }
    public void initForMenu(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void setWidthLimit(int p0, boolean p1) {}
    public void setReserveOverflow(boolean p0) {}
    public void setItemLimit(int p0) {}
    public void setExpandedActionViewsExclusive(boolean p0) {}
    public void setOverflowIcon(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getOverflowIcon() { return null; }
    public com.android.internal.view.menu.MenuView getMenuView(android.view.ViewGroup p0) { return null; }
    public android.view.View getItemView(com.android.internal.view.menu.MenuItemImpl p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public void bindItemView(com.android.internal.view.menu.MenuItemImpl p0, com.android.internal.view.menu.MenuView.ItemView p1) {}
    public boolean shouldIncludeItem(int p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
    public void updateMenuView(boolean p0) {}
    public boolean filterLeftoverView(android.view.ViewGroup p0, int p1) { return false; }
    public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
    public boolean showOverflowMenu() { return false; }
    public boolean hideOverflowMenu() { return false; }
    public boolean dismissPopupMenus() { return false; }
    public boolean hideSubMenus() { return false; }
    public boolean isOverflowMenuShowing() { return false; }
    public boolean isOverflowMenuShowPending() { return false; }
    public boolean isOverflowReserved() { return false; }
    public boolean flagActionItems() { return false; }
    public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void onSubUiVisibilityChanged(boolean p0) {}
    public void setMenuView(android.widget.ActionMenuView p0) {}

    private class ActionButtonSubmenu extends com.android.internal.view.menu.MenuPopupHelper {
        public ActionButtonSubmenu(android.widget.ActionMenuPresenter p0, android.content.Context p1, com.android.internal.view.menu.SubMenuBuilder p2, android.view.View p3) { super((android.content.Context)null, (com.android.internal.view.menu.MenuBuilder)null); }
        protected void onDismiss() {}
    }

    private class ActionMenuPopupCallback extends com.android.internal.view.menu.ActionMenuItemView.PopupCallback {
        public com.android.internal.view.menu.ShowableListMenu getPopup() { return null; }
    }

    private static class ItemAnimationInfo {
        int id;
        android.widget.ActionMenuPresenter.MenuItemLayoutInfo menuItemLayoutInfo;
        android.animation.Animator animator;
        int animType;
        static final int MOVE = 0;
        static final int FADE_IN = 1;
        static final int FADE_OUT = 2;
        ItemAnimationInfo(int p0, android.widget.ActionMenuPresenter.MenuItemLayoutInfo p1, android.animation.Animator p2, int p3) {}
    }

    private static class MenuItemLayoutInfo {
        android.view.View view;
        int left;
        int top;
        MenuItemLayoutInfo(android.view.View p0, boolean p1) {}
    }

    private class OpenOverflowRunnable implements java.lang.Runnable {
        public OpenOverflowRunnable(android.widget.ActionMenuPresenter p0, android.widget.ActionMenuPresenter.OverflowPopup p1) {}
        public void run() {}
    }

    private class OverflowMenuButton extends android.widget.ImageButton implements android.widget.ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(android.widget.ActionMenuPresenter p0, android.content.Context p1) { super((android.content.Context)null); }
        public boolean performClick() { return false; }
        public boolean needsDividerBefore() { return false; }
        public boolean needsDividerAfter() { return false; }
        public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
        protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    }

    private class OverflowPopup extends com.android.internal.view.menu.MenuPopupHelper {
        public OverflowPopup(android.widget.ActionMenuPresenter p0, android.content.Context p1, com.android.internal.view.menu.MenuBuilder p2, android.view.View p3, boolean p4) { super((android.content.Context)null, (com.android.internal.view.menu.MenuBuilder)null); }
        protected void onDismiss() {}
    }

    private class PopupPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    }

    private static class SavedState implements android.os.Parcelable {
        public int openSubMenuId;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.widget.ActionMenuPresenter.SavedState> CREATOR = null;
        SavedState() {}
        SavedState(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
