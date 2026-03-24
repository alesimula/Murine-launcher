package android.view;

@android.widget.RemoteViews.RemoteView
public class NotificationHeaderView extends android.widget.RelativeLayout {
    android.view.ViewOutlineProvider mProvider;
    public NotificationHeaderView(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationHeaderView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationHeaderView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationHeaderView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    public void setHeaderBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    protected void drawableStateChanged() {}
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    public void setTopLineExtraMarginEnd(int p0) {}
    @android.view.RemotableViewMethod
    public void setTopLineExtraMarginEndDp(float p0) {}
    @android.view.RemotableViewMethod
    public void centerTopLine(boolean p0) {}
    public android.view.NotificationTopLineView getTopLineView() { return null; }
    public com.android.internal.widget.NotificationExpandButton getExpandButton() { return null; }
    protected void onMeasure(int p0, int p1) {}
    public float getTopLineTranslation() { return 0.0f; }
    public float getExpandButtonTranslation() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void styleTextAsTitle(boolean p0) {}
    public boolean hasOverlappingRendering() { return false; }
    public boolean isInTouchRect(float p0, float p1) { return false; }
    @android.view.RemotableViewMethod
    public void setAcceptAllTouches(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setExpandOnlyOnButton(boolean p0) {}

    public class HeaderTouchListener implements android.view.View.OnTouchListener {
        public HeaderTouchListener(android.view.NotificationHeaderView p0) {}
        public void bindTouchRects() {}
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    }
}
