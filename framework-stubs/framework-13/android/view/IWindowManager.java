package android.view;

public interface IWindowManager extends android.os.IInterface {
    public static final int FIXED_TO_USER_ROTATION_DEFAULT = 0;
    public static final int FIXED_TO_USER_ROTATION_DISABLED = 1;
    public static final int FIXED_TO_USER_ROTATION_ENABLED = 2;
    public boolean startViewServer(int p0) throws android.os.RemoteException;
    public boolean stopViewServer() throws android.os.RemoteException;
    public boolean isViewServerRunning() throws android.os.RemoteException;
    public android.view.IWindowSession openSession(android.view.IWindowSessionCallback p0) throws android.os.RemoteException;
    public boolean useBLAST() throws android.os.RemoteException;
    public void getInitialDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException;
    public void getBaseDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException;
    public void setForcedDisplaySize(int p0, int p1, int p2) throws android.os.RemoteException;
    public void clearForcedDisplaySize(int p0) throws android.os.RemoteException;
    public int getInitialDisplayDensity(int p0) throws android.os.RemoteException;
    public int getBaseDisplayDensity(int p0) throws android.os.RemoteException;
    public void setForcedDisplayDensityForUser(int p0, int p1, int p2) throws android.os.RemoteException;
    public void clearForcedDisplayDensityForUser(int p0, int p1) throws android.os.RemoteException;
    public void setForcedDisplayScalingMode(int p0, int p1) throws android.os.RemoteException;
    public void setEventDispatching(boolean p0) throws android.os.RemoteException;
    public boolean isWindowToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void addWindowToken(android.os.IBinder p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void removeWindowToken(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void setDisplayChangeWindowController(android.view.IDisplayChangeWindowController p0) throws android.os.RemoteException;
    public android.view.SurfaceControl addShellRoot(int p0, android.view.IWindow p1, int p2) throws android.os.RemoteException;
    public void setShellRootAccessibilityWindow(int p0, int p1, android.view.IWindow p2) throws android.os.RemoteException;
    public void overridePendingAppTransitionMultiThumbFuture(android.view.IAppTransitionAnimationSpecsFuture p0, android.os.IRemoteCallback p1, boolean p2, int p3) throws android.os.RemoteException;
    public void overridePendingAppTransitionRemote(android.view.RemoteAnimationAdapter p0, int p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void endProlongedAnimations() throws android.os.RemoteException;
    public void startFreezingScreen(int p0, int p1) throws android.os.RemoteException;
    public void stopFreezingScreen() throws android.os.RemoteException;
    @java.lang.Deprecated
    public void disableKeyguard(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void reenableKeyguard(android.os.IBinder p0, int p1) throws android.os.RemoteException;
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
    public void setInTouchMode(boolean p0) throws android.os.RemoteException;
    public void showStrictModeViolation(boolean p0) throws android.os.RemoteException;
    public void setStrictModeVisualIndicatorPreference(java.lang.String p0) throws android.os.RemoteException;
    public void refreshScreenCaptureDisabled() throws android.os.RemoteException;
    public int getDefaultDisplayRotation() throws android.os.RemoteException;
    public int watchRotation(android.view.IRotationWatcher p0, int p1) throws android.os.RemoteException;
    public void removeRotationWatcher(android.view.IRotationWatcher p0) throws android.os.RemoteException;
    public int getPreferredOptionsPanelGravity(int p0) throws android.os.RemoteException;
    public void freezeRotation(int p0) throws android.os.RemoteException;
    public void thawRotation() throws android.os.RemoteException;
    public boolean isRotationFrozen() throws android.os.RemoteException;
    public void freezeDisplayRotation(int p0, int p1) throws android.os.RemoteException;
    public void thawDisplayRotation(int p0) throws android.os.RemoteException;
    public boolean isDisplayRotationFrozen(int p0) throws android.os.RemoteException;
    public void setFixedToUserRotation(int p0, int p1) throws android.os.RemoteException;
    public void setIgnoreOrientationRequest(int p0, boolean p1) throws android.os.RemoteException;
    public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException;
    public android.view.SurfaceControl mirrorWallpaperSurface(int p0) throws android.os.RemoteException;
    public boolean registerWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException;
    public void unregisterWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException;
    public void registerSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException;
    public void unregisterSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException;
    public boolean requestAssistScreenshot(android.app.IAssistDataReceiver p0) throws android.os.RemoteException;
    public void hideTransientBars(int p0) throws android.os.RemoteException;
    public void setRecentsVisibility(boolean p0) throws android.os.RemoteException;
    public void updateStaticPrivacyIndicatorBounds(int p0, android.graphics.Rect[] p1) throws android.os.RemoteException;
    public void setNavBarVirtualKeyHapticFeedbackEnabled(boolean p0) throws android.os.RemoteException;
    public boolean hasNavigationBar(int p0) throws android.os.RemoteException;
    public void lockNow(android.os.Bundle p0) throws android.os.RemoteException;
    public boolean isSafeModeEnabled() throws android.os.RemoteException;
    public boolean clearWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException;
    public android.view.WindowContentFrameStats getWindowContentFrameStats(android.os.IBinder p0) throws android.os.RemoteException;
    public int getDockedStackSide() throws android.os.RemoteException;
    public void setDockedTaskDividerTouchRegion(android.graphics.Rect p0) throws android.os.RemoteException;
    public void registerPinnedTaskListener(int p0, android.view.IPinnedTaskListener p1) throws android.os.RemoteException;
    public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException;
    public void getStableInsets(int p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void registerShortcutKey(long p0, com.android.internal.policy.IShortcutService p1) throws android.os.RemoteException;
    public void createInputConsumer(android.os.IBinder p0, java.lang.String p1, int p2, android.view.InputChannel p3) throws android.os.RemoteException;
    public boolean destroyInputConsumer(java.lang.String p0, int p1) throws android.os.RemoteException;
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
    public int getDisplayImePolicy(int p0) throws android.os.RemoteException;
    public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException;
    public void syncInputTransactions(boolean p0) throws android.os.RemoteException;
    public boolean isLayerTracing() throws android.os.RemoteException;
    public void setLayerTracing(boolean p0) throws android.os.RemoteException;
    public boolean mirrorDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException;
    public void setDisplayWindowInsetsController(int p0, android.view.IDisplayWindowInsetsController p1) throws android.os.RemoteException;
    public void updateDisplayWindowRequestedVisibilities(int p0, android.view.InsetsVisibilities p1) throws android.os.RemoteException;
    public boolean getWindowInsets(android.view.WindowManager.LayoutParams p0, int p1, android.view.InsetsState p2) throws android.os.RemoteException;
    public java.util.List<android.view.DisplayInfo> getPossibleDisplayInfo(int p0) throws android.os.RemoteException;
    public void showGlobalActions() throws android.os.RemoteException;
    public void setLayerTracingFlags(int p0) throws android.os.RemoteException;
    public void requestScrollCapture(int p0, android.os.IBinder p1, int p2, android.view.IScrollCaptureResponseListener p3) throws android.os.RemoteException;
    public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public java.lang.String[] getSupportedDisplayHashAlgorithms() throws android.os.RemoteException;
    public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) throws android.os.RemoteException;
    public void setDisplayHashThrottlingEnabled(boolean p0) throws android.os.RemoteException;
    public android.content.res.Configuration attachWindowContextToDisplayArea(android.os.IBinder p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void attachWindowContextToWindowToken(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.content.res.Configuration attachToDisplayContent(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void detachWindowContextFromWindowContainer(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean registerCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException;
    public void unregisterCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException;
    public boolean isTaskSnapshotSupported() throws android.os.RemoteException;
    public int getImeDisplayId() throws android.os.RemoteException;
    public void setTaskSnapshotEnabled(boolean p0) throws android.os.RemoteException;
    public void setTaskTransitionSpec(android.view.TaskTransitionSpec p0) throws android.os.RemoteException;
    public void clearTaskTransitionSpec() throws android.os.RemoteException;
    public void registerTaskFpsCallback(int p0, android.window.ITaskFpsCallback p1) throws android.os.RemoteException;
    public void unregisterTaskFpsCallback(android.window.ITaskFpsCallback p0) throws android.os.RemoteException;
    public android.graphics.Bitmap snapshotTaskForRecents(int p0) throws android.os.RemoteException;
    public void setRecentsAppBehindSystemBars(boolean p0) throws android.os.RemoteException;
    public int getLetterboxBackgroundColorInArgb() throws android.os.RemoteException;
    public boolean isLetterboxBackgroundMultiColored() throws android.os.RemoteException;
    public void onOverlayChanged() throws android.os.RemoteException;

    public static class Default implements android.view.IWindowManager {
        public Default() {}
        public boolean startViewServer(int p0) throws android.os.RemoteException { return false; }
        public boolean stopViewServer() throws android.os.RemoteException { return false; }
        public boolean isViewServerRunning() throws android.os.RemoteException { return false; }
        public android.view.IWindowSession openSession(android.view.IWindowSessionCallback p0) throws android.os.RemoteException { return null; }
        public boolean useBLAST() throws android.os.RemoteException { return false; }
        public void getInitialDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
        public void getBaseDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
        public void setForcedDisplaySize(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void clearForcedDisplaySize(int p0) throws android.os.RemoteException {}
        public int getInitialDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
        public int getBaseDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
        public void setForcedDisplayDensityForUser(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void clearForcedDisplayDensityForUser(int p0, int p1) throws android.os.RemoteException {}
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
        public void startFreezingScreen(int p0, int p1) throws android.os.RemoteException {}
        public void stopFreezingScreen() throws android.os.RemoteException {}
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
        public void setInTouchMode(boolean p0) throws android.os.RemoteException {}
        public void showStrictModeViolation(boolean p0) throws android.os.RemoteException {}
        public void setStrictModeVisualIndicatorPreference(java.lang.String p0) throws android.os.RemoteException {}
        public void refreshScreenCaptureDisabled() throws android.os.RemoteException {}
        public int getDefaultDisplayRotation() throws android.os.RemoteException { return 0; }
        public int watchRotation(android.view.IRotationWatcher p0, int p1) throws android.os.RemoteException { return 0; }
        public void removeRotationWatcher(android.view.IRotationWatcher p0) throws android.os.RemoteException {}
        public int getPreferredOptionsPanelGravity(int p0) throws android.os.RemoteException { return 0; }
        public void freezeRotation(int p0) throws android.os.RemoteException {}
        public void thawRotation() throws android.os.RemoteException {}
        public boolean isRotationFrozen() throws android.os.RemoteException { return false; }
        public void freezeDisplayRotation(int p0, int p1) throws android.os.RemoteException {}
        public void thawDisplayRotation(int p0) throws android.os.RemoteException {}
        public boolean isDisplayRotationFrozen(int p0) throws android.os.RemoteException { return false; }
        public void setFixedToUserRotation(int p0, int p1) throws android.os.RemoteException {}
        public void setIgnoreOrientationRequest(int p0, boolean p1) throws android.os.RemoteException {}
        public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException { return null; }
        public android.view.SurfaceControl mirrorWallpaperSurface(int p0) throws android.os.RemoteException { return null; }
        public boolean registerWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException { return false; }
        public void unregisterWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException {}
        public void registerSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
        public void unregisterSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
        public boolean requestAssistScreenshot(android.app.IAssistDataReceiver p0) throws android.os.RemoteException { return false; }
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
        public void setDockedTaskDividerTouchRegion(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void registerPinnedTaskListener(int p0, android.view.IPinnedTaskListener p1) throws android.os.RemoteException {}
        public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
        public void getStableInsets(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void registerShortcutKey(long p0, com.android.internal.policy.IShortcutService p1) throws android.os.RemoteException {}
        public void createInputConsumer(android.os.IBinder p0, java.lang.String p1, int p2, android.view.InputChannel p3) throws android.os.RemoteException {}
        public boolean destroyInputConsumer(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
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
        public int getDisplayImePolicy(int p0) throws android.os.RemoteException { return 0; }
        public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException {}
        public void syncInputTransactions(boolean p0) throws android.os.RemoteException {}
        public boolean isLayerTracing() throws android.os.RemoteException { return false; }
        public void setLayerTracing(boolean p0) throws android.os.RemoteException {}
        public boolean mirrorDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
        public void setDisplayWindowInsetsController(int p0, android.view.IDisplayWindowInsetsController p1) throws android.os.RemoteException {}
        public void updateDisplayWindowRequestedVisibilities(int p0, android.view.InsetsVisibilities p1) throws android.os.RemoteException {}
        public boolean getWindowInsets(android.view.WindowManager.LayoutParams p0, int p1, android.view.InsetsState p2) throws android.os.RemoteException { return false; }
        public java.util.List<android.view.DisplayInfo> getPossibleDisplayInfo(int p0) throws android.os.RemoteException { return null; }
        public void showGlobalActions() throws android.os.RemoteException {}
        public void setLayerTracingFlags(int p0) throws android.os.RemoteException {}
        public void requestScrollCapture(int p0, android.os.IBinder p1, int p2, android.view.IScrollCaptureResponseListener p3) throws android.os.RemoteException {}
        public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public java.lang.String[] getSupportedDisplayHashAlgorithms() throws android.os.RemoteException { return null; }
        public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) throws android.os.RemoteException { return null; }
        public void setDisplayHashThrottlingEnabled(boolean p0) throws android.os.RemoteException {}
        public android.content.res.Configuration attachWindowContextToDisplayArea(android.os.IBinder p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
        public void attachWindowContextToWindowToken(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.content.res.Configuration attachToDisplayContent(android.os.IBinder p0, int p1) throws android.os.RemoteException { return null; }
        public void detachWindowContextFromWindowContainer(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean registerCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException { return false; }
        public void unregisterCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException {}
        public boolean isTaskSnapshotSupported() throws android.os.RemoteException { return false; }
        public int getImeDisplayId() throws android.os.RemoteException { return 0; }
        public void setTaskSnapshotEnabled(boolean p0) throws android.os.RemoteException {}
        public void setTaskTransitionSpec(android.view.TaskTransitionSpec p0) throws android.os.RemoteException {}
        public void clearTaskTransitionSpec() throws android.os.RemoteException {}
        public void registerTaskFpsCallback(int p0, android.window.ITaskFpsCallback p1) throws android.os.RemoteException {}
        public void unregisterTaskFpsCallback(android.window.ITaskFpsCallback p0) throws android.os.RemoteException {}
        public android.graphics.Bitmap snapshotTaskForRecents(int p0) throws android.os.RemoteException { return null; }
        public void setRecentsAppBehindSystemBars(boolean p0) throws android.os.RemoteException {}
        public int getLetterboxBackgroundColorInArgb() throws android.os.RemoteException { return 0; }
        public boolean isLetterboxBackgroundMultiColored() throws android.os.RemoteException { return false; }
        public void onOverlayChanged() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IWindowManager {
        public static final java.lang.String DESCRIPTOR = "android.view.IWindowManager";
        static final int TRANSACTION_startViewServer = 1;
        static final int TRANSACTION_stopViewServer = 2;
        static final int TRANSACTION_isViewServerRunning = 3;
        static final int TRANSACTION_openSession = 4;
        static final int TRANSACTION_useBLAST = 5;
        static final int TRANSACTION_getInitialDisplaySize = 6;
        static final int TRANSACTION_getBaseDisplaySize = 7;
        static final int TRANSACTION_setForcedDisplaySize = 8;
        static final int TRANSACTION_clearForcedDisplaySize = 9;
        static final int TRANSACTION_getInitialDisplayDensity = 10;
        static final int TRANSACTION_getBaseDisplayDensity = 11;
        static final int TRANSACTION_setForcedDisplayDensityForUser = 12;
        static final int TRANSACTION_clearForcedDisplayDensityForUser = 13;
        static final int TRANSACTION_setForcedDisplayScalingMode = 14;
        static final int TRANSACTION_setEventDispatching = 15;
        static final int TRANSACTION_isWindowToken = 16;
        static final int TRANSACTION_addWindowToken = 17;
        static final int TRANSACTION_removeWindowToken = 18;
        static final int TRANSACTION_setDisplayChangeWindowController = 19;
        static final int TRANSACTION_addShellRoot = 20;
        static final int TRANSACTION_setShellRootAccessibilityWindow = 21;
        static final int TRANSACTION_overridePendingAppTransitionMultiThumbFuture = 22;
        static final int TRANSACTION_overridePendingAppTransitionRemote = 23;
        static final int TRANSACTION_endProlongedAnimations = 24;
        static final int TRANSACTION_startFreezingScreen = 25;
        static final int TRANSACTION_stopFreezingScreen = 26;
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
        static final int TRANSACTION_showStrictModeViolation = 43;
        static final int TRANSACTION_setStrictModeVisualIndicatorPreference = 44;
        static final int TRANSACTION_refreshScreenCaptureDisabled = 45;
        static final int TRANSACTION_getDefaultDisplayRotation = 46;
        static final int TRANSACTION_watchRotation = 47;
        static final int TRANSACTION_removeRotationWatcher = 48;
        static final int TRANSACTION_getPreferredOptionsPanelGravity = 49;
        static final int TRANSACTION_freezeRotation = 50;
        static final int TRANSACTION_thawRotation = 51;
        static final int TRANSACTION_isRotationFrozen = 52;
        static final int TRANSACTION_freezeDisplayRotation = 53;
        static final int TRANSACTION_thawDisplayRotation = 54;
        static final int TRANSACTION_isDisplayRotationFrozen = 55;
        static final int TRANSACTION_setFixedToUserRotation = 56;
        static final int TRANSACTION_setIgnoreOrientationRequest = 57;
        static final int TRANSACTION_screenshotWallpaper = 58;
        static final int TRANSACTION_mirrorWallpaperSurface = 59;
        static final int TRANSACTION_registerWallpaperVisibilityListener = 60;
        static final int TRANSACTION_unregisterWallpaperVisibilityListener = 61;
        static final int TRANSACTION_registerSystemGestureExclusionListener = 62;
        static final int TRANSACTION_unregisterSystemGestureExclusionListener = 63;
        static final int TRANSACTION_requestAssistScreenshot = 64;
        static final int TRANSACTION_hideTransientBars = 65;
        static final int TRANSACTION_setRecentsVisibility = 66;
        static final int TRANSACTION_updateStaticPrivacyIndicatorBounds = 67;
        static final int TRANSACTION_setNavBarVirtualKeyHapticFeedbackEnabled = 68;
        static final int TRANSACTION_hasNavigationBar = 69;
        static final int TRANSACTION_lockNow = 70;
        static final int TRANSACTION_isSafeModeEnabled = 71;
        static final int TRANSACTION_clearWindowContentFrameStats = 72;
        static final int TRANSACTION_getWindowContentFrameStats = 73;
        static final int TRANSACTION_getDockedStackSide = 74;
        static final int TRANSACTION_setDockedTaskDividerTouchRegion = 75;
        static final int TRANSACTION_registerPinnedTaskListener = 76;
        static final int TRANSACTION_requestAppKeyboardShortcuts = 77;
        static final int TRANSACTION_getStableInsets = 78;
        static final int TRANSACTION_registerShortcutKey = 79;
        static final int TRANSACTION_createInputConsumer = 80;
        static final int TRANSACTION_destroyInputConsumer = 81;
        static final int TRANSACTION_getCurrentImeTouchRegion = 82;
        static final int TRANSACTION_registerDisplayFoldListener = 83;
        static final int TRANSACTION_unregisterDisplayFoldListener = 84;
        static final int TRANSACTION_registerDisplayWindowListener = 85;
        static final int TRANSACTION_unregisterDisplayWindowListener = 86;
        static final int TRANSACTION_startWindowTrace = 87;
        static final int TRANSACTION_stopWindowTrace = 88;
        static final int TRANSACTION_saveWindowTraceToFile = 89;
        static final int TRANSACTION_isWindowTraceEnabled = 90;
        static final int TRANSACTION_startTransitionTrace = 91;
        static final int TRANSACTION_stopTransitionTrace = 92;
        static final int TRANSACTION_isTransitionTraceEnabled = 93;
        static final int TRANSACTION_getWindowingMode = 94;
        static final int TRANSACTION_setWindowingMode = 95;
        static final int TRANSACTION_getRemoveContentMode = 96;
        static final int TRANSACTION_setRemoveContentMode = 97;
        static final int TRANSACTION_shouldShowWithInsecureKeyguard = 98;
        static final int TRANSACTION_setShouldShowWithInsecureKeyguard = 99;
        static final int TRANSACTION_shouldShowSystemDecors = 100;
        static final int TRANSACTION_setShouldShowSystemDecors = 101;
        static final int TRANSACTION_getDisplayImePolicy = 102;
        static final int TRANSACTION_setDisplayImePolicy = 103;
        static final int TRANSACTION_syncInputTransactions = 104;
        static final int TRANSACTION_isLayerTracing = 105;
        static final int TRANSACTION_setLayerTracing = 106;
        static final int TRANSACTION_mirrorDisplay = 107;
        static final int TRANSACTION_setDisplayWindowInsetsController = 108;
        static final int TRANSACTION_updateDisplayWindowRequestedVisibilities = 109;
        static final int TRANSACTION_getWindowInsets = 110;
        static final int TRANSACTION_getPossibleDisplayInfo = 111;
        static final int TRANSACTION_showGlobalActions = 112;
        static final int TRANSACTION_setLayerTracingFlags = 113;
        static final int TRANSACTION_requestScrollCapture = 114;
        static final int TRANSACTION_holdLock = 115;
        static final int TRANSACTION_getSupportedDisplayHashAlgorithms = 116;
        static final int TRANSACTION_verifyDisplayHash = 117;
        static final int TRANSACTION_setDisplayHashThrottlingEnabled = 118;
        static final int TRANSACTION_attachWindowContextToDisplayArea = 119;
        static final int TRANSACTION_attachWindowContextToWindowToken = 120;
        static final int TRANSACTION_attachToDisplayContent = 121;
        static final int TRANSACTION_detachWindowContextFromWindowContainer = 122;
        static final int TRANSACTION_registerCrossWindowBlurEnabledListener = 123;
        static final int TRANSACTION_unregisterCrossWindowBlurEnabledListener = 124;
        static final int TRANSACTION_isTaskSnapshotSupported = 125;
        static final int TRANSACTION_getImeDisplayId = 126;
        static final int TRANSACTION_setTaskSnapshotEnabled = 127;
        static final int TRANSACTION_setTaskTransitionSpec = 128;
        static final int TRANSACTION_clearTaskTransitionSpec = 129;
        static final int TRANSACTION_registerTaskFpsCallback = 130;
        static final int TRANSACTION_unregisterTaskFpsCallback = 131;
        static final int TRANSACTION_snapshotTaskForRecents = 132;
        static final int TRANSACTION_setRecentsAppBehindSystemBars = 133;
        static final int TRANSACTION_getLetterboxBackgroundColorInArgb = 134;
        static final int TRANSACTION_isLetterboxBackgroundMultiColored = 135;
        static final int TRANSACTION_onOverlayChanged = 136;
        public Stub() { super(); }
        public static android.view.IWindowManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.IWindowManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean startViewServer(int p0) throws android.os.RemoteException { return false; }
            public boolean stopViewServer() throws android.os.RemoteException { return false; }
            public boolean isViewServerRunning() throws android.os.RemoteException { return false; }
            public android.view.IWindowSession openSession(android.view.IWindowSessionCallback p0) throws android.os.RemoteException { return null; }
            public boolean useBLAST() throws android.os.RemoteException { return false; }
            public void getInitialDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
            public void getBaseDisplaySize(int p0, android.graphics.Point p1) throws android.os.RemoteException {}
            public void setForcedDisplaySize(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void clearForcedDisplaySize(int p0) throws android.os.RemoteException {}
            public int getInitialDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
            public int getBaseDisplayDensity(int p0) throws android.os.RemoteException { return 0; }
            public void setForcedDisplayDensityForUser(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void clearForcedDisplayDensityForUser(int p0, int p1) throws android.os.RemoteException {}
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
            public void startFreezingScreen(int p0, int p1) throws android.os.RemoteException {}
            public void stopFreezingScreen() throws android.os.RemoteException {}
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
            public void setInTouchMode(boolean p0) throws android.os.RemoteException {}
            public void showStrictModeViolation(boolean p0) throws android.os.RemoteException {}
            public void setStrictModeVisualIndicatorPreference(java.lang.String p0) throws android.os.RemoteException {}
            public void refreshScreenCaptureDisabled() throws android.os.RemoteException {}
            public int getDefaultDisplayRotation() throws android.os.RemoteException { return 0; }
            public int watchRotation(android.view.IRotationWatcher p0, int p1) throws android.os.RemoteException { return 0; }
            public void removeRotationWatcher(android.view.IRotationWatcher p0) throws android.os.RemoteException {}
            public int getPreferredOptionsPanelGravity(int p0) throws android.os.RemoteException { return 0; }
            public void freezeRotation(int p0) throws android.os.RemoteException {}
            public void thawRotation() throws android.os.RemoteException {}
            public boolean isRotationFrozen() throws android.os.RemoteException { return false; }
            public void freezeDisplayRotation(int p0, int p1) throws android.os.RemoteException {}
            public void thawDisplayRotation(int p0) throws android.os.RemoteException {}
            public boolean isDisplayRotationFrozen(int p0) throws android.os.RemoteException { return false; }
            public void setFixedToUserRotation(int p0, int p1) throws android.os.RemoteException {}
            public void setIgnoreOrientationRequest(int p0, boolean p1) throws android.os.RemoteException {}
            public android.graphics.Bitmap screenshotWallpaper() throws android.os.RemoteException { return null; }
            public android.view.SurfaceControl mirrorWallpaperSurface(int p0) throws android.os.RemoteException { return null; }
            public boolean registerWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException { return false; }
            public void unregisterWallpaperVisibilityListener(android.view.IWallpaperVisibilityListener p0, int p1) throws android.os.RemoteException {}
            public void registerSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
            public void unregisterSystemGestureExclusionListener(android.view.ISystemGestureExclusionListener p0, int p1) throws android.os.RemoteException {}
            public boolean requestAssistScreenshot(android.app.IAssistDataReceiver p0) throws android.os.RemoteException { return false; }
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
            public void setDockedTaskDividerTouchRegion(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void registerPinnedTaskListener(int p0, android.view.IPinnedTaskListener p1) throws android.os.RemoteException {}
            public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
            public void getStableInsets(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void registerShortcutKey(long p0, com.android.internal.policy.IShortcutService p1) throws android.os.RemoteException {}
            public void createInputConsumer(android.os.IBinder p0, java.lang.String p1, int p2, android.view.InputChannel p3) throws android.os.RemoteException {}
            public boolean destroyInputConsumer(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
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
            public int getDisplayImePolicy(int p0) throws android.os.RemoteException { return 0; }
            public void setDisplayImePolicy(int p0, int p1) throws android.os.RemoteException {}
            public void syncInputTransactions(boolean p0) throws android.os.RemoteException {}
            public boolean isLayerTracing() throws android.os.RemoteException { return false; }
            public void setLayerTracing(boolean p0) throws android.os.RemoteException {}
            public boolean mirrorDisplay(int p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
            public void setDisplayWindowInsetsController(int p0, android.view.IDisplayWindowInsetsController p1) throws android.os.RemoteException {}
            public void updateDisplayWindowRequestedVisibilities(int p0, android.view.InsetsVisibilities p1) throws android.os.RemoteException {}
            public boolean getWindowInsets(android.view.WindowManager.LayoutParams p0, int p1, android.view.InsetsState p2) throws android.os.RemoteException { return false; }
            public java.util.List<android.view.DisplayInfo> getPossibleDisplayInfo(int p0) throws android.os.RemoteException { return null; }
            public void showGlobalActions() throws android.os.RemoteException {}
            public void setLayerTracingFlags(int p0) throws android.os.RemoteException {}
            public void requestScrollCapture(int p0, android.os.IBinder p1, int p2, android.view.IScrollCaptureResponseListener p3) throws android.os.RemoteException {}
            public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public java.lang.String[] getSupportedDisplayHashAlgorithms() throws android.os.RemoteException { return null; }
            public android.view.displayhash.VerifiedDisplayHash verifyDisplayHash(android.view.displayhash.DisplayHash p0) throws android.os.RemoteException { return null; }
            public void setDisplayHashThrottlingEnabled(boolean p0) throws android.os.RemoteException {}
            public android.content.res.Configuration attachWindowContextToDisplayArea(android.os.IBinder p0, int p1, int p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
            public void attachWindowContextToWindowToken(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public android.content.res.Configuration attachToDisplayContent(android.os.IBinder p0, int p1) throws android.os.RemoteException { return null; }
            public void detachWindowContextFromWindowContainer(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean registerCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException { return false; }
            public void unregisterCrossWindowBlurEnabledListener(android.view.ICrossWindowBlurEnabledListener p0) throws android.os.RemoteException {}
            public boolean isTaskSnapshotSupported() throws android.os.RemoteException { return false; }
            public int getImeDisplayId() throws android.os.RemoteException { return 0; }
            public void setTaskSnapshotEnabled(boolean p0) throws android.os.RemoteException {}
            public void setTaskTransitionSpec(android.view.TaskTransitionSpec p0) throws android.os.RemoteException {}
            public void clearTaskTransitionSpec() throws android.os.RemoteException {}
            public void registerTaskFpsCallback(int p0, android.window.ITaskFpsCallback p1) throws android.os.RemoteException {}
            public void unregisterTaskFpsCallback(android.window.ITaskFpsCallback p0) throws android.os.RemoteException {}
            public android.graphics.Bitmap snapshotTaskForRecents(int p0) throws android.os.RemoteException { return null; }
            public void setRecentsAppBehindSystemBars(boolean p0) throws android.os.RemoteException {}
            public int getLetterboxBackgroundColorInArgb() throws android.os.RemoteException { return 0; }
            public boolean isLetterboxBackgroundMultiColored() throws android.os.RemoteException { return false; }
            public void onOverlayChanged() throws android.os.RemoteException {}
        }
    }
}
