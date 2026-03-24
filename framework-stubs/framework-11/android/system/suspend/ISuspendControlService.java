package android.system.suspend;

public interface ISuspendControlService extends android.os.IInterface {
    public boolean enableAutosuspend() throws android.os.RemoteException;
    public boolean registerCallback(android.system.suspend.ISuspendCallback p0) throws android.os.RemoteException;
    public boolean forceSuspend() throws android.os.RemoteException;
    public android.system.suspend.WakeLockInfo[] getWakeLockStats() throws android.os.RemoteException;

    public static class Default implements android.system.suspend.ISuspendControlService {
        public Default() {}
        public boolean enableAutosuspend() throws android.os.RemoteException { return false; }
        public boolean registerCallback(android.system.suspend.ISuspendCallback p0) throws android.os.RemoteException { return false; }
        public boolean forceSuspend() throws android.os.RemoteException { return false; }
        public android.system.suspend.WakeLockInfo[] getWakeLockStats() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.system.suspend.ISuspendControlService {
        private static final java.lang.String DESCRIPTOR = null;
        static final int TRANSACTION_enableAutosuspend = 1;
        static final int TRANSACTION_registerCallback = 2;
        static final int TRANSACTION_forceSuspend = 3;
        static final int TRANSACTION_getWakeLockStats = 4;
        public Stub() { super(); }
        public static android.system.suspend.ISuspendControlService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.system.suspend.ISuspendControlService p0) { return false; }
        public static android.system.suspend.ISuspendControlService getDefaultImpl() { return null; }

        private static class Proxy implements android.system.suspend.ISuspendControlService {
            private android.os.IBinder mRemote;
            public static android.system.suspend.ISuspendControlService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean enableAutosuspend() throws android.os.RemoteException { return false; }
            public boolean registerCallback(android.system.suspend.ISuspendCallback p0) throws android.os.RemoteException { return false; }
            public boolean forceSuspend() throws android.os.RemoteException { return false; }
            public android.system.suspend.WakeLockInfo[] getWakeLockStats() throws android.os.RemoteException { return null; }
        }
    }
}
