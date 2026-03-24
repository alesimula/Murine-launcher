package android.se.omapi;

public interface ISecureElementReader extends android.os.IInterface {
    public boolean isSecureElementPresent() throws android.os.RemoteException;
    public android.se.omapi.ISecureElementSession openSession() throws android.os.RemoteException;
    public void closeSessions() throws android.os.RemoteException;
    public boolean reset() throws android.os.RemoteException;

    public static class Default implements android.se.omapi.ISecureElementReader {
        public Default() {}
        public boolean isSecureElementPresent() throws android.os.RemoteException { return false; }
        public android.se.omapi.ISecureElementSession openSession() throws android.os.RemoteException { return null; }
        public void closeSessions() throws android.os.RemoteException {}
        public boolean reset() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.se.omapi.ISecureElementReader {
        public static final java.lang.String DESCRIPTOR = "android.se.omapi.ISecureElementReader";
        static final int TRANSACTION_isSecureElementPresent = 1;
        static final int TRANSACTION_openSession = 2;
        static final int TRANSACTION_closeSessions = 3;
        static final int TRANSACTION_reset = 4;
        public Stub() { super(); }
        public static android.se.omapi.ISecureElementReader asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.se.omapi.ISecureElementReader p0) { return false; }
        public static android.se.omapi.ISecureElementReader getDefaultImpl() { return null; }

        private static class Proxy implements android.se.omapi.ISecureElementReader {
            private android.os.IBinder mRemote;
            public static android.se.omapi.ISecureElementReader sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isSecureElementPresent() throws android.os.RemoteException { return false; }
            public android.se.omapi.ISecureElementSession openSession() throws android.os.RemoteException { return null; }
            public void closeSessions() throws android.os.RemoteException {}
            public boolean reset() throws android.os.RemoteException { return false; }
        }
    }
}
