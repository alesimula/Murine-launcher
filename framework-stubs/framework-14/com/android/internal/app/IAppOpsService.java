package com.android.internal.app;

public interface IAppOpsService extends android.os.IInterface {
    public int checkOperation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5, boolean p6) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp startOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7, boolean p8, int p9, int p10) throws android.os.RemoteException;
    public void finishOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void startWatchingMode(int p0, java.lang.String p1, com.android.internal.app.IAppOpsCallback p2) throws android.os.RemoteException;
    public void stopWatchingMode(com.android.internal.app.IAppOpsCallback p0) throws android.os.RemoteException;
    public int permissionToOpCode(java.lang.String p0) throws android.os.RemoteException;
    public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean shouldCollectNotes(int p0) throws android.os.RemoteException;
    public void setCameraAudioRestriction(int p0) throws android.os.RemoteException;
    public void startWatchingModeWithFlags(int p0, java.lang.String p1, int p2, com.android.internal.app.IAppOpsCallback p3) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp noteProxyOperation(int p0, android.content.AttributionSource p1, boolean p2, java.lang.String p3, boolean p4, boolean p5) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp startProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, boolean p7, int p8, int p9, int p10) throws android.os.RemoteException;
    public void finishProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3) throws android.os.RemoteException;
    public int checkPackage(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.RuntimeAppOpAccessMessage collectRuntimeAppOpAccessMessage() throws android.os.RemoteException;
    public com.android.internal.app.MessageSamplingConfig reportRuntimeAppOpAccessMessageAndGetConfig(java.lang.String p0, android.app.SyncNotedAppOp p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) throws android.os.RemoteException;
    public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) throws android.os.RemoteException;
    public void getHistoricalOps(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException;
    public void getHistoricalOpsFromDiskRaw(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException;
    public void offsetHistory(long p0) throws android.os.RemoteException;
    public void setHistoryParameters(int p0, long p1, int p2) throws android.os.RemoteException;
    public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) throws android.os.RemoteException;
    public void resetHistoryParameters() throws android.os.RemoteException;
    public void resetPackageOpsNoHistory(java.lang.String p0) throws android.os.RemoteException;
    public void clearHistory() throws android.os.RemoteException;
    public void rebootHistory(long p0) throws android.os.RemoteException;
    public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int p0, int[] p1) throws android.os.RemoteException;
    public void setUidMode(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setMode(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void resetAllModes(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setAudioRestriction(int p0, int p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException;
    public void setUserRestrictions(android.os.Bundle p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, int p3, android.os.PackageTagsList p4) throws android.os.RemoteException;
    public void removeUser(int p0) throws android.os.RemoteException;
    public void startWatchingActive(int[] p0, com.android.internal.app.IAppOpsActiveCallback p1) throws android.os.RemoteException;
    public void stopWatchingActive(com.android.internal.app.IAppOpsActiveCallback p0) throws android.os.RemoteException;
    public boolean isOperationActive(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isProxying(int p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public void startWatchingStarted(int[] p0, com.android.internal.app.IAppOpsStartedCallback p1) throws android.os.RemoteException;
    public void stopWatchingStarted(com.android.internal.app.IAppOpsStartedCallback p0) throws android.os.RemoteException;
    public void startWatchingNoted(int[] p0, com.android.internal.app.IAppOpsNotedCallback p1) throws android.os.RemoteException;
    public void stopWatchingNoted(com.android.internal.app.IAppOpsNotedCallback p0) throws android.os.RemoteException;
    public void startWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException;
    public void stopWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException;
    public java.util.List<android.app.AsyncNotedAppOp> extractAsyncOps(java.lang.String p0) throws android.os.RemoteException;
    public int checkOperationRaw(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void reloadNonHistoricalState() throws android.os.RemoteException;
    public void collectNoteOpCallsForValidation(java.lang.String p0, int p1, java.lang.String p2, long p3) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IAppOpsService {
        public Default() {}
        public int checkOperation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public android.app.SyncNotedAppOp noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5, boolean p6) throws android.os.RemoteException { return null; }
        public android.app.SyncNotedAppOp startOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7, boolean p8, int p9, int p10) throws android.os.RemoteException { return null; }
        public void finishOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void startWatchingMode(int p0, java.lang.String p1, com.android.internal.app.IAppOpsCallback p2) throws android.os.RemoteException {}
        public void stopWatchingMode(com.android.internal.app.IAppOpsCallback p0) throws android.os.RemoteException {}
        public int permissionToOpCode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public boolean shouldCollectNotes(int p0) throws android.os.RemoteException { return false; }
        public void setCameraAudioRestriction(int p0) throws android.os.RemoteException {}
        public void startWatchingModeWithFlags(int p0, java.lang.String p1, int p2, com.android.internal.app.IAppOpsCallback p3) throws android.os.RemoteException {}
        public android.app.SyncNotedAppOp noteProxyOperation(int p0, android.content.AttributionSource p1, boolean p2, java.lang.String p3, boolean p4, boolean p5) throws android.os.RemoteException { return null; }
        public android.app.SyncNotedAppOp startProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, boolean p7, int p8, int p9, int p10) throws android.os.RemoteException { return null; }
        public void finishProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3) throws android.os.RemoteException {}
        public int checkPackage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public android.app.RuntimeAppOpAccessMessage collectRuntimeAppOpAccessMessage() throws android.os.RemoteException { return null; }
        public com.android.internal.app.MessageSamplingConfig reportRuntimeAppOpAccessMessageAndGetConfig(java.lang.String p0, android.app.SyncNotedAppOp p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) throws android.os.RemoteException { return null; }
        public void getHistoricalOps(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException {}
        public void getHistoricalOpsFromDiskRaw(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException {}
        public void offsetHistory(long p0) throws android.os.RemoteException {}
        public void setHistoryParameters(int p0, long p1, int p2) throws android.os.RemoteException {}
        public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) throws android.os.RemoteException {}
        public void resetHistoryParameters() throws android.os.RemoteException {}
        public void resetPackageOpsNoHistory(java.lang.String p0) throws android.os.RemoteException {}
        public void clearHistory() throws android.os.RemoteException {}
        public void rebootHistory(long p0) throws android.os.RemoteException {}
        public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int p0, int[] p1) throws android.os.RemoteException { return null; }
        public void setUidMode(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setMode(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void resetAllModes(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setAudioRestriction(int p0, int p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException {}
        public void setUserRestrictions(android.os.Bundle p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
        public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, int p3, android.os.PackageTagsList p4) throws android.os.RemoteException {}
        public void removeUser(int p0) throws android.os.RemoteException {}
        public void startWatchingActive(int[] p0, com.android.internal.app.IAppOpsActiveCallback p1) throws android.os.RemoteException {}
        public void stopWatchingActive(com.android.internal.app.IAppOpsActiveCallback p0) throws android.os.RemoteException {}
        public boolean isOperationActive(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isProxying(int p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException { return false; }
        public void startWatchingStarted(int[] p0, com.android.internal.app.IAppOpsStartedCallback p1) throws android.os.RemoteException {}
        public void stopWatchingStarted(com.android.internal.app.IAppOpsStartedCallback p0) throws android.os.RemoteException {}
        public void startWatchingNoted(int[] p0, com.android.internal.app.IAppOpsNotedCallback p1) throws android.os.RemoteException {}
        public void stopWatchingNoted(com.android.internal.app.IAppOpsNotedCallback p0) throws android.os.RemoteException {}
        public void startWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
        public void stopWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
        public java.util.List<android.app.AsyncNotedAppOp> extractAsyncOps(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int checkOperationRaw(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public void reloadNonHistoricalState() throws android.os.RemoteException {}
        public void collectNoteOpCallsForValidation(java.lang.String p0, int p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IAppOpsService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IAppOpsService";
        static final int TRANSACTION_checkOperation = 1;
        static final int TRANSACTION_noteOperation = 2;
        static final int TRANSACTION_startOperation = 3;
        static final int TRANSACTION_finishOperation = 4;
        static final int TRANSACTION_startWatchingMode = 5;
        static final int TRANSACTION_stopWatchingMode = 6;
        static final int TRANSACTION_permissionToOpCode = 7;
        static final int TRANSACTION_checkAudioOperation = 8;
        static final int TRANSACTION_shouldCollectNotes = 9;
        static final int TRANSACTION_setCameraAudioRestriction = 10;
        static final int TRANSACTION_startWatchingModeWithFlags = 11;
        static final int TRANSACTION_noteProxyOperation = 12;
        static final int TRANSACTION_startProxyOperation = 13;
        static final int TRANSACTION_finishProxyOperation = 14;
        static final int TRANSACTION_checkPackage = 15;
        static final int TRANSACTION_collectRuntimeAppOpAccessMessage = 16;
        static final int TRANSACTION_reportRuntimeAppOpAccessMessageAndGetConfig = 17;
        static final int TRANSACTION_getPackagesForOps = 18;
        static final int TRANSACTION_getOpsForPackage = 19;
        static final int TRANSACTION_getHistoricalOps = 20;
        static final int TRANSACTION_getHistoricalOpsFromDiskRaw = 21;
        static final int TRANSACTION_offsetHistory = 22;
        static final int TRANSACTION_setHistoryParameters = 23;
        static final int TRANSACTION_addHistoricalOps = 24;
        static final int TRANSACTION_resetHistoryParameters = 25;
        static final int TRANSACTION_resetPackageOpsNoHistory = 26;
        static final int TRANSACTION_clearHistory = 27;
        static final int TRANSACTION_rebootHistory = 28;
        static final int TRANSACTION_getUidOps = 29;
        static final int TRANSACTION_setUidMode = 30;
        static final int TRANSACTION_setMode = 31;
        static final int TRANSACTION_resetAllModes = 32;
        static final int TRANSACTION_setAudioRestriction = 33;
        static final int TRANSACTION_setUserRestrictions = 34;
        static final int TRANSACTION_setUserRestriction = 35;
        static final int TRANSACTION_removeUser = 36;
        static final int TRANSACTION_startWatchingActive = 37;
        static final int TRANSACTION_stopWatchingActive = 38;
        static final int TRANSACTION_isOperationActive = 39;
        static final int TRANSACTION_isProxying = 40;
        static final int TRANSACTION_startWatchingStarted = 41;
        static final int TRANSACTION_stopWatchingStarted = 42;
        static final int TRANSACTION_startWatchingNoted = 43;
        static final int TRANSACTION_stopWatchingNoted = 44;
        static final int TRANSACTION_startWatchingAsyncNoted = 45;
        static final int TRANSACTION_stopWatchingAsyncNoted = 46;
        static final int TRANSACTION_extractAsyncOps = 47;
        static final int TRANSACTION_checkOperationRaw = 48;
        static final int TRANSACTION_reloadNonHistoricalState = 49;
        static final int TRANSACTION_collectNoteOpCallsForValidation = 50;
        public Stub() { super(); }
        public static com.android.internal.app.IAppOpsService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.app.IAppOpsService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int checkOperation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public android.app.SyncNotedAppOp noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5, boolean p6) throws android.os.RemoteException { return null; }
            public android.app.SyncNotedAppOp startOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7, boolean p8, int p9, int p10) throws android.os.RemoteException { return null; }
            public void finishOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void startWatchingMode(int p0, java.lang.String p1, com.android.internal.app.IAppOpsCallback p2) throws android.os.RemoteException {}
            public void stopWatchingMode(com.android.internal.app.IAppOpsCallback p0) throws android.os.RemoteException {}
            public int permissionToOpCode(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public boolean shouldCollectNotes(int p0) throws android.os.RemoteException { return false; }
            public void setCameraAudioRestriction(int p0) throws android.os.RemoteException {}
            public void startWatchingModeWithFlags(int p0, java.lang.String p1, int p2, com.android.internal.app.IAppOpsCallback p3) throws android.os.RemoteException {}
            public android.app.SyncNotedAppOp noteProxyOperation(int p0, android.content.AttributionSource p1, boolean p2, java.lang.String p3, boolean p4, boolean p5) throws android.os.RemoteException { return null; }
            public android.app.SyncNotedAppOp startProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, boolean p7, int p8, int p9, int p10) throws android.os.RemoteException { return null; }
            public void finishProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3) throws android.os.RemoteException {}
            public int checkPackage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public android.app.RuntimeAppOpAccessMessage collectRuntimeAppOpAccessMessage() throws android.os.RemoteException { return null; }
            public com.android.internal.app.MessageSamplingConfig reportRuntimeAppOpAccessMessageAndGetConfig(java.lang.String p0, android.app.SyncNotedAppOp p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) throws android.os.RemoteException { return null; }
            public void getHistoricalOps(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException {}
            public void getHistoricalOpsFromDiskRaw(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException {}
            public void offsetHistory(long p0) throws android.os.RemoteException {}
            public void setHistoryParameters(int p0, long p1, int p2) throws android.os.RemoteException {}
            public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) throws android.os.RemoteException {}
            public void resetHistoryParameters() throws android.os.RemoteException {}
            public void resetPackageOpsNoHistory(java.lang.String p0) throws android.os.RemoteException {}
            public void clearHistory() throws android.os.RemoteException {}
            public void rebootHistory(long p0) throws android.os.RemoteException {}
            public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int p0, int[] p1) throws android.os.RemoteException { return null; }
            public void setUidMode(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setMode(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void resetAllModes(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setAudioRestriction(int p0, int p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException {}
            public void setUserRestrictions(android.os.Bundle p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
            public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, int p3, android.os.PackageTagsList p4) throws android.os.RemoteException {}
            public void removeUser(int p0) throws android.os.RemoteException {}
            public void startWatchingActive(int[] p0, com.android.internal.app.IAppOpsActiveCallback p1) throws android.os.RemoteException {}
            public void stopWatchingActive(com.android.internal.app.IAppOpsActiveCallback p0) throws android.os.RemoteException {}
            public boolean isOperationActive(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isProxying(int p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException { return false; }
            public void startWatchingStarted(int[] p0, com.android.internal.app.IAppOpsStartedCallback p1) throws android.os.RemoteException {}
            public void stopWatchingStarted(com.android.internal.app.IAppOpsStartedCallback p0) throws android.os.RemoteException {}
            public void startWatchingNoted(int[] p0, com.android.internal.app.IAppOpsNotedCallback p1) throws android.os.RemoteException {}
            public void stopWatchingNoted(com.android.internal.app.IAppOpsNotedCallback p0) throws android.os.RemoteException {}
            public void startWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
            public void stopWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
            public java.util.List<android.app.AsyncNotedAppOp> extractAsyncOps(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int checkOperationRaw(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public void reloadNonHistoricalState() throws android.os.RemoteException {}
            public void collectNoteOpCallsForValidation(java.lang.String p0, int p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
        }
    }
}
