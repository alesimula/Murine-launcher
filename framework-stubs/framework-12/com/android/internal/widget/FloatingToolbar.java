package com.android.internal.widget;

public final class FloatingToolbar {
    public static final java.lang.String FLOATING_TOOLBAR_TAG = "floating_toolbar";
    private static final android.view.MenuItem.OnMenuItemClickListener NO_OP_MENUITEM_CLICK_LISTENER = null;
    private final android.content.Context mContext = null;
    private final android.view.Window mWindow = null;
    private final com.android.internal.widget.FloatingToolbar.FloatingToolbarPopup mPopup = null;
    private final android.graphics.Rect mContentRect = null;
    private final android.graphics.Rect mPreviousContentRect = null;
    private android.view.Menu mMenu;
    private android.view.MenuItem.OnMenuItemClickListener mMenuItemClickListener;
    private int mSuggestedWidth;
    private boolean mWidthChanged;
    private final android.view.View.OnLayoutChangeListener mOrientationChangeHandler = null;
    private final java.util.Comparator<android.view.MenuItem> mMenuItemComparator = null;
    public FloatingToolbar(android.view.Window p0) {}
    public com.android.internal.widget.FloatingToolbar setMenu(android.view.Menu p0) { return null; }
    public com.android.internal.widget.FloatingToolbar setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener p0) { return null; }
    public com.android.internal.widget.FloatingToolbar setContentRect(android.graphics.Rect p0) { return null; }
    public com.android.internal.widget.FloatingToolbar setSuggestedWidth(int p0) { return null; }
    public com.android.internal.widget.FloatingToolbar show() { return null; }
    public com.android.internal.widget.FloatingToolbar updateLayout() { return null; }
    public void dismiss() {}
    public void hide() {}
    public boolean isShowing() { return false; }
    public boolean isHidden() { return false; }
    public void setOutsideTouchable(boolean p0, android.widget.PopupWindow.OnDismissListener p1) {}
    private void doShow() {}
    private static java.util.List<android.view.MenuItem> getVisibleAndEnabledMenuItems(android.view.Menu p0) { return null; }
    private void registerOrientationHandler() {}
    private void unregisterOrientationHandler() {}
    private static android.view.View createMenuItemButton(android.content.Context p0, android.view.MenuItem p1, int p2, boolean p3) { return null; }
    private static void updateMenuItemButton(android.view.View p0, android.view.MenuItem p1, int p2, boolean p3) {}
    private static android.view.ViewGroup createContentContainer(android.content.Context p0) { return null; }
    private static android.widget.PopupWindow createPopupWindow(android.view.ViewGroup p0) { return null; }
    private static android.animation.AnimatorSet createEnterAnimation(android.view.View p0) { return null; }
    private static android.animation.AnimatorSet createExitAnimation(android.view.View p0, int p1, android.animation.Animator.AnimatorListener p2) { return null; }
    private static android.content.Context applyDefaultTheme(android.content.Context p0) { return null; }

    private static final class FloatingToolbarPopup {
        private static final int MIN_OVERFLOW_SIZE = 2;
        private static final int MAX_OVERFLOW_SIZE = 4;
        private final android.content.Context mContext = null;
        private final android.view.View mParent = null;
        private final android.widget.PopupWindow mPopupWindow = null;
        private final int mMarginHorizontal = 0;
        private final int mMarginVertical = 0;
        private final android.view.ViewGroup mContentContainer = null;
        private final android.view.ViewGroup mMainPanel = null;
        private final com.android.internal.widget.FloatingToolbar.FloatingToolbarPopup.OverflowPanel mOverflowPanel = null;
        private final android.widget.ImageButton mOverflowButton = null;
        private final android.graphics.drawable.Drawable mArrow = null;
        private final android.graphics.drawable.Drawable mOverflow = null;
        private final android.graphics.drawable.AnimatedVectorDrawable mToArrow = null;
        private final android.graphics.drawable.AnimatedVectorDrawable mToOverflow = null;
        private final com.android.internal.widget.FloatingToolbar.FloatingToolbarPopup.OverflowPanelViewHelper mOverflowPanelViewHelper = null;
        private final android.view.animation.Interpolator mLogAccelerateInterpolator = null;
        private final android.view.animation.Interpolator mFastOutSlowInInterpolator = null;
        private final android.view.animation.Interpolator mLinearOutSlowInInterpolator = null;
        private final android.view.animation.Interpolator mFastOutLinearInInterpolator = null;
        private final android.animation.AnimatorSet mShowAnimation = null;
        private final android.animation.AnimatorSet mDismissAnimation = null;
        private final android.animation.AnimatorSet mHideAnimation = null;
        private final android.view.animation.AnimationSet mOpenOverflowAnimation = null;
        private final android.view.animation.AnimationSet mCloseOverflowAnimation = null;
        private final android.view.animation.Animation.AnimationListener mOverflowAnimationListener = null;
        private final android.graphics.Rect mViewPortOnScreen = null;
        private final android.graphics.Point mCoordsOnWindow = null;
        private final int[] mTmpCoords = null;
        private final android.graphics.Region mTouchableRegion = null;
        private final android.view.ViewTreeObserver.OnComputeInternalInsetsListener mInsetsComputer = null;
        private final int mLineHeight = 0;
        private final int mIconTextSpacing = 0;
        private final java.lang.Runnable mPreparePopupContentRTLHelper = null;
        private boolean mDismissed;
        private boolean mHidden;
        private final android.util.Size mOverflowButtonSize = null;
        private android.util.Size mOverflowPanelSize;
        private android.util.Size mMainPanelSize;
        private final java.util.Map<com.android.internal.widget.FloatingToolbar.MenuItemRepr, android.view.MenuItem> mMenuItems = null;
        private android.view.MenuItem.OnMenuItemClickListener mOnMenuItemClickListener;
        private final android.view.View.OnClickListener mMenuItemButtonOnClickListener = null;
        private boolean mOpenOverflowUpwards;
        private boolean mIsOverflowOpen;
        private int mTransitionDurationScale;
        public FloatingToolbarPopup(android.content.Context p0, android.view.View p1) {}
        public boolean setOutsideTouchable(boolean p0, android.widget.PopupWindow.OnDismissListener p1) { return false; }
        public void layoutMenuItems(java.util.List<android.view.MenuItem> p0, android.view.MenuItem.OnMenuItemClickListener p1, int p2) {}
        public void updateMenuItems(java.util.List<android.view.MenuItem> p0, android.view.MenuItem.OnMenuItemClickListener p1) {}
        public boolean isLayoutRequired(java.util.List<android.view.MenuItem> p0) { return false; }
        public void show(android.graphics.Rect p0) {}
        public void dismiss() {}
        public void hide() {}
        public boolean isShowing() { return false; }
        public boolean isHidden() { return false; }
        public void updateCoordinates(android.graphics.Rect p0) {}
        private void refreshCoordinatesAndOverflowDirection(android.graphics.Rect p0) {}
        private void runShowAnimation() {}
        private void runDismissAnimation() {}
        private void runHideAnimation() {}
        private void cancelDismissAndHideAnimations() {}
        private void cancelOverflowAnimations() {}
        private void openOverflow() {}
        private void closeOverflow() {}
        private void setPanelsStatesAtRestingPosition() {}
        private void updateOverflowHeight(int p0) {}
        private void updatePopupSize() {}
        private void refreshViewPort() {}
        private int getAdjustedToolbarWidth(int p0) { return 0; }
        private void setZeroTouchableSurface() {}
        private void setContentAreaAsTouchableSurface() {}
        private void setTouchableSurfaceInsetsComputer() {}
        private boolean isInRTLMode() { return false; }
        private boolean hasOverflow() { return false; }
        public java.util.List<android.view.MenuItem> layoutMainPanelItems(java.util.List<android.view.MenuItem> p0, int p1) { return null; }
        private void layoutOverflowPanelItems(java.util.List<android.view.MenuItem> p0) {}
        private void preparePopupContent() {}
        private void clearPanels() {}
        private void positionContentYCoordinatesIfOpeningOverflowUpwards() {}
        private int getOverflowWidth() { return 0; }
        private int calculateOverflowHeight(int p0) { return 0; }
        private void setButtonTagAndClickListener(android.view.View p0, android.view.MenuItem p1) {}
        private int getAdjustedDuration(int p0) { return 0; }
        private void maybeComputeTransitionDurationScale() {}
        private android.view.ViewGroup createMainPanel() { return null; }
        private android.widget.ImageButton createOverflowButton() { return null; }
        private com.android.internal.widget.FloatingToolbar.FloatingToolbarPopup.OverflowPanel createOverflowPanel() { return null; }
        private boolean isOverflowAnimating() { return false; }
        private android.view.animation.Animation.AnimationListener createOverflowAnimationListener() { return null; }
        private static android.util.Size measure(android.view.View p0) { return null; }
        private static void setSize(android.view.View p0, int p1, int p2) {}
        private static void setSize(android.view.View p0, android.util.Size p1) {}
        private static void setWidth(android.view.View p0, int p1) {}
        private static void setHeight(android.view.View p0, int p1) {}

        private static final class LogAccelerateInterpolator implements android.view.animation.Interpolator {
            private static final int BASE = 100;
            private static final float LOGS_SCALE = Float.valueOf(0.0f);
            private LogAccelerateInterpolator() {}
            private static float computeLog(float p0, int p1) { return 0.0f; }
            public float getInterpolation(float p0) { return 0.0f; }
        }

        private static final class OverflowPanel extends android.widget.ListView {
            private final com.android.internal.widget.FloatingToolbar.FloatingToolbarPopup mPopup = null;
            OverflowPanel(com.android.internal.widget.FloatingToolbar.FloatingToolbarPopup p0) { super((android.content.Context)null); }
            protected void onMeasure(int p0, int p1) {}
            public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
            protected boolean awakenScrollBars() { return false; }
        }

        private static final class OverflowPanelViewHelper {
            private final android.view.View mCalculator = null;
            private final int mIconTextSpacing = 0;
            private final int mSidePadding = 0;
            private final android.content.Context mContext = null;
            public OverflowPanelViewHelper(android.content.Context p0, int p1) {}
            public android.view.View getView(android.view.MenuItem p0, int p1, android.view.View p2) { return null; }
            public int calculateWidth(android.view.MenuItem p0) { return 0; }
            private android.view.View createMenuButton(android.view.MenuItem p0) { return null; }
            private boolean shouldShowIcon(android.view.MenuItem p0) { return false; }
        }
    }

    public static final class MenuItemRepr {
        public final int itemId = 0;
        public final int groupId = 0;
        public final java.lang.String title = null;
        private final android.graphics.drawable.Drawable mIcon = null;
        private MenuItemRepr(int p0, int p1, java.lang.CharSequence p2, android.graphics.drawable.Drawable p3) {}
        public static com.android.internal.widget.FloatingToolbar.MenuItemRepr of(android.view.MenuItem p0) { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public static boolean reprEquals(java.util.Collection<android.view.MenuItem> p0, java.util.Collection<android.view.MenuItem> p1) { return false; }
    }
}
