package android.app;

public interface IActivityManager extends android.os.IInterface {
    public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException;
    public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException;
    public android.os.IBinder registerUidObserverForUids(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3, int[] p4) throws android.os.RemoteException;
    public void addUidToObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void removeUidFromObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.PACKAGE_USAGE_STATS", "android.permission.INTERACT_ACROSS_USERS_FULL"}, conditional=true)
    public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void logFgsApiBegin(int p0, int p1, int p2) throws android.os.RemoteException;
    public void logFgsApiEnd(int p0, int p1, int p2) throws android.os.RemoteException;
    public void logFgsApiStateChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
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
    public void finishAttachApplication(long p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException;
    public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException;
    public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public android.app.ContentProviderHolder getContentProvider(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) throws android.os.RemoteException;
    public void publishContentProviders(android.app.IApplicationThread p0, java.util.List<android.app.ContentProviderHolder> p1) throws android.os.RemoteException;
    public boolean refContentProvider(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.content.ComponentName startService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, int p6) throws android.os.RemoteException;
    public int stopService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int bindService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, long p5, java.lang.String p6, int p7) throws android.os.RemoteException;
    public int bindServiceInstance(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, long p5, java.lang.String p6, java.lang.String p7, int p8) throws android.os.RemoteException;
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
    public void forceStopPackageEvenWhenStopping(java.lang.String p0, int p1) throws android.os.RemoteException;
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
    public void killApplication(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) throws android.os.RemoteException;
    public void killApplicationProcess(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3, int p4) throws android.os.RemoteException;
    public void killBackgroundProcesses(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isUserAMonkey() throws android.os.RemoteException;
    public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() throws android.os.RemoteException;
    public void finishHeavyWeightApp() throws android.os.RemoteException;
    public void handleApplicationStrictModeViolation(android.os.IBinder p0, int p1, android.os.StrictMode.ViolationInfo p2) throws android.os.RemoteException;
    public void registerStrictModeCallback(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean isTopActivityImmersive() throws android.os.RemoteException;
    public void crashApplicationWithType(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6) throws android.os.RemoteException;
    public void crashApplicationWithTypeWithExtras(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6, android.os.Bundle p7) throws android.os.RemoteException;
    public void getMimeTypeFilterAsync(android.net.Uri p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
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
    public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean unlockUser(int p0, byte[] p1, byte[] p2, android.os.IProgressListener p3) throws android.os.RemoteException;
    public boolean unlockUser2(int p0, android.os.IProgressListener p1) throws android.os.RemoteException;
    public void killPackageDependents(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void makePackageIdle(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setDeterministicUidIdle(boolean p0) throws android.os.RemoteException;
    public int getMemoryTrimLevel() throws android.os.RemoteException;
    public boolean isVrModePackageEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public void notifyLockedProfile(int p0) throws android.os.RemoteException;
    public void startConfirmDeviceCredentialIntent(android.content.Intent p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void sendIdleJobTrigger() throws android.os.RemoteException;
    public int sendIntentSender(android.app.IApplicationThread p0, android.content.IIntentSender p1, android.os.IBinder p2, int p3, android.content.Intent p4, java.lang.String p5, android.content.IIntentReceiver p6, java.lang.String p7, android.os.Bundle p8) throws android.os.RemoteException;
    public boolean isBackgroundRestricted(java.lang.String p0) throws android.os.RemoteException;
    public void setRenderThread(int p0) throws android.os.RemoteException;
    public void setHasTopUi(boolean p0) throws android.os.RemoteException;
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
    public android.content.pm.ParceledListSlice<android.app.ApplicationStartInfo> getHistoricalProcessStartReasons(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void setApplicationStartInfoCompleteListener(android.app.IApplicationStartInfoCompleteListener p0, int p1) throws android.os.RemoteException;
    public void removeApplicationStartInfoCompleteListener(int p0) throws android.os.RemoteException;
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
    public void waitForBroadcastBarrier() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public void forceDelayBroadcastDelivery(java.lang.String p0, long p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public boolean isModernBroadcastQueueEnabled() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public boolean isProcessFrozen(int p0) throws android.os.RemoteException;
    public int getBackgroundRestrictionExemptionReason(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.CREATE_USERS"}, conditional=true)
    public boolean startUserInBackgroundVisibleOnDisplay(int p0, int p1, android.os.IProgressListener p2) throws android.os.RemoteException;
    public boolean startProfileWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException;
    public int restartUserInBackground(int p0, int p1) throws android.os.RemoteException;
    public int[] getDisplayIdsForStartingVisibleBackgroundUsers() throws android.os.RemoteException;
    public boolean shouldServiceTimeOut(android.content.ComponentName p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void registerUidFrozenStateChangedCallback(android.app.IUidFrozenStateChangedCallback p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.PACKAGE_USAGE_STATS")
    public void unregisterUidFrozenStateChangedCallback(android.app.IUidFrozenStateChangedCallback p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.PACKAGE_USAGE_STATS")
    public int[] getUidFrozenState(int[] p0) throws android.os.RemoteException;

    public static class Default implements android.app.IActivityManager {
        public Default() {}
        public android.os.ParcelFileDescriptor openContentUri(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void registerUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void unregisterUidObserver(android.app.IUidObserver p0) throws android.os.RemoteException {}
        public android.os.IBinder registerUidObserverForUids(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3, int[] p4) throws android.os.RemoteException { return null; }
        public void addUidToObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void removeUidFromObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public void logFgsApiBegin(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void logFgsApiEnd(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void logFgsApiStateChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
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
        public void finishAttachApplication(long p0) throws android.os.RemoteException {}
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException { return null; }
        public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return 0; }
        public android.app.ContentProviderHolder getContentProvider(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) throws android.os.RemoteException { return null; }
        public void publishContentProviders(android.app.IApplicationThread p0, java.util.List<android.app.ContentProviderHolder> p1) throws android.os.RemoteException {}
        public boolean refContentProvider(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName startService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, int p6) throws android.os.RemoteException { return null; }
        public int stopService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public int bindService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, long p5, java.lang.String p6, int p7) throws android.os.RemoteException { return 0; }
        public int bindServiceInstance(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, long p5, java.lang.String p6, java.lang.String p7, int p8) throws android.os.RemoteException { return 0; }
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
        public void forceStopPackageEvenWhenStopping(java.lang.String p0, int p1) throws android.os.RemoteException {}
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
        public void killApplication(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
        public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) throws android.os.RemoteException { return null; }
        public void killApplicationProcess(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3, int p4) throws android.os.RemoteException { return false; }
        public void killBackgroundProcesses(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean isUserAMonkey() throws android.os.RemoteException { return false; }
        public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() throws android.os.RemoteException { return null; }
        public void finishHeavyWeightApp() throws android.os.RemoteException {}
        public void handleApplicationStrictModeViolation(android.os.IBinder p0, int p1, android.os.StrictMode.ViolationInfo p2) throws android.os.RemoteException {}
        public void registerStrictModeCallback(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean isTopActivityImmersive() throws android.os.RemoteException { return false; }
        public void crashApplicationWithType(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6) throws android.os.RemoteException {}
        public void crashApplicationWithTypeWithExtras(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6, android.os.Bundle p7) throws android.os.RemoteException {}
        public void getMimeTypeFilterAsync(android.net.Uri p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
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
        public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
        public boolean unlockUser(int p0, byte[] p1, byte[] p2, android.os.IProgressListener p3) throws android.os.RemoteException { return false; }
        public boolean unlockUser2(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
        public void killPackageDependents(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void makePackageIdle(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setDeterministicUidIdle(boolean p0) throws android.os.RemoteException {}
        public int getMemoryTrimLevel() throws android.os.RemoteException { return 0; }
        public boolean isVrModePackageEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void notifyLockedProfile(int p0) throws android.os.RemoteException {}
        public void startConfirmDeviceCredentialIntent(android.content.Intent p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void sendIdleJobTrigger() throws android.os.RemoteException {}
        public int sendIntentSender(android.app.IApplicationThread p0, android.content.IIntentSender p1, android.os.IBinder p2, int p3, android.content.Intent p4, java.lang.String p5, android.content.IIntentReceiver p6, java.lang.String p7, android.os.Bundle p8) throws android.os.RemoteException { return 0; }
        public boolean isBackgroundRestricted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setRenderThread(int p0) throws android.os.RemoteException {}
        public void setHasTopUi(boolean p0) throws android.os.RemoteException {}
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
        public android.content.pm.ParceledListSlice<android.app.ApplicationStartInfo> getHistoricalProcessStartReasons(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void setApplicationStartInfoCompleteListener(android.app.IApplicationStartInfoCompleteListener p0, int p1) throws android.os.RemoteException {}
        public void removeApplicationStartInfoCompleteListener(int p0) throws android.os.RemoteException {}
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
        public void waitForBroadcastBarrier() throws android.os.RemoteException {}
        public void forceDelayBroadcastDelivery(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public boolean isModernBroadcastQueueEnabled() throws android.os.RemoteException { return false; }
        public boolean isProcessFrozen(int p0) throws android.os.RemoteException { return false; }
        public int getBackgroundRestrictionExemptionReason(int p0) throws android.os.RemoteException { return 0; }
        public boolean startUserInBackgroundVisibleOnDisplay(int p0, int p1, android.os.IProgressListener p2) throws android.os.RemoteException { return false; }
        public boolean startProfileWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
        public int restartUserInBackground(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int[] getDisplayIdsForStartingVisibleBackgroundUsers() throws android.os.RemoteException { return null; }
        public boolean shouldServiceTimeOut(android.content.ComponentName p0, android.os.IBinder p1) throws android.os.RemoteException { return false; }
        public void registerUidFrozenStateChangedCallback(android.app.IUidFrozenStateChangedCallback p0) throws android.os.RemoteException {}
        public void unregisterUidFrozenStateChangedCallback(android.app.IUidFrozenStateChangedCallback p0) throws android.os.RemoteException {}
        public int[] getUidFrozenState(int[] p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IActivityManager {
        public static final java.lang.String DESCRIPTOR = "android.app.IActivityManager";
        static final int TRANSACTION_openContentUri = 1;
        static final int TRANSACTION_registerUidObserver = 2;
        static final int TRANSACTION_unregisterUidObserver = 3;
        static final int TRANSACTION_registerUidObserverForUids = 4;
        static final int TRANSACTION_addUidToObserver = 5;
        static final int TRANSACTION_removeUidFromObserver = 6;
        static final int TRANSACTION_isUidActive = 7;
        static final int TRANSACTION_getUidProcessState = 8;
        static final int TRANSACTION_checkPermission = 9;
        static final int TRANSACTION_logFgsApiBegin = 10;
        static final int TRANSACTION_logFgsApiEnd = 11;
        static final int TRANSACTION_logFgsApiStateChanged = 12;
        static final int TRANSACTION_handleApplicationCrash = 13;
        static final int TRANSACTION_startActivity = 14;
        static final int TRANSACTION_startActivityWithFeature = 15;
        static final int TRANSACTION_unhandledBack = 16;
        static final int TRANSACTION_finishActivity = 17;
        static final int TRANSACTION_registerReceiver = 18;
        static final int TRANSACTION_registerReceiverWithFeature = 19;
        static final int TRANSACTION_unregisterReceiver = 20;
        static final int TRANSACTION_broadcastIntent = 21;
        static final int TRANSACTION_broadcastIntentWithFeature = 22;
        static final int TRANSACTION_unbroadcastIntent = 23;
        static final int TRANSACTION_finishReceiver = 24;
        static final int TRANSACTION_attachApplication = 25;
        static final int TRANSACTION_finishAttachApplication = 26;
        static final int TRANSACTION_getTasks = 27;
        static final int TRANSACTION_moveTaskToFront = 28;
        static final int TRANSACTION_getTaskForActivity = 29;
        static final int TRANSACTION_getContentProvider = 30;
        static final int TRANSACTION_publishContentProviders = 31;
        static final int TRANSACTION_refContentProvider = 32;
        static final int TRANSACTION_getRunningServiceControlPanel = 33;
        static final int TRANSACTION_startService = 34;
        static final int TRANSACTION_stopService = 35;
        static final int TRANSACTION_bindService = 36;
        static final int TRANSACTION_bindServiceInstance = 37;
        static final int TRANSACTION_updateServiceGroup = 38;
        static final int TRANSACTION_unbindService = 39;
        static final int TRANSACTION_publishService = 40;
        static final int TRANSACTION_setDebugApp = 41;
        static final int TRANSACTION_setAgentApp = 42;
        static final int TRANSACTION_setAlwaysFinish = 43;
        static final int TRANSACTION_startInstrumentation = 44;
        static final int TRANSACTION_addInstrumentationResults = 45;
        static final int TRANSACTION_finishInstrumentation = 46;
        static final int TRANSACTION_getConfiguration = 47;
        static final int TRANSACTION_updateConfiguration = 48;
        static final int TRANSACTION_updateMccMncConfiguration = 49;
        static final int TRANSACTION_stopServiceToken = 50;
        static final int TRANSACTION_setProcessLimit = 51;
        static final int TRANSACTION_getProcessLimit = 52;
        static final int TRANSACTION_checkUriPermission = 53;
        static final int TRANSACTION_checkUriPermissions = 54;
        static final int TRANSACTION_grantUriPermission = 55;
        static final int TRANSACTION_revokeUriPermission = 56;
        static final int TRANSACTION_setActivityController = 57;
        static final int TRANSACTION_showWaitingForDebugger = 58;
        static final int TRANSACTION_signalPersistentProcesses = 59;
        static final int TRANSACTION_getRecentTasks = 60;
        static final int TRANSACTION_serviceDoneExecuting = 61;
        static final int TRANSACTION_getIntentSender = 62;
        static final int TRANSACTION_getIntentSenderWithFeature = 63;
        static final int TRANSACTION_cancelIntentSender = 64;
        static final int TRANSACTION_getInfoForIntentSender = 65;
        static final int TRANSACTION_registerIntentSenderCancelListenerEx = 66;
        static final int TRANSACTION_unregisterIntentSenderCancelListener = 67;
        static final int TRANSACTION_enterSafeMode = 68;
        static final int TRANSACTION_noteWakeupAlarm = 69;
        static final int TRANSACTION_removeContentProvider = 70;
        static final int TRANSACTION_setRequestedOrientation = 71;
        static final int TRANSACTION_unbindFinished = 72;
        static final int TRANSACTION_setProcessImportant = 73;
        static final int TRANSACTION_setServiceForeground = 74;
        static final int TRANSACTION_getForegroundServiceType = 75;
        static final int TRANSACTION_moveActivityTaskToBack = 76;
        static final int TRANSACTION_getMemoryInfo = 77;
        static final int TRANSACTION_getProcessesInErrorState = 78;
        static final int TRANSACTION_clearApplicationUserData = 79;
        static final int TRANSACTION_stopAppForUser = 80;
        static final int TRANSACTION_registerForegroundServiceObserver = 81;
        static final int TRANSACTION_forceStopPackage = 82;
        static final int TRANSACTION_forceStopPackageEvenWhenStopping = 83;
        static final int TRANSACTION_killPids = 84;
        static final int TRANSACTION_getServices = 85;
        static final int TRANSACTION_getRunningAppProcesses = 86;
        static final int TRANSACTION_peekService = 87;
        static final int TRANSACTION_profileControl = 88;
        static final int TRANSACTION_shutdown = 89;
        static final int TRANSACTION_stopAppSwitches = 90;
        static final int TRANSACTION_resumeAppSwitches = 91;
        static final int TRANSACTION_bindBackupAgent = 92;
        static final int TRANSACTION_backupAgentCreated = 93;
        static final int TRANSACTION_unbindBackupAgent = 94;
        static final int TRANSACTION_handleIncomingUser = 95;
        static final int TRANSACTION_addPackageDependency = 96;
        static final int TRANSACTION_killApplication = 97;
        static final int TRANSACTION_closeSystemDialogs = 98;
        static final int TRANSACTION_getProcessMemoryInfo = 99;
        static final int TRANSACTION_killApplicationProcess = 100;
        static final int TRANSACTION_handleApplicationWtf = 101;
        static final int TRANSACTION_killBackgroundProcesses = 102;
        static final int TRANSACTION_isUserAMonkey = 103;
        static final int TRANSACTION_getRunningExternalApplications = 104;
        static final int TRANSACTION_finishHeavyWeightApp = 105;
        static final int TRANSACTION_handleApplicationStrictModeViolation = 106;
        static final int TRANSACTION_registerStrictModeCallback = 107;
        static final int TRANSACTION_isTopActivityImmersive = 108;
        static final int TRANSACTION_crashApplicationWithType = 109;
        static final int TRANSACTION_crashApplicationWithTypeWithExtras = 110;
        static final int TRANSACTION_getMimeTypeFilterAsync = 111;
        static final int TRANSACTION_dumpHeap = 112;
        static final int TRANSACTION_isUserRunning = 113;
        static final int TRANSACTION_setPackageScreenCompatMode = 114;
        static final int TRANSACTION_switchUser = 115;
        static final int TRANSACTION_getSwitchingFromUserMessage = 116;
        static final int TRANSACTION_getSwitchingToUserMessage = 117;
        static final int TRANSACTION_setStopUserOnSwitch = 118;
        static final int TRANSACTION_removeTask = 119;
        static final int TRANSACTION_registerProcessObserver = 120;
        static final int TRANSACTION_unregisterProcessObserver = 121;
        static final int TRANSACTION_isIntentSenderTargetedToPackage = 122;
        static final int TRANSACTION_updatePersistentConfiguration = 123;
        static final int TRANSACTION_updatePersistentConfigurationWithAttribution = 124;
        static final int TRANSACTION_getProcessPss = 125;
        static final int TRANSACTION_showBootMessage = 126;
        static final int TRANSACTION_killAllBackgroundProcesses = 127;
        static final int TRANSACTION_getContentProviderExternal = 128;
        static final int TRANSACTION_removeContentProviderExternal = 129;
        static final int TRANSACTION_removeContentProviderExternalAsUser = 130;
        static final int TRANSACTION_getMyMemoryState = 131;
        static final int TRANSACTION_killProcessesBelowForeground = 132;
        static final int TRANSACTION_getCurrentUser = 133;
        static final int TRANSACTION_getCurrentUserId = 134;
        static final int TRANSACTION_getLaunchedFromUid = 135;
        static final int TRANSACTION_unstableProviderDied = 136;
        static final int TRANSACTION_isIntentSenderAnActivity = 137;
        static final int TRANSACTION_startActivityAsUser = 138;
        static final int TRANSACTION_startActivityAsUserWithFeature = 139;
        static final int TRANSACTION_stopUser = 140;
        static final int TRANSACTION_stopUserWithDelayedLocking = 141;
        static final int TRANSACTION_registerUserSwitchObserver = 142;
        static final int TRANSACTION_unregisterUserSwitchObserver = 143;
        static final int TRANSACTION_getRunningUserIds = 144;
        static final int TRANSACTION_requestSystemServerHeapDump = 145;
        static final int TRANSACTION_requestBugReport = 146;
        static final int TRANSACTION_requestBugReportWithDescription = 147;
        static final int TRANSACTION_requestTelephonyBugReport = 148;
        static final int TRANSACTION_requestWifiBugReport = 149;
        static final int TRANSACTION_requestInteractiveBugReportWithDescription = 150;
        static final int TRANSACTION_requestInteractiveBugReport = 151;
        static final int TRANSACTION_requestFullBugReport = 152;
        static final int TRANSACTION_requestRemoteBugReport = 153;
        static final int TRANSACTION_launchBugReportHandlerApp = 154;
        static final int TRANSACTION_getBugreportWhitelistedPackages = 155;
        static final int TRANSACTION_getIntentForIntentSender = 156;
        static final int TRANSACTION_getLaunchedFromPackage = 157;
        static final int TRANSACTION_killUid = 158;
        static final int TRANSACTION_setUserIsMonkey = 159;
        static final int TRANSACTION_hang = 160;
        static final int TRANSACTION_getAllRootTaskInfos = 161;
        static final int TRANSACTION_moveTaskToRootTask = 162;
        static final int TRANSACTION_setFocusedRootTask = 163;
        static final int TRANSACTION_getFocusedRootTaskInfo = 164;
        static final int TRANSACTION_restart = 165;
        static final int TRANSACTION_performIdleMaintenance = 166;
        static final int TRANSACTION_appNotRespondingViaProvider = 167;
        static final int TRANSACTION_getTaskBounds = 168;
        static final int TRANSACTION_setProcessMemoryTrimLevel = 169;
        static final int TRANSACTION_getTagForIntentSender = 170;
        static final int TRANSACTION_startUserInBackground = 171;
        static final int TRANSACTION_isInLockTaskMode = 172;
        static final int TRANSACTION_startActivityFromRecents = 173;
        static final int TRANSACTION_startSystemLockTaskMode = 174;
        static final int TRANSACTION_isTopOfTask = 175;
        static final int TRANSACTION_bootAnimationComplete = 176;
        static final int TRANSACTION_registerTaskStackListener = 177;
        static final int TRANSACTION_unregisterTaskStackListener = 178;
        static final int TRANSACTION_notifyCleartextNetwork = 179;
        static final int TRANSACTION_setTaskResizeable = 180;
        static final int TRANSACTION_resizeTask = 181;
        static final int TRANSACTION_getLockTaskModeState = 182;
        static final int TRANSACTION_setDumpHeapDebugLimit = 183;
        static final int TRANSACTION_dumpHeapFinished = 184;
        static final int TRANSACTION_updateLockTaskPackages = 185;
        static final int TRANSACTION_noteAlarmStart = 186;
        static final int TRANSACTION_noteAlarmFinish = 187;
        static final int TRANSACTION_getPackageProcessState = 188;
        static final int TRANSACTION_startBinderTracking = 189;
        static final int TRANSACTION_stopBinderTrackingAndDump = 190;
        static final int TRANSACTION_suppressResizeConfigChanges = 191;
        static final int TRANSACTION_unlockUser = 192;
        static final int TRANSACTION_unlockUser2 = 193;
        static final int TRANSACTION_killPackageDependents = 194;
        static final int TRANSACTION_makePackageIdle = 195;
        static final int TRANSACTION_setDeterministicUidIdle = 196;
        static final int TRANSACTION_getMemoryTrimLevel = 197;
        static final int TRANSACTION_isVrModePackageEnabled = 198;
        static final int TRANSACTION_notifyLockedProfile = 199;
        static final int TRANSACTION_startConfirmDeviceCredentialIntent = 200;
        static final int TRANSACTION_sendIdleJobTrigger = 201;
        static final int TRANSACTION_sendIntentSender = 202;
        static final int TRANSACTION_isBackgroundRestricted = 203;
        static final int TRANSACTION_setRenderThread = 204;
        static final int TRANSACTION_setHasTopUi = 205;
        static final int TRANSACTION_cancelTaskWindowTransition = 206;
        static final int TRANSACTION_scheduleApplicationInfoChanged = 207;
        static final int TRANSACTION_setPersistentVrThread = 208;
        static final int TRANSACTION_waitForNetworkStateUpdate = 209;
        static final int TRANSACTION_backgroundAllowlistUid = 210;
        static final int TRANSACTION_startUserInBackgroundWithListener = 211;
        static final int TRANSACTION_startDelegateShellPermissionIdentity = 212;
        static final int TRANSACTION_stopDelegateShellPermissionIdentity = 213;
        static final int TRANSACTION_getDelegatedShellPermissions = 214;
        static final int TRANSACTION_getLifeMonitor = 215;
        static final int TRANSACTION_startUserInForegroundWithListener = 216;
        static final int TRANSACTION_appNotResponding = 217;
        static final int TRANSACTION_getHistoricalProcessStartReasons = 218;
        static final int TRANSACTION_setApplicationStartInfoCompleteListener = 219;
        static final int TRANSACTION_removeApplicationStartInfoCompleteListener = 220;
        static final int TRANSACTION_getHistoricalProcessExitReasons = 221;
        static final int TRANSACTION_killProcessesWhenImperceptible = 222;
        static final int TRANSACTION_setActivityLocusContext = 223;
        static final int TRANSACTION_setProcessStateSummary = 224;
        static final int TRANSACTION_isAppFreezerSupported = 225;
        static final int TRANSACTION_isAppFreezerEnabled = 226;
        static final int TRANSACTION_killUidForPermissionChange = 227;
        static final int TRANSACTION_resetAppErrors = 228;
        static final int TRANSACTION_enableAppFreezer = 229;
        static final int TRANSACTION_enableFgsNotificationRateLimit = 230;
        static final int TRANSACTION_holdLock = 231;
        static final int TRANSACTION_startProfile = 232;
        static final int TRANSACTION_stopProfile = 233;
        static final int TRANSACTION_queryIntentComponentsForIntentSender = 234;
        static final int TRANSACTION_getUidProcessCapabilities = 235;
        static final int TRANSACTION_waitForBroadcastIdle = 236;
        static final int TRANSACTION_waitForBroadcastBarrier = 237;
        static final int TRANSACTION_forceDelayBroadcastDelivery = 238;
        static final int TRANSACTION_isModernBroadcastQueueEnabled = 239;
        static final int TRANSACTION_isProcessFrozen = 240;
        static final int TRANSACTION_getBackgroundRestrictionExemptionReason = 241;
        static final int TRANSACTION_startUserInBackgroundVisibleOnDisplay = 242;
        static final int TRANSACTION_startProfileWithListener = 243;
        static final int TRANSACTION_restartUserInBackground = 244;
        static final int TRANSACTION_getDisplayIdsForStartingVisibleBackgroundUsers = 245;
        static final int TRANSACTION_shouldServiceTimeOut = 246;
        static final int TRANSACTION_registerUidFrozenStateChangedCallback = 247;
        static final int TRANSACTION_unregisterUidFrozenStateChangedCallback = 248;
        static final int TRANSACTION_getUidFrozenState = 249;
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
            public android.os.IBinder registerUidObserverForUids(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3, int[] p4) throws android.os.RemoteException { return null; }
            public void addUidToObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void removeUidFromObserver(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public boolean isUidActive(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int getUidProcessState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public void logFgsApiBegin(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void logFgsApiEnd(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void logFgsApiStateChanged(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
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
            public void finishAttachApplication(long p0) throws android.os.RemoteException {}
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) throws android.os.RemoteException { return null; }
            public void moveTaskToFront(android.app.IApplicationThread p0, java.lang.String p1, int p2, int p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public int getTaskForActivity(android.os.IBinder p0, boolean p1) throws android.os.RemoteException { return 0; }
            public android.app.ContentProviderHolder getContentProvider(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4) throws android.os.RemoteException { return null; }
            public void publishContentProviders(android.app.IApplicationThread p0, java.util.List<android.app.ContentProviderHolder> p1) throws android.os.RemoteException {}
            public boolean refContentProvider(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName startService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, int p6) throws android.os.RemoteException { return null; }
            public int stopService(android.app.IApplicationThread p0, android.content.Intent p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public int bindService(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, long p5, java.lang.String p6, int p7) throws android.os.RemoteException { return 0; }
            public int bindServiceInstance(android.app.IApplicationThread p0, android.os.IBinder p1, android.content.Intent p2, java.lang.String p3, android.app.IServiceConnection p4, long p5, java.lang.String p6, java.lang.String p7, int p8) throws android.os.RemoteException { return 0; }
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
            public void forceStopPackageEvenWhenStopping(java.lang.String p0, int p1) throws android.os.RemoteException {}
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
            public void killApplication(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
            public void closeSystemDialogs(java.lang.String p0) throws android.os.RemoteException {}
            public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) throws android.os.RemoteException { return null; }
            public void killApplicationProcess(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3, int p4) throws android.os.RemoteException { return false; }
            public void killBackgroundProcesses(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean isUserAMonkey() throws android.os.RemoteException { return false; }
            public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() throws android.os.RemoteException { return null; }
            public void finishHeavyWeightApp() throws android.os.RemoteException {}
            public void handleApplicationStrictModeViolation(android.os.IBinder p0, int p1, android.os.StrictMode.ViolationInfo p2) throws android.os.RemoteException {}
            public void registerStrictModeCallback(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean isTopActivityImmersive() throws android.os.RemoteException { return false; }
            public void crashApplicationWithType(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6) throws android.os.RemoteException {}
            public void crashApplicationWithTypeWithExtras(int p0, int p1, java.lang.String p2, int p3, java.lang.String p4, boolean p5, int p6, android.os.Bundle p7) throws android.os.RemoteException {}
            public void getMimeTypeFilterAsync(android.net.Uri p0, int p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
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
            public void suppressResizeConfigChanges(boolean p0) throws android.os.RemoteException {}
            public boolean unlockUser(int p0, byte[] p1, byte[] p2, android.os.IProgressListener p3) throws android.os.RemoteException { return false; }
            public boolean unlockUser2(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
            public void killPackageDependents(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void makePackageIdle(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setDeterministicUidIdle(boolean p0) throws android.os.RemoteException {}
            public int getMemoryTrimLevel() throws android.os.RemoteException { return 0; }
            public boolean isVrModePackageEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void notifyLockedProfile(int p0) throws android.os.RemoteException {}
            public void startConfirmDeviceCredentialIntent(android.content.Intent p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void sendIdleJobTrigger() throws android.os.RemoteException {}
            public int sendIntentSender(android.app.IApplicationThread p0, android.content.IIntentSender p1, android.os.IBinder p2, int p3, android.content.Intent p4, java.lang.String p5, android.content.IIntentReceiver p6, java.lang.String p7, android.os.Bundle p8) throws android.os.RemoteException { return 0; }
            public boolean isBackgroundRestricted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setRenderThread(int p0) throws android.os.RemoteException {}
            public void setHasTopUi(boolean p0) throws android.os.RemoteException {}
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
            public android.content.pm.ParceledListSlice<android.app.ApplicationStartInfo> getHistoricalProcessStartReasons(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void setApplicationStartInfoCompleteListener(android.app.IApplicationStartInfoCompleteListener p0, int p1) throws android.os.RemoteException {}
            public void removeApplicationStartInfoCompleteListener(int p0) throws android.os.RemoteException {}
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
            public void waitForBroadcastBarrier() throws android.os.RemoteException {}
            public void forceDelayBroadcastDelivery(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public boolean isModernBroadcastQueueEnabled() throws android.os.RemoteException { return false; }
            public boolean isProcessFrozen(int p0) throws android.os.RemoteException { return false; }
            public int getBackgroundRestrictionExemptionReason(int p0) throws android.os.RemoteException { return 0; }
            public boolean startUserInBackgroundVisibleOnDisplay(int p0, int p1, android.os.IProgressListener p2) throws android.os.RemoteException { return false; }
            public boolean startProfileWithListener(int p0, android.os.IProgressListener p1) throws android.os.RemoteException { return false; }
            public int restartUserInBackground(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int[] getDisplayIdsForStartingVisibleBackgroundUsers() throws android.os.RemoteException { return null; }
            public boolean shouldServiceTimeOut(android.content.ComponentName p0, android.os.IBinder p1) throws android.os.RemoteException { return false; }
            public void registerUidFrozenStateChangedCallback(android.app.IUidFrozenStateChangedCallback p0) throws android.os.RemoteException {}
            public void unregisterUidFrozenStateChangedCallback(android.app.IUidFrozenStateChangedCallback p0) throws android.os.RemoteException {}
            public int[] getUidFrozenState(int[] p0) throws android.os.RemoteException { return null; }
        }
    }
}
