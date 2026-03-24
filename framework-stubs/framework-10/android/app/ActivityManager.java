package android.app;

public class ActivityManager {
    private static java.lang.String TAG;
    @android.annotation.UnsupportedAppUsage
    private final android.content.Context mContext = null;
    private static volatile boolean sSystemReady;
    private static final int FIRST_START_FATAL_ERROR_CODE = -100;
    private static final int LAST_START_FATAL_ERROR_CODE = -1;
    private static final int FIRST_START_SUCCESS_CODE = 0;
    private static final int LAST_START_SUCCESS_CODE = 99;
    private static final int FIRST_START_NON_FATAL_ERROR_CODE = 100;
    private static final int LAST_START_NON_FATAL_ERROR_CODE = 199;
    public static final int INSTR_FLAG_DISABLE_HIDDEN_API_CHECKS = 1;
    public static final int INSTR_FLAG_MOUNT_EXTERNAL_STORAGE_FULL = 2;
    final android.util.ArrayMap<android.app.ActivityManager.OnUidImportanceListener, android.app.ActivityManager.UidObserver> mImportanceListeners = null;
    public static final int BUGREPORT_OPTION_FULL = 0;
    public static final int BUGREPORT_OPTION_INTERACTIVE = 1;
    public static final int BUGREPORT_OPTION_REMOTE = 2;
    public static final int BUGREPORT_OPTION_WEAR = 3;
    public static final int BUGREPORT_OPTION_TELEPHONY = 4;
    public static final int BUGREPORT_OPTION_WIFI = 5;
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
    public static final int INTENT_SENDER_BROADCAST = 1;
    @android.annotation.UnsupportedAppUsage
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
    @android.annotation.UnsupportedAppUsage
    public static final int PROCESS_STATE_TOP = 2;
    public static final int PROCESS_STATE_FOREGROUND_SERVICE_LOCATION = 3;
    public static final int PROCESS_STATE_BOUND_TOP = 4;
    @android.annotation.UnsupportedAppUsage
    public static final int PROCESS_STATE_FOREGROUND_SERVICE = 5;
    @android.annotation.UnsupportedAppUsage
    public static final int PROCESS_STATE_BOUND_FOREGROUND_SERVICE = 6;
    public static final int PROCESS_STATE_IMPORTANT_FOREGROUND = 7;
    @android.annotation.UnsupportedAppUsage
    public static final int PROCESS_STATE_IMPORTANT_BACKGROUND = 8;
    public static final int PROCESS_STATE_TRANSIENT_BACKGROUND = 9;
    public static final int PROCESS_STATE_BACKUP = 10;
    @android.annotation.UnsupportedAppUsage
    public static final int PROCESS_STATE_SERVICE = 11;
    @android.annotation.UnsupportedAppUsage
    public static final int PROCESS_STATE_RECEIVER = 12;
    public static final int PROCESS_STATE_TOP_SLEEPING = 13;
    public static final int PROCESS_STATE_HEAVY_WEIGHT = 14;
    @android.annotation.UnsupportedAppUsage
    public static final int PROCESS_STATE_HOME = 15;
    public static final int PROCESS_STATE_LAST_ACTIVITY = 16;
    @android.annotation.UnsupportedAppUsage
    public static final int PROCESS_STATE_CACHED_ACTIVITY = 17;
    public static final int PROCESS_STATE_CACHED_ACTIVITY_CLIENT = 18;
    public static final int PROCESS_STATE_CACHED_RECENT = 19;
    public static final int PROCESS_STATE_CACHED_EMPTY = 20;
    public static final int PROCESS_STATE_NONEXISTENT = 21;
    public static final int MIN_PROCESS_STATE = 0;
    public static final int MAX_PROCESS_STATE = 21;
    public static final int ASSIST_CONTEXT_BASIC = 0;
    public static final int ASSIST_CONTEXT_FULL = 1;
    public static final int ASSIST_CONTEXT_AUTOFILL = 2;
    public static final int UID_OBSERVER_PROCSTATE = 1;
    public static final int UID_OBSERVER_GONE = 2;
    public static final int UID_OBSERVER_IDLE = 4;
    public static final int UID_OBSERVER_ACTIVE = 8;
    public static final int UID_OBSERVER_CACHED = 16;
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
    private static final boolean DEVELOPMENT_FORCE_LOW_RAM = Boolean.valueOf(false);
    public static final int RECENT_WITH_EXCLUDED = 1;
    public static final int RECENT_IGNORE_UNAVAILABLE = 2;
    public static final int MOVE_TASK_WITH_HOME = 1;
    public static final int MOVE_TASK_NO_USER_ACTION = 2;
    public static final int FLAG_OR_STOPPED = 1;
    public static final int FLAG_AND_LOCKED = 2;
    public static final int FLAG_AND_UNLOCKED = 4;
    public static final int FLAG_AND_UNLOCKING_OR_UNLOCKED = 8;
    @android.annotation.UnsupportedAppUsage
    private static final android.util.Singleton<android.app.IActivityManager> IActivityManagerSingleton = null;
    public static final java.lang.String ACTION_REPORT_HEAP_LIMIT = "android.app.action.REPORT_HEAP_LIMIT";
    public static final int processStateAmToProto(int p0) { return 0; }
    public static final boolean isProcStateBackground(int p0) { return false; }
    public static boolean isForegroundService(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    ActivityManager(android.content.Context p0, android.os.Handler p1) {}
    public static final boolean isStartResultSuccessful(int p0) { return false; }
    public static final boolean isStartResultFatalError(int p0) { return false; }
    public int getFrontActivityScreenCompatMode() { return 0; }
    public void setFrontActivityScreenCompatMode(int p0) {}
    public int getPackageScreenCompatMode(java.lang.String p0) { return 0; }
    public void setPackageScreenCompatMode(java.lang.String p0, int p1) {}
    public boolean getPackageAskScreenCompat(java.lang.String p0) { return false; }
    public void setPackageAskScreenCompat(java.lang.String p0, boolean p1) {}
    public int getMemoryClass() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static int staticGetMemoryClass() { return 0; }
    public int getLargeMemoryClass() { return 0; }
    public static int staticGetLargeMemoryClass() { return 0; }
    public boolean isLowRamDevice() { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isLowRamDeviceStatic() { return false; }
    public static boolean isSmallBatteryDevice() { return false; }
    public static boolean isHighEndGfx() { return false; }
    public long getTotalRam() { return 0L; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static int getMaxRecentTasksStatic() { return 0; }
    @java.lang.Deprecated
    public static int getMaxNumPictureInPictureActions() { return 0; }
    @java.lang.Deprecated
    public java.util.List<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int p0, int p1) throws java.lang.SecurityException { return null; }
    public java.util.List<android.app.ActivityManager.AppTask> getAppTasks() { return null; }
    public android.util.Size getAppTaskThumbnailSize() { return null; }
    private void ensureAppTaskThumbnailSizeLocked() {}
    public int addAppTask(android.app.Activity p0, android.content.Intent p1, android.app.ActivityManager.TaskDescription p2, android.graphics.Bitmap p3) { return 0; }
    @java.lang.Deprecated
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRunningTasks(int p0) throws java.lang.SecurityException { return null; }
    public void moveTaskToFront(int p0, int p1) {}
    public void moveTaskToFront(int p0, int p1, android.os.Bundle p2) {}
    public boolean isActivityStartAllowedOnDisplay(android.content.Context p0, int p1, android.content.Intent p2) { return false; }
    @java.lang.Deprecated
    public java.util.List<android.app.ActivityManager.RunningServiceInfo> getRunningServices(int p0) throws java.lang.SecurityException { return null; }
    public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName p0) throws java.lang.SecurityException { return null; }
    public void getMemoryInfo(android.app.ActivityManager.MemoryInfo p0) {}
    @android.annotation.UnsupportedAppUsage
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
    @android.annotation.SystemApi
    public int getPackageImportance(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public int getUidImportance(int p0) { return 0; }
    @android.annotation.SystemApi
    public void addOnUidImportanceListener(android.app.ActivityManager.OnUidImportanceListener p0, int p1) {}
    @android.annotation.SystemApi
    public void removeOnUidImportanceListener(android.app.ActivityManager.OnUidImportanceListener p0) {}
    public static void getMyMemoryState(android.app.ActivityManager.RunningAppProcessInfo p0) {}
    public android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] p0) { return null; }
    @java.lang.Deprecated
    public void restartPackage(java.lang.String p0) {}
    public void killBackgroundProcesses(java.lang.String p0) {}
    @android.annotation.SystemApi
    public void killUid(int p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    public void forceStopPackageAsUser(java.lang.String p0, int p1) {}
    @android.annotation.SystemApi
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
    @android.annotation.UnsupportedAppUsage
    public static int checkComponentPermission(java.lang.String p0, int p1, int p2, boolean p3) { return 0; }
    public static int checkUidPermission(java.lang.String p0, int p1) { return 0; }
    public static int handleIncomingUser(int p0, int p1, int p2, boolean p3, boolean p4, java.lang.String p5, java.lang.String p6) { return 0; }
    @android.annotation.SystemApi
    public static int getCurrentUser() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean switchUser(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean switchUser(android.os.UserHandle p0) { return false; }
    public static void logoutCurrentUser() {}
    @android.annotation.UnsupportedAppUsage
    public boolean isUserRunning(int p0) { return false; }
    public boolean isVrModePackageEnabled(android.content.ComponentName p0) { return false; }
    public void dumpPackageState(java.io.FileDescriptor p0, java.lang.String p1) {}
    public static void dumpPackageStateStatic(java.io.FileDescriptor p0, java.lang.String p1) {}
    public static boolean isSystemReady() { return false; }
    public static void broadcastStickyIntent(android.content.Intent p0, int p1) {}
    public static void broadcastStickyIntent(android.content.Intent p0, int p1, int p2) {}
    public static void resumeAppSwitches() throws android.os.RemoteException {}
    public static void noteWakeupAlarm(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3, java.lang.String p4) {}
    public static void noteAlarmStart(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3) {}
    public static void noteAlarmFinish(android.app.PendingIntent p0, android.os.WorkSource p1, int p2, java.lang.String p3) {}
    @android.annotation.UnsupportedAppUsage
    public static android.app.IActivityManager getService() { return null; }
    private static android.app.IActivityTaskManager getTaskService() { return null; }
    private static void dumpService(java.io.PrintWriter p0, java.io.FileDescriptor p1, java.lang.String p2, java.lang.String[] p3) {}
    public void setWatchHeapLimit(long p0) {}
    public void clearWatchHeapLimit() {}
    @java.lang.Deprecated
    public boolean isInLockTaskMode() { return false; }
    public int getLockTaskModeState() { return 0; }
    public static void setVrThread(int p0) {}
    @android.annotation.SystemApi
    public static void setPersistentVrThread(int p0) {}
    public void scheduleApplicationInfoChanged(java.util.List<java.lang.String> p0, int p1) {}

    static final class UidObserver extends android.app.IUidObserver.Stub {
        final android.app.ActivityManager.OnUidImportanceListener mListener = null;
        final android.content.Context mContext = null;
        UidObserver(android.app.ActivityManager.OnUidImportanceListener p0, android.content.Context p1) { super(); }
        public void onUidStateChanged(int p0, int p1, long p2) {}
        public void onUidGone(int p0, boolean p1) {}
        public void onUidActive(int p0) {}
        public void onUidIdle(int p0, boolean p1) {}
        public void onUidCachedChanged(int p0, boolean p1) {}
    }

    public static class TaskSnapshot implements android.os.Parcelable {
        private final android.content.ComponentName mTopActivityComponent = null;
        private final android.graphics.GraphicBuffer mSnapshot = null;
        private final int mOrientation = 0;
        private final android.graphics.Rect mContentInsets = null;
        private final boolean mReducedResolution = false;
        private final boolean mIsRealSnapshot = false;
        private final int mWindowingMode = 0;
        private final float mScale = 0.0f;
        private final int mSystemUiVisibility = 0;
        private final boolean mIsTranslucent = false;
        private final android.graphics.ColorSpace mColorSpace = null;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.TaskSnapshot> CREATOR = null;
        public TaskSnapshot(android.content.ComponentName p0, android.graphics.GraphicBuffer p1, android.graphics.ColorSpace p2, int p3, android.graphics.Rect p4, boolean p5, float p6, boolean p7, int p8, int p9, boolean p10) {}
        private TaskSnapshot(android.os.Parcel p0) {}
        public android.content.ComponentName getTopActivityComponent() { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.graphics.GraphicBuffer getSnapshot() { return null; }
        public android.graphics.ColorSpace getColorSpace() { return null; }
        @android.annotation.UnsupportedAppUsage
        public int getOrientation() { return 0; }
        @android.annotation.UnsupportedAppUsage
        public android.graphics.Rect getContentInsets() { return null; }
        @android.annotation.UnsupportedAppUsage
        public boolean isReducedResolution() { return false; }
        @android.annotation.UnsupportedAppUsage
        public boolean isRealSnapshot() { return false; }
        public boolean isTranslucent() { return false; }
        public int getWindowingMode() { return 0; }
        public int getSystemUiVisibility() { return 0; }
        @android.annotation.UnsupportedAppUsage
        public float getScale() { return 0.0f; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static class TaskDescription implements android.os.Parcelable {
        public static final java.lang.String ATTR_TASKDESCRIPTION_PREFIX = "task_description_";
        private static final java.lang.String ATTR_TASKDESCRIPTIONLABEL = "task_description_label";
        private static final java.lang.String ATTR_TASKDESCRIPTIONCOLOR_PRIMARY = "task_description_color";
        private static final java.lang.String ATTR_TASKDESCRIPTIONCOLOR_BACKGROUND = "task_description_colorBackground";
        private static final java.lang.String ATTR_TASKDESCRIPTIONICON_FILENAME = "task_description_icon_filename";
        private static final java.lang.String ATTR_TASKDESCRIPTIONICON_RESOURCE = "task_description_icon_resource";
        private java.lang.String mLabel;
        private android.graphics.Bitmap mIcon;
        private int mIconRes;
        private java.lang.String mIconFilename;
        private int mColorPrimary;
        private int mColorBackground;
        private int mStatusBarColor;
        private int mNavigationBarColor;
        private boolean mEnsureStatusBarContrastWhenTransparent;
        private boolean mEnsureNavigationBarContrastWhenTransparent;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.TaskDescription> CREATOR = null;
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0, android.graphics.Bitmap p1, int p2) {}
        public TaskDescription(java.lang.String p0, int p1, int p2) {}
        @java.lang.Deprecated
        public TaskDescription(java.lang.String p0, android.graphics.Bitmap p1) {}
        public TaskDescription(java.lang.String p0, int p1) {}
        public TaskDescription(java.lang.String p0) {}
        public TaskDescription() {}
        public TaskDescription(java.lang.String p0, android.graphics.Bitmap p1, int p2, java.lang.String p3, int p4, int p5, int p6, int p7, boolean p8, boolean p9) {}
        public TaskDescription(android.app.ActivityManager.TaskDescription p0) {}
        public void copyFrom(android.app.ActivityManager.TaskDescription p0) {}
        public void copyFromPreserveHiddenFields(android.app.ActivityManager.TaskDescription p0) {}
        private TaskDescription(android.os.Parcel p0) {}
        public void setLabel(java.lang.String p0) {}
        public void setPrimaryColor(int p0) {}
        public void setBackgroundColor(int p0) {}
        public void setStatusBarColor(int p0) {}
        public void setNavigationBarColor(int p0) {}
        @android.annotation.UnsupportedAppUsage
        public void setIcon(android.graphics.Bitmap p0) {}
        public void setIcon(int p0) {}
        public void setIconFilename(java.lang.String p0) {}
        public java.lang.String getLabel() { return null; }
        public android.graphics.Bitmap getIcon() { return null; }
        public int getIconResource() { return 0; }
        public java.lang.String getIconFilename() { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.graphics.Bitmap getInMemoryIcon() { return null; }
        @android.annotation.UnsupportedAppUsage
        public static android.graphics.Bitmap loadTaskDescriptionIcon(java.lang.String p0, int p1) { return null; }
        public int getPrimaryColor() { return 0; }
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public int getBackgroundColor() { return 0; }
        public int getStatusBarColor() { return 0; }
        public int getNavigationBarColor() { return 0; }
        public boolean getEnsureStatusBarContrastWhenTransparent() { return false; }
        public void setEnsureStatusBarContrastWhenTransparent(boolean p0) {}
        public boolean getEnsureNavigationBarContrastWhenTransparent() { return false; }
        public void setEnsureNavigationBarContrastWhenTransparent(boolean p0) {}
        public void saveToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
        public void restoreFromXml(java.lang.String p0, java.lang.String p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
    }

    public static class StackInfo implements android.os.Parcelable {
        @android.annotation.UnsupportedAppUsage
        public int stackId;
        @android.annotation.UnsupportedAppUsage
        public android.graphics.Rect bounds;
        @android.annotation.UnsupportedAppUsage
        public int[] taskIds;
        @android.annotation.UnsupportedAppUsage
        public java.lang.String[] taskNames;
        @android.annotation.UnsupportedAppUsage
        public android.graphics.Rect[] taskBounds;
        @android.annotation.UnsupportedAppUsage
        public int[] taskUserIds;
        @android.annotation.UnsupportedAppUsage
        public android.content.ComponentName topActivity;
        @android.annotation.UnsupportedAppUsage
        public int displayId;
        @android.annotation.UnsupportedAppUsage
        public int userId;
        @android.annotation.UnsupportedAppUsage
        public boolean visible;
        @android.annotation.UnsupportedAppUsage
        public int position;
        public final android.content.res.Configuration configuration = null;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.StackInfo> CREATOR = null;
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public StackInfo() {}
        private StackInfo(android.os.Parcel p0) {}
        @android.annotation.UnsupportedAppUsage
        public java.lang.String toString(java.lang.String p0) { return null; }
        public java.lang.String toString() { return null; }
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
        private RunningTaskInfo(android.os.Parcel p0) { super(); }
        public int describeContents() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
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
        private RunningServiceInfo(android.os.Parcel p0) {}
    }

    public static class RunningAppProcessInfo implements android.os.Parcelable {
        public java.lang.String processName;
        public int pid;
        public int uid;
        public java.lang.String[] pkgList;
        public static final int FLAG_CANT_SAVE_STATE = 1;
        @android.annotation.UnsupportedAppUsage
        public static final int FLAG_PERSISTENT = 2;
        @android.annotation.UnsupportedAppUsage
        public static final int FLAG_HAS_ACTIVITIES = 4;
        @android.annotation.UnsupportedAppUsage
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
        @android.annotation.UnsupportedAppUsage
        public int processState;
        public boolean isFocused;
        public long lastActivityTime;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningAppProcessInfo> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public static int procStateToImportance(int p0) { return 0; }
        public static int procStateToImportanceForClient(int p0, android.content.Context p1) { return 0; }
        public static int procStateToImportanceForTargetSdk(int p0, int p1) { return 0; }
        public static int importanceToProcState(int p0) { return 0; }
        public RunningAppProcessInfo() {}
        public RunningAppProcessInfo(java.lang.String p0, int p1, java.lang.String[] p2) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        private RunningAppProcessInfo(android.os.Parcel p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Importance {
        }
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
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.RecentTaskInfo> CREATOR = null;
        public RecentTaskInfo() { super(); }
        private RecentTaskInfo(android.os.Parcel p0) { super(); }
        public int describeContents() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
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
        private ProcessErrorStateInfo(android.os.Parcel p0) {}
    }

    @android.annotation.SystemApi
    public static interface OnUidImportanceListener {
        public void onUidImportance(int p0, int p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MoveTaskFlags {
    }

    public static class MemoryInfo implements android.os.Parcelable {
        public long availMem;
        public long totalMem;
        public long threshold;
        public boolean lowMemory;
        @android.annotation.UnsupportedAppUsage
        public long hiddenAppThreshold;
        @android.annotation.UnsupportedAppUsage
        public long secondaryServerThreshold;
        @android.annotation.UnsupportedAppUsage
        public long visibleAppThreshold;
        @android.annotation.UnsupportedAppUsage
        public long foregroundAppThreshold;
        public static final android.os.Parcelable.Creator<android.app.ActivityManager.MemoryInfo> CREATOR = null;
        public MemoryInfo() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        private MemoryInfo(android.os.Parcel p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BugreportMode {
    }

    public static class AppTask {
        private android.app.IAppTask mAppTaskImpl;
        public AppTask(android.app.IAppTask p0) {}
        public void finishAndRemoveTask() {}
        public android.app.ActivityManager.RecentTaskInfo getTaskInfo() { return null; }
        public void moveToFront() {}
        public void startActivity(android.content.Context p0, android.content.Intent p1, android.os.Bundle p2) {}
        public void setExcludeFromRecents(boolean p0) {}
    }
}
