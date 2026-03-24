package android.app;

public interface IApplicationThread extends android.os.IInterface {
    public void scheduleReceiver(android.content.Intent p0, android.content.pm.ActivityInfo p1, android.content.res.CompatibilityInfo p2, int p3, java.lang.String p4, android.os.Bundle p5, boolean p6, int p7, int p8) throws android.os.RemoteException;
    public void scheduleCreateService(android.os.IBinder p0, android.content.pm.ServiceInfo p1, android.content.res.CompatibilityInfo p2, int p3) throws android.os.RemoteException;
    public void scheduleStopService(android.os.IBinder p0) throws android.os.RemoteException;
    public void bindApplication(java.lang.String p0, android.content.pm.ApplicationInfo p1, android.content.pm.ProviderInfoList p2, android.content.ComponentName p3, android.app.ProfilerInfo p4, android.os.Bundle p5, android.app.IInstrumentationWatcher p6, android.app.IUiAutomationConnection p7, int p8, boolean p9, boolean p10, boolean p11, boolean p12, android.content.res.Configuration p13, android.content.res.CompatibilityInfo p14, java.util.Map p15, android.os.Bundle p16, java.lang.String p17, android.content.AutofillOptions p18, android.content.ContentCaptureOptions p19, long[] p20) throws android.os.RemoteException;
    public void runIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void scheduleExit() throws android.os.RemoteException;
    public void scheduleServiceArgs(android.os.IBinder p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException;
    public void updateTimeZone() throws android.os.RemoteException;
    public void processInBackground() throws android.os.RemoteException;
    public void scheduleBindService(android.os.IBinder p0, android.content.Intent p1, boolean p2, int p3) throws android.os.RemoteException;
    public void scheduleUnbindService(android.os.IBinder p0, android.content.Intent p1) throws android.os.RemoteException;
    public void dumpService(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void scheduleRegisteredReceiver(android.content.IIntentReceiver p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, int p7, int p8) throws android.os.RemoteException;
    public void scheduleLowMemory() throws android.os.RemoteException;
    public void profilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) throws android.os.RemoteException;
    public void setSchedulingGroup(int p0) throws android.os.RemoteException;
    public void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2, int p3) throws android.os.RemoteException;
    public void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2) throws android.os.RemoteException;
    public void scheduleOnNewActivityOptions(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void scheduleSuicide() throws android.os.RemoteException;
    public void dispatchPackageBroadcast(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void scheduleCrash(java.lang.String p0) throws android.os.RemoteException;
    public void dumpHeap(boolean p0, boolean p1, boolean p2, java.lang.String p3, android.os.ParcelFileDescriptor p4, android.os.RemoteCallback p5) throws android.os.RemoteException;
    public void dumpActivity(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException;
    public void clearDnsCache() throws android.os.RemoteException;
    public void updateHttpProxy() throws android.os.RemoteException;
    public void setCoreSettings(android.os.Bundle p0) throws android.os.RemoteException;
    public void updatePackageCompatibilityInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1) throws android.os.RemoteException;
    public void scheduleTrimMemory(int p0) throws android.os.RemoteException;
    public void dumpMemInfo(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, java.lang.String[] p7) throws android.os.RemoteException;
    public void dumpMemInfoProto(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String[] p6) throws android.os.RemoteException;
    public void dumpGfxInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void dumpProvider(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void dumpDbInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException;
    public void requestAssistContextExtras(android.os.IBinder p0, android.os.IBinder p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void scheduleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void setProcessState(int p0) throws android.os.RemoteException;
    public void scheduleInstallProvider(android.content.pm.ProviderInfo p0) throws android.os.RemoteException;
    public void updateTimePrefs(int p0) throws android.os.RemoteException;
    public void scheduleEnterAnimationComplete(android.os.IBinder p0) throws android.os.RemoteException;
    public void notifyCleartextNetwork(byte[] p0) throws android.os.RemoteException;
    public void startBinderTracking() throws android.os.RemoteException;
    public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void scheduleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) throws android.os.RemoteException;
    public void handleTrustStorageUpdate() throws android.os.RemoteException;
    public void attachAgent(java.lang.String p0) throws android.os.RemoteException;
    public void attachStartupAgents(java.lang.String p0) throws android.os.RemoteException;
    public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException;
    public void setNetworkBlockSeq(long p0) throws android.os.RemoteException;
    public void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) throws android.os.RemoteException;
    public void requestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException;

    public static class Default implements android.app.IApplicationThread {
        public Default() {}
        public void scheduleReceiver(android.content.Intent p0, android.content.pm.ActivityInfo p1, android.content.res.CompatibilityInfo p2, int p3, java.lang.String p4, android.os.Bundle p5, boolean p6, int p7, int p8) throws android.os.RemoteException {}
        public void scheduleCreateService(android.os.IBinder p0, android.content.pm.ServiceInfo p1, android.content.res.CompatibilityInfo p2, int p3) throws android.os.RemoteException {}
        public void scheduleStopService(android.os.IBinder p0) throws android.os.RemoteException {}
        public void bindApplication(java.lang.String p0, android.content.pm.ApplicationInfo p1, android.content.pm.ProviderInfoList p2, android.content.ComponentName p3, android.app.ProfilerInfo p4, android.os.Bundle p5, android.app.IInstrumentationWatcher p6, android.app.IUiAutomationConnection p7, int p8, boolean p9, boolean p10, boolean p11, boolean p12, android.content.res.Configuration p13, android.content.res.CompatibilityInfo p14, java.util.Map p15, android.os.Bundle p16, java.lang.String p17, android.content.AutofillOptions p18, android.content.ContentCaptureOptions p19, long[] p20) throws android.os.RemoteException {}
        public void runIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void scheduleExit() throws android.os.RemoteException {}
        public void scheduleServiceArgs(android.os.IBinder p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void updateTimeZone() throws android.os.RemoteException {}
        public void processInBackground() throws android.os.RemoteException {}
        public void scheduleBindService(android.os.IBinder p0, android.content.Intent p1, boolean p2, int p3) throws android.os.RemoteException {}
        public void scheduleUnbindService(android.os.IBinder p0, android.content.Intent p1) throws android.os.RemoteException {}
        public void dumpService(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void scheduleRegisteredReceiver(android.content.IIntentReceiver p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, int p7, int p8) throws android.os.RemoteException {}
        public void scheduleLowMemory() throws android.os.RemoteException {}
        public void profilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) throws android.os.RemoteException {}
        public void setSchedulingGroup(int p0) throws android.os.RemoteException {}
        public void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2, int p3) throws android.os.RemoteException {}
        public void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2) throws android.os.RemoteException {}
        public void scheduleOnNewActivityOptions(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void scheduleSuicide() throws android.os.RemoteException {}
        public void dispatchPackageBroadcast(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void scheduleCrash(java.lang.String p0) throws android.os.RemoteException {}
        public void dumpHeap(boolean p0, boolean p1, boolean p2, java.lang.String p3, android.os.ParcelFileDescriptor p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
        public void dumpActivity(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException {}
        public void clearDnsCache() throws android.os.RemoteException {}
        public void updateHttpProxy() throws android.os.RemoteException {}
        public void setCoreSettings(android.os.Bundle p0) throws android.os.RemoteException {}
        public void updatePackageCompatibilityInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1) throws android.os.RemoteException {}
        public void scheduleTrimMemory(int p0) throws android.os.RemoteException {}
        public void dumpMemInfo(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, java.lang.String[] p7) throws android.os.RemoteException {}
        public void dumpMemInfoProto(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String[] p6) throws android.os.RemoteException {}
        public void dumpGfxInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dumpProvider(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void dumpDbInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException {}
        public void requestAssistContextExtras(android.os.IBinder p0, android.os.IBinder p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void scheduleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void setProcessState(int p0) throws android.os.RemoteException {}
        public void scheduleInstallProvider(android.content.pm.ProviderInfo p0) throws android.os.RemoteException {}
        public void updateTimePrefs(int p0) throws android.os.RemoteException {}
        public void scheduleEnterAnimationComplete(android.os.IBinder p0) throws android.os.RemoteException {}
        public void notifyCleartextNetwork(byte[] p0) throws android.os.RemoteException {}
        public void startBinderTracking() throws android.os.RemoteException {}
        public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void scheduleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) throws android.os.RemoteException {}
        public void handleTrustStorageUpdate() throws android.os.RemoteException {}
        public void attachAgent(java.lang.String p0) throws android.os.RemoteException {}
        public void attachStartupAgents(java.lang.String p0) throws android.os.RemoteException {}
        public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException {}
        public void setNetworkBlockSeq(long p0) throws android.os.RemoteException {}
        public void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) throws android.os.RemoteException {}
        public void requestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IApplicationThread {
        private static final java.lang.String DESCRIPTOR = "android.app.IApplicationThread";
        static final int TRANSACTION_scheduleReceiver = 1;
        static final int TRANSACTION_scheduleCreateService = 2;
        static final int TRANSACTION_scheduleStopService = 3;
        static final int TRANSACTION_bindApplication = 4;
        static final int TRANSACTION_runIsolatedEntryPoint = 5;
        static final int TRANSACTION_scheduleExit = 6;
        static final int TRANSACTION_scheduleServiceArgs = 7;
        static final int TRANSACTION_updateTimeZone = 8;
        static final int TRANSACTION_processInBackground = 9;
        static final int TRANSACTION_scheduleBindService = 10;
        static final int TRANSACTION_scheduleUnbindService = 11;
        static final int TRANSACTION_dumpService = 12;
        static final int TRANSACTION_scheduleRegisteredReceiver = 13;
        static final int TRANSACTION_scheduleLowMemory = 14;
        static final int TRANSACTION_profilerControl = 15;
        static final int TRANSACTION_setSchedulingGroup = 16;
        static final int TRANSACTION_scheduleCreateBackupAgent = 17;
        static final int TRANSACTION_scheduleDestroyBackupAgent = 18;
        static final int TRANSACTION_scheduleOnNewActivityOptions = 19;
        static final int TRANSACTION_scheduleSuicide = 20;
        static final int TRANSACTION_dispatchPackageBroadcast = 21;
        static final int TRANSACTION_scheduleCrash = 22;
        static final int TRANSACTION_dumpHeap = 23;
        static final int TRANSACTION_dumpActivity = 24;
        static final int TRANSACTION_clearDnsCache = 25;
        static final int TRANSACTION_updateHttpProxy = 26;
        static final int TRANSACTION_setCoreSettings = 27;
        static final int TRANSACTION_updatePackageCompatibilityInfo = 28;
        static final int TRANSACTION_scheduleTrimMemory = 29;
        static final int TRANSACTION_dumpMemInfo = 30;
        static final int TRANSACTION_dumpMemInfoProto = 31;
        static final int TRANSACTION_dumpGfxInfo = 32;
        static final int TRANSACTION_dumpCacheInfo = 33;
        static final int TRANSACTION_dumpProvider = 34;
        static final int TRANSACTION_dumpDbInfo = 35;
        static final int TRANSACTION_unstableProviderDied = 36;
        static final int TRANSACTION_requestAssistContextExtras = 37;
        static final int TRANSACTION_scheduleTranslucentConversionComplete = 38;
        static final int TRANSACTION_setProcessState = 39;
        static final int TRANSACTION_scheduleInstallProvider = 40;
        static final int TRANSACTION_updateTimePrefs = 41;
        static final int TRANSACTION_scheduleEnterAnimationComplete = 42;
        static final int TRANSACTION_notifyCleartextNetwork = 43;
        static final int TRANSACTION_startBinderTracking = 44;
        static final int TRANSACTION_stopBinderTrackingAndDump = 45;
        static final int TRANSACTION_scheduleLocalVoiceInteractionStarted = 46;
        static final int TRANSACTION_handleTrustStorageUpdate = 47;
        static final int TRANSACTION_attachAgent = 48;
        static final int TRANSACTION_attachStartupAgents = 49;
        static final int TRANSACTION_scheduleApplicationInfoChanged = 50;
        static final int TRANSACTION_setNetworkBlockSeq = 51;
        static final int TRANSACTION_scheduleTransaction = 52;
        static final int TRANSACTION_requestDirectActions = 53;
        static final int TRANSACTION_performDirectAction = 54;
        public Stub() { super(); }
        public static android.app.IApplicationThread asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IApplicationThread p0) { return false; }
        public static android.app.IApplicationThread getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IApplicationThread {
            private android.os.IBinder mRemote;
            public static android.app.IApplicationThread sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void scheduleReceiver(android.content.Intent p0, android.content.pm.ActivityInfo p1, android.content.res.CompatibilityInfo p2, int p3, java.lang.String p4, android.os.Bundle p5, boolean p6, int p7, int p8) throws android.os.RemoteException {}
            public void scheduleCreateService(android.os.IBinder p0, android.content.pm.ServiceInfo p1, android.content.res.CompatibilityInfo p2, int p3) throws android.os.RemoteException {}
            public void scheduleStopService(android.os.IBinder p0) throws android.os.RemoteException {}
            public void bindApplication(java.lang.String p0, android.content.pm.ApplicationInfo p1, android.content.pm.ProviderInfoList p2, android.content.ComponentName p3, android.app.ProfilerInfo p4, android.os.Bundle p5, android.app.IInstrumentationWatcher p6, android.app.IUiAutomationConnection p7, int p8, boolean p9, boolean p10, boolean p11, boolean p12, android.content.res.Configuration p13, android.content.res.CompatibilityInfo p14, java.util.Map p15, android.os.Bundle p16, java.lang.String p17, android.content.AutofillOptions p18, android.content.ContentCaptureOptions p19, long[] p20) throws android.os.RemoteException {}
            public void runIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void scheduleExit() throws android.os.RemoteException {}
            public void scheduleServiceArgs(android.os.IBinder p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
            public void updateTimeZone() throws android.os.RemoteException {}
            public void processInBackground() throws android.os.RemoteException {}
            public void scheduleBindService(android.os.IBinder p0, android.content.Intent p1, boolean p2, int p3) throws android.os.RemoteException {}
            public void scheduleUnbindService(android.os.IBinder p0, android.content.Intent p1) throws android.os.RemoteException {}
            public void dumpService(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void scheduleRegisteredReceiver(android.content.IIntentReceiver p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, int p7, int p8) throws android.os.RemoteException {}
            public void scheduleLowMemory() throws android.os.RemoteException {}
            public void profilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) throws android.os.RemoteException {}
            public void setSchedulingGroup(int p0) throws android.os.RemoteException {}
            public void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2, int p3) throws android.os.RemoteException {}
            public void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo p0, android.content.res.CompatibilityInfo p1, int p2) throws android.os.RemoteException {}
            public void scheduleOnNewActivityOptions(android.os.IBinder p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void scheduleSuicide() throws android.os.RemoteException {}
            public void dispatchPackageBroadcast(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void scheduleCrash(java.lang.String p0) throws android.os.RemoteException {}
            public void dumpHeap(boolean p0, boolean p1, boolean p2, java.lang.String p3, android.os.ParcelFileDescriptor p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
            public void dumpActivity(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException {}
            public void clearDnsCache() throws android.os.RemoteException {}
            public void updateHttpProxy() throws android.os.RemoteException {}
            public void setCoreSettings(android.os.Bundle p0) throws android.os.RemoteException {}
            public void updatePackageCompatibilityInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1) throws android.os.RemoteException {}
            public void scheduleTrimMemory(int p0) throws android.os.RemoteException {}
            public void dumpMemInfo(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, java.lang.String[] p7) throws android.os.RemoteException {}
            public void dumpMemInfoProto(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String[] p6) throws android.os.RemoteException {}
            public void dumpGfxInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void dumpProvider(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void dumpDbInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException {}
            public void requestAssistContextExtras(android.os.IBinder p0, android.os.IBinder p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void scheduleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void setProcessState(int p0) throws android.os.RemoteException {}
            public void scheduleInstallProvider(android.content.pm.ProviderInfo p0) throws android.os.RemoteException {}
            public void updateTimePrefs(int p0) throws android.os.RemoteException {}
            public void scheduleEnterAnimationComplete(android.os.IBinder p0) throws android.os.RemoteException {}
            public void notifyCleartextNetwork(byte[] p0) throws android.os.RemoteException {}
            public void startBinderTracking() throws android.os.RemoteException {}
            public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
            public void scheduleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) throws android.os.RemoteException {}
            public void handleTrustStorageUpdate() throws android.os.RemoteException {}
            public void attachAgent(java.lang.String p0) throws android.os.RemoteException {}
            public void attachStartupAgents(java.lang.String p0) throws android.os.RemoteException {}
            public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException {}
            public void setNetworkBlockSeq(long p0) throws android.os.RemoteException {}
            public void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) throws android.os.RemoteException {}
            public void requestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        }
    }
}
