package android.se.omapi;

public interface ISecureElementService extends android.os.IInterface {
    public java.lang.String[] getReaders() throws android.os.RemoteException;
    public android.se.omapi.ISecureElementReader getReader(java.lang.String p0) throws android.os.RemoteException;
    public boolean[] isNFCEventAllowed(java.lang.String p0, byte[] p1, java.lang.String[] p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.se.omapi.ISecureElementService {
        private static final java.lang.String DESCRIPTOR = "android.se.omapi.ISecureElementService";
        static final int TRANSACTION_getReaders = 1;
        static final int TRANSACTION_getReader = 2;
        static final int TRANSACTION_isNFCEventAllowed = 3;
        public Stub() { super(); }
        public static android.se.omapi.ISecureElementService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.se.omapi.ISecureElementService p0) { return false; }
        public static android.se.omapi.ISecureElementService getDefaultImpl() { return null; }

        private static class Proxy implements android.se.omapi.ISecureElementService {
            private android.os.IBinder mRemote;
            public static android.se.omapi.ISecureElementService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String[] getReaders() throws android.os.RemoteException { return null; }
            public android.se.omapi.ISecureElementReader getReader(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean[] isNFCEventAllowed(java.lang.String p0, byte[] p1, java.lang.String[] p2) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.se.omapi.ISecureElementService {
        public Default() {}
        public java.lang.String[] getReaders() throws android.os.RemoteException { return null; }
        public android.se.omapi.ISecureElementReader getReader(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean[] isNFCEventAllowed(java.lang.String p0, byte[] p1, java.lang.String[] p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
