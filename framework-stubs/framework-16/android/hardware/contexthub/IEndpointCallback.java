package android.hardware.contexthub;

public interface IEndpointCallback extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "df80fdbb6f95a8a2988bc72b7f08f891847b80eb";
    public static final java.lang.String DESCRIPTOR = null;
    public void onEndpointStarted(android.hardware.contexthub.EndpointInfo[] p0) throws android.os.RemoteException;
    public void onEndpointStopped(android.hardware.contexthub.EndpointId[] p0, byte p1) throws android.os.RemoteException;
    public void onMessageReceived(int p0, android.hardware.contexthub.Message p1) throws android.os.RemoteException;
    public void onMessageDeliveryStatusReceived(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException;
    public void onEndpointSessionOpenRequest(int p0, android.hardware.contexthub.EndpointId p1, android.hardware.contexthub.EndpointId p2, java.lang.String p3) throws android.os.RemoteException;
    public void onCloseEndpointSession(int p0, byte p1) throws android.os.RemoteException;
    public void onEndpointSessionOpenComplete(int p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IEndpointCallback {
        public Default() {}
        public void onEndpointStarted(android.hardware.contexthub.EndpointInfo[] p0) throws android.os.RemoteException {}
        public void onEndpointStopped(android.hardware.contexthub.EndpointId[] p0, byte p1) throws android.os.RemoteException {}
        public void onMessageReceived(int p0, android.hardware.contexthub.Message p1) throws android.os.RemoteException {}
        public void onMessageDeliveryStatusReceived(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException {}
        public void onEndpointSessionOpenRequest(int p0, android.hardware.contexthub.EndpointId p1, android.hardware.contexthub.EndpointId p2, java.lang.String p3) throws android.os.RemoteException {}
        public void onCloseEndpointSession(int p0, byte p1) throws android.os.RemoteException {}
        public void onEndpointSessionOpenComplete(int p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IEndpointCallback {
        static final int TRANSACTION_onEndpointStarted = 1;
        static final int TRANSACTION_onEndpointStopped = 2;
        static final int TRANSACTION_onMessageReceived = 3;
        static final int TRANSACTION_onMessageDeliveryStatusReceived = 4;
        static final int TRANSACTION_onEndpointSessionOpenRequest = 5;
        static final int TRANSACTION_onCloseEndpointSession = 6;
        static final int TRANSACTION_onEndpointSessionOpenComplete = 7;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.contexthub.IEndpointCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.contexthub.IEndpointCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEndpointStarted(android.hardware.contexthub.EndpointInfo[] p0) throws android.os.RemoteException {}
            public void onEndpointStopped(android.hardware.contexthub.EndpointId[] p0, byte p1) throws android.os.RemoteException {}
            public void onMessageReceived(int p0, android.hardware.contexthub.Message p1) throws android.os.RemoteException {}
            public void onMessageDeliveryStatusReceived(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException {}
            public void onEndpointSessionOpenRequest(int p0, android.hardware.contexthub.EndpointId p1, android.hardware.contexthub.EndpointId p2, java.lang.String p3) throws android.os.RemoteException {}
            public void onCloseEndpointSession(int p0, byte p1) throws android.os.RemoteException {}
            public void onEndpointSessionOpenComplete(int p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
