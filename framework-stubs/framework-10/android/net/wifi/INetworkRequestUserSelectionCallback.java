package android.net.wifi;

public interface INetworkRequestUserSelectionCallback extends android.os.IInterface {
    public void select(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException;
    public void reject() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.INetworkRequestUserSelectionCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.INetworkRequestUserSelectionCallback";
        static final int TRANSACTION_select = 1;
        static final int TRANSACTION_reject = 2;
        public Stub() { super(); }
        public static android.net.wifi.INetworkRequestUserSelectionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.INetworkRequestUserSelectionCallback p0) { return false; }
        public static android.net.wifi.INetworkRequestUserSelectionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.INetworkRequestUserSelectionCallback {
            private android.os.IBinder mRemote;
            public static android.net.wifi.INetworkRequestUserSelectionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void select(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException {}
            public void reject() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.INetworkRequestUserSelectionCallback {
        public Default() {}
        public void select(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException {}
        public void reject() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
