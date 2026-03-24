package android.hardware.contexthub;

public interface IContextHubEndpointDiscoveryCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.contexthub.IContextHubEndpointDiscoveryCallback";
    public void onEndpointsStarted(android.hardware.contexthub.HubEndpointInfo[] p0) throws android.os.RemoteException;
    public void onEndpointsStopped(android.hardware.contexthub.HubEndpointInfo[] p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IContextHubEndpointDiscoveryCallback {
        public Default() {}
        public void onEndpointsStarted(android.hardware.contexthub.HubEndpointInfo[] p0) throws android.os.RemoteException {}
        public void onEndpointsStopped(android.hardware.contexthub.HubEndpointInfo[] p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IContextHubEndpointDiscoveryCallback {
        static final int TRANSACTION_onEndpointsStarted = 1;
        static final int TRANSACTION_onEndpointsStopped = 2;
        public Stub() { super(); }
        public static android.hardware.contexthub.IContextHubEndpointDiscoveryCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.contexthub.IContextHubEndpointDiscoveryCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEndpointsStarted(android.hardware.contexthub.HubEndpointInfo[] p0) throws android.os.RemoteException {}
            public void onEndpointsStopped(android.hardware.contexthub.HubEndpointInfo[] p0, int p1) throws android.os.RemoteException {}
        }
    }
}
