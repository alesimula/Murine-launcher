package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class ImageFloatingTextView extends android.widget.TextView {
    private int mIndentLines;
    private int mResolvedDirection;
    private int mMaxLinesForHeight;
    private int mLayoutMaxLines;
    private int mImageEndMargin;
    public ImageFloatingTextView(android.content.Context p0) { super((android.content.Context)null); }
    public ImageFloatingTextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ImageFloatingTextView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ImageFloatingTextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected android.text.Layout makeSingleLayout(int p0, android.text.BoringLayout.Metrics p1, int p2, android.text.Layout.Alignment p3, boolean p4, android.text.TextUtils.TruncateAt p5, boolean p6) { return null; }
    @android.view.RemotableViewMethod
    public void setImageEndMargin(int p0) {}
    protected void onMeasure(int p0, int p1) {}
    public void onRtlPropertiesChanged(int p0) {}
    @android.view.RemotableViewMethod
    public void setHasImage(boolean p0) {}
    public boolean setNumIndentLines(int p0) { return false; }
}
