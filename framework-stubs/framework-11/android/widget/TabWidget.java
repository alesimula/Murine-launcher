package android.widget;

@java.lang.Deprecated
public class TabWidget extends android.widget.LinearLayout implements android.view.View.OnFocusChangeListener {
    private final android.graphics.Rect mBounds = null;
    private android.widget.TabWidget.OnTabSelectionChanged mSelectionChangedListener;
    private int mSelectedTab;
    private android.graphics.drawable.Drawable mLeftStrip;
    private android.graphics.drawable.Drawable mRightStrip;
    private boolean mDrawBottomStrips;
    private boolean mStripMoved;
    private int mImposedTabsHeight;
    private int[] mImposedTabWidths;
    public TabWidget(android.content.Context p0) { super((android.content.Context)null); }
    public TabWidget(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TabWidget(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TabWidget(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }
    void measureChildBeforeLayout(android.view.View p0, int p1, int p2, int p3, int p4, int p5) {}
    void measureHorizontal(int p0, int p1) {}
    public android.view.View getChildTabViewAt(int p0) { return null; }
    public int getTabCount() { return 0; }
    public void setDividerDrawable(android.graphics.drawable.Drawable p0) {}
    public void setDividerDrawable(int p0) {}
    public void setLeftStripDrawable(android.graphics.drawable.Drawable p0) {}
    public void setLeftStripDrawable(int p0) {}
    public android.graphics.drawable.Drawable getLeftStripDrawable() { return null; }
    public void setRightStripDrawable(android.graphics.drawable.Drawable p0) {}
    public void setRightStripDrawable(int p0) {}
    public android.graphics.drawable.Drawable getRightStripDrawable() { return null; }
    public void setStripEnabled(boolean p0) {}
    public boolean isStripEnabled() { return false; }
    public void childDrawableStateChanged(android.view.View p0) {}
    public void dispatchDraw(android.graphics.Canvas p0) {}
    public void setCurrentTab(int p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void focusCurrentTab(int p0) {}
    public void setEnabled(boolean p0) {}
    public void addView(android.view.View p0) {}
    public void removeAllViews() {}
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    void setTabSelectionListener(android.widget.TabWidget.OnTabSelectionChanged p0) {}
    public void onFocusChange(android.view.View p0, boolean p1) {}

    static interface OnTabSelectionChanged {
        public void onTabSelectionChanged(int p0, boolean p1);
    }

    private class TabClickListener implements android.view.View.OnClickListener {
        private final int mTabIndex = 0;
        private TabClickListener(android.widget.TabWidget p0, int p1) {}
        public void onClick(android.view.View p0) {}
    }
}
