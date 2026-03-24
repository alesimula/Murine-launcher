package android.view;

@android.widget.RemoteViews.RemoteView
public class NotificationTopLineView extends android.view.ViewGroup {
    private final android.view.NotificationTopLineView.OverflowAdjuster mOverflowAdjuster = null;
    private final int mGravityY = 0;
    private final int mChildMinWidth = 0;
    private final int mChildHideWidth = 0;
    private android.view.View mAppName;
    private android.view.View mTitle;
    private android.view.View mHeaderText;
    private android.view.View mHeaderTextDivider;
    private android.view.View mSecondaryHeaderText;
    private android.view.View mSecondaryHeaderTextDivider;
    private android.view.View.OnClickListener mFeedbackListener;
    private android.view.NotificationTopLineView.HeaderTouchListener mTouchListener;
    private android.view.View mFeedbackIcon;
    private int mHeaderTextMarginEnd;
    private java.util.Set<android.view.View> mViewsToDisappear;
    private int mMaxAscent;
    private int mMaxDescent;
    public NotificationTopLineView(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationTopLineView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationTopLineView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationTopLineView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    private void updateTouchListener() {}
    public void setFeedbackOnClickListener(android.view.View.OnClickListener p0) {}
    public void setHeaderTextMarginEnd(int p0) {}
    public int getHeaderTextMarginEnd() { return 0; }
    public void setPaddingStart(int p0) {}
    private android.view.View getFirstChildNotGone() { return null; }
    public boolean hasOverlappingRendering() { return false; }
    public boolean isInTouchRect(float p0, float p1) { return false; }
    public boolean onTouchUp(float p0, float p1, float p2, float p3) { return false; }

    private class HeaderTouchListener implements android.view.View.OnTouchListener {
        private android.graphics.Rect mFeedbackRect;
        private int mTouchSlop;
        private boolean mTrackGesture;
        private float mDownX;
        private float mDownY;
        HeaderTouchListener(android.view.NotificationTopLineView p0) {}
        public void bindTouchRects() {}
        private android.graphics.Rect getRectAroundView(android.view.View p0) { return null; }
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
        private boolean onTouchUp(float p0, float p1, float p2, float p3) { return false; }
        private boolean isInside(float p0, float p1) { return false; }
    }

    private final class OverflowAdjuster {
        private int mOverflow;
        private int mHeightSpec;
        private android.view.View mRegrowView;
        private OverflowAdjuster(android.view.NotificationTopLineView p0) {}
        android.view.NotificationTopLineView.OverflowAdjuster resetForOverflow(int p0, int p1) { return null; }
        android.view.NotificationTopLineView.OverflowAdjuster adjust(android.view.View p0, android.view.View p1, int p2) { return null; }
        void finish() {}
        private int getHorizontalMargins(android.view.View p0) { return 0; }
    }
}
