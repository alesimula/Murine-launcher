package android.app;

public final class ActivityThread extends android.app.ClientTransactionHandler implements android.app.ActivityThreadInternal {
    public static final java.lang.String TAG = "ActivityThread";
    static final boolean localLOGV = false;
    static final boolean DEBUG_MESSAGES = false;
    public static final boolean DEBUG_BROADCAST = false;
    public static final boolean DEBUG_CONFIGURATION = false;
    public static final boolean DEBUG_MEMORY_TRIM = false;
    public static final boolean DEBUG_ORDER = false;
    public static final int SERVICE_DONE_EXECUTING_ANON = 0;
    public static final int SERVICE_DONE_EXECUTING_START = 1;
    public static final int SERVICE_DONE_EXECUTING_STOP = 2;
    public static final int SERVICE_DONE_EXECUTING_REBIND = 3;
    public static final int SERVICE_DONE_EXECUTING_UNBIND = 4;
    public static final long INVALID_PROC_STATE_SEQ = -1L;
    public static final java.lang.String PROC_START_SEQ_IDENT = "seq=";
    static volatile android.content.pm.IPackageManager sPackageManager;
    final android.app.ActivityThread.ApplicationThread mAppThread = null;
    final android.os.Looper mLooper = null;
    final android.app.ActivityThread.H mH = null;
    final java.util.concurrent.Executor mExecutor = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.ActivityClientRecord> mActivities = null;
    final java.util.Map<android.os.IBinder, android.app.servertransaction.DestroyActivityItem> mActivitiesToBeDestroyed = null;
    final java.util.ArrayList<android.app.ActivityThread.ActivityClientRecord> mNewActivities = null;
    int mNumVisibleActivities;
    final java.util.ArrayList<java.lang.ref.WeakReference<android.app.assist.AssistStructure>> mLastAssistStructures = null;
    int mLastReportedDeviceId;
    final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.CreateServiceData> mServicesData = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.Service> mServices = null;
    android.app.ActivityThread.AppBindData mBoundApplication;
    android.app.ActivityThread.Profiler mProfiler;
    int mCurDefaultDisplayDpi;
    boolean mDensityCompatMode;
    android.content.res.Configuration mConfiguration;
    android.app.Application mInitialApplication;
    final java.util.ArrayList<android.app.Application> mAllApplications = null;
    android.app.Instrumentation mInstrumentation;
    java.lang.String mInstrumentationPackageName;
    java.lang.String mInstrumentationAppDir;
    java.lang.String[] mInstrumentationSplitAppDirs;
    java.lang.String mInstrumentationLibDir;
    java.lang.String mInstrumentedAppDir;
    java.lang.String[] mInstrumentedSplitAppDirs;
    java.lang.String mInstrumentedLibDir;
    boolean mInstrumentingWithoutRestart;
    boolean mSystemThread;
    boolean mSomeActivitiesChanged;
    final android.util.ArrayMap<java.lang.String, java.lang.ref.WeakReference<android.app.LoadedApk>> mPackages = null;
    final android.util.ArrayMap<java.lang.String, java.lang.ref.WeakReference<android.app.LoadedApk>> mResourcePackages = null;
    final java.util.ArrayList<android.app.ActivityThread.ActivityClientRecord> mRelaunchingActivities = null;
    android.content.res.Configuration mPendingConfiguration;
    final android.util.ArrayMap<android.app.ActivityThread.ProviderKey, android.app.ActivityThread.ProviderClientRecord> mProviderMap = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.ProviderRefCount> mProviderRefCountMap = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.ProviderClientRecord> mLocalProviders = null;
    final android.util.ArrayMap<android.content.ComponentName, android.app.ActivityThread.ProviderClientRecord> mLocalProvidersByName = null;
    final android.util.ArrayMap<android.app.ActivityThread.ProviderKey, android.app.ActivityThread.ProviderKey> mGetProviderKeys = null;
    final android.util.ArrayMap<android.app.Activity, java.util.ArrayList<android.app.OnActivityPausedListener>> mOnPauseListeners = null;
    final android.app.ActivityThread.GcIdler mGcIdler = null;
    final android.app.ActivityThread.PurgeIdler mPurgeIdler = null;
    boolean mPurgeIdlerScheduled;
    boolean mGcIdlerScheduled;
    static volatile android.os.Handler sMainThreadHandler;
    android.os.Bundle mCoreSettings;
    public static android.app.ActivityThread currentActivityThread() { return null; }
    public static boolean isSystem() { return false; }
    public static java.lang.String currentOpPackageName() { return null; }
    public static android.content.AttributionSource currentAttributionSource() { return null; }
    public static java.lang.String currentPackageName() { return null; }
    public static java.lang.String currentProcessName() { return null; }
    public static android.app.Application currentApplication() { return null; }
    public static android.content.pm.IPackageManager getPackageManager() { return null; }
    public static android.permission.IPermissionManager getPermissionManager() { return null; }
    android.content.res.Resources getTopLevelResources(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String[] p4, android.app.LoadedApk p5, android.content.res.Configuration p6) { return null; }
    public android.os.Handler getHandler() { return null; }
    public final android.app.LoadedApk getPackageInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1, int p2) { return null; }
    public final android.app.LoadedApk getPackageInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1, int p2, int p3) { return null; }
    public final android.app.LoadedApk getPackageInfo(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2) { return null; }
    public final android.app.LoadedApk getPackageInfoNoCheck(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1) { return null; }
    public android.app.LoadedApk getPackageInfoNoCheck(android.content.pm.ApplicationInfo p0) { return null; }
    public final android.app.LoadedApk peekPackageInfo(java.lang.String p0, boolean p1) { return null; }
    ActivityThread() { super(); }
    public android.app.ActivityThread.ApplicationThread getApplicationThread() { return null; }
    public android.app.Instrumentation getInstrumentation() { return null; }
    public boolean isProfiling() { return false; }
    public java.lang.String getProfileFilePath() { return null; }
    public android.os.Looper getLooper() { return null; }
    public java.util.concurrent.Executor getExecutor() { return null; }
    public android.app.Application getApplication() { return null; }
    public java.lang.String getProcessName() { return null; }
    public android.app.ContextImpl getSystemContext() { return null; }
    @android.annotation.NonNull
    public android.app.ContextImpl getSystemUiContext() { return null; }
    @android.annotation.NonNull
    public android.app.ContextImpl getSystemUiContext(int p0) { return null; }
    @android.annotation.Nullable
    public android.app.ContextImpl getSystemUiContextNoCreate() { return null; }
    void onSystemUiContextCleanup(android.app.ContextImpl p0) {}
    public void installSystemApplicationInfo(android.content.pm.ApplicationInfo p0, java.lang.ClassLoader p1) {}
    void scheduleGcIdler() {}
    void unscheduleGcIdler() {}
    void schedulePurgeIdler() {}
    void unschedulePurgeIdler() {}
    void doGcIfNeeded() {}
    void doGcIfNeeded(java.lang.String p0) {}
    static void printRow(java.io.PrintWriter p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void dumpMemInfoTable(java.io.PrintWriter p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, int p6, java.lang.String p7, long p8, long p9, long p10, long p11, long p12, long p13) {}
    public static void dumpMemInfoTable(android.util.proto.ProtoOutputStream p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, long p4, long p5, long p6, long p7, long p8, long p9) {}
    public void registerOnActivityPausedListener(android.app.Activity p0, android.app.OnActivityPausedListener p1) {}
    public void unregisterOnActivityPausedListener(android.app.Activity p0, android.app.OnActivityPausedListener p1) {}
    public final android.content.pm.ActivityInfo resolveActivityInfo(android.content.Intent p0) { return null; }
    public final android.app.Activity startActivityNow(android.app.Activity p0, java.lang.String p1, android.content.Intent p2, android.content.pm.ActivityInfo p3, android.os.IBinder p4, android.os.Bundle p5, android.app.Activity.NonConfigurationInstances p6, android.os.IBinder p7, android.os.IBinder p8) { return null; }
    public final android.app.Activity getActivity(android.os.IBinder p0) { return null; }
    public android.app.ActivityThread.ActivityClientRecord getActivityClient(android.os.IBinder p0) { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public void addConfigurationChangedListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.os.IBinder> p1) {}
    public void removeConfigurationChangedListener(java.util.function.Consumer<android.os.IBinder> p0) {}
    public void updatePendingConfiguration(android.content.res.Configuration p0) {}
    public void updateProcessState(int p0, boolean p1) {}
    public void countLaunchingActivities(int p0) {}
    public void sendActivityResult(android.os.IBinder p0, java.lang.String p1, int p2, int p3, android.content.Intent p4) {}
    android.app.servertransaction.TransactionExecutor getTransactionExecutor() { return null; }
    void sendMessage(int p0, java.lang.Object p1) {}
    final void scheduleContextCleanup(android.app.ContextImpl p0, java.lang.String p1, java.lang.String p2) {}
    public void handleStartActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, android.app.ActivityOptions.SceneTransitionInfo p2) {}
    public android.app.Activity handleLaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, int p2, android.content.Intent p3) { return null; }
    public void handleNewIntent(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<com.android.internal.content.ReferrerIntent> p1) {}
    public void handleRequestAssistContextExtras(android.app.ActivityThread.RequestAssistContextExtras p0) {}
    public void handleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) {}
    public void onNewSceneTransitionInfo(android.os.IBinder p0, android.app.ActivityOptions.SceneTransitionInfo p1) {}
    public void handleInstallProvider(android.content.pm.ProviderInfo p0) {}
    public void handlePictureInPictureRequested(android.app.ActivityThread.ActivityClientRecord p0) {}
    public void handlePictureInPictureStateChanged(android.app.ActivityThread.ActivityClientRecord p0, android.app.PictureInPictureUiState p1) {}
    public void registerSplashScreenManager(android.window.SplashScreen.SplashScreenManagerGlobal p0) {}
    public boolean isHandleSplashScreenExit(android.os.IBinder p0) { return false; }
    public void handleAttachSplashScreenView(android.app.ActivityThread.ActivityClientRecord p0, android.window.SplashScreenView.SplashScreenViewParcelable p1, android.view.SurfaceControl p2) {}
    static void handleAttachAgent(java.lang.String p0, android.app.LoadedApk p1) {}
    static void handleAttachStartupAgents(java.lang.String p0) {}
    public static android.content.Intent getIntentBeingBroadcast() { return null; }
    public boolean performResumeActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2) { return false; }
    static final void cleanUpPendingRemoveWindows(android.app.ActivityThread.ActivityClientRecord p0, boolean p1) {}
    public void handleResumeActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, boolean p3, java.lang.String p4) {}
    public void handleTopResumedActivityChanged(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2) {}
    public void handlePauseActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, boolean p3, android.app.servertransaction.PendingTransactionActions p4, java.lang.String p5) {}
    final void performUserLeavingActivity(android.app.ActivityThread.ActivityClientRecord p0) {}
    final android.os.Bundle performPauseActivity(android.os.IBinder p0, boolean p1, java.lang.String p2, android.app.servertransaction.PendingTransactionActions p3) { return null; }
    final void performStopActivity(android.os.IBinder p0, boolean p1, java.lang.String p2) {}
    public void handleStopActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, boolean p2, java.lang.String p3) {}
    public void reportStop(android.app.servertransaction.PendingTransactionActions p0) {}
    public void performRestartActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1) {}
    public void reportRefresh(android.app.ActivityThread.ActivityClientRecord p0) {}
    public void handleSendResult(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<android.app.ResultInfo> p1, java.lang.String p2) {}
    void performDestroyActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, java.lang.String p3) {}
    public java.util.Map<android.os.IBinder, android.app.servertransaction.DestroyActivityItem> getActivitiesToBeDestroyed() { return null; }
    public void handleDestroyActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, boolean p2, java.lang.String p3) {}
    public android.app.ActivityThread.ActivityClientRecord prepareRelaunchActivity(android.os.IBinder p0, java.util.List<android.app.ResultInfo> p1, java.util.List<com.android.internal.content.ReferrerIntent> p2, int p3, android.util.MergedConfiguration p4, boolean p5, android.window.ActivityWindowInfo p6) { return null; }
    public void handleRelaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1) {}
    void scheduleRelaunchActivity(android.os.IBinder p0) {}
    public void handleRelaunchActivityLocally(android.os.IBinder p0) {}
    public void reportRelaunch(android.app.ActivityThread.ActivityClientRecord p0) {}
    public java.util.ArrayList<android.content.ComponentCallbacks2> collectComponentCallbacks(boolean p0) { return null; }
    public static boolean shouldReportChange(android.content.res.Configuration p0, android.content.res.Configuration p1, android.window.SizeConfigurationBuckets p2, int p3, boolean p4) { return false; }
    public final void applyConfigurationToResources(android.content.res.Configuration p0) {}
    public void handleConfigurationChanged(android.content.res.Configuration p0, int p1) {}
    public void handleWindowContextInfoChanged(android.os.IBinder p0, android.window.WindowContextInfo p1) {}
    public void handleWindowContextWindowRemoval(android.os.IBinder p0) {}
    public void handleSystemApplicationInfoChanged(android.content.pm.ApplicationInfo p0) {}
    public void handleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) {}
    public void updatePendingActivityConfiguration(android.os.IBinder p0, android.content.res.Configuration p1) {}
    public void handleActivityConfigurationChanged(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1, int p2, android.window.ActivityWindowInfo p3) {}
    void handleActivityConfigurationChanged(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1, int p2, android.window.ActivityWindowInfo p3, boolean p4) {}
    final void handleProfilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) {}
    public void stopProfiling() {}
    static void handleDumpHeap(android.app.ActivityThread.DumpHeapData p0) {}
    final void handleDispatchPackageBroadcast(int p0, java.lang.String[] p1) {}
    final void handleLowMemory() {}
    final void finishInstrumentation(int p0, android.os.Bundle p1) {}
    public final android.content.IContentProvider acquireProvider(android.content.Context p0, java.lang.String p1, int p2, boolean p3) { return null; }
    public final android.content.IContentProvider acquireExistingProvider(android.content.Context p0, java.lang.String p1, int p2, boolean p3) { return null; }
    public final boolean releaseProvider(android.content.IContentProvider p0, boolean p1) { return false; }
    final void completeRemoveProvider(android.app.ActivityThread.ProviderRefCount p0) {}
    final void handleUnstableProviderDied(android.os.IBinder p0, boolean p1) {}
    final void handleUnstableProviderDiedLocked(android.os.IBinder p0, boolean p1) {}
    final void appNotRespondingViaProvider(android.os.IBinder p0) {}
    public static android.app.ActivityThread systemMain() { return null; }
    public static void updateHttpProxy(android.content.Context p0) {}
    public final void installSystemProviders(java.util.List<android.content.pm.ProviderInfo> p0) {}
    android.os.Bundle getCoreSettings() { return null; }
    public int getIntCoreSetting(java.lang.String p0, int p1) { return 0; }
    public java.lang.String getStringCoreSetting(java.lang.String p0, java.lang.String p1) { return null; }
    float getFloatCoreSetting(java.lang.String p0, float p1) { return 0.0f; }
    public static void main(java.lang.String[] p0) {}
    public static void initializeMainlineModules() {}
    public static boolean isProtectedComponent(android.content.pm.ActivityInfo p0) { return false; }
    public static boolean isProtectedComponent(android.content.pm.ServiceInfo p0) { return false; }
    public static boolean isProtectedBroadcast(android.content.Intent p0) { return false; }
    public boolean isInDensityCompatMode() { return false; }

    public static final class ActivityClientRecord {
        public android.os.IBinder token;
        public android.os.IBinder assistToken;
        public android.os.IBinder shareableActivityToken;
        @android.annotation.Nullable
        public android.os.IBinder mTaskFragmentToken;
        public android.os.IBinder initialCallerInfoAccessToken;
        int ident;
        android.content.Intent intent;
        java.lang.String referrer;
        com.android.internal.app.IVoiceInteractor voiceInteractor;
        android.os.Bundle state;
        android.os.PersistableBundle persistentState;
        android.app.Activity activity;
        android.view.Window window;
        android.app.Activity parent;
        java.lang.String embeddedID;
        android.app.Activity.NonConfigurationInstances lastNonConfigurationInstances;
        boolean paused;
        boolean stopped;
        boolean hideForNow;
        android.content.res.Configuration createdConfig;
        android.content.res.Configuration overrideConfig;
        android.view.ViewRootImpl.ActivityConfigCallback activityConfigCallback;
        boolean isTopResumedActivity;
        boolean lastReportedTopResumedState;
        android.app.ProfilerInfo profilerInfo;
        android.content.pm.ActivityInfo activityInfo;
        android.content.res.CompatibilityInfo compatInfo;
        public android.app.LoadedApk packageInfo;
        java.util.List<android.app.ResultInfo> pendingResults;
        java.util.List<com.android.internal.content.ReferrerIntent> pendingIntents;
        boolean startsNotResumed;
        public final boolean isForward = false;
        int pendingConfigChanges;
        boolean mIsUserLeaving;
        android.view.Window mPendingRemoveWindow;
        android.view.WindowManager mPendingRemoveWindowManager;
        boolean mPreserveWindow;
        android.app.ActivityOptions.SceneTransitionInfo mSceneTransitionInfo;
        boolean mLaunchedFromBubble;
        int mLastReportedWindowingMode;
        public ActivityClientRecord() {}
        public ActivityClientRecord(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.pm.ActivityInfo p3, android.content.res.Configuration p4, java.lang.String p5, com.android.internal.app.IVoiceInteractor p6, android.os.Bundle p7, android.os.PersistableBundle p8, java.util.List<android.app.ResultInfo> p9, java.util.List<com.android.internal.content.ReferrerIntent> p10, android.app.ActivityOptions.SceneTransitionInfo p11, boolean p12, android.app.ProfilerInfo p13, android.app.ClientTransactionHandler p14, android.os.IBinder p15, android.os.IBinder p16, boolean p17, android.os.IBinder p18, android.os.IBinder p19, android.window.ActivityWindowInfo p20) {}
        public int getLifecycleState() { return 0; }
        public void setState(int p0) {}
        public boolean isPersistable() { return false; }
        public boolean isVisibleFromServer() { return false; }
        @android.annotation.NonNull
        public android.window.ActivityWindowInfo getActivityWindowInfo() { return null; }
        public java.lang.String toString() { return null; }
        public java.lang.String getStateString() { return null; }
    }

    private static class AndroidOs {
        public static void install() {}
        public boolean access(java.lang.String p0, int p1) throws android.system.ErrnoException { return false; }
        public java.io.FileDescriptor open(java.lang.String p0, int p1, int p2) throws android.system.ErrnoException { return null; }
        public android.system.StructStat stat(java.lang.String p0) throws android.system.ErrnoException { return null; }
        public void unlink(java.lang.String p0) throws android.system.ErrnoException {}
        public void remove(java.lang.String p0) throws android.system.ErrnoException {}
        public void rename(java.lang.String p0, java.lang.String p1) throws android.system.ErrnoException {}
    }

    static final class AppBindData {
        android.app.LoadedApk info;
        java.lang.String processName;
        android.content.pm.ApplicationInfo appInfo;
        java.lang.String sdkSandboxClientAppVolumeUuid;
        java.lang.String sdkSandboxClientAppPackage;
        boolean isSdkInSandbox;
        java.util.List<android.content.pm.ProviderInfo> providers;
        android.content.ComponentName instrumentationName;
        android.os.Bundle instrumentationArgs;
        android.app.IInstrumentationWatcher instrumentationWatcher;
        android.app.IUiAutomationConnection instrumentationUiAutomationConnection;
        int debugMode;
        boolean enableBinderTracking;
        boolean trackAllocation;
        boolean restrictedBackupMode;
        boolean persistent;
        android.content.res.Configuration config;
        android.content.res.CompatibilityInfo compatInfo;
        java.lang.String buildSerial;
        android.app.ProfilerInfo initProfilerInfo;
        android.content.AutofillOptions autofillOptions;
        @android.annotation.Nullable
        android.content.ContentCaptureOptions contentCaptureOptions;
        long[] disabledCompatChanges;
        long[] mLoggableCompatChanges;
        android.os.SharedMemory mSerializedSystemFontMap;
        long startRequestedElapsedTime;
        long startRequestedUptime;
        AppBindData() {}
        public java.lang.String toString() { return null; }
    }

    private class ApplicationThread extends android.app.IApplicationThread.Stub {
        public final void scheduleReceiver(android.content.Intent p0, android.content.pm.ActivityInfo p1, android.content.res.CompatibilityInfo p2, int p3, java.lang.String p4, android.os.Bundle p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) {}
        public final void scheduleReceiverList(java.util.List<android.app.ReceiverInfo> p0) throws android.os.RemoteException {}
        public final void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo p0, int p1, int p2, int p3) {}
        public final void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo p0, int p1) {}
        public final void scheduleCreateService(android.os.IBinder p0, android.content.pm.ServiceInfo p1, android.content.res.CompatibilityInfo p2, int p3) {}
        public final void scheduleBindService(android.os.IBinder p0, android.content.Intent p1, boolean p2, int p3, long p4) {}
        public final void scheduleUnbindService(android.os.IBinder p0, android.content.Intent p1) {}
        public final void scheduleServiceArgs(android.os.IBinder p0, android.content.pm.ParceledListSlice p1) {}
        public final void scheduleStopService(android.os.IBinder p0) {}
        public final void scheduleTimeoutService(android.os.IBinder p0, int p1) {}
        public final void schedulePing(android.os.RemoteCallback p0) {}
        public final void scheduleTimeoutServiceForType(android.os.IBinder p0, int p1, int p2) {}
        public final void bindApplication(java.lang.String p0, android.content.pm.ApplicationInfo p1, java.lang.String p2, java.lang.String p3, boolean p4, android.content.pm.ProviderInfoList p5, android.content.ComponentName p6, android.app.ProfilerInfo p7, android.os.Bundle p8, android.app.IInstrumentationWatcher p9, android.app.IUiAutomationConnection p10, int p11, boolean p12, boolean p13, boolean p14, boolean p15, android.content.res.Configuration p16, android.content.res.CompatibilityInfo p17, java.util.Map p18, android.os.Bundle p19, java.lang.String p20, android.content.AutofillOptions p21, android.content.ContentCaptureOptions p22, long[] p23, long[] p24, android.os.SharedMemory p25, long p26, long p27) {}
        public final void runIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) {}
        public final void scheduleExit() {}
        public final void scheduleSuicide() {}
        public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) {}
        public void updateTimeZone() {}
        public void clearDnsCache() {}
        public void updateHttpProxy() {}
        public void processInBackground() {}
        public void dumpService(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) {}
        public void scheduleRegisteredReceiver(android.content.IIntentReceiver p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) throws android.os.RemoteException {}
        public void scheduleLowMemory() {}
        public void profilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) {}
        public void dumpHeap(boolean p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4, android.os.ParcelFileDescriptor p5, android.os.RemoteCallback p6) {}
        public void attachAgent(java.lang.String p0) {}
        public void attachStartupAgents(java.lang.String p0) {}
        public void setSchedulingGroup(int p0) {}
        public void dispatchPackageBroadcast(int p0, java.lang.String[] p1) {}
        public void scheduleCrash(java.lang.String p0, int p1, android.os.Bundle p2) {}
        public void dumpResources(android.os.ParcelFileDescriptor p0, android.os.RemoteCallback p1) {}
        public void dumpActivity(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String p2, java.lang.String[] p3) {}
        public void dumpProvider(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) {}
        public void dumpMemInfo(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, java.lang.String[] p8) {}
        public void dumpMemInfoProto(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String[] p6) {}
        public void dumpGfxInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
        public void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
        public void dumpDbInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
        public void unstableProviderDied(android.os.IBinder p0) {}
        public void requestAssistContextExtras(android.os.IBinder p0, android.os.IBinder p1, int p2, int p3, int p4) {}
        public void setCoreSettings(android.os.Bundle p0) {}
        public void updatePackageCompatibilityInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1) {}
        public void scheduleTrimMemory(int p0) {}
        public void scheduleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) {}
        public void scheduleOnNewSceneTransitionInfo(android.os.IBinder p0, android.app.ActivityOptions.SceneTransitionInfo p1) {}
        public void setProcessState(int p0) {}
        public void setNetworkBlockSeq(long p0) {}
        public void scheduleInstallProvider(android.content.pm.ProviderInfo p0) {}
        public final void updateTimePrefs(int p0) {}
        public void scheduleEnterAnimationComplete(android.os.IBinder p0) {}
        public void notifyCleartextNetwork(byte[] p0) {}
        public void startBinderTracking() {}
        public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) {}
        public void scheduleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) throws android.os.RemoteException {}
        public void handleTrustStorageUpdate() {}
        public void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) throws android.os.RemoteException {}
        public void scheduleTaskFragmentTransaction(android.window.ITaskFragmentOrganizer p0, android.window.TaskFragmentTransaction p1) throws android.os.RemoteException {}
        public void requestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) {}
        public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) {}
        public void notifyContentProviderPublishStatus(android.app.ContentProviderHolder p0, java.lang.String p1, int p2, boolean p3) {}
        public void instrumentWithoutRestart(android.content.ComponentName p0, android.os.Bundle p1, android.app.IInstrumentationWatcher p2, android.app.IUiAutomationConnection p3, android.content.pm.ApplicationInfo p4) {}
        public void updateUiTranslationState(android.os.IBinder p0, int p1, android.view.translation.TranslationSpec p2, android.view.translation.TranslationSpec p3, java.util.List<android.view.autofill.AutofillId> p4, android.view.translation.UiTranslationSpec p5) {}
    }

    static final class BindServiceData {
        android.os.IBinder token;
        android.content.Intent intent;
        boolean rebind;
        long bindSeq;
        BindServiceData() {}
        public java.lang.String toString() { return null; }
    }

    static final class ContextCleanupInfo {
        android.app.ContextImpl context;
        java.lang.String what;
        java.lang.String who;
        ContextCleanupInfo() {}
    }

    static final class CreateBackupAgentData {
        android.content.pm.ApplicationInfo appInfo;
        int backupMode;
        int userId;
        int backupDestination;
        CreateBackupAgentData() {}
        public java.lang.String toString() { return null; }
    }

    static final class CreateServiceData {
        android.os.IBinder token;
        android.content.pm.ServiceInfo info;
        android.content.res.CompatibilityInfo compatInfo;
        android.content.Intent intent;
        CreateServiceData() {}
        public java.lang.String toString() { return null; }
    }

    static final class DumpComponentInfo {
        android.os.ParcelFileDescriptor fd;
        android.os.IBinder token;
        java.lang.String prefix;
        java.lang.String[] args;
        DumpComponentInfo() {}
    }

    static final class DumpHeapData {
        public boolean managed;
        public boolean mallocInfo;
        public boolean runGc;
        public java.lang.String dumpBitmaps;
        java.lang.String path;
        android.os.ParcelFileDescriptor fd;
        android.os.RemoteCallback finishCallback;
        DumpHeapData() {}
    }

    static final class DumpResourcesData {
        public android.os.ParcelFileDescriptor fd;
        public android.os.RemoteCallback finishCallback;
        DumpResourcesData() {}
    }

    final class GcIdler implements android.os.MessageQueue.IdleHandler {
        GcIdler(android.app.ActivityThread p0) {}
        public final boolean queueIdle() { return false; }
    }

    class H extends android.os.Handler {
        public static final int BIND_APPLICATION = 110;
        public static final int EXIT_APPLICATION = 111;
        public static final int RECEIVER = 113;
        public static final int CREATE_SERVICE = 114;
        public static final int SERVICE_ARGS = 115;
        public static final int STOP_SERVICE = 116;
        public static final int CONFIGURATION_CHANGED = 118;
        public static final int CLEAN_UP_CONTEXT = 119;
        public static final int GC_WHEN_IDLE = 120;
        public static final int BIND_SERVICE = 121;
        public static final int UNBIND_SERVICE = 122;
        public static final int DUMP_SERVICE = 123;
        public static final int LOW_MEMORY = 124;
        public static final int PROFILER_CONTROL = 127;
        public static final int CREATE_BACKUP_AGENT = 128;
        public static final int DESTROY_BACKUP_AGENT = 129;
        public static final int SUICIDE = 130;
        public static final int REMOVE_PROVIDER = 131;
        public static final int DISPATCH_PACKAGE_BROADCAST = 133;
        public static final int SCHEDULE_CRASH = 134;
        public static final int DUMP_HEAP = 135;
        public static final int DUMP_ACTIVITY = 136;
        public static final int SLEEPING = 137;
        public static final int SET_CORE_SETTINGS = 138;
        public static final int UPDATE_PACKAGE_COMPATIBILITY_INFO = 139;
        public static final int DUMP_PROVIDER = 141;
        public static final int UNSTABLE_PROVIDER_DIED = 142;
        public static final int REQUEST_ASSIST_CONTEXT_EXTRAS = 143;
        public static final int TRANSLUCENT_CONVERSION_COMPLETE = 144;
        public static final int INSTALL_PROVIDER = 145;
        public static final int ON_NEW_SCENE_TRANSITION_INFO = 146;
        public static final int ENTER_ANIMATION_COMPLETE = 149;
        public static final int START_BINDER_TRACKING = 150;
        public static final int STOP_BINDER_TRACKING_AND_DUMP = 151;
        public static final int LOCAL_VOICE_INTERACTION_STARTED = 154;
        public static final int ATTACH_AGENT = 155;
        public static final int APPLICATION_INFO_CHANGED = 156;
        public static final int RUN_ISOLATED_ENTRY_POINT = 158;
        public static final int EXECUTE_TRANSACTION = 159;
        public static final int RELAUNCH_ACTIVITY = 160;
        public static final int PURGE_RESOURCES = 161;
        public static final int ATTACH_STARTUP_AGENTS = 162;
        public static final int UPDATE_UI_TRANSLATION_STATE = 163;
        public static final int SET_CONTENT_CAPTURE_OPTIONS_CALLBACK = 164;
        public static final int DUMP_GFXINFO = 165;
        public static final int DUMP_RESOURCES = 166;
        public static final int TIMEOUT_SERVICE = 167;
        public static final int PING = 168;
        public static final int INSTRUMENT_WITHOUT_RESTART = 170;
        public static final int FINISH_INSTRUMENTATION_WITHOUT_RESTART = 171;
        public static final int TIMEOUT_SERVICE_FOR_TYPE = 172;
        H(android.app.ActivityThread p0) { super(); }
        java.lang.String codeToString(int p0) { return null; }
        public void handleMessage(android.os.Message p0) {}
    }

    private class Idler implements android.os.MessageQueue.IdleHandler {
        public final boolean queueIdle() { return false; }
    }

    static final class Profiler {
        java.lang.String profileFile;
        android.os.ParcelFileDescriptor profileFd;
        int samplingInterval;
        boolean autoStopProfiler;
        boolean streamingOutput;
        int mClockType;
        int mProfilerOutputVersion;
        boolean profiling;
        boolean handlingProfiling;
        Profiler() {}
        public void setProfiler(android.app.ProfilerInfo p0) {}
        public void startProfiling() {}
        public void stopProfiling() {}
    }

    static final class ProviderClientRecord {
        final java.lang.String[] mNames = null;
        final android.content.IContentProvider mProvider = null;
        final android.content.ContentProvider mLocalProvider = null;
        final android.app.ContentProviderHolder mHolder = null;
        ProviderClientRecord(java.lang.String[] p0, android.content.IContentProvider p1, android.content.ContentProvider p2, android.app.ContentProviderHolder p3) {}
    }

    private static final class ProviderKey {
        final java.lang.String authority = null;
        final int userId = 0;
        android.app.ContentProviderHolder mHolder;
        final java.lang.Object mLock = null;
        public ProviderKey(java.lang.String p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static final class ProviderRefCount {
        public final android.app.ContentProviderHolder holder = null;
        public final android.app.ActivityThread.ProviderClientRecord client = null;
        public int stableCount;
        public int unstableCount;
        public boolean removePending;
        ProviderRefCount(android.app.ContentProviderHolder p0, android.app.ActivityThread.ProviderClientRecord p1, int p2, int p3) {}
    }

    final class PurgeIdler implements android.os.MessageQueue.IdleHandler {
        PurgeIdler(android.app.ActivityThread p0) {}
        public boolean queueIdle() { return false; }
    }

    static final class ReceiverData extends android.content.BroadcastReceiver.PendingResult {
        final android.content.Intent intent = null;
        android.content.pm.ActivityInfo info;
        android.content.res.CompatibilityInfo compatInfo;
        public ReceiverData(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, boolean p6, android.os.IBinder p7, int p8, int p9, java.lang.String p10) { super(0, (java.lang.String)null, (android.os.Bundle)null, 0, false, false, (android.os.IBinder)null, 0, 0); }
        public java.lang.String toString() { return null; }
    }

    static final class ReceiverList {
        java.util.List<android.app.ReceiverInfo> receivers;
        int index;
        ReceiverList() {}
    }

    static final class RequestAssistContextExtras {
        android.os.IBinder activityToken;
        android.os.IBinder requestToken;
        int requestType;
        int sessionId;
        int flags;
        RequestAssistContextExtras() {}
    }

    private static final class SafeCancellationTransport extends android.os.ICancellationSignal.Stub {
        SafeCancellationTransport(android.app.ActivityThread p0, android.os.CancellationSignal p1) { super(); }
        public void cancel() {}
    }

    static final class ServiceArgsData {
        android.os.IBinder token;
        boolean taskRemoved;
        int startId;
        int flags;
        android.content.Intent args;
        ServiceArgsData() {}
        public java.lang.String toString() { return null; }
    }

    static final class UpdateCompatibilityData {
        java.lang.String pkg;
        android.content.res.CompatibilityInfo info;
        UpdateCompatibilityData() {}
    }
}
