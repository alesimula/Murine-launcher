package android.app;

public interface IActivityTaskManager extends android.os.IInterface {
    public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10) throws android.os.RemoteException;
    public int startActivities(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent[] p3, java.lang.String[] p4, android.os.IBinder p5, android.os.Bundle p6, int p7) throws android.os.RemoteException;
    public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException;
    public boolean startNextMatchingActivity(android.os.IBinder p0, android.content.Intent p1, android.os.Bundle p2) throws android.os.RemoteException;
    public boolean startDreamActivity(android.content.Intent p0) throws android.os.RemoteException;
    public int startActivityIntentSender(android.app.IApplicationThread p0, android.content.IIntentSender p1, android.os.IBinder p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, int p9, android.os.Bundle p10) throws android.os.RemoteException;
    public android.app.WaitResult startActivityAndWait(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException;
    public int startActivityWithConfig(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.content.res.Configuration p9, android.os.Bundle p10, int p11) throws android.os.RemoteException;
    public int startVoiceActivity(java.lang.String p0, java.lang.String p1, int p2, int p3, android.content.Intent p4, java.lang.String p5, android.service.voice.IVoiceInteractionSession p6, com.android.internal.app.IVoiceInteractor p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException;
    public int startAssistantActivity(java.lang.String p0, java.lang.String p1, int p2, int p3, android.content.Intent p4, java.lang.String p5, android.os.Bundle p6, int p7) throws android.os.RemoteException;
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
    public int getFrontActivityScreenCompatMode() throws android.os.RemoteException;
    public void setFrontActivityScreenCompatMode(int p0) throws android.os.RemoteException;
    public java.lang.String getCallingPackage(android.os.IBinder p0) throws android.os.RemoteException;
    public android.content.ComponentName getCallingActivity(android.os.IBinder p0) throws android.os.RemoteException;
    public void setFocusedTask(int p0) throws android.os.RemoteException;
    public boolean removeTask(int p0) throws android.os.RemoteException;
    public void removeAllVisibleRecentTasks() throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getFilteredTasks(int p0, boolean p1) throws android.os.RemoteException;
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
    public int getDisplayId(android.os.IBinder p0) throws android.os.RemoteException;
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
    public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException;
    public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException;
    public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException;
    public void toggleFreeformWindowingMode(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    public void moveStackToDisplay(int p0, int p1) throws android.os.RemoteException;
    public void removeStack(int p0) throws android.os.RemoteException;
    public boolean setTaskWindowingMode(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void moveTaskToStack(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean setTaskWindowingModeSplitScreenPrimary(int p0, boolean p1) throws android.os.RemoteException;
    public void removeStacksInWindowingModes(int[] p0) throws android.os.RemoteException;
    public void removeStacksWithActivityTypes(int[] p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfos() throws android.os.RemoteException;
    public android.app.ActivityManager.StackInfo getStackInfo(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfosOnDisplay(int p0) throws android.os.RemoteException;
    public android.app.ActivityManager.StackInfo getStackInfoOnDisplay(int p0, int p1, int p2) throws android.os.RemoteException;
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
    public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException;
    public boolean moveTopActivityToPinnedStack(int p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException;
    public void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException;
    public void requestPictureInPictureMode(android.os.IBinder p0) throws android.os.RemoteException;
    public int getMaxNumPictureInPictureActions(android.os.IBinder p0) throws android.os.RemoteException;
    public android.os.IBinder getUriPermissionOwnerForActivity(android.os.IBinder p0) throws android.os.RemoteException;
    public void resizeDockedStack(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException;
    public android.window.IWindowOrganizerController getWindowOrganizerController() throws android.os.RemoteException;
    public void setSplitScreenResizing(boolean p0) throws android.os.RemoteException;
    public int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) throws android.os.RemoteException;
    public void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void stopLocalVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean supportsLocalVoiceInteraction() throws android.os.RemoteException;
    public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() throws android.os.RemoteException;
    public void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException;
    public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException;
    public void setDisablePreviewScreenshots(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void invalidateHomeTaskSnapshot(android.os.IBinder p0) throws android.os.RemoteException;
    public int getLastResumedActivityUserId() throws android.os.RemoteException;
    public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException;
    public void updateLockTaskFeatures(int p0, int p1) throws android.os.RemoteException;
    public void setShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void setTurnScreenOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException;
    public void unregisterRemoteAnimations(android.os.IBinder p0) throws android.os.RemoteException;
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

    public static class Default implements android.app.IActivityTaskManager {
        public Default() {}
        public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10) throws android.os.RemoteException { return 0; }
        public int startActivities(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent[] p3, java.lang.String[] p4, android.os.IBinder p5, android.os.Bundle p6, int p7) throws android.os.RemoteException { return 0; }
        public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException { return 0; }
        public boolean startNextMatchingActivity(android.os.IBinder p0, android.content.Intent p1, android.os.Bundle p2) throws android.os.RemoteException { return false; }
        public boolean startDreamActivity(android.content.Intent p0) throws android.os.RemoteException { return false; }
        public int startActivityIntentSender(android.app.IApplicationThread p0, android.content.IIntentSender p1, android.os.IBinder p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, int p9, android.os.Bundle p10) throws android.os.RemoteException { return 0; }
        public android.app.WaitResult startActivityAndWait(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException { return null; }
        public int startActivityWithConfig(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.content.res.Configuration p9, android.os.Bundle p10, int p11) throws android.os.RemoteException { return 0; }
        public int startVoiceActivity(java.lang.String p0, java.lang.String p1, int p2, int p3, android.content.Intent p4, java.lang.String p5, android.service.voice.IVoiceInteractionSession p6, com.android.internal.app.IVoiceInteractor p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException { return 0; }
        public int startAssistantActivity(java.lang.String p0, java.lang.String p1, int p2, int p3, android.content.Intent p4, java.lang.String p5, android.os.Bundle p6, int p7) throws android.os.RemoteException { return 0; }
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
        public int getFrontActivityScreenCompatMode() throws android.os.RemoteException { return 0; }
        public void setFrontActivityScreenCompatMode(int p0) throws android.os.RemoteException {}
        public java.lang.String getCallingPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getCallingActivity(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void setFocusedTask(int p0) throws android.os.RemoteException {}
        public boolean removeTask(int p0) throws android.os.RemoteException { return false; }
        public void removeAllVisibleRecentTasks() throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getFilteredTasks(int p0, boolean p1) throws android.os.RemoteException { return null; }
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
        public int getDisplayId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
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
        public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
        public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
        public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException {}
        public void toggleFreeformWindowingMode(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException { return false; }
        public void moveStackToDisplay(int p0, int p1) throws android.os.RemoteException {}
        public void removeStack(int p0) throws android.os.RemoteException {}
        public boolean setTaskWindowingMode(int p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public void moveTaskToStack(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean setTaskWindowingModeSplitScreenPrimary(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void removeStacksInWindowingModes(int[] p0) throws android.os.RemoteException {}
        public void removeStacksWithActivityTypes(int[] p0) throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfos() throws android.os.RemoteException { return null; }
        public android.app.ActivityManager.StackInfo getStackInfo(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfosOnDisplay(int p0) throws android.os.RemoteException { return null; }
        public android.app.ActivityManager.StackInfo getStackInfoOnDisplay(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
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
        public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
        public boolean moveTopActivityToPinnedStack(int p0, android.graphics.Rect p1) throws android.os.RemoteException { return false; }
        public boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException { return false; }
        public void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException {}
        public void requestPictureInPictureMode(android.os.IBinder p0) throws android.os.RemoteException {}
        public int getMaxNumPictureInPictureActions(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder getUriPermissionOwnerForActivity(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void resizeDockedStack(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException {}
        public android.window.IWindowOrganizerController getWindowOrganizerController() throws android.os.RemoteException { return null; }
        public void setSplitScreenResizing(boolean p0) throws android.os.RemoteException {}
        public int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) throws android.os.RemoteException { return 0; }
        public void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void stopLocalVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean supportsLocalVoiceInteraction() throws android.os.RemoteException { return false; }
        public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() throws android.os.RemoteException { return null; }
        public void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException {}
        public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public void setDisablePreviewScreenshots(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void invalidateHomeTaskSnapshot(android.os.IBinder p0) throws android.os.RemoteException {}
        public int getLastResumedActivityUserId() throws android.os.RemoteException { return 0; }
        public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException { return false; }
        public void updateLockTaskFeatures(int p0, int p1) throws android.os.RemoteException {}
        public void setShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void setTurnScreenOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException {}
        public void unregisterRemoteAnimations(android.os.IBinder p0) throws android.os.RemoteException {}
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

    public static abstract class Stub extends android.os.Binder implements android.app.IActivityTaskManager {
        private static final java.lang.String DESCRIPTOR = "android.app.IActivityTaskManager";
        static final int TRANSACTION_startActivity = 1;
        static final int TRANSACTION_startActivities = 2;
        static final int TRANSACTION_startActivityAsUser = 3;
        static final int TRANSACTION_startNextMatchingActivity = 4;
        static final int TRANSACTION_startDreamActivity = 5;
        static final int TRANSACTION_startActivityIntentSender = 6;
        static final int TRANSACTION_startActivityAndWait = 7;
        static final int TRANSACTION_startActivityWithConfig = 8;
        static final int TRANSACTION_startVoiceActivity = 9;
        static final int TRANSACTION_startAssistantActivity = 10;
        static final int TRANSACTION_startRecentsActivity = 11;
        static final int TRANSACTION_startActivityFromRecents = 12;
        static final int TRANSACTION_startActivityAsCaller = 13;
        static final int TRANSACTION_isActivityStartAllowedOnDisplay = 14;
        static final int TRANSACTION_unhandledBack = 15;
        static final int TRANSACTION_finishActivity = 16;
        static final int TRANSACTION_finishActivityAffinity = 17;
        static final int TRANSACTION_activityIdle = 18;
        static final int TRANSACTION_activityResumed = 19;
        static final int TRANSACTION_activityTopResumedStateLost = 20;
        static final int TRANSACTION_activityPaused = 21;
        static final int TRANSACTION_activityStopped = 22;
        static final int TRANSACTION_activityDestroyed = 23;
        static final int TRANSACTION_activityRelaunched = 24;
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
        static final int TRANSACTION_getDisplayId = 47;
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
        static final int TRANSACTION_registerTaskStackListener = 81;
        static final int TRANSACTION_unregisterTaskStackListener = 82;
        static final int TRANSACTION_setTaskResizeable = 83;
        static final int TRANSACTION_toggleFreeformWindowingMode = 84;
        static final int TRANSACTION_resizeTask = 85;
        static final int TRANSACTION_moveStackToDisplay = 86;
        static final int TRANSACTION_removeStack = 87;
        static final int TRANSACTION_setTaskWindowingMode = 88;
        static final int TRANSACTION_moveTaskToStack = 89;
        static final int TRANSACTION_setTaskWindowingModeSplitScreenPrimary = 90;
        static final int TRANSACTION_removeStacksInWindowingModes = 91;
        static final int TRANSACTION_removeStacksWithActivityTypes = 92;
        static final int TRANSACTION_getAllStackInfos = 93;
        static final int TRANSACTION_getStackInfo = 94;
        static final int TRANSACTION_getAllStackInfosOnDisplay = 95;
        static final int TRANSACTION_getStackInfoOnDisplay = 96;
        static final int TRANSACTION_setLockScreenShown = 97;
        static final int TRANSACTION_getAssistContextExtras = 98;
        static final int TRANSACTION_launchAssistIntent = 99;
        static final int TRANSACTION_requestAssistContextExtras = 100;
        static final int TRANSACTION_requestAutofillData = 101;
        static final int TRANSACTION_isAssistDataAllowedOnCurrentActivity = 102;
        static final int TRANSACTION_showAssistFromActivity = 103;
        static final int TRANSACTION_isRootVoiceInteraction = 104;
        static final int TRANSACTION_showLockTaskEscapeMessage = 105;
        static final int TRANSACTION_keyguardGoingAway = 106;
        static final int TRANSACTION_getActivityClassForToken = 107;
        static final int TRANSACTION_getPackageForToken = 108;
        static final int TRANSACTION_positionTaskInStack = 109;
        static final int TRANSACTION_reportSizeConfigurations = 110;
        static final int TRANSACTION_suppressResizeConfigChanges = 111;
        static final int TRANSACTION_moveTopActivityToPinnedStack = 112;
        static final int TRANSACTION_enterPictureInPictureMode = 113;
        static final int TRANSACTION_setPictureInPictureParams = 114;
        static final int TRANSACTION_requestPictureInPictureMode = 115;
        static final int TRANSACTION_getMaxNumPictureInPictureActions = 116;
        static final int TRANSACTION_getUriPermissionOwnerForActivity = 117;
        static final int TRANSACTION_resizeDockedStack = 118;
        static final int TRANSACTION_getWindowOrganizerController = 119;
        static final int TRANSACTION_setSplitScreenResizing = 120;
        static final int TRANSACTION_setVrMode = 121;
        static final int TRANSACTION_startLocalVoiceInteraction = 122;
        static final int TRANSACTION_stopLocalVoiceInteraction = 123;
        static final int TRANSACTION_supportsLocalVoiceInteraction = 124;
        static final int TRANSACTION_getDeviceConfigurationInfo = 125;
        static final int TRANSACTION_dismissKeyguard = 126;
        static final int TRANSACTION_cancelTaskWindowTransition = 127;
        static final int TRANSACTION_getTaskSnapshot = 128;
        static final int TRANSACTION_setDisablePreviewScreenshots = 129;
        static final int TRANSACTION_invalidateHomeTaskSnapshot = 130;
        static final int TRANSACTION_getLastResumedActivityUserId = 131;
        static final int TRANSACTION_updateConfiguration = 132;
        static final int TRANSACTION_updateLockTaskFeatures = 133;
        static final int TRANSACTION_setShowWhenLocked = 134;
        static final int TRANSACTION_setInheritShowWhenLocked = 135;
        static final int TRANSACTION_setTurnScreenOn = 136;
        static final int TRANSACTION_registerRemoteAnimations = 137;
        static final int TRANSACTION_unregisterRemoteAnimations = 138;
        static final int TRANSACTION_registerRemoteAnimationForNextActivityStart = 139;
        static final int TRANSACTION_registerRemoteAnimationsForDisplay = 140;
        static final int TRANSACTION_alwaysShowUnsupportedCompileSdkWarning = 141;
        static final int TRANSACTION_setVrThread = 142;
        static final int TRANSACTION_setPersistentVrThread = 143;
        static final int TRANSACTION_stopAppSwitches = 144;
        static final int TRANSACTION_resumeAppSwitches = 145;
        static final int TRANSACTION_setActivityController = 146;
        static final int TRANSACTION_setVoiceKeepAwake = 147;
        static final int TRANSACTION_getPackageScreenCompatMode = 148;
        static final int TRANSACTION_setPackageScreenCompatMode = 149;
        static final int TRANSACTION_getPackageAskScreenCompat = 150;
        static final int TRANSACTION_setPackageAskScreenCompat = 151;
        static final int TRANSACTION_clearLaunchParamsForPackages = 152;
        static final int TRANSACTION_setDisplayToSingleTaskInstance = 153;
        static final int TRANSACTION_restartActivityProcessIfVisible = 154;
        static final int TRANSACTION_onBackPressedOnTaskRoot = 155;
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
            public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10) throws android.os.RemoteException { return 0; }
            public int startActivities(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent[] p3, java.lang.String[] p4, android.os.IBinder p5, android.os.Bundle p6, int p7) throws android.os.RemoteException { return 0; }
            public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException { return 0; }
            public boolean startNextMatchingActivity(android.os.IBinder p0, android.content.Intent p1, android.os.Bundle p2) throws android.os.RemoteException { return false; }
            public boolean startDreamActivity(android.content.Intent p0) throws android.os.RemoteException { return false; }
            public int startActivityIntentSender(android.app.IApplicationThread p0, android.content.IIntentSender p1, android.os.IBinder p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, int p9, android.os.Bundle p10) throws android.os.RemoteException { return 0; }
            public android.app.WaitResult startActivityAndWait(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException { return null; }
            public int startActivityWithConfig(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.content.res.Configuration p9, android.os.Bundle p10, int p11) throws android.os.RemoteException { return 0; }
            public int startVoiceActivity(java.lang.String p0, java.lang.String p1, int p2, int p3, android.content.Intent p4, java.lang.String p5, android.service.voice.IVoiceInteractionSession p6, com.android.internal.app.IVoiceInteractor p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException { return 0; }
            public int startAssistantActivity(java.lang.String p0, java.lang.String p1, int p2, int p3, android.content.Intent p4, java.lang.String p5, android.os.Bundle p6, int p7) throws android.os.RemoteException { return 0; }
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
            public int getFrontActivityScreenCompatMode() throws android.os.RemoteException { return 0; }
            public void setFrontActivityScreenCompatMode(int p0) throws android.os.RemoteException {}
            public java.lang.String getCallingPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getCallingActivity(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void setFocusedTask(int p0) throws android.os.RemoteException {}
            public boolean removeTask(int p0) throws android.os.RemoteException { return false; }
            public void removeAllVisibleRecentTasks() throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getFilteredTasks(int p0, boolean p1) throws android.os.RemoteException { return null; }
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
            public int getDisplayId(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
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
            public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
            public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
            public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException {}
            public void toggleFreeformWindowingMode(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException { return false; }
            public void moveStackToDisplay(int p0, int p1) throws android.os.RemoteException {}
            public void removeStack(int p0) throws android.os.RemoteException {}
            public boolean setTaskWindowingMode(int p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public void moveTaskToStack(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean setTaskWindowingModeSplitScreenPrimary(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void removeStacksInWindowingModes(int[] p0) throws android.os.RemoteException {}
            public void removeStacksWithActivityTypes(int[] p0) throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfos() throws android.os.RemoteException { return null; }
            public android.app.ActivityManager.StackInfo getStackInfo(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfosOnDisplay(int p0) throws android.os.RemoteException { return null; }
            public android.app.ActivityManager.StackInfo getStackInfoOnDisplay(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
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
            public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
            public boolean moveTopActivityToPinnedStack(int p0, android.graphics.Rect p1) throws android.os.RemoteException { return false; }
            public boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException { return false; }
            public void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) throws android.os.RemoteException {}
            public void requestPictureInPictureMode(android.os.IBinder p0) throws android.os.RemoteException {}
            public int getMaxNumPictureInPictureActions(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public android.os.IBinder getUriPermissionOwnerForActivity(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void resizeDockedStack(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException {}
            public android.window.IWindowOrganizerController getWindowOrganizerController() throws android.os.RemoteException { return null; }
            public void setSplitScreenResizing(boolean p0) throws android.os.RemoteException {}
            public int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) throws android.os.RemoteException { return 0; }
            public void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void stopLocalVoiceInteraction(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean supportsLocalVoiceInteraction() throws android.os.RemoteException { return false; }
            public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() throws android.os.RemoteException { return null; }
            public void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException {}
            public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public void setDisablePreviewScreenshots(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void invalidateHomeTaskSnapshot(android.os.IBinder p0) throws android.os.RemoteException {}
            public int getLastResumedActivityUserId() throws android.os.RemoteException { return 0; }
            public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException { return false; }
            public void updateLockTaskFeatures(int p0, int p1) throws android.os.RemoteException {}
            public void setShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void setTurnScreenOn(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException {}
            public void unregisterRemoteAnimations(android.os.IBinder p0) throws android.os.RemoteException {}
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
}
