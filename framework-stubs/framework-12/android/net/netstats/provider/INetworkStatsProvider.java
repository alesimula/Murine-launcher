package android.net.netstats.provider;

public interface INetworkStatsProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.netstats.provider.INetworkStatsProvider";
    public void onRequestStatsUpdate(int p0) throws android.os.RemoteException;
    public void onSetAlert(long p0) throws android.os.RemoteException;
    public void onSetWarningAndLimit(java.lang.String p0, long p1, long p2) throws android.os.RemoteException;

    public static class Default implements android.net.netstats.provider.INetworkStatsProvider {
        public Default() {}
        public void onRequestStatsUpdate(int p0) throws android.os.RemoteException {}
        public void onSetAlert(long p0) throws android.os.RemoteException {}
        public void onSetWarningAndLimit(java.lang.String p0, long p1, long p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.netstats.provider.INetworkStatsProvider {
        static final int TRANSACTION_onRequestStatsUpdate = 1;
        static final int TRANSACTION_onSetAlert = 2;
        static final int TRANSACTION_onSetWarningAndLimit = 3;
        public Stub() { super(); }
        public static android.net.netstats.provider.INetworkStatsProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.netstats.provider.INetworkStatsProvider p0) { return false; }
        public static android.net.netstats.provider.INetworkStatsProvider getDefaultImpl() { return null; }

        private static class Proxy implements android.net.netstats.provider.INetworkStatsProvider {
            private android.os.IBinder mRemote;
            public static android.net.netstats.provider.INetworkStatsProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRequestStatsUpdate(int p0) throws android.os.RemoteException {}
            public void onSetAlert(long p0) throws android.os.RemoteException {}
            public void onSetWarningAndLimit(java.lang.String p0, long p1, long p2) throws android.os.RemoteException {}
        }
    }
}
