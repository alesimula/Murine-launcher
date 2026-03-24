package android.net.netstats.provider;

public interface INetworkStatsProviderCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.netstats.provider.INetworkStatsProviderCallback";
    public void notifyStatsUpdated(int p0, android.net.NetworkStats p1, android.net.NetworkStats p2) throws android.os.RemoteException;
    public void notifyAlertReached() throws android.os.RemoteException;
    public void notifyWarningOrLimitReached() throws android.os.RemoteException;
    public void unregister() throws android.os.RemoteException;

    public static class Default implements android.net.netstats.provider.INetworkStatsProviderCallback {
        public Default() {}
        public void notifyStatsUpdated(int p0, android.net.NetworkStats p1, android.net.NetworkStats p2) throws android.os.RemoteException {}
        public void notifyAlertReached() throws android.os.RemoteException {}
        public void notifyWarningOrLimitReached() throws android.os.RemoteException {}
        public void unregister() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.netstats.provider.INetworkStatsProviderCallback {
        static final int TRANSACTION_notifyStatsUpdated = 1;
        static final int TRANSACTION_notifyAlertReached = 2;
        static final int TRANSACTION_notifyWarningOrLimitReached = 3;
        static final int TRANSACTION_unregister = 4;
        public Stub() { super(); }
        public static android.net.netstats.provider.INetworkStatsProviderCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.netstats.provider.INetworkStatsProviderCallback p0) { return false; }
        public static android.net.netstats.provider.INetworkStatsProviderCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.netstats.provider.INetworkStatsProviderCallback {
            private android.os.IBinder mRemote;
            public static android.net.netstats.provider.INetworkStatsProviderCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyStatsUpdated(int p0, android.net.NetworkStats p1, android.net.NetworkStats p2) throws android.os.RemoteException {}
            public void notifyAlertReached() throws android.os.RemoteException {}
            public void notifyWarningOrLimitReached() throws android.os.RemoteException {}
            public void unregister() throws android.os.RemoteException {}
        }
    }
}
