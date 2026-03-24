package android.net;

public interface IIpConnectivityMetrics extends android.os.IInterface {
    public int logEvent(android.net.ConnectivityMetricsEvent p0) throws android.os.RemoteException;
    public boolean addNetdEventCallback(int p0, android.net.INetdEventCallback p1) throws android.os.RemoteException;
    public boolean removeNetdEventCallback(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.IIpConnectivityMetrics {
        private static final java.lang.String DESCRIPTOR = "android.net.IIpConnectivityMetrics";
        static final int TRANSACTION_logEvent = 1;
        static final int TRANSACTION_addNetdEventCallback = 2;
        static final int TRANSACTION_removeNetdEventCallback = 3;
        public Stub() { super(); }
        public static android.net.IIpConnectivityMetrics asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.IIpConnectivityMetrics p0) { return false; }
        public static android.net.IIpConnectivityMetrics getDefaultImpl() { return null; }

        private static class Proxy implements android.net.IIpConnectivityMetrics {
            private android.os.IBinder mRemote;
            public static android.net.IIpConnectivityMetrics sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int logEvent(android.net.ConnectivityMetricsEvent p0) throws android.os.RemoteException { return 0; }
            public boolean addNetdEventCallback(int p0, android.net.INetdEventCallback p1) throws android.os.RemoteException { return false; }
            public boolean removeNetdEventCallback(int p0) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.net.IIpConnectivityMetrics {
        public Default() {}
        public int logEvent(android.net.ConnectivityMetricsEvent p0) throws android.os.RemoteException { return 0; }
        public boolean addNetdEventCallback(int p0, android.net.INetdEventCallback p1) throws android.os.RemoteException { return false; }
        public boolean removeNetdEventCallback(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
