package android.os.image;

public interface IDynamicSystemService extends android.os.IInterface {
    public boolean startInstallation(long p0, long p1) throws android.os.RemoteException;
    public android.gsi.GsiProgress getInstallationProgress() throws android.os.RemoteException;
    public boolean abort() throws android.os.RemoteException;
    public boolean isInUse() throws android.os.RemoteException;
    public boolean isInstalled() throws android.os.RemoteException;
    public boolean isEnabled() throws android.os.RemoteException;
    public boolean remove() throws android.os.RemoteException;
    public boolean setEnable(boolean p0) throws android.os.RemoteException;
    public boolean write(byte[] p0) throws android.os.RemoteException;
    public boolean commit() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.image.IDynamicSystemService {
        private static final java.lang.String DESCRIPTOR = "android.os.image.IDynamicSystemService";
        static final int TRANSACTION_startInstallation = 1;
        static final int TRANSACTION_getInstallationProgress = 2;
        static final int TRANSACTION_abort = 3;
        static final int TRANSACTION_isInUse = 4;
        static final int TRANSACTION_isInstalled = 5;
        static final int TRANSACTION_isEnabled = 6;
        static final int TRANSACTION_remove = 7;
        static final int TRANSACTION_setEnable = 8;
        static final int TRANSACTION_write = 9;
        static final int TRANSACTION_commit = 10;
        public Stub() { super(); }
        public static android.os.image.IDynamicSystemService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.image.IDynamicSystemService p0) { return false; }
        public static android.os.image.IDynamicSystemService getDefaultImpl() { return null; }

        private static class Proxy implements android.os.image.IDynamicSystemService {
            private android.os.IBinder mRemote;
            public static android.os.image.IDynamicSystemService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean startInstallation(long p0, long p1) throws android.os.RemoteException { return false; }
            public android.gsi.GsiProgress getInstallationProgress() throws android.os.RemoteException { return null; }
            public boolean abort() throws android.os.RemoteException { return false; }
            public boolean isInUse() throws android.os.RemoteException { return false; }
            public boolean isInstalled() throws android.os.RemoteException { return false; }
            public boolean isEnabled() throws android.os.RemoteException { return false; }
            public boolean remove() throws android.os.RemoteException { return false; }
            public boolean setEnable(boolean p0) throws android.os.RemoteException { return false; }
            public boolean write(byte[] p0) throws android.os.RemoteException { return false; }
            public boolean commit() throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.os.image.IDynamicSystemService {
        public Default() {}
        public boolean startInstallation(long p0, long p1) throws android.os.RemoteException { return false; }
        public android.gsi.GsiProgress getInstallationProgress() throws android.os.RemoteException { return null; }
        public boolean abort() throws android.os.RemoteException { return false; }
        public boolean isInUse() throws android.os.RemoteException { return false; }
        public boolean isInstalled() throws android.os.RemoteException { return false; }
        public boolean isEnabled() throws android.os.RemoteException { return false; }
        public boolean remove() throws android.os.RemoteException { return false; }
        public boolean setEnable(boolean p0) throws android.os.RemoteException { return false; }
        public boolean write(byte[] p0) throws android.os.RemoteException { return false; }
        public boolean commit() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
