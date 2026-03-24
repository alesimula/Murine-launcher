package android.app;

public interface IAlarmManager extends android.os.IInterface {
    public void set(java.lang.String p0, int p1, long p2, long p3, long p4, int p5, android.app.PendingIntent p6, android.app.IAlarmListener p7, java.lang.String p8, android.os.WorkSource p9, android.app.AlarmManager.AlarmClockInfo p10) throws android.os.RemoteException;
    public boolean setTime(long p0) throws android.os.RemoteException;
    public void setTimeZone(java.lang.String p0) throws android.os.RemoteException;
    public void remove(android.app.PendingIntent p0, android.app.IAlarmListener p1) throws android.os.RemoteException;
    public long getNextWakeFromIdleTime() throws android.os.RemoteException;
    public android.app.AlarmManager.AlarmClockInfo getNextAlarmClock(int p0) throws android.os.RemoteException;
    public long currentNetworkTimeMillis() throws android.os.RemoteException;
    public boolean canScheduleExactAlarms(java.lang.String p0) throws android.os.RemoteException;
    public boolean hasScheduleExactAlarm(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getConfigVersion() throws android.os.RemoteException;

    public static class Default implements android.app.IAlarmManager {
        public Default() {}
        public void set(java.lang.String p0, int p1, long p2, long p3, long p4, int p5, android.app.PendingIntent p6, android.app.IAlarmListener p7, java.lang.String p8, android.os.WorkSource p9, android.app.AlarmManager.AlarmClockInfo p10) throws android.os.RemoteException {}
        public boolean setTime(long p0) throws android.os.RemoteException { return false; }
        public void setTimeZone(java.lang.String p0) throws android.os.RemoteException {}
        public void remove(android.app.PendingIntent p0, android.app.IAlarmListener p1) throws android.os.RemoteException {}
        public long getNextWakeFromIdleTime() throws android.os.RemoteException { return 0L; }
        public android.app.AlarmManager.AlarmClockInfo getNextAlarmClock(int p0) throws android.os.RemoteException { return null; }
        public long currentNetworkTimeMillis() throws android.os.RemoteException { return 0L; }
        public boolean canScheduleExactAlarms(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean hasScheduleExactAlarm(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public int getConfigVersion() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IAlarmManager {
        public static final java.lang.String DESCRIPTOR = "android.app.IAlarmManager";
        static final int TRANSACTION_set = 1;
        static final int TRANSACTION_setTime = 2;
        static final int TRANSACTION_setTimeZone = 3;
        static final int TRANSACTION_remove = 4;
        static final int TRANSACTION_getNextWakeFromIdleTime = 5;
        static final int TRANSACTION_getNextAlarmClock = 6;
        static final int TRANSACTION_currentNetworkTimeMillis = 7;
        static final int TRANSACTION_canScheduleExactAlarms = 8;
        static final int TRANSACTION_hasScheduleExactAlarm = 9;
        static final int TRANSACTION_getConfigVersion = 10;
        public Stub() { super(); }
        public static android.app.IAlarmManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IAlarmManager p0) { return false; }
        public static android.app.IAlarmManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IAlarmManager {
            private android.os.IBinder mRemote;
            public static android.app.IAlarmManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void set(java.lang.String p0, int p1, long p2, long p3, long p4, int p5, android.app.PendingIntent p6, android.app.IAlarmListener p7, java.lang.String p8, android.os.WorkSource p9, android.app.AlarmManager.AlarmClockInfo p10) throws android.os.RemoteException {}
            public boolean setTime(long p0) throws android.os.RemoteException { return false; }
            public void setTimeZone(java.lang.String p0) throws android.os.RemoteException {}
            public void remove(android.app.PendingIntent p0, android.app.IAlarmListener p1) throws android.os.RemoteException {}
            public long getNextWakeFromIdleTime() throws android.os.RemoteException { return 0L; }
            public android.app.AlarmManager.AlarmClockInfo getNextAlarmClock(int p0) throws android.os.RemoteException { return null; }
            public long currentNetworkTimeMillis() throws android.os.RemoteException { return 0L; }
            public boolean canScheduleExactAlarms(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean hasScheduleExactAlarm(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public int getConfigVersion() throws android.os.RemoteException { return 0; }
        }
    }
}
