package android.net.wifi.p2p;

public interface IWifiP2pManager extends android.os.IInterface {
    public android.os.Messenger getMessenger(android.os.IBinder p0) throws android.os.RemoteException;
    public android.os.Messenger getP2pStateMachineMessenger() throws android.os.RemoteException;
    public void close(android.os.IBinder p0) throws android.os.RemoteException;
    public void setMiracastMode(int p0) throws android.os.RemoteException;
    public void checkConfigureWifiDisplayPermission() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.p2p.IWifiP2pManager {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.p2p.IWifiP2pManager";
        static final int TRANSACTION_getMessenger = 1;
        static final int TRANSACTION_getP2pStateMachineMessenger = 2;
        static final int TRANSACTION_close = 3;
        static final int TRANSACTION_setMiracastMode = 4;
        static final int TRANSACTION_checkConfigureWifiDisplayPermission = 5;
        public Stub() { super(); }
        public static android.net.wifi.p2p.IWifiP2pManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.p2p.IWifiP2pManager p0) { return false; }
        public static android.net.wifi.p2p.IWifiP2pManager getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.p2p.IWifiP2pManager {
            private android.os.IBinder mRemote;
            public static android.net.wifi.p2p.IWifiP2pManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.Messenger getMessenger(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public android.os.Messenger getP2pStateMachineMessenger() throws android.os.RemoteException { return null; }
            public void close(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setMiracastMode(int p0) throws android.os.RemoteException {}
            public void checkConfigureWifiDisplayPermission() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.p2p.IWifiP2pManager {
        public Default() {}
        public android.os.Messenger getMessenger(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public android.os.Messenger getP2pStateMachineMessenger() throws android.os.RemoteException { return null; }
        public void close(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setMiracastMode(int p0) throws android.os.RemoteException {}
        public void checkConfigureWifiDisplayPermission() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
