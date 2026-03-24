package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class NotificationActionListLayout extends android.widget.LinearLayout {
    int mNumNotGoneChildren;
    int mNumPriorityChildren;
    public static final java.util.Comparator<com.android.internal.widget.NotificationActionListLayout.TextViewInfo> MEASURE_ORDER_COMPARATOR = null;
    public NotificationActionListLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationActionListLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationActionListLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onMeasure(int p0, int p1) {}
    public void onViewAdded(android.view.View p0) {}
    public void onViewRemoved(android.view.View p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onFinishInflate() {}
    @android.view.RemotableViewMethod
    public void setCollapsibleIndentDimen(int p0) {}
    @android.view.RemotableViewMethod
    public void setEvenlyDividedMode(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setEmphasizedMode(boolean p0) {}
    public int getExtraMeasureHeight() { return 0; }

    private static final class TextViewInfo {
        final boolean mIsPriority = false;
        final int mTextLength = 0;
        final android.widget.TextView mTextView = null;
        TextViewInfo(android.widget.TextView p0) {}
        boolean needsRebuild() { return false; }
    }
}
