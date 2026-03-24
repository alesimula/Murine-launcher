package android.system.suspend.internal;

public interface ISuspendControlServiceInternal extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.system.suspend.internal.ISuspendControlServiceInternal";
    public static final int WAKE_LOCK_INFO_ACTIVE_COUNT = 1;
    public static final int WAKE_LOCK_INFO_LAST_CHANGE = 2;
    public static final int WAKE_LOCK_INFO_MAX_TIME = 4;
    public static final int WAKE_LOCK_INFO_TOTAL_TIME = 8;
    public static final int WAKE_LOCK_INFO_IS_ACTIVE = 16;
    public static final int WAKE_LOCK_INFO_ACTIVE_TIME = 32;
    public static final int WAKE_LOCK_INFO_IS_KERNEL_WAKELOCK = 64;
    public static final int WAKE_LOCK_INFO_PID = 128;
    public static final int WAKE_LOCK_INFO_EVENT_COUNT = 256;
    public static final int WAKE_LOCK_INFO_EXPIRE_COUNT = 512;
    public static final int WAKE_LOCK_INFO_PREVENT_SUSPEND_TIME = 1024;
    public static final int WAKE_LOCK_INFO_WAKEUP_COUNT = 2048;
    public static final int WAKE_LOCK_INFO_ALL_FIELDS = 4095;
    public boolean enableAutosuspend(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean forceSuspend() throws android.os.RemoteException;
    public android.system.suspend.internal.WakeLockInfo[] getWakeLockStats() throws android.os.RemoteException;
    public android.system.suspend.internal.WakeLockInfo[] getWakeLockStatsFiltered(int p0) throws android.os.RemoteException;
    public android.system.suspend.internal.WakeupInfo[] getWakeupStats() throws android.os.RemoteException;
    public android.system.suspend.internal.SuspendInfo getSuspendStats() throws android.os.RemoteException;

    public static class Default implements android.system.suspend.internal.ISuspendControlServiceInternal {
        public Default() {}
        public boolean enableAutosuspend(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public boolean forceSuspend() throws android.os.RemoteException { return false; }
        public android.system.suspend.internal.WakeLockInfo[] getWakeLockStats() throws android.os.RemoteException { return null; }
        public android.system.suspend.internal.WakeLockInfo[] getWakeLockStatsFiltered(int p0) throws android.os.RemoteException { return null; }
        public android.system.suspend.internal.WakeupInfo[] getWakeupStats() throws android.os.RemoteException { return null; }
        public android.system.suspend.internal.SuspendInfo getSuspendStats() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.system.suspend.internal.ISuspendControlServiceInternal {
        static final int TRANSACTION_enableAutosuspend = 1;
        static final int TRANSACTION_forceSuspend = 2;
        static final int TRANSACTION_getWakeLockStats = 3;
        static final int TRANSACTION_getWakeLockStatsFiltered = 4;
        static final int TRANSACTION_getWakeupStats = 5;
        static final int TRANSACTION_getSuspendStats = 6;
        public Stub() { super(); }
        public static android.system.suspend.internal.ISuspendControlServiceInternal asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.system.suspend.internal.ISuspendControlServiceInternal {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean enableAutosuspend(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public boolean forceSuspend() throws android.os.RemoteException { return false; }
            public android.system.suspend.internal.WakeLockInfo[] getWakeLockStats() throws android.os.RemoteException { return null; }
            public android.system.suspend.internal.WakeLockInfo[] getWakeLockStatsFiltered(int p0) throws android.os.RemoteException { return null; }
            public android.system.suspend.internal.WakeupInfo[] getWakeupStats() throws android.os.RemoteException { return null; }
            public android.system.suspend.internal.SuspendInfo getSuspendStats() throws android.os.RemoteException { return null; }
        }
    }
}
