package com.android.internal.view.menu;

public final class IconMenuView extends android.view.ViewGroup implements com.android.internal.view.menu.MenuBuilder.ItemInvoker, com.android.internal.view.menu.MenuView, java.lang.Runnable {
    private static final int ITEM_CAPTION_CYCLE_DELAY = 1000;
    private com.android.internal.view.menu.MenuBuilder mMenu;
    private int mRowHeight;
    private int mMaxRows;
    private int mMaxItems;
    private int mMaxItemsPerRow;
    private int mNumActualItemsShown;
    private android.graphics.drawable.Drawable mHorizontalDivider;
    private int mHorizontalDividerHeight;
    private java.util.ArrayList<android.graphics.Rect> mHorizontalDividerRects;
    private android.graphics.drawable.Drawable mVerticalDivider;
    private int mVerticalDividerWidth;
    private java.util.ArrayList<android.graphics.Rect> mVerticalDividerRects;
    private android.graphics.drawable.Drawable mMoreIcon;
    private android.graphics.drawable.Drawable mItemBackground;
    private int mAnimations;
    private boolean mHasStaleChildren;
    private boolean mMenuBeingLongpressed;
    private boolean mLastChildrenCaptionMode;
    private int[] mLayout;
    private int mLayoutNumRows;
    public IconMenuView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    int getMaxItems() { return 0; }
    private void layoutItems(int p0) {}
    private void layoutItemsUsingGravity(int p0, int p1) {}
    private boolean doItemsFit() { return false; }
    android.graphics.drawable.Drawable getItemBackgroundDrawable() { return null; }
    com.android.internal.view.menu.IconMenuItemView createMoreItemView() { return null; }
    public void initialize(com.android.internal.view.menu.MenuBuilder p0) {}
    private void positionChildren(int p0, int p1) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public boolean invokeItem(com.android.internal.view.menu.MenuItemImpl p0) { return false; }
    public com.android.internal.view.menu.IconMenuView.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    void markStaleChildren() {}
    int getNumActualItemsShown() { return 0; }
    void setNumActualItemsShown(int p0) {}
    public int getWindowAnimations() { return 0; }
    public int[] getLayout() { return null; }
    public int getLayoutNumRows() { return 0; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public void onWindowFocusChanged(boolean p0) {}
    private void setCycleShortcutCaptionMode(boolean p0) {}
    public void run() {}
    private void setChildrenCaptionMode(boolean p0) {}
    private void calculateItemFittingMetadata(int p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        int left;
        int top;
        int right;
        int bottom;
        int desiredWidth;
        int maxNumItemsOnRow;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
    }

    private static class SavedState extends android.view.View.BaseSavedState {
        int focusedPosition;
        public static final android.os.Parcelable.Creator<com.android.internal.view.menu.IconMenuView.SavedState> CREATOR = null;
        public SavedState(android.os.Parcelable p0, int p1) { super((android.os.Parcel)null); }
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
