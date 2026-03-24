package android.security.legacykeystore;

public interface ILegacyKeystore extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final int UID_SELF = -1;
    public static final int ERROR_SYSTEM_ERROR = 4;
    public static final int ERROR_PERMISSION_DENIED = 6;
    public static final int ERROR_ENTRY_NOT_FOUND = 7;
    public byte[] get(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void put(java.lang.String p0, int p1, byte[] p2) throws android.os.RemoteException;
    public void remove(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String[] list(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.security.legacykeystore.ILegacyKeystore {
        public Default() {}
        public byte[] get(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void put(java.lang.String p0, int p1, byte[] p2) throws android.os.RemoteException {}
        public void remove(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public java.lang.String[] list(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.legacykeystore.ILegacyKeystore {
        static final int TRANSACTION_get = 1;
        static final int TRANSACTION_put = 2;
        static final int TRANSACTION_remove = 3;
        static final int TRANSACTION_list = 4;
        public Stub() { super(); }
        public static android.security.legacykeystore.ILegacyKeystore asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.legacykeystore.ILegacyKeystore p0) { return false; }
        public static android.security.legacykeystore.ILegacyKeystore getDefaultImpl() { return null; }

        private static class Proxy implements android.security.legacykeystore.ILegacyKeystore {
            private android.os.IBinder mRemote;
            public static android.security.legacykeystore.ILegacyKeystore sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public byte[] get(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void put(java.lang.String p0, int p1, byte[] p2) throws android.os.RemoteException {}
            public void remove(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public java.lang.String[] list(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        }
    }
}
