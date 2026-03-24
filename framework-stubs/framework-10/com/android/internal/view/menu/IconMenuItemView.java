package com.android.internal.view.menu;

public final class IconMenuItemView extends android.widget.TextView implements com.android.internal.view.menu.MenuView.ItemView {
    private static final int NO_ALPHA = 255;
    private com.android.internal.view.menu.IconMenuView mIconMenuView;
    private com.android.internal.view.menu.MenuBuilder.ItemInvoker mItemInvoker;
    private com.android.internal.view.menu.MenuItemImpl mItemData;
    private android.graphics.drawable.Drawable mIcon;
    private int mTextAppearance;
    private android.content.Context mTextAppearanceContext;
    private float mDisabledAlpha;
    private android.graphics.Rect mPositionIconAvailable;
    private android.graphics.Rect mPositionIconOutput;
    private boolean mShortcutCaptionMode;
    private java.lang.String mShortcutCaption;
    private static java.lang.String sPrependShortcutLabel;
    public IconMenuItemView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public IconMenuItemView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public IconMenuItemView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    void initialize(java.lang.CharSequence p0, android.graphics.drawable.Drawable p1) {}
    public void initialize(com.android.internal.view.menu.MenuItemImpl p0, int p1) {}
    public void setItemData(com.android.internal.view.menu.MenuItemImpl p0) {}
    public boolean performClick() { return false; }
    public void setTitle(java.lang.CharSequence p0) {}
    void setCaptionMode(boolean p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setItemInvoker(com.android.internal.view.menu.MenuBuilder.ItemInvoker p0) {}
    @android.view.ViewDebug.CapturedViewProperty(retrieveReturn=true)
    public com.android.internal.view.menu.MenuItemImpl getItemData() { return null; }
    public void setVisibility(int p0) {}
    @android.annotation.UnsupportedAppUsage
    void setIconMenuView(com.android.internal.view.menu.IconMenuView p0) {}
    protected void drawableStateChanged() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    @android.annotation.UnsupportedAppUsage
    com.android.internal.view.menu.IconMenuView.LayoutParams getTextAppropriateLayoutParams() { return null; }
    private void positionIcon() {}
    public void setCheckable(boolean p0) {}
    public void setChecked(boolean p0) {}
    public void setShortcut(boolean p0, char p1) {}
    public boolean prefersCondensedTitle() { return false; }
    public boolean showsIcon() { return false; }
}
