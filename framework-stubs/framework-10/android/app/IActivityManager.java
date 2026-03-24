package android.app;

public interface IActivityManager extends android.os.IInterface {
    public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException;
    public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException;
    public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void handleApplicationCrash(android.os.IBinder p0, android.app.ApplicationErrorReport.ParcelableCrashInfo p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void unhandledBack() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.Intent registerReceiver(android.app.IApplicationThread p0, java.lang.String p1, android.content.IIntentReceiver p2, android.content.IntentFilter p3, java.lang.String p4, int p5, int p6) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void unregisterReceiver(android.content.IIntentReceiver p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int broadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, android.content.IIntentReceiver p3, int p4, java.lang.String p5, android.os.Bundle p6, java.lang.String[] p7, int p8, android.os.Bundle p9, boolean p10, boolean p11, int p12) throws android.os.RemoteException;
    public void unbroadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, int p2) throws android.os.RemoteException;
    public void finishReceiver(android.os.IBinder p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, int p5) throws android.os.RemoteException;
    public void attachApplication(android.app.IApplicationThread p0, long p1) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getFilteredTasks(int p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public android.app.ContentProviderHolder getContentProvider(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void publishContentProviders(android.app.IApplicationThread p0, java.util.List<android.app.ContentProviderHolder> p1) throws android.os.RemoteException;
    public boolean refContentProvider(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.content.ComponentName startService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, boolean p3, java.lang.String p4, int p5) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int stopService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int bindService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, int p7) throws android.os.RemoteException;
    public int bindIsolatedService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, java.lang.String p7, int p8) throws android.os.RemoteException;
    public void updateServiceGroup(android.app.IServiceConnection p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean unbindService(android.app.IServiceConnection p0) throws android.os.RemoteException;
    public void publishService(android.os.IBinder p0, android.content.Intent p1, android.os.IBinder p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setDebugApp(java.lang.String p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void setAgentApp(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setAlwaysFinish(boolean p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean startInstrumentation(android.content.ComponentName p0, java.lang.String p1, int p2, android.os.Bundle p3, android.app.IInstrumentationWatcher p4, android.app.IUiAutomationConnection p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    public void addInstrumentationResults(android.app.IApplicationThread p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void finishInstrumentation(android.app.IApplicationThread p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.res.Configuration getConfiguration() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException;
    public boolean stopServiceToken(android.content.ComponentName p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setProcessLimit(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getProcessLimit() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3, int p4, android.os.IBinder p5) throws android.os.RemoteException;
    public void grantUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException;
    public void revokeUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setActivityController(android.app.IActivityController p0, boolean p1) throws android.os.RemoteException;
    public void showWaitingForDebugger(android.app.IApplicationThread p0, boolean p1) throws android.os.RemoteException;
    public void signalPersistentProcesses(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ParceledListSlice getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException;
    public void serviceDoneExecuting(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.IIntentSender getIntentSender(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.String p3, int p4, android.content.Intent[] p5, java.lang.String[] p6, int p7, android.os.Bundle p8, int p9) throws android.os.RemoteException;
    public void cancelIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException;
    public java.lang.String getPackageForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException;
    public void registerIntentSenderCancelListener(android.content.IIntentSender p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException;
    public void unregisterIntentSenderCancelListener(android.content.IIntentSender p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException;
    public void enterSafeMode() throws android.os.RemoteException;
    public void noteWakeupAlarm(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void removeContentProvider(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setRequestedOrientation(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void unbindFinished(android.os.IBinder p0, android.content.Intent p1, boolean p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setProcessImportant(android.os.IBinder p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException;
    public void setServiceForeground(android.content.ComponentName p0, android.os.IBinder p1, int p2, android.app.Notification p3, int p4, int p5) throws android.os.RemoteException;
    public int getForegroundServiceType(android.content.ComponentName p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void getMemoryInfo(android.app.ActivityManager.MemoryInfo p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState() throws android.os.RemoteException;
    public boolean clearApplicationUserData(java.lang.String p0, boolean p1, android.content.pm.IPackageDataObserver p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void forceStopPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean killPids(int[] p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.app.ActivityManager.RunningServiceInfo> getServices(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws android.os.RemoteException;
    public android.os.IBinder peekService(android.content.Intent p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean profileControl(java.lang.String p0, int p1, boolean p2, android.app.ProfilerInfo p3, int p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean shutdown(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void stopAppSwitches() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void resumeAppSwitches() throws android.os.RemoteException;
    public boolean bindBackupAgent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void backupAgentCreated(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public void unbindBackupAgent(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException;
    public int getUidForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException;
    public int handleIncomingUser(int p0, int p1, int p2, boolean p3, boolean p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException;
    public void addPackageDependency(java.lang.String p0) throws android.os.RemoteException;
    public void killApplication(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) throws android.os.RemoteException;
    public void killApplicationProcess(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void killBackgroundProcesses(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isUserAMonkey() throws android.os.RemoteException;
    public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void finishHeavyWeightApp() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void handleApplicationStrictModeViolation(android.os.IBinder p0, int p1, android.os.StrictMode.ViolationInfo p2) throws android.os.RemoteException;
    public boolean isTopActivityImmersive() throws android.os.RemoteException;
    public void crashApplication(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getProviderMimeType(android.net.Uri p0, int p1) throws android.os.RemoteException;
    public boolean dumpHeap(java.lang.String p0, int p1, boolean p2, boolean p3, boolean p4, java.lang.String p5, android.os.ParcelFileDescriptor p6, android.os.RemoteCallback p7) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isUserRunning(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setPackageScreenCompatMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean switchUser(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean removeTask(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void registerProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void unregisterProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException;
    public boolean isIntentSenderTargetedToPackage(android.content.IIntentSender p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void updatePersistentConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public long[] getProcessPss(int[] p0) throws android.os.RemoteException;
    public void showBootMessage(java.lang.CharSequence p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void killAllBackgroundProcesses() throws android.os.RemoteException;
    public android.app.ContentProviderHolder getContentProviderExternal(java.lang.String p0, int p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void removeContentProviderExternal(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void removeContentProviderExternalAsUser(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public void getMyMemoryState(android.app.ActivityManager.RunningAppProcessInfo p0) throws android.os.RemoteException;
    public boolean killProcessesBelowForeground(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.UserInfo getCurrentUser() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isIntentSenderAnActivity(android.content.IIntentSender p0) throws android.os.RemoteException;
    public boolean isIntentSenderAForegroundService(android.content.IIntentSender p0) throws android.os.RemoteException;
    public boolean isIntentSenderABroadcast(android.content.IIntentSender p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int stopUser(int p0, boolean p1, android.app.IStopUserCallback p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void registerUserSwitchObserver(android.app.IUserSwitchObserver p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterUserSwitchObserver(android.app.IUserSwitchObserver p0) throws android.os.RemoteException;
    public int[] getRunningUserIds() throws android.os.RemoteException;
    public void requestSystemServerHeapDump() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void requestBugReport(int p0) throws android.os.RemoteException;
    public void requestTelephonyBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void requestWifiBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.Intent getIntentForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException;
    public void killUid(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setUserIsMonkey(boolean p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void hang(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfos() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void moveTaskToStack(int p0, int p1, boolean p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void resizeStack(int p0, android.graphics.Rect p1, boolean p2, boolean p3, boolean p4, int p5) throws android.os.RemoteException;
    public void setFocusedStack(int p0) throws android.os.RemoteException;
    public android.app.ActivityManager.StackInfo getFocusedStackInfo() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void restart() throws android.os.RemoteException;
    public void performIdleMaintenance() throws android.os.RemoteException;
    public void appNotRespondingViaProvider(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean setProcessMemoryTrimLevel(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public java.lang.String getTagForIntentSender(android.content.IIntentSender p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean startUserInBackground(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isInLockTaskMode() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void startRecentsActivity(android.content.Intent p0, android.app.IAssistDataReceiver p1, android.view.IRecentsAnimationRunner p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void cancelRecentsAnimation(boolean p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void startSystemLockTaskMode(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException;
    public void bootAnimationComplete() throws android.os.RemoteException;
    public int checkPermissionWithToken(java.lang.String p0, int p1, int p2, android.os.IBinder p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException;
    public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException;
    public void notifyCleartextNetwork(int p0, byte[] p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getLockTaskModeState() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setDumpHeapDebugLimit(java.lang.String p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public void dumpHeapFinished(java.lang.String p0) throws android.os.RemoteException;
    public void updateLockTaskPackages(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void noteAlarmStart(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void noteAlarmFinish(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public int getPackageProcessState(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void updateDeviceOwner(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean startBinderTracking() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void positionTaskInStack(int p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean moveTopActivityToPinnedStack(int p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public boolean isAppStartModeDisabled(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean unlockUser(int p0, byte[] p1, byte[] p2, android.os.IProgressListener p3) throws android.os.RemoteException;
    public void killPackageDependents(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void resizeDockedStack(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void removeStack(int p0) throws android.os.RemoteException;
    public void makePackageIdle(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getMemoryTrimLevel() throws android.os.RemoteException;
    public boolean isVrModePackageEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public void notifyLockedProfile(int p0) throws android.os.RemoteException;
    public void startConfirmDeviceCredentialIntent(android.content.Intent p0, android.os.Bundle p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void sendIdleJobTrigger() throws android.os.RemoteException;
    public int sendIntentSender(android.content.IIntentSender p0, android.os.IBinder p1, int p2, android.content.Intent p3, java.lang.String p4, android.content.IIntentReceiver p5, java.lang.String p6, android.os.Bundle p7) throws android.os.RemoteException;
    public boolean isBackgroundRestricted(java.lang.String p0) throws android.os.RemoteException;
    public void setRenderThread(int p0) throws android.os.RemoteException;
    public void setHasTopUi(boolean p0) throws android.os.RemoteException;
    public int restartUserInBackground(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException;
    public void scheduleApplicationInfoChanged(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException;
    public void setPersistentVrThread(int p0) throws android.os.RemoteException;
    public void waitForNetworkStateUpdate(long p0) throws android.os.RemoteException;
    public void backgroundWhitelistUid(int p0) throws android.os.RemoteException;
    public boolean startUserInBackgroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException;
    public void startDelegateShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void stopDelegateShellPermissionIdentity() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getLifeMonitor() throws android.os.RemoteException;
    public boolean startUserInForegroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.IActivityManager {
        private static final java.lang.String DESCRIPTOR = "android.app.IActivityManager";
        static final int TRANSACTION_openContentUri = 1;
        static final int TRANSACTION_registerUidObserver = 2;
        static final int TRANSACTION_unregisterUidObserver = 3;
        static final int TRANSACTION_isUidActive = 4;
        static final int TRANSACTION_getUidProcessState = 5;
        static final int TRANSACTION_handleApplicationCrash = 6;
        static final int TRANSACTION_startActivity = 7;
        static final int TRANSACTION_unhandledBack = 8;
        static final int TRANSACTION_finishActivity = 9;
        static final int TRANSACTION_registerReceiver = 10;
        static final int TRANSACTION_unregisterReceiver = 11;
        static final int TRANSACTION_broadcastIntent = 12;
        static final int TRANSACTION_unbroadcastIntent = 13;
        static final int TRANSACTION_finishReceiver = 14;
        static final int TRANSACTION_attachApplication = 15;
        static final int TRANSACTION_getTasks = 16;
        static final int TRANSACTION_getFilteredTasks = 17;
        static final int TRANSACTION_moveTaskToFront = 18;
        static final int TRANSACTION_getTaskForActivity = 19;
        static final int TRANSACTION_getContentProvider = 20;
        static final int TRANSACTION_publishContentProviders = 21;
        static final int TRANSACTION_refContentProvider = 22;
        static final int TRANSACTION_getRunningServiceControlPanel = 23;
        static final int TRANSACTION_startService = 24;
        static final int TRANSACTION_stopService = 25;
        static final int TRANSACTION_bindService = 26;
        static final int TRANSACTION_bindIsolatedService = 27;
        static final int TRANSACTION_updateServiceGroup = 28;
        static final int TRANSACTION_unbindService = 29;
        static final int TRANSACTION_publishService = 30;
        static final int TRANSACTION_setDebugApp = 31;
        static final int TRANSACTION_setAgentApp = 32;
        static final int TRANSACTION_setAlwaysFinish = 33;
        static final int TRANSACTION_startInstrumentation = 34;
        static final int TRANSACTION_addInstrumentationResults = 35;
        static final int TRANSACTION_finishInstrumentation = 36;
        static final int TRANSACTION_getConfiguration = 37;
        static final int TRANSACTION_updateConfiguration = 38;
        static final int TRANSACTION_stopServiceToken = 39;
        static final int TRANSACTION_setProcessLimit = 40;
        static final int TRANSACTION_getProcessLimit = 41;
        static final int TRANSACTION_checkPermission = 42;
        static final int TRANSACTION_checkUriPermission = 43;
        static final int TRANSACTION_grantUriPermission = 44;
        static final int TRANSACTION_revokeUriPermission = 45;
        static final int TRANSACTION_setActivityController = 46;
        static final int TRANSACTION_showWaitingForDebugger = 47;
        static final int TRANSACTION_signalPersistentProcesses = 48;
        static final int TRANSACTION_getRecentTasks = 49;
        static final int TRANSACTION_serviceDoneExecuting = 50;
        static final int TRANSACTION_getIntentSender = 51;
        static final int TRANSACTION_cancelIntentSender = 52;
        static final int TRANSACTION_getPackageForIntentSender = 53;
        static final int TRANSACTION_registerIntentSenderCancelListener = 54;
        static final int TRANSACTION_unregisterIntentSenderCancelListener = 55;
        static final int TRANSACTION_enterSafeMode = 56;
        static final int TRANSACTION_noteWakeupAlarm = 57;
        static final int TRANSACTION_removeContentProvider = 58;
        static final int TRANSACTION_setRequestedOrientation = 59;
        static final int TRANSACTION_unbindFinished = 60;
        static final int TRANSACTION_setProcessImportant = 61;
        static final int TRANSACTION_setServiceForeground = 62;
        static final int TRANSACTION_getForegroundServiceType = 63;
        static final int TRANSACTION_moveActivityTaskToBack = 64;
        static final int TRANSACTION_getMemoryInfo = 65;
        static final int TRANSACTION_getProcessesInErrorState = 66;
        static final int TRANSACTION_clearApplicationUserData = 67;
        static final int TRANSACTION_forceStopPackage = 68;
        static final int TRANSACTION_killPids = 69;
        static final int TRANSACTION_getServices = 70;
        static final int TRANSACTION_getRunningAppProcesses = 71;
        static final int TRANSACTION_peekService = 72;
        static final int TRANSACTION_profileControl = 73;
        static final int TRANSACTION_shutdown = 74;
        static final int TRANSACTION_stopAppSwitches = 75;
        static final int TRANSACTION_resumeAppSwitches = 76;
        static final int TRANSACTION_bindBackupAgent = 77;
        static final int TRANSACTION_backupAgentCreated = 78;
        static final int TRANSACTION_unbindBackupAgent = 79;
        static final int TRANSACTION_getUidForIntentSender = 80;
        static final int TRANSACTION_handleIncomingUser = 81;
        static final int TRANSACTION_addPackageDependency = 82;
        static final int TRANSACTION_killApplication = 83;
        static final int TRANSACTION_closeSystemDialogs = 84;
        static final int TRANSACTION_getProcessMemoryInfo = 85;
        static final int TRANSACTION_killApplicationProcess = 86;
        static final int TRANSACTION_handleApplicationWtf = 87;
        static final int TRANSACTION_killBackgroundProcesses = 88;
        static final int TRANSACTION_isUserAMonkey = 89;
        static final int TRANSACTION_getRunningExternalApplications = 90;
        static final int TRANSACTION_finishHeavyWeightApp = 91;
        static final int TRANSACTION_handleApplicationStrictModeViolation = 92;
        static final int TRANSACTION_isTopActivityImmersive = 93;
        static final int TRANSACTION_crashApplication = 94;
        static final int TRANSACTION_getProviderMimeType = 95;
        static final int TRANSACTION_dumpHeap = 96;
        static final int TRANSACTION_isUserRunning = 97;
        static final int TRANSACTION_setPackageScreenCompatMode = 98;
        static final int TRANSACTION_switchUser = 99;
        static final int TRANSACTION_removeTask = 100;
        static final int TRANSACTION_registerProcessObserver = 101;
        static final int TRANSACTION_unregisterProcessObserver = 102;
        static final int TRANSACTION_isIntentSenderTargetedToPackage = 103;
        static final int TRANSACTION_updatePersistentConfiguration = 104;
        static final int TRANSACTION_getProcessPss = 105;
        static final int TRANSACTION_showBootMessage = 106;
        static final int TRANSACTION_killAllBackgroundProcesses = 107;
        static final int TRANSACTION_getContentProviderExternal = 108;
        static final int TRANSACTION_removeContentProviderExternal = 109;
        static final int TRANSACTION_removeContentProviderExternalAsUser = 110;
        static final int TRANSACTION_getMyMemoryState = 111;
        static final int TRANSACTION_killProcessesBelowForeground = 112;
        static final int TRANSACTION_getCurrentUser = 113;
        static final int TRANSACTION_getLaunchedFromUid = 114;
        static final int TRANSACTION_unstableProviderDied = 115;
        static final int TRANSACTION_isIntentSenderAnActivity = 116;
        static final int TRANSACTION_isIntentSenderAForegroundService = 117;
        static final int TRANSACTION_isIntentSenderABroadcast = 118;
        static final int TRANSACTION_startActivityAsUser = 119;
        static final int TRANSACTION_stopUser = 120;
        static final int TRANSACTION_registerUserSwitchObserver = 121;
        static final int TRANSACTION_unregisterUserSwitchObserver = 122;
        static final int TRANSACTION_getRunningUserIds = 123;
        static final int TRANSACTION_requestSystemServerHeapDump = 124;
        static final int TRANSACTION_requestBugReport = 125;
        static final int TRANSACTION_requestTelephonyBugReport = 126;
        static final int TRANSACTION_requestWifiBugReport = 127;
        static final int TRANSACTION_getIntentForIntentSender = 128;
        static final int TRANSACTION_getLaunchedFromPackage = 129;
        static final int TRANSACTION_killUid = 130;
        static final int TRANSACTION_setUserIsMonkey = 131;
        static final int TRANSACTION_hang = 132;
        static final int TRANSACTION_getAllStackInfos = 133;
        static final int TRANSACTION_moveTaskToStack = 134;
        static final int TRANSACTION_resizeStack = 135;
        static final int TRANSACTION_setFocusedStack = 136;
        static final int TRANSACTION_getFocusedStackInfo = 137;
        static final int TRANSACTION_restart = 138;
        static final int TRANSACTION_performIdleMaintenance = 139;
        static final int TRANSACTION_appNotRespondingViaProvider = 140;
        static final int TRANSACTION_getTaskBounds = 141;
        static final int TRANSACTION_setProcessMemoryTrimLevel = 142;
        static final int TRANSACTION_getTagForIntentSender = 143;
        static final int TRANSACTION_startUserInBackground = 144;
        static final int TRANSACTION_isInLockTaskMode = 145;
        static final int TRANSACTION_startRecentsActivity = 146;
        static final int TRANSACTION_cancelRecentsAnimation = 147;
        static final int TRANSACTION_startActivityFromRecents = 148;
        static final int TRANSACTION_startSystemLockTaskMode = 149;
        static final int TRANSACTION_isTopOfTask = 150;
        static final int TRANSACTION_bootAnimationComplete = 151;
        static final int TRANSACTION_checkPermissionWithToken = 152;
        static final int TRANSACTION_registerTaskStackListener = 153;
        static final int TRANSACTION_unregisterTaskStackListener = 154;
        static final int TRANSACTION_notifyCleartextNetwork = 155;
        static final int TRANSACTION_setTaskResizeable = 156;
        static final int TRANSACTION_resizeTask = 157;
        static final int TRANSACTION_getLockTaskModeState = 158;
        static final int TRANSACTION_setDumpHeapDebugLimit = 159;
        static final int TRANSACTION_dumpHeapFinished = 160;
        static final int TRANSACTION_updateLockTaskPackages = 161;
        static final int TRANSACTION_noteAlarmStart = 162;
        static final int TRANSACTION_noteAlarmFinish = 163;
        static final int TRANSACTION_getPackageProcessState = 164;
        static final int TRANSACTION_updateDeviceOwner = 165;
        static final int TRANSACTION_startBinderTracking = 166;
        static final int TRANSACTION_stopBinderTrackingAndDump = 167;
        static final int TRANSACTION_positionTaskInStack = 168;
        static final int TRANSACTION_suppressResizeConfigChanges = 169;
        static final int TRANSACTION_moveTopActivityToPinnedStack = 170;
        static final int TRANSACTION_isAppStartModeDisabled = 171;
        static final int TRANSACTION_unlockUser = 172;
        static final int TRANSACTION_killPackageDependents = 173;
        static final int TRANSACTION_resizeDockedStack = 174;
        static final int TRANSACTION_removeStack = 175;
        static final int TRANSACTION_makePackageIdle = 176;
        static final int TRANSACTION_getMemoryTrimLevel = 177;
        static final int TRANSACTION_isVrModePackageEnabled = 178;
        static final int TRANSACTION_notifyLockedProfile = 179;
        static final int TRANSACTION_startConfirmDeviceCredentialIntent = 180;
        static final int TRANSACTION_sendIdleJobTrigger = 181;
        static final int TRANSACTION_sendIntentSender = 182;
        static final int TRANSACTION_isBackgroundRestricted = 183;
        static final int TRANSACTION_setRenderThread = 184;
        static final int TRANSACTION_setHasTopUi = 185;
        static final int TRANSACTION_restartUserInBackground = 186;
        static final int TRANSACTION_cancelTaskWindowTransition = 187;
        static final int TRANSACTION_getTaskSnapshot = 188;
        static final int TRANSACTION_scheduleApplicationInfoChanged = 189;
        static final int TRANSACTION_setPersistentVrThread = 190;
        static final int TRANSACTION_waitForNetworkStateUpdate = 191;
        static final int TRANSACTION_backgroundWhitelistUid = 192;
        static final int TRANSACTION_startUserInBackgroundWithListener = 193;
        static final int TRANSACTION_startDelegateShellPermissionIdentity = 194;
        static final int TRANSACTION_stopDelegateShellPermissionIdentity = 195;
        static final int TRANSACTION_getLifeMonitor = 196;
        static final int TRANSACTION_startUserInForegroundWithListener = 197;
        public Stub() { super(); }
        public static android.app.IActivityManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IActivityManager p0) { return false; }
        public static android.app.IActivityManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IActivityManager {
            private android.os.IBinder mRemote;
            public static android.app.IActivityManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException {}
            public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void handleApplicationCrash(android.os.IBinder p0, android.app.ApplicationErrorReport.ParcelableCrashInfo p1) throws android.os.RemoteException {}
            public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9) throws android.os.RemoteException { return 0; }
            public void unhandledBack() throws android.os.RemoteException {}
            public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException { return false; }
            public android.content.Intent registerReceiver(android.app.IApplicationThread p0, java.lang.String p1, android.content.IIntentReceiver p2, android.content.IntentFilter p3, java.lang.String p4, int p5, int p6) throws android.os.RemoteException { return null; }
            public void unregisterReceiver(android.content.IIntentReceiver p0) throws android.os.RemoteException {}
            public int broadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, android.content.IIntentReceiver p3, int p4, java.lang.String p5, android.os.Bundle p6, java.lang.String[] p7, int p8, android.os.Bundle p9, boolean p10, boolean p11, int p12) throws android.os.RemoteException { return 0; }
            public void unbroadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, int p2) throws android.os.RemoteException {}
            public void finishReceiver(android.os.IBinder p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, int p5) throws android.os.RemoteException {}
            public void attachApplication(android.app.IApplicationThread p0, long p1) throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getFilteredTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return 0; }
            public android.app.ContentProviderHolder getContentProvider(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) throws android.os.RemoteException { return null; }
            public void publishContentProviders(android.app.IApplicationThread p0, java.util.List<android.app.ContentProviderHolder> p1) throws android.os.RemoteException {}
            public boolean refContentProvider(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName startService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, boolean p3, java.lang.String p4, int p5) throws android.os.RemoteException { return null; }
            public int stopService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public int bindService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, int p7) throws android.os.RemoteException { return 0; }
            public int bindIsolatedService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, java.lang.String p7, int p8) throws android.os.RemoteException { return 0; }
            public void updateServiceGroup(android.app.IServiceConnection p0, int p1, int p2) throws android.os.RemoteException {}
            public boolean unbindService(android.app.IServiceConnection p0) throws android.os.RemoteException { return false; }
            public void publishService(android.os.IBinder p0, android.content.Intent p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void setDebugApp(java.lang.String p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public void setAgentApp(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setAlwaysFinish(boolean p0) throws android.os.RemoteException {}
            public boolean startInstrumentation(android.content.ComponentName p0, java.lang.String p1, int p2, android.os.Bundle p3, android.app.IInstrumentationWatcher p4, android.app.IUiAutomationConnection p5, int p6, java.lang.String p7) throws android.os.RemoteException { return false; }
            public void addInstrumentationResults(android.app.IApplicationThread p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void finishInstrumentation(android.app.IApplicationThread p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public android.content.res.Configuration getConfiguration() throws android.os.RemoteException { return null; }
            public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException { return false; }
            public boolean stopServiceToken(android.content.ComponentName p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return false; }
            public void setProcessLimit(int p0) throws android.os.RemoteException {}
            public int getProcessLimit() throws android.os.RemoteException { return 0; }
            public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3, int p4, android.os.IBinder p5) throws android.os.RemoteException { return 0; }
            public void grantUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException {}
            public void revokeUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException {}
            public void setActivityController(android.app.IActivityController p0, boolean p1) throws android.os.RemoteException {}
            public void showWaitingForDebugger(android.app.IApplicationThread p0, boolean p1) throws android.os.RemoteException {}
            public void signalPersistentProcesses(int p0) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void serviceDoneExecuting(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public android.content.IIntentSender getIntentSender(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.String p3, int p4, android.content.Intent[] p5, java.lang.String[] p6, int p7, android.os.Bundle p8, int p9) throws android.os.RemoteException { return null; }
            public void cancelIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException {}
            public java.lang.String getPackageForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException { return null; }
            public void registerIntentSenderCancelListener(android.content.IIntentSender p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
            public void unregisterIntentSenderCancelListener(android.content.IIntentSender p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
            public void enterSafeMode() throws android.os.RemoteException {}
            public void noteWakeupAlarm(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void removeContentProvider(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void setRequestedOrientation(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void unbindFinished(android.os.IBinder p0, android.content.Intent p1, boolean p2) throws android.os.RemoteException {}
            public void setProcessImportant(android.os.IBinder p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setServiceForeground(android.content.ComponentName p0, android.os.IBinder p1, int p2, android.app.Notification p3, int p4, int p5) throws android.os.RemoteException {}
            public int getForegroundServiceType(android.content.ComponentName p0, android.os.IBinder p1) throws android.os.RemoteException { return 0; }
            public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return false; }
            public void getMemoryInfo(android.app.ActivityManager.MemoryInfo p0) throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState() throws android.os.RemoteException { return null; }
            public boolean clearApplicationUserData(java.lang.String p0, boolean p1, android.content.pm.IPackageDataObserver p2, int p3) throws android.os.RemoteException { return false; }
            public void forceStopPackage(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean killPids(int[] p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
            public java.util.List<android.app.ActivityManager.RunningServiceInfo> getServices(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws android.os.RemoteException { return null; }
            public android.os.IBinder peekService(android.content.Intent p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean profileControl(java.lang.String p0, int p1, boolean p2, android.app.ProfilerInfo p3, int p4) throws android.os.RemoteException { return false; }
            public boolean shutdown(int p0) throws android.os.RemoteException { return false; }
            public void stopAppSwitches() throws android.os.RemoteException {}
            public void resumeAppSwitches() throws android.os.RemoteException {}
            public boolean bindBackupAgent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void backupAgentCreated(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
            public void unbindBackupAgent(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException {}
            public int getUidForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException { return 0; }
            public int handleIncomingUser(int p0, int p1, int p2, boolean p3, boolean p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException { return 0; }
            public void addPackageDependency(java.lang.String p0) throws android.os.RemoteException {}
            public void killApplication(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
            public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) throws android.os.RemoteException { return null; }
            public void killApplicationProcess(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3) throws android.os.RemoteException { return false; }
            public void killBackgroundProcesses(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean isUserAMonkey() throws android.os.RemoteException { return false; }
            public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() throws android.os.RemoteException { return null; }
            public void finishHeavyWeightApp() throws android.os.RemoteException {}
            public void handleApplicationStrictModeViolation(android.os.IBinder p0, int p1, android.os.StrictMode.ViolationInfo p2) throws android.os.RemoteException {}
            public boolean isTopActivityImmersive() throws android.os.RemoteException { return false; }
            public void crashApplication(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
            public java.lang.String getProviderMimeType(android.net.Uri p0, int p1) throws android.os.RemoteException { return null; }
            public boolean dumpHeap(java.lang.String p0, int p1, boolean p2, boolean p3, boolean p4, java.lang.String p5, android.os.ParcelFileDescriptor p6, android.os.RemoteCallback p7) throws android.os.RemoteException { return false; }
            public boolean isUserRunning(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setPackageScreenCompatMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean switchUser(int p0) throws android.os.RemoteException { return false; }
            public boolean removeTask(int p0) throws android.os.RemoteException { return false; }
            public void registerProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
            public void unregisterProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
            public boolean isIntentSenderTargetedToPackage(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
            public void updatePersistentConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException {}
            public long[] getProcessPss(int[] p0) throws android.os.RemoteException { return null; }
            public void showBootMessage(java.lang.CharSequence p0, boolean p1) throws android.os.RemoteException {}
            public void killAllBackgroundProcesses() throws android.os.RemoteException {}
            public android.app.ContentProviderHolder getContentProviderExternal(java.lang.String p0, int p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public void removeContentProviderExternal(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void removeContentProviderExternalAsUser(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
            public void getMyMemoryState(android.app.ActivityManager.RunningAppProcessInfo p0) throws android.os.RemoteException {}
            public boolean killProcessesBelowForeground(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.content.pm.UserInfo getCurrentUser() throws android.os.RemoteException { return null; }
            public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean isIntentSenderAnActivity(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
            public boolean isIntentSenderAForegroundService(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
            public boolean isIntentSenderABroadcast(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
            public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return 0; }
            public int stopUser(int p0, boolean p1, android.app.IStopUserCallback p2) throws android.os.RemoteException { return 0; }
            public void registerUserSwitchObserver(android.app.IUserSwitchObserver p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterUserSwitchObserver(android.app.IUserSwitchObserver p0) throws android.os.RemoteException {}
            public int[] getRunningUserIds() throws android.os.RemoteException { return null; }
            public void requestSystemServerHeapDump() throws android.os.RemoteException {}
            public void requestBugReport(int p0) throws android.os.RemoteException {}
            public void requestTelephonyBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void requestWifiBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.content.Intent getIntentForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException { return null; }
            public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void killUid(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setUserIsMonkey(boolean p0) throws android.os.RemoteException {}
            public void hang(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfos() throws android.os.RemoteException { return null; }
            public void moveTaskToStack(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void resizeStack(int p0, android.graphics.Rect p1, boolean p2, boolean p3, boolean p4, int p5) throws android.os.RemoteException {}
            public void setFocusedStack(int p0) throws android.os.RemoteException {}
            public android.app.ActivityManager.StackInfo getFocusedStackInfo() throws android.os.RemoteException { return null; }
            public void restart() throws android.os.RemoteException {}
            public void performIdleMaintenance() throws android.os.RemoteException {}
            public void appNotRespondingViaProvider(android.os.IBinder p0) throws android.os.RemoteException {}
            public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException { return null; }
            public boolean setProcessMemoryTrimLevel(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public java.lang.String getTagForIntentSender(android.content.IIntentSender p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean startUserInBackground(int p0) throws android.os.RemoteException { return false; }
            public boolean isInLockTaskMode() throws android.os.RemoteException { return false; }
            public void startRecentsActivity(android.content.Intent p0, android.app.IAssistDataReceiver p1, android.view.IRecentsAnimationRunner p2) throws android.os.RemoteException {}
            public void cancelRecentsAnimation(boolean p0) throws android.os.RemoteException {}
            public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
            public void startSystemLockTaskMode(int p0) throws android.os.RemoteException {}
            public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void bootAnimationComplete() throws android.os.RemoteException {}
            public int checkPermissionWithToken(java.lang.String p0, int p1, int p2, android.os.IBinder p3) throws android.os.RemoteException { return 0; }
            public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
            public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
            public void notifyCleartextNetwork(int p0, byte[] p1) throws android.os.RemoteException {}
            public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException {}
            public void resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
            public int getLockTaskModeState() throws android.os.RemoteException { return 0; }
            public void setDumpHeapDebugLimit(java.lang.String p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
            public void dumpHeapFinished(java.lang.String p0) throws android.os.RemoteException {}
            public void updateLockTaskPackages(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void noteAlarmStart(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void noteAlarmFinish(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public int getPackageProcessState(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void updateDeviceOwner(java.lang.String p0) throws android.os.RemoteException {}
            public boolean startBinderTracking() throws android.os.RemoteException { return false; }
            public boolean stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return false; }
            public void positionTaskInStack(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
            public boolean moveTopActivityToPinnedStack(int p0, android.graphics.Rect p1) throws android.os.RemoteException { return false; }
            public boolean isAppStartModeDisabled(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean unlockUser(int p0, byte[] p1, byte[] p2, android.os.IProgressListener p3) throws android.os.RemoteException { return false; }
            public void killPackageDependents(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void resizeDockedStack(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException {}
            public void removeStack(int p0) throws android.os.RemoteException {}
            public void makePackageIdle(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public int getMemoryTrimLevel() throws android.os.RemoteException { return 0; }
            public boolean isVrModePackageEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void notifyLockedProfile(int p0) throws android.os.RemoteException {}
            public void startConfirmDeviceCredentialIntent(android.content.Intent p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void sendIdleJobTrigger() throws android.os.RemoteException {}
            public int sendIntentSender(android.content.IIntentSender p0, android.os.IBinder p1, int p2, android.content.Intent p3, java.lang.String p4, android.content.IIntentReceiver p5, java.lang.String p6, android.os.Bundle p7) throws android.os.RemoteException { return 0; }
            public boolean isBackgroundRestricted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setRenderThread(int p0) throws android.os.RemoteException {}
            public void setHasTopUi(boolean p0) throws android.os.RemoteException {}
            public int restartUserInBackground(int p0) throws android.os.RemoteException { return 0; }
            public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException {}
            public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public void scheduleApplicationInfoChanged(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
            public void setPersistentVrThread(int p0) throws android.os.RemoteException {}
            public void waitForNetworkStateUpdate(long p0) throws android.os.RemoteException {}
            public void backgroundWhitelistUid(int p0) throws android.os.RemoteException {}
            public boolean startUserInBackgroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
            public void startDelegateShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void stopDelegateShellPermissionIdentity() throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor getLifeMonitor() throws android.os.RemoteException { return null; }
            public boolean startUserInForegroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.app.IActivityManager {
        public Default() {}
        public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException {}
        public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void handleApplicationCrash(android.os.IBinder p0, android.app.ApplicationErrorReport.ParcelableCrashInfo p1) throws android.os.RemoteException {}
        public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9) throws android.os.RemoteException { return 0; }
        public void unhandledBack() throws android.os.RemoteException {}
        public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException { return false; }
        public android.content.Intent registerReceiver(android.app.IApplicationThread p0, java.lang.String p1, android.content.IIntentReceiver p2, android.content.IntentFilter p3, java.lang.String p4, int p5, int p6) throws android.os.RemoteException { return null; }
        public void unregisterReceiver(android.content.IIntentReceiver p0) throws android.os.RemoteException {}
        public int broadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, android.content.IIntentReceiver p3, int p4, java.lang.String p5, android.os.Bundle p6, java.lang.String[] p7, int p8, android.os.Bundle p9, boolean p10, boolean p11, int p12) throws android.os.RemoteException { return 0; }
        public void unbroadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, int p2) throws android.os.RemoteException {}
        public void finishReceiver(android.os.IBinder p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, int p5) throws android.os.RemoteException {}
        public void attachApplication(android.app.IApplicationThread p0, long p1) throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getFilteredTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return 0; }
        public android.app.ContentProviderHolder getContentProvider(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) throws android.os.RemoteException { return null; }
        public void publishContentProviders(android.app.IApplicationThread p0, java.util.List<android.app.ContentProviderHolder> p1) throws android.os.RemoteException {}
        public boolean refContentProvider(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName startService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, boolean p3, java.lang.String p4, int p5) throws android.os.RemoteException { return null; }
        public int stopService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public int bindService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, int p7) throws android.os.RemoteException { return 0; }
        public int bindIsolatedService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, java.lang.String p7, int p8) throws android.os.RemoteException { return 0; }
        public void updateServiceGroup(android.app.IServiceConnection p0, int p1, int p2) throws android.os.RemoteException {}
        public boolean unbindService(android.app.IServiceConnection p0) throws android.os.RemoteException { return false; }
        public void publishService(android.os.IBinder p0, android.content.Intent p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void setDebugApp(java.lang.String p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public void setAgentApp(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setAlwaysFinish(boolean p0) throws android.os.RemoteException {}
        public boolean startInstrumentation(android.content.ComponentName p0, java.lang.String p1, int p2, android.os.Bundle p3, android.app.IInstrumentationWatcher p4, android.app.IUiAutomationConnection p5, int p6, java.lang.String p7) throws android.os.RemoteException { return false; }
        public void addInstrumentationResults(android.app.IApplicationThread p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void finishInstrumentation(android.app.IApplicationThread p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public android.content.res.Configuration getConfiguration() throws android.os.RemoteException { return null; }
        public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException { return false; }
        public boolean stopServiceToken(android.content.ComponentName p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return false; }
        public void setProcessLimit(int p0) throws android.os.RemoteException {}
        public int getProcessLimit() throws android.os.RemoteException { return 0; }
        public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3, int p4, android.os.IBinder p5) throws android.os.RemoteException { return 0; }
        public void grantUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException {}
        public void revokeUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException {}
        public void setActivityController(android.app.IActivityController p0, boolean p1) throws android.os.RemoteException {}
        public void showWaitingForDebugger(android.app.IApplicationThread p0, boolean p1) throws android.os.RemoteException {}
        public void signalPersistentProcesses(int p0) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void serviceDoneExecuting(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public android.content.IIntentSender getIntentSender(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.String p3, int p4, android.content.Intent[] p5, java.lang.String[] p6, int p7, android.os.Bundle p8, int p9) throws android.os.RemoteException { return null; }
        public void cancelIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException {}
        public java.lang.String getPackageForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException { return null; }
        public void registerIntentSenderCancelListener(android.content.IIntentSender p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
        public void unregisterIntentSenderCancelListener(android.content.IIntentSender p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
        public void enterSafeMode() throws android.os.RemoteException {}
        public void noteWakeupAlarm(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void removeContentProvider(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void setRequestedOrientation(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void unbindFinished(android.os.IBinder p0, android.content.Intent p1, boolean p2) throws android.os.RemoteException {}
        public void setProcessImportant(android.os.IBinder p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setServiceForeground(android.content.ComponentName p0, android.os.IBinder p1, int p2, android.app.Notification p3, int p4, int p5) throws android.os.RemoteException {}
        public int getForegroundServiceType(android.content.ComponentName p0, android.os.IBinder p1) throws android.os.RemoteException { return 0; }
        public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return false; }
        public void getMemoryInfo(android.app.ActivityManager.MemoryInfo p0) throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState() throws android.os.RemoteException { return null; }
        public boolean clearApplicationUserData(java.lang.String p0, boolean p1, android.content.pm.IPackageDataObserver p2, int p3) throws android.os.RemoteException { return false; }
        public void forceStopPackage(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean killPids(int[] p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
        public java.util.List<android.app.ActivityManager.RunningServiceInfo> getServices(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws android.os.RemoteException { return null; }
        public android.os.IBinder peekService(android.content.Intent p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean profileControl(java.lang.String p0, int p1, boolean p2, android.app.ProfilerInfo p3, int p4) throws android.os.RemoteException { return false; }
        public boolean shutdown(int p0) throws android.os.RemoteException { return false; }
        public void stopAppSwitches() throws android.os.RemoteException {}
        public void resumeAppSwitches() throws android.os.RemoteException {}
        public boolean bindBackupAgent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void backupAgentCreated(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
        public void unbindBackupAgent(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException {}
        public int getUidForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException { return 0; }
        public int handleIncomingUser(int p0, int p1, int p2, boolean p3, boolean p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException { return 0; }
        public void addPackageDependency(java.lang.String p0) throws android.os.RemoteException {}
        public void killApplication(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) throws android.os.RemoteException { return null; }
        public void killApplicationProcess(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3) throws android.os.RemoteException { return false; }
        public void killBackgroundProcesses(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean isUserAMonkey() throws android.os.RemoteException { return false; }
        public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() throws android.os.RemoteException { return null; }
        public void finishHeavyWeightApp() throws android.os.RemoteException {}
        public void handleApplicationStrictModeViolation(android.os.IBinder p0, int p1, android.os.StrictMode.ViolationInfo p2) throws android.os.RemoteException {}
        public boolean isTopActivityImmersive() throws android.os.RemoteException { return false; }
        public void crashApplication(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException {}
        public java.lang.String getProviderMimeType(android.net.Uri p0, int p1) throws android.os.RemoteException { return null; }
        public boolean dumpHeap(java.lang.String p0, int p1, boolean p2, boolean p3, boolean p4, java.lang.String p5, android.os.ParcelFileDescriptor p6, android.os.RemoteCallback p7) throws android.os.RemoteException { return false; }
        public boolean isUserRunning(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setPackageScreenCompatMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean switchUser(int p0) throws android.os.RemoteException { return false; }
        public boolean removeTask(int p0) throws android.os.RemoteException { return false; }
        public void registerProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
        public void unregisterProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
        public boolean isIntentSenderTargetedToPackage(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
        public void updatePersistentConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException {}
        public long[] getProcessPss(int[] p0) throws android.os.RemoteException { return null; }
        public void showBootMessage(java.lang.CharSequence p0, boolean p1) throws android.os.RemoteException {}
        public void killAllBackgroundProcesses() throws android.os.RemoteException {}
        public android.app.ContentProviderHolder getContentProviderExternal(java.lang.String p0, int p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public void removeContentProviderExternal(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void removeContentProviderExternalAsUser(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
        public void getMyMemoryState(android.app.ActivityManager.RunningAppProcessInfo p0) throws android.os.RemoteException {}
        public boolean killProcessesBelowForeground(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.content.pm.UserInfo getCurrentUser() throws android.os.RemoteException { return null; }
        public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean isIntentSenderAnActivity(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
        public boolean isIntentSenderAForegroundService(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
        public boolean isIntentSenderABroadcast(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
        public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return 0; }
        public int stopUser(int p0, boolean p1, android.app.IStopUserCallback p2) throws android.os.RemoteException { return 0; }
        public void registerUserSwitchObserver(android.app.IUserSwitchObserver p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterUserSwitchObserver(android.app.IUserSwitchObserver p0) throws android.os.RemoteException {}
        public int[] getRunningUserIds() throws android.os.RemoteException { return null; }
        public void requestSystemServerHeapDump() throws android.os.RemoteException {}
        public void requestBugReport(int p0) throws android.os.RemoteException {}
        public void requestTelephonyBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void requestWifiBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.content.Intent getIntentForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException { return null; }
        public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void killUid(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setUserIsMonkey(boolean p0) throws android.os.RemoteException {}
        public void hang(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityManager.StackInfo> getAllStackInfos() throws android.os.RemoteException { return null; }
        public void moveTaskToStack(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void resizeStack(int p0, android.graphics.Rect p1, boolean p2, boolean p3, boolean p4, int p5) throws android.os.RemoteException {}
        public void setFocusedStack(int p0) throws android.os.RemoteException {}
        public android.app.ActivityManager.StackInfo getFocusedStackInfo() throws android.os.RemoteException { return null; }
        public void restart() throws android.os.RemoteException {}
        public void performIdleMaintenance() throws android.os.RemoteException {}
        public void appNotRespondingViaProvider(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException { return null; }
        public boolean setProcessMemoryTrimLevel(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public java.lang.String getTagForIntentSender(android.content.IIntentSender p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean startUserInBackground(int p0) throws android.os.RemoteException { return false; }
        public boolean isInLockTaskMode() throws android.os.RemoteException { return false; }
        public void startRecentsActivity(android.content.Intent p0, android.app.IAssistDataReceiver p1, android.view.IRecentsAnimationRunner p2) throws android.os.RemoteException {}
        public void cancelRecentsAnimation(boolean p0) throws android.os.RemoteException {}
        public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
        public void startSystemLockTaskMode(int p0) throws android.os.RemoteException {}
        public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void bootAnimationComplete() throws android.os.RemoteException {}
        public int checkPermissionWithToken(java.lang.String p0, int p1, int p2, android.os.IBinder p3) throws android.os.RemoteException { return 0; }
        public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
        public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException {}
        public void notifyCleartextNetwork(int p0, byte[] p1) throws android.os.RemoteException {}
        public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException {}
        public void resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
        public int getLockTaskModeState() throws android.os.RemoteException { return 0; }
        public void setDumpHeapDebugLimit(java.lang.String p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
        public void dumpHeapFinished(java.lang.String p0) throws android.os.RemoteException {}
        public void updateLockTaskPackages(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void noteAlarmStart(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void noteAlarmFinish(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public int getPackageProcessState(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void updateDeviceOwner(java.lang.String p0) throws android.os.RemoteException {}
        public boolean startBinderTracking() throws android.os.RemoteException { return false; }
        public boolean stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return false; }
        public void positionTaskInStack(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
        public boolean moveTopActivityToPinnedStack(int p0, android.graphics.Rect p1) throws android.os.RemoteException { return false; }
        public boolean isAppStartModeDisabled(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean unlockUser(int p0, byte[] p1, byte[] p2, android.os.IProgressListener p3) throws android.os.RemoteException { return false; }
        public void killPackageDependents(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void resizeDockedStack(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException {}
        public void removeStack(int p0) throws android.os.RemoteException {}
        public void makePackageIdle(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public int getMemoryTrimLevel() throws android.os.RemoteException { return 0; }
        public boolean isVrModePackageEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void notifyLockedProfile(int p0) throws android.os.RemoteException {}
        public void startConfirmDeviceCredentialIntent(android.content.Intent p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void sendIdleJobTrigger() throws android.os.RemoteException {}
        public int sendIntentSender(android.content.IIntentSender p0, android.os.IBinder p1, int p2, android.content.Intent p3, java.lang.String p4, android.content.IIntentReceiver p5, java.lang.String p6, android.os.Bundle p7) throws android.os.RemoteException { return 0; }
        public boolean isBackgroundRestricted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setRenderThread(int p0) throws android.os.RemoteException {}
        public void setHasTopUi(boolean p0) throws android.os.RemoteException {}
        public int restartUserInBackground(int p0) throws android.os.RemoteException { return 0; }
        public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException {}
        public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public void scheduleApplicationInfoChanged(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
        public void setPersistentVrThread(int p0) throws android.os.RemoteException {}
        public void waitForNetworkStateUpdate(long p0) throws android.os.RemoteException {}
        public void backgroundWhitelistUid(int p0) throws android.os.RemoteException {}
        public boolean startUserInBackgroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
        public void startDelegateShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void stopDelegateShellPermissionIdentity() throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor getLifeMonitor() throws android.os.RemoteException { return null; }
        public boolean startUserInForegroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
