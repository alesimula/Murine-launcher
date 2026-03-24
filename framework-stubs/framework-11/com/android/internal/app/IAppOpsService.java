package com.android.internal.app;

public interface IAppOpsService extends android.os.IInterface {
    public int checkOperation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5, boolean p6) throws android.os.RemoteException;
    public int startOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7, boolean p8) throws android.os.RemoteException;
    public void finishOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void startWatchingMode(int p0, java.lang.String p1, com.android.internal.app.IAppOpsCallback p2) throws android.os.RemoteException;
    public void stopWatchingMode(com.android.internal.app.IAppOpsCallback p0) throws android.os.RemoteException;
    public int permissionToOpCode(java.lang.String p0) throws android.os.RemoteException;
    public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean shouldCollectNotes(int p0) throws android.os.RemoteException;
    public void setCameraAudioRestriction(int p0) throws android.os.RemoteException;
    public int noteProxyOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, java.lang.String p6, boolean p7, java.lang.String p8, boolean p9) throws android.os.RemoteException;
    public int checkPackage(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.RuntimeAppOpAccessMessage collectRuntimeAppOpAccessMessage() throws android.os.RemoteException;
    public com.android.internal.app.MessageSamplingConfig reportRuntimeAppOpAccessMessageAndGetConfig(java.lang.String p0, android.app.SyncNotedAppOp p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) throws android.os.RemoteException;
    public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) throws android.os.RemoteException;
    public void getHistoricalOps(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, long p5, long p6, int p7, android.os.RemoteCallback p8) throws android.os.RemoteException;
    public void getHistoricalOpsFromDiskRaw(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, long p5, long p6, int p7, android.os.RemoteCallback p8) throws android.os.RemoteException;
    public void offsetHistory(long p0) throws android.os.RemoteException;
    public void setHistoryParameters(int p0, long p1, int p2) throws android.os.RemoteException;
    public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) throws android.os.RemoteException;
    public void resetHistoryParameters() throws android.os.RemoteException;
    public void clearHistory() throws android.os.RemoteException;
    public void rebootHistory(long p0) throws android.os.RemoteException;
    public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int p0, int[] p1) throws android.os.RemoteException;
    public void setUidMode(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setMode(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void resetAllModes(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setAudioRestriction(int p0, int p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException;
    public void setUserRestrictions(android.os.Bundle p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, int p3, java.lang.String[] p4) throws android.os.RemoteException;
    public void removeUser(int p0) throws android.os.RemoteException;
    public void startWatchingActive(int[] p0, com.android.internal.app.IAppOpsActiveCallback p1) throws android.os.RemoteException;
    public void stopWatchingActive(com.android.internal.app.IAppOpsActiveCallback p0) throws android.os.RemoteException;
    public boolean isOperationActive(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void startWatchingStarted(int[] p0, com.android.internal.app.IAppOpsStartedCallback p1) throws android.os.RemoteException;
    public void stopWatchingStarted(com.android.internal.app.IAppOpsStartedCallback p0) throws android.os.RemoteException;
    public void startWatchingModeWithFlags(int p0, java.lang.String p1, int p2, com.android.internal.app.IAppOpsCallback p3) throws android.os.RemoteException;
    public void startWatchingNoted(int[] p0, com.android.internal.app.IAppOpsNotedCallback p1) throws android.os.RemoteException;
    public void stopWatchingNoted(com.android.internal.app.IAppOpsNotedCallback p0) throws android.os.RemoteException;
    public void startWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException;
    public void stopWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException;
    public java.util.List<android.app.AsyncNotedAppOp> extractAsyncOps(java.lang.String p0) throws android.os.RemoteException;
    public int checkOperationRaw(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void reloadNonHistoricalState() throws android.os.RemoteException;
    public void collectNoteOpCallsForValidation(java.lang.String p0, int p1, java.lang.String p2, long p3) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IAppOpsService {
        public Default() {}
        public int checkOperation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5, boolean p6) throws android.os.RemoteException { return 0; }
        public int startOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7, boolean p8) throws android.os.RemoteException { return 0; }
        public void finishOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void startWatchingMode(int p0, java.lang.String p1, com.android.internal.app.IAppOpsCallback p2) throws android.os.RemoteException {}
        public void stopWatchingMode(com.android.internal.app.IAppOpsCallback p0) throws android.os.RemoteException {}
        public int permissionToOpCode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public boolean shouldCollectNotes(int p0) throws android.os.RemoteException { return false; }
        public void setCameraAudioRestriction(int p0) throws android.os.RemoteException {}
        public int noteProxyOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, java.lang.String p6, boolean p7, java.lang.String p8, boolean p9) throws android.os.RemoteException { return 0; }
        public int checkPackage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public android.app.RuntimeAppOpAccessMessage collectRuntimeAppOpAccessMessage() throws android.os.RemoteException { return null; }
        public com.android.internal.app.MessageSamplingConfig reportRuntimeAppOpAccessMessageAndGetConfig(java.lang.String p0, android.app.SyncNotedAppOp p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) throws android.os.RemoteException { return null; }
        public void getHistoricalOps(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, long p5, long p6, int p7, android.os.RemoteCallback p8) throws android.os.RemoteException {}
        public void getHistoricalOpsFromDiskRaw(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, long p5, long p6, int p7, android.os.RemoteCallback p8) throws android.os.RemoteException {}
        public void offsetHistory(long p0) throws android.os.RemoteException {}
        public void setHistoryParameters(int p0, long p1, int p2) throws android.os.RemoteException {}
        public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) throws android.os.RemoteException {}
        public void resetHistoryParameters() throws android.os.RemoteException {}
        public void clearHistory() throws android.os.RemoteException {}
        public void rebootHistory(long p0) throws android.os.RemoteException {}
        public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int p0, int[] p1) throws android.os.RemoteException { return null; }
        public void setUidMode(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setMode(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void resetAllModes(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setAudioRestriction(int p0, int p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException {}
        public void setUserRestrictions(android.os.Bundle p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
        public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, int p3, java.lang.String[] p4) throws android.os.RemoteException {}
        public void removeUser(int p0) throws android.os.RemoteException {}
        public void startWatchingActive(int[] p0, com.android.internal.app.IAppOpsActiveCallback p1) throws android.os.RemoteException {}
        public void stopWatchingActive(com.android.internal.app.IAppOpsActiveCallback p0) throws android.os.RemoteException {}
        public boolean isOperationActive(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void startWatchingStarted(int[] p0, com.android.internal.app.IAppOpsStartedCallback p1) throws android.os.RemoteException {}
        public void stopWatchingStarted(com.android.internal.app.IAppOpsStartedCallback p0) throws android.os.RemoteException {}
        public void startWatchingModeWithFlags(int p0, java.lang.String p1, int p2, com.android.internal.app.IAppOpsCallback p3) throws android.os.RemoteException {}
        public void startWatchingNoted(int[] p0, com.android.internal.app.IAppOpsNotedCallback p1) throws android.os.RemoteException {}
        public void stopWatchingNoted(com.android.internal.app.IAppOpsNotedCallback p0) throws android.os.RemoteException {}
        public void startWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
        public void stopWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
        public java.util.List<android.app.AsyncNotedAppOp> extractAsyncOps(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int checkOperationRaw(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void reloadNonHistoricalState() throws android.os.RemoteException {}
        public void collectNoteOpCallsForValidation(java.lang.String p0, int p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IAppOpsService {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IAppOpsService";
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
        static final int TRANSACTION_noteProxyOperation = 11;
        static final int TRANSACTION_checkPackage = 12;
        static final int TRANSACTION_collectRuntimeAppOpAccessMessage = 13;
        static final int TRANSACTION_reportRuntimeAppOpAccessMessageAndGetConfig = 14;
        static final int TRANSACTION_getPackagesForOps = 15;
        static final int TRANSACTION_getOpsForPackage = 16;
        static final int TRANSACTION_getHistoricalOps = 17;
        static final int TRANSACTION_getHistoricalOpsFromDiskRaw = 18;
        static final int TRANSACTION_offsetHistory = 19;
        static final int TRANSACTION_setHistoryParameters = 20;
        static final int TRANSACTION_addHistoricalOps = 21;
        static final int TRANSACTION_resetHistoryParameters = 22;
        static final int TRANSACTION_clearHistory = 23;
        static final int TRANSACTION_rebootHistory = 24;
        static final int TRANSACTION_getUidOps = 25;
        static final int TRANSACTION_setUidMode = 26;
        static final int TRANSACTION_setMode = 27;
        static final int TRANSACTION_resetAllModes = 28;
        static final int TRANSACTION_setAudioRestriction = 29;
        static final int TRANSACTION_setUserRestrictions = 30;
        static final int TRANSACTION_setUserRestriction = 31;
        static final int TRANSACTION_removeUser = 32;
        static final int TRANSACTION_startWatchingActive = 33;
        static final int TRANSACTION_stopWatchingActive = 34;
        static final int TRANSACTION_isOperationActive = 35;
        static final int TRANSACTION_startWatchingStarted = 36;
        static final int TRANSACTION_stopWatchingStarted = 37;
        static final int TRANSACTION_startWatchingModeWithFlags = 38;
        static final int TRANSACTION_startWatchingNoted = 39;
        static final int TRANSACTION_stopWatchingNoted = 40;
        static final int TRANSACTION_startWatchingAsyncNoted = 41;
        static final int TRANSACTION_stopWatchingAsyncNoted = 42;
        static final int TRANSACTION_extractAsyncOps = 43;
        static final int TRANSACTION_checkOperationRaw = 44;
        static final int TRANSACTION_reloadNonHistoricalState = 45;
        static final int TRANSACTION_collectNoteOpCallsForValidation = 46;
        public Stub() { super(); }
        public static com.android.internal.app.IAppOpsService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.IAppOpsService p0) { return false; }
        public static com.android.internal.app.IAppOpsService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.IAppOpsService {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.IAppOpsService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int checkOperation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5, boolean p6) throws android.os.RemoteException { return 0; }
            public int startOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7, boolean p8) throws android.os.RemoteException { return 0; }
            public void finishOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void startWatchingMode(int p0, java.lang.String p1, com.android.internal.app.IAppOpsCallback p2) throws android.os.RemoteException {}
            public void stopWatchingMode(com.android.internal.app.IAppOpsCallback p0) throws android.os.RemoteException {}
            public int permissionToOpCode(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public boolean shouldCollectNotes(int p0) throws android.os.RemoteException { return false; }
            public void setCameraAudioRestriction(int p0) throws android.os.RemoteException {}
            public int noteProxyOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, java.lang.String p6, boolean p7, java.lang.String p8, boolean p9) throws android.os.RemoteException { return 0; }
            public int checkPackage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public android.app.RuntimeAppOpAccessMessage collectRuntimeAppOpAccessMessage() throws android.os.RemoteException { return null; }
            public com.android.internal.app.MessageSamplingConfig reportRuntimeAppOpAccessMessageAndGetConfig(java.lang.String p0, android.app.SyncNotedAppOp p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) throws android.os.RemoteException { return null; }
            public void getHistoricalOps(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, long p5, long p6, int p7, android.os.RemoteCallback p8) throws android.os.RemoteException {}
            public void getHistoricalOpsFromDiskRaw(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, long p5, long p6, int p7, android.os.RemoteCallback p8) throws android.os.RemoteException {}
            public void offsetHistory(long p0) throws android.os.RemoteException {}
            public void setHistoryParameters(int p0, long p1, int p2) throws android.os.RemoteException {}
            public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) throws android.os.RemoteException {}
            public void resetHistoryParameters() throws android.os.RemoteException {}
            public void clearHistory() throws android.os.RemoteException {}
            public void rebootHistory(long p0) throws android.os.RemoteException {}
            public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int p0, int[] p1) throws android.os.RemoteException { return null; }
            public void setUidMode(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setMode(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void resetAllModes(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setAudioRestriction(int p0, int p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException {}
            public void setUserRestrictions(android.os.Bundle p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
            public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, int p3, java.lang.String[] p4) throws android.os.RemoteException {}
            public void removeUser(int p0) throws android.os.RemoteException {}
            public void startWatchingActive(int[] p0, com.android.internal.app.IAppOpsActiveCallback p1) throws android.os.RemoteException {}
            public void stopWatchingActive(com.android.internal.app.IAppOpsActiveCallback p0) throws android.os.RemoteException {}
            public boolean isOperationActive(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void startWatchingStarted(int[] p0, com.android.internal.app.IAppOpsStartedCallback p1) throws android.os.RemoteException {}
            public void stopWatchingStarted(com.android.internal.app.IAppOpsStartedCallback p0) throws android.os.RemoteException {}
            public void startWatchingModeWithFlags(int p0, java.lang.String p1, int p2, com.android.internal.app.IAppOpsCallback p3) throws android.os.RemoteException {}
            public void startWatchingNoted(int[] p0, com.android.internal.app.IAppOpsNotedCallback p1) throws android.os.RemoteException {}
            public void stopWatchingNoted(com.android.internal.app.IAppOpsNotedCallback p0) throws android.os.RemoteException {}
            public void startWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
            public void stopWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
            public java.util.List<android.app.AsyncNotedAppOp> extractAsyncOps(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int checkOperationRaw(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void reloadNonHistoricalState() throws android.os.RemoteException {}
            public void collectNoteOpCallsForValidation(java.lang.String p0, int p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
        }
    }
}
