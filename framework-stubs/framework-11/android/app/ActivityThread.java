package android.app;

public final class ActivityThread extends android.app.ClientTransactionHandler {
    public static final java.lang.String TAG = "ActivityThread";
    private static final android.graphics.Bitmap.Config THUMBNAIL_FORMAT = null;
    static final boolean localLOGV = false;
    static final boolean DEBUG_MESSAGES = false;
    public static final boolean DEBUG_BROADCAST = false;
    private static final boolean DEBUG_RESULTS = false;
    private static final boolean DEBUG_BACKUP = false;
    public static final boolean DEBUG_CONFIGURATION = false;
    private static final boolean DEBUG_SERVICE = false;
    public static final boolean DEBUG_MEMORY_TRIM = false;
    private static final boolean DEBUG_PROVIDER = false;
    public static final boolean DEBUG_ORDER = false;
    private static final long MIN_TIME_BETWEEN_GCS = 5000L;
    private static final long PENDING_TOP_PROCESS_STATE_TIMEOUT = 1000L;
    private static final long CONTENT_PROVIDER_RETAIN_TIME = 1000L;
    private static final int SQLITE_MEM_RELEASED_EVENT_LOG_TAG = 75003;
    public static final int SERVICE_DONE_EXECUTING_ANON = 0;
    public static final int SERVICE_DONE_EXECUTING_START = 1;
    public static final int SERVICE_DONE_EXECUTING_STOP = 2;
    private static final boolean REPORT_TO_ACTIVITY = true;
    private static final int VM_PROCESS_STATE_JANK_PERCEPTIBLE = 0;
    private static final int VM_PROCESS_STATE_JANK_IMPERCEPTIBLE = 1;
    public static final long INVALID_PROC_STATE_SEQ = -1L;
    public static final java.lang.String PROC_START_SEQ_IDENT = "seq=";
    private final java.lang.Object mNetworkPolicyLock = null;
    private long mNetworkBlockSeq;
    private android.app.ContextImpl mSystemContext;
    private android.app.ContextImpl mSystemUiContext;
    static volatile android.content.pm.IPackageManager sPackageManager;
    private static volatile android.permission.IPermissionManager sPermissionManager;
    final android.app.ActivityThread.ApplicationThread mAppThread = null;
    final android.os.Looper mLooper = null;
    final android.app.ActivityThread.H mH = null;
    final java.util.concurrent.Executor mExecutor = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.ActivityClientRecord> mActivities = null;
    final java.util.Map<android.os.IBinder, android.app.servertransaction.ClientTransactionItem> mActivitiesToBeDestroyed = null;
    android.app.ActivityThread.ActivityClientRecord mNewActivities;
    int mNumVisibleActivities;
    private final java.util.concurrent.atomic.AtomicInteger mNumLaunchingActivities = null;
    private int mLastProcessState;
    private int mPendingProcessState;
    java.util.ArrayList<java.lang.ref.WeakReference<android.app.assist.AssistStructure>> mLastAssistStructures;
    private int mLastSessionId;
    final android.util.ArrayMap<android.os.IBinder, android.app.Service> mServices = null;
    android.app.ActivityThread.AppBindData mBoundApplication;
    android.app.ActivityThread.Profiler mProfiler;
    int mCurDefaultDisplayDpi;
    boolean mDensityCompatMode;
    android.content.res.Configuration mConfiguration;
    android.content.res.Configuration mCompatConfiguration;
    android.app.Application mInitialApplication;
    final java.util.ArrayList<android.app.Application> mAllApplications = null;
    private final android.util.SparseArray<android.util.ArrayMap<java.lang.String, android.app.backup.BackupAgent>> mBackupAgentsByUser = null;
    private static volatile android.app.ActivityThread sCurrentActivityThread;
    android.app.Instrumentation mInstrumentation;
    java.lang.String mInstrumentationPackageName;
    java.lang.String mInstrumentationAppDir;
    java.lang.String[] mInstrumentationSplitAppDirs;
    java.lang.String mInstrumentationLibDir;
    java.lang.String mInstrumentedAppDir;
    java.lang.String[] mInstrumentedSplitAppDirs;
    java.lang.String mInstrumentedLibDir;
    boolean mSystemThread;
    boolean mSomeActivitiesChanged;
    boolean mHiddenApiWarningShown;
    final android.util.ArrayMap<java.lang.String, java.lang.ref.WeakReference<android.app.LoadedApk>> mPackages = null;
    final android.util.ArrayMap<java.lang.String, java.lang.ref.WeakReference<android.app.LoadedApk>> mResourcePackages = null;
    final java.util.ArrayList<android.app.ActivityThread.ActivityClientRecord> mRelaunchingActivities = null;
    android.content.res.Configuration mPendingConfiguration;
    private final android.app.servertransaction.TransactionExecutor mTransactionExecutor = null;
    private final android.app.ResourcesManager mResourcesManager = null;
    private java.util.ArrayList<android.util.Pair<android.os.IBinder, java.util.function.Consumer<android.view.DisplayAdjustments>>> mActiveRotationAdjustments;
    private java.util.Map<android.app.ActivityThread.SafeCancellationTransport, android.os.CancellationSignal> mRemoteCancellations;
    private final java.util.Map<android.os.IBinder, java.lang.Integer> mLastReportedWindowingMode = null;
    final android.util.ArrayMap<android.app.ActivityThread.ProviderKey, android.app.ActivityThread.ProviderClientRecord> mProviderMap = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.ProviderRefCount> mProviderRefCountMap = null;
    final android.util.ArrayMap<android.os.IBinder, android.app.ActivityThread.ProviderClientRecord> mLocalProviders = null;
    final android.util.ArrayMap<android.content.ComponentName, android.app.ActivityThread.ProviderClientRecord> mLocalProvidersByName = null;
    final android.util.ArrayMap<android.app.ActivityThread.ProviderKey, java.lang.Object> mGetProviderLocks = null;
    final android.util.ArrayMap<android.app.Activity, java.util.ArrayList<android.app.OnActivityPausedListener>> mOnPauseListeners = null;
    final android.app.ActivityThread.GcIdler mGcIdler = null;
    final android.app.ActivityThread.PurgeIdler mPurgeIdler = null;
    boolean mPurgeIdlerScheduled;
    boolean mGcIdlerScheduled;
    static volatile android.os.Handler sMainThreadHandler;
    android.os.Bundle mCoreSettings;
    boolean mHasImeComponent;
    private android.content.res.Configuration mMainThreadConfig;
    private static final java.lang.String HEAP_FULL_COLUMN = "%13s %8s %8s %8s %8s %8s %8s %8s %8s %8s %8s %8s";
    private static final java.lang.String HEAP_COLUMN = "%13s %8s %8s %8s %8s %8s %8s %8s %8s";
    private static final java.lang.String ONE_COUNT_COLUMN = "%21s %8d";
    private static final java.lang.String TWO_COUNT_COLUMNS = "%21s %8d %21s %8d";
    private static final java.lang.String THREE_COUNT_COLUMNS = "%21s %8d %21s %8s %21s %8d";
    private static final java.lang.String TWO_COUNT_COLUMN_HEADER = "%21s %8s %21s %8s";
    private static final java.lang.String ONE_ALT_COUNT_COLUMN = "%21s %8s %21s %8d";
    private static final int ACTIVITY_THREAD_CHECKIN_VERSION = 4;
    private static final java.lang.ThreadLocal<android.content.Intent> sCurrentBroadcastIntent = null;
    private android.app.ActivityThread.SafeCancellationTransport createSafeCancellationTransport(android.os.CancellationSignal p0) { return null; }
    private android.os.CancellationSignal removeSafeCancellationTransport(android.app.ActivityThread.SafeCancellationTransport p0) { return null; }
    public static android.app.ActivityThread currentActivityThread() { return null; }
    public static boolean isSystem() { return false; }
    public static java.lang.String currentOpPackageName() { return null; }
    public static java.lang.String currentPackageName() { return null; }
    public static java.lang.String currentProcessName() { return null; }
    public static android.app.Application currentApplication() { return null; }
    public static android.content.pm.IPackageManager getPackageManager() { return null; }
    public static android.permission.IPermissionManager getPermissionManager() { return null; }
    android.content.res.Configuration applyConfigCompatMainThread(int p0, android.content.res.Configuration p1, android.content.res.CompatibilityInfo p2) { return null; }
    android.content.res.Resources getTopLevelResources(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String[] p3, int p4, android.app.LoadedApk p5) { return null; }
    final android.os.Handler getHandler() { return null; }
    public final android.app.LoadedApk getPackageInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1, int p2) { return null; }
    public final android.app.LoadedApk getPackageInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1, int p2, int p3) { return null; }
    public final android.app.LoadedApk getPackageInfo(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2) { return null; }
    public final android.app.LoadedApk getPackageInfoNoCheck(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1) { return null; }
    public final android.app.LoadedApk peekPackageInfo(java.lang.String p0, boolean p1) { return null; }
    private android.app.LoadedApk getPackageInfo(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, java.lang.ClassLoader p2, boolean p3, boolean p4, boolean p5) { return null; }
    private static boolean isLoadedApkResourceDirsUpToDate(android.app.LoadedApk p0, android.content.pm.ApplicationInfo p1) { return false; }
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
    public android.app.ContextImpl getSystemUiContext() { return null; }
    public android.app.ContextImpl createSystemUiContext(int p0) { return null; }
    public void installSystemApplicationInfo(android.content.pm.ApplicationInfo p0, java.lang.ClassLoader p1) {}
    void scheduleGcIdler() {}
    void unscheduleGcIdler() {}
    void schedulePurgeIdler() {}
    void unschedulePurgeIdler() {}
    void doGcIfNeeded() {}
    void doGcIfNeeded(java.lang.String p0) {}
    static void printRow(java.io.PrintWriter p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void dumpMemInfoTable(java.io.PrintWriter p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, int p6, java.lang.String p7, long p8, long p9, long p10, long p11, long p12, long p13) {}
    private static void dumpMemoryInfo(android.util.proto.ProtoOutputStream p0, long p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, int p8, boolean p9, int p10, int p11, int p12) {}
    public static void dumpMemInfoTable(android.util.proto.ProtoOutputStream p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, long p4, long p5, long p6, long p7, long p8, long p9) {}
    public void registerOnActivityPausedListener(android.app.Activity p0, android.app.OnActivityPausedListener p1) {}
    public void unregisterOnActivityPausedListener(android.app.Activity p0, android.app.OnActivityPausedListener p1) {}
    public final android.content.pm.ActivityInfo resolveActivityInfo(android.content.Intent p0) { return null; }
    public final android.app.Activity startActivityNow(android.app.Activity p0, java.lang.String p1, android.content.Intent p2, android.content.pm.ActivityInfo p3, android.os.IBinder p4, android.os.Bundle p5, android.app.Activity.NonConfigurationInstances p6, android.os.IBinder p7) { return null; }
    public final android.app.Activity getActivity(android.os.IBinder p0) { return null; }
    public android.app.ActivityThread.ActivityClientRecord getActivityClient(android.os.IBinder p0) { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public void updatePendingConfiguration(android.content.res.Configuration p0) {}
    public void updateProcessState(int p0, boolean p1) {}
    private void updateVmProcessState(int p0) {}
    private void applyPendingProcessState() {}
    public void countLaunchingActivities(int p0) {}
    public final void sendActivityResult(android.os.IBinder p0, java.lang.String p1, int p2, int p3, android.content.Intent p4) {}
    android.app.servertransaction.TransactionExecutor getTransactionExecutor() { return null; }
    void sendMessage(int p0, java.lang.Object p1) {}
    private void sendMessage(int p0, java.lang.Object p1, int p2) {}
    private void sendMessage(int p0, java.lang.Object p1, int p2, int p3) {}
    private void sendMessage(int p0, java.lang.Object p1, int p2, int p3, boolean p4) {}
    private void sendMessage(int p0, java.lang.Object p1, int p2, int p3, int p4) {}
    final void scheduleContextCleanup(android.app.ContextImpl p0, java.lang.String p1, java.lang.String p2) {}
    public void handleFixedRotationAdjustments(android.os.IBinder p0, android.view.DisplayAdjustments.FixedRotationAdjustments p1) {}
    private void overrideApplicationDisplayAdjustments(android.os.IBinder p0, java.util.function.Consumer<android.view.DisplayAdjustments> p1) {}
    private android.app.Activity performLaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.content.Intent p1) { return null; }
    public void handleStartActivity(android.os.IBinder p0, android.app.servertransaction.PendingTransactionActions p1) {}
    private void checkAndBlockForNetworkAccess() {}
    private android.app.ContextImpl createBaseContextForActivity(android.app.ActivityThread.ActivityClientRecord p0) { return null; }
    public android.app.Activity handleLaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1, android.content.Intent p2) { return null; }
    private void reportSizeConfigurations(android.app.ActivityThread.ActivityClientRecord p0) {}
    private void deliverNewIntents(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<com.android.internal.content.ReferrerIntent> p1) {}
    public void handleNewIntent(android.os.IBinder p0, java.util.List<com.android.internal.content.ReferrerIntent> p1) {}
    public void handleRequestAssistContextExtras(android.app.ActivityThread.RequestAssistContextExtras p0) {}
    private void handleRequestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.CancellationSignal p2, android.os.RemoteCallback p3) {}
    private void handlePerformDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3, android.os.RemoteCallback p4) {}
    public void handleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) {}
    public void onNewActivityOptions(android.os.IBinder p0, android.app.ActivityOptions p1) {}
    public void handleInstallProvider(android.content.pm.ProviderInfo p0) {}
    private void handleEnterAnimationComplete(android.os.IBinder p0) {}
    private void handleStartBinderTracking() {}
    private void handleStopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) {}
    public void handlePictureInPictureRequested(android.os.IBinder p0) {}
    private void schedulePauseWithUserLeaveHintAndReturnToCurrentState(android.app.ActivityThread.ActivityClientRecord p0) {}
    private void schedulePauseWithUserLeavingHint(android.app.ActivityThread.ActivityClientRecord p0) {}
    private void scheduleResume(android.app.ActivityThread.ActivityClientRecord p0) {}
    private void handleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) {}
    private static boolean attemptAttachAgent(java.lang.String p0, java.lang.ClassLoader p1) { return false; }
    static void handleAttachAgent(java.lang.String p0, android.app.LoadedApk p1) {}
    static void handleAttachStartupAgents(java.lang.String p0) {}
    public static android.content.Intent getIntentBeingBroadcast() { return null; }
    private void handleReceiver(android.app.ActivityThread.ReceiverData p0) {}
    private void handleCreateBackupAgent(android.app.ActivityThread.CreateBackupAgentData p0) {}
    private void handleDestroyBackupAgent(android.app.ActivityThread.CreateBackupAgentData p0) {}
    private android.util.ArrayMap<java.lang.String, android.app.backup.BackupAgent> getBackupAgentsForUser(int p0) { return null; }
    private void handleCreateService(android.app.ActivityThread.CreateServiceData p0) {}
    private void handleBindService(android.app.ActivityThread.BindServiceData p0) {}
    private void handleUnbindService(android.app.ActivityThread.BindServiceData p0) {}
    private void handleDumpService(android.app.ActivityThread.DumpComponentInfo p0) {}
    private void handleDumpActivity(android.app.ActivityThread.DumpComponentInfo p0) {}
    private void handleDumpProvider(android.app.ActivityThread.DumpComponentInfo p0) {}
    private void handleServiceArgs(android.app.ActivityThread.ServiceArgsData p0) {}
    private void handleStopService(android.os.IBinder p0) {}
    public android.app.ActivityThread.ActivityClientRecord performResumeActivity(android.os.IBinder p0, boolean p1, java.lang.String p2) { return null; }
    static final void cleanUpPendingRemoveWindows(android.app.ActivityThread.ActivityClientRecord p0, boolean p1) {}
    public void handleResumeActivity(android.os.IBinder p0, boolean p1, boolean p2, java.lang.String p3) {}
    public void handleTopResumedActivityChanged(android.os.IBinder p0, boolean p1, java.lang.String p2) {}
    private void reportTopResumedActivityChanged(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2) {}
    public void handlePauseActivity(android.os.IBinder p0, boolean p1, boolean p2, int p3, android.app.servertransaction.PendingTransactionActions p4, java.lang.String p5) {}
    final void performUserLeavingActivity(android.app.ActivityThread.ActivityClientRecord p0) {}
    final android.os.Bundle performPauseActivity(android.os.IBinder p0, boolean p1, java.lang.String p2, android.app.servertransaction.PendingTransactionActions p3) { return null; }
    private android.os.Bundle performPauseActivity(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2, android.app.servertransaction.PendingTransactionActions p3) { return null; }
    private void performPauseActivityIfNeeded(android.app.ActivityThread.ActivityClientRecord p0, java.lang.String p1) {}
    final void performStopActivity(android.os.IBinder p0, boolean p1, java.lang.String p2) {}
    private void performStopActivityInner(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions.StopInfo p1, boolean p2, boolean p3, java.lang.String p4) {}
    private void callActivityOnStop(android.app.ActivityThread.ActivityClientRecord p0, boolean p1, java.lang.String p2) {}
    private void updateVisibility(android.app.ActivityThread.ActivityClientRecord p0, boolean p1) {}
    public void handleStopActivity(android.os.IBinder p0, int p1, android.app.servertransaction.PendingTransactionActions p2, boolean p3, java.lang.String p4) {}
    public void reportStop(android.app.servertransaction.PendingTransactionActions p0) {}
    public void performRestartActivity(android.os.IBinder p0, boolean p1) {}
    private void handleSetCoreSettings(android.os.Bundle p0) {}
    private void onCoreSettingsChange() {}
    private boolean updateDebugViewAttributeState() { return false; }
    private void relaunchAllActivities(boolean p0) {}
    private void handleUpdatePackageCompatibilityInfo(android.app.ActivityThread.UpdateCompatibilityData p0) {}
    private void deliverResults(android.app.ActivityThread.ActivityClientRecord p0, java.util.List<android.app.ResultInfo> p1, java.lang.String p2) {}
    public void handleSendResult(android.os.IBinder p0, java.util.List<android.app.ResultInfo> p1, java.lang.String p2) {}
    android.app.ActivityThread.ActivityClientRecord performDestroyActivity(android.os.IBinder p0, boolean p1, int p2, boolean p3, java.lang.String p4) { return null; }
    private static java.lang.String safeToComponentShortString(android.content.Intent p0) { return null; }
    public java.util.Map<android.os.IBinder, android.app.servertransaction.ClientTransactionItem> getActivitiesToBeDestroyed() { return null; }
    public void handleDestroyActivity(android.os.IBinder p0, boolean p1, int p2, boolean p3, java.lang.String p4) {}
    public android.app.ActivityThread.ActivityClientRecord prepareRelaunchActivity(android.os.IBinder p0, java.util.List<android.app.ResultInfo> p1, java.util.List<com.android.internal.content.ReferrerIntent> p2, int p3, android.util.MergedConfiguration p4, boolean p5) { return null; }
    public void handleRelaunchActivity(android.app.ActivityThread.ActivityClientRecord p0, android.app.servertransaction.PendingTransactionActions p1) {}
    void scheduleRelaunchActivity(android.os.IBinder p0) {}
    private void handleRelaunchActivityLocally(android.os.IBinder p0) {}
    private void handleRelaunchActivityInner(android.app.ActivityThread.ActivityClientRecord p0, int p1, java.util.List<android.app.ResultInfo> p2, java.util.List<com.android.internal.content.ReferrerIntent> p3, android.app.servertransaction.PendingTransactionActions p4, boolean p5, android.content.res.Configuration p6, java.lang.String p7) {}
    public void reportRelaunch(android.os.IBinder p0, android.app.servertransaction.PendingTransactionActions p1) {}
    private void callActivityOnSaveInstanceState(android.app.ActivityThread.ActivityClientRecord p0) {}
    java.util.ArrayList<android.content.ComponentCallbacks2> collectComponentCallbacks(boolean p0, android.content.res.Configuration p1) { return null; }
    private void performConfigurationChangedForActivity(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1) {}
    private android.content.res.Configuration performConfigurationChangedForActivity(android.app.ActivityThread.ActivityClientRecord p0, android.content.res.Configuration p1, int p2, boolean p3) { return null; }
    private static android.content.res.Configuration createNewConfigAndUpdateIfNotNull(android.content.res.Configuration p0, android.content.res.Configuration p1) { return null; }
    private void performConfigurationChanged(android.content.ComponentCallbacks2 p0, android.content.res.Configuration p1) {}
    private android.content.res.Configuration performActivityConfigurationChanged(android.app.Activity p0, android.content.res.Configuration p1, android.content.res.Configuration p2, int p3, boolean p4) { return null; }
    public final void applyConfigurationToResources(android.content.res.Configuration p0) {}
    final android.content.res.Configuration applyCompatConfiguration(int p0) { return null; }
    public void handleConfigurationChanged(android.content.res.Configuration p0) {}
    private void handleConfigurationChanged(android.content.res.Configuration p0, android.content.res.CompatibilityInfo p1) {}
    private void handleWindowingModeChangeIfNeeded(android.app.Activity p0, android.content.res.Configuration p1) {}
    public void handleSystemApplicationInfoChanged(android.content.pm.ApplicationInfo p0) {}
    public void handleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) {}
    static void freeTextLayoutCachesIfNeeded(int p0) {}
    public void updatePendingActivityConfiguration(android.os.IBinder p0, android.content.res.Configuration p1) {}
    public void handleActivityConfigurationChanged(android.os.IBinder p0, android.content.res.Configuration p1, int p2) {}
    final void handleProfilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) {}
    public void stopProfiling() {}
    static void handleDumpHeap(android.app.ActivityThread.DumpHeapData p0) {}
    final void handleDispatchPackageBroadcast(int p0, java.lang.String[] p1) {}
    final void handleLowMemory() {}
    private void handleTrimMemory(int p0) {}
    private void setupGraphicsSupport(android.content.Context p0) {}
    private void updateDefaultDensity() {}
    private java.lang.String getInstrumentationLibrary(android.content.pm.ApplicationInfo p0, android.content.pm.InstrumentationInfo p1) { return null; }
    private void updateLocaleListFromAppContext(android.content.Context p0, android.os.LocaleList p1) {}
    private void handleBindApplication(android.app.ActivityThread.AppBindData p0) {}
    final void finishInstrumentation(int p0, android.os.Bundle p1) {}
    private void installContentProviders(android.content.Context p0, java.util.List<android.content.pm.ProviderInfo> p1) {}
    public final android.content.IContentProvider acquireProvider(android.content.Context p0, java.lang.String p1, int p2, boolean p3) { return null; }
    private java.lang.Object getGetProviderLock(java.lang.String p0, int p1) { return null; }
    private final void incProviderRefLocked(android.app.ActivityThread.ProviderRefCount p0, boolean p1) {}
    public final android.content.IContentProvider acquireExistingProvider(android.content.Context p0, java.lang.String p1, int p2, boolean p3) { return null; }
    public final boolean releaseProvider(android.content.IContentProvider p0, boolean p1) { return false; }
    final void completeRemoveProvider(android.app.ActivityThread.ProviderRefCount p0) {}
    final void handleUnstableProviderDied(android.os.IBinder p0, boolean p1) {}
    final void handleUnstableProviderDiedLocked(android.os.IBinder p0, boolean p1) {}
    final void appNotRespondingViaProvider(android.os.IBinder p0) {}
    private android.app.ActivityThread.ProviderClientRecord installProviderAuthoritiesLocked(android.content.IContentProvider p0, android.content.ContentProvider p1, android.app.ContentProviderHolder p2) { return null; }
    private android.app.ContentProviderHolder installProvider(android.content.Context p0, android.app.ContentProviderHolder p1, android.content.pm.ProviderInfo p2, boolean p3, boolean p4, boolean p5) { return null; }
    private void handleRunIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) {}
    private void attach(boolean p0, long p1) {}
    public static android.app.ActivityThread systemMain() { return null; }
    public static void updateHttpProxy(android.content.Context p0) {}
    public final void installSystemProviders(java.util.List<android.content.pm.ProviderInfo> p0) {}
    public android.os.Bundle getCoreSettings() { return null; }
    public int getIntCoreSetting(java.lang.String p0, int p1) { return 0; }
    public java.lang.String getStringCoreSetting(java.lang.String p0, java.lang.String p1) { return null; }
    float getFloatCoreSetting(java.lang.String p0, float p1) { return 0.0f; }
    public static void main(java.lang.String[] p0) {}
    public static void initializeMainlineModules() {}
    private void purgePendingResources() {}
    private native void nPurgePendingResources();
    private native void nDumpGraphicsInfo(java.io.FileDescriptor p0);
    private native void nInitZygoteChildHeapProfiling();

    public static final class ActivityClientRecord {
        public android.os.IBinder token;
        public android.os.IBinder assistToken;
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
        android.content.res.Configuration newConfig;
        android.content.res.Configuration createdConfig;
        android.content.res.Configuration overrideConfig;
        private android.content.res.Configuration mPendingOverrideConfig;
        private android.content.res.Configuration tmpConfig;
        android.view.ViewRootImpl.ActivityConfigCallback configCallback;
        android.app.ActivityThread.ActivityClientRecord nextIdle;
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
        android.view.DisplayAdjustments.FixedRotationAdjustments mPendingFixedRotationAdjustments;
        private int mLifecycleState;
        public ActivityClientRecord() {}
        public ActivityClientRecord(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.pm.ActivityInfo p3, android.content.res.Configuration p4, android.content.res.CompatibilityInfo p5, java.lang.String p6, com.android.internal.app.IVoiceInteractor p7, android.os.Bundle p8, android.os.PersistableBundle p9, java.util.List<android.app.ResultInfo> p10, java.util.List<com.android.internal.content.ReferrerIntent> p11, boolean p12, android.app.ProfilerInfo p13, android.app.ClientTransactionHandler p14, android.os.IBinder p15, android.view.DisplayAdjustments.FixedRotationAdjustments p16) {}
        private void init() {}
        public int getLifecycleState() { return 0; }
        public void setState(int p0) {}
        private boolean isPreHoneycomb() { return false; }
        private boolean isPreP() { return false; }
        public boolean isPersistable() { return false; }
        public boolean isVisibleFromServer() { return false; }
        public java.lang.String toString() { return null; }
        public java.lang.String getStateString() { return null; }
    }

    private static class AndroidOs {
        public static void install() {}
        private AndroidOs(libcore.io.Os p0) {}
        private java.io.FileDescriptor openDeprecatedDataPath(java.lang.String p0, int p1) throws android.system.ErrnoException { return null; }
        private void deleteDeprecatedDataPath(java.lang.String p0) throws android.system.ErrnoException {}
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
        android.content.ContentCaptureOptions contentCaptureOptions;
        long[] disabledCompatChanges;
        AppBindData() {}
        public java.lang.String toString() { return null; }
    }

    private class ApplicationThread extends android.app.IApplicationThread.Stub {
        private static final java.lang.String DB_INFO_FORMAT = "  %8s %8s %14s %14s  %s";
        private ApplicationThread(android.app.ActivityThread p0) { super(); }
        public final void scheduleReceiver(android.content.Intent p0, android.content.pm.ActivityInfo p1, android.content.res.CompatibilityInfo p2, int p3, java.lang.String p4, android.os.Bundle p5, boolean p6, int p7, int p8) {}
        public final void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2, int p3) {}
        public final void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2) {}
        public final void scheduleCreateService(android.os.IBinder p0, android.content.pm.ServiceInfo p1, android.content.res.CompatibilityInfo p2, int p3) {}
        public final void scheduleBindService(android.os.IBinder p0, android.content.Intent p1, boolean p2, int p3) {}
        public final void scheduleUnbindService(android.os.IBinder p0, android.content.Intent p1) {}
        public final void scheduleServiceArgs(android.os.IBinder p0, android.content.pm.ParceledListSlice p1) {}
        public final void scheduleStopService(android.os.IBinder p0) {}
        public final void bindApplication(java.lang.String p0, android.content.pm.ApplicationInfo p1, android.content.pm.ProviderInfoList p2, android.content.ComponentName p3, android.app.ProfilerInfo p4, android.os.Bundle p5, android.app.IInstrumentationWatcher p6, android.app.IUiAutomationConnection p7, int p8, boolean p9, boolean p10, boolean p11, boolean p12, android.content.res.Configuration p13, android.content.res.CompatibilityInfo p14, java.util.Map p15, android.os.Bundle p16, java.lang.String p17, android.content.AutofillOptions p18, android.content.ContentCaptureOptions p19, long[] p20) {}
        public final void runIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) {}
        public final void scheduleExit() {}
        public final void scheduleSuicide() {}
        public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) {}
        public void updateTimeZone() {}
        public void clearDnsCache() {}
        public void updateHttpProxy() {}
        public void processInBackground() {}
        public void dumpService(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) {}
        public void scheduleRegisteredReceiver(android.content.IIntentReceiver p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, int p7, int p8) throws android.os.RemoteException {}
        public void scheduleLowMemory() {}
        public void profilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) {}
        public void dumpHeap(boolean p0, boolean p1, boolean p2, java.lang.String p3, android.os.ParcelFileDescriptor p4, android.os.RemoteCallback p5) {}
        public void attachAgent(java.lang.String p0) {}
        public void attachStartupAgents(java.lang.String p0) {}
        public void setSchedulingGroup(int p0) {}
        public void dispatchPackageBroadcast(int p0, java.lang.String[] p1) {}
        public void scheduleCrash(java.lang.String p0) {}
        public void dumpActivity(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String p2, java.lang.String[] p3) {}
        public void dumpProvider(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) {}
        public void dumpMemInfo(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, java.lang.String[] p7) {}
        private void dumpMemInfo(java.io.PrintWriter p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {}
        public void dumpMemInfoProto(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String[] p6) {}
        private void dumpMemInfo(android.util.proto.ProtoOutputStream p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5) {}
        public void dumpGfxInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
        public void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
        private java.io.File getDatabasesDir(android.content.Context p0) { return null; }
        private void dumpDatabaseInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1, boolean p2) {}
        public void dumpDbInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
        public void unstableProviderDied(android.os.IBinder p0) {}
        public void requestAssistContextExtras(android.os.IBinder p0, android.os.IBinder p1, int p2, int p3, int p4) {}
        public void setCoreSettings(android.os.Bundle p0) {}
        public void updatePackageCompatibilityInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1) {}
        public void scheduleTrimMemory(int p0) {}
        public void scheduleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) {}
        public void scheduleOnNewActivityOptions(android.os.IBinder p0, android.os.Bundle p1) {}
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
        public void requestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) {}
        public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) {}
    }

    static final class BindServiceData {
        android.os.IBinder token;
        android.content.Intent intent;
        boolean rebind;
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
        android.content.res.CompatibilityInfo compatInfo;
        int backupMode;
        int userId;
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
        java.lang.String path;
        android.os.ParcelFileDescriptor fd;
        android.os.RemoteCallback finishCallback;
        DumpHeapData() {}
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
        public static final int ON_NEW_ACTIVITY_OPTIONS = 146;
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
        H(android.app.ActivityThread p0) { super(); }
        java.lang.String codeToString(int p0) { return null; }
        public void handleMessage(android.os.Message p0) {}
    }

    private class Idler implements android.os.MessageQueue.IdleHandler {
        private Idler(android.app.ActivityThread p0) {}
        public final boolean queueIdle() { return false; }
    }

    static final class Profiler {
        java.lang.String profileFile;
        android.os.ParcelFileDescriptor profileFd;
        int samplingInterval;
        boolean autoStopProfiler;
        boolean streamingOutput;
        boolean profiling;
        boolean handlingProfiling;
        Profiler() {}
        public void setProfiler(android.app.ProfilerInfo p0) {}
        public void startProfiling() {}
        public void stopProfiling() {}
    }

    final class ProviderClientRecord {
        final java.lang.String[] mNames = null;
        final android.content.IContentProvider mProvider = null;
        final android.content.ContentProvider mLocalProvider = null;
        final android.app.ContentProviderHolder mHolder = null;
        ProviderClientRecord(android.app.ActivityThread p0, java.lang.String[] p1, android.content.IContentProvider p2, android.content.ContentProvider p3, android.app.ContentProviderHolder p4) {}
    }

    private static final class ProviderKey {
        final java.lang.String authority = null;
        final int userId = 0;
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
        android.content.Intent intent;
        android.content.pm.ActivityInfo info;
        android.content.res.CompatibilityInfo compatInfo;
        public ReceiverData(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, android.os.IBinder p6, int p7) { super(0, null, null, 0, false, false, null, 0, 0); }
        public java.lang.String toString() { return null; }
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
        private final java.lang.ref.WeakReference<android.app.ActivityThread> mWeakActivityThread = null;
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
