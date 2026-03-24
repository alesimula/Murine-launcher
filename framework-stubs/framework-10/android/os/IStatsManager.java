package android.os;

public interface IStatsManager extends android.os.IInterface {
    public static final int FLAG_REQUIRE_STAGING = 1;
    public static final int FLAG_ROLLBACK_ENABLED = 2;
    public static final int FLAG_REQUIRE_LOW_LATENCY_MONITOR = 4;
    public void systemRunning() throws android.os.RemoteException;
    public void statsCompanionReady() throws android.os.RemoteException;
    public void informAnomalyAlarmFired() throws android.os.RemoteException;
    public void informPollAlarmFired() throws android.os.RemoteException;
    public void informAlarmForSubscriberTriggeringFired() throws android.os.RemoteException;
    public void informDeviceShutdown() throws android.os.RemoteException;
    public void informAllUidData(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void informOnePackage(java.lang.String p0, int p1, long p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void informOnePackageRemoved(java.lang.String p0, int p1) throws android.os.RemoteException;
    public byte[] getData(long p0, java.lang.String p1) throws android.os.RemoteException;
    public byte[] getMetadata(java.lang.String p0) throws android.os.RemoteException;
    public void addConfiguration(long p0, byte[] p1, java.lang.String p2) throws android.os.RemoteException;
    public void setDataFetchOperation(long p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException;
    public void removeDataFetchOperation(long p0, java.lang.String p1) throws android.os.RemoteException;
    public long[] setActiveConfigsChangedOperation(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeActiveConfigsChangedOperation(java.lang.String p0) throws android.os.RemoteException;
    public void removeConfiguration(long p0, java.lang.String p1) throws android.os.RemoteException;
    public void setBroadcastSubscriber(long p0, long p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException;
    public void unsetBroadcastSubscriber(long p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public void sendAppBreadcrumbAtom(int p0, int p1) throws android.os.RemoteException;
    public void registerPullerCallback(int p0, android.os.IStatsPullerCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public void unregisterPullerCallback(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void sendBinaryPushStateChangedAtom(java.lang.String p0, long p1, int p2, int p3, long[] p4) throws android.os.RemoteException;
    public void sendWatchdogRollbackOccurredAtom(int p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public long[] getRegisteredExperimentIds() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IStatsManager {
        private static final java.lang.String DESCRIPTOR = "android.os.IStatsManager";
        static final int TRANSACTION_systemRunning = 1;
        static final int TRANSACTION_statsCompanionReady = 2;
        static final int TRANSACTION_informAnomalyAlarmFired = 3;
        static final int TRANSACTION_informPollAlarmFired = 4;
        static final int TRANSACTION_informAlarmForSubscriberTriggeringFired = 5;
        static final int TRANSACTION_informDeviceShutdown = 6;
        static final int TRANSACTION_informAllUidData = 7;
        static final int TRANSACTION_informOnePackage = 8;
        static final int TRANSACTION_informOnePackageRemoved = 9;
        static final int TRANSACTION_getData = 10;
        static final int TRANSACTION_getMetadata = 11;
        static final int TRANSACTION_addConfiguration = 12;
        static final int TRANSACTION_setDataFetchOperation = 13;
        static final int TRANSACTION_removeDataFetchOperation = 14;
        static final int TRANSACTION_setActiveConfigsChangedOperation = 15;
        static final int TRANSACTION_removeActiveConfigsChangedOperation = 16;
        static final int TRANSACTION_removeConfiguration = 17;
        static final int TRANSACTION_setBroadcastSubscriber = 18;
        static final int TRANSACTION_unsetBroadcastSubscriber = 19;
        static final int TRANSACTION_sendAppBreadcrumbAtom = 20;
        static final int TRANSACTION_registerPullerCallback = 21;
        static final int TRANSACTION_unregisterPullerCallback = 22;
        static final int TRANSACTION_sendBinaryPushStateChangedAtom = 23;
        static final int TRANSACTION_sendWatchdogRollbackOccurredAtom = 24;
        static final int TRANSACTION_getRegisteredExperimentIds = 25;
        public Stub() { super(); }
        public static android.os.IStatsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IStatsManager p0) { return false; }
        public static android.os.IStatsManager getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IStatsManager {
            private android.os.IBinder mRemote;
            public static android.os.IStatsManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void systemRunning() throws android.os.RemoteException {}
            public void statsCompanionReady() throws android.os.RemoteException {}
            public void informAnomalyAlarmFired() throws android.os.RemoteException {}
            public void informPollAlarmFired() throws android.os.RemoteException {}
            public void informAlarmForSubscriberTriggeringFired() throws android.os.RemoteException {}
            public void informDeviceShutdown() throws android.os.RemoteException {}
            public void informAllUidData(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
            public void informOnePackage(java.lang.String p0, int p1, long p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void informOnePackageRemoved(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public byte[] getData(long p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public byte[] getMetadata(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void addConfiguration(long p0, byte[] p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setDataFetchOperation(long p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
            public void removeDataFetchOperation(long p0, java.lang.String p1) throws android.os.RemoteException {}
            public long[] setActiveConfigsChangedOperation(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void removeActiveConfigsChangedOperation(java.lang.String p0) throws android.os.RemoteException {}
            public void removeConfiguration(long p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setBroadcastSubscriber(long p0, long p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException {}
            public void unsetBroadcastSubscriber(long p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
            public void sendAppBreadcrumbAtom(int p0, int p1) throws android.os.RemoteException {}
            public void registerPullerCallback(int p0, android.os.IStatsPullerCallback p1, java.lang.String p2) throws android.os.RemoteException {}
            public void unregisterPullerCallback(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void sendBinaryPushStateChangedAtom(java.lang.String p0, long p1, int p2, int p3, long[] p4) throws android.os.RemoteException {}
            public void sendWatchdogRollbackOccurredAtom(int p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public long[] getRegisteredExperimentIds() throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.os.IStatsManager {
        public Default() {}
        public void systemRunning() throws android.os.RemoteException {}
        public void statsCompanionReady() throws android.os.RemoteException {}
        public void informAnomalyAlarmFired() throws android.os.RemoteException {}
        public void informPollAlarmFired() throws android.os.RemoteException {}
        public void informAlarmForSubscriberTriggeringFired() throws android.os.RemoteException {}
        public void informDeviceShutdown() throws android.os.RemoteException {}
        public void informAllUidData(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void informOnePackage(java.lang.String p0, int p1, long p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void informOnePackageRemoved(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public byte[] getData(long p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public byte[] getMetadata(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void addConfiguration(long p0, byte[] p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setDataFetchOperation(long p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException {}
        public void removeDataFetchOperation(long p0, java.lang.String p1) throws android.os.RemoteException {}
        public long[] setActiveConfigsChangedOperation(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void removeActiveConfigsChangedOperation(java.lang.String p0) throws android.os.RemoteException {}
        public void removeConfiguration(long p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setBroadcastSubscriber(long p0, long p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException {}
        public void unsetBroadcastSubscriber(long p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
        public void sendAppBreadcrumbAtom(int p0, int p1) throws android.os.RemoteException {}
        public void registerPullerCallback(int p0, android.os.IStatsPullerCallback p1, java.lang.String p2) throws android.os.RemoteException {}
        public void unregisterPullerCallback(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void sendBinaryPushStateChangedAtom(java.lang.String p0, long p1, int p2, int p3, long[] p4) throws android.os.RemoteException {}
        public void sendWatchdogRollbackOccurredAtom(int p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public long[] getRegisteredExperimentIds() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
