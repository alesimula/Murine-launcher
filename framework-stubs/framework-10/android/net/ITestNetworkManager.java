package android.net;

public interface ITestNetworkManager extends android.os.IInterface {
    public android.net.TestNetworkInterface createTunInterface(android.net.LinkAddress[] p0) throws android.os.RemoteException;
    public android.net.TestNetworkInterface createTapInterface() throws android.os.RemoteException;
    public void setupTestNetwork(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void teardownTestNetwork(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.ITestNetworkManager {
        private static final java.lang.String DESCRIPTOR = "android.net.ITestNetworkManager";
        static final int TRANSACTION_createTunInterface = 1;
        static final int TRANSACTION_createTapInterface = 2;
        static final int TRANSACTION_setupTestNetwork = 3;
        static final int TRANSACTION_teardownTestNetwork = 4;
        public Stub() { super(); }
        public static android.net.ITestNetworkManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.ITestNetworkManager p0) { return false; }
        public static android.net.ITestNetworkManager getDefaultImpl() { return null; }

        private static class Proxy implements android.net.ITestNetworkManager {
            private android.os.IBinder mRemote;
            public static android.net.ITestNetworkManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.net.TestNetworkInterface createTunInterface(android.net.LinkAddress[] p0) throws android.os.RemoteException { return null; }
            public android.net.TestNetworkInterface createTapInterface() throws android.os.RemoteException { return null; }
            public void setupTestNetwork(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void teardownTestNetwork(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.ITestNetworkManager {
        public Default() {}
        public android.net.TestNetworkInterface createTunInterface(android.net.LinkAddress[] p0) throws android.os.RemoteException { return null; }
        public android.net.TestNetworkInterface createTapInterface() throws android.os.RemoteException { return null; }
        public void setupTestNetwork(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void teardownTestNetwork(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
