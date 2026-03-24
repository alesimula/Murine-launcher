package android.os;

public interface IStatsCompanionService extends android.os.IInterface {
    public void statsdReady() throws android.os.RemoteException;
    public void setAnomalyAlarm(long p0) throws android.os.RemoteException;
    public void cancelAnomalyAlarm() throws android.os.RemoteException;
    public void setPullingAlarm(long p0) throws android.os.RemoteException;
    public void cancelPullingAlarm() throws android.os.RemoteException;
    public void setAlarmForSubscriberTriggering(long p0) throws android.os.RemoteException;
    public void cancelAlarmForSubscriberTriggering() throws android.os.RemoteException;
    public android.os.StatsLogEventWrapper[] pullData(int p0) throws android.os.RemoteException;
    public void sendDataBroadcast(android.os.IBinder p0, long p1) throws android.os.RemoteException;
    public void sendActiveConfigsChangedBroadcast(android.os.IBinder p0, long[] p1) throws android.os.RemoteException;
    public void sendSubscriberBroadcast(android.os.IBinder p0, long p1, long p2, long p3, long p4, java.lang.String[] p5, android.os.StatsDimensionsValue p6) throws android.os.RemoteException;
    public void triggerUidSnapshot() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IStatsCompanionService {
        private static final java.lang.String DESCRIPTOR = "android.os.IStatsCompanionService";
        static final int TRANSACTION_statsdReady = 1;
        static final int TRANSACTION_setAnomalyAlarm = 2;
        static final int TRANSACTION_cancelAnomalyAlarm = 3;
        static final int TRANSACTION_setPullingAlarm = 4;
        static final int TRANSACTION_cancelPullingAlarm = 5;
        static final int TRANSACTION_setAlarmForSubscriberTriggering = 6;
        static final int TRANSACTION_cancelAlarmForSubscriberTriggering = 7;
        static final int TRANSACTION_pullData = 8;
        static final int TRANSACTION_sendDataBroadcast = 9;
        static final int TRANSACTION_sendActiveConfigsChangedBroadcast = 10;
        static final int TRANSACTION_sendSubscriberBroadcast = 11;
        static final int TRANSACTION_triggerUidSnapshot = 12;
        public Stub() { super(); }
        public static android.os.IStatsCompanionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IStatsCompanionService p0) { return false; }
        public static android.os.IStatsCompanionService getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IStatsCompanionService {
            private android.os.IBinder mRemote;
            public static android.os.IStatsCompanionService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void statsdReady() throws android.os.RemoteException {}
            public void setAnomalyAlarm(long p0) throws android.os.RemoteException {}
            public void cancelAnomalyAlarm() throws android.os.RemoteException {}
            public void setPullingAlarm(long p0) throws android.os.RemoteException {}
            public void cancelPullingAlarm() throws android.os.RemoteException {}
            public void setAlarmForSubscriberTriggering(long p0) throws android.os.RemoteException {}
            public void cancelAlarmForSubscriberTriggering() throws android.os.RemoteException {}
            public android.os.StatsLogEventWrapper[] pullData(int p0) throws android.os.RemoteException { return null; }
            public void sendDataBroadcast(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
            public void sendActiveConfigsChangedBroadcast(android.os.IBinder p0, long[] p1) throws android.os.RemoteException {}
            public void sendSubscriberBroadcast(android.os.IBinder p0, long p1, long p2, long p3, long p4, java.lang.String[] p5, android.os.StatsDimensionsValue p6) throws android.os.RemoteException {}
            public void triggerUidSnapshot() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.os.IStatsCompanionService {
        public Default() {}
        public void statsdReady() throws android.os.RemoteException {}
        public void setAnomalyAlarm(long p0) throws android.os.RemoteException {}
        public void cancelAnomalyAlarm() throws android.os.RemoteException {}
        public void setPullingAlarm(long p0) throws android.os.RemoteException {}
        public void cancelPullingAlarm() throws android.os.RemoteException {}
        public void setAlarmForSubscriberTriggering(long p0) throws android.os.RemoteException {}
        public void cancelAlarmForSubscriberTriggering() throws android.os.RemoteException {}
        public android.os.StatsLogEventWrapper[] pullData(int p0) throws android.os.RemoteException { return null; }
        public void sendDataBroadcast(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
        public void sendActiveConfigsChangedBroadcast(android.os.IBinder p0, long[] p1) throws android.os.RemoteException {}
        public void sendSubscriberBroadcast(android.os.IBinder p0, long p1, long p2, long p3, long p4, java.lang.String[] p5, android.os.StatsDimensionsValue p6) throws android.os.RemoteException {}
        public void triggerUidSnapshot() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
