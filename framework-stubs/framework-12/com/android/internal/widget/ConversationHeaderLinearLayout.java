package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class ConversationHeaderLinearLayout extends android.widget.LinearLayout {
    public ConversationHeaderLinearLayout(android.content.Context p0) { super((android.content.Context)null); }
    public ConversationHeaderLinearLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ConversationHeaderLinearLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    private int calculateTotalChildLength() { return 0; }
    protected void onMeasure(int p0, int p1) {}
    private void remeasureChangedChildren(java.util.List<com.android.internal.widget.ConversationHeaderLinearLayout.ViewInfo> p0) {}
    void balanceViewWidths(java.util.List<com.android.internal.widget.ConversationHeaderLinearLayout.ViewInfo> p0, float p1, int p2) {}

    static class ViewInfo {
        final android.view.View mView = null;
        final float mWeight = 0.0f;
        final int mStartWidth = 0;
        int mWidth;
        ViewInfo(android.view.View p0) {}
    }
}
