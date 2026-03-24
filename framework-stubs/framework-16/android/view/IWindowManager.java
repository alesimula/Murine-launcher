package android.view;

public interface IWindowManager extends android.os.IInterface {
    public static final int FIXED_TO_USER_ROTATION_DEFAULT = 0;
    public static final int FIXED_TO_USER_ROTATION_DISABLED = 1;
    public static final int FIXED_TO_USER_ROTATION_ENABLED = 2;
    public static final int FIXED_TO_USER_ROTATION_IF_NO_AUTO_ROTATION = 3;
    public boolean startViewServer(int p0) throws android.os.RemoteException;
    public boolean stopViewServer() throws android.os.RemoteException;
    public boolean isViewServerRunning() throws android.os.RemoteException;
    public android.view.IWindowSession openSession(android.view.IWindowSessionCallback p0) throws android.os.RemoteException;
    public void getInitialDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException;
    public void getBaseDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setForcedDisplaySize(int p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.WRITE_SECURE_SETTINGS")
    public void clearForcedDisplaySize(int p0) throws android.os.RemoteException;
    public int getInitialDisplayDensity(int p0) throws android.os.RemoteException;
    public int getBaseDisplayDensity(int p0) throws android.os.RemoteException;
    public int getDisplayIdByUniqueId(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setForcedDisplayDensityForUser(int p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.WRITE_SECURE_SETTINGS")
    public void clearForcedDisplayDensityForUser(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setForcedDisplayDensityRatio(int p0, float p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setConfigurationChangeSettingsForUser(java.util.List<android.window.ConfigurationChangeSetting> p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setForcedDisplayScalingMode(int p0, int p1) throws android.os.RemoteException;
    public void setEventDispatching(boolean p0) throws android.os.RemoteException;
    public boolean isWindowToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void addWindowToken(android.os.IBinder p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void removeWindowToken(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void setDisplayChangeWindowController(android.view.IDisplayChangeWindowController p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_APP_TOKENS")
    public android.view.SurfaceControl addShellRoot(int p0, android.view.IWindow p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_APP_TOKENS")
    public void setShellRootAccessibilityWindow(int p0, int p1, android.view.IWindow p2) throws android.os.RemoteException;
    public void overridePendingAppTransitionMultiThumbFuture(android.view.IAppTransitionAnimationSpecsFuture p0, android.os.IRemoteCallback p1, boolean p2, int p3) throws android.os.RemoteException;
    public void overridePendingAppTransitionRemote(android.view.RemoteAnimationAdapter p0, int p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void endProlongedAnimations() throws android.os.RemoteException;
    @java.lang.Deprecated
    public void disableKeyguard(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void reenableKeyguard(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DISABLE_KEYGUARD")
    public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult p0) throws android.os.RemoteException;
    public boolean isKeyguardLocked() throws android.os.RemoteException;
    public boolean isKeyguardSecure(int p0) throws android.os.RemoteException;
    public void dismissKeyguard(com.android.internal.policy.IKeyguardDismissCallback p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SUBSCRIBE_TO_KEYGUARD_LOCKED_STATE")
    public void addKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SUBSCRIBE_TO_KEYGUARD_LOCKED_STATE")
    public void removeKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException;
    public void setSwitchingUser(boolean p0) throws android.os.RemoteException;
    public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException;
    public float getAnimationScale(int p0) throws android.os.RemoteException;
    public float[] getAnimationScales() throws android.os.RemoteException;
    public void setAnimationScale(int p0, float p1) throws android.os.RemoteException;
    public void setAnimationScales(float[] p0) throws android.os.RemoteException;
    public float getCurrentAnimatorScale() throws android.os.RemoteException;
    public void setInTouchMode(boolean p0, int p1) throws android.os.RemoteException;
    public void setInTouchModeOnAllDisplays(boolean p0) throws android.os.RemoteException;
    public boolean isInTouchMode(int p0) throws android.os.RemoteException;
    public void showStrictModeViolation(boolean p0) throws android.os.RemoteException;
    public void setStrictModeVisualIndicatorPreference(java.lang.String p0) throws android.os.RemoteException;
    public void refreshScreenCaptureDisabled() throws android.os.RemoteException;
    public int getDefaultDisplayRotation() throws android.os.RemoteException;
    public int getDisplayUserRotation(int p0) throws android.os.RemoteException;
    public int watchRotation(android.view.IRotationWatcher p0, int p1) throws android.os.RemoteException;
    public void removeRotationWatcher(android.view.IRotationWatcher p0) throws android.os.RemoteException;
    public int registerProposedRotationListener(android.os.IBinder p0, android.view.IRotationWatcher p1) throws android.os.RemoteException;
    public int getPreferredOptionsPanelGravity(int p0) throws android.os.RemoteException;
    public void setDeviceStateAutoRotateSetting(int p0, boolean p1) throws android.os.RemoteException;
    public void freezeRotation(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void thawRotation(java.lang.String p0) throws android.os.RemoteException;
    public boolean isRotationFrozen() throws android.os.RemoteException;
    public void setRotationAtAngleIfAllowed(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void freezeDisplayRotation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void thawDisplayRotation(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isDisplayRotationFrozen(int p0) throws android.os.RemoteException;
    public void setFixedToUserRotation(int p0, int p1) throws android.os.RemoteException;
    public void setIgnoreOrientationRequest(int p0, boolean p1) throws android.os.RemoteException;
    public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException;
    public android.view.SurfaceControl mirrorWallpaperSurface(int p0) throws android.os.RemoteException;
    public boolean registerWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException;
    public void unregisterWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException;
    public void registerSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException;
    public void unregisterSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException;
    public void requestAssistScreenshot(android.app.IAssistDataReceiver p0) throws android.os.RemoteException;
    public void hideTransientBars(int p0) throws android.os.RemoteException;
    public void setRecentsVisibility(boolean p0) throws android.os.RemoteException;
    public void updateStaticPrivacyIndicatorBounds(int p0, android.graphics.Rect[] p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.STATUS_BAR")
    public void setNavBarVirtualKeyHapticFeedbackEnabled(boolean p0) throws android.os.RemoteException;
    public boolean hasNavigationBar(int p0) throws android.os.RemoteException;
    public void lockNow(android.os.Bundle p0) throws android.os.RemoteException;
    public boolean isSafeModeEnabled() throws android.os.RemoteException;
    public boolean clearWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException;
    public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException;
    public int getDockedStackSide() throws android.os.RemoteException;
    public void registerPinnedTaskListener(int p0, android.view.IPinnedTaskListener p1) throws android.os.RemoteException;
    public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException;
    public void requestImeKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException;
    public void getStableInsets(int p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void registerShortcutKey(long p0, com.android.internal.policy.IShortcutService p1) throws android.os.RemoteException;
    public void createInputConsumer(android.os.IBinder p0, java.lang.String p1, int p2, android.view.InputChannel p3) throws android.os.RemoteException;
    public boolean destroyInputConsumer(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.RESTRICTED_VR_ACCESS")
    public android.graphics.Region getCurrentImeTouchRegion() throws android.os.RemoteException;
    public void registerDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException;
    public void unregisterDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException;
    public int[] registerDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException;
    public void unregisterDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException;
    public void startWindowTrace() throws android.os.RemoteException;
    public void stopWindowTrace() throws android.os.RemoteException;
    public void saveWindowTraceToFile() throws android.os.RemoteException;
    public boolean isWindowTraceEnabled() throws android.os.RemoteException;
    public void startTransitionTrace() throws android.os.RemoteException;
    public void stopTransitionTrace() throws android.os.RemoteException;
    public boolean isTransitionTraceEnabled() throws android.os.RemoteException;
    public int getWindowingMode(int p0) throws android.os.RemoteException;
    public void setWindowingMode(int p0, int p1) throws android.os.RemoteException;
    public int getRemoveContentMode(int p0) throws android.os.RemoteException;
    public void setRemoveContentMode(int p0, int p1) throws android.os.RemoteException;
    public boolean shouldShowWithInsecureKeyguard(int p0) throws android.os.RemoteException;
    public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) throws android.os.RemoteException;
    public boolean shouldShowSystemDecors(int p0) throws android.os.RemoteException;
    public void setShouldShowSystemDecors(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isEligibleForDesktopMode(int p0) throws android.os.RemoteException;
    public int getDisplayImePolicy(int p0) throws android.os.RemoteException;
    public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException;
    public void onNotificationShadeExpanded(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void syncInputTransactions(boolean p0) throws android.os.RemoteException;
    public boolean isLayerTracing() throws android.os.RemoteException;
    public void setLayerTracing(boolean p0) throws android.os.RemoteException;
    public boolean mirrorDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_APP_TOKENS")
    public void setDisplayWindowInsetsController(int p0, android.view.IDisplayWindowInsetsController p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_APP_TOKENS")
    public void updateDisplayWindowRequestedVisibleTypes(int p0, int p1, int p2, android.view.inputmethod.ImeTracker.Token p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_APP_TOKENS")
    public void updateDisplayWindowAnimatingTypes(int p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;
    public void getWindowInsets(int p0, android.os.IBinder p1, android.view.InsetsState p2) throws android.os.RemoteException;
    public java.util.List<android.view.DisplayInfo> getPossibleDisplayInfo(int p0) throws android.os.RemoteException;
    public void showGlobalActions() throws android.os.RemoteException;
    public void setLayerTracingFlags(int p0) throws android.os.RemoteException;
    public void setActiveTransactionTracing(boolean p0) throws android.os.RemoteException;
    public void requestScrollCapture(int p0, android.os.IBinder p1, int p2, android.view.IScrollCaptureResponseListener p3) throws android.os.RemoteException;
    public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public java.lang.String[] getSupportedDisplayHashAlgorithms() throws android.os.RemoteException;
    public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) throws android.os.RemoteException;
    public void setDisplayHashThrottlingEnabled(boolean p0) throws android.os.RemoteException;
    public android.window.WindowContextInfo attachWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException;
    public android.window.WindowContextInfo attachWindowContextToWindowToken(android.app.IApplicationThread p0, android.os.IBinder p1, android.os.IBinder p2) throws android.os.RemoteException;
    public android.window.WindowContextInfo attachWindowContextToDisplayContent(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public void detachWindowContext(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean reparentWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public boolean registerCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException;
    public void unregisterCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException;
    public boolean isTaskSnapshotSupported() throws android.os.RemoteException;
    public int getImeDisplayId() throws android.os.RemoteException;
    public void setTaskSnapshotEnabled(boolean p0) throws android.os.RemoteException;
    public void registerTaskFpsCallback(int p0, android.window.ITaskFpsCallback p1) throws android.os.RemoteException;
    public void unregisterTaskFpsCallback(android.window.ITaskFpsCallback p0) throws android.os.RemoteException;
    public android.graphics.Bitmap snapshotTaskForRecents(int p0) throws android.os.RemoteException;
    public void setRecentsAppBehindSystemBars(boolean p0) throws android.os.RemoteException;
    public int getLetterboxBackgroundColorInArgb() throws android.os.RemoteException;
    public boolean isLetterboxBackgroundMultiColored() throws android.os.RemoteException;
    public void captureDisplay(int p0, android.window.ScreenCapture.CaptureArgs p1, android.window.ScreenCapture.ScreenCaptureListener p2) throws android.os.RemoteException;
    public boolean isGlobalKey(int p0) throws android.os.RemoteException;
    public boolean addToSurfaceSyncGroup(android.os.IBinder p0, boolean p1, android.window.ISurfaceSyncGroupCompletedListener p2, android.window.AddToSurfaceSyncGroupResult p3) throws android.os.RemoteException;
    public void markSurfaceSyncGroupReady(android.os.IBinder p0) throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> notifyScreenshotListeners(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.ACCESS_SURFACE_FLINGER")
    public boolean replaceContentOnDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MONITOR_INPUT")
    public void registerDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MONITOR_INPUT")
    public void unregisterDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException;
    public void registerTrustedPresentationListener(android.os.IBinder p0, android.window.ITrustedPresentationListener p1, android.window.TrustedPresentationThresholds p2, int p3) throws android.os.RemoteException;
    public void unregisterTrustedPresentationListener(android.window.ITrustedPresentationListener p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DETECT_SCREEN_RECORDING")
    public boolean registerScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DETECT_SCREEN_RECORDING")
    public void unregisterScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException;
    public void setGlobalDragListener(android.window.IGlobalDragListener p0) throws android.os.RemoteException;
    public boolean transferTouchGesture(android.window.InputTransferToken p0, android.window.InputTransferToken p1) throws android.os.RemoteException;
    public android.view.KeyboardShortcutGroup getApplicationLaunchKeyboardShortcuts(int p0) throws android.os.RemoteException;
    public boolean getIgnoreOrientationRequest(int p0) throws android.os.RemoteException;

    public static class Default implements android.view.IWindowManager {
        public Default() {}
        public boolean startViewServer(int p0) throws android.os.RemoteException { return false; }
        public boolean stopViewServer() throws android.os.RemoteException { return false; }
        public boolean isViewServerRunning() throws android.os.RemoteException { return false; }
        public android.view.IWindowSession openSession(android.view.IWindowSessionCallback p0) throws android.os.RemoteException { return null; }
        public void getInitialDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
        public void getBaseDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
        public void setForcedDisplaySize(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void clearForcedDisplaySize(int p0) throws android.os.RemoteException {}
        public int getInitialDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
        public int getBaseDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
        public int getDisplayIdByUniqueId(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void setForcedDisplayDensityForUser(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void clearForcedDisplayDensityForUser(int p0, int p1) throws android.os.RemoteException {}
        public void setForcedDisplayDensityRatio(int p0, float p1, int p2) throws android.os.RemoteException {}
        public void setConfigurationChangeSettingsForUser(java.util.List<android.window.ConfigurationChangeSetting> p0, int p1) throws android.os.RemoteException {}
        public void setForcedDisplayScalingMode(int p0, int p1) throws android.os.RemoteException {}
        public void setEventDispatching(boolean p0) throws android.os.RemoteException {}
        public boolean isWindowToken(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void addWindowToken(android.os.IBinder p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void removeWindowToken(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void setDisplayChangeWindowController(android.view.IDisplayChangeWindowController p0) throws android.os.RemoteException {}
        public android.view.SurfaceControl addShellRoot(int p0, android.view.IWindow p1, int p2) throws android.os.RemoteException { return null; }
        public void setShellRootAccessibilityWindow(int p0, int p1, android.view.IWindow p2) throws android.os.RemoteException {}
        public void overridePendingAppTransitionMultiThumbFuture(android.view.IAppTransitionAnimationSpecsFuture p0, android.os.IRemoteCallback p1, boolean p2, int p3) throws android.os.RemoteException {}
        public void overridePendingAppTransitionRemote(android.view.RemoteAnimationAdapter p0, int p1) throws android.os.RemoteException {}
        public void endProlongedAnimations() throws android.os.RemoteException {}
        public void disableKeyguard(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void reenableKeyguard(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult p0) throws android.os.RemoteException {}
        public boolean isKeyguardLocked() throws android.os.RemoteException { return false; }
        public boolean isKeyguardSecure(int p0) throws android.os.RemoteException { return false; }
        public void dismissKeyguard(com.android.internal.policy.IKeyguardDismissCallback p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public void addKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException {}
        public void removeKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException {}
        public void setSwitchingUser(boolean p0) throws android.os.RemoteException {}
        public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
        public float getAnimationScale(int p0) throws android.os.RemoteException { return 0.0f; }
        public float[] getAnimationScales() throws android.os.RemoteException { return null; }
        public void setAnimationScale(int p0, float p1) throws android.os.RemoteException {}
        public void setAnimationScales(float[] p0) throws android.os.RemoteException {}
        public float getCurrentAnimatorScale() throws android.os.RemoteException { return 0.0f; }
        public void setInTouchMode(boolean p0, int p1) throws android.os.RemoteException {}
        public void setInTouchModeOnAllDisplays(boolean p0) throws android.os.RemoteException {}
        public boolean isInTouchMode(int p0) throws android.os.RemoteException { return false; }
        public void showStrictModeViolation(boolean p0) throws android.os.RemoteException {}
        public void setStrictModeVisualIndicatorPreference(java.lang.String p0) throws android.os.RemoteException {}
        public void refreshScreenCaptureDisabled() throws android.os.RemoteException {}
        public int getDefaultDisplayRotation() throws android.os.RemoteException { return 0; }
        public int getDisplayUserRotation(int p0) throws android.os.RemoteException { return 0; }
        public int watchRotation(android.view.IRotationWatcher p0, int p1) throws android.os.RemoteException { return 0; }
        public void removeRotationWatcher(android.view.IRotationWatcher p0) throws android.os.RemoteException {}
        public int registerProposedRotationListener(android.os.IBinder p0, android.view.IRotationWatcher p1) throws android.os.RemoteException { return 0; }
        public int getPreferredOptionsPanelGravity(int p0) throws android.os.RemoteException { return 0; }
        public void setDeviceStateAutoRotateSetting(int p0, boolean p1) throws android.os.RemoteException {}
        public void freezeRotation(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void thawRotation(java.lang.String p0) throws android.os.RemoteException {}
        public boolean isRotationFrozen() throws android.os.RemoteException { return false; }
        public void setRotationAtAngleIfAllowed(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void freezeDisplayRotation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void thawDisplayRotation(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isDisplayRotationFrozen(int p0) throws android.os.RemoteException { return false; }
        public void setFixedToUserRotation(int p0, int p1) throws android.os.RemoteException {}
        public void setIgnoreOrientationRequest(int p0, boolean p1) throws android.os.RemoteException {}
        public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException { return null; }
        public android.view.SurfaceControl mirrorWallpaperSurface(int p0) throws android.os.RemoteException { return null; }
        public boolean registerWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException { return false; }
        public void unregisterWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException {}
        public void registerSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
        public void unregisterSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
        public void requestAssistScreenshot(android.app.IAssistDataReceiver p0) throws android.os.RemoteException {}
        public void hideTransientBars(int p0) throws android.os.RemoteException {}
        public void setRecentsVisibility(boolean p0) throws android.os.RemoteException {}
        public void updateStaticPrivacyIndicatorBounds(int p0, android.graphics.Rect[] p1) throws android.os.RemoteException {}
        public void setNavBarVirtualKeyHapticFeedbackEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean hasNavigationBar(int p0) throws android.os.RemoteException { return false; }
        public void lockNow(android.os.Bundle p0) throws android.os.RemoteException {}
        public boolean isSafeModeEnabled() throws android.os.RemoteException { return false; }
        public boolean clearWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public int getDockedStackSide() throws android.os.RemoteException { return 0; }
        public void registerPinnedTaskListener(int p0, android.view.IPinnedTaskListener p1) throws android.os.RemoteException {}
        public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
        public void requestImeKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
        public void getStableInsets(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void registerShortcutKey(long p0, com.android.internal.policy.IShortcutService p1) throws android.os.RemoteException {}
        public void createInputConsumer(android.os.IBinder p0, java.lang.String p1, int p2, android.view.InputChannel p3) throws android.os.RemoteException {}
        public boolean destroyInputConsumer(android.os.IBinder p0, int p1) throws android.os.RemoteException { return false; }
        public android.graphics.Region getCurrentImeTouchRegion() throws android.os.RemoteException { return null; }
        public void registerDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException {}
        public void unregisterDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException {}
        public int[] registerDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException { return null; }
        public void unregisterDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException {}
        public void startWindowTrace() throws android.os.RemoteException {}
        public void stopWindowTrace() throws android.os.RemoteException {}
        public void saveWindowTraceToFile() throws android.os.RemoteException {}
        public boolean isWindowTraceEnabled() throws android.os.RemoteException { return false; }
        public void startTransitionTrace() throws android.os.RemoteException {}
        public void stopTransitionTrace() throws android.os.RemoteException {}
        public boolean isTransitionTraceEnabled() throws android.os.RemoteException { return false; }
        public int getWindowingMode(int p0) throws android.os.RemoteException { return 0; }
        public void setWindowingMode(int p0, int p1) throws android.os.RemoteException {}
        public int getRemoveContentMode(int p0) throws android.os.RemoteException { return 0; }
        public void setRemoveContentMode(int p0, int p1) throws android.os.RemoteException {}
        public boolean shouldShowWithInsecureKeyguard(int p0) throws android.os.RemoteException { return false; }
        public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean shouldShowSystemDecors(int p0) throws android.os.RemoteException { return false; }
        public void setShouldShowSystemDecors(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isEligibleForDesktopMode(int p0) throws android.os.RemoteException { return false; }
        public int getDisplayImePolicy(int p0) throws android.os.RemoteException { return 0; }
        public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException {}
        public void onNotificationShadeExpanded(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void syncInputTransactions(boolean p0) throws android.os.RemoteException {}
        public boolean isLayerTracing() throws android.os.RemoteException { return false; }
        public void setLayerTracing(boolean p0) throws android.os.RemoteException {}
        public boolean mirrorDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
        public void setDisplayWindowInsetsController(int p0, android.view.IDisplayWindowInsetsController p1) throws android.os.RemoteException {}
        public void updateDisplayWindowRequestedVisibleTypes(int p0, int p1, int p2, android.view.inputmethod.ImeTracker.Token p3) throws android.os.RemoteException {}
        public void updateDisplayWindowAnimatingTypes(int p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public void getWindowInsets(int p0, android.os.IBinder p1, android.view.InsetsState p2) throws android.os.RemoteException {}
        public java.util.List<android.view.DisplayInfo> getPossibleDisplayInfo(int p0) throws android.os.RemoteException { return null; }
        public void showGlobalActions() throws android.os.RemoteException {}
        public void setLayerTracingFlags(int p0) throws android.os.RemoteException {}
        public void setActiveTransactionTracing(boolean p0) throws android.os.RemoteException {}
        public void requestScrollCapture(int p0, android.os.IBinder p1, int p2, android.view.IScrollCaptureResponseListener p3) throws android.os.RemoteException {}
        public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public java.lang.String[] getSupportedDisplayHashAlgorithms() throws android.os.RemoteException { return null; }
        public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) throws android.os.RemoteException { return null; }
        public void setDisplayHashThrottlingEnabled(boolean p0) throws android.os.RemoteException {}
        public android.window.WindowContextInfo attachWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException { return null; }
        public android.window.WindowContextInfo attachWindowContextToWindowToken(android.app.IApplicationThread p0, android.os.IBinder p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
        public android.window.WindowContextInfo attachWindowContextToDisplayContent(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return null; }
        public void detachWindowContext(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean reparentWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return false; }
        public boolean registerCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException { return false; }
        public void unregisterCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException {}
        public boolean isTaskSnapshotSupported() throws android.os.RemoteException { return false; }
        public int getImeDisplayId() throws android.os.RemoteException { return 0; }
        public void setTaskSnapshotEnabled(boolean p0) throws android.os.RemoteException {}
        public void registerTaskFpsCallback(int p0, android.window.ITaskFpsCallback p1) throws android.os.RemoteException {}
        public void unregisterTaskFpsCallback(android.window.ITaskFpsCallback p0) throws android.os.RemoteException {}
        public android.graphics.Bitmap snapshotTaskForRecents(int p0) throws android.os.RemoteException { return null; }
        public void setRecentsAppBehindSystemBars(boolean p0) throws android.os.RemoteException {}
        public int getLetterboxBackgroundColorInArgb() throws android.os.RemoteException { return 0; }
        public boolean isLetterboxBackgroundMultiColored() throws android.os.RemoteException { return false; }
        public void captureDisplay(int p0, android.window.ScreenCapture.CaptureArgs p1, android.window.ScreenCapture.ScreenCaptureListener p2) throws android.os.RemoteException {}
        public boolean isGlobalKey(int p0) throws android.os.RemoteException { return false; }
        public boolean addToSurfaceSyncGroup(android.os.IBinder p0, boolean p1, android.window.ISurfaceSyncGroupCompletedListener p2, android.window.AddToSurfaceSyncGroupResult p3) throws android.os.RemoteException { return false; }
        public void markSurfaceSyncGroupReady(android.os.IBinder p0) throws android.os.RemoteException {}
        public java.util.List<android.content.ComponentName> notifyScreenshotListeners(int p0) throws android.os.RemoteException { return null; }
        public boolean replaceContentOnDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
        public void registerDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException {}
        public void unregisterDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException {}
        public void registerTrustedPresentationListener(android.os.IBinder p0, android.window.ITrustedPresentationListener p1, android.window.TrustedPresentationThresholds p2, int p3) throws android.os.RemoteException {}
        public void unregisterTrustedPresentationListener(android.window.ITrustedPresentationListener p0, int p1) throws android.os.RemoteException {}
        public boolean registerScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException { return false; }
        public void unregisterScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException {}
        public void setGlobalDragListener(android.window.IGlobalDragListener p0) throws android.os.RemoteException {}
        public boolean transferTouchGesture(android.window.InputTransferToken p0, android.window.InputTransferToken p1) throws android.os.RemoteException { return false; }
        public android.view.KeyboardShortcutGroup getApplicationLaunchKeyboardShortcuts(int p0) throws android.os.RemoteException { return null; }
        public boolean getIgnoreOrientationRequest(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IWindowManager {
        public static final java.lang.String DESCRIPTOR = "android.view.IWindowManager";
        static final int TRANSACTION_startViewServer = 1;
        static final int TRANSACTION_stopViewServer = 2;
        static final int TRANSACTION_isViewServerRunning = 3;
        static final int TRANSACTION_openSession = 4;
        static final int TRANSACTION_getInitialDisplaySize = 5;
        static final int TRANSACTION_getBaseDisplaySize = 6;
        static final int TRANSACTION_setForcedDisplaySize = 7;
        static final int TRANSACTION_clearForcedDisplaySize = 8;
        static final int TRANSACTION_getInitialDisplayDensity = 9;
        static final int TRANSACTION_getBaseDisplayDensity = 10;
        static final int TRANSACTION_getDisplayIdByUniqueId = 11;
        static final int TRANSACTION_setForcedDisplayDensityForUser = 12;
        static final int TRANSACTION_clearForcedDisplayDensityForUser = 13;
        static final int TRANSACTION_setForcedDisplayDensityRatio = 14;
        static final int TRANSACTION_setConfigurationChangeSettingsForUser = 15;
        static final int TRANSACTION_setForcedDisplayScalingMode = 16;
        static final int TRANSACTION_setEventDispatching = 17;
        static final int TRANSACTION_isWindowToken = 18;
        static final int TRANSACTION_addWindowToken = 19;
        static final int TRANSACTION_removeWindowToken = 20;
        static final int TRANSACTION_setDisplayChangeWindowController = 21;
        static final int TRANSACTION_addShellRoot = 22;
        static final int TRANSACTION_setShellRootAccessibilityWindow = 23;
        static final int TRANSACTION_overridePendingAppTransitionMultiThumbFuture = 24;
        static final int TRANSACTION_overridePendingAppTransitionRemote = 25;
        static final int TRANSACTION_endProlongedAnimations = 26;
        static final int TRANSACTION_disableKeyguard = 27;
        static final int TRANSACTION_reenableKeyguard = 28;
        static final int TRANSACTION_exitKeyguardSecurely = 29;
        static final int TRANSACTION_isKeyguardLocked = 30;
        static final int TRANSACTION_isKeyguardSecure = 31;
        static final int TRANSACTION_dismissKeyguard = 32;
        static final int TRANSACTION_addKeyguardLockedStateListener = 33;
        static final int TRANSACTION_removeKeyguardLockedStateListener = 34;
        static final int TRANSACTION_setSwitchingUser = 35;
        static final int TRANSACTION_closeSystemDialogs = 36;
        static final int TRANSACTION_getAnimationScale = 37;
        static final int TRANSACTION_getAnimationScales = 38;
        static final int TRANSACTION_setAnimationScale = 39;
        static final int TRANSACTION_setAnimationScales = 40;
        static final int TRANSACTION_getCurrentAnimatorScale = 41;
        static final int TRANSACTION_setInTouchMode = 42;
        static final int TRANSACTION_setInTouchModeOnAllDisplays = 43;
        static final int TRANSACTION_isInTouchMode = 44;
        static final int TRANSACTION_showStrictModeViolation = 45;
        static final int TRANSACTION_setStrictModeVisualIndicatorPreference = 46;
        static final int TRANSACTION_refreshScreenCaptureDisabled = 47;
        static final int TRANSACTION_getDefaultDisplayRotation = 48;
        static final int TRANSACTION_getDisplayUserRotation = 49;
        static final int TRANSACTION_watchRotation = 50;
        static final int TRANSACTION_removeRotationWatcher = 51;
        static final int TRANSACTION_registerProposedRotationListener = 52;
        static final int TRANSACTION_getPreferredOptionsPanelGravity = 53;
        static final int TRANSACTION_setDeviceStateAutoRotateSetting = 54;
        static final int TRANSACTION_freezeRotation = 55;
        static final int TRANSACTION_thawRotation = 56;
        static final int TRANSACTION_isRotationFrozen = 57;
        static final int TRANSACTION_setRotationAtAngleIfAllowed = 58;
        static final int TRANSACTION_freezeDisplayRotation = 59;
        static final int TRANSACTION_thawDisplayRotation = 60;
        static final int TRANSACTION_isDisplayRotationFrozen = 61;
        static final int TRANSACTION_setFixedToUserRotation = 62;
        static final int TRANSACTION_setIgnoreOrientationRequest = 63;
        static final int TRANSACTION_screenshotWallpaper = 64;
        static final int TRANSACTION_mirrorWallpaperSurface = 65;
        static final int TRANSACTION_registerWallpaperVisibilityListener = 66;
        static final int TRANSACTION_unregisterWallpaperVisibilityListener = 67;
        static final int TRANSACTION_registerSystemGestureExclusionListener = 68;
        static final int TRANSACTION_unregisterSystemGestureExclusionListener = 69;
        static final int TRANSACTION_requestAssistScreenshot = 70;
        static final int TRANSACTION_hideTransientBars = 71;
        static final int TRANSACTION_setRecentsVisibility = 72;
        static final int TRANSACTION_updateStaticPrivacyIndicatorBounds = 73;
        static final int TRANSACTION_setNavBarVirtualKeyHapticFeedbackEnabled = 74;
        static final int TRANSACTION_hasNavigationBar = 75;
        static final int TRANSACTION_lockNow = 76;
        static final int TRANSACTION_isSafeModeEnabled = 77;
        static final int TRANSACTION_clearWindowContentFrameStats = 78;
        static final int TRANSACTION_getWindowContentFrameStats = 79;
        static final int TRANSACTION_getDockedStackSide = 80;
        static final int TRANSACTION_registerPinnedTaskListener = 81;
        static final int TRANSACTION_requestAppKeyboardShortcuts = 82;
        static final int TRANSACTION_requestImeKeyboardShortcuts = 83;
        static final int TRANSACTION_getStableInsets = 84;
        static final int TRANSACTION_registerShortcutKey = 85;
        static final int TRANSACTION_createInputConsumer = 86;
        static final int TRANSACTION_destroyInputConsumer = 87;
        static final int TRANSACTION_getCurrentImeTouchRegion = 88;
        static final int TRANSACTION_registerDisplayFoldListener = 89;
        static final int TRANSACTION_unregisterDisplayFoldListener = 90;
        static final int TRANSACTION_registerDisplayWindowListener = 91;
        static final int TRANSACTION_unregisterDisplayWindowListener = 92;
        static final int TRANSACTION_startWindowTrace = 93;
        static final int TRANSACTION_stopWindowTrace = 94;
        static final int TRANSACTION_saveWindowTraceToFile = 95;
        static final int TRANSACTION_isWindowTraceEnabled = 96;
        static final int TRANSACTION_startTransitionTrace = 97;
        static final int TRANSACTION_stopTransitionTrace = 98;
        static final int TRANSACTION_isTransitionTraceEnabled = 99;
        static final int TRANSACTION_getWindowingMode = 100;
        static final int TRANSACTION_setWindowingMode = 101;
        static final int TRANSACTION_getRemoveContentMode = 102;
        static final int TRANSACTION_setRemoveContentMode = 103;
        static final int TRANSACTION_shouldShowWithInsecureKeyguard = 104;
        static final int TRANSACTION_setShouldShowWithInsecureKeyguard = 105;
        static final int TRANSACTION_shouldShowSystemDecors = 106;
        static final int TRANSACTION_setShouldShowSystemDecors = 107;
        static final int TRANSACTION_isEligibleForDesktopMode = 108;
        static final int TRANSACTION_getDisplayImePolicy = 109;
        static final int TRANSACTION_setDisplayImePolicy = 110;
        static final int TRANSACTION_onNotificationShadeExpanded = 111;
        static final int TRANSACTION_syncInputTransactions = 112;
        static final int TRANSACTION_isLayerTracing = 113;
        static final int TRANSACTION_setLayerTracing = 114;
        static final int TRANSACTION_mirrorDisplay = 115;
        static final int TRANSACTION_setDisplayWindowInsetsController = 116;
        static final int TRANSACTION_updateDisplayWindowRequestedVisibleTypes = 117;
        static final int TRANSACTION_updateDisplayWindowAnimatingTypes = 118;
        static final int TRANSACTION_getWindowInsets = 119;
        static final int TRANSACTION_getPossibleDisplayInfo = 120;
        static final int TRANSACTION_showGlobalActions = 121;
        static final int TRANSACTION_setLayerTracingFlags = 122;
        static final int TRANSACTION_setActiveTransactionTracing = 123;
        static final int TRANSACTION_requestScrollCapture = 124;
        static final int TRANSACTION_holdLock = 125;
        static final int TRANSACTION_getSupportedDisplayHashAlgorithms = 126;
        static final int TRANSACTION_verifyDisplayHash = 127;
        static final int TRANSACTION_setDisplayHashThrottlingEnabled = 128;
        static final int TRANSACTION_attachWindowContextToDisplayArea = 129;
        static final int TRANSACTION_attachWindowContextToWindowToken = 130;
        static final int TRANSACTION_attachWindowContextToDisplayContent = 131;
        static final int TRANSACTION_detachWindowContext = 132;
        static final int TRANSACTION_reparentWindowContextToDisplayArea = 133;
        static final int TRANSACTION_registerCrossWindowBlurEnabledListener = 134;
        static final int TRANSACTION_unregisterCrossWindowBlurEnabledListener = 135;
        static final int TRANSACTION_isTaskSnapshotSupported = 136;
        static final int TRANSACTION_getImeDisplayId = 137;
        static final int TRANSACTION_setTaskSnapshotEnabled = 138;
        static final int TRANSACTION_registerTaskFpsCallback = 139;
        static final int TRANSACTION_unregisterTaskFpsCallback = 140;
        static final int TRANSACTION_snapshotTaskForRecents = 141;
        static final int TRANSACTION_setRecentsAppBehindSystemBars = 142;
        static final int TRANSACTION_getLetterboxBackgroundColorInArgb = 143;
        static final int TRANSACTION_isLetterboxBackgroundMultiColored = 144;
        static final int TRANSACTION_captureDisplay = 145;
        static final int TRANSACTION_isGlobalKey = 146;
        static final int TRANSACTION_addToSurfaceSyncGroup = 147;
        static final int TRANSACTION_markSurfaceSyncGroupReady = 148;
        static final int TRANSACTION_notifyScreenshotListeners = 149;
        static final int TRANSACTION_replaceContentOnDisplay = 150;
        static final int TRANSACTION_registerDecorViewGestureListener = 151;
        static final int TRANSACTION_unregisterDecorViewGestureListener = 152;
        static final int TRANSACTION_registerTrustedPresentationListener = 153;
        static final int TRANSACTION_unregisterTrustedPresentationListener = 154;
        static final int TRANSACTION_registerScreenRecordingCallback = 155;
        static final int TRANSACTION_unregisterScreenRecordingCallback = 156;
        static final int TRANSACTION_setGlobalDragListener = 157;
        static final int TRANSACTION_transferTouchGesture = 158;
        static final int TRANSACTION_getApplicationLaunchKeyboardShortcuts = 159;
        static final int TRANSACTION_getIgnoreOrientationRequest = 160;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.view.IWindowManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setForcedDisplaySize_enforcePermission() throws java.lang.SecurityException {}
        protected void clearForcedDisplaySize_enforcePermission() throws java.lang.SecurityException {}
        protected void setForcedDisplayDensityForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void clearForcedDisplayDensityForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void setForcedDisplayDensityRatio_enforcePermission() throws java.lang.SecurityException {}
        protected void setConfigurationChangeSettingsForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void setForcedDisplayScalingMode_enforcePermission() throws java.lang.SecurityException {}
        protected void addShellRoot_enforcePermission() throws java.lang.SecurityException {}
        protected void setShellRootAccessibilityWindow_enforcePermission() throws java.lang.SecurityException {}
        protected void exitKeyguardSecurely_enforcePermission() throws java.lang.SecurityException {}
        protected void setNavBarVirtualKeyHapticFeedbackEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void getCurrentImeTouchRegion_enforcePermission() throws java.lang.SecurityException {}
        protected void setDisplayWindowInsetsController_enforcePermission() throws java.lang.SecurityException {}
        protected void updateDisplayWindowRequestedVisibleTypes_enforcePermission() throws java.lang.SecurityException {}
        protected void updateDisplayWindowAnimatingTypes_enforcePermission() throws java.lang.SecurityException {}
        protected void registerScreenRecordingCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterScreenRecordingCallback_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.IWindowManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean startViewServer(int p0) throws android.os.RemoteException { return false; }
            public boolean stopViewServer() throws android.os.RemoteException { return false; }
            public boolean isViewServerRunning() throws android.os.RemoteException { return false; }
            public android.view.IWindowSession openSession(android.view.IWindowSessionCallback p0) throws android.os.RemoteException { return null; }
            public void getInitialDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
            public void getBaseDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
            public void setForcedDisplaySize(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void clearForcedDisplaySize(int p0) throws android.os.RemoteException {}
            public int getInitialDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
            public int getBaseDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
            public int getDisplayIdByUniqueId(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void setForcedDisplayDensityForUser(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void clearForcedDisplayDensityForUser(int p0, int p1) throws android.os.RemoteException {}
            public void setForcedDisplayDensityRatio(int p0, float p1, int p2) throws android.os.RemoteException {}
            public void setConfigurationChangeSettingsForUser(java.util.List<android.window.ConfigurationChangeSetting> p0, int p1) throws android.os.RemoteException {}
            public void setForcedDisplayScalingMode(int p0, int p1) throws android.os.RemoteException {}
            public void setEventDispatching(boolean p0) throws android.os.RemoteException {}
            public boolean isWindowToken(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void addWindowToken(android.os.IBinder p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void removeWindowToken(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void setDisplayChangeWindowController(android.view.IDisplayChangeWindowController p0) throws android.os.RemoteException {}
            public android.view.SurfaceControl addShellRoot(int p0, android.view.IWindow p1, int p2) throws android.os.RemoteException { return null; }
            public void setShellRootAccessibilityWindow(int p0, int p1, android.view.IWindow p2) throws android.os.RemoteException {}
            public void overridePendingAppTransitionMultiThumbFuture(android.view.IAppTransitionAnimationSpecsFuture p0, android.os.IRemoteCallback p1, boolean p2, int p3) throws android.os.RemoteException {}
            public void overridePendingAppTransitionRemote(android.view.RemoteAnimationAdapter p0, int p1) throws android.os.RemoteException {}
            public void endProlongedAnimations() throws android.os.RemoteException {}
            public void disableKeyguard(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void reenableKeyguard(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void exitKeyguardSecurely(android.view.IOnKeyguardExitResult p0) throws android.os.RemoteException {}
            public boolean isKeyguardLocked() throws android.os.RemoteException { return false; }
            public boolean isKeyguardSecure(int p0) throws android.os.RemoteException { return false; }
            public void dismissKeyguard(com.android.internal.policy.IKeyguardDismissCallback p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public void addKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException {}
            public void removeKeyguardLockedStateListener(com.android.internal.policy.IKeyguardLockedStateListener p0) throws android.os.RemoteException {}
            public void setSwitchingUser(boolean p0) throws android.os.RemoteException {}
            public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
            public float getAnimationScale(int p0) throws android.os.RemoteException { return 0.0f; }
            public float[] getAnimationScales() throws android.os.RemoteException { return null; }
            public void setAnimationScale(int p0, float p1) throws android.os.RemoteException {}
            public void setAnimationScales(float[] p0) throws android.os.RemoteException {}
            public float getCurrentAnimatorScale() throws android.os.RemoteException { return 0.0f; }
            public void setInTouchMode(boolean p0, int p1) throws android.os.RemoteException {}
            public void setInTouchModeOnAllDisplays(boolean p0) throws android.os.RemoteException {}
            public boolean isInTouchMode(int p0) throws android.os.RemoteException { return false; }
            public void showStrictModeViolation(boolean p0) throws android.os.RemoteException {}
            public void setStrictModeVisualIndicatorPreference(java.lang.String p0) throws android.os.RemoteException {}
            public void refreshScreenCaptureDisabled() throws android.os.RemoteException {}
            public int getDefaultDisplayRotation() throws android.os.RemoteException { return 0; }
            public int getDisplayUserRotation(int p0) throws android.os.RemoteException { return 0; }
            public int watchRotation(android.view.IRotationWatcher p0, int p1) throws android.os.RemoteException { return 0; }
            public void removeRotationWatcher(android.view.IRotationWatcher p0) throws android.os.RemoteException {}
            public int registerProposedRotationListener(android.os.IBinder p0, android.view.IRotationWatcher p1) throws android.os.RemoteException { return 0; }
            public int getPreferredOptionsPanelGravity(int p0) throws android.os.RemoteException { return 0; }
            public void setDeviceStateAutoRotateSetting(int p0, boolean p1) throws android.os.RemoteException {}
            public void freezeRotation(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void thawRotation(java.lang.String p0) throws android.os.RemoteException {}
            public boolean isRotationFrozen() throws android.os.RemoteException { return false; }
            public void setRotationAtAngleIfAllowed(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void freezeDisplayRotation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void thawDisplayRotation(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean isDisplayRotationFrozen(int p0) throws android.os.RemoteException { return false; }
            public void setFixedToUserRotation(int p0, int p1) throws android.os.RemoteException {}
            public void setIgnoreOrientationRequest(int p0, boolean p1) throws android.os.RemoteException {}
            public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException { return null; }
            public android.view.SurfaceControl mirrorWallpaperSurface(int p0) throws android.os.RemoteException { return null; }
            public boolean registerWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException { return false; }
            public void unregisterWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException {}
            public void registerSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
            public void unregisterSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
            public void requestAssistScreenshot(android.app.IAssistDataReceiver p0) throws android.os.RemoteException {}
            public void hideTransientBars(int p0) throws android.os.RemoteException {}
            public void setRecentsVisibility(boolean p0) throws android.os.RemoteException {}
            public void updateStaticPrivacyIndicatorBounds(int p0, android.graphics.Rect[] p1) throws android.os.RemoteException {}
            public void setNavBarVirtualKeyHapticFeedbackEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean hasNavigationBar(int p0) throws android.os.RemoteException { return false; }
            public void lockNow(android.os.Bundle p0) throws android.os.RemoteException {}
            public boolean isSafeModeEnabled() throws android.os.RemoteException { return false; }
            public boolean clearWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public int getDockedStackSide() throws android.os.RemoteException { return 0; }
            public void registerPinnedTaskListener(int p0, android.view.IPinnedTaskListener p1) throws android.os.RemoteException {}
            public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
            public void requestImeKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
            public void getStableInsets(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void registerShortcutKey(long p0, com.android.internal.policy.IShortcutService p1) throws android.os.RemoteException {}
            public void createInputConsumer(android.os.IBinder p0, java.lang.String p1, int p2, android.view.InputChannel p3) throws android.os.RemoteException {}
            public boolean destroyInputConsumer(android.os.IBinder p0, int p1) throws android.os.RemoteException { return false; }
            public android.graphics.Region getCurrentImeTouchRegion() throws android.os.RemoteException { return null; }
            public void registerDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException {}
            public void unregisterDisplayFoldListener(android.view.IDisplayFoldListener p0) throws android.os.RemoteException {}
            public int[] registerDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException { return null; }
            public void unregisterDisplayWindowListener(android.view.IDisplayWindowListener p0) throws android.os.RemoteException {}
            public void startWindowTrace() throws android.os.RemoteException {}
            public void stopWindowTrace() throws android.os.RemoteException {}
            public void saveWindowTraceToFile() throws android.os.RemoteException {}
            public boolean isWindowTraceEnabled() throws android.os.RemoteException { return false; }
            public void startTransitionTrace() throws android.os.RemoteException {}
            public void stopTransitionTrace() throws android.os.RemoteException {}
            public boolean isTransitionTraceEnabled() throws android.os.RemoteException { return false; }
            public int getWindowingMode(int p0) throws android.os.RemoteException { return 0; }
            public void setWindowingMode(int p0, int p1) throws android.os.RemoteException {}
            public int getRemoveContentMode(int p0) throws android.os.RemoteException { return 0; }
            public void setRemoveContentMode(int p0, int p1) throws android.os.RemoteException {}
            public boolean shouldShowWithInsecureKeyguard(int p0) throws android.os.RemoteException { return false; }
            public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean shouldShowSystemDecors(int p0) throws android.os.RemoteException { return false; }
            public void setShouldShowSystemDecors(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isEligibleForDesktopMode(int p0) throws android.os.RemoteException { return false; }
            public int getDisplayImePolicy(int p0) throws android.os.RemoteException { return 0; }
            public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException {}
            public void onNotificationShadeExpanded(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void syncInputTransactions(boolean p0) throws android.os.RemoteException {}
            public boolean isLayerTracing() throws android.os.RemoteException { return false; }
            public void setLayerTracing(boolean p0) throws android.os.RemoteException {}
            public boolean mirrorDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
            public void setDisplayWindowInsetsController(int p0, android.view.IDisplayWindowInsetsController p1) throws android.os.RemoteException {}
            public void updateDisplayWindowRequestedVisibleTypes(int p0, int p1, int p2, android.view.inputmethod.ImeTracker.Token p3) throws android.os.RemoteException {}
            public void updateDisplayWindowAnimatingTypes(int p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
            public void getWindowInsets(int p0, android.os.IBinder p1, android.view.InsetsState p2) throws android.os.RemoteException {}
            public java.util.List<android.view.DisplayInfo> getPossibleDisplayInfo(int p0) throws android.os.RemoteException { return null; }
            public void showGlobalActions() throws android.os.RemoteException {}
            public void setLayerTracingFlags(int p0) throws android.os.RemoteException {}
            public void setActiveTransactionTracing(boolean p0) throws android.os.RemoteException {}
            public void requestScrollCapture(int p0, android.os.IBinder p1, int p2, android.view.IScrollCaptureResponseListener p3) throws android.os.RemoteException {}
            public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public java.lang.String[] getSupportedDisplayHashAlgorithms() throws android.os.RemoteException { return null; }
            public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) throws android.os.RemoteException { return null; }
            public void setDisplayHashThrottlingEnabled(boolean p0) throws android.os.RemoteException {}
            public android.window.WindowContextInfo attachWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException { return null; }
            public android.window.WindowContextInfo attachWindowContextToWindowToken(android.app.IApplicationThread p0, android.os.IBinder p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
            public android.window.WindowContextInfo attachWindowContextToDisplayContent(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return null; }
            public void detachWindowContext(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean reparentWindowContextToDisplayArea(android.app.IApplicationThread p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return false; }
            public boolean registerCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException { return false; }
            public void unregisterCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException {}
            public boolean isTaskSnapshotSupported() throws android.os.RemoteException { return false; }
            public int getImeDisplayId() throws android.os.RemoteException { return 0; }
            public void setTaskSnapshotEnabled(boolean p0) throws android.os.RemoteException {}
            public void registerTaskFpsCallback(int p0, android.window.ITaskFpsCallback p1) throws android.os.RemoteException {}
            public void unregisterTaskFpsCallback(android.window.ITaskFpsCallback p0) throws android.os.RemoteException {}
            public android.graphics.Bitmap snapshotTaskForRecents(int p0) throws android.os.RemoteException { return null; }
            public void setRecentsAppBehindSystemBars(boolean p0) throws android.os.RemoteException {}
            public int getLetterboxBackgroundColorInArgb() throws android.os.RemoteException { return 0; }
            public boolean isLetterboxBackgroundMultiColored() throws android.os.RemoteException { return false; }
            public void captureDisplay(int p0, android.window.ScreenCapture.CaptureArgs p1, android.window.ScreenCapture.ScreenCaptureListener p2) throws android.os.RemoteException {}
            public boolean isGlobalKey(int p0) throws android.os.RemoteException { return false; }
            public boolean addToSurfaceSyncGroup(android.os.IBinder p0, boolean p1, android.window.ISurfaceSyncGroupCompletedListener p2, android.window.AddToSurfaceSyncGroupResult p3) throws android.os.RemoteException { return false; }
            public void markSurfaceSyncGroupReady(android.os.IBinder p0) throws android.os.RemoteException {}
            public java.util.List<android.content.ComponentName> notifyScreenshotListeners(int p0) throws android.os.RemoteException { return null; }
            public boolean replaceContentOnDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
            public void registerDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException {}
            public void unregisterDecorViewGestureListener(android.view.IDecorViewGestureListener p0, int p1) throws android.os.RemoteException {}
            public void registerTrustedPresentationListener(android.os.IBinder p0, android.window.ITrustedPresentationListener p1, android.window.TrustedPresentationThresholds p2, int p3) throws android.os.RemoteException {}
            public void unregisterTrustedPresentationListener(android.window.ITrustedPresentationListener p0, int p1) throws android.os.RemoteException {}
            public boolean registerScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException { return false; }
            public void unregisterScreenRecordingCallback(android.window.IScreenRecordingCallback p0) throws android.os.RemoteException {}
            public void setGlobalDragListener(android.window.IGlobalDragListener p0) throws android.os.RemoteException {}
            public boolean transferTouchGesture(android.window.InputTransferToken p0, android.window.InputTransferToken p1) throws android.os.RemoteException { return false; }
            public android.view.KeyboardShortcutGroup getApplicationLaunchKeyboardShortcuts(int p0) throws android.os.RemoteException { return null; }
            public boolean getIgnoreOrientationRequest(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
