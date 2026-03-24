package android.widget;

class FastScroller {
    private static final int DURATION_FADE_OUT = 300;
    private static final int DURATION_FADE_IN = 150;
    private static final int DURATION_CROSS_FADE = 50;
    private static final int DURATION_RESIZE = 100;
    private static final long FADE_TIMEOUT = 1500L;
    private static final int MIN_PAGES = 4;
    private static final int STATE_NONE = 0;
    private static final int STATE_VISIBLE = 1;
    private static final int STATE_DRAGGING = 2;
    private static final int OVERLAY_FLOATING = 0;
    private static final int OVERLAY_AT_THUMB = 1;
    private static final int OVERLAY_ABOVE_THUMB = 2;
    private static final int THUMB_POSITION_MIDPOINT = 0;
    private static final int THUMB_POSITION_INSIDE = 1;
    private static final int PREVIEW_LEFT = 0;
    private static final int PREVIEW_RIGHT = 1;
    private static final long TAP_TIMEOUT = Long.valueOf(0L);
    private final android.graphics.Rect mTempBounds = null;
    private final android.graphics.Rect mTempMargins = null;
    @android.annotation.UnsupportedAppUsage
    private final android.graphics.Rect mContainerRect = null;
    private final android.widget.AbsListView mList = null;
    private final android.view.ViewGroupOverlay mOverlay = null;
    private final android.widget.TextView mPrimaryText = null;
    private final android.widget.TextView mSecondaryText = null;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.ImageView mThumbImage = null;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.ImageView mTrackImage = null;
    private final android.view.View mPreviewImage = null;
    private final int[] mPreviewResId = null;
    @android.annotation.UnsupportedAppUsage
    private final int mMinimumTouchTarget = 0;
    private int mPreviewPadding;
    private int mPreviewMinWidth;
    private int mPreviewMinHeight;
    private int mThumbMinWidth;
    private int mThumbMinHeight;
    private float mTextSize;
    private android.content.res.ColorStateList mTextColor;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mThumbDrawable;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mTrackDrawable;
    private int mTextAppearance;
    private int mThumbPosition;
    private float mThumbOffset;
    private float mThumbRange;
    private int mWidth;
    private android.animation.AnimatorSet mDecorAnimation;
    private android.animation.AnimatorSet mPreviewAnimation;
    private boolean mShowingPrimary;
    private boolean mScrollCompleted;
    private int mFirstVisibleItem;
    @android.annotation.UnsupportedAppUsage
    private int mHeaderCount;
    private int mCurrentSection;
    private int mScrollbarPosition;
    @android.annotation.UnsupportedAppUsage
    private boolean mLongList;
    private java.lang.Object[] mSections;
    private boolean mUpdatingLayout;
    private int mState;
    private boolean mShowingPreview;
    private android.widget.Adapter mListAdapter;
    private android.widget.SectionIndexer mSectionIndexer;
    private boolean mLayoutFromRight;
    private boolean mEnabled;
    private boolean mAlwaysShow;
    private int mOverlayPosition;
    private int mScrollBarStyle;
    private boolean mMatchDragPosition;
    private float mInitialTouchY;
    private long mPendingDrag;
    private int mScaledTouchSlop;
    private int mOldItemCount;
    private int mOldChildCount;
    private final java.lang.Runnable mDeferHide = null;
    private final android.animation.Animator.AnimatorListener mSwitchPrimaryListener = null;
    private static android.util.Property<android.view.View, java.lang.Integer> LEFT;
    private static android.util.Property<android.view.View, java.lang.Integer> TOP;
    private static android.util.Property<android.view.View, java.lang.Integer> RIGHT;
    private static android.util.Property<android.view.View, java.lang.Integer> BOTTOM;
    @android.annotation.UnsupportedAppUsage
    public FastScroller(android.widget.AbsListView p0, int p1) {}
    private void updateAppearance() {}
    public void setStyle(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void remove() {}
    public void setEnabled(boolean p0) {}
    public boolean isEnabled() { return false; }
    public void setAlwaysShow(boolean p0) {}
    public boolean isAlwaysShowEnabled() { return false; }
    private void onStateDependencyChanged(boolean p0) {}
    public void setScrollBarStyle(int p0) {}
    public void stop() {}
    public void setScrollbarPosition(int p0) {}
    public int getWidth() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void onItemCountChanged(int p0, int p1) {}
    private void updateLongList(int p0, int p1) {}
    private android.widget.TextView createPreviewTextView(android.content.Context p0) { return null; }
    public void updateLayout() {}
    private void applyLayout(android.view.View p0, android.graphics.Rect p1) {}
    private void measurePreview(android.view.View p0, android.graphics.Rect p1) {}
    private void measureViewToSide(android.view.View p0, android.view.View p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    private void measureFloating(android.view.View p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
    private void updateContainerRect() {}
    private void layoutThumb() {}
    private void layoutTrack() {}
    private void updateOffsetAndRange() {}
    @android.annotation.UnsupportedAppUsage
    private void setState(int p0) {}
    private void refreshDrawablePressedState() {}
    private void transitionToHidden() {}
    private void transitionToVisible() {}
    private void transitionToDragging() {}
    private void postAutoHide() {}
    public void onScroll(int p0, int p1, int p2) {}
    private void getSectionsFromIndexer() {}
    public void onSectionsChanged() {}
    private void scrollTo(float p0) {}
    private boolean transitionPreviewLayout(int p0) { return false; }
    private void setThumbPos(float p0) {}
    private float getPosFromMotionEvent(float p0) { return 0.0f; }
    private float getPosFromItemCount(int p0, int p1, int p2) { return 0.0f; }
    private void cancelFling() {}
    private void cancelPendingDrag() {}
    private void startPendingDrag() {}
    private void beginDrag() {}
    @android.annotation.UnsupportedAppUsage
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onInterceptHoverEvent(android.view.MotionEvent p0) { return false; }
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private boolean isPointInside(float p0, float p1) { return false; }
    private boolean isPointInsideX(float p0) { return false; }
    private boolean isPointInsideY(float p0) { return false; }
    private static android.animation.Animator groupAnimatorOfFloat(android.util.Property<android.view.View, java.lang.Float> p0, float p1, android.view.View... p2) { return null; }
    private static android.animation.Animator animateScaleX(android.view.View p0, float p1) { return null; }
    private static android.animation.Animator animateAlpha(android.view.View p0, float p1) { return null; }
    private static android.animation.Animator animateBounds(android.view.View p0, android.graphics.Rect p1) { return null; }
}
