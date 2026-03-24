package com.android.internal.policy;

public class PhoneWindow extends android.view.Window implements com.android.internal.view.menu.MenuBuilder.Callback {
    private static final java.lang.String TAG = "PhoneWindow";
    private static final android.view.Window.OnContentApplyWindowInsetsListener sDefaultContentInsetsApplier = null;
    public final boolean mRenderShadowsInCompositor = false;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_BACKGROUND_FADE_DURATION_MS = 300;
    private static final int CUSTOM_TITLE_COMPATIBLE_FEATURES = 13505;
    private static final android.transition.Transition USE_DEFAULT_TRANSITION = null;
    final com.android.internal.policy.PhoneWindow.PhoneWindowMenuCallback mContextMenuCallback = null;
    final android.util.TypedValue mMinWidthMajor = null;
    final android.util.TypedValue mMinWidthMinor = null;
    android.util.TypedValue mFixedWidthMajor;
    android.util.TypedValue mFixedWidthMinor;
    android.util.TypedValue mFixedHeightMajor;
    android.util.TypedValue mFixedHeightMinor;
    private com.android.internal.policy.DecorView mDecor;
    private boolean mForceDecorInstall;
    android.view.ViewGroup mContentParent;
    private boolean mContentParentExplicitlySet;
    android.view.SurfaceHolder.Callback2 mTakeSurfaceCallback;
    android.view.InputQueue.Callback mTakeInputQueueCallback;
    boolean mIsFloating;
    private boolean mIsTranslucent;
    private android.view.LayoutInflater mLayoutInflater;
    private android.widget.TextView mTitleView;
    com.android.internal.widget.DecorContentParent mDecorContentParent;
    private com.android.internal.policy.PhoneWindow.ActionMenuPresenterCallback mActionMenuPresenterCallback;
    private com.android.internal.policy.PhoneWindow.PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private android.transition.TransitionManager mTransitionManager;
    private android.transition.Scene mContentScene;
    static final int FLAG_RESOURCE_SET_ICON = 1;
    static final int FLAG_RESOURCE_SET_LOGO = 2;
    static final int FLAG_RESOURCE_SET_ICON_FALLBACK = 4;
    int mResourcesSetFlags;
    int mIconRes;
    int mLogoRes;
    private com.android.internal.policy.PhoneWindow.DrawableFeatureState[] mDrawables;
    private com.android.internal.policy.PhoneWindow.PanelFeatureState[] mPanels;
    com.android.internal.policy.PhoneWindow.PanelFeatureState mPreparedPanel;
    int mPanelChordingKey;
    private boolean mSupportsPictureInPicture;
    private android.widget.ImageView mLeftIconView;
    private android.widget.ImageView mRightIconView;
    private android.widget.ProgressBar mCircularProgressBar;
    private android.widget.ProgressBar mHorizontalProgressBar;
    android.graphics.drawable.Drawable mBackgroundDrawable;
    android.graphics.drawable.Drawable mBackgroundFallbackDrawable;
    private boolean mLoadElevation;
    private float mElevation;
    private boolean mClipToOutline;
    private int mFrameResource;
    private int mTextColor;
    int mStatusBarColor;
    int mNavigationBarColor;
    int mNavigationBarDividerColor;
    private boolean mForcedStatusBarColor;
    private boolean mForcedNavigationBarColor;
    boolean mEnsureStatusBarContrastWhenTransparent;
    boolean mEnsureNavigationBarContrastWhenTransparent;
    private java.lang.CharSequence mTitle;
    private int mTitleColor;
    private boolean mAlwaysReadCloseOnTouchAttr;
    com.android.internal.view.menu.ContextMenuBuilder mContextMenu;
    com.android.internal.view.menu.MenuHelper mContextMenuHelper;
    private boolean mClosingActionMenu;
    private int mVolumeControlStreamType;
    private android.media.session.MediaController mMediaController;
    private android.media.AudioManager mAudioManager;
    private android.app.KeyguardManager mKeyguardManager;
    private android.media.session.MediaSessionManager mMediaSessionManager;
    private int mUiOptions;
    private boolean mInvalidatePanelMenuPosted;
    private int mInvalidatePanelMenuFeatures;
    private final java.lang.Runnable mInvalidatePanelMenuRunnable = null;
    private android.transition.Transition mEnterTransition;
    private android.transition.Transition mReturnTransition;
    private android.transition.Transition mExitTransition;
    private android.transition.Transition mReenterTransition;
    private android.transition.Transition mSharedElementEnterTransition;
    private android.transition.Transition mSharedElementReturnTransition;
    private android.transition.Transition mSharedElementExitTransition;
    private android.transition.Transition mSharedElementReenterTransition;
    private java.lang.Boolean mAllowReturnTransitionOverlap;
    private java.lang.Boolean mAllowEnterTransitionOverlap;
    private long mBackgroundFadeDurationMillis;
    private java.lang.Boolean mSharedElementsUseOverlay;
    private boolean mIsStartingWindow;
    private int mTheme;
    private int mDecorCaptionShade;
    private boolean mUseDecorContext;
    private android.view.ViewRootImpl.ActivityConfigCallback mActivityConfigCallback;
    boolean mDecorFitsSystemWindows;
    static final com.android.internal.policy.PhoneWindow.RotationWatcher sRotationWatcher = null;
    private static final java.lang.String FOCUSED_ID_TAG = "android:focusedViewId";
    private static final java.lang.String VIEWS_TAG = "android:views";
    private static final java.lang.String PANELS_TAG = "android:Panels";
    private static final java.lang.String ACTION_BAR_TAG = "android:ActionBar";
    public PhoneWindow(android.content.Context p0) { super(null); }
    public PhoneWindow(android.content.Context p0, android.view.Window p1, android.view.ViewRootImpl.ActivityConfigCallback p2) { super(null); }
    public final void setContainer(android.view.Window p0) {}
    public boolean requestFeature(int p0) { return false; }
    public void setUiOptions(int p0) {}
    public void setUiOptions(int p0, int p1) {}
    public android.transition.TransitionManager getTransitionManager() { return null; }
    public void setTransitionManager(android.transition.TransitionManager p0) {}
    public android.transition.Scene getContentScene() { return null; }
    public void setContentView(int p0) {}
    public void setContentView(android.view.View p0) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void clearContentView() {}
    private void transitionTo(android.transition.Scene p0) {}
    public android.view.View getCurrentFocus() { return null; }
    public void takeSurface(android.view.SurfaceHolder.Callback2 p0) {}
    public void takeInputQueue(android.view.InputQueue.Callback p0) {}
    public boolean isFloating() { return false; }
    public boolean isTranslucent() { return false; }
    boolean isShowingWallpaper() { return false; }
    public android.view.LayoutInflater getLayoutInflater() { return null; }
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitle(java.lang.CharSequence p0, boolean p1) {}
    @java.lang.Deprecated
    public void setTitleColor(int p0) {}
    public final boolean preparePanel(com.android.internal.policy.PhoneWindow.PanelFeatureState p0, android.view.KeyEvent p1) { return false; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onMultiWindowModeChanged() {}
    public void onPictureInPictureModeChanged(boolean p0) {}
    public void reportActivityRelaunched() {}
    private static void clearMenuViews(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) {}
    public final void openPanel(int p0, android.view.KeyEvent p1) {}
    private void openPanel(com.android.internal.policy.PhoneWindow.PanelFeatureState p0, android.view.KeyEvent p1) {}
    public final void closePanel(int p0) {}
    public final void closePanel(com.android.internal.policy.PhoneWindow.PanelFeatureState p0, boolean p1) {}
    void checkCloseActionMenu(android.view.Menu p0) {}
    public final void togglePanel(int p0, android.view.KeyEvent p1) {}
    public void invalidatePanelMenu(int p0) {}
    void doPendingInvalidatePanelMenu() {}
    void doInvalidatePanelMenu(int p0) {}
    public final boolean onKeyDownPanel(int p0, android.view.KeyEvent p1) { return false; }
    public final void onKeyUpPanel(int p0, android.view.KeyEvent p1) {}
    public final void closeAllPanels() {}
    private synchronized void closeContextMenu() {}
    private synchronized void dismissContextMenu() {}
    public boolean performPanelShortcut(int p0, int p1, android.view.KeyEvent p2, int p3) { return false; }
    boolean performPanelShortcut(com.android.internal.policy.PhoneWindow.PanelFeatureState p0, int p1, android.view.KeyEvent p2, int p3) { return false; }
    public boolean performPanelIdentifierAction(int p0, int p1, int p2) { return false; }
    public com.android.internal.policy.PhoneWindow.PanelFeatureState findMenuPanel(android.view.Menu p0) { return null; }
    public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
    public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
    private void reopenMenu(boolean p0) {}
    protected boolean initializePanelMenu(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) { return false; }
    protected boolean initializePanelDecor(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) { return false; }
    private int getOptionsPanelGravity() { return 0; }
    void onOptionsPanelRotationChanged() {}
    protected boolean initializePanelContent(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) { return false; }
    public boolean performContextMenuIdentifierAction(int p0, int p1) { return false; }
    public final void setElevation(float p0) {}
    public float getElevation() { return 0.0f; }
    public final void setClipToOutline(boolean p0) {}
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public final void setFeatureDrawableResource(int p0, int p1) {}
    public final void setFeatureDrawableUri(int p0, android.net.Uri p1) {}
    public final void setFeatureDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public void setFeatureDrawableAlpha(int p0, int p1) {}
    protected final void setFeatureDefaultDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public final void setFeatureInt(int p0, int p1) {}
    protected final void updateDrawable(int p0, boolean p1) {}
    protected void onDrawableChanged(int p0, android.graphics.drawable.Drawable p1, int p2) {}
    protected void onIntChanged(int p0, int p1) {}
    private void updateProgressBars(int p0) {}
    private void showProgressBars(android.widget.ProgressBar p0, android.widget.ProgressBar p1) {}
    private void hideProgressBars(android.widget.ProgressBar p0, android.widget.ProgressBar p1) {}
    public void setIcon(int p0) {}
    public void setDefaultIcon(int p0) {}
    public void setLogo(int p0) {}
    public void setDefaultLogo(int p0) {}
    public void setLocalFocus(boolean p0, boolean p1) {}
    public void injectInputEvent(android.view.InputEvent p0) {}
    private android.view.ViewRootImpl getViewRootImpl() { return null; }
    private android.view.ViewRootImpl getViewRootImplOrNull() { return null; }
    public void takeKeyEvents(boolean p0) {}
    public boolean superDispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    protected boolean onKeyDown(int p0, int p1, android.view.KeyEvent p2) { return false; }
    private android.app.KeyguardManager getKeyguardManager() { return null; }
    android.media.AudioManager getAudioManager() { return null; }
    private android.media.session.MediaSessionManager getMediaSessionManager() { return null; }
    protected boolean onKeyUp(int p0, int p1, android.view.KeyEvent p2) { return false; }
    private boolean isNotInstantAppAndKeyguardRestricted() { return false; }
    protected void onActive() {}
    public final android.view.View getDecorView() { return null; }
    public final android.view.View peekDecorView() { return null; }
    void onViewRootImplSet(android.view.ViewRootImpl p0) {}
    public android.os.Bundle saveHierarchyState() { return null; }
    public void restoreHierarchyState(android.os.Bundle p0) {}
    private void savePanelState(android.util.SparseArray<android.os.Parcelable> p0) {}
    private void restorePanelState(android.util.SparseArray<android.os.Parcelable> p0) {}
    void openPanelsAfterRestore() {}
    protected com.android.internal.policy.DecorView generateDecor(int p0) { return null; }
    protected android.view.ViewGroup generateLayout(com.android.internal.policy.DecorView p0) { return null; }
    public void alwaysReadCloseOnTouchAttr() {}
    private void installDecor() {}
    private android.transition.Transition getTransition(android.transition.Transition p0, android.transition.Transition p1, int p2) { return null; }
    private android.graphics.drawable.Drawable loadImageURI(android.net.Uri p0) { return null; }
    private com.android.internal.policy.PhoneWindow.DrawableFeatureState getDrawableState(int p0, boolean p1) { return null; }
    com.android.internal.policy.PhoneWindow.PanelFeatureState getPanelState(int p0, boolean p1) { return null; }
    private com.android.internal.policy.PhoneWindow.PanelFeatureState getPanelState(int p0, boolean p1, com.android.internal.policy.PhoneWindow.PanelFeatureState p2) { return null; }
    public final void setChildDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public final void setChildInt(int p0, int p1) {}
    public boolean isShortcutKey(int p0, android.view.KeyEvent p1) { return false; }
    private void updateDrawable(int p0, com.android.internal.policy.PhoneWindow.DrawableFeatureState p1, boolean p2) {}
    private void updateInt(int p0, int p1, boolean p2) {}
    private android.widget.ImageView getLeftIconView() { return null; }
    protected void dispatchWindowAttributesChanged(android.view.WindowManager.LayoutParams p0) {}
    private android.widget.ProgressBar getCircularProgressBar(boolean p0) { return null; }
    private android.widget.ProgressBar getHorizontalProgressBar(boolean p0) { return null; }
    private android.widget.ImageView getRightIconView() { return null; }
    private void callOnPanelClosed(int p0, com.android.internal.policy.PhoneWindow.PanelFeatureState p1, android.view.Menu p2) {}
    private boolean isTvUserSetupComplete() { return false; }
    private boolean launchDefaultSearch(android.view.KeyEvent p0) { return false; }
    public void setVolumeControlStream(int p0) {}
    public int getVolumeControlStream() { return 0; }
    public void setMediaController(android.media.session.MediaController p0) {}
    public android.media.session.MediaController getMediaController() { return null; }
    public void setEnterTransition(android.transition.Transition p0) {}
    public void setReturnTransition(android.transition.Transition p0) {}
    public void setExitTransition(android.transition.Transition p0) {}
    public void setReenterTransition(android.transition.Transition p0) {}
    public void setSharedElementEnterTransition(android.transition.Transition p0) {}
    public void setSharedElementReturnTransition(android.transition.Transition p0) {}
    public void setSharedElementExitTransition(android.transition.Transition p0) {}
    public void setSharedElementReenterTransition(android.transition.Transition p0) {}
    public android.transition.Transition getEnterTransition() { return null; }
    public android.transition.Transition getReturnTransition() { return null; }
    public android.transition.Transition getExitTransition() { return null; }
    public android.transition.Transition getReenterTransition() { return null; }
    public android.transition.Transition getSharedElementEnterTransition() { return null; }
    public android.transition.Transition getSharedElementReturnTransition() { return null; }
    public android.transition.Transition getSharedElementExitTransition() { return null; }
    public android.transition.Transition getSharedElementReenterTransition() { return null; }
    public void setAllowEnterTransitionOverlap(boolean p0) {}
    public boolean getAllowEnterTransitionOverlap() { return false; }
    public void setAllowReturnTransitionOverlap(boolean p0) {}
    public boolean getAllowReturnTransitionOverlap() { return false; }
    public long getTransitionBackgroundFadeDuration() { return 0L; }
    public void setTransitionBackgroundFadeDuration(long p0) {}
    public void setSharedElementsUseOverlay(boolean p0) {}
    public boolean getSharedElementsUseOverlay() { return false; }
    int getLocalFeaturesPrivate() { return 0; }
    protected void setDefaultWindowFormat(int p0) {}
    void sendCloseSystemWindows() {}
    void sendCloseSystemWindows(java.lang.String p0) {}
    public static void sendCloseSystemWindows(android.content.Context p0, java.lang.String p1) {}
    public int getStatusBarColor() { return 0; }
    public void setStatusBarColor(int p0) {}
    public int getNavigationBarColor() { return 0; }
    public void setNavigationBarColor(int p0) {}
    public void setNavigationBarDividerColor(int p0) {}
    public int getNavigationBarDividerColor() { return 0; }
    public void setStatusBarContrastEnforced(boolean p0) {}
    public boolean isStatusBarContrastEnforced() { return false; }
    public void setNavigationBarContrastEnforced(boolean p0) {}
    public boolean isNavigationBarContrastEnforced() { return false; }
    public void setIsStartingWindow(boolean p0) {}
    public void setTheme(int p0) {}
    public void setResizingCaptionDrawable(android.graphics.drawable.Drawable p0) {}
    public void setDecorCaptionShade(int p0) {}
    int getDecorCaptionShade() { return 0; }
    public void setAttributes(android.view.WindowManager.LayoutParams p0) {}
    public android.view.WindowInsetsController getInsetsController() { return null; }
    public void setSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    public java.util.List<android.graphics.Rect> getSystemGestureExclusionRects() { return null; }
    public void setDecorFitsSystemWindows(boolean p0) {}
    private void applyDecorFitsSystemWindows() {}
    public void requestScrollCapture(android.view.IScrollCaptureController p0) {}
    public void addScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    public void removeScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    public android.view.View getStatusBarBackgroundView() { return null; }
    public android.view.View getNavigationBarBackgroundView() { return null; }

    private final class ActionMenuPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
        private ActionMenuPresenterCallback(com.android.internal.policy.PhoneWindow p0) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
    }

    private static final class DrawableFeatureState {
        final int featureId = 0;
        int resid;
        android.net.Uri uri;
        android.graphics.drawable.Drawable local;
        android.graphics.drawable.Drawable child;
        android.graphics.drawable.Drawable def;
        android.graphics.drawable.Drawable cur;
        int alpha;
        int curAlpha;
        DrawableFeatureState(int p0) {}
    }

    static final class PanelFeatureState {
        int featureId;
        int background;
        int fullBackground;
        int gravity;
        int x;
        int y;
        int windowAnimations;
        com.android.internal.policy.DecorView decorView;
        android.view.View createdPanelView;
        android.view.View shownPanelView;
        com.android.internal.view.menu.MenuBuilder menu;
        com.android.internal.view.menu.IconMenuPresenter iconMenuPresenter;
        com.android.internal.view.menu.ListMenuPresenter listMenuPresenter;
        boolean isCompact;
        int listPresenterTheme;
        boolean isPrepared;
        boolean isHandled;
        boolean isOpen;
        boolean isInExpandedMode;
        public boolean qwertyMode;
        boolean refreshDecorView;
        boolean refreshMenuContent;
        boolean wasLastOpen;
        boolean wasLastExpanded;
        android.os.Bundle frozenMenuState;
        android.os.Bundle frozenActionViewState;
        PanelFeatureState(int p0) {}
        public boolean isInListMode() { return false; }
        public boolean hasPanelItems() { return false; }
        public void clearMenuPresenters() {}
        void setStyle(android.content.Context p0) {}
        void setMenu(com.android.internal.view.menu.MenuBuilder p0) {}
        com.android.internal.view.menu.MenuView getListMenuView(android.content.Context p0, com.android.internal.view.menu.MenuPresenter.Callback p1) { return null; }
        com.android.internal.view.menu.MenuView getIconMenuView(android.content.Context p0, com.android.internal.view.menu.MenuPresenter.Callback p1) { return null; }
        android.os.Parcelable onSaveInstanceState() { return null; }
        void onRestoreInstanceState(android.os.Parcelable p0) {}
        void applyFrozenState() {}

        private static class SavedState implements android.os.Parcelable {
            int featureId;
            boolean isOpen;
            boolean isInExpandedMode;
            android.os.Bundle menuState;
            public static final android.os.Parcelable.Creator<com.android.internal.policy.PhoneWindow.PanelFeatureState.SavedState> CREATOR = null;
            private SavedState() {}
            public int describeContents() { return 0; }
            public void writeToParcel(android.os.Parcel p0, int p1) {}
            private static com.android.internal.policy.PhoneWindow.PanelFeatureState.SavedState readFromParcel(android.os.Parcel p0) { return null; }
        }
    }

    private class PanelMenuPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
        private PanelMenuPresenterCallback(com.android.internal.policy.PhoneWindow p0) {}
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
    }

    public static final class PhoneWindowMenuCallback implements com.android.internal.view.menu.MenuBuilder.Callback, com.android.internal.view.menu.MenuPresenter.Callback {
        private static final int FEATURE_ID = 6;
        private final com.android.internal.policy.PhoneWindow mWindow = null;
        private com.android.internal.view.menu.MenuDialogHelper mSubMenuHelper;
        private boolean mShowDialogForSubmenu;
        public PhoneWindowMenuCallback(com.android.internal.policy.PhoneWindow p0) {}
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        private void onCloseSubMenu(com.android.internal.view.menu.MenuBuilder p0) {}
        public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
        public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
        public void setShowDialogForSubmenu(boolean p0) {}
    }

    static class RotationWatcher extends android.view.IRotationWatcher.Stub {
        private android.os.Handler mHandler;
        private final java.lang.Runnable mRotationChanged = null;
        private final java.util.ArrayList<java.lang.ref.WeakReference<com.android.internal.policy.PhoneWindow>> mWindows = null;
        private boolean mIsWatching;
        RotationWatcher() { super(); }
        public void onRotationChanged(int p0) throws android.os.RemoteException {}
        public void addWindow(com.android.internal.policy.PhoneWindow p0) {}
        public void removeWindow(com.android.internal.policy.PhoneWindow p0) {}
        void dispatchRotationChanged() {}
    }

    static class WindowManagerHolder {
        static final android.view.IWindowManager sWindowManager = null;
        WindowManagerHolder() {}
    }
}
