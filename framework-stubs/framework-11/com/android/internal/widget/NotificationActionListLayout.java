package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class NotificationActionListLayout extends android.widget.LinearLayout {
    private final int mGravity = 0;
    private int mTotalWidth;
    private java.util.ArrayList<android.util.Pair<java.lang.Integer, android.widget.TextView>> mMeasureOrderTextViews;
    private java.util.ArrayList<android.view.View> mMeasureOrderOther;
    private boolean mEmphasizedMode;
    private int mDefaultPaddingBottom;
    private int mDefaultPaddingTop;
    private int mEmphasizedHeight;
    private int mRegularHeight;
    public static final java.util.Comparator<android.util.Pair<java.lang.Integer, android.widget.TextView>> MEASURE_ORDER_COMPARATOR = null;
    public NotificationActionListLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationActionListLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationActionListLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onMeasure(int p0, int p1) {}
    private void rebuildMeasureOrder(int p0, int p1) {}
    private void clearMeasureOrder() {}
    public void onViewAdded(android.view.View p0) {}
    public void onViewRemoved(android.view.View p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onFinishInflate() {}
    private void updateHeights() {}
    @android.view.RemotableViewMethod
    public void setEmphasizedMode(boolean p0) {}
    public int getExtraMeasureHeight() { return 0; }
}
