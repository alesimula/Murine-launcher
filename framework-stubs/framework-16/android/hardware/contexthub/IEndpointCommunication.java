package android.hardware.contexthub;

public interface IEndpointCommunication extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "df80fdbb6f95a8a2988bc72b7f08f891847b80eb";
    public static final java.lang.String DESCRIPTOR = null;
    public void registerEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException;
    public void unregisterEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException;
    public int[] requestSessionIdRange(int p0) throws android.os.RemoteException;
    public void openEndpointSession(int p0, android.hardware.contexthub.EndpointId p1, android.hardware.contexthub.EndpointId p2, java.lang.String p3) throws android.os.RemoteException;
    public void sendMessageToEndpoint(int p0, android.hardware.contexthub.Message p1) throws android.os.RemoteException;
    public void sendMessageDeliveryStatusToEndpoint(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException;
    public void closeEndpointSession(int p0, byte p1) throws android.os.RemoteException;
    public void endpointSessionOpenComplete(int p0) throws android.os.RemoteException;
    public void unregister() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IEndpointCommunication {
        public Default() {}
        public void registerEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException {}
        public void unregisterEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException {}
        public int[] requestSessionIdRange(int p0) throws android.os.RemoteException { return null; }
        public void openEndpointSession(int p0, android.hardware.contexthub.EndpointId p1, android.hardware.contexthub.EndpointId p2, java.lang.String p3) throws android.os.RemoteException {}
        public void sendMessageToEndpoint(int p0, android.hardware.contexthub.Message p1) throws android.os.RemoteException {}
        public void sendMessageDeliveryStatusToEndpoint(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException {}
        public void closeEndpointSession(int p0, byte p1) throws android.os.RemoteException {}
        public void endpointSessionOpenComplete(int p0) throws android.os.RemoteException {}
        public void unregister() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IEndpointCommunication {
        static final int TRANSACTION_registerEndpoint = 1;
        static final int TRANSACTION_unregisterEndpoint = 2;
        static final int TRANSACTION_requestSessionIdRange = 3;
        static final int TRANSACTION_openEndpointSession = 4;
        static final int TRANSACTION_sendMessageToEndpoint = 5;
        static final int TRANSACTION_sendMessageDeliveryStatusToEndpoint = 6;
        static final int TRANSACTION_closeEndpointSession = 7;
        static final int TRANSACTION_endpointSessionOpenComplete = 8;
        static final int TRANSACTION_unregister = 9;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.contexthub.IEndpointCommunication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.contexthub.IEndpointCommunication {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException {}
            public void unregisterEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException {}
            public int[] requestSessionIdRange(int p0) throws android.os.RemoteException { return null; }
            public void openEndpointSession(int p0, android.hardware.contexthub.EndpointId p1, android.hardware.contexthub.EndpointId p2, java.lang.String p3) throws android.os.RemoteException {}
            public void sendMessageToEndpoint(int p0, android.hardware.contexthub.Message p1) throws android.os.RemoteException {}
            public void sendMessageDeliveryStatusToEndpoint(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException {}
            public void closeEndpointSession(int p0, byte p1) throws android.os.RemoteException {}
            public void endpointSessionOpenComplete(int p0) throws android.os.RemoteException {}
            public void unregister() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
