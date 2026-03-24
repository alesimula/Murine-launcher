package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class MessagingLinearLayout extends android.view.ViewGroup {
    private int mSpacing;
    private int mMaxDisplayedLines;
    private com.android.internal.widget.MessagingLayout mMessagingLayout;
    public MessagingLinearLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected boolean drawChild(android.graphics.Canvas p0, android.view.View p1, long p2) { return false; }
    public com.android.internal.widget.MessagingLinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected com.android.internal.widget.MessagingLinearLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    protected com.android.internal.widget.MessagingLinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public static boolean isGone(android.view.View p0) { return false; }
    @android.view.RemotableViewMethod
    public void setMaxDisplayedLines(int p0) {}
    public void setMessagingLayout(com.android.internal.widget.MessagingLayout p0) {}
    public com.android.internal.widget.MessagingLayout getMessagingLayout() { return null; }

    public static interface MessagingChild {
        public static final int MEASURED_NORMAL = 0;
        public static final int MEASURED_SHORTENED = 1;
        public static final int MEASURED_TOO_SMALL = 2;
        public int getMeasuredType();
        public int getConsumedLines();
        public void setMaxDisplayedLines(int p0);
        public void hideAnimated();
        public boolean isHidingAnimated();
        default public int getExtraSpacing() { return 0; }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public boolean hide;
        public boolean visibleBefore;
        public int lastVisibleHeight;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
    }
}
