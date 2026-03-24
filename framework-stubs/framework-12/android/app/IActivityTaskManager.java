package android.app;

public interface IActivityTaskManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IActivityTaskManager";
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
    public void startRecentsActivity(android.content.Intent p0, long p1, android.view.IRecentsAnimationRunner p2) throws android.os.RemoteException;
    public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException;
    public int startActivityAsCaller(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, android.os.IBinder p10, boolean p11, int p12) throws android.os.RemoteException;
    public boolean isActivityStartAllowedOnDisplay(int p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void unhandledBack() throws android.os.RemoteException;
    public android.app.IActivityClientController getActivityClientController() throws android.os.RemoteException;
    public int getFrontActivityScreenCompatMode() throws android.os.RemoteException;
    public void setFrontActivityScreenCompatMode(int p0) throws android.os.RemoteException;
    public void setFocusedTask(int p0) throws android.os.RemoteException;
    public boolean removeTask(int p0) throws android.os.RemoteException;
    public void removeAllVisibleRecentTasks() throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isTopActivityImmersive() throws android.os.RemoteException;
    public android.app.ActivityManager.TaskDescription getTaskDescription(int p0) throws android.os.RemoteException;
    public void reportAssistContextExtras(android.os.IBinder p0, android.os.Bundle p1, android.app.assist.AssistStructure p2, android.app.assist.AssistContent p3, android.net.Uri p4) throws android.os.RemoteException;
    public void setFocusedRootTask(int p0) throws android.os.RemoteException;
    public android.app.ActivityTaskManager.RootTaskInfo getFocusedRootTaskInfo() throws android.os.RemoteException;
    public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException;
    public void cancelRecentsAnimation(boolean p0) throws android.os.RemoteException;
    public void updateLockTaskPackages(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public boolean isInLockTaskMode() throws android.os.RemoteException;
    public int getLockTaskModeState() throws android.os.RemoteException;
    public java.util.List<android.os.IBinder> getAppTasks(java.lang.String p0) throws android.os.RemoteException;
    public void startSystemLockTaskMode(int p0) throws android.os.RemoteException;
    public void stopSystemLockTaskMode() throws android.os.RemoteException;
    public void finishVoiceTask(android.service.voice.IVoiceInteractionSession p0) throws android.os.RemoteException;
    public int addAppTask(android.os.IBinder p0, android.content.Intent p1, android.app.ActivityManager.TaskDescription p2, android.graphics.Bitmap p3) throws android.os.RemoteException;
    public android.graphics.Point getAppTaskThumbnailSize() throws android.os.RemoteException;
    public android.os.IBinder requestStartActivityPermissionToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void releaseSomeActivities(android.app.IApplicationThread p0) throws android.os.RemoteException;
    public android.graphics.Bitmap getTaskDescriptionIcon(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException;
    public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException;
    public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException;
    public boolean resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    public void moveRootTaskToDisplay(int p0, int p1) throws android.os.RemoteException;
    public void moveTaskToRootTask(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void removeRootTasksInWindowingModes(int[] p0) throws android.os.RemoteException;
    public void removeRootTasksWithActivityTypes(int[] p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityTaskManager.RootTaskInfo> getAllRootTaskInfos() throws android.os.RemoteException;
    public android.app.ActivityTaskManager.RootTaskInfo getRootTaskInfo(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityTaskManager.RootTaskInfo> getAllRootTaskInfosOnDisplay(int p0) throws android.os.RemoteException;
    public android.app.ActivityTaskManager.RootTaskInfo getRootTaskInfoOnDisplay(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setLockScreenShown(boolean p0, boolean p1) throws android.os.RemoteException;
    public android.os.Bundle getAssistContextExtras(int p0) throws android.os.RemoteException;
    public boolean requestAssistContextExtras(int p0, android.app.IAssistDataReceiver p1, android.os.Bundle p2, android.os.IBinder p3, boolean p4, boolean p5) throws android.os.RemoteException;
    public boolean requestAutofillData(android.app.IAssistDataReceiver p0, android.os.Bundle p1, android.os.IBinder p2, int p3) throws android.os.RemoteException;
    public boolean isAssistDataAllowedOnCurrentActivity() throws android.os.RemoteException;
    public boolean requestAssistDataForTask(android.app.IAssistDataReceiver p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void keyguardGoingAway(int p0) throws android.os.RemoteException;
    public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException;
    public android.window.IWindowOrganizerController getWindowOrganizerController() throws android.os.RemoteException;
    public void setSplitScreenResizing(boolean p0) throws android.os.RemoteException;
    public boolean supportsLocalVoiceInteraction() throws android.os.RemoteException;
    public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() throws android.os.RemoteException;
    public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException;
    public android.window.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException;
    public int getLastResumedActivityUserId() throws android.os.RemoteException;
    public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException;
    public void updateLockTaskFeatures(int p0, int p1) throws android.os.RemoteException;
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
    public void onSplashScreenViewCopyFinished(int p0, android.window.SplashScreenView.SplashScreenViewParcelable p1) throws android.os.RemoteException;
    public void onPictureInPictureStateChanged(android.app.PictureInPictureUiState p0) throws android.os.RemoteException;

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
        public void startRecentsActivity(android.content.Intent p0, long p1, android.view.IRecentsAnimationRunner p2) throws android.os.RemoteException {}
        public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
        public int startActivityAsCaller(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, android.os.IBinder p10, boolean p11, int p12) throws android.os.RemoteException { return 0; }
        public boolean isActivityStartAllowedOnDisplay(int p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return false; }
        public void unhandledBack() throws android.os.RemoteException {}
        public android.app.IActivityClientController getActivityClientController() throws android.os.RemoteException { return null; }
        public int getFrontActivityScreenCompatMode() throws android.os.RemoteException { return 0; }
        public void setFrontActivityScreenCompatMode(int p0) throws android.os.RemoteException {}
        public void setFocusedTask(int p0) throws android.os.RemoteException {}
        public boolean removeTask(int p0) throws android.os.RemoteException { return false; }
        public void removeAllVisibleRecentTasks() throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0, boolean p1, boolean p2) throws android.os.RemoteException { return null; }
        public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean isTopActivityImmersive() throws android.os.RemoteException { return false; }
        public android.app.ActivityManager.TaskDescription getTaskDescription(int p0) throws android.os.RemoteException { return null; }
        public void reportAssistContextExtras(android.os.IBinder p0, android.os.Bundle p1, android.app.assist.AssistStructure p2, android.app.assist.AssistContent p3, android.net.Uri p4) throws android.os.RemoteException {}
        public void setFocusedRootTask(int p0) throws android.os.RemoteException {}
        public android.app.ActivityTaskManager.RootTaskInfo getFocusedRootTaskInfo() throws android.os.RemoteException { return null; }
        public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException { return null; }
        public void cancelRecentsAnimation(boolean p0) throws android.os.RemoteException {}
        public void updateLockTaskPackages(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public boolean isInLockTaskMode() throws android.os.RemoteException { return false; }
        public int getLockTaskModeState() throws android.os.RemoteException { return 0; }
        public java.util.List<android.os.IBinder> getAppTasks(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void startSystemLockTaskMode(int p0) throws android.os.RemoteException {}
        public void stopSystemLockTaskMode() throws android.os.RemoteException {}
        public void finishVoiceTask(android.service.voice.IVoiceInteractionSession p0) throws android.os.RemoteException {}
        public int addAppTask(android.os.IBinder p0, android.content.Intent p1, android.app.ActivityManager.TaskDescription p2, android.graphics.Bitmap p3) throws android.os.RemoteException { return 0; }
        public android.graphics.Point getAppTaskThumbnailSize() throws android.os.RemoteException { return null; }
        public android.os.IBinder requestStartActivityPermissionToken(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void releaseSomeActivities(android.app.IApplicationThread p0) throws android.os.RemoteException {}
        public android.graphics.Bitmap getTaskDescriptionIcon(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
        public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
        public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException {}
        public boolean resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException { return false; }
        public void moveRootTaskToDisplay(int p0, int p1) throws android.os.RemoteException {}
        public void moveTaskToRootTask(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void removeRootTasksInWindowingModes(int[] p0) throws android.os.RemoteException {}
        public void removeRootTasksWithActivityTypes(int[] p0) throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityTaskManager.RootTaskInfo> getAllRootTaskInfos() throws android.os.RemoteException { return null; }
        public android.app.ActivityTaskManager.RootTaskInfo getRootTaskInfo(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.ActivityTaskManager.RootTaskInfo> getAllRootTaskInfosOnDisplay(int p0) throws android.os.RemoteException { return null; }
        public android.app.ActivityTaskManager.RootTaskInfo getRootTaskInfoOnDisplay(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void setLockScreenShown(boolean p0, boolean p1) throws android.os.RemoteException {}
        public android.os.Bundle getAssistContextExtras(int p0) throws android.os.RemoteException { return null; }
        public boolean requestAssistContextExtras(int p0, android.app.IAssistDataReceiver p1, android.os.Bundle p2, android.os.IBinder p3, boolean p4, boolean p5) throws android.os.RemoteException { return false; }
        public boolean requestAutofillData(android.app.IAssistDataReceiver p0, android.os.Bundle p1, android.os.IBinder p2, int p3) throws android.os.RemoteException { return false; }
        public boolean isAssistDataAllowedOnCurrentActivity() throws android.os.RemoteException { return false; }
        public boolean requestAssistDataForTask(android.app.IAssistDataReceiver p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void keyguardGoingAway(int p0) throws android.os.RemoteException {}
        public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
        public android.window.IWindowOrganizerController getWindowOrganizerController() throws android.os.RemoteException { return null; }
        public void setSplitScreenResizing(boolean p0) throws android.os.RemoteException {}
        public boolean supportsLocalVoiceInteraction() throws android.os.RemoteException { return false; }
        public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() throws android.os.RemoteException { return null; }
        public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException {}
        public android.window.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public int getLastResumedActivityUserId() throws android.os.RemoteException { return 0; }
        public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException { return false; }
        public void updateLockTaskFeatures(int p0, int p1) throws android.os.RemoteException {}
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
        public void onSplashScreenViewCopyFinished(int p0, android.window.SplashScreenView.SplashScreenViewParcelable p1) throws android.os.RemoteException {}
        public void onPictureInPictureStateChanged(android.app.PictureInPictureUiState p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IActivityTaskManager {
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
        static final int TRANSACTION_getActivityClientController = 16;
        static final int TRANSACTION_getFrontActivityScreenCompatMode = 17;
        static final int TRANSACTION_setFrontActivityScreenCompatMode = 18;
        static final int TRANSACTION_setFocusedTask = 19;
        static final int TRANSACTION_removeTask = 20;
        static final int TRANSACTION_removeAllVisibleRecentTasks = 21;
        static final int TRANSACTION_getTasks = 22;
        static final int TRANSACTION_moveTaskToFront = 23;
        static final int TRANSACTION_getRecentTasks = 24;
        static final int TRANSACTION_isTopActivityImmersive = 25;
        static final int TRANSACTION_getTaskDescription = 26;
        static final int TRANSACTION_reportAssistContextExtras = 27;
        static final int TRANSACTION_setFocusedRootTask = 28;
        static final int TRANSACTION_getFocusedRootTaskInfo = 29;
        static final int TRANSACTION_getTaskBounds = 30;
        static final int TRANSACTION_cancelRecentsAnimation = 31;
        static final int TRANSACTION_updateLockTaskPackages = 32;
        static final int TRANSACTION_isInLockTaskMode = 33;
        static final int TRANSACTION_getLockTaskModeState = 34;
        static final int TRANSACTION_getAppTasks = 35;
        static final int TRANSACTION_startSystemLockTaskMode = 36;
        static final int TRANSACTION_stopSystemLockTaskMode = 37;
        static final int TRANSACTION_finishVoiceTask = 38;
        static final int TRANSACTION_addAppTask = 39;
        static final int TRANSACTION_getAppTaskThumbnailSize = 40;
        static final int TRANSACTION_requestStartActivityPermissionToken = 41;
        static final int TRANSACTION_releaseSomeActivities = 42;
        static final int TRANSACTION_getTaskDescriptionIcon = 43;
        static final int TRANSACTION_registerTaskStackListener = 44;
        static final int TRANSACTION_unregisterTaskStackListener = 45;
        static final int TRANSACTION_setTaskResizeable = 46;
        static final int TRANSACTION_resizeTask = 47;
        static final int TRANSACTION_moveRootTaskToDisplay = 48;
        static final int TRANSACTION_moveTaskToRootTask = 49;
        static final int TRANSACTION_removeRootTasksInWindowingModes = 50;
        static final int TRANSACTION_removeRootTasksWithActivityTypes = 51;
        static final int TRANSACTION_getAllRootTaskInfos = 52;
        static final int TRANSACTION_getRootTaskInfo = 53;
        static final int TRANSACTION_getAllRootTaskInfosOnDisplay = 54;
        static final int TRANSACTION_getRootTaskInfoOnDisplay = 55;
        static final int TRANSACTION_setLockScreenShown = 56;
        static final int TRANSACTION_getAssistContextExtras = 57;
        static final int TRANSACTION_requestAssistContextExtras = 58;
        static final int TRANSACTION_requestAutofillData = 59;
        static final int TRANSACTION_isAssistDataAllowedOnCurrentActivity = 60;
        static final int TRANSACTION_requestAssistDataForTask = 61;
        static final int TRANSACTION_keyguardGoingAway = 62;
        static final int TRANSACTION_suppressResizeConfigChanges = 63;
        static final int TRANSACTION_getWindowOrganizerController = 64;
        static final int TRANSACTION_setSplitScreenResizing = 65;
        static final int TRANSACTION_supportsLocalVoiceInteraction = 66;
        static final int TRANSACTION_getDeviceConfigurationInfo = 67;
        static final int TRANSACTION_cancelTaskWindowTransition = 68;
        static final int TRANSACTION_getTaskSnapshot = 69;
        static final int TRANSACTION_getLastResumedActivityUserId = 70;
        static final int TRANSACTION_updateConfiguration = 71;
        static final int TRANSACTION_updateLockTaskFeatures = 72;
        static final int TRANSACTION_registerRemoteAnimationForNextActivityStart = 73;
        static final int TRANSACTION_registerRemoteAnimationsForDisplay = 74;
        static final int TRANSACTION_alwaysShowUnsupportedCompileSdkWarning = 75;
        static final int TRANSACTION_setVrThread = 76;
        static final int TRANSACTION_setPersistentVrThread = 77;
        static final int TRANSACTION_stopAppSwitches = 78;
        static final int TRANSACTION_resumeAppSwitches = 79;
        static final int TRANSACTION_setActivityController = 80;
        static final int TRANSACTION_setVoiceKeepAwake = 81;
        static final int TRANSACTION_getPackageScreenCompatMode = 82;
        static final int TRANSACTION_setPackageScreenCompatMode = 83;
        static final int TRANSACTION_getPackageAskScreenCompat = 84;
        static final int TRANSACTION_setPackageAskScreenCompat = 85;
        static final int TRANSACTION_clearLaunchParamsForPackages = 86;
        static final int TRANSACTION_onSplashScreenViewCopyFinished = 87;
        static final int TRANSACTION_onPictureInPictureStateChanged = 88;
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
            public void startRecentsActivity(android.content.Intent p0, long p1, android.view.IRecentsAnimationRunner p2) throws android.os.RemoteException {}
            public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
            public int startActivityAsCaller(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, android.os.IBinder p10, boolean p11, int p12) throws android.os.RemoteException { return 0; }
            public boolean isActivityStartAllowedOnDisplay(int p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return false; }
            public void unhandledBack() throws android.os.RemoteException {}
            public android.app.IActivityClientController getActivityClientController() throws android.os.RemoteException { return null; }
            public int getFrontActivityScreenCompatMode() throws android.os.RemoteException { return 0; }
            public void setFrontActivityScreenCompatMode(int p0) throws android.os.RemoteException {}
            public void setFocusedTask(int p0) throws android.os.RemoteException {}
            public boolean removeTask(int p0) throws android.os.RemoteException { return false; }
            public void removeAllVisibleRecentTasks() throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0, boolean p1, boolean p2) throws android.os.RemoteException { return null; }
            public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean isTopActivityImmersive() throws android.os.RemoteException { return false; }
            public android.app.ActivityManager.TaskDescription getTaskDescription(int p0) throws android.os.RemoteException { return null; }
            public void reportAssistContextExtras(android.os.IBinder p0, android.os.Bundle p1, android.app.assist.AssistStructure p2, android.app.assist.AssistContent p3, android.net.Uri p4) throws android.os.RemoteException {}
            public void setFocusedRootTask(int p0) throws android.os.RemoteException {}
            public android.app.ActivityTaskManager.RootTaskInfo getFocusedRootTaskInfo() throws android.os.RemoteException { return null; }
            public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException { return null; }
            public void cancelRecentsAnimation(boolean p0) throws android.os.RemoteException {}
            public void updateLockTaskPackages(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public boolean isInLockTaskMode() throws android.os.RemoteException { return false; }
            public int getLockTaskModeState() throws android.os.RemoteException { return 0; }
            public java.util.List<android.os.IBinder> getAppTasks(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void startSystemLockTaskMode(int p0) throws android.os.RemoteException {}
            public void stopSystemLockTaskMode() throws android.os.RemoteException {}
            public void finishVoiceTask(android.service.voice.IVoiceInteractionSession p0) throws android.os.RemoteException {}
            public int addAppTask(android.os.IBinder p0, android.content.Intent p1, android.app.ActivityManager.TaskDescription p2, android.graphics.Bitmap p3) throws android.os.RemoteException { return 0; }
            public android.graphics.Point getAppTaskThumbnailSize() throws android.os.RemoteException { return null; }
            public android.os.IBinder requestStartActivityPermissionToken(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void releaseSomeActivities(android.app.IApplicationThread p0) throws android.os.RemoteException {}
            public android.graphics.Bitmap getTaskDescriptionIcon(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
            public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
            public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException {}
            public boolean resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException { return false; }
            public void moveRootTaskToDisplay(int p0, int p1) throws android.os.RemoteException {}
            public void moveTaskToRootTask(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void removeRootTasksInWindowingModes(int[] p0) throws android.os.RemoteException {}
            public void removeRootTasksWithActivityTypes(int[] p0) throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityTaskManager.RootTaskInfo> getAllRootTaskInfos() throws android.os.RemoteException { return null; }
            public android.app.ActivityTaskManager.RootTaskInfo getRootTaskInfo(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.ActivityTaskManager.RootTaskInfo> getAllRootTaskInfosOnDisplay(int p0) throws android.os.RemoteException { return null; }
            public android.app.ActivityTaskManager.RootTaskInfo getRootTaskInfoOnDisplay(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void setLockScreenShown(boolean p0, boolean p1) throws android.os.RemoteException {}
            public android.os.Bundle getAssistContextExtras(int p0) throws android.os.RemoteException { return null; }
            public boolean requestAssistContextExtras(int p0, android.app.IAssistDataReceiver p1, android.os.Bundle p2, android.os.IBinder p3, boolean p4, boolean p5) throws android.os.RemoteException { return false; }
            public boolean requestAutofillData(android.app.IAssistDataReceiver p0, android.os.Bundle p1, android.os.IBinder p2, int p3) throws android.os.RemoteException { return false; }
            public boolean isAssistDataAllowedOnCurrentActivity() throws android.os.RemoteException { return false; }
            public boolean requestAssistDataForTask(android.app.IAssistDataReceiver p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void keyguardGoingAway(int p0) throws android.os.RemoteException {}
            public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
            public android.window.IWindowOrganizerController getWindowOrganizerController() throws android.os.RemoteException { return null; }
            public void setSplitScreenResizing(boolean p0) throws android.os.RemoteException {}
            public boolean supportsLocalVoiceInteraction() throws android.os.RemoteException { return false; }
            public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() throws android.os.RemoteException { return null; }
            public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException {}
            public android.window.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public int getLastResumedActivityUserId() throws android.os.RemoteException { return 0; }
            public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException { return false; }
            public void updateLockTaskFeatures(int p0, int p1) throws android.os.RemoteException {}
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
            public void onSplashScreenViewCopyFinished(int p0, android.window.SplashScreenView.SplashScreenViewParcelable p1) throws android.os.RemoteException {}
            public void onPictureInPictureStateChanged(android.app.PictureInPictureUiState p0) throws android.os.RemoteException {}
        }
    }
}
