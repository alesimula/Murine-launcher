package com.android.internal.widget;

public class ButtonBarLayout extends android.widget.LinearLayout {
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize;
    private int mMinimumHeight;
    public ButtonBarLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void setAllowStacking(boolean p0) {}
    protected void onMeasure(int p0, int p1) {}
    private int getNextVisibleChildIndex(int p0) { return 0; }
    public int getMinimumHeight() { return 0; }
    private void setStacked(boolean p0) {}
    private boolean isStacked() { return false; }
}
