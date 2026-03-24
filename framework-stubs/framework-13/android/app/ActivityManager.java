package android.app;

public class ActivityManager {
    public static final int INSTR_FLAG_DISABLE_HIDDEN_API_CHECKS = 1;
    public static final int INSTR_FLAG_DISABLE_ISOLATED_STORAGE = 2;
    public static final int INSTR_FLAG_DISABLE_TEST_API_CHECKS = 4;
    public static final int INSTR_FLAG_NO_RESTART = 8;
    public static final int INSTR_FLAG_ALWAYS_CHECK_SIGNATURE = 16;
    public static final int INSTR_FLAG_INSTRUMENT_SDK_SANDBOX = 32;
    final android.util.ArrayMap<android.app.ActivityManager.OnUidImportanceListener, android.app.ActivityManager.UidObserver> mImportanceListeners = null;
    public static final java.lang.String META_HOME_ALTERNATE = "android.app.home.alternate";
    public static final int START_VOICE_HIDDEN_SESSION = -100;
    public static final int START_VOICE_NOT_ACTIVE_SESSION = -99;
    public static final int START_NOT_CURRENT_USER_ACTIVITY = -98;
    public static final int START_NOT_VOICE_COMPATIBLE = -97;
    public static final int START_CANCELED = -96;
    public static final int START_NOT_ACTIVITY = -95;
    public static final int START_PERMISSION_DENIED = -94;
    public static final int START_FORWARD_AND_REQUEST_CONFLICT = -93;
    public static final int START_CLASS_NOT_FOUND = -92;
    public static final int START_INTENT_NOT_RESOLVED = -91;
    public static final int START_ASSISTANT_HIDDEN_SESSION = -90;
    public static final int START_ASSISTANT_NOT_ACTIVE_SESSION = -89;
    public static final int START_SUCCESS = 0;
    public static final int START_RETURN_INTENT_TO_CALLER = 1;
    public static final int START_TASK_TO_FRONT = 2;
    public static final int START_DELIVERED_TO_TOP = 3;
    public static final int START_SWITCHES_CANCELED = 100;
    public static final int START_RETURN_LOCK_TASK_MODE_VIOLATION = 101;
    public static final int START_ABORTED = 102;
    public static final int START_FLAG_ONLY_IF_NEEDED = 1;
    public static final int START_FLAG_DEBUG = 2;
    public static final int START_FLAG_TRACK_ALLOCATION = 4;
    public static final int START_FLAG_NATIVE_DEBUGGING = 8;
    public static final int BROADCAST_SUCCESS = 0;
    public static final int BROADCAST_STICKY_CANT_HAVE_PERMISSION = -1;
    public static final int BROADCAST_FAILED_USER_STOPPED = -2;
    public static final int INTENT_SENDER_UNKNOWN = 0;
    public static final int INTENT_SENDER_BROADCAST = 1;
    public static final int INTENT_SENDER_ACTIVITY = 2;
    public static final int INTENT_SENDER_ACTIVITY_RESULT = 3;
    public static final int INTENT_SENDER_SERVICE = 4;
    public static final int INTENT_SENDER_FOREGROUND_SERVICE = 5;
    public static final int USER_OP_SUCCESS = 0;
    public static final int USER_OP_UNKNOWN_USER = -1;
    public static final int USER_OP_IS_CURRENT = -2;
    public static final int USER_OP_ERROR_IS_SYSTEM = -3;
    public static final int USER_OP_ERROR_RELATED_USERS_CANNOT_STOP = -4;
    public static final int PROCESS_STATE_UNKNOWN = -1;
    public static final int PROCESS_STATE_PERSISTENT = 0;
    public static final int PROCESS_STATE_PERSISTENT_UI = 1;
    public static final int PROCESS_STATE_TOP = 2;
    public static final int PROCESS_STATE_BOUND_TOP = 3;
    public static final int PROCESS_STATE_FOREGROUND_SERVICE = 4;
    public static final int PROCESS_STATE_BOUND_FOREGROUND_SERVICE = 5;
    public static final int PROCESS_STATE_IMPORTANT_FOREGROUND = 6;
    public static final int PROCESS_STATE_IMPORTANT_BACKGROUND = 7;
    public static final int PROCESS_STATE_TRANSIENT_BACKGROUND = 8;
    public static final int PROCESS_STATE_BACKUP = 9;
    public static final int PROCESS_STATE_SERVICE = 10;
    public static final int PROCESS_STATE_RECEIVER = 11;
    public static final int PROCESS_STATE_TOP_SLEEPING = 12;
    public static final int PROCESS_STATE_HEAVY_WEIGHT = 13;
    public static final int PROCESS_STATE_HOME = 14;
    public static final int PROCESS_STATE_LAST_ACTIVITY = 15;
    public static final int PROCESS_STATE_CACHED_ACTIVITY = 16;
    public static final int PROCESS_STATE_CACHED_ACTIVITY_CLIENT = 17;
    public static final int PROCESS_STATE_CACHED_RECENT = 18;
    public static final int PROCESS_STATE_CACHED_EMPTY = 19;
    public static final int PROCESS_STATE_NONEXISTENT = 20;
    public static final int PROCESS_CAPABILITY_NONE = 0;
    public static final int PROCESS_CAPABILITY_FOREGROUND_LOCATION = 1;
    public static final int PROCESS_CAPABILITY_FOREGROUND_CAMERA = 2;
    public static final int PROCESS_CAPABILITY_FOREGROUND_MICROPHONE = 4;
    public static final int PROCESS_CAPABILITY_NETWORK = 8;
    public static final int PROCESS_CAPABILITY_ALL = 15;
    public static final int PROCESS_CAPABILITY_ALL_EXPLICIT = 1;
    public static final int PROCESS_CAPABILITY_ALL_IMPLICIT = 6;
    public static final int MIN_PROCESS_STATE = 0;
    public static final int MAX_PROCESS_STATE = 20;
    public static final int ASSIST_CONTEXT_BASIC = 0;
    public static final int ASSIST_CONTEXT_FULL = 1;
    public static final int ASSIST_CONTEXT_AUTOFILL = 2;
    public static final int ASSIST_CONTEXT_CONTENT = 3;
    public static final int UID_OBSERVER_PROCSTATE = 1;
    public static final int UID_OBSERVER_GONE = 2;
    public static final int UID_OBSERVER_IDLE = 4;
    public static final int UID_OBSERVER_ACTIVE = 8;
    public static final int UID_OBSERVER_CACHED = 16;
    public static final int UID_OBSERVER_CAPABILITY = 32;
    public static final int UID_OBSERVER_PROC_OOM_ADJ = 64;
    public static final int APP_START_MODE_NORMAL = 0;
    public static final int APP_START_MODE_DELAYED = 1;
    public static final int APP_START_MODE_DELAYED_RIGID = 2;
    public static final int APP_START_MODE_DISABLED = 3;
    public static final int LOCK_TASK_MODE_NONE = 0;
    public static final int LOCK_TASK_MODE_LOCKED = 1;
    public static final int LOCK_TASK_MODE_PINNED = 2;
    android.graphics.Point mAppTaskThumbnailSize;
    public static final int COMPAT_MODE_ALWAYS = -1;
    public static final int COMPAT_MODE_NEVER = -2;
    public static final int COMPAT_MODE_UNKNOWN = -3;
    public static final int COMPAT_MODE_DISABLED = 0;
    public static final int COMPAT_MODE_ENABLED = 1;
    public static final int COMPAT_MODE_TOGGLE = 2;
    public static final long DROP_CLOSE_SYSTEM_DIALOGS = 174664120L;
    public static final long LOCK_DOWN_CLOSE_SYSTEM_DIALOGS = 174664365L;
    public static final int RESTRICTION_LEVEL_UNKNOWN = 0;
    public static final int RESTRICTION_LEVEL_UNRESTRICTED = 10;
    public static final int RESTRICTION_LEVEL_EXEMPTED = 20;
    public static final int RESTRICTION_LEVEL_ADAPTIVE_BUCKET = 30;
    public static final int RESTRICTION_LEVEL_RESTRICTED_BUCKET = 40;
    public static final int RESTRICTION_LEVEL_BACKGROUND_RESTRICTED = 50;
    public static final int RESTRICTION_LEVEL_HIBERNATION = 60;
    public static final int RESTRICTION_LEVEL_MAX = 100;
    public static final int RECENT_WITH_EXCLUDED = 1;
    public static final int RECENT_IGNORE_UNAVAILABLE = 2;
    public static final int MOVE_TASK_WITH_HOME = 1;
    public static final int MOVE_TASK_NO_USER_ACTION = 2;
    public static final int STOP_USER_ON_SWITCH_DEFAULT = -1;
    public static final int STOP_USER_ON_SWITCH_TRUE = 1;
    public static final int STOP_USER_ON_SWITCH_FALSE = 0;
    public static final int FLAG_OR_STOPPED = 1;
    public static final int FLAG_AND_LOCKED = 2;
    public static final int FLAG_AND_UNLOCKED = 4;
    public static final int FLAG_AND_UNLOCKING_OR_UNLOCKED = 8;
    public static final java.lang.String ACTION_REPORT_HEAP_LIMIT = "android.app.action.REPORT_HEAP_LIMIT";
    public static void printCapabilitiesSummary(java.io.PrintWriter p0, int p1) {}
    public static void printCapabilitiesSummary(java.lang.StringBuilder p0, int p1) {}
    public static void printCapabilitiesFull(java.io.PrintWriter p0, int p1) {}
    public static java.lang.String getCapabilitiesSummary(int p0) { return null; }
    public static final int processStateAmToProto(int p0) { return 0; }
    public static final boolean isProcStateBackground(int p0) { return false; }
    public static final boolean isProcStateCached(int p0) { return false; }
    public static boolean isForegroundService(int p0) { return false; }
    ActivityManager(android.content.Context p0, android.os.Handler p1) {}
    public static final boolean isStartResultSuccessful(int p0) { return false; }
    public static final boolean isStartResultFatalError(int p0) { return false; }
    public static java.lang.String restrictionLevelToName(int p0) { return null; }
    public int getFrontActivityScreenCompatMode() { return 0; }
    public void setFrontActivityScreenCompatMode(int p0) {}
    public int getPackageScreenCompatMode(java.lang.String p0) { return 0; }
    public void setPackageScreenCompatMode(java.lang.String p0, int p1) {}
    public boolean getPackageAskScreenCompat(java.lang.String p0) { return false; }
    public void setPackageAskScreenCompat(java.lang.String p0, boolean p1) {}
    public int getMemoryClass() { return 0; }
    public static int staticGetMemoryClass() { return 0; }
    public int getLargeMemoryClass() { return 0; }
    public static int staticGetLargeMemoryClass() { return 0; }
    public boolean isLowRamDevice() { return false; }
    public static boolean isLowRamDeviceStatic() { return false; }
    public static boolean isSmallBatteryDevice() { return false; }
    public static boolean isHighEndGfx() { return false; }
    public long getTotalRam() { return 0L; }
    @java.lang.Deprecated
    public static int getMaxRecentTasksStatic() { return 0; }
    @java.lang.Deprecated
    public java.util.List<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int p0, int p1) throws java.lang.SecurityException { return null; }
    public java.util.List<android.app.ActivityManager.AppTask> getAppTasks() { return null; }
    public android.util.Size getAppTaskThumbnailSize() { return null; }
    public int addAppTask(android.app.Activity p0, android.content.Intent p1, android.app.ActivityManager.TaskDescription p2, android.graphics.Bitmap p3) { return 0; }
    @java.lang.Deprecated
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRunningTasks(int p0) throws java.lang.SecurityException { return null; }
    @android.annotation.RequiresPermission("android.permission.REORDER_TASKS")
    public void moveTaskToFront(int p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.REORDER_TASKS")
    public void moveTaskToFront(int p0, int p1, android.os.Bundle p2) {}
    public boolean isActivityStartAllowedOnDisplay(android.content.Context p0, int p1, android.content.Intent p2) { return false; }
    @java.lang.Deprecated
    public java.util.List<android.app.ActivityManager.RunningServiceInfo> getRunningServices(int p0) throws java.lang.SecurityException { return null; }
    public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws java.lang.SecurityException { return null; }
    public void getMemoryInfo(android.app.ActivityManager.MemoryInfo p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.CLEAR_APP_USER_DATA", "android.permission.ACCESS_INSTANT_APPS"})
    public boolean clearApplicationUserData(java.lang.String p0, android.content.pm.IPackageDataObserver p1) { return false; }
    public boolean clearApplicationUserData() { return false; }
    @java.lang.Deprecated
    public android.content.pm.ParceledListSlice<android.app.GrantedUriPermission> getGrantedUriPermissions(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public void clearGrantedUriPermissions(java.lang.String p0) {}
    public java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState() { return null; }
    public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() { return null; }
    public boolean isBackgroundRestricted() { return false; }
    public boolean setProcessMemoryTrimLevel(java.lang.String p0, int p1, int p2) { return false; }
    public java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() { return null; }
    public java.util.List<android.app.ApplicationExitInfo> getHistoricalProcessExitReasons(java.lang.String p0, int p1, int p2) { return null; }
    public void setProcessStateSummary(byte[] p0) {}
    public static boolean isLowMemoryKillReportSupported() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.PACKAGE_USAGE_STATS", "android.permission.INTERACT_ACROSS_USERS_FULL"}, conditional=true)
    public int getUidProcessState(int p0) { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.PACKAGE_USAGE_STATS", "android.permission.INTERACT_ACROSS_USERS_FULL"}, conditional=true)
    public int getUidProcessCapabilities(int p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.PACKAGE_USAGE_STATS")
    public int getPackageImportance(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.PACKAGE_USAGE_STATS")
    public int getUidImportance(int p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.PACKAGE_USAGE_STATS")
    public void addOnUidImportanceListener(android.app.ActivityManager.OnUidImportanceListener p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.PACKAGE_USAGE_STATS")
    public void removeOnUidImportanceListener(android.app.ActivityManager.OnUidImportanceListener p0) {}
    public static void getMyMemoryState(android.app.ActivityManager.RunningAppProcessInfo p0) {}
    public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) { return null; }
    @java.lang.Deprecated
    public void restartPackage(java.lang.String p0) {}
    @android.annotation.RequiresPermission("android.permission.KILL_BACKGROUND_PROCESSES")
    public void killBackgroundProcesses(java.lang.String p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.KILL_UID")
    public void killUid(int p0, java.lang.String p1) {}
    public void forceStopPackageAsUser(java.lang.String p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.FORCE_STOP_PACKAGES")
    public void forceStopPackage(java.lang.String p0) {}
    @android.annotation.SystemApi
    public void setDeviceLocales(android.os.LocaleList p0) {}
    @android.annotation.SystemApi
    public java.util.Collection<java.util.Locale> getSupportedLocales() { return null; }
    public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() { return null; }
    public int getLauncherLargeIconDensity() { return 0; }
    public int getLauncherLargeIconSize() { return 0; }
    static int getLauncherLargeIconSizeInner(android.content.Context p0) { return 0; }
    public static boolean isUserAMonkey() { return false; }
    @java.lang.Deprecated
    public static boolean isRunningInTestHarness() { return false; }
    public static boolean isRunningInUserTestHarness() { return false; }
    public void alwaysShowUnsupportedCompileSdkWarning(android.content.ComponentName p0) {}
    public static int checkComponentPermission(java.lang.String p0, int p1, int p2, boolean p3) { return 0; }
    public static int checkUidPermission(java.lang.String p0, int p1) { return 0; }
    public static int handleIncomingUser(int p0, int p1, int p2, boolean p3, boolean p4, java.lang.String p5, java.lang.String p6) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public static int getCurrentUser() { return 0; }
    public boolean switchUser(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.CREATE_USERS"})
    public boolean switchUser(android.os.UserHandle p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USERS")
    public java.lang.String getSwitchingFromUserMessage() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_USERS")
    public java.lang.String getSwitchingToUserMessage() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.INTERACT_ACROSS_USERS"})
    public void setStopUserOnSwitch(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public boolean startProfile(android.os.UserHandle p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public boolean stopProfile(android.os.UserHandle p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.CHANGE_CONFIGURATION")
    public boolean updateMccMncConfiguration(java.lang.String p0, java.lang.String p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public boolean stopUser(int p0, boolean p1) { return false; }
    public boolean isUserRunning(int p0) { return false; }
    public boolean isVrModePackageEnabled(android.content.ComponentName p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public void dumpPackageState(java.io.FileDescriptor p0, java.lang.String p1) {}
    public static void dumpPackageStateStatic(java.io.FileDescriptor p0, java.lang.String p1) {}
    public static boolean isSystemReady() { return false; }
    public static void broadcastStickyIntent(android.content.Intent p0, int p1) {}
    public static void broadcastStickyIntent(android.content.Intent p0, int p1, int p2) {}
    public static void resumeAppSwitches() throws android.os.RemoteException {}
    public static void noteWakeupAlarm(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3, java.lang.String p4) {}
    public static void noteAlarmStart(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3) {}
    public static void noteAlarmFinish(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3) {}
    public static android.app.IActivityManager getService() { return null; }
    public void setWatchHeapLimit(long p0) {}
    public void clearWatchHeapLimit() {}
    @java.lang.Deprecated
    public boolean isInLockTaskMode() { return false; }
    public int getLockTaskModeState() { return 0; }
    public static void setVrThread(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RESTRICTED_VR_ACCESS")
    public static void setPersistentVrThread(int p0) {}
    @android.annotation.RequiresPermission("android.permission.CHANGE_CONFIGURATION")
    public void scheduleApplicationInfoChanged(java.util.List<java.lang.String> p0, int p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_USERS", "android.permission.CREATE_USERS"})
    public boolean isProfileForeground(android.os.UserHandle p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.FORCE_STOP_PACKAGES")
    public void killProcessesWhenImperceptible(int[] p0, java.lang.String p1) {}
    public static boolean isProcStateConsideredInteraction(int p0) { return false; }
    public static java.lang.String procStateToString(int p0) { return null; }
    public java.util.List<java.lang.String> getBugreportWhitelistedPackages() { return null; }
    public void appNotResponding(java.lang.String p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.SET_ACTIVITY_WATCHER")
    public void addHomeVisibilityListener(java.util.concurrent.Executor p0, android.app.HomeVisibilityListener p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.SET_ACTIVITY_WATCHER")
    public void removeHomeVisibilityListener(android.app.HomeVisibilityListener p0) {}
    @android.annotation.RequiresPermission("android.permission.RESET_APP_ERRORS")
    public void resetAppErrors() {}
    public void holdLock(android.os.IBinder p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public void waitForBroadcastIdle() {}
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public int getBackgroundRestrictionExemptionReason(int p0) { return 0; }

    public static class AppTask {
        public AppTask(android.app.IAppTask p0) {}
        public void finishAndRemoveTask() {}
        public android.app.ActivityManager.RecentTaskInfo getTaskInfo() { return null; }
        public void moveToFront() {}
        public void startActivity(android.content.Context p0, android.content.Intent p1, android.os.Bundle p2) {}
        public void setExcludeFromRecents(boolean p0) {}
    }

    public static class MemoryInfo implements android.os.Parcelable {
        public long availMem;
        public long totalMem;
        public long threshold;
        public boolean lowMemory;
        public long hiddenAppThreshold;
        public long secondaryServerThreshold;
        public long visibleAppThreshold;
        public long foregroundAppThreshold;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.MemoryInfo> CREATOR = null;
        public MemoryInfo() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MoveTaskFlags {
    }

    @android.annotation.SystemApi
    public static interface OnUidImportanceListener {
        public void onUidImportance(int p0, int p1);
    }

    public static final class PendingIntentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.PendingIntentInfo> CREATOR = null;
        public PendingIntentInfo(java.lang.String p0, int p1, boolean p2, int p3) {}
        public java.lang.String getCreatorPackage() { return null; }
        public int getCreatorUid() { return 0; }
        public boolean isImmutable() { return false; }
        public int getIntentSenderType() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProcessCapability {
    }

    public static class ProcessErrorStateInfo implements android.os.Parcelable {
        public static final int NO_ERROR = 0;
        public static final int CRASHED = 1;
        public static final int NOT_RESPONDING = 2;
        public int condition;
        public java.lang.String processName;
        public int pid;
        public int uid;
        public java.lang.String tag;
        public java.lang.String shortMsg;
        public java.lang.String longMsg;
        public java.lang.String stackTrace;
        public byte[] crashData;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.ProcessErrorStateInfo> CREATOR = null;
        public ProcessErrorStateInfo() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProcessState {
    }

    public static class RecentTaskInfo extends android.app.TaskInfo implements android.os.Parcelable {
        @java.lang.Deprecated
        public int id;
        @java.lang.Deprecated
        public int persistentId;
        @java.lang.Deprecated
        public java.lang.CharSequence description;
        @java.lang.Deprecated
        public int affiliatedTaskId;
        public java.util.ArrayList<android.app.ActivityManager.RecentTaskInfo> childrenTaskInfos;
        public android.app.ActivityManager.RecentTaskInfo.PersistedTaskSnapshotData lastSnapshotData;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.RecentTaskInfo> CREATOR = null;
        public RecentTaskInfo() { super(); }
        public int describeContents() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void dump(java.io.PrintWriter p0, java.lang.String p1) {}

        public static class PersistedTaskSnapshotData {
            public android.graphics.Point taskSize;
            public android.graphics.Rect contentInsets;
            public android.graphics.Point bufferSize;
            public PersistedTaskSnapshotData() {}
            public void set(android.app.ActivityManager.RecentTaskInfo.PersistedTaskSnapshotData p0) {}
            public void set(android.window.TaskSnapshot p0) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RestrictionLevel {
    }

    public static class RunningAppProcessInfo implements android.os.Parcelable {
        public java.lang.String processName;
        public int pid;
        public int uid;
        public java.lang.String[] pkgList;
        public static final int FLAG_CANT_SAVE_STATE = 1;
        public static final int FLAG_PERSISTENT = 2;
        public static final int FLAG_HAS_ACTIVITIES = 4;
        public int flags;
        public int lastTrimLevel;
        public static final int IMPORTANCE_FOREGROUND = 100;
        public static final int IMPORTANCE_FOREGROUND_SERVICE = 125;
        @java.lang.Deprecated
        public static final int IMPORTANCE_TOP_SLEEPING_PRE_28 = 150;
        public static final int IMPORTANCE_VISIBLE = 200;
        public static final int IMPORTANCE_PERCEPTIBLE_PRE_26 = 130;
        public static final int IMPORTANCE_PERCEPTIBLE = 230;
        public static final int IMPORTANCE_CANT_SAVE_STATE_PRE_26 = 170;
        public static final int IMPORTANCE_SERVICE = 300;
        public static final int IMPORTANCE_TOP_SLEEPING = 325;
        public static final int IMPORTANCE_CANT_SAVE_STATE = 350;
        public static final int IMPORTANCE_CACHED = 400;
        public static final int IMPORTANCE_BACKGROUND = 400;
        @java.lang.Deprecated
        public static final int IMPORTANCE_EMPTY = 500;
        public static final int IMPORTANCE_GONE = 1000;
        public int importance;
        public int lru;
        public static final int REASON_UNKNOWN = 0;
        public static final int REASON_PROVIDER_IN_USE = 1;
        public static final int REASON_SERVICE_IN_USE = 2;
        public int importanceReasonCode;
        public int importanceReasonPid;
        public android.content.ComponentName importanceReasonComponent;
        public int importanceReasonImportance;
        public int processState;
        public boolean isFocused;
        public long lastActivityTime;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningAppProcessInfo> CREATOR = null;
        public static int procStateToImportance(int p0) { return 0; }
        public static int procStateToImportanceForClient(int p0, android.content.Context p1) { return 0; }
        public static int procStateToImportanceForTargetSdk(int p0, int p1) { return 0; }
        public static int importanceToProcState(int p0) { return 0; }
        public RunningAppProcessInfo() {}
        public RunningAppProcessInfo(java.lang.String p0, int p1, java.lang.String[] p2) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Importance {
        }
    }

    public static class RunningServiceInfo implements android.os.Parcelable {
        public android.content.ComponentName service;
        public int pid;
        public int uid;
        public java.lang.String process;
        public boolean foreground;
        public long activeSince;
        public boolean started;
        public int clientCount;
        public int crashCount;
        public long lastActivityTime;
        public long restarting;
        public static final int FLAG_STARTED = 1;
        public static final int FLAG_FOREGROUND = 2;
        public static final int FLAG_SYSTEM_PROCESS = 4;
        public static final int FLAG_PERSISTENT_PROCESS = 8;
        public int flags;
        public java.lang.String clientPackage;
        public int clientLabel;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningServiceInfo> CREATOR = null;
        public RunningServiceInfo() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
    }

    public static class RunningTaskInfo extends android.app.TaskInfo implements android.os.Parcelable {
        @java.lang.Deprecated
        public int id;
        @java.lang.Deprecated
        public android.graphics.Bitmap thumbnail;
        @java.lang.Deprecated
        public java.lang.CharSequence description;
        @java.lang.Deprecated
        public int numRunning;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningTaskInfo> CREATOR = null;
        public RunningTaskInfo() { super(); }
        public int describeContents() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static @interface StopUserOnSwitch {
    }

    public static class TaskDescription implements android.os.Parcelable {
        public static final java.lang.String ATTR_TASKDESCRIPTION_PREFIX = "task_description_";
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.TaskDescription> CREATOR = null;
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0, int p1, int p2) {}
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0, int p1) {}
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0) {}
        @java.lang.Deprecated
        public TaskDescription() {}
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0, android.graphics.Bitmap p1, int p2) {}
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0, android.graphics.Bitmap p1) {}
        public TaskDescription(java.lang.String p0, android.graphics.drawable.Icon p1, int p2, int p3, int p4, int p5, boolean p6, boolean p7, int p8, int p9, int p10, int p11) {}
        public TaskDescription(android.app.ActivityManager.TaskDescription p0) {}
        public void copyFrom(android.app.ActivityManager.TaskDescription p0) {}
        public void copyFromPreserveHiddenFields(android.app.ActivityManager.TaskDescription p0) {}
        public void setLabel(java.lang.String p0) {}
        public void setPrimaryColor(int p0) {}
        public void setBackgroundColor(int p0) {}
        public void setBackgroundColorFloating(int p0) {}
        public void setStatusBarColor(int p0) {}
        public void setNavigationBarColor(int p0) {}
        public void setIcon(android.graphics.drawable.Icon p0) {}
        public void setIconFilename(java.lang.String p0) {}
        public void setResizeMode(int p0) {}
        public void setMinWidth(int p0) {}
        public void setMinHeight(int p0) {}
        public java.lang.String getLabel() { return null; }
        public android.graphics.drawable.Icon loadIcon() { return null; }
        @java.lang.Deprecated
        public android.graphics.Bitmap getIcon() { return null; }
        public android.graphics.drawable.Icon getRawIcon() { return null; }
        public java.lang.String getIconResourcePackage() { return null; }
        public int getIconResource() { return 0; }
        public java.lang.String getIconFilename() { return null; }
        public android.graphics.Bitmap getInMemoryIcon() { return null; }
        public static android.graphics.Bitmap loadTaskDescriptionIcon(java.lang.String p0, int p1) { return null; }
        public int getPrimaryColor() { return 0; }
        public int getBackgroundColor() { return 0; }
        public int getBackgroundColorFloating() { return 0; }
        public int getStatusBarColor() { return 0; }
        public int getNavigationBarColor() { return 0; }
        public boolean getEnsureStatusBarContrastWhenTransparent() { return false; }
        public void setEnsureStatusBarContrastWhenTransparent(boolean p0) {}
        public boolean getEnsureNavigationBarContrastWhenTransparent() { return false; }
        public void setEnsureNavigationBarContrastWhenTransparent(boolean p0) {}
        public int getResizeMode() { return 0; }
        public int getMinWidth() { return 0; }
        public int getMinHeight() { return 0; }
        public void saveToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
        public void restoreFromXml(android.util.TypedXmlPullParser p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public static boolean equals(android.app.ActivityManager.TaskDescription p0, android.app.ActivityManager.TaskDescription p1) { return false; }

        public static final class Builder {
            public Builder() {}
            public android.app.ActivityManager.TaskDescription.Builder setLabel(java.lang.String p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setIcon(int p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setPrimaryColor(int p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setBackgroundColor(int p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setStatusBarColor(int p0) { return null; }
            public android.app.ActivityManager.TaskDescription.Builder setNavigationBarColor(int p0) { return null; }
            public android.app.ActivityManager.TaskDescription build() { return null; }
        }
    }

    static final class UidObserver extends android.app.IUidObserver.Stub {
        final android.app.ActivityManager.OnUidImportanceListener mListener = null;
        final android.content.Context mContext = null;
        UidObserver(android.app.ActivityManager.OnUidImportanceListener p0, android.content.Context p1) { super(); }
        public void onUidStateChanged(int p0, int p1, long p2, int p3) {}
        public void onUidGone(int p0, boolean p1) {}
        public void onUidActive(int p0) {}
        public void onUidIdle(int p0, boolean p1) {}
        public void onUidCachedChanged(int p0, boolean p1) {}
        public void onUidProcAdjChanged(int p0) {}
    }
}
