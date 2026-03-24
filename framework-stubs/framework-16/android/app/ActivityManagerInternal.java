package android.app;

public abstract class ActivityManagerInternal {
    public static final int ALLOW_NON_FULL = 0;
    public static final int ALLOW_NON_FULL_IN_PROFILE = 1;
    public static final int ALLOW_FULL_ONLY = 2;
    public static final int ALLOW_PROFILES_OR_NON_FULL = 3;
    public static final int OOM_ADJ_REASON_NONE = 0;
    public static final int OOM_ADJ_REASON_ACTIVITY = 1;
    public static final int OOM_ADJ_REASON_FINISH_RECEIVER = 2;
    public static final int OOM_ADJ_REASON_START_RECEIVER = 3;
    public static final int OOM_ADJ_REASON_BIND_SERVICE = 4;
    public static final int OOM_ADJ_REASON_UNBIND_SERVICE = 5;
    public static final int OOM_ADJ_REASON_START_SERVICE = 6;
    public static final int OOM_ADJ_REASON_GET_PROVIDER = 7;
    public static final int OOM_ADJ_REASON_REMOVE_PROVIDER = 8;
    public static final int OOM_ADJ_REASON_UI_VISIBILITY = 9;
    public static final int OOM_ADJ_REASON_ALLOWLIST = 10;
    public static final int OOM_ADJ_REASON_PROCESS_BEGIN = 11;
    public static final int OOM_ADJ_REASON_PROCESS_END = 12;
    public static final int OOM_ADJ_REASON_SHORT_FGS_TIMEOUT = 13;
    public static final int OOM_ADJ_REASON_SYSTEM_INIT = 14;
    public static final int OOM_ADJ_REASON_BACKUP = 15;
    public static final int OOM_ADJ_REASON_SHELL = 16;
    public static final int OOM_ADJ_REASON_REMOVE_TASK = 17;
    public static final int OOM_ADJ_REASON_UID_IDLE = 18;
    public static final int OOM_ADJ_REASON_STOP_SERVICE = 19;
    public static final int OOM_ADJ_REASON_EXECUTING_SERVICE = 20;
    public static final int OOM_ADJ_REASON_RESTRICTION_CHANGE = 21;
    public static final int OOM_ADJ_REASON_COMPONENT_DISABLED = 22;
    public static final int OOM_ADJ_REASON_FOLLOW_UP = 23;
    public static final int OOM_ADJ_REASON_RECONFIGURATION = 24;
    public static final int OOM_ADJ_REASON_SERVICE_BINDER_CALL = 25;
    public static final int MEDIA_PROJECTION_TOKEN_EVENT_CREATED = 0;
    public static final int MEDIA_PROJECTION_TOKEN_EVENT_DESTROYED = 1;
    public ActivityManagerInternal() {}
    public abstract android.util.Pair<java.lang.String, java.lang.String> getAppProfileStatsForDebugging(long p0, int p1);
    public abstract java.lang.String checkContentProviderAccess(java.lang.String p0, int p1);
    public abstract int checkContentProviderUriPermission(android.net.Uri p0, int p1, int p2, int p3);
    public abstract void onWakefulnessChanged(int p0);
    public abstract boolean startIsolatedProcess(java.lang.String p0, java.lang.String[] p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.Runnable p5);
    public abstract void onUserRemoving(int p0);
    public abstract void onUserRemoved(int p0);
    public abstract boolean startUserInBackgroundTemporarily(int p0, int p1);
    public abstract void killForegroundAppsForUser(int p0);
    public abstract void setPendingIntentAllowlistDuration(android.content.IIntentSender p0, android.os.IBinder p1, long p2, int p3, int p4, java.lang.String p5);
    public abstract int getPendingIntentFlags(android.content.IIntentSender p0);
    public abstract void setPendingIntentAllowBgActivityStarts(android.content.IIntentSender p0, android.os.IBinder p1, int p2);
    public abstract void clearPendingIntentAllowBgActivityStarts(android.content.IIntentSender p0, android.os.IBinder p1);
    public abstract void setDeviceIdleAllowlist(int[] p0, int[] p1);
    public abstract void updateDeviceIdleTempAllowlist(int[] p0, int p1, boolean p2, long p3, int p4, int p5, java.lang.String p6, int p7);
    public abstract int getUidProcessState(int p0);
    public abstract java.util.Map<java.lang.Integer, java.lang.String> getProcessesWithPendingBindMounts(int p0);
    public abstract boolean isSystemReady();
    public abstract void enforceBroadcastOptionsPermissions(android.os.Bundle p0, int p1);
    @android.annotation.Nullable
    public abstract java.lang.String getPackageNameByPid(int p0);
    public abstract void setHasOverlayUi(int p0, boolean p1);
    public abstract void notifyNetworkPolicyRulesUpdated(int p0, long p1);
    public abstract void onUidBlockedReasonsChanged(int p0, int p1);
    public abstract boolean isRuntimeRestarted();
    public abstract boolean canStartMoreUsers();
    public abstract void setSwitchingFromUserMessage(int p0, java.lang.String p1);
    public abstract void setSwitchingToUserMessage(int p0, java.lang.String p1);
    public abstract int getMaxRunningUsers();
    public abstract boolean isUidActive(int p0);
    public abstract java.util.List<android.app.ProcessMemoryState> getMemoryStateForProcesses();
    public abstract int handleIncomingUser(int p0, int p1, int p2, boolean p3, int p4, java.lang.String p5, java.lang.String p6);
    @android.annotation.PermissionMethod
    public abstract void enforceCallingPermission(java.lang.String p0, java.lang.String p1);
    public abstract android.util.Pair<java.lang.Integer, java.lang.Integer> getCurrentAndTargetUserIds();
    public abstract int getCurrentUserId();
    public abstract int[] getStartedUserIds();
    public abstract boolean isUserRunning(int p0, int p1);
    public abstract void trimApplications();
    public abstract void killProcessesForRemovedTask(java.util.ArrayList<java.lang.Object> p0);
    public abstract void killProcess(java.lang.String p0, int p1, java.lang.String p2);
    public abstract boolean hasRunningActivity(int p0, java.lang.String p1);
    public abstract void updateOomAdj(int p0);
    public abstract void updateCpuStats();
    public abstract void updateBatteryStats(android.content.ComponentName p0, int p1, int p2, boolean p3);
    public abstract void updateActivityUsageStats(android.content.ComponentName p0, int p1, int p2, android.os.IBinder p3, android.content.ComponentName p4, android.app.assist.ActivityId p5);
    public abstract void updateForegroundTimeIfOnBattery(java.lang.String p0, int p1, long p2);
    public abstract void sendForegroundProfileChanged(int p0);
    public abstract boolean shouldConfirmCredentials(int p0);
    public abstract void noteAlarmFinish(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3);
    public abstract void noteAlarmStart(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3);
    public abstract void noteWakeupAlarm(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3, java.lang.String p4);
    public abstract boolean isAppStartModeDisabled(int p0, java.lang.String p1);
    public abstract int[] getCurrentProfileIds();
    public abstract android.content.pm.UserInfo getCurrentUser();
    public abstract void ensureNotSpecialUser(int p0);
    public abstract boolean isCurrentProfile(int p0);
    public abstract boolean hasStartedUserState(int p0);
    public abstract void finishUserSwitch(java.lang.Object p0);
    public abstract void scheduleAppGcs();
    public abstract int getTaskIdForActivity(android.os.IBinder p0, boolean p1);
    public abstract android.content.pm.ActivityPresentationInfo getActivityPresentationInfo(android.os.IBinder p0);
    public abstract void setBooting(boolean p0);
    public abstract boolean isBooting();
    public abstract void setBooted(boolean p0);
    public abstract boolean isBooted();
    public abstract void finishBooting();
    public abstract void tempAllowlistForPendingIntent(int p0, int p1, int p2, long p3, int p4, int p5, java.lang.String p6);
    public abstract int broadcastIntentInPackage(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, android.content.Intent p5, java.lang.String p6, android.app.IApplicationThread p7, android.content.IIntentReceiver p8, int p9, java.lang.String p10, android.os.Bundle p11, java.lang.String p12, android.os.Bundle p13, boolean p14, boolean p15, int p16, android.app.BackgroundStartPrivileges p17, int[] p18);
    public abstract android.content.ComponentName startServiceInPackage(int p0, android.content.Intent p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, int p6, android.app.BackgroundStartPrivileges p7) throws android.os.TransactionTooLargeException;
    public abstract void disconnectActivityFromServices(java.lang.Object p0);
    public abstract void cleanUpServices(int p0, android.content.ComponentName p1, android.content.Intent p2);
    public abstract android.content.pm.ActivityInfo getActivityInfoForUser(android.content.pm.ActivityInfo p0, int p1);
    public abstract void ensureBootCompleted();
    public abstract void updateOomLevelsForDisplay(int p0);
    public abstract boolean isActivityStartsLoggingEnabled();
    public abstract boolean isBackgroundActivityStartsEnabled();
    @android.annotation.NonNull
    public abstract android.app.BackgroundStartPrivileges getBackgroundStartPrivileges(int p0);
    public abstract void reportCurKeyguardUsageEvent(boolean p0);
    public abstract boolean canScheduleUserInitiatedJobs(int p0, int p1, java.lang.String p2);
    public abstract void monitor();
    public abstract long inputDispatchingTimedOut(int p0, boolean p1, com.android.internal.os.TimeoutRecord p2);
    public abstract boolean inputDispatchingTimedOut(java.lang.Object p0, java.lang.String p1, android.content.pm.ApplicationInfo p2, java.lang.String p3, java.lang.Object p4, boolean p5, com.android.internal.os.TimeoutRecord p6);
    public abstract void inputDispatchingResumed(int p0);
    public abstract void rescheduleAnrDialog(java.lang.Object p0);
    public abstract void moveErrorDialogsToDefaultDisplay(int p0);
    public abstract void broadcastGlobalConfigurationChanged(int p0, boolean p1);
    public abstract void broadcastCloseSystemDialogs(java.lang.String p0);
    public abstract void appNotResponding(java.lang.String p0, int p1, com.android.internal.os.TimeoutRecord p2);
    public abstract void killAllBackgroundProcessesExcept(int p0, int p1);
    public abstract void startProcess(java.lang.String p0, android.content.pm.ApplicationInfo p1, boolean p2, boolean p3, java.lang.String p4, android.content.ComponentName p5);
    public abstract void setDebugFlagsForStartingActivity(android.content.pm.ActivityInfo p0, int p1, android.app.ProfilerInfo p2, java.lang.Object p3);
    public abstract int getStorageMountMode(int p0, int p1);
    public abstract boolean isAppForeground(int p0);
    public abstract boolean isAppBad(java.lang.String p0, int p1);
    public abstract void clearPendingBackup(int p0);
    public abstract void prepareForPossibleShutdown();
    public abstract boolean hasRunningForegroundService(int p0, int p1);
    public abstract boolean hasForegroundServiceNotification(java.lang.String p0, int p1, java.lang.String p2);
    public abstract android.app.ActivityManagerInternal.ServiceNotificationPolicy applyForegroundServiceNotification(android.app.Notification p0, java.lang.String p1, int p2, java.lang.String p3, int p4);
    public abstract void onForegroundServiceNotificationUpdate(boolean p0, android.app.Notification p1, int p2, java.lang.String p3, int p4);
    public abstract void stopAppForUser(java.lang.String p0, int p1);
    public abstract void registerProcessObserver(android.app.IProcessObserver p0);
    public abstract void unregisterProcessObserver(android.app.IProcessObserver p0);
    public abstract int getInstrumentationSourceUid(int p0);
    public abstract boolean isDeviceOwner(int p0);
    public abstract void setDeviceOwnerUid(int p0);
    public abstract boolean isProfileOwner(int p0);
    public abstract void setProfileOwnerUid(android.util.ArraySet<java.lang.Integer> p0);
    public abstract void setCompanionAppUids(int p0, java.util.Set<java.lang.Integer> p1);
    public abstract boolean isAssociatedCompanionApp(int p0, int p1);
    public abstract int broadcastIntent(android.content.Intent p0, android.content.IIntentReceiver p1, java.lang.String[] p2, boolean p3, int p4, int[] p5, java.util.function.BiFunction<java.lang.Integer, android.os.Bundle, android.os.Bundle> p6, android.os.Bundle p7);
    public abstract int broadcastIntentWithCallback(android.content.Intent p0, android.content.IIntentReceiver p1, java.lang.String[] p2, int p3, int[] p4, java.util.function.BiFunction<java.lang.Integer, android.os.Bundle, android.os.Bundle> p5, android.os.Bundle p6);
    public abstract void addPendingTopUid(int p0, int p1, android.app.IApplicationThread p2);
    public abstract void deletePendingTopUid(int p0, long p1);
    public abstract boolean isPendingTopUid(int p0);
    @android.annotation.Nullable
    public abstract android.content.Intent getIntentForIntentSender(android.content.IIntentSender p0);
    public abstract android.app.PendingIntent getPendingIntentActivityAsApp(int p0, android.content.Intent p1, int p2, android.os.Bundle p3, java.lang.String p4, int p5);
    public abstract android.app.PendingIntent getPendingIntentActivityAsApp(int p0, android.content.Intent[] p1, int p2, android.os.Bundle p3, java.lang.String p4, int p5);
    public abstract long getBootTimeTempAllowListDuration();
    public abstract void registerAnrController(android.app.AnrController p0);
    public abstract void unregisterAnrController(android.app.AnrController p0);
    public abstract boolean isTempAllowlistedForFgsWhileInUse(int p0);
    public abstract int getPushMessagingOverQuotaBehavior();
    public abstract int getServiceStartForegroundTimeout();
    public abstract int getUidCapability(int p0);
    @android.annotation.Nullable
    public abstract java.util.List<java.lang.Integer> getIsolatedProcesses(int p0);
    public abstract int sendIntentSender(android.content.IIntentSender p0, android.os.IBinder p1, int p2, android.content.Intent p3, java.lang.String p4, android.content.IIntentReceiver p5, java.lang.String p6, android.os.Bundle p7);
    public abstract void setVoiceInteractionManagerProvider(android.app.ActivityManagerInternal.VoiceInteractionManagerProvider p0);
    public abstract boolean isEarlyPackageKillEnabledForUserSwitch(int p0, int p1);
    public abstract void setStopUserOnSwitch(int p0);
    public abstract int getRestrictionLevel(int p0);
    public abstract int getRestrictionLevel(java.lang.String p0, int p1);
    public abstract boolean isBgAutoRestrictedBucketFeatureFlagEnabled();
    public abstract void addAppBackgroundRestrictionListener(android.app.ActivityManagerInternal.AppBackgroundRestrictionListener p0);
    public abstract void addForegroundServiceStateListener(android.app.ActivityManagerInternal.ForegroundServiceStateListener p0);
    public abstract void addBroadcastEventListener(android.app.ActivityManagerInternal.BroadcastEventListener p0);
    public abstract void addBindServiceEventListener(android.app.ActivityManagerInternal.BindServiceEventListener p0);
    public abstract void restart();
    public abstract java.util.List<android.app.PendingIntentStats> getPendingIntentStats();
    public abstract void registerNetworkPolicyUidObserver(android.app.IUidObserver p0, int p1, int p2, java.lang.String p3);
    public abstract android.util.ArraySet<java.lang.String> getClientPackages(java.lang.String p0);
    public abstract void triggerUnsafeIntentStrictMode(int p0, int p1, android.content.Intent p2);
    public abstract boolean startForegroundServiceDelegate(android.app.ForegroundServiceDelegationOptions p0, android.content.ServiceConnection p1);
    public abstract void stopForegroundServiceDelegate(android.app.ForegroundServiceDelegationOptions p0);
    public abstract void stopForegroundServiceDelegate(android.content.ServiceConnection p0);
    public abstract void notifyInactiveMediaForegroundService(java.lang.String p0, int p1, int p2);
    public abstract void notifyActiveMediaForegroundService(java.lang.String p0, int p1, int p2);
    public abstract boolean startProfileEvenWhenDisabled(int p0);
    public abstract void logFgsApiBegin(int p0, int p1, int p2);
    public abstract void logFgsApiEnd(int p0, int p1, int p2);
    public abstract boolean canStartForegroundService(int p0, int p1, java.lang.String p2);
    public abstract boolean canAllowWhileInUsePermissionInFgs(int p0, int p1, java.lang.String p2);
    public abstract void tempAllowWhileInUsePermissionInFgs(int p0, long p1);
    public abstract void notifyMediaProjectionEvent(int p0, android.os.IBinder p1, int p2);
    @android.annotation.NonNull
    public abstract java.lang.Object getCachedAppsHighWatermarkStats(int p0, boolean p1);
    public abstract boolean clearApplicationUserData(java.lang.String p0, boolean p1, boolean p2, android.content.pm.IPackageDataObserver p3, int p4);
    public abstract boolean shouldDelayHomeLaunch(int p0);
    public abstract void addFrozenProcessListener(int p0, java.util.concurrent.Executor p1, android.app.ActivityManagerInternal.FrozenProcessListener p2);
    public abstract void addStartInfoTimestamp(int p0, long p1, int p2, int p3, int p4);
    public abstract void killApplicationSync(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4);
    public abstract void getExecutableMethodFileOffsets(java.lang.String p0, int p1, int p2, android.os.instrumentation.MethodDescriptor p3, android.os.instrumentation.IOffsetCallback p4);
    public abstract void addCreatorToken(android.content.Intent p0, java.lang.String p1);

    public static interface AppBackgroundRestrictionListener {
        default public void onRestrictionLevelChanged(int p0, java.lang.String p1, int p2) {}
        default public void onAutoRestrictedBucketFeatureFlagChanged(boolean p0) {}
    }

    public static interface BindServiceEventListener {
        public void onBindingService(java.lang.String p0, int p1);
    }

    public static interface BroadcastEventListener {
        public void onSendingBroadcast(java.lang.String p0, int p1);
    }

    public static interface ForegroundServiceStateListener {
        public void onForegroundServiceStateChanged(java.lang.String p0, int p1, int p2, boolean p3);
        public void onForegroundServiceNotificationUpdated(java.lang.String p0, int p1, int p2, boolean p3);
    }

    public static interface FrozenProcessListener {
        public void onProcessFrozen(int p0);
        public void onProcessUnfrozen(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediaProjectionTokenEvent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OomAdjReason {
    }

    public static enum ServiceNotificationPolicy {
        NOT_FOREGROUND_SERVICE,
        SHOW_IMMEDIATELY,
        UPDATE_ONLY;
    }

    public static interface VoiceInteractionManagerProvider {
        public void notifyActivityDestroyed(android.os.IBinder p0);
    }
}
