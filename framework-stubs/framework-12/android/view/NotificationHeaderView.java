package android.view;

@android.widget.RemoteViews.RemoteView
public class NotificationHeaderView extends android.widget.RelativeLayout {
    private final int mTouchableHeight = 0;
    private android.view.View.OnClickListener mExpandClickListener;
    private android.view.NotificationHeaderView.HeaderTouchListener mTouchListener;
    private android.view.NotificationTopLineView mTopLineView;
    private com.android.internal.widget.NotificationExpandButton mExpandButton;
    private android.view.View mAltExpandTarget;
    private com.android.internal.widget.CachingIconView mIcon;
    private android.graphics.drawable.Drawable mBackground;
    private boolean mEntireHeaderClickable;
    private boolean mExpandOnlyOnButton;
    private boolean mAcceptAllTouches;
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
    private void updateTouchListener() {}
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    public void setTopLineExtraMarginEnd(int p0) {}
    @android.view.RemotableViewMethod
    public void setTopLineExtraMarginEndDp(float p0) {}
    @android.view.RemotableViewMethod
    public void styleTextAsTitle(boolean p0) {}
    private android.view.View getFirstChildNotGone() { return null; }
    public boolean hasOverlappingRendering() { return false; }
    public boolean isInTouchRect(float p0, float p1) { return false; }
    @android.view.RemotableViewMethod
    public void setAcceptAllTouches(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setExpandOnlyOnButton(boolean p0) {}

    public class HeaderTouchListener implements android.view.View.OnTouchListener {
        private final java.util.ArrayList<android.graphics.Rect> mTouchRects = null;
        private android.graphics.Rect mExpandButtonRect;
        private android.graphics.Rect mAltExpandTargetRect;
        private int mTouchSlop;
        private boolean mTrackGesture;
        private float mDownX;
        private float mDownY;
        public HeaderTouchListener(android.view.NotificationHeaderView p0) {}
        public void bindTouchRects() {}
        private void addWidthRect() {}
        private android.graphics.Rect addRectAroundView(android.view.View p0) { return null; }
        private android.graphics.Rect getRectAroundView(android.view.View p0) { return null; }
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
        private boolean isInside(float p0, float p1) { return false; }
    }
}
