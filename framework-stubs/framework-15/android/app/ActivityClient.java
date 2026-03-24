package android.app;

public class ActivityClient {
    public void activityIdle(android.os.IBinder p0, android.content.res.Configuration p1, boolean p2) {}
    public void activityResumed(android.os.IBinder p0, boolean p1) {}
    public void activityRefreshed(android.os.IBinder p0) {}
    public void activityTopResumedStateLost() {}
    public void activityPaused(android.os.IBinder p0) {}
    public void activityStopped(android.os.IBinder p0, android.os.Bundle p1, android.os.PersistableBundle p2, java.lang.CharSequence p3) {}
    public void activityDestroyed(android.os.IBinder p0) {}
    public void activityLocalRelaunch(android.os.IBinder p0) {}
    public void activityRelaunched(android.os.IBinder p0) {}
    void reportSizeConfigurations(android.os.IBinder p0, android.window.SizeConfigurationBuckets p1) {}
    public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) { return false; }
    boolean shouldUpRecreateTask(android.os.IBinder p0, java.lang.String p1) { return false; }
    boolean navigateUpTo(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, int p3, android.content.Intent p4) { return false; }
    boolean releaseActivityInstance(android.os.IBinder p0) { return false; }
    public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) { return false; }
    boolean finishActivityAffinity(android.os.IBinder p0) { return false; }
    void finishSubActivity(android.os.IBinder p0, java.lang.String p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    void setForceSendResultForMediaProjection(android.os.IBinder p0) {}
    public boolean isTopOfTask(android.os.IBinder p0) { return false; }
    boolean willActivityBeVisible(android.os.IBinder p0) { return false; }
    public int getDisplayId(android.os.IBinder p0) { return 0; }
    public int getTaskForActivity(android.os.IBinder p0, boolean p1) { return 0; }
    @android.annotation.Nullable
    public android.content.res.Configuration getTaskConfiguration(android.os.IBinder p0) { return null; }
    @android.annotation.Nullable
    public android.os.IBinder getActivityTokenBelow(android.os.IBinder p0) { return null; }
    android.content.ComponentName getCallingActivity(android.os.IBinder p0) { return null; }
    java.lang.String getCallingPackage(android.os.IBinder p0) { return null; }
    public int getLaunchedFromUid(android.os.IBinder p0) { return 0; }
    public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) { return null; }
    public int getActivityCallerUid(android.os.IBinder p0, android.os.IBinder p1) { return 0; }
    public java.lang.String getActivityCallerPackage(android.os.IBinder p0, android.os.IBinder p1) { return null; }
    public int checkActivityCallerContentUriPermission(android.os.IBinder p0, android.os.IBinder p1, android.net.Uri p2, int p3) { return 0; }
    public void setRequestedOrientation(android.os.IBinder p0, int p1) {}
    int getRequestedOrientation(android.os.IBinder p0) { return 0; }
    boolean convertFromTranslucent(android.os.IBinder p0) { return false; }
    boolean convertToTranslucent(android.os.IBinder p0, android.os.Bundle p1) { return false; }
    void reportActivityFullyDrawn(android.os.IBinder p0, boolean p1) {}
    boolean isImmersive(android.os.IBinder p0) { return false; }
    void setImmersive(android.os.IBinder p0, boolean p1) {}
    boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) { return false; }
    void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) {}
    void setShouldDockBigOverlays(android.os.IBinder p0, boolean p1) {}
    void toggleFreeformWindowingMode(android.os.IBinder p0) {}
    void requestMultiwindowFullscreen(android.os.IBinder p0, int p1, android.os.IRemoteCallback p2) {}
    void startLockTaskModeByToken(android.os.IBinder p0) {}
    void stopLockTaskModeByToken(android.os.IBinder p0) {}
    void showLockTaskEscapeMessage(android.os.IBinder p0) {}
    void setTaskDescription(android.os.IBinder p0, android.app.ActivityManager.TaskDescription p1) {}
    boolean showAssistFromActivity(android.os.IBinder p0, android.os.Bundle p1) { return false; }
    boolean isRootVoiceInteraction(android.os.IBinder p0) { return false; }
    void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) {}
    void stopLocalVoiceInteraction(android.os.IBinder p0) {}
    void setShowWhenLocked(android.os.IBinder p0, boolean p1) {}
    void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) {}
    void setTurnScreenOn(android.os.IBinder p0, boolean p1) {}
    void setAllowCrossUidActivitySwitchFromBelow(android.os.IBinder p0, boolean p1) {}
    int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) { return 0; }
    void overrideActivityTransition(android.os.IBinder p0, boolean p1, int p2, int p3, int p4) {}
    void clearOverrideActivityTransition(android.os.IBinder p0, boolean p1) {}
    void overridePendingTransition(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4) {}
    void setRecentsScreenshotEnabled(android.os.IBinder p0, boolean p1) {}
    public void invalidateHomeTaskSnapshot(android.os.IBinder p0) {}
    void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) {}
    void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) {}
    void unregisterRemoteAnimations(android.os.IBinder p0) {}
    void onBackPressed(android.os.IBinder p0, android.app.IRequestFinishCallback p1) {}
    void reportSplashScreenAttached(android.os.IBinder p0) {}
    void enableTaskLocaleOverride(android.os.IBinder p0) {}
    public boolean isRequestedToLaunchInTaskFragment(android.os.IBinder p0, android.os.IBinder p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.INTERNAL_SYSTEM_WINDOW")
    void setActivityRecordInputSinkEnabled(android.os.IBinder p0, boolean p1) {}
    void requestCompatCameraControl(android.content.res.Resources p0, android.os.IBinder p1, boolean p2, boolean p3, android.app.ICompatCameraControlCallback p4) {}
    public static android.app.ActivityClient getInstance() { return null; }
    public static android.app.IActivityClientController setActivityClientController(android.app.IActivityClientController p0) { return null; }

    private static class ActivityClientControllerSingleton extends android.util.Singleton<android.app.IActivityClientController> {
        android.app.IActivityClientController mKnownInstance;
        protected android.app.IActivityClientController create() { return null; }
    }
}
