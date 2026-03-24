package android.hardware.contexthub;

public interface IContextHubEndpointCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.contexthub.IContextHubEndpointCallback";
    public void onSessionOpenRequest(int p0, android.hardware.contexthub.HubEndpointInfo p1, java.lang.String p2) throws android.os.RemoteException;
    public void onSessionClosed(int p0, int p1) throws android.os.RemoteException;
    public void onSessionOpenComplete(int p0) throws android.os.RemoteException;
    public void onMessageReceived(int p0, android.hardware.contexthub.HubMessage p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IContextHubEndpointCallback {
        public Default() {}
        public void onSessionOpenRequest(int p0, android.hardware.contexthub.HubEndpointInfo p1, java.lang.String p2) throws android.os.RemoteException {}
        public void onSessionClosed(int p0, int p1) throws android.os.RemoteException {}
        public void onSessionOpenComplete(int p0) throws android.os.RemoteException {}
        public void onMessageReceived(int p0, android.hardware.contexthub.HubMessage p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IContextHubEndpointCallback {
        static final int TRANSACTION_onSessionOpenRequest = 1;
        static final int TRANSACTION_onSessionClosed = 2;
        static final int TRANSACTION_onSessionOpenComplete = 3;
        static final int TRANSACTION_onMessageReceived = 4;
        public Stub() { super(); }
        public static android.hardware.contexthub.IContextHubEndpointCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.contexthub.IContextHubEndpointCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionOpenRequest(int p0, android.hardware.contexthub.HubEndpointInfo p1, java.lang.String p2) throws android.os.RemoteException {}
            public void onSessionClosed(int p0, int p1) throws android.os.RemoteException {}
            public void onSessionOpenComplete(int p0) throws android.os.RemoteException {}
            public void onMessageReceived(int p0, android.hardware.contexthub.HubMessage p1) throws android.os.RemoteException {}
        }
    }
}
