package android.app;

public interface IActivityTaskManager extends android.os.IInterface {
    public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9) throws android.os.RemoteException;
    public int startActivities(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent[] p2, java.lang.String[] p3, android.os.IBinder p4, android.os.Bundle p5, int p6) throws android.os.RemoteException;
    public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException;
    public boolean startNextMatchingActivity(android.os.IBinder p0, android.content.Intent p1, android.os.Bundle p2) throws android.os.RemoteException;
    public int startActivityIntentSender(android.app.IApplicationThread p0, android.content.IIntentSender p1, android.os.IBinder p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, int p9, android.os.Bundle p10) throws android.os.RemoteException;
    public android.app.WaitResult startActivityAndWait(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException;
    public int startActivityWithConfig(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.content.res.Configuration p8, android.os.Bundle p9, int p10) throws android.os.RemoteException;
    public int startVoiceActivity(java.lang.String p0, int p1, int p2, android.content.Intent p3, java.lang.String p4, android.service.voice.IVoiceInteractionSession p5, com.android.internal.app.IVoiceInteractor p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException;
    public int startAssistantActivity(java.lang.String p0, int p1, int p2, android.content.Intent p3, java.lang.String p4, android.os.Bundle p5, int p6) throws android.os.RemoteException;
    public void startRecentsActivity(android.content.Intent p0, android.app.IAssistDataReceiver p1, android.view.IRecentsAnimationRunner p2) throws android.os.RemoteException;
    public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException;
    public int startActivityAsCaller(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, android.os.IBinder p10, boolean p11, int p12) throws android.os.RemoteException;
    public boolean isActivityStartAllowedOnDisplay(int p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void unhandledBack() throws android.os.RemoteException;
    public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException;
    public boolean finishActivityAffinity(android.os.IBinder p0) throws android.os.RemoteException;
    public void activityIdle(android.os.IBinder p0, android.content.res.Configuration p1, boolean p2) throws android.os.RemoteException;
    public void activityResumed(android.os.IBinder p0) throws android.os.RemoteException;
    public void activityTopResumedStateLost() throws android.os.RemoteException;
    public void activityPaused(android.os.IBinder p0) throws android.os.RemoteException;
    public void activityStopped(android.os.IBinder p0, android.os.Bundle p1, android.os.PersistableBundle p2, java.lang.CharSequence p3) throws android.os.RemoteException;
    public void activityDestroyed(android.os.IBinder p0) throws android.os.RemoteException;
    public void activityRelaunched(android.os.IBinder p0) throws android.os.RemoteException;
    public void activitySlept(android.os.IBinder p0) throws android.os.RemoteException;
    public int getFrontActivityScreenCompatMode() throws android.os.RemoteException;
    public void setFrontActivityScreenCompatMode(int p0) throws android.os.RemoteException;
    public java.lang.String getCallingPackage(android.os.IBinder p0) throws android.os.RemoteException;
    public android.content.ComponentName getCallingActivity(android.os.IBinder p0) throws android.os.RemoteException;
    public void setFocusedTask(int p0) throws android.os.RemoteException;
    public boolean removeTask(int p0) throws android.os.RemoteException;
    public void removeAllVisibleRecentTasks() throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getFilteredTasks(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean shouldUpRecreateTask(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean navigateUpTo(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.Intent p3) throws android.os.RemoteException;
    public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException;
    public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void finishSubActivity(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean willActivityBeVisible(android.os.IBinder p0) throws android.os.RemoteException;
    public void setRequestedOrientation(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public int getRequestedOrientation(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean convertFromTranslucent(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean convertToTranslucent(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void notifyActivityDrawn(android.os.IBinder p0) throws android.os.RemoteException;
    public void reportActivityFullyDrawn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public int getActivityDisplayId(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean isImmersive(android.os.IBinder p0) throws android.os.RemoteException;
    public void setImmersive(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public boolean isTopActivityImmersive() throws android.os.RemoteException;
    public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public android.app.ActivityManager.TaskDescription getTaskDescription(int p0) throws android.os.RemoteException;
    public void overridePendingTransition(android.os.IBinder p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException;
    public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException;
    public void reportAssistContextExtras(android.os.IBinder p0, android.os.Bundle p1, android.app.assist.AssistStructure p2, android.app.assist.AssistContent p3, android.net.Uri p4) throws android.os.RemoteException;
    public void setFocusedStack(int p0) throws android.os.RemoteException;
    public android.app.ActivityManager.StackInfo getFocusedStackInfo() throws android.os.RemoteException;
    public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException;
    public void cancelRecentsAnimation(boolean p0) throws android.os.RemoteException;
    public void startLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void stopLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void updateLockTaskPackages(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public boolean isInLockTaskMode() throws android.os.RemoteException;
    public int getLockTaskModeState() throws android.os.RemoteException;
    public void setTaskDescription(android.os.IBinder p0, android.app.ActivityManager.TaskDescription p1) throws android.os.RemoteException;
    public android.os.Bundle getActivityOptions(android.os.IBinder p0) throws android.os.RemoteException;
    public java.util.List<android.os.IBinder> getAppTasks(java.lang.String p0) throws android.os.RemoteException;
    public void startSystemLockTaskMode(int p0) throws android.os.RemoteException;
    public void stopSystemLockTaskMode() throws android.os.RemoteException;
    public void finishVoiceTask(android.service.voice.IVoiceInteractionSession p0) throws android.os.RemoteException;
    public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException;
    public void notifyLaunchTaskBehindComplete(android.os.IBinder p0) throws android.os.RemoteException;
    public void notifyEnterAnimationComplete(android.os.IBinder p0) throws android.os.RemoteException;
    public int addAppTask(android.os.IBinder p0, android.content.Intent p1, android.app.ActivityManager.TaskDescription p2, android.graphics.Bitmap p3) throws android.os.RemoteException;
    public android.graphics.Point getAppTaskThumbnailSize() throws android.os.RemoteException;
    public boolean releaseActivityInstance(android.os.IBinder p0) throws android.os.RemoteException;
    public android.os.IBinder requestStartActivityPermissionToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void releaseSomeActivities(android.app.IApplicationThread p0) throws android.os.RemoteException;
    public android.graphics.Bitmap getTaskDescriptionIcon(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void startInPlaceAnimationOnFrontMostApplication(android.os.Bundle p0) throws android.os.RemoteException;
    public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException;
    public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException;
    public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException;
    public void toggleFreeformWindowingMode(android.os.IBinder p0) throws android.os.RemoteException;
    public void resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    public void moveStackToDisplay(int p0, int p1) throws android.os.RemoteException;
    public void removeStack(int p0) throws android.os.RemoteException;
    public void setTaskWindowingMode(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void moveTaskToStack(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void resizeStack(int p0, android.graphics.Rect p1, boolean p2, boolean p3, boolean p4, int p5) throws android.os.RemoteException;
    public boolean setTaskWindowingModeSplitScreenPrimary(int p0, int p1, boolean p2, boolean p3, android.graphics.Rect p4, boolean p5) throws android.os.RemoteException;
    public void offsetPinnedStackBounds(int p0, android.graphics.Rect p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void removeStacksInWindowingModes(int[] p0) throws android.os.RemoteException;
    public void removeStacksWithActivityTypes(int[] p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfos() throws android.os.RemoteException;
    public android.app.ActivityManager.StackInfo getStackInfo(int p0, int p1) throws android.os.RemoteException;
    public void setLockScreenShown(boolean p0, boolean p1) throws android.os.RemoteException;
    public android.os.Bundle getAssistContextExtras(int p0) throws android.os.RemoteException;
    public boolean launchAssistIntent(android.content.Intent p0, int p1, java.lang.String p2, int p3, android.os.Bundle p4) throws android.os.RemoteException;
    public boolean requestAssistContextExtras(int p0, android.app.IAssistDataReceiver p1, android.os.Bundle p2, android.os.IBinder p3, boolean p4, boolean p5) throws android.os.RemoteException;
    public boolean requestAutofillData(android.app.IAssistDataReceiver p0, android.os.Bundle p1, android.os.IBinder p2, int p3) throws android.os.RemoteException;
    public boolean isAssistDataAllowedOnCurrentActivity() throws android.os.RemoteException;
    public boolean showAssistFromActivity(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public boolean isRootVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException;
    public void showLockTaskEscapeMessage(android.os.IBinder p0) throws android.os.RemoteException;
    public void keyguardGoingAway(int p0) throws android.os.RemoteException;
    public android.content.ComponentName getActivityClassForToken(android.os.IBinder p0) throws android.os.RemoteException;
    public java.lang.String getPackageForToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void positionTaskInStack(int p0, int p1, int p2) throws android.os.RemoteException;
    public void reportSizeConfigurations(android.os.IBinder p0, int[] p1, int[] p2, int[] p3) throws android.os.RemoteException;
    public void dismissSplitScreenMode(boolean p0) throws android.os.RemoteException;
    public void dismissPip(boolean p0, int p1) throws android.os.RemoteException;
    public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException;
    public void moveTasksToFullscreenStack(int p0, boolean p1) throws android.os.RemoteException;
    public boolean moveTopActivityToPinnedStack(int p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public boolean isInMultiWindowMode(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean isInPictureInPictureMode(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException;
    public void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException;
    public int getMaxNumPictureInPictureActions(android.os.IBinder p0) throws android.os.RemoteException;
    public android.os.IBinder getUriPermissionOwnerForActivity(android.os.IBinder p0) throws android.os.RemoteException;
    public void resizeDockedStack(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException;
    public void setSplitScreenResizing(boolean p0) throws android.os.RemoteException;
    public int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) throws android.os.RemoteException;
    public void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void stopLocalVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean supportsLocalVoiceInteraction() throws android.os.RemoteException;
    public void notifyPinnedStackAnimationStarted() throws android.os.RemoteException;
    public void notifyPinnedStackAnimationEnded() throws android.os.RemoteException;
    public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() throws android.os.RemoteException;
    public void resizePinnedStack(android.graphics.Rect p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public boolean updateDisplayOverrideConfiguration(android.content.res.Configuration p0, int p1) throws android.os.RemoteException;
    public void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException;
    public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException;
    public void setDisablePreviewScreenshots(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public int getLastResumedActivityUserId() throws android.os.RemoteException;
    public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException;
    public void updateLockTaskFeatures(int p0, int p1) throws android.os.RemoteException;
    public void setShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void setTurnScreenOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException;
    public void registerRemoteAnimationForNextActivityStart(java.lang.String p0, android.view.RemoteAnimationAdapter p1) throws android.os.RemoteException;
    public void registerRemoteAnimationsForDisplay(int p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException;
    public void alwaysShowUnsupportedCompileSdkWarning(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setVrThread(int p0) throws android.os.RemoteException;
    public void setPersistentVrThread(int p0) throws android.os.RemoteException;
    public void stopAppSwitches() throws android.os.RemoteException;
    public void resumeAppSwitches() throws android.os.RemoteException;
    public void setActivityController(android.app.IActivityController p0, boolean p1) throws android.os.RemoteException;
    public void setVoiceKeepAwake(android.service.voice.IVoiceInteractionSession p0, boolean p1) throws android.os.RemoteException;
    public int getPackageScreenCompatMode(java.lang.String p0) throws android.os.RemoteException;
    public void setPackageScreenCompatMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean getPackageAskScreenCompat(java.lang.String p0) throws android.os.RemoteException;
    public void setPackageAskScreenCompat(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void clearLaunchParamsForPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void setDisplayToSingleTaskInstance(int p0) throws android.os.RemoteException;
    public void restartActivityProcessIfVisible(android.os.IBinder p0) throws android.os.RemoteException;
    public void onBackPressedOnTaskRoot(android.os.IBinder p0, android.app.IRequestFinishCallback p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.IActivityTaskManager {
        private static final java.lang.String DESCRIPTOR = "android.app.IActivityTaskManager";
        static final int TRANSACTION_startActivity = 1;
        static final int TRANSACTION_startActivities = 2;
        static final int TRANSACTION_startActivityAsUser = 3;
        static final int TRANSACTION_startNextMatchingActivity = 4;
        static final int TRANSACTION_startActivityIntentSender = 5;
        static final int TRANSACTION_startActivityAndWait = 6;
        static final int TRANSACTION_startActivityWithConfig = 7;
        static final int TRANSACTION_startVoiceActivity = 8;
        static final int TRANSACTION_startAssistantActivity = 9;
        static final int TRANSACTION_startRecentsActivity = 10;
        static final int TRANSACTION_startActivityFromRecents = 11;
        static final int TRANSACTION_startActivityAsCaller = 12;
        static final int TRANSACTION_isActivityStartAllowedOnDisplay = 13;
        static final int TRANSACTION_unhandledBack = 14;
        static final int TRANSACTION_finishActivity = 15;
        static final int TRANSACTION_finishActivityAffinity = 16;
        static final int TRANSACTION_activityIdle = 17;
        static final int TRANSACTION_activityResumed = 18;
        static final int TRANSACTION_activityTopResumedStateLost = 19;
        static final int TRANSACTION_activityPaused = 20;
        static final int TRANSACTION_activityStopped = 21;
        static final int TRANSACTION_activityDestroyed = 22;
        static final int TRANSACTION_activityRelaunched = 23;
        static final int TRANSACTION_activitySlept = 24;
        static final int TRANSACTION_getFrontActivityScreenCompatMode = 25;
        static final int TRANSACTION_setFrontActivityScreenCompatMode = 26;
        static final int TRANSACTION_getCallingPackage = 27;
        static final int TRANSACTION_getCallingActivity = 28;
        static final int TRANSACTION_setFocusedTask = 29;
        static final int TRANSACTION_removeTask = 30;
        static final int TRANSACTION_removeAllVisibleRecentTasks = 31;
        static final int TRANSACTION_getTasks = 32;
        static final int TRANSACTION_getFilteredTasks = 33;
        static final int TRANSACTION_shouldUpRecreateTask = 34;
        static final int TRANSACTION_navigateUpTo = 35;
        static final int TRANSACTION_moveTaskToFront = 36;
        static final int TRANSACTION_getTaskForActivity = 37;
        static final int TRANSACTION_finishSubActivity = 38;
        static final int TRANSACTION_getRecentTasks = 39;
        static final int TRANSACTION_willActivityBeVisible = 40;
        static final int TRANSACTION_setRequestedOrientation = 41;
        static final int TRANSACTION_getRequestedOrientation = 42;
        static final int TRANSACTION_convertFromTranslucent = 43;
        static final int TRANSACTION_convertToTranslucent = 44;
        static final int TRANSACTION_notifyActivityDrawn = 45;
        static final int TRANSACTION_reportActivityFullyDrawn = 46;
        static final int TRANSACTION_getActivityDisplayId = 47;
        static final int TRANSACTION_isImmersive = 48;
        static final int TRANSACTION_setImmersive = 49;
        static final int TRANSACTION_isTopActivityImmersive = 50;
        static final int TRANSACTION_moveActivityTaskToBack = 51;
        static final int TRANSACTION_getTaskDescription = 52;
        static final int TRANSACTION_overridePendingTransition = 53;
        static final int TRANSACTION_getLaunchedFromUid = 54;
        static final int TRANSACTION_getLaunchedFromPackage = 55;
        static final int TRANSACTION_reportAssistContextExtras = 56;
        static final int TRANSACTION_setFocusedStack = 57;
        static final int TRANSACTION_getFocusedStackInfo = 58;
        static final int TRANSACTION_getTaskBounds = 59;
        static final int TRANSACTION_cancelRecentsAnimation = 60;
        static final int TRANSACTION_startLockTaskModeByToken = 61;
        static final int TRANSACTION_stopLockTaskModeByToken = 62;
        static final int TRANSACTION_updateLockTaskPackages = 63;
        static final int TRANSACTION_isInLockTaskMode = 64;
        static final int TRANSACTION_getLockTaskModeState = 65;
        static final int TRANSACTION_setTaskDescription = 66;
        static final int TRANSACTION_getActivityOptions = 67;
        static final int TRANSACTION_getAppTasks = 68;
        static final int TRANSACTION_startSystemLockTaskMode = 69;
        static final int TRANSACTION_stopSystemLockTaskMode = 70;
        static final int TRANSACTION_finishVoiceTask = 71;
        static final int TRANSACTION_isTopOfTask = 72;
        static final int TRANSACTION_notifyLaunchTaskBehindComplete = 73;
        static final int TRANSACTION_notifyEnterAnimationComplete = 74;
        static final int TRANSACTION_addAppTask = 75;
        static final int TRANSACTION_getAppTaskThumbnailSize = 76;
        static final int TRANSACTION_releaseActivityInstance = 77;
        static final int TRANSACTION_requestStartActivityPermissionToken = 78;
        static final int TRANSACTION_releaseSomeActivities = 79;
        static final int TRANSACTION_getTaskDescriptionIcon = 80;
        static final int TRANSACTION_startInPlaceAnimationOnFrontMostApplication = 81;
        static final int TRANSACTION_registerTaskStackListener = 82;
        static final int TRANSACTION_unregisterTaskStackListener = 83;
        static final int TRANSACTION_setTaskResizeable = 84;
        static final int TRANSACTION_toggleFreeformWindowingMode = 85;
        static final int TRANSACTION_resizeTask = 86;
        static final int TRANSACTION_moveStackToDisplay = 87;
        static final int TRANSACTION_removeStack = 88;
        static final int TRANSACTION_setTaskWindowingMode = 89;
        static final int TRANSACTION_moveTaskToStack = 90;
        static final int TRANSACTION_resizeStack = 91;
        static final int TRANSACTION_setTaskWindowingModeSplitScreenPrimary = 92;
        static final int TRANSACTION_offsetPinnedStackBounds = 93;
        static final int TRANSACTION_removeStacksInWindowingModes = 94;
        static final int TRANSACTION_removeStacksWithActivityTypes = 95;
        static final int TRANSACTION_getAllStackInfos = 96;
        static final int TRANSACTION_getStackInfo = 97;
        static final int TRANSACTION_setLockScreenShown = 98;
        static final int TRANSACTION_getAssistContextExtras = 99;
        static final int TRANSACTION_launchAssistIntent = 100;
        static final int TRANSACTION_requestAssistContextExtras = 101;
        static final int TRANSACTION_requestAutofillData = 102;
        static final int TRANSACTION_isAssistDataAllowedOnCurrentActivity = 103;
        static final int TRANSACTION_showAssistFromActivity = 104;
        static final int TRANSACTION_isRootVoiceInteraction = 105;
        static final int TRANSACTION_showLockTaskEscapeMessage = 106;
        static final int TRANSACTION_keyguardGoingAway = 107;
        static final int TRANSACTION_getActivityClassForToken = 108;
        static final int TRANSACTION_getPackageForToken = 109;
        static final int TRANSACTION_positionTaskInStack = 110;
        static final int TRANSACTION_reportSizeConfigurations = 111;
        static final int TRANSACTION_dismissSplitScreenMode = 112;
        static final int TRANSACTION_dismissPip = 113;
        static final int TRANSACTION_suppressResizeConfigChanges = 114;
        static final int TRANSACTION_moveTasksToFullscreenStack = 115;
        static final int TRANSACTION_moveTopActivityToPinnedStack = 116;
        static final int TRANSACTION_isInMultiWindowMode = 117;
        static final int TRANSACTION_isInPictureInPictureMode = 118;
        static final int TRANSACTION_enterPictureInPictureMode = 119;
        static final int TRANSACTION_setPictureInPictureParams = 120;
        static final int TRANSACTION_getMaxNumPictureInPictureActions = 121;
        static final int TRANSACTION_getUriPermissionOwnerForActivity = 122;
        static final int TRANSACTION_resizeDockedStack = 123;
        static final int TRANSACTION_setSplitScreenResizing = 124;
        static final int TRANSACTION_setVrMode = 125;
        static final int TRANSACTION_startLocalVoiceInteraction = 126;
        static final int TRANSACTION_stopLocalVoiceInteraction = 127;
        static final int TRANSACTION_supportsLocalVoiceInteraction = 128;
        static final int TRANSACTION_notifyPinnedStackAnimationStarted = 129;
        static final int TRANSACTION_notifyPinnedStackAnimationEnded = 130;
        static final int TRANSACTION_getDeviceConfigurationInfo = 131;
        static final int TRANSACTION_resizePinnedStack = 132;
        static final int TRANSACTION_updateDisplayOverrideConfiguration = 133;
        static final int TRANSACTION_dismissKeyguard = 134;
        static final int TRANSACTION_cancelTaskWindowTransition = 135;
        static final int TRANSACTION_getTaskSnapshot = 136;
        static final int TRANSACTION_setDisablePreviewScreenshots = 137;
        static final int TRANSACTION_getLastResumedActivityUserId = 138;
        static final int TRANSACTION_updateConfiguration = 139;
        static final int TRANSACTION_updateLockTaskFeatures = 140;
        static final int TRANSACTION_setShowWhenLocked = 141;
        static final int TRANSACTION_setInheritShowWhenLocked = 142;
        static final int TRANSACTION_setTurnScreenOn = 143;
        static final int TRANSACTION_registerRemoteAnimations = 144;
        static final int TRANSACTION_registerRemoteAnimationForNextActivityStart = 145;
        static final int TRANSACTION_registerRemoteAnimationsForDisplay = 146;
        static final int TRANSACTION_alwaysShowUnsupportedCompileSdkWarning = 147;
        static final int TRANSACTION_setVrThread = 148;
        static final int TRANSACTION_setPersistentVrThread = 149;
        static final int TRANSACTION_stopAppSwitches = 150;
        static final int TRANSACTION_resumeAppSwitches = 151;
        static final int TRANSACTION_setActivityController = 152;
        static final int TRANSACTION_setVoiceKeepAwake = 153;
        static final int TRANSACTION_getPackageScreenCompatMode = 154;
        static final int TRANSACTION_setPackageScreenCompatMode = 155;
        static final int TRANSACTION_getPackageAskScreenCompat = 156;
        static final int TRANSACTION_setPackageAskScreenCompat = 157;
        static final int TRANSACTION_clearLaunchParamsForPackages = 158;
        static final int TRANSACTION_setDisplayToSingleTaskInstance = 159;
        static final int TRANSACTION_restartActivityProcessIfVisible = 160;
        static final int TRANSACTION_onBackPressedOnTaskRoot = 161;
        public Stub() { super(); }
        public static android.app.IActivityTaskManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IActivityTaskManager p0) { return false; }
        public static android.app.IActivityTaskManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IActivityTaskManager {
            private android.os.IBinder mRemote;
            public static android.app.IActivityTaskManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9) throws android.os.RemoteException { return 0; }
            public int startActivities(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent[] p2, java.lang.String[] p3, android.os.IBinder p4, android.os.Bundle p5, int p6) throws android.os.RemoteException { return 0; }
            public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return 0; }
            public boolean startNextMatchingActivity(android.os.IBinder p0, android.content.Intent p1, android.os.Bundle p2) throws android.os.RemoteException { return false; }
            public int startActivityIntentSender(android.app.IApplicationThread p0, android.content.IIntentSender p1, android.os.IBinder p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, int p9, android.os.Bundle p10) throws android.os.RemoteException { return 0; }
            public android.app.WaitResult startActivityAndWait(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return null; }
            public int startActivityWithConfig(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.content.res.Configuration p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return 0; }
            public int startVoiceActivity(java.lang.String p0, int p1, int p2, android.content.Intent p3, java.lang.String p4, android.service.voice.IVoiceInteractionSession p5, com.android.internal.app.IVoiceInteractor p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return 0; }
            public int startAssistantActivity(java.lang.String p0, int p1, int p2, android.content.Intent p3, java.lang.String p4, android.os.Bundle p5, int p6) throws android.os.RemoteException { return 0; }
            public void startRecentsActivity(android.content.Intent p0, android.app.IAssistDataReceiver p1, android.view.IRecentsAnimationRunner p2) throws android.os.RemoteException {}
            public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
            public int startActivityAsCaller(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, android.os.IBinder p10, boolean p11, int p12) throws android.os.RemoteException { return 0; }
            public boolean isActivityStartAllowedOnDisplay(int p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return false; }
            public void unhandledBack() throws android.os.RemoteException {}
            public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException { return false; }
            public boolean finishActivityAffinity(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void activityIdle(android.os.IBinder p0, android.content.res.Configuration p1, boolean p2) throws android.os.RemoteException {}
            public void activityResumed(android.os.IBinder p0) throws android.os.RemoteException {}
            public void activityTopResumedStateLost() throws android.os.RemoteException {}
            public void activityPaused(android.os.IBinder p0) throws android.os.RemoteException {}
            public void activityStopped(android.os.IBinder p0, android.os.Bundle p1, android.os.PersistableBundle p2, java.lang.CharSequence p3) throws android.os.RemoteException {}
            public void activityDestroyed(android.os.IBinder p0) throws android.os.RemoteException {}
            public void activityRelaunched(android.os.IBinder p0) throws android.os.RemoteException {}
            public void activitySlept(android.os.IBinder p0) throws android.os.RemoteException {}
            public int getFrontActivityScreenCompatMode() throws android.os.RemoteException { return 0; }
            public void setFrontActivityScreenCompatMode(int p0) throws android.os.RemoteException {}
            public java.lang.String getCallingPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getCallingActivity(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void setFocusedTask(int p0) throws android.os.RemoteException {}
            public boolean removeTask(int p0) throws android.os.RemoteException { return false; }
            public void removeAllVisibleRecentTasks() throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getFilteredTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean shouldUpRecreateTask(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean navigateUpTo(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.Intent p3) throws android.os.RemoteException { return false; }
            public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return 0; }
            public void finishSubActivity(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean willActivityBeVisible(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void setRequestedOrientation(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public int getRequestedOrientation(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public boolean convertFromTranslucent(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public boolean convertToTranslucent(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException { return false; }
            public void notifyActivityDrawn(android.os.IBinder p0) throws android.os.RemoteException {}
            public void reportActivityFullyDrawn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public int getActivityDisplayId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public boolean isImmersive(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void setImmersive(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public boolean isTopActivityImmersive() throws android.os.RemoteException { return false; }
            public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return false; }
            public android.app.ActivityManager.TaskDescription getTaskDescription(int p0) throws android.os.RemoteException { return null; }
            public void overridePendingTransition(android.os.IBinder p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void reportAssistContextExtras(android.os.IBinder p0, android.os.Bundle p1, android.app.assist.AssistStructure p2, android.app.assist.AssistContent p3, android.net.Uri p4) throws android.os.RemoteException {}
            public void setFocusedStack(int p0) throws android.os.RemoteException {}
            public android.app.ActivityManager.StackInfo getFocusedStackInfo() throws android.os.RemoteException { return null; }
            public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException { return null; }
            public void cancelRecentsAnimation(boolean p0) throws android.os.RemoteException {}
            public void startLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException {}
            public void stopLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException {}
            public void updateLockTaskPackages(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public boolean isInLockTaskMode() throws android.os.RemoteException { return false; }
            public int getLockTaskModeState() throws android.os.RemoteException { return 0; }
            public void setTaskDescription(android.os.IBinder p0, android.app.ActivityManager.TaskDescription p1) throws android.os.RemoteException {}
            public android.os.Bundle getActivityOptions(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.os.IBinder> getAppTasks(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void startSystemLockTaskMode(int p0) throws android.os.RemoteException {}
            public void stopSystemLockTaskMode() throws android.os.RemoteException {}
            public void finishVoiceTask(android.service.voice.IVoiceInteractionSession p0) throws android.os.RemoteException {}
            public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void notifyLaunchTaskBehindComplete(android.os.IBinder p0) throws android.os.RemoteException {}
            public void notifyEnterAnimationComplete(android.os.IBinder p0) throws android.os.RemoteException {}
            public int addAppTask(android.os.IBinder p0, android.content.Intent p1, android.app.ActivityManager.TaskDescription p2, android.graphics.Bitmap p3) throws android.os.RemoteException { return 0; }
            public android.graphics.Point getAppTaskThumbnailSize() throws android.os.RemoteException { return null; }
            public boolean releaseActivityInstance(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public android.os.IBinder requestStartActivityPermissionToken(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void releaseSomeActivities(android.app.IApplicationThread p0) throws android.os.RemoteException {}
            public android.graphics.Bitmap getTaskDescriptionIcon(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void startInPlaceAnimationOnFrontMostApplication(android.os.Bundle p0) throws android.os.RemoteException {}
            public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
            public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
            public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException {}
            public void toggleFreeformWindowingMode(android.os.IBinder p0) throws android.os.RemoteException {}
            public void resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
            public void moveStackToDisplay(int p0, int p1) throws android.os.RemoteException {}
            public void removeStack(int p0) throws android.os.RemoteException {}
            public void setTaskWindowingMode(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void moveTaskToStack(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void resizeStack(int p0, android.graphics.Rect p1, boolean p2, boolean p3, boolean p4, int p5) throws android.os.RemoteException {}
            public boolean setTaskWindowingModeSplitScreenPrimary(int p0, int p1, boolean p2, boolean p3, android.graphics.Rect p4, boolean p5) throws android.os.RemoteException { return false; }
            public void offsetPinnedStackBounds(int p0, android.graphics.Rect p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void removeStacksInWindowingModes(int[] p0) throws android.os.RemoteException {}
            public void removeStacksWithActivityTypes(int[] p0) throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfos() throws android.os.RemoteException { return null; }
            public android.app.ActivityManager.StackInfo getStackInfo(int p0, int p1) throws android.os.RemoteException { return null; }
            public void setLockScreenShown(boolean p0, boolean p1) throws android.os.RemoteException {}
            public android.os.Bundle getAssistContextExtras(int p0) throws android.os.RemoteException { return null; }
            public boolean launchAssistIntent(android.content.Intent p0, int p1, java.lang.String p2, int p3, android.os.Bundle p4) throws android.os.RemoteException { return false; }
            public boolean requestAssistContextExtras(int p0, android.app.IAssistDataReceiver p1, android.os.Bundle p2, android.os.IBinder p3, boolean p4, boolean p5) throws android.os.RemoteException { return false; }
            public boolean requestAutofillData(android.app.IAssistDataReceiver p0, android.os.Bundle p1, android.os.IBinder p2, int p3) throws android.os.RemoteException { return false; }
            public boolean isAssistDataAllowedOnCurrentActivity() throws android.os.RemoteException { return false; }
            public boolean showAssistFromActivity(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException { return false; }
            public boolean isRootVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void showLockTaskEscapeMessage(android.os.IBinder p0) throws android.os.RemoteException {}
            public void keyguardGoingAway(int p0) throws android.os.RemoteException {}
            public android.content.ComponentName getActivityClassForToken(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public java.lang.String getPackageForToken(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void positionTaskInStack(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void reportSizeConfigurations(android.os.IBinder p0, int[] p1, int[] p2, int[] p3) throws android.os.RemoteException {}
            public void dismissSplitScreenMode(boolean p0) throws android.os.RemoteException {}
            public void dismissPip(boolean p0, int p1) throws android.os.RemoteException {}
            public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
            public void moveTasksToFullscreenStack(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean moveTopActivityToPinnedStack(int p0, android.graphics.Rect p1) throws android.os.RemoteException { return false; }
            public boolean isInMultiWindowMode(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public boolean isInPictureInPictureMode(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException { return false; }
            public void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException {}
            public int getMaxNumPictureInPictureActions(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public android.os.IBinder getUriPermissionOwnerForActivity(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void resizeDockedStack(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException {}
            public void setSplitScreenResizing(boolean p0) throws android.os.RemoteException {}
            public int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) throws android.os.RemoteException { return 0; }
            public void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void stopLocalVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean supportsLocalVoiceInteraction() throws android.os.RemoteException { return false; }
            public void notifyPinnedStackAnimationStarted() throws android.os.RemoteException {}
            public void notifyPinnedStackAnimationEnded() throws android.os.RemoteException {}
            public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() throws android.os.RemoteException { return null; }
            public void resizePinnedStack(android.graphics.Rect p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public boolean updateDisplayOverrideConfiguration(android.content.res.Configuration p0, int p1) throws android.os.RemoteException { return false; }
            public void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException {}
            public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public void setDisablePreviewScreenshots(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public int getLastResumedActivityUserId() throws android.os.RemoteException { return 0; }
            public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException { return false; }
            public void updateLockTaskFeatures(int p0, int p1) throws android.os.RemoteException {}
            public void setShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void setTurnScreenOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException {}
            public void registerRemoteAnimationForNextActivityStart(java.lang.String p0, android.view.RemoteAnimationAdapter p1) throws android.os.RemoteException {}
            public void registerRemoteAnimationsForDisplay(int p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException {}
            public void alwaysShowUnsupportedCompileSdkWarning(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void setVrThread(int p0) throws android.os.RemoteException {}
            public void setPersistentVrThread(int p0) throws android.os.RemoteException {}
            public void stopAppSwitches() throws android.os.RemoteException {}
            public void resumeAppSwitches() throws android.os.RemoteException {}
            public void setActivityController(android.app.IActivityController p0, boolean p1) throws android.os.RemoteException {}
            public void setVoiceKeepAwake(android.service.voice.IVoiceInteractionSession p0, boolean p1) throws android.os.RemoteException {}
            public int getPackageScreenCompatMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void setPackageScreenCompatMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean getPackageAskScreenCompat(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setPackageAskScreenCompat(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void clearLaunchParamsForPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void setDisplayToSingleTaskInstance(int p0) throws android.os.RemoteException {}
            public void restartActivityProcessIfVisible(android.os.IBinder p0) throws android.os.RemoteException {}
            public void onBackPressedOnTaskRoot(android.os.IBinder p0, android.app.IRequestFinishCallback p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.IActivityTaskManager {
        public Default() {}
        public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9) throws android.os.RemoteException { return 0; }
        public int startActivities(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent[] p2, java.lang.String[] p3, android.os.IBinder p4, android.os.Bundle p5, int p6) throws android.os.RemoteException { return 0; }
        public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return 0; }
        public boolean startNextMatchingActivity(android.os.IBinder p0, android.content.Intent p1, android.os.Bundle p2) throws android.os.RemoteException { return false; }
        public int startActivityIntentSender(android.app.IApplicationThread p0, android.content.IIntentSender p1, android.os.IBinder p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, int p9, android.os.Bundle p10) throws android.os.RemoteException { return 0; }
        public android.app.WaitResult startActivityAndWait(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return null; }
        public int startActivityWithConfig(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.content.res.Configuration p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return 0; }
        public int startVoiceActivity(java.lang.String p0, int p1, int p2, android.content.Intent p3, java.lang.String p4, android.service.voice.IVoiceInteractionSession p5, com.android.internal.app.IVoiceInteractor p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return 0; }
        public int startAssistantActivity(java.lang.String p0, int p1, int p2, android.content.Intent p3, java.lang.String p4, android.os.Bundle p5, int p6) throws android.os.RemoteException { return 0; }
        public void startRecentsActivity(android.content.Intent p0, android.app.IAssistDataReceiver p1, android.view.IRecentsAnimationRunner p2) throws android.os.RemoteException {}
        public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
        public int startActivityAsCaller(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, android.os.IBinder p10, boolean p11, int p12) throws android.os.RemoteException { return 0; }
        public boolean isActivityStartAllowedOnDisplay(int p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return false; }
        public void unhandledBack() throws android.os.RemoteException {}
        public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException { return false; }
        public boolean finishActivityAffinity(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void activityIdle(android.os.IBinder p0, android.content.res.Configuration p1, boolean p2) throws android.os.RemoteException {}
        public void activityResumed(android.os.IBinder p0) throws android.os.RemoteException {}
        public void activityTopResumedStateLost() throws android.os.RemoteException {}
        public void activityPaused(android.os.IBinder p0) throws android.os.RemoteException {}
        public void activityStopped(android.os.IBinder p0, android.os.Bundle p1, android.os.PersistableBundle p2, java.lang.CharSequence p3) throws android.os.RemoteException {}
        public void activityDestroyed(android.os.IBinder p0) throws android.os.RemoteException {}
        public void activityRelaunched(android.os.IBinder p0) throws android.os.RemoteException {}
        public void activitySlept(android.os.IBinder p0) throws android.os.RemoteException {}
        public int getFrontActivityScreenCompatMode() throws android.os.RemoteException { return 0; }
        public void setFrontActivityScreenCompatMode(int p0) throws android.os.RemoteException {}
        public java.lang.String getCallingPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getCallingActivity(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void setFocusedTask(int p0) throws android.os.RemoteException {}
        public boolean removeTask(int p0) throws android.os.RemoteException { return false; }
        public void removeAllVisibleRecentTasks() throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getFilteredTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean shouldUpRecreateTask(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean navigateUpTo(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.Intent p3) throws android.os.RemoteException { return false; }
        public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return 0; }
        public void finishSubActivity(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean willActivityBeVisible(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void setRequestedOrientation(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public int getRequestedOrientation(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public boolean convertFromTranslucent(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public boolean convertToTranslucent(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException { return false; }
        public void notifyActivityDrawn(android.os.IBinder p0) throws android.os.RemoteException {}
        public void reportActivityFullyDrawn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public int getActivityDisplayId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public boolean isImmersive(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void setImmersive(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public boolean isTopActivityImmersive() throws android.os.RemoteException { return false; }
        public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return false; }
        public android.app.ActivityManager.TaskDescription getTaskDescription(int p0) throws android.os.RemoteException { return null; }
        public void overridePendingTransition(android.os.IBinder p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void reportAssistContextExtras(android.os.IBinder p0, android.os.Bundle p1, android.app.assist.AssistStructure p2, android.app.assist.AssistContent p3, android.net.Uri p4) throws android.os.RemoteException {}
        public void setFocusedStack(int p0) throws android.os.RemoteException {}
        public android.app.ActivityManager.StackInfo getFocusedStackInfo() throws android.os.RemoteException { return null; }
        public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException { return null; }
        public void cancelRecentsAnimation(boolean p0) throws android.os.RemoteException {}
        public void startLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException {}
        public void stopLockTaskModeByToken(android.os.IBinder p0) throws android.os.RemoteException {}
        public void updateLockTaskPackages(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public boolean isInLockTaskMode() throws android.os.RemoteException { return false; }
        public int getLockTaskModeState() throws android.os.RemoteException { return 0; }
        public void setTaskDescription(android.os.IBinder p0, android.app.ActivityManager.TaskDescription p1) throws android.os.RemoteException {}
        public android.os.Bundle getActivityOptions(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.os.IBinder> getAppTasks(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void startSystemLockTaskMode(int p0) throws android.os.RemoteException {}
        public void stopSystemLockTaskMode() throws android.os.RemoteException {}
        public void finishVoiceTask(android.service.voice.IVoiceInteractionSession p0) throws android.os.RemoteException {}
        public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void notifyLaunchTaskBehindComplete(android.os.IBinder p0) throws android.os.RemoteException {}
        public void notifyEnterAnimationComplete(android.os.IBinder p0) throws android.os.RemoteException {}
        public int addAppTask(android.os.IBinder p0, android.content.Intent p1, android.app.ActivityManager.TaskDescription p2, android.graphics.Bitmap p3) throws android.os.RemoteException { return 0; }
        public android.graphics.Point getAppTaskThumbnailSize() throws android.os.RemoteException { return null; }
        public boolean releaseActivityInstance(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder requestStartActivityPermissionToken(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void releaseSomeActivities(android.app.IApplicationThread p0) throws android.os.RemoteException {}
        public android.graphics.Bitmap getTaskDescriptionIcon(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void startInPlaceAnimationOnFrontMostApplication(android.os.Bundle p0) throws android.os.RemoteException {}
        public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
        public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
        public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException {}
        public void toggleFreeformWindowingMode(android.os.IBinder p0) throws android.os.RemoteException {}
        public void resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
        public void moveStackToDisplay(int p0, int p1) throws android.os.RemoteException {}
        public void removeStack(int p0) throws android.os.RemoteException {}
        public void setTaskWindowingMode(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void moveTaskToStack(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void resizeStack(int p0, android.graphics.Rect p1, boolean p2, boolean p3, boolean p4, int p5) throws android.os.RemoteException {}
        public boolean setTaskWindowingModeSplitScreenPrimary(int p0, int p1, boolean p2, boolean p3, android.graphics.Rect p4, boolean p5) throws android.os.RemoteException { return false; }
        public void offsetPinnedStackBounds(int p0, android.graphics.Rect p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void removeStacksInWindowingModes(int[] p0) throws android.os.RemoteException {}
        public void removeStacksWithActivityTypes(int[] p0) throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfos() throws android.os.RemoteException { return null; }
        public android.app.ActivityManager.StackInfo getStackInfo(int p0, int p1) throws android.os.RemoteException { return null; }
        public void setLockScreenShown(boolean p0, boolean p1) throws android.os.RemoteException {}
        public android.os.Bundle getAssistContextExtras(int p0) throws android.os.RemoteException { return null; }
        public boolean launchAssistIntent(android.content.Intent p0, int p1, java.lang.String p2, int p3, android.os.Bundle p4) throws android.os.RemoteException { return false; }
        public boolean requestAssistContextExtras(int p0, android.app.IAssistDataReceiver p1, android.os.Bundle p2, android.os.IBinder p3, boolean p4, boolean p5) throws android.os.RemoteException { return false; }
        public boolean requestAutofillData(android.app.IAssistDataReceiver p0, android.os.Bundle p1, android.os.IBinder p2, int p3) throws android.os.RemoteException { return false; }
        public boolean isAssistDataAllowedOnCurrentActivity() throws android.os.RemoteException { return false; }
        public boolean showAssistFromActivity(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException { return false; }
        public boolean isRootVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void showLockTaskEscapeMessage(android.os.IBinder p0) throws android.os.RemoteException {}
        public void keyguardGoingAway(int p0) throws android.os.RemoteException {}
        public android.content.ComponentName getActivityClassForToken(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public java.lang.String getPackageForToken(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void positionTaskInStack(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void reportSizeConfigurations(android.os.IBinder p0, int[] p1, int[] p2, int[] p3) throws android.os.RemoteException {}
        public void dismissSplitScreenMode(boolean p0) throws android.os.RemoteException {}
        public void dismissPip(boolean p0, int p1) throws android.os.RemoteException {}
        public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
        public void moveTasksToFullscreenStack(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean moveTopActivityToPinnedStack(int p0, android.graphics.Rect p1) throws android.os.RemoteException { return false; }
        public boolean isInMultiWindowMode(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public boolean isInPictureInPictureMode(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException { return false; }
        public void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException {}
        public int getMaxNumPictureInPictureActions(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder getUriPermissionOwnerForActivity(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void resizeDockedStack(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException {}
        public void setSplitScreenResizing(boolean p0) throws android.os.RemoteException {}
        public int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) throws android.os.RemoteException { return 0; }
        public void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void stopLocalVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean supportsLocalVoiceInteraction() throws android.os.RemoteException { return false; }
        public void notifyPinnedStackAnimationStarted() throws android.os.RemoteException {}
        public void notifyPinnedStackAnimationEnded() throws android.os.RemoteException {}
        public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() throws android.os.RemoteException { return null; }
        public void resizePinnedStack(android.graphics.Rect p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public boolean updateDisplayOverrideConfiguration(android.content.res.Configuration p0, int p1) throws android.os.RemoteException { return false; }
        public void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException {}
        public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public void setDisablePreviewScreenshots(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public int getLastResumedActivityUserId() throws android.os.RemoteException { return 0; }
        public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException { return false; }
        public void updateLockTaskFeatures(int p0, int p1) throws android.os.RemoteException {}
        public void setShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void setTurnScreenOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException {}
        public void registerRemoteAnimationForNextActivityStart(java.lang.String p0, android.view.RemoteAnimationAdapter p1) throws android.os.RemoteException {}
        public void registerRemoteAnimationsForDisplay(int p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException {}
        public void alwaysShowUnsupportedCompileSdkWarning(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void setVrThread(int p0) throws android.os.RemoteException {}
        public void setPersistentVrThread(int p0) throws android.os.RemoteException {}
        public void stopAppSwitches() throws android.os.RemoteException {}
        public void resumeAppSwitches() throws android.os.RemoteException {}
        public void setActivityController(android.app.IActivityController p0, boolean p1) throws android.os.RemoteException {}
        public void setVoiceKeepAwake(android.service.voice.IVoiceInteractionSession p0, boolean p1) throws android.os.RemoteException {}
        public int getPackageScreenCompatMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void setPackageScreenCompatMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean getPackageAskScreenCompat(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setPackageAskScreenCompat(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void clearLaunchParamsForPackages(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void setDisplayToSingleTaskInstance(int p0) throws android.os.RemoteException {}
        public void restartActivityProcessIfVisible(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onBackPressedOnTaskRoot(android.os.IBinder p0, android.app.IRequestFinishCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
