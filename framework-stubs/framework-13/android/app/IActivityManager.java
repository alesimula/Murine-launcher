package android.app;

public interface IActivityManager extends android.os.IInterface {
    public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException;
    public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException;
    public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.PACKAGE_USAGE_STATS", "android.permission.INTERACT_ACROSS_USERS_FULL"}, conditional=true)
    public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void handleApplicationCrash(android.os.IBinder p0, android.app.ApplicationErrorReport.ParcelableCrashInfo p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9) throws android.os.RemoteException;
    public int startActivityWithFeature(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10) throws android.os.RemoteException;
    public void unhandledBack() throws android.os.RemoteException;
    public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException;
    public android.content.Intent registerReceiver(android.app.IApplicationThread p0, java.lang.String p1, android.content.IIntentReceiver p2, android.content.IntentFilter p3, java.lang.String p4, int p5, int p6) throws android.os.RemoteException;
    public android.content.Intent registerReceiverWithFeature(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.content.IIntentReceiver p4, android.content.IntentFilter p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException;
    public void unregisterReceiver(android.content.IIntentReceiver p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public int broadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, android.content.IIntentReceiver p3, int p4, java.lang.String p5, android.os.Bundle p6, java.lang.String[] p7, int p8, android.os.Bundle p9, boolean p10, boolean p11, int p12) throws android.os.RemoteException;
    public int broadcastIntentWithFeature(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.content.IIntentReceiver p4, int p5, java.lang.String p6, android.os.Bundle p7, java.lang.String[] p8, java.lang.String[] p9, java.lang.String[] p10, int p11, android.os.Bundle p12, boolean p13, boolean p14, int p15) throws android.os.RemoteException;
    public void unbroadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, int p2) throws android.os.RemoteException;
    public void finishReceiver(android.os.IBinder p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, int p5) throws android.os.RemoteException;
    public void attachApplication(android.app.IApplicationThread p0, long p1) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException;
    public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException;
    public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public android.app.ContentProviderHolder getContentProvider(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) throws android.os.RemoteException;
    public void publishContentProviders(android.app.IApplicationThread p0, java.util.List<android.app.ContentProviderHolder> p1) throws android.os.RemoteException;
    public boolean refContentProvider(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.content.ComponentName startService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, int p6) throws android.os.RemoteException;
    public int stopService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int bindService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, int p7) throws android.os.RemoteException;
    public int bindServiceInstance(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, java.lang.String p7, int p8) throws android.os.RemoteException;
    public void updateServiceGroup(android.app.IServiceConnection p0, int p1, int p2) throws android.os.RemoteException;
    public boolean unbindService(android.app.IServiceConnection p0) throws android.os.RemoteException;
    public void publishService(android.os.IBinder p0, android.content.Intent p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void setDebugApp(java.lang.String p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void setAgentApp(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setAlwaysFinish(boolean p0) throws android.os.RemoteException;
    public boolean startInstrumentation(android.content.ComponentName p0, java.lang.String p1, int p2, android.os.Bundle p3, android.app.IInstrumentationWatcher p4, android.app.IUiAutomationConnection p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    public void addInstrumentationResults(android.app.IApplicationThread p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void finishInstrumentation(android.app.IApplicationThread p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public android.content.res.Configuration getConfiguration() throws android.os.RemoteException;
    public boolean updateConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException;
    public boolean updateMccMncConfiguration(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean stopServiceToken(android.content.ComponentName p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public void setProcessLimit(int p0) throws android.os.RemoteException;
    public int getProcessLimit() throws android.os.RemoteException;
    public int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3, int p4, android.os.IBinder p5) throws android.os.RemoteException;
    public int[] checkUriPermissions(java.util.List<android.net.Uri> p0, int p1, int p2, int p3, int p4, android.os.IBinder p5) throws android.os.RemoteException;
    public void grantUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException;
    public void revokeUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException;
    public void setActivityController(android.app.IActivityController p0, boolean p1) throws android.os.RemoteException;
    public void showWaitingForDebugger(android.app.IApplicationThread p0, boolean p1) throws android.os.RemoteException;
    public void signalPersistentProcesses(int p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException;
    public void serviceDoneExecuting(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException;
    @java.lang.Deprecated
    public android.content.IIntentSender getIntentSender(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.String p3, int p4, android.content.Intent[] p5, java.lang.String[] p6, int p7, android.os.Bundle p8, int p9) throws android.os.RemoteException;
    public android.content.IIntentSender getIntentSenderWithFeature(int p0, java.lang.String p1, java.lang.String p2, android.os.IBinder p3, java.lang.String p4, int p5, android.content.Intent[] p6, java.lang.String[] p7, int p8, android.os.Bundle p9, int p10) throws android.os.RemoteException;
    public void cancelIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException;
    public android.app.ActivityManager.PendingIntentInfo getInfoForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException;
    public boolean registerIntentSenderCancelListenerEx(android.content.IIntentSender p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException;
    public void unregisterIntentSenderCancelListener(android.content.IIntentSender p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException;
    public void enterSafeMode() throws android.os.RemoteException;
    public void noteWakeupAlarm(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void removeContentProvider(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void setRequestedOrientation(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void unbindFinished(android.os.IBinder p0, android.content.Intent p1, boolean p2) throws android.os.RemoteException;
    public void setProcessImportant(android.os.IBinder p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException;
    public void setServiceForeground(android.content.ComponentName p0, android.os.IBinder p1, int p2, android.app.Notification p3, int p4, int p5) throws android.os.RemoteException;
    public int getForegroundServiceType(android.content.ComponentName p0, android.os.IBinder p1) throws android.os.RemoteException;
    public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void getMemoryInfo(android.app.ActivityManager.MemoryInfo p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState() throws android.os.RemoteException;
    public boolean clearApplicationUserData(java.lang.String p0, boolean p1, android.content.pm.IPackageDataObserver p2, int p3) throws android.os.RemoteException;
    public void stopAppForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean registerForegroundServiceObserver(android.app.IForegroundServiceObserver p0) throws android.os.RemoteException;
    public void forceStopPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean killPids(int[] p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningServiceInfo> getServices(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws android.os.RemoteException;
    public android.os.IBinder peekService(android.content.Intent p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean profileControl(java.lang.String p0, int p1, boolean p2, android.app.ProfilerInfo p3, int p4) throws android.os.RemoteException;
    public boolean shutdown(int p0) throws android.os.RemoteException;
    public void stopAppSwitches() throws android.os.RemoteException;
    public void resumeAppSwitches() throws android.os.RemoteException;
    public boolean bindBackupAgent(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void backupAgentCreated(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public void unbindBackupAgent(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException;
    public int handleIncomingUser(int p0, int p1, int p2, boolean p3, boolean p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException;
    public void addPackageDependency(java.lang.String p0) throws android.os.RemoteException;
    public void killApplication(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) throws android.os.RemoteException;
    public void killApplicationProcess(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3, int p4) throws android.os.RemoteException;
    public void killBackgroundProcesses(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isUserAMonkey() throws android.os.RemoteException;
    public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() throws android.os.RemoteException;
    public void finishHeavyWeightApp() throws android.os.RemoteException;
    public void handleApplicationStrictModeViolation(android.os.IBinder p0, int p1, android.os.StrictMode.ViolationInfo p2) throws android.os.RemoteException;
    public boolean isTopActivityImmersive() throws android.os.RemoteException;
    public void crashApplicationWithType(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6) throws android.os.RemoteException;
    public void crashApplicationWithTypeWithExtras(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6, android.os.Bundle p7) throws android.os.RemoteException;
    @java.lang.Deprecated
    public java.lang.String getProviderMimeType(android.net.Uri p0, int p1) throws android.os.RemoteException;
    public void getProviderMimeTypeAsync(android.net.Uri p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public boolean dumpHeap(java.lang.String p0, int p1, boolean p2, boolean p3, boolean p4, java.lang.String p5, android.os.ParcelFileDescriptor p6, android.os.RemoteCallback p7) throws android.os.RemoteException;
    public boolean isUserRunning(int p0, int p1) throws android.os.RemoteException;
    public void setPackageScreenCompatMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean switchUser(int p0) throws android.os.RemoteException;
    public java.lang.String getSwitchingFromUserMessage() throws android.os.RemoteException;
    public java.lang.String getSwitchingToUserMessage() throws android.os.RemoteException;
    public void setStopUserOnSwitch(int p0) throws android.os.RemoteException;
    public boolean removeTask(int p0) throws android.os.RemoteException;
    public void registerProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException;
    public void unregisterProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException;
    public boolean isIntentSenderTargetedToPackage(android.content.IIntentSender p0) throws android.os.RemoteException;
    public void updatePersistentConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException;
    public void updatePersistentConfigurationWithAttribution(android.content.res.Configuration p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public long[] getProcessPss(int[] p0) throws android.os.RemoteException;
    public void showBootMessage(java.lang.CharSequence p0, boolean p1) throws android.os.RemoteException;
    public void killAllBackgroundProcesses() throws android.os.RemoteException;
    public android.app.ContentProviderHolder getContentProviderExternal(java.lang.String p0, int p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void removeContentProviderExternal(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void removeContentProviderExternalAsUser(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public void getMyMemoryState(android.app.ActivityManager.RunningAppProcessInfo p0) throws android.os.RemoteException;
    public boolean killProcessesBelowForeground(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo getCurrentUser() throws android.os.RemoteException;
    public int getCurrentUserId() throws android.os.RemoteException;
    public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException;
    public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean isIntentSenderAnActivity(android.content.IIntentSender p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException;
    public int startActivityAsUserWithFeature(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException;
    public int stopUser(int p0, boolean p1, android.app.IStopUserCallback p2) throws android.os.RemoteException;
    public int stopUserWithDelayedLocking(int p0, boolean p1, android.app.IStopUserCallback p2) throws android.os.RemoteException;
    public void registerUserSwitchObserver(android.app.IUserSwitchObserver p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterUserSwitchObserver(android.app.IUserSwitchObserver p0) throws android.os.RemoteException;
    public int[] getRunningUserIds() throws android.os.RemoteException;
    public void requestSystemServerHeapDump() throws android.os.RemoteException;
    public void requestBugReport(int p0) throws android.os.RemoteException;
    public void requestBugReportWithDescription(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void requestTelephonyBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void requestWifiBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void requestInteractiveBugReportWithDescription(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void requestInteractiveBugReport() throws android.os.RemoteException;
    public void requestFullBugReport() throws android.os.RemoteException;
    public void requestRemoteBugReport(long p0) throws android.os.RemoteException;
    public boolean launchBugReportHandlerApp() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getBugreportWhitelistedPackages() throws android.os.RemoteException;
    public android.content.Intent getIntentForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException;
    public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException;
    public void killUid(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setUserIsMonkey(boolean p0) throws android.os.RemoteException;
    public void hang(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityTaskManager.RootTaskInfo> getAllRootTaskInfos() throws android.os.RemoteException;
    public void moveTaskToRootTask(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setFocusedRootTask(int p0) throws android.os.RemoteException;
    public android.app.ActivityTaskManager.RootTaskInfo getFocusedRootTaskInfo() throws android.os.RemoteException;
    public void restart() throws android.os.RemoteException;
    public void performIdleMaintenance() throws android.os.RemoteException;
    public void appNotRespondingViaProvider(android.os.IBinder p0) throws android.os.RemoteException;
    public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException;
    public boolean setProcessMemoryTrimLevel(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public java.lang.String getTagForIntentSender(android.content.IIntentSender p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean startUserInBackground(int p0) throws android.os.RemoteException;
    public boolean isInLockTaskMode() throws android.os.RemoteException;
    public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void startSystemLockTaskMode(int p0) throws android.os.RemoteException;
    public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException;
    public void bootAnimationComplete() throws android.os.RemoteException;
    public void registerTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException;
    public void unregisterTaskStackListener(android.app.ITaskStackListener p0) throws android.os.RemoteException;
    public void notifyCleartextNetwork(int p0, byte[] p1) throws android.os.RemoteException;
    public void setTaskResizeable(int p0, int p1) throws android.os.RemoteException;
    public void resizeTask(int p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    public int getLockTaskModeState() throws android.os.RemoteException;
    public void setDumpHeapDebugLimit(java.lang.String p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public void dumpHeapFinished(java.lang.String p0) throws android.os.RemoteException;
    public void updateLockTaskPackages(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void noteAlarmStart(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void noteAlarmFinish(android.content.IIntentSender p0, android.os.WorkSource p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public int getPackageProcessState(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean startBinderTracking() throws android.os.RemoteException;
    public boolean stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void enableBinderTracing() throws android.os.RemoteException;
    public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException;
    public boolean unlockUser(int p0, byte[] p1, byte[] p2, android.os.IProgressListener p3) throws android.os.RemoteException;
    public void killPackageDependents(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void makePackageIdle(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getMemoryTrimLevel() throws android.os.RemoteException;
    public boolean isVrModePackageEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public void notifyLockedProfile(int p0) throws android.os.RemoteException;
    public void startConfirmDeviceCredentialIntent(android.content.Intent p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void sendIdleJobTrigger() throws android.os.RemoteException;
    public int sendIntentSender(android.content.IIntentSender p0, android.os.IBinder p1, int p2, android.content.Intent p3, java.lang.String p4, android.content.IIntentReceiver p5, java.lang.String p6, android.os.Bundle p7) throws android.os.RemoteException;
    public boolean isBackgroundRestricted(java.lang.String p0) throws android.os.RemoteException;
    public void setRenderThread(int p0) throws android.os.RemoteException;
    public void setHasTopUi(boolean p0) throws android.os.RemoteException;
    public int restartUserInBackground(int p0) throws android.os.RemoteException;
    public void cancelTaskWindowTransition(int p0) throws android.os.RemoteException;
    public void scheduleApplicationInfoChanged(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException;
    public void setPersistentVrThread(int p0) throws android.os.RemoteException;
    public void waitForNetworkStateUpdate(long p0) throws android.os.RemoteException;
    public void backgroundAllowlistUid(int p0) throws android.os.RemoteException;
    public boolean startUserInBackgroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException;
    public void startDelegateShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void stopDelegateShellPermissionIdentity() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getDelegatedShellPermissions() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getLifeMonitor() throws android.os.RemoteException;
    public boolean startUserInForegroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException;
    public void appNotResponding(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.app.ApplicationExitInfo> getHistoricalProcessExitReasons(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void killProcessesWhenImperceptible(int[] p0, java.lang.String p1) throws android.os.RemoteException;
    public void setActivityLocusContext(android.content.ComponentName p0, android.content.LocusId p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void setProcessStateSummary(byte[] p0) throws android.os.RemoteException;
    public boolean isAppFreezerSupported() throws android.os.RemoteException;
    public boolean isAppFreezerEnabled() throws android.os.RemoteException;
    public void killUidForPermissionChange(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void resetAppErrors() throws android.os.RemoteException;
    public boolean enableAppFreezer(boolean p0) throws android.os.RemoteException;
    public boolean enableFgsNotificationRateLimit(boolean p0) throws android.os.RemoteException;
    public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public boolean startProfile(int p0) throws android.os.RemoteException;
    public boolean stopProfile(int p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryIntentComponentsForIntentSender(android.content.IIntentSender p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.PACKAGE_USAGE_STATS", "android.permission.INTERACT_ACROSS_USERS_FULL"}, conditional=true)
    public int getUidProcessCapabilities(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void waitForBroadcastIdle() throws android.os.RemoteException;
    public int getBackgroundRestrictionExemptionReason(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.IActivityManager {
        public Default() {}
        public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException {}
        public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public void handleApplicationCrash(android.os.IBinder p0, android.app.ApplicationErrorReport.ParcelableCrashInfo p1) throws android.os.RemoteException {}
        public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9) throws android.os.RemoteException { return 0; }
        public int startActivityWithFeature(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10) throws android.os.RemoteException { return 0; }
        public void unhandledBack() throws android.os.RemoteException {}
        public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException { return false; }
        public android.content.Intent registerReceiver(android.app.IApplicationThread p0, java.lang.String p1, android.content.IIntentReceiver p2, android.content.IntentFilter p3, java.lang.String p4, int p5, int p6) throws android.os.RemoteException { return null; }
        public android.content.Intent registerReceiverWithFeature(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.content.IIntentReceiver p4, android.content.IntentFilter p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException { return null; }
        public void unregisterReceiver(android.content.IIntentReceiver p0) throws android.os.RemoteException {}
        public int broadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, android.content.IIntentReceiver p3, int p4, java.lang.String p5, android.os.Bundle p6, java.lang.String[] p7, int p8, android.os.Bundle p9, boolean p10, boolean p11, int p12) throws android.os.RemoteException { return 0; }
        public int broadcastIntentWithFeature(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.content.IIntentReceiver p4, int p5, java.lang.String p6, android.os.Bundle p7, java.lang.String[] p8, java.lang.String[] p9, java.lang.String[] p10, int p11, android.os.Bundle p12, boolean p13, boolean p14, int p15) throws android.os.RemoteException { return 0; }
        public void unbroadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, int p2) throws android.os.RemoteException {}
        public void finishReceiver(android.os.IBinder p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, int p5) throws android.os.RemoteException {}
        public void attachApplication(android.app.IApplicationThread p0, long p1) throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException { return null; }
        public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return 0; }
        public android.app.ContentProviderHolder getContentProvider(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) throws android.os.RemoteException { return null; }
        public void publishContentProviders(android.app.IApplicationThread p0, java.util.List<android.app.ContentProviderHolder> p1) throws android.os.RemoteException {}
        public boolean refContentProvider(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName startService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, int p6) throws android.os.RemoteException { return null; }
        public int stopService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public int bindService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, int p7) throws android.os.RemoteException { return 0; }
        public int bindServiceInstance(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, java.lang.String p7, int p8) throws android.os.RemoteException { return 0; }
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
        public boolean updateMccMncConfiguration(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean stopServiceToken(android.content.ComponentName p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return false; }
        public void setProcessLimit(int p0) throws android.os.RemoteException {}
        public int getProcessLimit() throws android.os.RemoteException { return 0; }
        public int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3, int p4, android.os.IBinder p5) throws android.os.RemoteException { return 0; }
        public int[] checkUriPermissions(java.util.List<android.net.Uri> p0, int p1, int p2, int p3, int p4, android.os.IBinder p5) throws android.os.RemoteException { return null; }
        public void grantUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException {}
        public void revokeUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException {}
        public void setActivityController(android.app.IActivityController p0, boolean p1) throws android.os.RemoteException {}
        public void showWaitingForDebugger(android.app.IApplicationThread p0, boolean p1) throws android.os.RemoteException {}
        public void signalPersistentProcesses(int p0) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void serviceDoneExecuting(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public android.content.IIntentSender getIntentSender(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.String p3, int p4, android.content.Intent[] p5, java.lang.String[] p6, int p7, android.os.Bundle p8, int p9) throws android.os.RemoteException { return null; }
        public android.content.IIntentSender getIntentSenderWithFeature(int p0, java.lang.String p1, java.lang.String p2, android.os.IBinder p3, java.lang.String p4, int p5, android.content.Intent[] p6, java.lang.String[] p7, int p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return null; }
        public void cancelIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException {}
        public android.app.ActivityManager.PendingIntentInfo getInfoForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException { return null; }
        public boolean registerIntentSenderCancelListenerEx(android.content.IIntentSender p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException { return false; }
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
        public void stopAppForUser(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean registerForegroundServiceObserver(android.app.IForegroundServiceObserver p0) throws android.os.RemoteException { return false; }
        public void forceStopPackage(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean killPids(int[] p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
        public java.util.List<android.app.ActivityManager.RunningServiceInfo> getServices(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws android.os.RemoteException { return null; }
        public android.os.IBinder peekService(android.content.Intent p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean profileControl(java.lang.String p0, int p1, boolean p2, android.app.ProfilerInfo p3, int p4) throws android.os.RemoteException { return false; }
        public boolean shutdown(int p0) throws android.os.RemoteException { return false; }
        public void stopAppSwitches() throws android.os.RemoteException {}
        public void resumeAppSwitches() throws android.os.RemoteException {}
        public boolean bindBackupAgent(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public void backupAgentCreated(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
        public void unbindBackupAgent(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException {}
        public int handleIncomingUser(int p0, int p1, int p2, boolean p3, boolean p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException { return 0; }
        public void addPackageDependency(java.lang.String p0) throws android.os.RemoteException {}
        public void killApplication(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) throws android.os.RemoteException { return null; }
        public void killApplicationProcess(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3, int p4) throws android.os.RemoteException { return false; }
        public void killBackgroundProcesses(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean isUserAMonkey() throws android.os.RemoteException { return false; }
        public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() throws android.os.RemoteException { return null; }
        public void finishHeavyWeightApp() throws android.os.RemoteException {}
        public void handleApplicationStrictModeViolation(android.os.IBinder p0, int p1, android.os.StrictMode.ViolationInfo p2) throws android.os.RemoteException {}
        public boolean isTopActivityImmersive() throws android.os.RemoteException { return false; }
        public void crashApplicationWithType(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6) throws android.os.RemoteException {}
        public void crashApplicationWithTypeWithExtras(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6, android.os.Bundle p7) throws android.os.RemoteException {}
        public java.lang.String getProviderMimeType(android.net.Uri p0, int p1) throws android.os.RemoteException { return null; }
        public void getProviderMimeTypeAsync(android.net.Uri p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public boolean dumpHeap(java.lang.String p0, int p1, boolean p2, boolean p3, boolean p4, java.lang.String p5, android.os.ParcelFileDescriptor p6, android.os.RemoteCallback p7) throws android.os.RemoteException { return false; }
        public boolean isUserRunning(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setPackageScreenCompatMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean switchUser(int p0) throws android.os.RemoteException { return false; }
        public java.lang.String getSwitchingFromUserMessage() throws android.os.RemoteException { return null; }
        public java.lang.String getSwitchingToUserMessage() throws android.os.RemoteException { return null; }
        public void setStopUserOnSwitch(int p0) throws android.os.RemoteException {}
        public boolean removeTask(int p0) throws android.os.RemoteException { return false; }
        public void registerProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
        public void unregisterProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
        public boolean isIntentSenderTargetedToPackage(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
        public void updatePersistentConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException {}
        public void updatePersistentConfigurationWithAttribution(android.content.res.Configuration p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public long[] getProcessPss(int[] p0) throws android.os.RemoteException { return null; }
        public void showBootMessage(java.lang.CharSequence p0, boolean p1) throws android.os.RemoteException {}
        public void killAllBackgroundProcesses() throws android.os.RemoteException {}
        public android.app.ContentProviderHolder getContentProviderExternal(java.lang.String p0, int p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public void removeContentProviderExternal(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void removeContentProviderExternalAsUser(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
        public void getMyMemoryState(android.app.ActivityManager.RunningAppProcessInfo p0) throws android.os.RemoteException {}
        public boolean killProcessesBelowForeground(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.content.pm.UserInfo getCurrentUser() throws android.os.RemoteException { return null; }
        public int getCurrentUserId() throws android.os.RemoteException { return 0; }
        public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
        public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean isIntentSenderAnActivity(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
        public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return 0; }
        public int startActivityAsUserWithFeature(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException { return 0; }
        public int stopUser(int p0, boolean p1, android.app.IStopUserCallback p2) throws android.os.RemoteException { return 0; }
        public int stopUserWithDelayedLocking(int p0, boolean p1, android.app.IStopUserCallback p2) throws android.os.RemoteException { return 0; }
        public void registerUserSwitchObserver(android.app.IUserSwitchObserver p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterUserSwitchObserver(android.app.IUserSwitchObserver p0) throws android.os.RemoteException {}
        public int[] getRunningUserIds() throws android.os.RemoteException { return null; }
        public void requestSystemServerHeapDump() throws android.os.RemoteException {}
        public void requestBugReport(int p0) throws android.os.RemoteException {}
        public void requestBugReportWithDescription(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void requestTelephonyBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void requestWifiBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void requestInteractiveBugReportWithDescription(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void requestInteractiveBugReport() throws android.os.RemoteException {}
        public void requestFullBugReport() throws android.os.RemoteException {}
        public void requestRemoteBugReport(long p0) throws android.os.RemoteException {}
        public boolean launchBugReportHandlerApp() throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getBugreportWhitelistedPackages() throws android.os.RemoteException { return null; }
        public android.content.Intent getIntentForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException { return null; }
        public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void killUid(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setUserIsMonkey(boolean p0) throws android.os.RemoteException {}
        public void hang(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityTaskManager.RootTaskInfo> getAllRootTaskInfos() throws android.os.RemoteException { return null; }
        public void moveTaskToRootTask(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setFocusedRootTask(int p0) throws android.os.RemoteException {}
        public android.app.ActivityTaskManager.RootTaskInfo getFocusedRootTaskInfo() throws android.os.RemoteException { return null; }
        public void restart() throws android.os.RemoteException {}
        public void performIdleMaintenance() throws android.os.RemoteException {}
        public void appNotRespondingViaProvider(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException { return null; }
        public boolean setProcessMemoryTrimLevel(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public java.lang.String getTagForIntentSender(android.content.IIntentSender p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean startUserInBackground(int p0) throws android.os.RemoteException { return false; }
        public boolean isInLockTaskMode() throws android.os.RemoteException { return false; }
        public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
        public void startSystemLockTaskMode(int p0) throws android.os.RemoteException {}
        public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void bootAnimationComplete() throws android.os.RemoteException {}
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
        public boolean startBinderTracking() throws android.os.RemoteException { return false; }
        public boolean stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return false; }
        public void enableBinderTracing() throws android.os.RemoteException {}
        public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
        public boolean unlockUser(int p0, byte[] p1, byte[] p2, android.os.IProgressListener p3) throws android.os.RemoteException { return false; }
        public void killPackageDependents(java.lang.String p0, int p1) throws android.os.RemoteException {}
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
        public void scheduleApplicationInfoChanged(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
        public void setPersistentVrThread(int p0) throws android.os.RemoteException {}
        public void waitForNetworkStateUpdate(long p0) throws android.os.RemoteException {}
        public void backgroundAllowlistUid(int p0) throws android.os.RemoteException {}
        public boolean startUserInBackgroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
        public void startDelegateShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void stopDelegateShellPermissionIdentity() throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getDelegatedShellPermissions() throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor getLifeMonitor() throws android.os.RemoteException { return null; }
        public boolean startUserInForegroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
        public void appNotResponding(java.lang.String p0) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice<android.app.ApplicationExitInfo> getHistoricalProcessExitReasons(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public void killProcessesWhenImperceptible(int[] p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setActivityLocusContext(android.content.ComponentName p0, android.content.LocusId p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void setProcessStateSummary(byte[] p0) throws android.os.RemoteException {}
        public boolean isAppFreezerSupported() throws android.os.RemoteException { return false; }
        public boolean isAppFreezerEnabled() throws android.os.RemoteException { return false; }
        public void killUidForPermissionChange(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void resetAppErrors() throws android.os.RemoteException {}
        public boolean enableAppFreezer(boolean p0) throws android.os.RemoteException { return false; }
        public boolean enableFgsNotificationRateLimit(boolean p0) throws android.os.RemoteException { return false; }
        public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public boolean startProfile(int p0) throws android.os.RemoteException { return false; }
        public boolean stopProfile(int p0) throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice queryIntentComponentsForIntentSender(android.content.IIntentSender p0, int p1) throws android.os.RemoteException { return null; }
        public int getUidProcessCapabilities(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void waitForBroadcastIdle() throws android.os.RemoteException {}
        public int getBackgroundRestrictionExemptionReason(int p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IActivityManager {
        public static final java.lang.String DESCRIPTOR = "android.app.IActivityManager";
        static final int TRANSACTION_openContentUri = 1;
        static final int TRANSACTION_registerUidObserver = 2;
        static final int TRANSACTION_unregisterUidObserver = 3;
        static final int TRANSACTION_isUidActive = 4;
        static final int TRANSACTION_getUidProcessState = 5;
        static final int TRANSACTION_checkPermission = 6;
        static final int TRANSACTION_handleApplicationCrash = 7;
        static final int TRANSACTION_startActivity = 8;
        static final int TRANSACTION_startActivityWithFeature = 9;
        static final int TRANSACTION_unhandledBack = 10;
        static final int TRANSACTION_finishActivity = 11;
        static final int TRANSACTION_registerReceiver = 12;
        static final int TRANSACTION_registerReceiverWithFeature = 13;
        static final int TRANSACTION_unregisterReceiver = 14;
        static final int TRANSACTION_broadcastIntent = 15;
        static final int TRANSACTION_broadcastIntentWithFeature = 16;
        static final int TRANSACTION_unbroadcastIntent = 17;
        static final int TRANSACTION_finishReceiver = 18;
        static final int TRANSACTION_attachApplication = 19;
        static final int TRANSACTION_getTasks = 20;
        static final int TRANSACTION_moveTaskToFront = 21;
        static final int TRANSACTION_getTaskForActivity = 22;
        static final int TRANSACTION_getContentProvider = 23;
        static final int TRANSACTION_publishContentProviders = 24;
        static final int TRANSACTION_refContentProvider = 25;
        static final int TRANSACTION_getRunningServiceControlPanel = 26;
        static final int TRANSACTION_startService = 27;
        static final int TRANSACTION_stopService = 28;
        static final int TRANSACTION_bindService = 29;
        static final int TRANSACTION_bindServiceInstance = 30;
        static final int TRANSACTION_updateServiceGroup = 31;
        static final int TRANSACTION_unbindService = 32;
        static final int TRANSACTION_publishService = 33;
        static final int TRANSACTION_setDebugApp = 34;
        static final int TRANSACTION_setAgentApp = 35;
        static final int TRANSACTION_setAlwaysFinish = 36;
        static final int TRANSACTION_startInstrumentation = 37;
        static final int TRANSACTION_addInstrumentationResults = 38;
        static final int TRANSACTION_finishInstrumentation = 39;
        static final int TRANSACTION_getConfiguration = 40;
        static final int TRANSACTION_updateConfiguration = 41;
        static final int TRANSACTION_updateMccMncConfiguration = 42;
        static final int TRANSACTION_stopServiceToken = 43;
        static final int TRANSACTION_setProcessLimit = 44;
        static final int TRANSACTION_getProcessLimit = 45;
        static final int TRANSACTION_checkUriPermission = 46;
        static final int TRANSACTION_checkUriPermissions = 47;
        static final int TRANSACTION_grantUriPermission = 48;
        static final int TRANSACTION_revokeUriPermission = 49;
        static final int TRANSACTION_setActivityController = 50;
        static final int TRANSACTION_showWaitingForDebugger = 51;
        static final int TRANSACTION_signalPersistentProcesses = 52;
        static final int TRANSACTION_getRecentTasks = 53;
        static final int TRANSACTION_serviceDoneExecuting = 54;
        static final int TRANSACTION_getIntentSender = 55;
        static final int TRANSACTION_getIntentSenderWithFeature = 56;
        static final int TRANSACTION_cancelIntentSender = 57;
        static final int TRANSACTION_getInfoForIntentSender = 58;
        static final int TRANSACTION_registerIntentSenderCancelListenerEx = 59;
        static final int TRANSACTION_unregisterIntentSenderCancelListener = 60;
        static final int TRANSACTION_enterSafeMode = 61;
        static final int TRANSACTION_noteWakeupAlarm = 62;
        static final int TRANSACTION_removeContentProvider = 63;
        static final int TRANSACTION_setRequestedOrientation = 64;
        static final int TRANSACTION_unbindFinished = 65;
        static final int TRANSACTION_setProcessImportant = 66;
        static final int TRANSACTION_setServiceForeground = 67;
        static final int TRANSACTION_getForegroundServiceType = 68;
        static final int TRANSACTION_moveActivityTaskToBack = 69;
        static final int TRANSACTION_getMemoryInfo = 70;
        static final int TRANSACTION_getProcessesInErrorState = 71;
        static final int TRANSACTION_clearApplicationUserData = 72;
        static final int TRANSACTION_stopAppForUser = 73;
        static final int TRANSACTION_registerForegroundServiceObserver = 74;
        static final int TRANSACTION_forceStopPackage = 75;
        static final int TRANSACTION_killPids = 76;
        static final int TRANSACTION_getServices = 77;
        static final int TRANSACTION_getRunningAppProcesses = 78;
        static final int TRANSACTION_peekService = 79;
        static final int TRANSACTION_profileControl = 80;
        static final int TRANSACTION_shutdown = 81;
        static final int TRANSACTION_stopAppSwitches = 82;
        static final int TRANSACTION_resumeAppSwitches = 83;
        static final int TRANSACTION_bindBackupAgent = 84;
        static final int TRANSACTION_backupAgentCreated = 85;
        static final int TRANSACTION_unbindBackupAgent = 86;
        static final int TRANSACTION_handleIncomingUser = 87;
        static final int TRANSACTION_addPackageDependency = 88;
        static final int TRANSACTION_killApplication = 89;
        static final int TRANSACTION_closeSystemDialogs = 90;
        static final int TRANSACTION_getProcessMemoryInfo = 91;
        static final int TRANSACTION_killApplicationProcess = 92;
        static final int TRANSACTION_handleApplicationWtf = 93;
        static final int TRANSACTION_killBackgroundProcesses = 94;
        static final int TRANSACTION_isUserAMonkey = 95;
        static final int TRANSACTION_getRunningExternalApplications = 96;
        static final int TRANSACTION_finishHeavyWeightApp = 97;
        static final int TRANSACTION_handleApplicationStrictModeViolation = 98;
        static final int TRANSACTION_isTopActivityImmersive = 99;
        static final int TRANSACTION_crashApplicationWithType = 100;
        static final int TRANSACTION_crashApplicationWithTypeWithExtras = 101;
        static final int TRANSACTION_getProviderMimeType = 102;
        static final int TRANSACTION_getProviderMimeTypeAsync = 103;
        static final int TRANSACTION_dumpHeap = 104;
        static final int TRANSACTION_isUserRunning = 105;
        static final int TRANSACTION_setPackageScreenCompatMode = 106;
        static final int TRANSACTION_switchUser = 107;
        static final int TRANSACTION_getSwitchingFromUserMessage = 108;
        static final int TRANSACTION_getSwitchingToUserMessage = 109;
        static final int TRANSACTION_setStopUserOnSwitch = 110;
        static final int TRANSACTION_removeTask = 111;
        static final int TRANSACTION_registerProcessObserver = 112;
        static final int TRANSACTION_unregisterProcessObserver = 113;
        static final int TRANSACTION_isIntentSenderTargetedToPackage = 114;
        static final int TRANSACTION_updatePersistentConfiguration = 115;
        static final int TRANSACTION_updatePersistentConfigurationWithAttribution = 116;
        static final int TRANSACTION_getProcessPss = 117;
        static final int TRANSACTION_showBootMessage = 118;
        static final int TRANSACTION_killAllBackgroundProcesses = 119;
        static final int TRANSACTION_getContentProviderExternal = 120;
        static final int TRANSACTION_removeContentProviderExternal = 121;
        static final int TRANSACTION_removeContentProviderExternalAsUser = 122;
        static final int TRANSACTION_getMyMemoryState = 123;
        static final int TRANSACTION_killProcessesBelowForeground = 124;
        static final int TRANSACTION_getCurrentUser = 125;
        static final int TRANSACTION_getCurrentUserId = 126;
        static final int TRANSACTION_getLaunchedFromUid = 127;
        static final int TRANSACTION_unstableProviderDied = 128;
        static final int TRANSACTION_isIntentSenderAnActivity = 129;
        static final int TRANSACTION_startActivityAsUser = 130;
        static final int TRANSACTION_startActivityAsUserWithFeature = 131;
        static final int TRANSACTION_stopUser = 132;
        static final int TRANSACTION_stopUserWithDelayedLocking = 133;
        static final int TRANSACTION_registerUserSwitchObserver = 134;
        static final int TRANSACTION_unregisterUserSwitchObserver = 135;
        static final int TRANSACTION_getRunningUserIds = 136;
        static final int TRANSACTION_requestSystemServerHeapDump = 137;
        static final int TRANSACTION_requestBugReport = 138;
        static final int TRANSACTION_requestBugReportWithDescription = 139;
        static final int TRANSACTION_requestTelephonyBugReport = 140;
        static final int TRANSACTION_requestWifiBugReport = 141;
        static final int TRANSACTION_requestInteractiveBugReportWithDescription = 142;
        static final int TRANSACTION_requestInteractiveBugReport = 143;
        static final int TRANSACTION_requestFullBugReport = 144;
        static final int TRANSACTION_requestRemoteBugReport = 145;
        static final int TRANSACTION_launchBugReportHandlerApp = 146;
        static final int TRANSACTION_getBugreportWhitelistedPackages = 147;
        static final int TRANSACTION_getIntentForIntentSender = 148;
        static final int TRANSACTION_getLaunchedFromPackage = 149;
        static final int TRANSACTION_killUid = 150;
        static final int TRANSACTION_setUserIsMonkey = 151;
        static final int TRANSACTION_hang = 152;
        static final int TRANSACTION_getAllRootTaskInfos = 153;
        static final int TRANSACTION_moveTaskToRootTask = 154;
        static final int TRANSACTION_setFocusedRootTask = 155;
        static final int TRANSACTION_getFocusedRootTaskInfo = 156;
        static final int TRANSACTION_restart = 157;
        static final int TRANSACTION_performIdleMaintenance = 158;
        static final int TRANSACTION_appNotRespondingViaProvider = 159;
        static final int TRANSACTION_getTaskBounds = 160;
        static final int TRANSACTION_setProcessMemoryTrimLevel = 161;
        static final int TRANSACTION_getTagForIntentSender = 162;
        static final int TRANSACTION_startUserInBackground = 163;
        static final int TRANSACTION_isInLockTaskMode = 164;
        static final int TRANSACTION_startActivityFromRecents = 165;
        static final int TRANSACTION_startSystemLockTaskMode = 166;
        static final int TRANSACTION_isTopOfTask = 167;
        static final int TRANSACTION_bootAnimationComplete = 168;
        static final int TRANSACTION_registerTaskStackListener = 169;
        static final int TRANSACTION_unregisterTaskStackListener = 170;
        static final int TRANSACTION_notifyCleartextNetwork = 171;
        static final int TRANSACTION_setTaskResizeable = 172;
        static final int TRANSACTION_resizeTask = 173;
        static final int TRANSACTION_getLockTaskModeState = 174;
        static final int TRANSACTION_setDumpHeapDebugLimit = 175;
        static final int TRANSACTION_dumpHeapFinished = 176;
        static final int TRANSACTION_updateLockTaskPackages = 177;
        static final int TRANSACTION_noteAlarmStart = 178;
        static final int TRANSACTION_noteAlarmFinish = 179;
        static final int TRANSACTION_getPackageProcessState = 180;
        static final int TRANSACTION_startBinderTracking = 181;
        static final int TRANSACTION_stopBinderTrackingAndDump = 182;
        static final int TRANSACTION_enableBinderTracing = 183;
        static final int TRANSACTION_suppressResizeConfigChanges = 184;
        static final int TRANSACTION_unlockUser = 185;
        static final int TRANSACTION_killPackageDependents = 186;
        static final int TRANSACTION_makePackageIdle = 187;
        static final int TRANSACTION_getMemoryTrimLevel = 188;
        static final int TRANSACTION_isVrModePackageEnabled = 189;
        static final int TRANSACTION_notifyLockedProfile = 190;
        static final int TRANSACTION_startConfirmDeviceCredentialIntent = 191;
        static final int TRANSACTION_sendIdleJobTrigger = 192;
        static final int TRANSACTION_sendIntentSender = 193;
        static final int TRANSACTION_isBackgroundRestricted = 194;
        static final int TRANSACTION_setRenderThread = 195;
        static final int TRANSACTION_setHasTopUi = 196;
        static final int TRANSACTION_restartUserInBackground = 197;
        static final int TRANSACTION_cancelTaskWindowTransition = 198;
        static final int TRANSACTION_scheduleApplicationInfoChanged = 199;
        static final int TRANSACTION_setPersistentVrThread = 200;
        static final int TRANSACTION_waitForNetworkStateUpdate = 201;
        static final int TRANSACTION_backgroundAllowlistUid = 202;
        static final int TRANSACTION_startUserInBackgroundWithListener = 203;
        static final int TRANSACTION_startDelegateShellPermissionIdentity = 204;
        static final int TRANSACTION_stopDelegateShellPermissionIdentity = 205;
        static final int TRANSACTION_getDelegatedShellPermissions = 206;
        static final int TRANSACTION_getLifeMonitor = 207;
        static final int TRANSACTION_startUserInForegroundWithListener = 208;
        static final int TRANSACTION_appNotResponding = 209;
        static final int TRANSACTION_getHistoricalProcessExitReasons = 210;
        static final int TRANSACTION_killProcessesWhenImperceptible = 211;
        static final int TRANSACTION_setActivityLocusContext = 212;
        static final int TRANSACTION_setProcessStateSummary = 213;
        static final int TRANSACTION_isAppFreezerSupported = 214;
        static final int TRANSACTION_isAppFreezerEnabled = 215;
        static final int TRANSACTION_killUidForPermissionChange = 216;
        static final int TRANSACTION_resetAppErrors = 217;
        static final int TRANSACTION_enableAppFreezer = 218;
        static final int TRANSACTION_enableFgsNotificationRateLimit = 219;
        static final int TRANSACTION_holdLock = 220;
        static final int TRANSACTION_startProfile = 221;
        static final int TRANSACTION_stopProfile = 222;
        static final int TRANSACTION_queryIntentComponentsForIntentSender = 223;
        static final int TRANSACTION_getUidProcessCapabilities = 224;
        static final int TRANSACTION_waitForBroadcastIdle = 225;
        static final int TRANSACTION_getBackgroundRestrictionExemptionReason = 226;
        public Stub() { super(); }
        public static android.app.IActivityManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IActivityManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException {}
            public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public void handleApplicationCrash(android.os.IBinder p0, android.app.ApplicationErrorReport.ParcelableCrashInfo p1) throws android.os.RemoteException {}
            public int startActivity(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9) throws android.os.RemoteException { return 0; }
            public int startActivityWithFeature(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10) throws android.os.RemoteException { return 0; }
            public void unhandledBack() throws android.os.RemoteException {}
            public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) throws android.os.RemoteException { return false; }
            public android.content.Intent registerReceiver(android.app.IApplicationThread p0, java.lang.String p1, android.content.IIntentReceiver p2, android.content.IntentFilter p3, java.lang.String p4, int p5, int p6) throws android.os.RemoteException { return null; }
            public android.content.Intent registerReceiverWithFeature(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.content.IIntentReceiver p4, android.content.IntentFilter p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException { return null; }
            public void unregisterReceiver(android.content.IIntentReceiver p0) throws android.os.RemoteException {}
            public int broadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, android.content.IIntentReceiver p3, int p4, java.lang.String p5, android.os.Bundle p6, java.lang.String[] p7, int p8, android.os.Bundle p9, boolean p10, boolean p11, int p12) throws android.os.RemoteException { return 0; }
            public int broadcastIntentWithFeature(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.content.IIntentReceiver p4, int p5, java.lang.String p6, android.os.Bundle p7, java.lang.String[] p8, java.lang.String[] p9, java.lang.String[] p10, int p11, android.os.Bundle p12, boolean p13, boolean p14, int p15) throws android.os.RemoteException { return 0; }
            public void unbroadcastIntent(android.app.IApplicationThread p0, android.content.Intent p1, int p2) throws android.os.RemoteException {}
            public void finishReceiver(android.os.IBinder p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, int p5) throws android.os.RemoteException {}
            public void attachApplication(android.app.IApplicationThread p0, long p1) throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException { return null; }
            public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return 0; }
            public android.app.ContentProviderHolder getContentProvider(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) throws android.os.RemoteException { return null; }
            public void publishContentProviders(android.app.IApplicationThread p0, java.util.List<android.app.ContentProviderHolder> p1) throws android.os.RemoteException {}
            public boolean refContentProvider(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName startService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, int p6) throws android.os.RemoteException { return null; }
            public int stopService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public int bindService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, int p7) throws android.os.RemoteException { return 0; }
            public int bindServiceInstance(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, int p5, java.lang.String p6, java.lang.String p7, int p8) throws android.os.RemoteException { return 0; }
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
            public boolean updateMccMncConfiguration(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean stopServiceToken(android.content.ComponentName p0, android.os.IBinder p1, int p2) throws android.os.RemoteException { return false; }
            public void setProcessLimit(int p0) throws android.os.RemoteException {}
            public int getProcessLimit() throws android.os.RemoteException { return 0; }
            public int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3, int p4, android.os.IBinder p5) throws android.os.RemoteException { return 0; }
            public int[] checkUriPermissions(java.util.List<android.net.Uri> p0, int p1, int p2, int p3, int p4, android.os.IBinder p5) throws android.os.RemoteException { return null; }
            public void grantUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException {}
            public void revokeUriPermission(android.app.IApplicationThread p0, java.lang.String p1, android.net.Uri p2, int p3, int p4) throws android.os.RemoteException {}
            public void setActivityController(android.app.IActivityController p0, boolean p1) throws android.os.RemoteException {}
            public void showWaitingForDebugger(android.app.IApplicationThread p0, boolean p1) throws android.os.RemoteException {}
            public void signalPersistentProcesses(int p0) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getRecentTasks(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void serviceDoneExecuting(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public android.content.IIntentSender getIntentSender(int p0, java.lang.String p1, android.os.IBinder p2, java.lang.String p3, int p4, android.content.Intent[] p5, java.lang.String[] p6, int p7, android.os.Bundle p8, int p9) throws android.os.RemoteException { return null; }
            public android.content.IIntentSender getIntentSenderWithFeature(int p0, java.lang.String p1, java.lang.String p2, android.os.IBinder p3, java.lang.String p4, int p5, android.content.Intent[] p6, java.lang.String[] p7, int p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return null; }
            public void cancelIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException {}
            public android.app.ActivityManager.PendingIntentInfo getInfoForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException { return null; }
            public boolean registerIntentSenderCancelListenerEx(android.content.IIntentSender p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException { return false; }
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
            public void stopAppForUser(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean registerForegroundServiceObserver(android.app.IForegroundServiceObserver p0) throws android.os.RemoteException { return false; }
            public void forceStopPackage(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean killPids(int[] p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
            public java.util.List<android.app.ActivityManager.RunningServiceInfo> getServices(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws android.os.RemoteException { return null; }
            public android.os.IBinder peekService(android.content.Intent p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean profileControl(java.lang.String p0, int p1, boolean p2, android.app.ProfilerInfo p3, int p4) throws android.os.RemoteException { return false; }
            public boolean shutdown(int p0) throws android.os.RemoteException { return false; }
            public void stopAppSwitches() throws android.os.RemoteException {}
            public void resumeAppSwitches() throws android.os.RemoteException {}
            public boolean bindBackupAgent(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public void backupAgentCreated(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
            public void unbindBackupAgent(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException {}
            public int handleIncomingUser(int p0, int p1, int p2, boolean p3, boolean p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException { return 0; }
            public void addPackageDependency(java.lang.String p0) throws android.os.RemoteException {}
            public void killApplication(java.lang.String p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
            public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) throws android.os.RemoteException { return null; }
            public void killApplicationProcess(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3, int p4) throws android.os.RemoteException { return false; }
            public void killBackgroundProcesses(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean isUserAMonkey() throws android.os.RemoteException { return false; }
            public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() throws android.os.RemoteException { return null; }
            public void finishHeavyWeightApp() throws android.os.RemoteException {}
            public void handleApplicationStrictModeViolation(android.os.IBinder p0, int p1, android.os.StrictMode.ViolationInfo p2) throws android.os.RemoteException {}
            public boolean isTopActivityImmersive() throws android.os.RemoteException { return false; }
            public void crashApplicationWithType(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6) throws android.os.RemoteException {}
            public void crashApplicationWithTypeWithExtras(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6, android.os.Bundle p7) throws android.os.RemoteException {}
            public java.lang.String getProviderMimeType(android.net.Uri p0, int p1) throws android.os.RemoteException { return null; }
            public void getProviderMimeTypeAsync(android.net.Uri p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public boolean dumpHeap(java.lang.String p0, int p1, boolean p2, boolean p3, boolean p4, java.lang.String p5, android.os.ParcelFileDescriptor p6, android.os.RemoteCallback p7) throws android.os.RemoteException { return false; }
            public boolean isUserRunning(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setPackageScreenCompatMode(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean switchUser(int p0) throws android.os.RemoteException { return false; }
            public java.lang.String getSwitchingFromUserMessage() throws android.os.RemoteException { return null; }
            public java.lang.String getSwitchingToUserMessage() throws android.os.RemoteException { return null; }
            public void setStopUserOnSwitch(int p0) throws android.os.RemoteException {}
            public boolean removeTask(int p0) throws android.os.RemoteException { return false; }
            public void registerProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
            public void unregisterProcessObserver(android.app.IProcessObserver p0) throws android.os.RemoteException {}
            public boolean isIntentSenderTargetedToPackage(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
            public void updatePersistentConfiguration(android.content.res.Configuration p0) throws android.os.RemoteException {}
            public void updatePersistentConfigurationWithAttribution(android.content.res.Configuration p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public long[] getProcessPss(int[] p0) throws android.os.RemoteException { return null; }
            public void showBootMessage(java.lang.CharSequence p0, boolean p1) throws android.os.RemoteException {}
            public void killAllBackgroundProcesses() throws android.os.RemoteException {}
            public android.app.ContentProviderHolder getContentProviderExternal(java.lang.String p0, int p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public void removeContentProviderExternal(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void removeContentProviderExternalAsUser(java.lang.String p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
            public void getMyMemoryState(android.app.ActivityManager.RunningAppProcessInfo p0) throws android.os.RemoteException {}
            public boolean killProcessesBelowForeground(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.content.pm.UserInfo getCurrentUser() throws android.os.RemoteException { return null; }
            public int getCurrentUserId() throws android.os.RemoteException { return 0; }
            public int getLaunchedFromUid(android.os.IBinder p0) throws android.os.RemoteException { return 0; }
            public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean isIntentSenderAnActivity(android.content.IIntentSender p0) throws android.os.RemoteException { return false; }
            public int startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, android.content.Intent p2, java.lang.String p3, android.os.IBinder p4, java.lang.String p5, int p6, int p7, android.app.ProfilerInfo p8, android.os.Bundle p9, int p10) throws android.os.RemoteException { return 0; }
            public int startActivityAsUserWithFeature(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.IBinder p5, java.lang.String p6, int p7, int p8, android.app.ProfilerInfo p9, android.os.Bundle p10, int p11) throws android.os.RemoteException { return 0; }
            public int stopUser(int p0, boolean p1, android.app.IStopUserCallback p2) throws android.os.RemoteException { return 0; }
            public int stopUserWithDelayedLocking(int p0, boolean p1, android.app.IStopUserCallback p2) throws android.os.RemoteException { return 0; }
            public void registerUserSwitchObserver(android.app.IUserSwitchObserver p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterUserSwitchObserver(android.app.IUserSwitchObserver p0) throws android.os.RemoteException {}
            public int[] getRunningUserIds() throws android.os.RemoteException { return null; }
            public void requestSystemServerHeapDump() throws android.os.RemoteException {}
            public void requestBugReport(int p0) throws android.os.RemoteException {}
            public void requestBugReportWithDescription(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void requestTelephonyBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void requestWifiBugReport(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void requestInteractiveBugReportWithDescription(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void requestInteractiveBugReport() throws android.os.RemoteException {}
            public void requestFullBugReport() throws android.os.RemoteException {}
            public void requestRemoteBugReport(long p0) throws android.os.RemoteException {}
            public boolean launchBugReportHandlerApp() throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getBugreportWhitelistedPackages() throws android.os.RemoteException { return null; }
            public android.content.Intent getIntentForIntentSender(android.content.IIntentSender p0) throws android.os.RemoteException { return null; }
            public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void killUid(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setUserIsMonkey(boolean p0) throws android.os.RemoteException {}
            public void hang(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityTaskManager.RootTaskInfo> getAllRootTaskInfos() throws android.os.RemoteException { return null; }
            public void moveTaskToRootTask(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setFocusedRootTask(int p0) throws android.os.RemoteException {}
            public android.app.ActivityTaskManager.RootTaskInfo getFocusedRootTaskInfo() throws android.os.RemoteException { return null; }
            public void restart() throws android.os.RemoteException {}
            public void performIdleMaintenance() throws android.os.RemoteException {}
            public void appNotRespondingViaProvider(android.os.IBinder p0) throws android.os.RemoteException {}
            public android.graphics.Rect getTaskBounds(int p0) throws android.os.RemoteException { return null; }
            public boolean setProcessMemoryTrimLevel(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public java.lang.String getTagForIntentSender(android.content.IIntentSender p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean startUserInBackground(int p0) throws android.os.RemoteException { return false; }
            public boolean isInLockTaskMode() throws android.os.RemoteException { return false; }
            public int startActivityFromRecents(int p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
            public void startSystemLockTaskMode(int p0) throws android.os.RemoteException {}
            public boolean isTopOfTask(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void bootAnimationComplete() throws android.os.RemoteException {}
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
            public boolean startBinderTracking() throws android.os.RemoteException { return false; }
            public boolean stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return false; }
            public void enableBinderTracing() throws android.os.RemoteException {}
            public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
            public boolean unlockUser(int p0, byte[] p1, byte[] p2, android.os.IProgressListener p3) throws android.os.RemoteException { return false; }
            public void killPackageDependents(java.lang.String p0, int p1) throws android.os.RemoteException {}
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
            public void scheduleApplicationInfoChanged(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
            public void setPersistentVrThread(int p0) throws android.os.RemoteException {}
            public void waitForNetworkStateUpdate(long p0) throws android.os.RemoteException {}
            public void backgroundAllowlistUid(int p0) throws android.os.RemoteException {}
            public boolean startUserInBackgroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
            public void startDelegateShellPermissionIdentity(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void stopDelegateShellPermissionIdentity() throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getDelegatedShellPermissions() throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor getLifeMonitor() throws android.os.RemoteException { return null; }
            public boolean startUserInForegroundWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
            public void appNotResponding(java.lang.String p0) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice<android.app.ApplicationExitInfo> getHistoricalProcessExitReasons(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public void killProcessesWhenImperceptible(int[] p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setActivityLocusContext(android.content.ComponentName p0, android.content.LocusId p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void setProcessStateSummary(byte[] p0) throws android.os.RemoteException {}
            public boolean isAppFreezerSupported() throws android.os.RemoteException { return false; }
            public boolean isAppFreezerEnabled() throws android.os.RemoteException { return false; }
            public void killUidForPermissionChange(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void resetAppErrors() throws android.os.RemoteException {}
            public boolean enableAppFreezer(boolean p0) throws android.os.RemoteException { return false; }
            public boolean enableFgsNotificationRateLimit(boolean p0) throws android.os.RemoteException { return false; }
            public void holdLock(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public boolean startProfile(int p0) throws android.os.RemoteException { return false; }
            public boolean stopProfile(int p0) throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice queryIntentComponentsForIntentSender(android.content.IIntentSender p0, int p1) throws android.os.RemoteException { return null; }
            public int getUidProcessCapabilities(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void waitForBroadcastIdle() throws android.os.RemoteException {}
            public int getBackgroundRestrictionExemptionReason(int p0) throws android.os.RemoteException { return 0; }
        }
    }
}
