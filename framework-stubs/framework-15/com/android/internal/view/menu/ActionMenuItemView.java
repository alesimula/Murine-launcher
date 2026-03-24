package com.android.internal.view.menu;

public class ActionMenuItemView extends android.widget.TextView implements com.android.internal.view.menu.MenuView.ItemView, android.view.View.OnClickListener, android.widget.ActionMenuView.ActionMenuChildView {
    public ActionMenuItemView(android.content.Context p0) { super((android.content.Context)null); }
    public ActionMenuItemView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ActionMenuItemView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ActionMenuItemView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void setPadding(int p0, int p1, int p2, int p3) {}
    public com.android.internal.view.menu.MenuItemImpl getItemData() { return null; }
    public void initialize(com.android.internal.view.menu.MenuItemImpl p0, int p1) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void onClick(android.view.View p0) {}
    public void setItemInvoker(com.android.internal.view.menu.MenuBuilder.ItemInvoker p0) {}
    public void setPopupCallback(com.android.internal.view.menu.ActionMenuItemView.PopupCallback p0) {}
    public boolean prefersCondensedTitle() { return false; }
    public void setCheckable(boolean p0) {}
    public void setChecked(boolean p0) {}
    public void setExpandedFormat(boolean p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public boolean hasText() { return false; }
    public void setShortcut(boolean p0, char p1) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean showsIcon() { return false; }
    public boolean needsDividerBefore() { return false; }
    public boolean needsDividerAfter() { return false; }
    protected void onMeasure(int p0, int p1) {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}

    private class ActionMenuItemForwardingListener extends android.widget.ForwardingListener {
        public ActionMenuItemForwardingListener(com.android.internal.view.menu.ActionMenuItemView p0) { super(null); }
        public com.android.internal.view.menu.ShowableListMenu getPopup() { return null; }
        protected boolean onForwardingStarted() { return false; }
    }

    public static abstract class PopupCallback {
        public PopupCallback() {}
        public abstract com.android.internal.view.menu.ShowableListMenu getPopup();
    }
}
