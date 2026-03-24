package android.net;

public interface IConnectivityDiagnosticsCallback extends android.os.IInterface {
    public void onConnectivityReportAvailable(android.net.ConnectivityDiagnosticsManager.ConnectivityReport p0) throws android.os.RemoteException;
    public void onDataStallSuspected(android.net.ConnectivityDiagnosticsManager.DataStallReport p0) throws android.os.RemoteException;
    public void onNetworkConnectivityReported(android.net.Network p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.net.IConnectivityDiagnosticsCallback {
        public Default() {}
        public void onConnectivityReportAvailable(android.net.ConnectivityDiagnosticsManager.ConnectivityReport p0) throws android.os.RemoteException {}
        public void onDataStallSuspected(android.net.ConnectivityDiagnosticsManager.DataStallReport p0) throws android.os.RemoteException {}
        public void onNetworkConnectivityReported(android.net.Network p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.IConnectivityDiagnosticsCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.IConnectivityDiagnosticsCallback";
        static final int TRANSACTION_onConnectivityReportAvailable = 1;
        static final int TRANSACTION_onDataStallSuspected = 2;
        static final int TRANSACTION_onNetworkConnectivityReported = 3;
        public Stub() { super(); }
        public static android.net.IConnectivityDiagnosticsCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.IConnectivityDiagnosticsCallback p0) { return false; }
        public static android.net.IConnectivityDiagnosticsCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.IConnectivityDiagnosticsCallback {
            private android.os.IBinder mRemote;
            public static android.net.IConnectivityDiagnosticsCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnectivityReportAvailable(android.net.ConnectivityDiagnosticsManager.ConnectivityReport p0) throws android.os.RemoteException {}
            public void onDataStallSuspected(android.net.ConnectivityDiagnosticsManager.DataStallReport p0) throws android.os.RemoteException {}
            public void onNetworkConnectivityReported(android.net.Network p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
