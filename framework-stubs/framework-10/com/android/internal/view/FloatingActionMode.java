package com.android.internal.view;

public final class FloatingActionMode extends android.view.ActionMode {
    private static final int MAX_HIDE_DURATION = 3000;
    private static final int MOVING_HIDE_DELAY = 50;
    private final android.content.Context mContext = null;
    private final android.view.ActionMode.Callback2 mCallback = null;
    private final com.android.internal.view.menu.MenuBuilder mMenu = null;
    private final android.graphics.Rect mContentRect = null;
    private final android.graphics.Rect mContentRectOnScreen = null;
    private final android.graphics.Rect mPreviousContentRectOnScreen = null;
    private final int[] mViewPositionOnScreen = null;
    private final int[] mPreviousViewPositionOnScreen = null;
    private final int[] mRootViewPositionOnScreen = null;
    private final android.graphics.Rect mViewRectOnScreen = null;
    private final android.graphics.Rect mPreviousViewRectOnScreen = null;
    private final android.graphics.Rect mScreenRect = null;
    private final android.view.View mOriginatingView = null;
    private final android.graphics.Point mDisplaySize = null;
    private final int mBottomAllowance = 0;
    private final java.lang.Runnable mMovingOff = null;
    private final java.lang.Runnable mHideOff = null;
    private com.android.internal.widget.FloatingToolbar mFloatingToolbar;
    private com.android.internal.view.FloatingActionMode.FloatingToolbarVisibilityHelper mFloatingToolbarVisibilityHelper;
    public FloatingActionMode(android.content.Context p0, android.view.ActionMode.Callback2 p1, android.view.View p2, com.android.internal.widget.FloatingToolbar p3) { super(); }
    private void setFloatingToolbar(com.android.internal.widget.FloatingToolbar p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitle(int p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setSubtitle(int p0) {}
    public void setCustomView(android.view.View p0) {}
    public void invalidate() {}
    public void invalidateContentRect() {}
    public void updateViewLocationInWindow() {}
    private void repositionToolbar() {}
    private boolean isContentRectWithinBounds() { return false; }
    private static boolean intersectsClosed(android.graphics.Rect p0, android.graphics.Rect p1) { return false; }
    public void hide(long p0) {}
    public void setOutsideTouchable(boolean p0, android.widget.PopupWindow.OnDismissListener p1) {}
    public void onWindowFocusChanged(boolean p0) {}
    public void finish() {}
    public android.view.Menu getMenu() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public android.view.View getCustomView() { return null; }
    public android.view.MenuInflater getMenuInflater() { return null; }
    private void reset() {}
    private boolean isViewStillActive() { return false; }

    private static final class FloatingToolbarVisibilityHelper {
        private static final long MIN_SHOW_DURATION_FOR_MOVE_HIDE = 500L;
        private final com.android.internal.widget.FloatingToolbar mToolbar = null;
        private boolean mHideRequested;
        private boolean mMoving;
        private boolean mOutOfBounds;
        private boolean mWindowFocused;
        private boolean mActive;
        private long mLastShowTime;
        public FloatingToolbarVisibilityHelper(com.android.internal.widget.FloatingToolbar p0) {}
        public void activate() {}
        public void deactivate() {}
        public void setHideRequested(boolean p0) {}
        public void setMoving(boolean p0) {}
        public void setOutOfBounds(boolean p0) {}
        public void setWindowFocused(boolean p0) {}
        public void updateToolbarVisibility() {}
    }
}
