package android.net.wifi.aware;

public interface IWifiAwareDiscoverySessionCallback extends android.os.IInterface {
    public void onSessionStarted(int p0) throws android.os.RemoteException;
    public void onSessionConfigSuccess() throws android.os.RemoteException;
    public void onSessionConfigFail(int p0) throws android.os.RemoteException;
    public void onSessionTerminated(int p0) throws android.os.RemoteException;
    public void onMatch(int p0, byte[] p1, byte[] p2) throws android.os.RemoteException;
    public void onMatchWithDistance(int p0, byte[] p1, byte[] p2, int p3) throws android.os.RemoteException;
    public void onMessageSendSuccess(int p0) throws android.os.RemoteException;
    public void onMessageSendFail(int p0, int p1) throws android.os.RemoteException;
    public void onMessageReceived(int p0, byte[] p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.aware.IWifiAwareDiscoverySessionCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.aware.IWifiAwareDiscoverySessionCallback";
        static final int TRANSACTION_onSessionStarted = 1;
        static final int TRANSACTION_onSessionConfigSuccess = 2;
        static final int TRANSACTION_onSessionConfigFail = 3;
        static final int TRANSACTION_onSessionTerminated = 4;
        static final int TRANSACTION_onMatch = 5;
        static final int TRANSACTION_onMatchWithDistance = 6;
        static final int TRANSACTION_onMessageSendSuccess = 7;
        static final int TRANSACTION_onMessageSendFail = 8;
        static final int TRANSACTION_onMessageReceived = 9;
        public Stub() { super(); }
        public static android.net.wifi.aware.IWifiAwareDiscoverySessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.aware.IWifiAwareDiscoverySessionCallback p0) { return false; }
        public static android.net.wifi.aware.IWifiAwareDiscoverySessionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.aware.IWifiAwareDiscoverySessionCallback {
            private android.os.IBinder mRemote;
            public static android.net.wifi.aware.IWifiAwareDiscoverySessionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionStarted(int p0) throws android.os.RemoteException {}
            public void onSessionConfigSuccess() throws android.os.RemoteException {}
            public void onSessionConfigFail(int p0) throws android.os.RemoteException {}
            public void onSessionTerminated(int p0) throws android.os.RemoteException {}
            public void onMatch(int p0, byte[] p1, byte[] p2) throws android.os.RemoteException {}
            public void onMatchWithDistance(int p0, byte[] p1, byte[] p2, int p3) throws android.os.RemoteException {}
            public void onMessageSendSuccess(int p0) throws android.os.RemoteException {}
            public void onMessageSendFail(int p0, int p1) throws android.os.RemoteException {}
            public void onMessageReceived(int p0, byte[] p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.aware.IWifiAwareDiscoverySessionCallback {
        public Default() {}
        public void onSessionStarted(int p0) throws android.os.RemoteException {}
        public void onSessionConfigSuccess() throws android.os.RemoteException {}
        public void onSessionConfigFail(int p0) throws android.os.RemoteException {}
        public void onSessionTerminated(int p0) throws android.os.RemoteException {}
        public void onMatch(int p0, byte[] p1, byte[] p2) throws android.os.RemoteException {}
        public void onMatchWithDistance(int p0, byte[] p1, byte[] p2, int p3) throws android.os.RemoteException {}
        public void onMessageSendSuccess(int p0) throws android.os.RemoteException {}
        public void onMessageSendFail(int p0, int p1) throws android.os.RemoteException {}
        public void onMessageReceived(int p0, byte[] p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
