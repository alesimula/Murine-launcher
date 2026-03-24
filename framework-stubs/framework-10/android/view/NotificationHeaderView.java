package android.view;

@android.widget.RemoteViews.RemoteView
public class NotificationHeaderView extends android.view.ViewGroup {
    public static final int NO_COLOR = 1;
    private final int mChildMinWidth = 0;
    private final int mContentEndMargin = 0;
    private final int mGravity = 0;
    private android.view.View mAppName;
    private android.view.View mHeaderText;
    private android.view.View mSecondaryHeaderText;
    private android.view.View.OnClickListener mExpandClickListener;
    private android.view.View.OnClickListener mAppOpsListener;
    private android.view.NotificationHeaderView.HeaderTouchListener mTouchListener;
    private android.widget.ImageView mExpandButton;
    private com.android.internal.widget.CachingIconView mIcon;
    private android.view.View mProfileBadge;
    private android.view.View mOverlayIcon;
    private android.view.View mCameraIcon;
    private android.view.View mMicIcon;
    private android.view.View mAppOps;
    private android.view.View mAudiblyAlertedIcon;
    private int mIconColor;
    private int mOriginalNotificationColor;
    private boolean mExpanded;
    private boolean mShowExpandButtonAtEnd;
    private boolean mShowWorkBadgeAtEnd;
    private int mHeaderTextMarginEnd;
    private android.graphics.drawable.Drawable mBackground;
    private boolean mEntireHeaderClickable;
    private boolean mExpandOnlyOnButton;
    private boolean mAcceptAllTouches;
    private int mTotalWidth;
    android.view.ViewOutlineProvider mProvider;
    public NotificationHeaderView(android.content.Context p0) { super((android.content.Context)null); }
    @android.annotation.UnsupportedAppUsage
    public NotificationHeaderView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationHeaderView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationHeaderView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    protected void onMeasure(int p0, int p1) {}
    private int shrinkViewForOverflow(int p0, int p1, android.view.View p2, int p3) { return 0; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public void setHeaderBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    protected void drawableStateChanged() {}
    private void updateTouchListener() {}
    public void setAppOpsOnClickListener(android.view.View.OnClickListener p0) {}
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    @android.view.RemotableViewMethod
    public void setOriginalIconColor(int p0) {}
    public int getOriginalIconColor() { return 0; }
    @android.view.RemotableViewMethod
    public void setOriginalNotificationColor(int p0) {}
    public int getOriginalNotificationColor() { return 0; }
    @android.view.RemotableViewMethod
    public void setExpanded(boolean p0) {}
    public void showAppOpsIcons(android.util.ArraySet<java.lang.Integer> p0) {}
    public void setRecentlyAudiblyAlerted(boolean p0) {}
    private void updateExpandButton() {}
    public void setShowWorkBadgeAtEnd(boolean p0) {}
    public void setShowExpandButtonAtEnd(boolean p0) {}
    public android.view.View getWorkProfileIcon() { return null; }
    public com.android.internal.widget.CachingIconView getIcon() { return null; }
    @android.view.RemotableViewMethod
    public void setHeaderTextMarginEnd(int p0) {}
    public int getHeaderTextMarginEnd() { return 0; }
    private android.view.View getFirstChildNotGone() { return null; }
    public android.widget.ImageView getExpandButton() { return null; }
    public boolean hasOverlappingRendering() { return false; }
    public boolean isInTouchRect(float p0, float p1) { return false; }
    @android.view.RemotableViewMethod
    public void setAcceptAllTouches(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setExpandOnlyOnButton(boolean p0) {}

    public class HeaderTouchListener implements android.view.View.OnTouchListener {
        private final java.util.ArrayList<android.graphics.Rect> mTouchRects = null;
        private android.graphics.Rect mExpandButtonRect;
        private android.graphics.Rect mAppOpsRect;
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
