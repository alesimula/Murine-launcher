package android.adbroot;

public interface IADBRootService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.adbroot.IADBRootService";
    public boolean isSupported() throws android.os.RemoteException;
    public void setEnabled(boolean p0) throws android.os.RemoteException;
    public boolean getEnabled() throws android.os.RemoteException;

    public static class Default implements android.adbroot.IADBRootService {
        public Default() {}
        public boolean isSupported() throws android.os.RemoteException { return false; }
        public void setEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean getEnabled() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.adbroot.IADBRootService {
        static final int TRANSACTION_isSupported = 1;
        static final int TRANSACTION_setEnabled = 2;
        static final int TRANSACTION_getEnabled = 3;
        public Stub() { super(); }
        public static android.adbroot.IADBRootService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.adbroot.IADBRootService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isSupported() throws android.os.RemoteException { return false; }
            public void setEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean getEnabled() throws android.os.RemoteException { return false; }
        }
    }
}
