package android.service.oemlock;

public interface IOemLockService extends android.os.IInterface {
    public java.lang.String getLockName() throws android.os.RemoteException;
    public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) throws android.os.RemoteException;
    public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException;
    public void setOemUnlockAllowedByUser(boolean p0) throws android.os.RemoteException;
    public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException;
    public boolean isOemUnlockAllowed() throws android.os.RemoteException;
    public boolean isDeviceOemUnlocked() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.oemlock.IOemLockService {
        private static final java.lang.String DESCRIPTOR = "android.service.oemlock.IOemLockService";
        static final int TRANSACTION_getLockName = 1;
        static final int TRANSACTION_setOemUnlockAllowedByCarrier = 2;
        static final int TRANSACTION_isOemUnlockAllowedByCarrier = 3;
        static final int TRANSACTION_setOemUnlockAllowedByUser = 4;
        static final int TRANSACTION_isOemUnlockAllowedByUser = 5;
        static final int TRANSACTION_isOemUnlockAllowed = 6;
        static final int TRANSACTION_isDeviceOemUnlocked = 7;
        public Stub() { super(); }
        public static android.service.oemlock.IOemLockService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.oemlock.IOemLockService p0) { return false; }
        public static android.service.oemlock.IOemLockService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.oemlock.IOemLockService {
            private android.os.IBinder mRemote;
            public static android.service.oemlock.IOemLockService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getLockName() throws android.os.RemoteException { return null; }
            public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) throws android.os.RemoteException {}
            public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException { return false; }
            public void setOemUnlockAllowedByUser(boolean p0) throws android.os.RemoteException {}
            public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException { return false; }
            public boolean isOemUnlockAllowed() throws android.os.RemoteException { return false; }
            public boolean isDeviceOemUnlocked() throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.service.oemlock.IOemLockService {
        public Default() {}
        public java.lang.String getLockName() throws android.os.RemoteException { return null; }
        public void setOemUnlockAllowedByCarrier(boolean p0, byte[] p1) throws android.os.RemoteException {}
        public boolean isOemUnlockAllowedByCarrier() throws android.os.RemoteException { return false; }
        public void setOemUnlockAllowedByUser(boolean p0) throws android.os.RemoteException {}
        public boolean isOemUnlockAllowedByUser() throws android.os.RemoteException { return false; }
        public boolean isOemUnlockAllowed() throws android.os.RemoteException { return false; }
        public boolean isDeviceOemUnlocked() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
