package android.system.keystore2;

public interface IKeystoreService extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "19e8b65277839bad0ab335c781e3c652324920ce";
    public static final java.lang.String DESCRIPTOR = null;
    public android.system.keystore2.IKeystoreSecurityLevel getSecurityLevel(int p0) throws android.os.RemoteException;
    public android.system.keystore2.KeyEntryResponse getKeyEntry(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException;
    public void updateSubcomponent(android.system.keystore2.KeyDescriptor p0, byte[] p1, byte[] p2) throws android.os.RemoteException;
    public android.system.keystore2.KeyDescriptor[] listEntries(int p0, long p1) throws android.os.RemoteException;
    public void deleteKey(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException;
    public android.system.keystore2.KeyDescriptor grant(android.system.keystore2.KeyDescriptor p0, int p1, int p2) throws android.os.RemoteException;
    public void ungrant(android.system.keystore2.KeyDescriptor p0, int p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.system.keystore2.IKeystoreService {
        public Default() {}
        public android.system.keystore2.IKeystoreSecurityLevel getSecurityLevel(int p0) throws android.os.RemoteException { return null; }
        public android.system.keystore2.KeyEntryResponse getKeyEntry(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException { return null; }
        public void updateSubcomponent(android.system.keystore2.KeyDescriptor p0, byte[] p1, byte[] p2) throws android.os.RemoteException {}
        public android.system.keystore2.KeyDescriptor[] listEntries(int p0, long p1) throws android.os.RemoteException { return null; }
        public void deleteKey(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException {}
        public android.system.keystore2.KeyDescriptor grant(android.system.keystore2.KeyDescriptor p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void ungrant(android.system.keystore2.KeyDescriptor p0, int p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.system.keystore2.IKeystoreService {
        static final int TRANSACTION_getSecurityLevel = 1;
        static final int TRANSACTION_getKeyEntry = 2;
        static final int TRANSACTION_updateSubcomponent = 3;
        static final int TRANSACTION_listEntries = 4;
        static final int TRANSACTION_deleteKey = 5;
        static final int TRANSACTION_grant = 6;
        static final int TRANSACTION_ungrant = 7;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.system.keystore2.IKeystoreService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.system.keystore2.IKeystoreService p0) { return false; }
        public static android.system.keystore2.IKeystoreService getDefaultImpl() { return null; }

        private static class Proxy implements android.system.keystore2.IKeystoreService {
            private android.os.IBinder mRemote;
            private int mCachedVersion;
            private java.lang.String mCachedHash;
            public static android.system.keystore2.IKeystoreService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.system.keystore2.IKeystoreSecurityLevel getSecurityLevel(int p0) throws android.os.RemoteException { return null; }
            public android.system.keystore2.KeyEntryResponse getKeyEntry(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException { return null; }
            public void updateSubcomponent(android.system.keystore2.KeyDescriptor p0, byte[] p1, byte[] p2) throws android.os.RemoteException {}
            public android.system.keystore2.KeyDescriptor[] listEntries(int p0, long p1) throws android.os.RemoteException { return null; }
            public void deleteKey(android.system.keystore2.KeyDescriptor p0) throws android.os.RemoteException {}
            public android.system.keystore2.KeyDescriptor grant(android.system.keystore2.KeyDescriptor p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void ungrant(android.system.keystore2.KeyDescriptor p0, int p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
