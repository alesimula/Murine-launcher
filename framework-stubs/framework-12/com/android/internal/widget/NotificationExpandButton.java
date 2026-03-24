package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class NotificationExpandButton extends android.widget.FrameLayout {
    private android.view.View mPillView;
    private android.widget.TextView mNumberView;
    private android.widget.ImageView mIconView;
    private boolean mExpanded;
    private int mNumber;
    private int mDefaultPillColor;
    private int mDefaultTextColor;
    private int mHighlightPillColor;
    private int mHighlightTextColor;
    public NotificationExpandButton(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationExpandButton(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationExpandButton(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationExpandButton(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    public void getBoundsOnScreen(android.graphics.Rect p0, boolean p1) {}
    public boolean pointInView(float p0, float p1, float p2) { return false; }
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    @android.view.RemotableViewMethod
    public void setExpanded(boolean p0) {}
    private void updateExpandedState() {}
    private void updateNumber() {}
    private void updateColors() {}
    private boolean shouldShowNumber() { return false; }
    @android.view.RemotableViewMethod
    public void setDefaultTextColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setDefaultPillColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setHighlightTextColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setHighlightPillColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setNumber(int p0) {}
}
