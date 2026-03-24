package android.net;

public interface IIpConnectivityMetrics extends android.os.IInterface {
    public int logEvent(android.net.ConnectivityMetricsEvent p0) throws android.os.RemoteException;
    public void logDefaultNetworkValidity(boolean p0) throws android.os.RemoteException;
    public void logDefaultNetworkEvent(android.net.Network p0, int p1, boolean p2, android.net.LinkProperties p3, android.net.NetworkCapabilities p4, android.net.Network p5, int p6, android.net.LinkProperties p7, android.net.NetworkCapabilities p8) throws android.os.RemoteException;
    public boolean addNetdEventCallback(int p0, android.net.INetdEventCallback p1) throws android.os.RemoteException;
    public boolean removeNetdEventCallback(int p0) throws android.os.RemoteException;

    public static class Default implements android.net.IIpConnectivityMetrics {
        public Default() {}
        public int logEvent(android.net.ConnectivityMetricsEvent p0) throws android.os.RemoteException { return 0; }
        public void logDefaultNetworkValidity(boolean p0) throws android.os.RemoteException {}
        public void logDefaultNetworkEvent(android.net.Network p0, int p1, boolean p2, android.net.LinkProperties p3, android.net.NetworkCapabilities p4, android.net.Network p5, int p6, android.net.LinkProperties p7, android.net.NetworkCapabilities p8) throws android.os.RemoteException {}
        public boolean addNetdEventCallback(int p0, android.net.INetdEventCallback p1) throws android.os.RemoteException { return false; }
        public boolean removeNetdEventCallback(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.IIpConnectivityMetrics {
        public static final java.lang.String DESCRIPTOR = "android.net.IIpConnectivityMetrics";
        static final int TRANSACTION_logEvent = 1;
        static final int TRANSACTION_logDefaultNetworkValidity = 2;
        static final int TRANSACTION_logDefaultNetworkEvent = 3;
        static final int TRANSACTION_addNetdEventCallback = 4;
        static final int TRANSACTION_removeNetdEventCallback = 5;
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
            public void logDefaultNetworkValidity(boolean p0) throws android.os.RemoteException {}
            public void logDefaultNetworkEvent(android.net.Network p0, int p1, boolean p2, android.net.LinkProperties p3, android.net.NetworkCapabilities p4, android.net.Network p5, int p6, android.net.LinkProperties p7, android.net.NetworkCapabilities p8) throws android.os.RemoteException {}
            public boolean addNetdEventCallback(int p0, android.net.INetdEventCallback p1) throws android.os.RemoteException { return false; }
            public boolean removeNetdEventCallback(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
