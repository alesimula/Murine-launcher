package com.android.internal.policy;

public class PhoneWindow extends android.view.Window implements com.android.internal.view.menu.MenuBuilder.Callback {
    public final boolean mRenderShadowsInCompositor = false;
    final com.android.internal.policy.PhoneWindow.PhoneWindowMenuCallback mContextMenuCallback = null;
    final android.util.TypedValue mMinWidthMajor = null;
    final android.util.TypedValue mMinWidthMinor = null;
    android.util.TypedValue mFixedWidthMajor;
    android.util.TypedValue mFixedWidthMinor;
    android.util.TypedValue mFixedHeightMajor;
    android.util.TypedValue mFixedHeightMinor;
    android.view.ViewGroup mContentParent;
    android.view.SurfaceHolder.Callback2 mTakeSurfaceCallback;
    android.view.InputQueue.Callback mTakeInputQueueCallback;
    boolean mIsFloating;
    com.android.internal.widget.DecorContentParent mDecorContentParent;
    static final int FLAG_RESOURCE_SET_ICON = 1;
    static final int FLAG_RESOURCE_SET_LOGO = 2;
    static final int FLAG_RESOURCE_SET_ICON_FALLBACK = 4;
    int mResourcesSetFlags;
    int mIconRes;
    int mLogoRes;
    com.android.internal.policy.PhoneWindow.PanelFeatureState mPreparedPanel;
    int mPanelChordingKey;
    android.graphics.drawable.Drawable mBackgroundDrawable;
    android.graphics.drawable.Drawable mBackgroundFallbackDrawable;
    int mStatusBarColor;
    int mNavigationBarColor;
    int mNavigationBarDividerColor;
    boolean mEnsureStatusBarContrastWhenTransparent;
    boolean mEnsureNavigationBarContrastWhenTransparent;
    com.android.internal.view.menu.ContextMenuBuilder mContextMenu;
    com.android.internal.view.menu.MenuHelper mContextMenuHelper;
    boolean mDecorFitsSystemWindows;
    static final com.android.internal.policy.PhoneWindow.RotationWatcher sRotationWatcher = null;
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
    public final void openPanel(int p0, android.view.KeyEvent p1) {}
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
    public boolean performPanelShortcut(int p0, int p1, android.view.KeyEvent p2, int p3) { return false; }
    boolean performPanelShortcut(com.android.internal.policy.PhoneWindow.PanelFeatureState p0, int p1, android.view.KeyEvent p2, int p3) { return false; }
    public boolean performPanelIdentifierAction(int p0, int p1, int p2) { return false; }
    public com.android.internal.policy.PhoneWindow.PanelFeatureState findMenuPanel(android.view.Menu p0) { return null; }
    public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
    public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
    protected boolean initializePanelMenu(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) { return false; }
    protected boolean initializePanelDecor(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) { return false; }
    void onOptionsPanelRotationChanged() {}
    protected boolean initializePanelContent(com.android.internal.policy.PhoneWindow.PanelFeatureState p0) { return false; }
    public boolean performContextMenuIdentifierAction(int p0, int p1) { return false; }
    public final void setElevation(float p0) {}
    public float getElevation() { return 0.0f; }
    public final void setClipToOutline(boolean p0) {}
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public final void setBackgroundBlurRadius(int p0) {}
    public final void setFeatureDrawableResource(int p0, int p1) {}
    public final void setFeatureDrawableUri(int p0, android.net.Uri p1) {}
    public final void setFeatureDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public void setFeatureDrawableAlpha(int p0, int p1) {}
    protected final void setFeatureDefaultDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public final void setFeatureInt(int p0, int p1) {}
    protected final void updateDrawable(int p0, boolean p1) {}
    protected void onDrawableChanged(int p0, android.graphics.drawable.Drawable p1, int p2) {}
    protected void onIntChanged(int p0, int p1) {}
    public void setIcon(int p0) {}
    public void setDefaultIcon(int p0) {}
    public void setLogo(int p0) {}
    public void setDefaultLogo(int p0) {}
    public void setLocalFocus(boolean p0, boolean p1) {}
    public void injectInputEvent(android.view.InputEvent p0) {}
    public void takeKeyEvents(boolean p0) {}
    public boolean superDispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    protected boolean onKeyDown(int p0, int p1, android.view.KeyEvent p2) { return false; }
    android.media.AudioManager getAudioManager() { return null; }
    protected boolean onKeyUp(int p0, int p1, android.view.KeyEvent p2) { return false; }
    protected void onActive() {}
    public final android.view.View getDecorView() { return null; }
    public final android.view.View peekDecorView() { return null; }
    void onViewRootImplSet(android.view.ViewRootImpl p0) {}
    public android.os.Bundle saveHierarchyState() { return null; }
    public void restoreHierarchyState(android.os.Bundle p0) {}
    void openPanelsAfterRestore() {}
    protected void onDestroy() {}
    protected com.android.internal.policy.DecorView generateDecor(int p0) { return null; }
    protected android.view.ViewGroup generateLayout(com.android.internal.policy.DecorView p0) { return null; }
    public void alwaysReadCloseOnTouchAttr() {}
    com.android.internal.policy.PhoneWindow.PanelFeatureState getPanelState(int p0, boolean p1) { return null; }
    public final void setChildDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public final void setChildInt(int p0, int p1) {}
    public boolean isShortcutKey(int p0, android.view.KeyEvent p1) { return false; }
    protected void dispatchWindowAttributesChanged(android.view.WindowManager.LayoutParams p0) {}
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
    public boolean decorFitsSystemWindows() { return false; }
    public void requestScrollCapture(android.view.IScrollCaptureResponseListener p0) {}
    public void registerScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    public void unregisterScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    public android.view.View getStatusBarBackgroundView() { return null; }
    public android.view.View getNavigationBarBackgroundView() { return null; }
    public android.view.AttachedSurfaceControl getRootSurfaceControl() { return null; }
    public android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() { return null; }

    private final class ActionMenuPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
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
            public int describeContents() { return 0; }
            public void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    private class PanelMenuPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
    }

    public static final class PhoneWindowMenuCallback implements com.android.internal.view.menu.MenuBuilder.Callback, com.android.internal.view.menu.MenuPresenter.Callback {
        public PhoneWindowMenuCallback(com.android.internal.policy.PhoneWindow p0) {}
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
        public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
        public void setShowDialogForSubmenu(boolean p0) {}
    }

    static class RotationWatcher extends android.view.IRotationWatcher.Stub {
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
