package android.service.persistentdata;

public interface IPersistentDataBlockService extends android.os.IInterface {
    public int write(byte[] p0) throws android.os.RemoteException;
    public byte[] read() throws android.os.RemoteException;
    public void wipe() throws android.os.RemoteException;
    public int getDataBlockSize() throws android.os.RemoteException;
    public long getMaximumDataBlockSize() throws android.os.RemoteException;
    public void setOemUnlockEnabled(boolean p0) throws android.os.RemoteException;
    public boolean getOemUnlockEnabled() throws android.os.RemoteException;
    public int getFlashLockState() throws android.os.RemoteException;
    public boolean hasFrpCredentialHandle() throws android.os.RemoteException;
    public java.lang.String getPersistentDataPackageName() throws android.os.RemoteException;

    public static class Default implements android.service.persistentdata.IPersistentDataBlockService {
        public Default() {}
        public int write(byte[] p0) throws android.os.RemoteException { return 0; }
        public byte[] read() throws android.os.RemoteException { return null; }
        public void wipe() throws android.os.RemoteException {}
        public int getDataBlockSize() throws android.os.RemoteException { return 0; }
        public long getMaximumDataBlockSize() throws android.os.RemoteException { return 0L; }
        public void setOemUnlockEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean getOemUnlockEnabled() throws android.os.RemoteException { return false; }
        public int getFlashLockState() throws android.os.RemoteException { return 0; }
        public boolean hasFrpCredentialHandle() throws android.os.RemoteException { return false; }
        public java.lang.String getPersistentDataPackageName() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.persistentdata.IPersistentDataBlockService {
        public static final java.lang.String DESCRIPTOR = "android.service.persistentdata.IPersistentDataBlockService";
        static final int TRANSACTION_write = 1;
        static final int TRANSACTION_read = 2;
        static final int TRANSACTION_wipe = 3;
        static final int TRANSACTION_getDataBlockSize = 4;
        static final int TRANSACTION_getMaximumDataBlockSize = 5;
        static final int TRANSACTION_setOemUnlockEnabled = 6;
        static final int TRANSACTION_getOemUnlockEnabled = 7;
        static final int TRANSACTION_getFlashLockState = 8;
        static final int TRANSACTION_hasFrpCredentialHandle = 9;
        static final int TRANSACTION_getPersistentDataPackageName = 10;
        public Stub() { super(); }
        public static android.service.persistentdata.IPersistentDataBlockService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.persistentdata.IPersistentDataBlockService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int write(byte[] p0) throws android.os.RemoteException { return 0; }
            public byte[] read() throws android.os.RemoteException { return null; }
            public void wipe() throws android.os.RemoteException {}
            public int getDataBlockSize() throws android.os.RemoteException { return 0; }
            public long getMaximumDataBlockSize() throws android.os.RemoteException { return 0L; }
            public void setOemUnlockEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean getOemUnlockEnabled() throws android.os.RemoteException { return false; }
            public int getFlashLockState() throws android.os.RemoteException { return 0; }
            public boolean hasFrpCredentialHandle() throws android.os.RemoteException { return false; }
            public java.lang.String getPersistentDataPackageName() throws android.os.RemoteException { return null; }
        }
    }
}
