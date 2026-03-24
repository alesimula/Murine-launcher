package android.hardware.contexthub;

public interface IContextHub extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "df80fdbb6f95a8a2988bc72b7f08f891847b80eb";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int EX_CONTEXT_HUB_UNSPECIFIED = -1;
    public java.util.List<android.hardware.contexthub.ContextHubInfo> getContextHubs() throws android.os.RemoteException;
    public void loadNanoapp(int p0, android.hardware.contexthub.NanoappBinary p1, int p2) throws android.os.RemoteException;
    public void unloadNanoapp(int p0, long p1, int p2) throws android.os.RemoteException;
    public void disableNanoapp(int p0, long p1, int p2) throws android.os.RemoteException;
    public void enableNanoapp(int p0, long p1, int p2) throws android.os.RemoteException;
    public void onSettingChanged(byte p0, boolean p1) throws android.os.RemoteException;
    public void queryNanoapps(int p0) throws android.os.RemoteException;
    public void registerCallback(int p0, android.hardware.contexthub.IContextHubCallback p1) throws android.os.RemoteException;
    public void sendMessageToHub(int p0, android.hardware.contexthub.ContextHubMessage p1) throws android.os.RemoteException;
    public void onHostEndpointConnected(android.hardware.contexthub.HostEndpointInfo p0) throws android.os.RemoteException;
    public void onHostEndpointDisconnected(char p0) throws android.os.RemoteException;
    public long[] getPreloadedNanoappIds(int p0) throws android.os.RemoteException;
    public void onNanSessionStateChanged(android.hardware.contexthub.NanSessionStateUpdate p0) throws android.os.RemoteException;
    public void setTestMode(boolean p0) throws android.os.RemoteException;
    public void sendMessageDeliveryStatusToHub(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.contexthub.HubInfo> getHubs() throws android.os.RemoteException;
    public java.util.List<android.hardware.contexthub.EndpointInfo> getEndpoints() throws android.os.RemoteException;
    public android.hardware.contexthub.IEndpointCommunication registerEndpointHub(android.hardware.contexthub.IEndpointCallback p0, android.hardware.contexthub.HubInfo p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IContextHub {
        public Default() {}
        public java.util.List<android.hardware.contexthub.ContextHubInfo> getContextHubs() throws android.os.RemoteException { return null; }
        public void loadNanoapp(int p0, android.hardware.contexthub.NanoappBinary p1, int p2) throws android.os.RemoteException {}
        public void unloadNanoapp(int p0, long p1, int p2) throws android.os.RemoteException {}
        public void disableNanoapp(int p0, long p1, int p2) throws android.os.RemoteException {}
        public void enableNanoapp(int p0, long p1, int p2) throws android.os.RemoteException {}
        public void onSettingChanged(byte p0, boolean p1) throws android.os.RemoteException {}
        public void queryNanoapps(int p0) throws android.os.RemoteException {}
        public void registerCallback(int p0, android.hardware.contexthub.IContextHubCallback p1) throws android.os.RemoteException {}
        public void sendMessageToHub(int p0, android.hardware.contexthub.ContextHubMessage p1) throws android.os.RemoteException {}
        public void onHostEndpointConnected(android.hardware.contexthub.HostEndpointInfo p0) throws android.os.RemoteException {}
        public void onHostEndpointDisconnected(char p0) throws android.os.RemoteException {}
        public long[] getPreloadedNanoappIds(int p0) throws android.os.RemoteException { return null; }
        public void onNanSessionStateChanged(android.hardware.contexthub.NanSessionStateUpdate p0) throws android.os.RemoteException {}
        public void setTestMode(boolean p0) throws android.os.RemoteException {}
        public void sendMessageDeliveryStatusToHub(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException {}
        public java.util.List<android.hardware.contexthub.HubInfo> getHubs() throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.contexthub.EndpointInfo> getEndpoints() throws android.os.RemoteException { return null; }
        public android.hardware.contexthub.IEndpointCommunication registerEndpointHub(android.hardware.contexthub.IEndpointCallback p0, android.hardware.contexthub.HubInfo p1) throws android.os.RemoteException { return null; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IContextHub {
        static final int TRANSACTION_getContextHubs = 1;
        static final int TRANSACTION_loadNanoapp = 2;
        static final int TRANSACTION_unloadNanoapp = 3;
        static final int TRANSACTION_disableNanoapp = 4;
        static final int TRANSACTION_enableNanoapp = 5;
        static final int TRANSACTION_onSettingChanged = 6;
        static final int TRANSACTION_queryNanoapps = 7;
        static final int TRANSACTION_registerCallback = 8;
        static final int TRANSACTION_sendMessageToHub = 9;
        static final int TRANSACTION_onHostEndpointConnected = 10;
        static final int TRANSACTION_onHostEndpointDisconnected = 11;
        static final int TRANSACTION_getPreloadedNanoappIds = 12;
        static final int TRANSACTION_onNanSessionStateChanged = 13;
        static final int TRANSACTION_setTestMode = 14;
        static final int TRANSACTION_sendMessageDeliveryStatusToHub = 15;
        static final int TRANSACTION_getHubs = 16;
        static final int TRANSACTION_getEndpoints = 17;
        static final int TRANSACTION_registerEndpointHub = 18;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.contexthub.IContextHub asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.contexthub.IContextHub {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.hardware.contexthub.ContextHubInfo> getContextHubs() throws android.os.RemoteException { return null; }
            public void loadNanoapp(int p0, android.hardware.contexthub.NanoappBinary p1, int p2) throws android.os.RemoteException {}
            public void unloadNanoapp(int p0, long p1, int p2) throws android.os.RemoteException {}
            public void disableNanoapp(int p0, long p1, int p2) throws android.os.RemoteException {}
            public void enableNanoapp(int p0, long p1, int p2) throws android.os.RemoteException {}
            public void onSettingChanged(byte p0, boolean p1) throws android.os.RemoteException {}
            public void queryNanoapps(int p0) throws android.os.RemoteException {}
            public void registerCallback(int p0, android.hardware.contexthub.IContextHubCallback p1) throws android.os.RemoteException {}
            public void sendMessageToHub(int p0, android.hardware.contexthub.ContextHubMessage p1) throws android.os.RemoteException {}
            public void onHostEndpointConnected(android.hardware.contexthub.HostEndpointInfo p0) throws android.os.RemoteException {}
            public void onHostEndpointDisconnected(char p0) throws android.os.RemoteException {}
            public long[] getPreloadedNanoappIds(int p0) throws android.os.RemoteException { return null; }
            public void onNanSessionStateChanged(android.hardware.contexthub.NanSessionStateUpdate p0) throws android.os.RemoteException {}
            public void setTestMode(boolean p0) throws android.os.RemoteException {}
            public void sendMessageDeliveryStatusToHub(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException {}
            public java.util.List<android.hardware.contexthub.HubInfo> getHubs() throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.contexthub.EndpointInfo> getEndpoints() throws android.os.RemoteException { return null; }
            public android.hardware.contexthub.IEndpointCommunication registerEndpointHub(android.hardware.contexthub.IEndpointCallback p0, android.hardware.contexthub.HubInfo p1) throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
