package android.view;

@android.widget.RemoteViews.RemoteView
public class NotificationTopLineView extends android.view.ViewGroup {
    public NotificationTopLineView(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationTopLineView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationTopLineView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationTopLineView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public void setFeedbackOnClickListener(android.view.View.OnClickListener p0) {}
    public void setHeaderTextMarginEnd(int p0) {}
    public int getHeaderTextMarginEnd() { return 0; }
    public void setPaddingStart(int p0) {}
    public boolean hasOverlappingRendering() { return false; }
    public boolean isTitlePresent() { return false; }
    public boolean isInTouchRect(float p0, float p1) { return false; }
    public boolean onTouchUp(float p0, float p1, float p2, float p3) { return false; }

    private class HeaderTouchListener implements android.view.View.OnTouchListener {
        HeaderTouchListener(android.view.NotificationTopLineView p0) {}
        public void bindTouchRects() {}
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    }

    private final class OverflowAdjuster {
        android.view.NotificationTopLineView.OverflowAdjuster resetForOverflow(int p0, int p1) { return null; }
        android.view.NotificationTopLineView.OverflowAdjuster adjust(android.view.View p0, android.view.View p1, int p2) { return null; }
        void finish() {}
    }
}
